/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nabook.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetLinkConstants;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.QueryConfig;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nabook.exception.AuthorNameException;
import com.nabook.exception.NoSuchAuthorException;
import com.nabook.exception.NoSuchBookException;
import com.nabook.model.Author;
import com.nabook.model.Book;
import com.nabook.service.BookLocalServiceUtil;
import com.nabook.service.base.AuthorLocalServiceBaseImpl;

/**
 * The implementation of the author local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.nabook.service.AuthorLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author phantoan
 * @see AuthorLocalServiceBaseImpl
 * @see com.nabook.service.AuthorLocalServiceUtil
 */
@ProviderType
public class AuthorLocalServiceImpl extends AuthorLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.nabook.service.AuthorLocalServiceUtil} to access the author local
	 * service.
	 */

	public Author addAuthor(ServiceContext serviceContext, long userId, String fullName, String profile)
			throws SystemException, PortalException {
		logger.info("Start create author: " + fullName);
		validate(fullName);

		User user = userPersistence.findByPrimaryKey(userId);

		long authorId = counterLocalService.increment();
		Author author = authorPersistence.create(authorId);
		Date now = new Date();

		author.setUuid(serviceContext.getUuid());
		author.setGroupId(serviceContext.getScopeGroupId());
		author.setCompanyId(user.getCompanyId());
		author.setUserId(userId);
		author.setUserName(user.getFullName());
		author.setCreateDate(serviceContext.getCreateDate(now));
		author.setModifiedDate(serviceContext.getModifiedDate(now));

		author.setFullName(fullName);
		author.setProfile(profile);

		author.setExpandoBridgeAttributes(serviceContext);

		authorPersistence.update(author);

		resourceLocalService.addModelResources(author, serviceContext);

		AssetEntry assetEntry = assetEntryLocalService.updateEntry(userId, author.getGroupId(), author.getCreateDate(),
				author.getModifiedDate(), Author.class.getName(), authorId, author.getUuid(), 0,
				serviceContext.getAssetCategoryIds(), serviceContext.getAssetTagNames(), true, false, null, null, null,
				null, ContentTypes.TEXT_HTML, author.getFullName(), null, null, null, null, 0, 0, null);
		assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(), serviceContext.getAssetLinkEntryIds(),
				AssetLinkConstants.TYPE_RELATED);

		Indexer<Author> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Author.class);
		indexer.reindex(author);

		logger.info("CREATE author " + fullName + " successful");
		return author;
	}

	public int countAllAuthor() throws SystemException, NoSuchAuthorException {
		return authorPersistence.countAll();
	}

	public Author deleteAuthor(long authorId) throws SystemException, PortalException {
		Author author = getAuthor(authorId);

		resourceLocalService.deleteResource(author, ResourceConstants.SCOPE_INDIVIDUAL);

		AssetEntry assetEntry = assetEntryLocalService.fetchEntry(getModelClassName(), authorId);
		if (assetEntry != null) {
			assetLinkLocalService.deleteLinks(assetEntry.getEntryId());
			assetEntryLocalService.deleteEntry(assetEntry);
		}

		Indexer<Author> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Author.class);
		indexer.delete(author);

		author = deleteAuthor(author);

		logger.info("DELETE author " + author.getFullName() + " successful");
		return author;
	}

	public List<Author> getAllAuthors() throws SystemException, NoSuchAuthorException {
		return authorPersistence.findAll();
	}

	public List<Author> getAllAuthors(int start, int end) throws SystemException, NoSuchAuthorException {
		return authorPersistence.findAll(start, end);
	}

	public List<Book> getBooksByAuthor(long authorId)
			throws SystemException, NoSuchAuthorException, NoSuchBookException {
		return BookLocalServiceUtil.getAuthorBooks(authorId);
	}

	public List<Author> search(long companyId, String keywords) throws SearchException {
		SearchContext searchContext = new SearchContext();

		Map<String, Serializable> attributes = new HashMap<String, Serializable>();
		attributes.put("fullname", keywords);

		searchContext.setKeywords(keywords);
		searchContext.setAttributes(attributes);
		searchContext.setCompanyId(companyId);

		QueryConfig queryConfig = new QueryConfig();
		queryConfig.setHighlightEnabled(false);
		queryConfig.setScoreEnabled(false);

		searchContext.setAndSearch(false);
		searchContext.setQueryConfig(queryConfig);

		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(Author.class);
		Hits hits = indexer.search(searchContext);

		List<Author> authors = new ArrayList<Author>();
		for (int i = 0; i < hits.getDocs().length; i++) {
			Document doc = hits.doc(i);
			long authorId = GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK));
			Author result = null;
			try {
				result = getAuthor(authorId);
			} catch (Exception e) {
				System.out.println("Cant get store with id " + authorId);
			}
			authors.add(result);
		}
		System.out.println("Result with keyword " + keywords + ":" + authors.size());
		return authors;
	}

	public Author updateAuthor(ServiceContext serviceContext, long userId, long authorId, String fullName,
			String profile) throws SystemException, PortalException {
		validate(fullName);

		Author author = getAuthor(authorId);
		Date now = new Date();

		author.setModifiedDate(serviceContext.getModifiedDate(now));
		author.setFullName(fullName);
		author.setProfile(profile);
		
		authorPersistence.update(author);
		
		author.setExpandoBridgeAttributes(serviceContext);

		AssetEntry assetEntry = assetEntryLocalService.updateEntry(userId, author.getGroupId(), author.getCreateDate(),
				author.getModifiedDate(), Author.class.getName(), authorId, author.getUuid(), 0,
				serviceContext.getAssetCategoryIds(), serviceContext.getAssetTagNames(), true, false, null, null, null,
				null, ContentTypes.TEXT_HTML, author.getFullName(), null, null, null, null, 0, 0, null);
		assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(), serviceContext.getAssetLinkEntryIds(),
				AssetLinkConstants.TYPE_RELATED);

		Indexer<Author> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Author.class);
		indexer.reindex(author);

		logger.info("UPDATE author " + fullName + " successful");
		return author;
	}

	private void validate(String fullName) throws PortalException {
		if (Validator.isNull(fullName)) {
			throw new AuthorNameException("Author's can not be blank");
		}
	}

	private static final Log logger = LogFactoryUtil.getLog(Author.class);
}
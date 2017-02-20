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

import java.sql.Blob;
import java.util.Date;
import java.util.List;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetLinkConstants;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.service.ClassNameLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.Validator;
import com.nabook.exception.BookAuthorException;
import com.nabook.exception.BookISBNException;
import com.nabook.exception.BookPriceException;
import com.nabook.exception.BookPublisherException;
import com.nabook.exception.BookTitleException;
import com.nabook.exception.NoSuchBookException;
import com.nabook.model.Book;
import com.nabook.service.base.BookLocalServiceBaseImpl;

/**
 * The implementation of the book local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.nabook.service.BookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author phantoan
 * @see BookLocalServiceBaseImpl
 * @see com.nabook.service.BookLocalServiceUtil
 */
@ProviderType
public class BookLocalServiceImpl extends BookLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.nabook.service.BookLocalServiceUtil} to access the book local
	 * service.
	 */

	public Book addBook(ServiceContext serviceContext, long userId, String isbn, String title, String subtitle,
			String edition, String volume, String author, String publisher, Date pubDate, String price,
			String description, Blob thumbnail, Blob sample) throws SystemException, PortalException {
		logger.info("Start create book: " + title);

		validate(isbn, subtitle, author, publisher, price);
		checkDuplicate(isbn);

		User user = userPersistence.findByPrimaryKey(userId);

		long bookId = counterLocalService.increment();
		Book book = bookPersistence.create(bookId);
		Date now = new Date();

		book.setUuid(serviceContext.getUuid());
		book.setGroupId(serviceContext.getScopeGroupId());
		book.setCompanyId(user.getCompanyId());
		book.setUserId(userId);
		book.setUserName(user.getFullName());
		book.setCreateDate(serviceContext.getCreateDate(now));
		book.setModifiedDate(serviceContext.getModifiedDate(now));

		book.setISBN(isbn);
		book.setTitle(title);
		book.setSubtitle(subtitle);
		book.setEdition(edition);
		book.setVolume(volume);
		book.setPublisher(publisher);
		book.setPubDate(pubDate);
		book.setPrice(price);
		book.setDescription(description);
		book.setThumbnail(thumbnail);
		book.setSample(sample);

		book.setExpandoBridgeAttributes(serviceContext);

		bookPersistence.update(book);

		resourceLocalService.addModelResources(book, serviceContext);

		AssetEntry assetEntry = assetEntryLocalService.updateEntry(userId, book.getGroupId(), book.getCreateDate(),
				book.getModifiedDate(), Book.class.getName(), bookId, book.getUuid(), 0,
				serviceContext.getAssetCategoryIds(), serviceContext.getAssetTagNames(), true, false, null, null, null,
				null, ContentTypes.TEXT_HTML, book.getTitle(), null, null, null, null, 0, 0, null);
		assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(), serviceContext.getAssetLinkEntryIds(),
				AssetLinkConstants.TYPE_RELATED);

		ratingsStatsLocalService.addStats(ClassNameLocalServiceUtil.getClassNameId(Book.class), bookId);

		Indexer<Book> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Book.class);
		indexer.reindex(book);

		logger.info("CREATE book " + title + " successful.");
		return book;
	}

	public Book deleteBook(long bookId) throws SystemException, PortalException {
		Book book = getBook(bookId);

		resourceLocalService.deleteResource(book, ResourceConstants.SCOPE_INDIVIDUAL);

		AssetEntry assetEntry = assetEntryLocalService.fetchEntry(getModelClassName(), bookId);
		if (assetEntry != null) {
			assetLinkLocalService.deleteLinks(assetEntry.getEntryId());
			assetEntryLocalService.deleteEntry(assetEntry);
		}

		ratingsStatsLocalService.deleteStats(getModelClassName(), bookId);

		Indexer<Book> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Book.class);
		indexer.delete(book);

		book = deleteBook(book);

		logger.info("DELETE book " + book.getTitle() + " successful.");
		return book;
	}

	public List<Book> getAllBooks() throws SystemException, NoSuchBookException {
		return bookPersistence.findAll();
	}

	public List<Book> getAllBooks(int start, int end) throws SystemException, NoSuchBookException {
		return bookPersistence.findAll(start, end);
	}

	public Book updateBook(ServiceContext serviceContext, long userId, long bookId, String isbn, String title,
			String subtitle, String edition, String volume, String author, String publisher, Date pubDate, String price,
			String description, Blob thumbnail, Blob sample) throws SystemException, PortalException {
		logger.info("Start update book:" + title);

		validate(isbn, subtitle, author, publisher, price);

		Book book = getBook(bookId);
		Date now = new Date();

		book.setModifiedDate(serviceContext.getModifiedDate(now));
		book.setISBN(isbn);
		book.setTitle(title);
		book.setSubtitle(subtitle);
		book.setEdition(edition);
		book.setVolume(volume);
		book.setPublisher(publisher);
		book.setPubDate(pubDate);
		book.setPrice(price);
		book.setDescription(description);
		book.setThumbnail(thumbnail);
		book.setSample(sample);

		book.setExpandoBridgeAttributes(serviceContext);

		resourceLocalService.updateModelResources(book, serviceContext);

		AssetEntry assetEntry = assetEntryLocalService.updateEntry(userId, book.getGroupId(), book.getCreateDate(),
				book.getModifiedDate(), Book.class.getName(), bookId, book.getUuid(), 0,
				serviceContext.getAssetCategoryIds(), serviceContext.getAssetTagNames(), true, false, null, null, null,
				null, ContentTypes.TEXT_HTML, book.getTitle(), null, null, null, null, 0, 0, null);
		assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(), serviceContext.getAssetLinkEntryIds(),
				AssetLinkConstants.TYPE_RELATED);

		Indexer<Book> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Book.class);
		indexer.reindex(book);

		logger.info("UPDATE book: " + title + " successful");
		return book;
	}

	private void checkDuplicate(String isbn) throws PortalException {
		if (bookPersistence.fetchByISBN(isbn) != null) {
			throw new BookISBNException("ISBN already exist.");
		}
	}

	private void validate(String isbn, String title, String author, String publisher, String price)
			throws PortalException {
		if (Validator.isNull(isbn)) {
			throw new BookISBNException("Book's ISBN can not be blank.");
		}
		if (Validator.isNull(title)) {
			throw new BookTitleException("Book's title can not be blank.");
		}
		if (Validator.isNull(author)) {
			throw new BookAuthorException("Author can not be blank.");
		}
		if (Validator.isNull(publisher)) {
			throw new BookPublisherException("Publisher can not be blank.");
		}
		if (Validator.isNull(price)) {
			throw new BookPriceException("Price can not be blank.");
		}
	}

	private static final Log logger = LogFactoryUtil.getLog(Book.class);
}
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
import com.liferay.portal.kernel.service.ClassNameLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nabook.exception.NoSuchBookstoreException;
import com.nabook.exception.StoreAddressException;
import com.nabook.exception.StoreNameException;
import com.nabook.exception.StorePhoneException;
import com.nabook.model.Bookstore;
import com.nabook.service.BookstoreLocalServiceUtil;
import com.nabook.service.base.BookstoreLocalServiceBaseImpl;

/**
 * The implementation of the bookstore local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.nabook.service.BookstoreLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author phantoan
 * @see BookstoreLocalServiceBaseImpl
 * @see com.nabook.service.BookstoreLocalServiceUtil
 */
@ProviderType
public class BookstoreLocalServiceImpl extends BookstoreLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.nabook.service.BookstoreLocalServiceUtil} to access the bookstore
	 * local service.
	 */
	public Bookstore addBookstore(ServiceContext serviceContext, long userId, String name, String country, String city,
			String prefecture, String street, String zip, String phone, String description)
			throws SystemException, PortalException {
		logger.info("Start create store: " + name);

		validate(name, country, city, prefecture, street, phone);

		User user = userPersistence.findByPrimaryKey(userId);
		checkDuplicate(name, user.getCompanyId(), country, city, prefecture, street, phone);

		long bookstoreId = counterLocalService.increment();
		Bookstore bookstore = bookstorePersistence.create(bookstoreId);
		Date now = new Date();

		bookstore.setUuid(serviceContext.getUuid());
		bookstore.setGroupId(serviceContext.getScopeGroupId());
		bookstore.setCompanyId(user.getCompanyId());
		bookstore.setUserId(userId);
		bookstore.setUserName(user.getFullName());
		bookstore.setCreateDate(serviceContext.getCreateDate(now));
		bookstore.setModifiedDate(serviceContext.getModifiedDate(now));

		bookstore.setName(name);
		bookstore.setCountry(country);
		bookstore.setCity(city);
		bookstore.setPrefecture(prefecture);
		bookstore.setStreet(street);
		bookstore.setZip(zip);
		bookstore.setPhone(phone);
		bookstore.setDescription(description);

		bookstore.setExpandoBridgeAttributes(serviceContext);

		bookstorePersistence.update(bookstore);

		resourceLocalService.addModelResources(bookstore, serviceContext);

		ratingsStatsLocalService.addStats(ClassNameLocalServiceUtil.getClassNameId(Bookstore.class.getName()),
				bookstoreId);

		Indexer<Bookstore> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Bookstore.class);
		indexer.reindex(bookstore);

		logger.info("CREATE store: " + name + " successful");
		return bookstore;
	}

	public int countBookstores() throws SystemException, NoSuchBookstoreException {
		return bookstorePersistence.countAll();
	}

	public Bookstore deleteBookstore(long bookstoreId) throws SystemException, PortalException {
		Bookstore bookstore = getBookstore(bookstoreId);

		resourceLocalService.deleteResource(bookstore, ResourceConstants.SCOPE_INDIVIDUAL);

		ratingsStatsLocalService.deleteStats(getModelClassName(), bookstoreId);

		bookstore = deleteBookstore(bookstore);

		Indexer<Bookstore> indexer = IndexerRegistryUtil.getIndexer(Bookstore.class);
		indexer.delete(bookstore.getCompanyId(), bookstore.getUuid());

		logger.info("DELETE " + bookstore.getName() + " successful");
		return bookstore;
	}

	public List<Bookstore> getAllBookstores() throws SystemException, NoSuchBookstoreException {
		return bookstorePersistence.findAll();
	}

	public List<Bookstore> getAllBookstores(int start, int end) throws SystemException, NoSuchBookstoreException {
		return bookstorePersistence.findAll(start, end);
	}

	public List<Bookstore> getBookstoresByLocation(long companyId, String country, String city, String prefecture)
			throws SystemException, NoSuchBookstoreException {
		return bookstorePersistence.findByLocation(country, city, prefecture);
	}

	public List<Bookstore> getBookstoresByLocation(long companyId, String country, String city, String prefecture,
			int start, int end) throws SystemException, NoSuchBookstoreException {
		return bookstorePersistence.findByLocation(country, city, prefecture, start, end);
	}

	public Bookstore updateBookstore(ServiceContext serviceContext, long userId, long bookstoreId, String name,
			String country, String city, String prefecture, String street, String zip, String phone, String description)
			throws SystemException, PortalException {
		logger.info("Start update store:" + name);

		validate(name, country, city, prefecture, street, phone);

		Bookstore bookstore = getBookstore(bookstoreId);
		Date now = new Date();

		bookstore.setModifiedDate(serviceContext.getModifiedDate(now));
		bookstore.setName(name);
		bookstore.setCountry(country);
		bookstore.setCity(city);
		bookstore.setPrefecture(prefecture);
		bookstore.setStreet(street);
		bookstore.setZip(zip);
		bookstore.setPhone(phone);
		bookstore.setDescription(description);

		bookstore.setExpandoBridgeAttributes(serviceContext);

		bookstorePersistence.update(bookstore);

		resourceLocalService.updateModelResources(bookstore, serviceContext);

		Indexer<Bookstore> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Bookstore.class);
		indexer.reindex(bookstore);

		logger.info("UPDATE store: " + name + " successful");
		return bookstore;
	}

	private void checkDuplicate(String name, long companyId, String country, String city, String prefecture,
			String street, String phone) throws PortalException {
		if (bookstorePersistence.fetchByName(name) != null) {
			throw new StoreNameException("Store's name already exist.");
		}

		if (bookstorePersistence.fetchByStoreAddress(country, city, prefecture, street) != null) {
			throw new StoreAddressException("Store with this address already exist.");
		}

		if (bookstorePersistence.fetchByPhone(phone) != null) {
			throw new StorePhoneException("Store's phone already exist.");
		}
	}

	private void validate(String name, String country, String city, String prefecture, String street, String phone)
			throws PortalException {
		if (Validator.isNull(name)) {
			throw new StoreNameException("Store's name can not be blank.");
		}

		if (Validator.isNull(country) || Validator.isNull(city) || Validator.isNull(prefecture)
				|| Validator.isNull(street)) {
			throw new StoreAddressException("Store's address fields canot be blank");
		}

		if (Validator.isNull(phone) || !Validator.isPhoneNumber(phone)) {
			throw new StorePhoneException("Store's phone number consist of only digits.");
		}
	}

	public List<Bookstore> search(long companyId, String keywords) throws SearchException {
		SearchContext searchContext = new SearchContext();

		Map<String, Serializable> attributes = new HashMap<String, Serializable>();
		attributes.put("name", keywords);
		attributes.put("address", keywords);
		attributes.put("zip", keywords);
		attributes.put("phone", keywords);

		searchContext.setKeywords(keywords);
		searchContext.setAttributes(attributes);
		searchContext.setCompanyId(companyId);

		QueryConfig queryConfig = new QueryConfig();
		queryConfig.setHighlightEnabled(false);
		queryConfig.setScoreEnabled(false);

		searchContext.setAndSearch(false);
		searchContext.setQueryConfig(queryConfig);

		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(Bookstore.class);
		Hits hits = indexer.search(searchContext);

		List<Bookstore> bookstores = new ArrayList<Bookstore>();
		for (int i = 0; i < hits.getDocs().length; i++) {
			Document doc = hits.doc(i);
			long bookstoreId = GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK));
			Bookstore result = null;
			try {
				result = BookstoreLocalServiceUtil.getBookstore(bookstoreId);
			} catch (Exception e) {
				System.out.println("Cant get store with id " + bookstoreId);
			}
			bookstores.add(result);
		}
		System.out.println("Result with keyword " + keywords + ":" + bookstores.size());
		return bookstores;
	}

	private static final Log logger = LogFactoryUtil.getLog(Bookstore.class.getName());
}
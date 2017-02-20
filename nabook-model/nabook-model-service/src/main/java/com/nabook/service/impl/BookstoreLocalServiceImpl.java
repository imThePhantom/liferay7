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

import java.util.Date;
import java.util.List;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetLinkConstants;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.Validator;
import com.nabook.exception.NoSuchBookstoreException;
import com.nabook.exception.StoreAddressException;
import com.nabook.exception.StoreNameException;
import com.nabook.exception.StorePhoneException;
import com.nabook.model.Bookstore;
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
			String prefecture, String street, String zip, String phone) throws SystemException, PortalException {

		User user = userPersistence.findByPrimaryKey(userId);

		validate(name, country, city, prefecture, street, phone);
		
		System.out.println("Validate store success");
		
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

		bookstore.setExpandoBridgeAttributes(serviceContext);

		bookstorePersistence.update(bookstore);

		AssetEntry assetEntry = assetEntryLocalService.updateEntry(userId, bookstore.getGroupId(), bookstore.getCreateDate(),
				bookstore.getModifiedDate(), Bookstore.class.getName(), bookstoreId, bookstore.getUuid(), 0,
				serviceContext.getAssetCategoryIds(), serviceContext.getAssetTagNames(), true, false, null, null, null,
				null, ContentTypes.TEXT_HTML, bookstore.getName(), null, null, null, null, 0, 0, null);

		assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(), serviceContext.getAssetLinkEntryIds(), AssetLinkConstants.TYPE_RELATED);

		Indexer<Bookstore> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Bookstore.class);
		indexer.reindex(bookstore);

		return bookstore;
	}

	public int countBookstores(long companyId) throws SystemException, NoSuchBookstoreException {
		return bookstorePersistence.countByCompanyId(companyId);
	}

	public Bookstore deleteBookstore(ServiceContext serviceContext, long bookstoreId)
			throws SystemException, PortalException {
		Bookstore bookstore = getBookstore(bookstoreId);

		Indexer<Bookstore> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Bookstore.class);
		indexer.delete(bookstore);

		bookstore = deleteBookstore(bookstore);
		return bookstore;
	}

	public List<Bookstore> getAllBookstores(long companyId) throws SystemException, NoSuchBookstoreException {
		return bookstorePersistence.findByCompanyId(companyId);
	}

	public List<Bookstore> getAllBookstores(long companyId, int start, int end)
			throws SystemException, NoSuchBookstoreException {
		return bookstorePersistence.findByCompanyId(companyId, start, end);
	}

	public List<Bookstore> getBookstoresByLocation(String country, String city, String prefecture)
			throws SystemException, NoSuchBookstoreException {
		return bookstorePersistence.findByLocation(country, city, prefecture);
	}

	public List<Bookstore> getBookstoresByLocation(String country, String city, String prefecture, int start, int end)
			throws SystemException, NoSuchBookstoreException {
		return bookstorePersistence.findByLocation(country, city, prefecture, start, end);
	}

	public Bookstore updateBookstore(ServiceContext serviceContext, long userId, long bookstoreId, String name,
			String country, String city, String prefecture, String street, String zip, String phone)
			throws SystemException, PortalException {
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

		bookstore.setExpandoBridgeAttributes(serviceContext);

		bookstorePersistence.update(bookstore);

		Indexer<Bookstore> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Bookstore.class);
		indexer.reindex(bookstore);

		return bookstore;
	}

	private void validate(String name, String country, String city, String prefecture, String street, String phone)
			throws PortalException {
		if (Validator.isNull(name)) {
			throw new StoreNameException("Store's name can not be blank.");
		}

		if (bookstorePersistence.fetchByName(name) != null) {
			throw new StoreNameException("Store's name already exist.");
		}
		System.out.println("Validate store's name success");
		
		if (Validator.isNull(country) || Validator.isNull(city) || Validator.isNull(prefecture)
				|| Validator.isNull(street)) {
			throw new StoreAddressException("Store's address fields canot be blank");
		}

		if (bookstorePersistence.fetchByStoreAddress(country, city, prefecture, street) != null) {
			throw new StoreAddressException("Store with this address already exist.");
		}
		System.out.println("Validate store's address success");
		
		if (Validator.isNull(phone) || !Validator.isPhoneNumber(phone)) {
			throw new StorePhoneException("Store's phone number consist of only digits.");
		}

		if (bookstorePersistence.fetchByPhone(phone) != null) {
			throw new StorePhoneException("Store's phone already exist.");
		}
		System.out.println("Validate store's phone success");
	}
}
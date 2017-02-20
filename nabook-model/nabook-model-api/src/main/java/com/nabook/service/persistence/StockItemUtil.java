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

package com.nabook.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nabook.model.StockItem;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the stock item service. This utility wraps {@link com.nabook.service.persistence.impl.StockItemPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author phantoan
 * @see StockItemPersistence
 * @see com.nabook.service.persistence.impl.StockItemPersistenceImpl
 * @generated
 */
@ProviderType
public class StockItemUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(StockItem stockItem) {
		getPersistence().clearCache(stockItem);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<StockItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StockItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StockItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<StockItem> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static StockItem update(StockItem stockItem) {
		return getPersistence().update(stockItem);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static StockItem update(StockItem stockItem,
		ServiceContext serviceContext) {
		return getPersistence().update(stockItem, serviceContext);
	}

	/**
	* Returns all the stock items where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching stock items
	*/
	public static List<StockItem> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the stock items where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @return the range of matching stock items
	*/
	public static List<StockItem> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the stock items where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching stock items
	*/
	public static List<StockItem> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<StockItem> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the stock items where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching stock items
	*/
	public static List<StockItem> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<StockItem> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first stock item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching stock item
	* @throws NoSuchStockItemException if a matching stock item could not be found
	*/
	public static StockItem findByUuid_First(java.lang.String uuid,
		OrderByComparator<StockItem> orderByComparator)
		throws com.nabook.exception.NoSuchStockItemException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first stock item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public static StockItem fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<StockItem> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last stock item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching stock item
	* @throws NoSuchStockItemException if a matching stock item could not be found
	*/
	public static StockItem findByUuid_Last(java.lang.String uuid,
		OrderByComparator<StockItem> orderByComparator)
		throws com.nabook.exception.NoSuchStockItemException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last stock item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public static StockItem fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<StockItem> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the stock items before and after the current stock item in the ordered set where uuid = &#63;.
	*
	* @param stockItemId the primary key of the current stock item
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next stock item
	* @throws NoSuchStockItemException if a stock item with the primary key could not be found
	*/
	public static StockItem[] findByUuid_PrevAndNext(long stockItemId,
		java.lang.String uuid, OrderByComparator<StockItem> orderByComparator)
		throws com.nabook.exception.NoSuchStockItemException {
		return getPersistence()
				   .findByUuid_PrevAndNext(stockItemId, uuid, orderByComparator);
	}

	/**
	* Removes all the stock items where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of stock items where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching stock items
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the stock item where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchStockItemException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching stock item
	* @throws NoSuchStockItemException if a matching stock item could not be found
	*/
	public static StockItem findByUUID_G(java.lang.String uuid, long groupId)
		throws com.nabook.exception.NoSuchStockItemException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the stock item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public static StockItem fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the stock item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public static StockItem fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the stock item where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the stock item that was removed
	*/
	public static StockItem removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.nabook.exception.NoSuchStockItemException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of stock items where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching stock items
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the stock items where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching stock items
	*/
	public static List<StockItem> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the stock items where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @return the range of matching stock items
	*/
	public static List<StockItem> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the stock items where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching stock items
	*/
	public static List<StockItem> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<StockItem> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the stock items where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching stock items
	*/
	public static List<StockItem> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<StockItem> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first stock item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching stock item
	* @throws NoSuchStockItemException if a matching stock item could not be found
	*/
	public static StockItem findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<StockItem> orderByComparator)
		throws com.nabook.exception.NoSuchStockItemException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first stock item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public static StockItem fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<StockItem> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last stock item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching stock item
	* @throws NoSuchStockItemException if a matching stock item could not be found
	*/
	public static StockItem findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<StockItem> orderByComparator)
		throws com.nabook.exception.NoSuchStockItemException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last stock item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public static StockItem fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<StockItem> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the stock items before and after the current stock item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param stockItemId the primary key of the current stock item
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next stock item
	* @throws NoSuchStockItemException if a stock item with the primary key could not be found
	*/
	public static StockItem[] findByUuid_C_PrevAndNext(long stockItemId,
		java.lang.String uuid, long companyId,
		OrderByComparator<StockItem> orderByComparator)
		throws com.nabook.exception.NoSuchStockItemException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(stockItemId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the stock items where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of stock items where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching stock items
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns the stock item where bookId = &#63; or throws a {@link NoSuchStockItemException} if it could not be found.
	*
	* @param bookId the book ID
	* @return the matching stock item
	* @throws NoSuchStockItemException if a matching stock item could not be found
	*/
	public static StockItem findByBookId(long bookId)
		throws com.nabook.exception.NoSuchStockItemException {
		return getPersistence().findByBookId(bookId);
	}

	/**
	* Returns the stock item where bookId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param bookId the book ID
	* @return the matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public static StockItem fetchByBookId(long bookId) {
		return getPersistence().fetchByBookId(bookId);
	}

	/**
	* Returns the stock item where bookId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param bookId the book ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public static StockItem fetchByBookId(long bookId, boolean retrieveFromCache) {
		return getPersistence().fetchByBookId(bookId, retrieveFromCache);
	}

	/**
	* Removes the stock item where bookId = &#63; from the database.
	*
	* @param bookId the book ID
	* @return the stock item that was removed
	*/
	public static StockItem removeByBookId(long bookId)
		throws com.nabook.exception.NoSuchStockItemException {
		return getPersistence().removeByBookId(bookId);
	}

	/**
	* Returns the number of stock items where bookId = &#63;.
	*
	* @param bookId the book ID
	* @return the number of matching stock items
	*/
	public static int countByBookId(long bookId) {
		return getPersistence().countByBookId(bookId);
	}

	/**
	* Caches the stock item in the entity cache if it is enabled.
	*
	* @param stockItem the stock item
	*/
	public static void cacheResult(StockItem stockItem) {
		getPersistence().cacheResult(stockItem);
	}

	/**
	* Caches the stock items in the entity cache if it is enabled.
	*
	* @param stockItems the stock items
	*/
	public static void cacheResult(List<StockItem> stockItems) {
		getPersistence().cacheResult(stockItems);
	}

	/**
	* Creates a new stock item with the primary key. Does not add the stock item to the database.
	*
	* @param stockItemId the primary key for the new stock item
	* @return the new stock item
	*/
	public static StockItem create(long stockItemId) {
		return getPersistence().create(stockItemId);
	}

	/**
	* Removes the stock item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stockItemId the primary key of the stock item
	* @return the stock item that was removed
	* @throws NoSuchStockItemException if a stock item with the primary key could not be found
	*/
	public static StockItem remove(long stockItemId)
		throws com.nabook.exception.NoSuchStockItemException {
		return getPersistence().remove(stockItemId);
	}

	public static StockItem updateImpl(StockItem stockItem) {
		return getPersistence().updateImpl(stockItem);
	}

	/**
	* Returns the stock item with the primary key or throws a {@link NoSuchStockItemException} if it could not be found.
	*
	* @param stockItemId the primary key of the stock item
	* @return the stock item
	* @throws NoSuchStockItemException if a stock item with the primary key could not be found
	*/
	public static StockItem findByPrimaryKey(long stockItemId)
		throws com.nabook.exception.NoSuchStockItemException {
		return getPersistence().findByPrimaryKey(stockItemId);
	}

	/**
	* Returns the stock item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param stockItemId the primary key of the stock item
	* @return the stock item, or <code>null</code> if a stock item with the primary key could not be found
	*/
	public static StockItem fetchByPrimaryKey(long stockItemId) {
		return getPersistence().fetchByPrimaryKey(stockItemId);
	}

	public static java.util.Map<java.io.Serializable, StockItem> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the stock items.
	*
	* @return the stock items
	*/
	public static List<StockItem> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the stock items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @return the range of stock items
	*/
	public static List<StockItem> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the stock items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of stock items
	*/
	public static List<StockItem> findAll(int start, int end,
		OrderByComparator<StockItem> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the stock items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of stock items
	*/
	public static List<StockItem> findAll(int start, int end,
		OrderByComparator<StockItem> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the stock items from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of stock items.
	*
	* @return the number of stock items
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static StockItemPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<StockItemPersistence, StockItemPersistence> _serviceTracker =
		ServiceTrackerFactory.open(StockItemPersistence.class);
}
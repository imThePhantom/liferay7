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

import com.nabook.model.BookOrder;

import org.osgi.util.tracker.ServiceTracker;

import java.util.Date;
import java.util.List;

/**
 * The persistence utility for the book order service. This utility wraps {@link com.nabook.service.persistence.impl.BookOrderPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author phantoan
 * @see BookOrderPersistence
 * @see com.nabook.service.persistence.impl.BookOrderPersistenceImpl
 * @generated
 */
@ProviderType
public class BookOrderUtil {
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
	public static void clearCache(BookOrder bookOrder) {
		getPersistence().clearCache(bookOrder);
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
	public static List<BookOrder> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BookOrder> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BookOrder> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BookOrder> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BookOrder update(BookOrder bookOrder) {
		return getPersistence().update(bookOrder);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BookOrder update(BookOrder bookOrder,
		ServiceContext serviceContext) {
		return getPersistence().update(bookOrder, serviceContext);
	}

	/**
	* Returns all the book orders where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching book orders
	*/
	public static List<BookOrder> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the book orders where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @return the range of matching book orders
	*/
	public static List<BookOrder> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the book orders where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching book orders
	*/
	public static List<BookOrder> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<BookOrder> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the book orders where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching book orders
	*/
	public static List<BookOrder> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<BookOrder> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first book order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public static BookOrder findByUuid_First(java.lang.String uuid,
		OrderByComparator<BookOrder> orderByComparator)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first book order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public static BookOrder fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<BookOrder> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last book order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public static BookOrder findByUuid_Last(java.lang.String uuid,
		OrderByComparator<BookOrder> orderByComparator)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last book order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public static BookOrder fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<BookOrder> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the book orders before and after the current book order in the ordered set where uuid = &#63;.
	*
	* @param bookOrderId the primary key of the current book order
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next book order
	* @throws NoSuchBookOrderException if a book order with the primary key could not be found
	*/
	public static BookOrder[] findByUuid_PrevAndNext(long bookOrderId,
		java.lang.String uuid, OrderByComparator<BookOrder> orderByComparator)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence()
				   .findByUuid_PrevAndNext(bookOrderId, uuid, orderByComparator);
	}

	/**
	* Removes all the book orders where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of book orders where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching book orders
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the book order where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchBookOrderException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public static BookOrder findByUUID_G(java.lang.String uuid, long groupId)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the book order where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public static BookOrder fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the book order where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public static BookOrder fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the book order where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the book order that was removed
	*/
	public static BookOrder removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of book orders where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching book orders
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the book orders where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching book orders
	*/
	public static List<BookOrder> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the book orders where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @return the range of matching book orders
	*/
	public static List<BookOrder> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the book orders where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching book orders
	*/
	public static List<BookOrder> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<BookOrder> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the book orders where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching book orders
	*/
	public static List<BookOrder> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<BookOrder> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first book order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public static BookOrder findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<BookOrder> orderByComparator)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first book order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public static BookOrder fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<BookOrder> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last book order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public static BookOrder findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<BookOrder> orderByComparator)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last book order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public static BookOrder fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<BookOrder> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the book orders before and after the current book order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param bookOrderId the primary key of the current book order
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next book order
	* @throws NoSuchBookOrderException if a book order with the primary key could not be found
	*/
	public static BookOrder[] findByUuid_C_PrevAndNext(long bookOrderId,
		java.lang.String uuid, long companyId,
		OrderByComparator<BookOrder> orderByComparator)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(bookOrderId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the book orders where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of book orders where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching book orders
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the book orders where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching book orders
	*/
	public static List<BookOrder> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the book orders where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @return the range of matching book orders
	*/
	public static List<BookOrder> findByUserId(long userId, int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the book orders where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching book orders
	*/
	public static List<BookOrder> findByUserId(long userId, int start, int end,
		OrderByComparator<BookOrder> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the book orders where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching book orders
	*/
	public static List<BookOrder> findByUserId(long userId, int start, int end,
		OrderByComparator<BookOrder> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first book order in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public static BookOrder findByUserId_First(long userId,
		OrderByComparator<BookOrder> orderByComparator)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first book order in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public static BookOrder fetchByUserId_First(long userId,
		OrderByComparator<BookOrder> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last book order in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public static BookOrder findByUserId_Last(long userId,
		OrderByComparator<BookOrder> orderByComparator)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last book order in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public static BookOrder fetchByUserId_Last(long userId,
		OrderByComparator<BookOrder> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the book orders before and after the current book order in the ordered set where userId = &#63;.
	*
	* @param bookOrderId the primary key of the current book order
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next book order
	* @throws NoSuchBookOrderException if a book order with the primary key could not be found
	*/
	public static BookOrder[] findByUserId_PrevAndNext(long bookOrderId,
		long userId, OrderByComparator<BookOrder> orderByComparator)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence()
				   .findByUserId_PrevAndNext(bookOrderId, userId,
			orderByComparator);
	}

	/**
	* Removes all the book orders where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of book orders where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching book orders
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the book orders where modifiedDate = &#63;.
	*
	* @param modifiedDate the modified date
	* @return the matching book orders
	*/
	public static List<BookOrder> findByModifiedDate(Date modifiedDate) {
		return getPersistence().findByModifiedDate(modifiedDate);
	}

	/**
	* Returns a range of all the book orders where modifiedDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedDate the modified date
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @return the range of matching book orders
	*/
	public static List<BookOrder> findByModifiedDate(Date modifiedDate,
		int start, int end) {
		return getPersistence().findByModifiedDate(modifiedDate, start, end);
	}

	/**
	* Returns an ordered range of all the book orders where modifiedDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedDate the modified date
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching book orders
	*/
	public static List<BookOrder> findByModifiedDate(Date modifiedDate,
		int start, int end, OrderByComparator<BookOrder> orderByComparator) {
		return getPersistence()
				   .findByModifiedDate(modifiedDate, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the book orders where modifiedDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param modifiedDate the modified date
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching book orders
	*/
	public static List<BookOrder> findByModifiedDate(Date modifiedDate,
		int start, int end, OrderByComparator<BookOrder> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByModifiedDate(modifiedDate, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first book order in the ordered set where modifiedDate = &#63;.
	*
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public static BookOrder findByModifiedDate_First(Date modifiedDate,
		OrderByComparator<BookOrder> orderByComparator)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence()
				   .findByModifiedDate_First(modifiedDate, orderByComparator);
	}

	/**
	* Returns the first book order in the ordered set where modifiedDate = &#63;.
	*
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public static BookOrder fetchByModifiedDate_First(Date modifiedDate,
		OrderByComparator<BookOrder> orderByComparator) {
		return getPersistence()
				   .fetchByModifiedDate_First(modifiedDate, orderByComparator);
	}

	/**
	* Returns the last book order in the ordered set where modifiedDate = &#63;.
	*
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public static BookOrder findByModifiedDate_Last(Date modifiedDate,
		OrderByComparator<BookOrder> orderByComparator)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence()
				   .findByModifiedDate_Last(modifiedDate, orderByComparator);
	}

	/**
	* Returns the last book order in the ordered set where modifiedDate = &#63;.
	*
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public static BookOrder fetchByModifiedDate_Last(Date modifiedDate,
		OrderByComparator<BookOrder> orderByComparator) {
		return getPersistence()
				   .fetchByModifiedDate_Last(modifiedDate, orderByComparator);
	}

	/**
	* Returns the book orders before and after the current book order in the ordered set where modifiedDate = &#63;.
	*
	* @param bookOrderId the primary key of the current book order
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next book order
	* @throws NoSuchBookOrderException if a book order with the primary key could not be found
	*/
	public static BookOrder[] findByModifiedDate_PrevAndNext(long bookOrderId,
		Date modifiedDate, OrderByComparator<BookOrder> orderByComparator)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence()
				   .findByModifiedDate_PrevAndNext(bookOrderId, modifiedDate,
			orderByComparator);
	}

	/**
	* Removes all the book orders where modifiedDate = &#63; from the database.
	*
	* @param modifiedDate the modified date
	*/
	public static void removeByModifiedDate(Date modifiedDate) {
		getPersistence().removeByModifiedDate(modifiedDate);
	}

	/**
	* Returns the number of book orders where modifiedDate = &#63;.
	*
	* @param modifiedDate the modified date
	* @return the number of matching book orders
	*/
	public static int countByModifiedDate(Date modifiedDate) {
		return getPersistence().countByModifiedDate(modifiedDate);
	}

	/**
	* Caches the book order in the entity cache if it is enabled.
	*
	* @param bookOrder the book order
	*/
	public static void cacheResult(BookOrder bookOrder) {
		getPersistence().cacheResult(bookOrder);
	}

	/**
	* Caches the book orders in the entity cache if it is enabled.
	*
	* @param bookOrders the book orders
	*/
	public static void cacheResult(List<BookOrder> bookOrders) {
		getPersistence().cacheResult(bookOrders);
	}

	/**
	* Creates a new book order with the primary key. Does not add the book order to the database.
	*
	* @param bookOrderId the primary key for the new book order
	* @return the new book order
	*/
	public static BookOrder create(long bookOrderId) {
		return getPersistence().create(bookOrderId);
	}

	/**
	* Removes the book order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookOrderId the primary key of the book order
	* @return the book order that was removed
	* @throws NoSuchBookOrderException if a book order with the primary key could not be found
	*/
	public static BookOrder remove(long bookOrderId)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence().remove(bookOrderId);
	}

	public static BookOrder updateImpl(BookOrder bookOrder) {
		return getPersistence().updateImpl(bookOrder);
	}

	/**
	* Returns the book order with the primary key or throws a {@link NoSuchBookOrderException} if it could not be found.
	*
	* @param bookOrderId the primary key of the book order
	* @return the book order
	* @throws NoSuchBookOrderException if a book order with the primary key could not be found
	*/
	public static BookOrder findByPrimaryKey(long bookOrderId)
		throws com.nabook.exception.NoSuchBookOrderException {
		return getPersistence().findByPrimaryKey(bookOrderId);
	}

	/**
	* Returns the book order with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookOrderId the primary key of the book order
	* @return the book order, or <code>null</code> if a book order with the primary key could not be found
	*/
	public static BookOrder fetchByPrimaryKey(long bookOrderId) {
		return getPersistence().fetchByPrimaryKey(bookOrderId);
	}

	public static java.util.Map<java.io.Serializable, BookOrder> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the book orders.
	*
	* @return the book orders
	*/
	public static List<BookOrder> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the book orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @return the range of book orders
	*/
	public static List<BookOrder> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the book orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of book orders
	*/
	public static List<BookOrder> findAll(int start, int end,
		OrderByComparator<BookOrder> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the book orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of book orders
	*/
	public static List<BookOrder> findAll(int start, int end,
		OrderByComparator<BookOrder> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the book orders from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of book orders.
	*
	* @return the number of book orders
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static BookOrderPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BookOrderPersistence, BookOrderPersistence> _serviceTracker =
		ServiceTrackerFactory.open(BookOrderPersistence.class);
}
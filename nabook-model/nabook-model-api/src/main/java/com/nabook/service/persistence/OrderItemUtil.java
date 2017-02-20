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

import com.nabook.model.OrderItem;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the order item service. This utility wraps {@link com.nabook.service.persistence.impl.OrderItemPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author phantoan
 * @see OrderItemPersistence
 * @see com.nabook.service.persistence.impl.OrderItemPersistenceImpl
 * @generated
 */
@ProviderType
public class OrderItemUtil {
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
	public static void clearCache(OrderItem orderItem) {
		getPersistence().clearCache(orderItem);
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
	public static List<OrderItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OrderItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OrderItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OrderItem update(OrderItem orderItem) {
		return getPersistence().update(orderItem);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OrderItem update(OrderItem orderItem,
		ServiceContext serviceContext) {
		return getPersistence().update(orderItem, serviceContext);
	}

	/**
	* Returns all the order items where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching order items
	*/
	public static List<OrderItem> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the order items where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @return the range of matching order items
	*/
	public static List<OrderItem> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the order items where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching order items
	*/
	public static List<OrderItem> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the order items where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching order items
	*/
	public static List<OrderItem> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first order item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public static OrderItem findByUuid_First(java.lang.String uuid,
		OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first order item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public static OrderItem fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last order item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public static OrderItem findByUuid_Last(java.lang.String uuid,
		OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last order item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public static OrderItem fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the order items before and after the current order item in the ordered set where uuid = &#63;.
	*
	* @param orderItemId the primary key of the current order item
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order item
	* @throws NoSuchOrderItemException if a order item with the primary key could not be found
	*/
	public static OrderItem[] findByUuid_PrevAndNext(long orderItemId,
		java.lang.String uuid, OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence()
				   .findByUuid_PrevAndNext(orderItemId, uuid, orderByComparator);
	}

	/**
	* Removes all the order items where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of order items where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching order items
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the order item where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchOrderItemException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public static OrderItem findByUUID_G(java.lang.String uuid, long groupId)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the order item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public static OrderItem fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the order item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public static OrderItem fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the order item where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the order item that was removed
	*/
	public static OrderItem removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of order items where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching order items
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the order items where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching order items
	*/
	public static List<OrderItem> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the order items where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @return the range of matching order items
	*/
	public static List<OrderItem> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the order items where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching order items
	*/
	public static List<OrderItem> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the order items where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching order items
	*/
	public static List<OrderItem> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first order item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public static OrderItem findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first order item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public static OrderItem fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last order item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public static OrderItem findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last order item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public static OrderItem fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the order items before and after the current order item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param orderItemId the primary key of the current order item
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order item
	* @throws NoSuchOrderItemException if a order item with the primary key could not be found
	*/
	public static OrderItem[] findByUuid_C_PrevAndNext(long orderItemId,
		java.lang.String uuid, long companyId,
		OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(orderItemId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the order items where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of order items where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching order items
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the order items where bookOrderId = &#63;.
	*
	* @param bookOrderId the book order ID
	* @return the matching order items
	*/
	public static List<OrderItem> findByOrderId(long bookOrderId) {
		return getPersistence().findByOrderId(bookOrderId);
	}

	/**
	* Returns a range of all the order items where bookOrderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookOrderId the book order ID
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @return the range of matching order items
	*/
	public static List<OrderItem> findByOrderId(long bookOrderId, int start,
		int end) {
		return getPersistence().findByOrderId(bookOrderId, start, end);
	}

	/**
	* Returns an ordered range of all the order items where bookOrderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookOrderId the book order ID
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching order items
	*/
	public static List<OrderItem> findByOrderId(long bookOrderId, int start,
		int end, OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence()
				   .findByOrderId(bookOrderId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the order items where bookOrderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookOrderId the book order ID
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching order items
	*/
	public static List<OrderItem> findByOrderId(long bookOrderId, int start,
		int end, OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOrderId(bookOrderId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first order item in the ordered set where bookOrderId = &#63;.
	*
	* @param bookOrderId the book order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public static OrderItem findByOrderId_First(long bookOrderId,
		OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence()
				   .findByOrderId_First(bookOrderId, orderByComparator);
	}

	/**
	* Returns the first order item in the ordered set where bookOrderId = &#63;.
	*
	* @param bookOrderId the book order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public static OrderItem fetchByOrderId_First(long bookOrderId,
		OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence()
				   .fetchByOrderId_First(bookOrderId, orderByComparator);
	}

	/**
	* Returns the last order item in the ordered set where bookOrderId = &#63;.
	*
	* @param bookOrderId the book order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public static OrderItem findByOrderId_Last(long bookOrderId,
		OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence()
				   .findByOrderId_Last(bookOrderId, orderByComparator);
	}

	/**
	* Returns the last order item in the ordered set where bookOrderId = &#63;.
	*
	* @param bookOrderId the book order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public static OrderItem fetchByOrderId_Last(long bookOrderId,
		OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence()
				   .fetchByOrderId_Last(bookOrderId, orderByComparator);
	}

	/**
	* Returns the order items before and after the current order item in the ordered set where bookOrderId = &#63;.
	*
	* @param orderItemId the primary key of the current order item
	* @param bookOrderId the book order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order item
	* @throws NoSuchOrderItemException if a order item with the primary key could not be found
	*/
	public static OrderItem[] findByOrderId_PrevAndNext(long orderItemId,
		long bookOrderId, OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence()
				   .findByOrderId_PrevAndNext(orderItemId, bookOrderId,
			orderByComparator);
	}

	/**
	* Removes all the order items where bookOrderId = &#63; from the database.
	*
	* @param bookOrderId the book order ID
	*/
	public static void removeByOrderId(long bookOrderId) {
		getPersistence().removeByOrderId(bookOrderId);
	}

	/**
	* Returns the number of order items where bookOrderId = &#63;.
	*
	* @param bookOrderId the book order ID
	* @return the number of matching order items
	*/
	public static int countByOrderId(long bookOrderId) {
		return getPersistence().countByOrderId(bookOrderId);
	}

	/**
	* Returns all the order items where bookId = &#63;.
	*
	* @param bookId the book ID
	* @return the matching order items
	*/
	public static List<OrderItem> findByBookId(long bookId) {
		return getPersistence().findByBookId(bookId);
	}

	/**
	* Returns a range of all the order items where bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookId the book ID
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @return the range of matching order items
	*/
	public static List<OrderItem> findByBookId(long bookId, int start, int end) {
		return getPersistence().findByBookId(bookId, start, end);
	}

	/**
	* Returns an ordered range of all the order items where bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookId the book ID
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching order items
	*/
	public static List<OrderItem> findByBookId(long bookId, int start, int end,
		OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence()
				   .findByBookId(bookId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the order items where bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookId the book ID
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching order items
	*/
	public static List<OrderItem> findByBookId(long bookId, int start, int end,
		OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByBookId(bookId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first order item in the ordered set where bookId = &#63;.
	*
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public static OrderItem findByBookId_First(long bookId,
		OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence().findByBookId_First(bookId, orderByComparator);
	}

	/**
	* Returns the first order item in the ordered set where bookId = &#63;.
	*
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public static OrderItem fetchByBookId_First(long bookId,
		OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence().fetchByBookId_First(bookId, orderByComparator);
	}

	/**
	* Returns the last order item in the ordered set where bookId = &#63;.
	*
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public static OrderItem findByBookId_Last(long bookId,
		OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence().findByBookId_Last(bookId, orderByComparator);
	}

	/**
	* Returns the last order item in the ordered set where bookId = &#63;.
	*
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public static OrderItem fetchByBookId_Last(long bookId,
		OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence().fetchByBookId_Last(bookId, orderByComparator);
	}

	/**
	* Returns the order items before and after the current order item in the ordered set where bookId = &#63;.
	*
	* @param orderItemId the primary key of the current order item
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order item
	* @throws NoSuchOrderItemException if a order item with the primary key could not be found
	*/
	public static OrderItem[] findByBookId_PrevAndNext(long orderItemId,
		long bookId, OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence()
				   .findByBookId_PrevAndNext(orderItemId, bookId,
			orderByComparator);
	}

	/**
	* Removes all the order items where bookId = &#63; from the database.
	*
	* @param bookId the book ID
	*/
	public static void removeByBookId(long bookId) {
		getPersistence().removeByBookId(bookId);
	}

	/**
	* Returns the number of order items where bookId = &#63;.
	*
	* @param bookId the book ID
	* @return the number of matching order items
	*/
	public static int countByBookId(long bookId) {
		return getPersistence().countByBookId(bookId);
	}

	/**
	* Returns all the order items where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching order items
	*/
	public static List<OrderItem> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the order items where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @return the range of matching order items
	*/
	public static List<OrderItem> findByUserId(long userId, int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the order items where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching order items
	*/
	public static List<OrderItem> findByUserId(long userId, int start, int end,
		OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the order items where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching order items
	*/
	public static List<OrderItem> findByUserId(long userId, int start, int end,
		OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first order item in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public static OrderItem findByUserId_First(long userId,
		OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first order item in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public static OrderItem fetchByUserId_First(long userId,
		OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last order item in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public static OrderItem findByUserId_Last(long userId,
		OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last order item in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public static OrderItem fetchByUserId_Last(long userId,
		OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the order items before and after the current order item in the ordered set where userId = &#63;.
	*
	* @param orderItemId the primary key of the current order item
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order item
	* @throws NoSuchOrderItemException if a order item with the primary key could not be found
	*/
	public static OrderItem[] findByUserId_PrevAndNext(long orderItemId,
		long userId, OrderByComparator<OrderItem> orderByComparator)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence()
				   .findByUserId_PrevAndNext(orderItemId, userId,
			orderByComparator);
	}

	/**
	* Removes all the order items where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of order items where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching order items
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns the order item where bookOrderId = &#63; and bookId = &#63; or throws a {@link NoSuchOrderItemException} if it could not be found.
	*
	* @param bookOrderId the book order ID
	* @param bookId the book ID
	* @return the matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public static OrderItem findByOrderItem(long bookOrderId, long bookId)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence().findByOrderItem(bookOrderId, bookId);
	}

	/**
	* Returns the order item where bookOrderId = &#63; and bookId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param bookOrderId the book order ID
	* @param bookId the book ID
	* @return the matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public static OrderItem fetchByOrderItem(long bookOrderId, long bookId) {
		return getPersistence().fetchByOrderItem(bookOrderId, bookId);
	}

	/**
	* Returns the order item where bookOrderId = &#63; and bookId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param bookOrderId the book order ID
	* @param bookId the book ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public static OrderItem fetchByOrderItem(long bookOrderId, long bookId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByOrderItem(bookOrderId, bookId, retrieveFromCache);
	}

	/**
	* Removes the order item where bookOrderId = &#63; and bookId = &#63; from the database.
	*
	* @param bookOrderId the book order ID
	* @param bookId the book ID
	* @return the order item that was removed
	*/
	public static OrderItem removeByOrderItem(long bookOrderId, long bookId)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence().removeByOrderItem(bookOrderId, bookId);
	}

	/**
	* Returns the number of order items where bookOrderId = &#63; and bookId = &#63;.
	*
	* @param bookOrderId the book order ID
	* @param bookId the book ID
	* @return the number of matching order items
	*/
	public static int countByOrderItem(long bookOrderId, long bookId) {
		return getPersistence().countByOrderItem(bookOrderId, bookId);
	}

	/**
	* Caches the order item in the entity cache if it is enabled.
	*
	* @param orderItem the order item
	*/
	public static void cacheResult(OrderItem orderItem) {
		getPersistence().cacheResult(orderItem);
	}

	/**
	* Caches the order items in the entity cache if it is enabled.
	*
	* @param orderItems the order items
	*/
	public static void cacheResult(List<OrderItem> orderItems) {
		getPersistence().cacheResult(orderItems);
	}

	/**
	* Creates a new order item with the primary key. Does not add the order item to the database.
	*
	* @param orderItemId the primary key for the new order item
	* @return the new order item
	*/
	public static OrderItem create(long orderItemId) {
		return getPersistence().create(orderItemId);
	}

	/**
	* Removes the order item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderItemId the primary key of the order item
	* @return the order item that was removed
	* @throws NoSuchOrderItemException if a order item with the primary key could not be found
	*/
	public static OrderItem remove(long orderItemId)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence().remove(orderItemId);
	}

	public static OrderItem updateImpl(OrderItem orderItem) {
		return getPersistence().updateImpl(orderItem);
	}

	/**
	* Returns the order item with the primary key or throws a {@link NoSuchOrderItemException} if it could not be found.
	*
	* @param orderItemId the primary key of the order item
	* @return the order item
	* @throws NoSuchOrderItemException if a order item with the primary key could not be found
	*/
	public static OrderItem findByPrimaryKey(long orderItemId)
		throws com.nabook.exception.NoSuchOrderItemException {
		return getPersistence().findByPrimaryKey(orderItemId);
	}

	/**
	* Returns the order item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orderItemId the primary key of the order item
	* @return the order item, or <code>null</code> if a order item with the primary key could not be found
	*/
	public static OrderItem fetchByPrimaryKey(long orderItemId) {
		return getPersistence().fetchByPrimaryKey(orderItemId);
	}

	public static java.util.Map<java.io.Serializable, OrderItem> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the order items.
	*
	* @return the order items
	*/
	public static List<OrderItem> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the order items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @return the range of order items
	*/
	public static List<OrderItem> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the order items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of order items
	*/
	public static List<OrderItem> findAll(int start, int end,
		OrderByComparator<OrderItem> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the order items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of order items
	*/
	public static List<OrderItem> findAll(int start, int end,
		OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the order items from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of order items.
	*
	* @return the number of order items
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static OrderItemPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OrderItemPersistence, OrderItemPersistence> _serviceTracker =
		ServiceTrackerFactory.open(OrderItemPersistence.class);
}
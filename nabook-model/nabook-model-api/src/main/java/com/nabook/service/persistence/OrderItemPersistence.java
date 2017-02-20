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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nabook.exception.NoSuchOrderItemException;

import com.nabook.model.OrderItem;

/**
 * The persistence interface for the order item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author phantoan
 * @see com.nabook.service.persistence.impl.OrderItemPersistenceImpl
 * @see OrderItemUtil
 * @generated
 */
@ProviderType
public interface OrderItemPersistence extends BasePersistence<OrderItem> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OrderItemUtil} to access the order item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the order items where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching order items
	*/
	public java.util.List<OrderItem> findByUuid(java.lang.String uuid);

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
	public java.util.List<OrderItem> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<OrderItem> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

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
	public java.util.List<OrderItem> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first order item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public OrderItem findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Returns the first order item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public OrderItem fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

	/**
	* Returns the last order item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public OrderItem findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Returns the last order item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public OrderItem fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

	/**
	* Returns the order items before and after the current order item in the ordered set where uuid = &#63;.
	*
	* @param orderItemId the primary key of the current order item
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order item
	* @throws NoSuchOrderItemException if a order item with the primary key could not be found
	*/
	public OrderItem[] findByUuid_PrevAndNext(long orderItemId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Removes all the order items where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of order items where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching order items
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the order item where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchOrderItemException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public OrderItem findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchOrderItemException;

	/**
	* Returns the order item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public OrderItem fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the order item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public OrderItem fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the order item where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the order item that was removed
	*/
	public OrderItem removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchOrderItemException;

	/**
	* Returns the number of order items where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching order items
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the order items where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching order items
	*/
	public java.util.List<OrderItem> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<OrderItem> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<OrderItem> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

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
	public java.util.List<OrderItem> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first order item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public OrderItem findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Returns the first order item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public OrderItem fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

	/**
	* Returns the last order item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public OrderItem findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Returns the last order item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public OrderItem fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

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
	public OrderItem[] findByUuid_C_PrevAndNext(long orderItemId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Removes all the order items where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of order items where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching order items
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the order items where bookOrderId = &#63;.
	*
	* @param bookOrderId the book order ID
	* @return the matching order items
	*/
	public java.util.List<OrderItem> findByOrderId(long bookOrderId);

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
	public java.util.List<OrderItem> findByOrderId(long bookOrderId, int start,
		int end);

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
	public java.util.List<OrderItem> findByOrderId(long bookOrderId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

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
	public java.util.List<OrderItem> findByOrderId(long bookOrderId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first order item in the ordered set where bookOrderId = &#63;.
	*
	* @param bookOrderId the book order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public OrderItem findByOrderId_First(long bookOrderId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Returns the first order item in the ordered set where bookOrderId = &#63;.
	*
	* @param bookOrderId the book order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public OrderItem fetchByOrderId_First(long bookOrderId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

	/**
	* Returns the last order item in the ordered set where bookOrderId = &#63;.
	*
	* @param bookOrderId the book order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public OrderItem findByOrderId_Last(long bookOrderId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Returns the last order item in the ordered set where bookOrderId = &#63;.
	*
	* @param bookOrderId the book order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public OrderItem fetchByOrderId_Last(long bookOrderId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

	/**
	* Returns the order items before and after the current order item in the ordered set where bookOrderId = &#63;.
	*
	* @param orderItemId the primary key of the current order item
	* @param bookOrderId the book order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order item
	* @throws NoSuchOrderItemException if a order item with the primary key could not be found
	*/
	public OrderItem[] findByOrderId_PrevAndNext(long orderItemId,
		long bookOrderId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Removes all the order items where bookOrderId = &#63; from the database.
	*
	* @param bookOrderId the book order ID
	*/
	public void removeByOrderId(long bookOrderId);

	/**
	* Returns the number of order items where bookOrderId = &#63;.
	*
	* @param bookOrderId the book order ID
	* @return the number of matching order items
	*/
	public int countByOrderId(long bookOrderId);

	/**
	* Returns all the order items where bookId = &#63;.
	*
	* @param bookId the book ID
	* @return the matching order items
	*/
	public java.util.List<OrderItem> findByBookId(long bookId);

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
	public java.util.List<OrderItem> findByBookId(long bookId, int start,
		int end);

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
	public java.util.List<OrderItem> findByBookId(long bookId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

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
	public java.util.List<OrderItem> findByBookId(long bookId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first order item in the ordered set where bookId = &#63;.
	*
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public OrderItem findByBookId_First(long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Returns the first order item in the ordered set where bookId = &#63;.
	*
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public OrderItem fetchByBookId_First(long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

	/**
	* Returns the last order item in the ordered set where bookId = &#63;.
	*
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public OrderItem findByBookId_Last(long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Returns the last order item in the ordered set where bookId = &#63;.
	*
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public OrderItem fetchByBookId_Last(long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

	/**
	* Returns the order items before and after the current order item in the ordered set where bookId = &#63;.
	*
	* @param orderItemId the primary key of the current order item
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order item
	* @throws NoSuchOrderItemException if a order item with the primary key could not be found
	*/
	public OrderItem[] findByBookId_PrevAndNext(long orderItemId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Removes all the order items where bookId = &#63; from the database.
	*
	* @param bookId the book ID
	*/
	public void removeByBookId(long bookId);

	/**
	* Returns the number of order items where bookId = &#63;.
	*
	* @param bookId the book ID
	* @return the number of matching order items
	*/
	public int countByBookId(long bookId);

	/**
	* Returns all the order items where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching order items
	*/
	public java.util.List<OrderItem> findByUserId(long userId);

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
	public java.util.List<OrderItem> findByUserId(long userId, int start,
		int end);

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
	public java.util.List<OrderItem> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

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
	public java.util.List<OrderItem> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first order item in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public OrderItem findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Returns the first order item in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public OrderItem fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

	/**
	* Returns the last order item in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public OrderItem findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Returns the last order item in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public OrderItem fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

	/**
	* Returns the order items before and after the current order item in the ordered set where userId = &#63;.
	*
	* @param orderItemId the primary key of the current order item
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order item
	* @throws NoSuchOrderItemException if a order item with the primary key could not be found
	*/
	public OrderItem[] findByUserId_PrevAndNext(long orderItemId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException;

	/**
	* Removes all the order items where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of order items where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching order items
	*/
	public int countByUserId(long userId);

	/**
	* Returns the order item where bookOrderId = &#63; and bookId = &#63; or throws a {@link NoSuchOrderItemException} if it could not be found.
	*
	* @param bookOrderId the book order ID
	* @param bookId the book ID
	* @return the matching order item
	* @throws NoSuchOrderItemException if a matching order item could not be found
	*/
	public OrderItem findByOrderItem(long bookOrderId, long bookId)
		throws NoSuchOrderItemException;

	/**
	* Returns the order item where bookOrderId = &#63; and bookId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param bookOrderId the book order ID
	* @param bookId the book ID
	* @return the matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public OrderItem fetchByOrderItem(long bookOrderId, long bookId);

	/**
	* Returns the order item where bookOrderId = &#63; and bookId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param bookOrderId the book order ID
	* @param bookId the book ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching order item, or <code>null</code> if a matching order item could not be found
	*/
	public OrderItem fetchByOrderItem(long bookOrderId, long bookId,
		boolean retrieveFromCache);

	/**
	* Removes the order item where bookOrderId = &#63; and bookId = &#63; from the database.
	*
	* @param bookOrderId the book order ID
	* @param bookId the book ID
	* @return the order item that was removed
	*/
	public OrderItem removeByOrderItem(long bookOrderId, long bookId)
		throws NoSuchOrderItemException;

	/**
	* Returns the number of order items where bookOrderId = &#63; and bookId = &#63;.
	*
	* @param bookOrderId the book order ID
	* @param bookId the book ID
	* @return the number of matching order items
	*/
	public int countByOrderItem(long bookOrderId, long bookId);

	/**
	* Caches the order item in the entity cache if it is enabled.
	*
	* @param orderItem the order item
	*/
	public void cacheResult(OrderItem orderItem);

	/**
	* Caches the order items in the entity cache if it is enabled.
	*
	* @param orderItems the order items
	*/
	public void cacheResult(java.util.List<OrderItem> orderItems);

	/**
	* Creates a new order item with the primary key. Does not add the order item to the database.
	*
	* @param orderItemId the primary key for the new order item
	* @return the new order item
	*/
	public OrderItem create(long orderItemId);

	/**
	* Removes the order item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderItemId the primary key of the order item
	* @return the order item that was removed
	* @throws NoSuchOrderItemException if a order item with the primary key could not be found
	*/
	public OrderItem remove(long orderItemId) throws NoSuchOrderItemException;

	public OrderItem updateImpl(OrderItem orderItem);

	/**
	* Returns the order item with the primary key or throws a {@link NoSuchOrderItemException} if it could not be found.
	*
	* @param orderItemId the primary key of the order item
	* @return the order item
	* @throws NoSuchOrderItemException if a order item with the primary key could not be found
	*/
	public OrderItem findByPrimaryKey(long orderItemId)
		throws NoSuchOrderItemException;

	/**
	* Returns the order item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orderItemId the primary key of the order item
	* @return the order item, or <code>null</code> if a order item with the primary key could not be found
	*/
	public OrderItem fetchByPrimaryKey(long orderItemId);

	@Override
	public java.util.Map<java.io.Serializable, OrderItem> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the order items.
	*
	* @return the order items
	*/
	public java.util.List<OrderItem> findAll();

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
	public java.util.List<OrderItem> findAll(int start, int end);

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
	public java.util.List<OrderItem> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator);

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
	public java.util.List<OrderItem> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the order items from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of order items.
	*
	* @return the number of order items
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}
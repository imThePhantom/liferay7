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

import com.nabook.exception.NoSuchBookOrderException;

import com.nabook.model.BookOrder;

import java.util.Date;

/**
 * The persistence interface for the book order service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author phantoan
 * @see com.nabook.service.persistence.impl.BookOrderPersistenceImpl
 * @see BookOrderUtil
 * @generated
 */
@ProviderType
public interface BookOrderPersistence extends BasePersistence<BookOrder> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BookOrderUtil} to access the book order persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the book orders where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching book orders
	*/
	public java.util.List<BookOrder> findByUuid(java.lang.String uuid);

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
	public java.util.List<BookOrder> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<BookOrder> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator);

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
	public java.util.List<BookOrder> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first book order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public BookOrder findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator)
		throws NoSuchBookOrderException;

	/**
	* Returns the first book order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public BookOrder fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator);

	/**
	* Returns the last book order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public BookOrder findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator)
		throws NoSuchBookOrderException;

	/**
	* Returns the last book order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public BookOrder fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator);

	/**
	* Returns the book orders before and after the current book order in the ordered set where uuid = &#63;.
	*
	* @param bookOrderId the primary key of the current book order
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next book order
	* @throws NoSuchBookOrderException if a book order with the primary key could not be found
	*/
	public BookOrder[] findByUuid_PrevAndNext(long bookOrderId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator)
		throws NoSuchBookOrderException;

	/**
	* Removes all the book orders where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of book orders where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching book orders
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the book order where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchBookOrderException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public BookOrder findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchBookOrderException;

	/**
	* Returns the book order where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public BookOrder fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the book order where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public BookOrder fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the book order where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the book order that was removed
	*/
	public BookOrder removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchBookOrderException;

	/**
	* Returns the number of book orders where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching book orders
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the book orders where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching book orders
	*/
	public java.util.List<BookOrder> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<BookOrder> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<BookOrder> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator);

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
	public java.util.List<BookOrder> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first book order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public BookOrder findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator)
		throws NoSuchBookOrderException;

	/**
	* Returns the first book order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public BookOrder fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator);

	/**
	* Returns the last book order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public BookOrder findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator)
		throws NoSuchBookOrderException;

	/**
	* Returns the last book order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public BookOrder fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator);

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
	public BookOrder[] findByUuid_C_PrevAndNext(long bookOrderId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator)
		throws NoSuchBookOrderException;

	/**
	* Removes all the book orders where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of book orders where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching book orders
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the book orders where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching book orders
	*/
	public java.util.List<BookOrder> findByUserId(long userId);

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
	public java.util.List<BookOrder> findByUserId(long userId, int start,
		int end);

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
	public java.util.List<BookOrder> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator);

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
	public java.util.List<BookOrder> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first book order in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public BookOrder findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator)
		throws NoSuchBookOrderException;

	/**
	* Returns the first book order in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public BookOrder fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator);

	/**
	* Returns the last book order in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public BookOrder findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator)
		throws NoSuchBookOrderException;

	/**
	* Returns the last book order in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public BookOrder fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator);

	/**
	* Returns the book orders before and after the current book order in the ordered set where userId = &#63;.
	*
	* @param bookOrderId the primary key of the current book order
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next book order
	* @throws NoSuchBookOrderException if a book order with the primary key could not be found
	*/
	public BookOrder[] findByUserId_PrevAndNext(long bookOrderId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator)
		throws NoSuchBookOrderException;

	/**
	* Removes all the book orders where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of book orders where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching book orders
	*/
	public int countByUserId(long userId);

	/**
	* Returns all the book orders where modifiedDate = &#63;.
	*
	* @param modifiedDate the modified date
	* @return the matching book orders
	*/
	public java.util.List<BookOrder> findByModifiedDate(Date modifiedDate);

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
	public java.util.List<BookOrder> findByModifiedDate(Date modifiedDate,
		int start, int end);

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
	public java.util.List<BookOrder> findByModifiedDate(Date modifiedDate,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator);

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
	public java.util.List<BookOrder> findByModifiedDate(Date modifiedDate,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first book order in the ordered set where modifiedDate = &#63;.
	*
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public BookOrder findByModifiedDate_First(Date modifiedDate,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator)
		throws NoSuchBookOrderException;

	/**
	* Returns the first book order in the ordered set where modifiedDate = &#63;.
	*
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public BookOrder fetchByModifiedDate_First(Date modifiedDate,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator);

	/**
	* Returns the last book order in the ordered set where modifiedDate = &#63;.
	*
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order
	* @throws NoSuchBookOrderException if a matching book order could not be found
	*/
	public BookOrder findByModifiedDate_Last(Date modifiedDate,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator)
		throws NoSuchBookOrderException;

	/**
	* Returns the last book order in the ordered set where modifiedDate = &#63;.
	*
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public BookOrder fetchByModifiedDate_Last(Date modifiedDate,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator);

	/**
	* Returns the book orders before and after the current book order in the ordered set where modifiedDate = &#63;.
	*
	* @param bookOrderId the primary key of the current book order
	* @param modifiedDate the modified date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next book order
	* @throws NoSuchBookOrderException if a book order with the primary key could not be found
	*/
	public BookOrder[] findByModifiedDate_PrevAndNext(long bookOrderId,
		Date modifiedDate,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator)
		throws NoSuchBookOrderException;

	/**
	* Removes all the book orders where modifiedDate = &#63; from the database.
	*
	* @param modifiedDate the modified date
	*/
	public void removeByModifiedDate(Date modifiedDate);

	/**
	* Returns the number of book orders where modifiedDate = &#63;.
	*
	* @param modifiedDate the modified date
	* @return the number of matching book orders
	*/
	public int countByModifiedDate(Date modifiedDate);

	/**
	* Caches the book order in the entity cache if it is enabled.
	*
	* @param bookOrder the book order
	*/
	public void cacheResult(BookOrder bookOrder);

	/**
	* Caches the book orders in the entity cache if it is enabled.
	*
	* @param bookOrders the book orders
	*/
	public void cacheResult(java.util.List<BookOrder> bookOrders);

	/**
	* Creates a new book order with the primary key. Does not add the book order to the database.
	*
	* @param bookOrderId the primary key for the new book order
	* @return the new book order
	*/
	public BookOrder create(long bookOrderId);

	/**
	* Removes the book order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookOrderId the primary key of the book order
	* @return the book order that was removed
	* @throws NoSuchBookOrderException if a book order with the primary key could not be found
	*/
	public BookOrder remove(long bookOrderId) throws NoSuchBookOrderException;

	public BookOrder updateImpl(BookOrder bookOrder);

	/**
	* Returns the book order with the primary key or throws a {@link NoSuchBookOrderException} if it could not be found.
	*
	* @param bookOrderId the primary key of the book order
	* @return the book order
	* @throws NoSuchBookOrderException if a book order with the primary key could not be found
	*/
	public BookOrder findByPrimaryKey(long bookOrderId)
		throws NoSuchBookOrderException;

	/**
	* Returns the book order with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookOrderId the primary key of the book order
	* @return the book order, or <code>null</code> if a book order with the primary key could not be found
	*/
	public BookOrder fetchByPrimaryKey(long bookOrderId);

	@Override
	public java.util.Map<java.io.Serializable, BookOrder> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the book orders.
	*
	* @return the book orders
	*/
	public java.util.List<BookOrder> findAll();

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
	public java.util.List<BookOrder> findAll(int start, int end);

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
	public java.util.List<BookOrder> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator);

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
	public java.util.List<BookOrder> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookOrder> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the book orders from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of book orders.
	*
	* @return the number of book orders
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}
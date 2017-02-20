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

import com.nabook.exception.NoSuchCartException;

import com.nabook.model.Cart;

/**
 * The persistence interface for the cart service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author phantoan
 * @see com.nabook.service.persistence.impl.CartPersistenceImpl
 * @see CartUtil
 * @generated
 */
@ProviderType
public interface CartPersistence extends BasePersistence<Cart> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CartUtil} to access the cart persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the carts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching carts
	*/
	public java.util.List<Cart> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the carts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @return the range of matching carts
	*/
	public java.util.List<Cart> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the carts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching carts
	*/
	public java.util.List<Cart> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator);

	/**
	* Returns an ordered range of all the carts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching carts
	*/
	public java.util.List<Cart> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first cart in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public Cart findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator)
		throws NoSuchCartException;

	/**
	* Returns the first cart in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public Cart fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator);

	/**
	* Returns the last cart in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public Cart findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator)
		throws NoSuchCartException;

	/**
	* Returns the last cart in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public Cart fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator);

	/**
	* Returns the carts before and after the current cart in the ordered set where uuid = &#63;.
	*
	* @param cartId the primary key of the current cart
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cart
	* @throws NoSuchCartException if a cart with the primary key could not be found
	*/
	public Cart[] findByUuid_PrevAndNext(long cartId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator)
		throws NoSuchCartException;

	/**
	* Removes all the carts where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of carts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching carts
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the cart where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCartException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public Cart findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCartException;

	/**
	* Returns the cart where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public Cart fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the cart where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public Cart fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the cart where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the cart that was removed
	*/
	public Cart removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCartException;

	/**
	* Returns the number of carts where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching carts
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the carts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching carts
	*/
	public java.util.List<Cart> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the carts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @return the range of matching carts
	*/
	public java.util.List<Cart> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the carts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching carts
	*/
	public java.util.List<Cart> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator);

	/**
	* Returns an ordered range of all the carts where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching carts
	*/
	public java.util.List<Cart> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first cart in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public Cart findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator)
		throws NoSuchCartException;

	/**
	* Returns the first cart in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public Cart fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator);

	/**
	* Returns the last cart in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public Cart findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator)
		throws NoSuchCartException;

	/**
	* Returns the last cart in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public Cart fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator);

	/**
	* Returns the carts before and after the current cart in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param cartId the primary key of the current cart
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cart
	* @throws NoSuchCartException if a cart with the primary key could not be found
	*/
	public Cart[] findByUuid_C_PrevAndNext(long cartId, java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator)
		throws NoSuchCartException;

	/**
	* Removes all the carts where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of carts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching carts
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the carts where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching carts
	*/
	public java.util.List<Cart> findByUserId(long userId);

	/**
	* Returns a range of all the carts where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @return the range of matching carts
	*/
	public java.util.List<Cart> findByUserId(long userId, int start, int end);

	/**
	* Returns an ordered range of all the carts where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching carts
	*/
	public java.util.List<Cart> findByUserId(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator);

	/**
	* Returns an ordered range of all the carts where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching carts
	*/
	public java.util.List<Cart> findByUserId(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first cart in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public Cart findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator)
		throws NoSuchCartException;

	/**
	* Returns the first cart in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public Cart fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator);

	/**
	* Returns the last cart in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public Cart findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator)
		throws NoSuchCartException;

	/**
	* Returns the last cart in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public Cart fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator);

	/**
	* Returns the carts before and after the current cart in the ordered set where userId = &#63;.
	*
	* @param cartId the primary key of the current cart
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cart
	* @throws NoSuchCartException if a cart with the primary key could not be found
	*/
	public Cart[] findByUserId_PrevAndNext(long cartId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator)
		throws NoSuchCartException;

	/**
	* Removes all the carts where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of carts where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching carts
	*/
	public int countByUserId(long userId);

	/**
	* Returns the cart where userId = &#63; and bookId = &#63; or throws a {@link NoSuchCartException} if it could not be found.
	*
	* @param userId the user ID
	* @param bookId the book ID
	* @return the matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public Cart findByBookId(long userId, long bookId)
		throws NoSuchCartException;

	/**
	* Returns the cart where userId = &#63; and bookId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param bookId the book ID
	* @return the matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public Cart fetchByBookId(long userId, long bookId);

	/**
	* Returns the cart where userId = &#63; and bookId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param bookId the book ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public Cart fetchByBookId(long userId, long bookId,
		boolean retrieveFromCache);

	/**
	* Removes the cart where userId = &#63; and bookId = &#63; from the database.
	*
	* @param userId the user ID
	* @param bookId the book ID
	* @return the cart that was removed
	*/
	public Cart removeByBookId(long userId, long bookId)
		throws NoSuchCartException;

	/**
	* Returns the number of carts where userId = &#63; and bookId = &#63;.
	*
	* @param userId the user ID
	* @param bookId the book ID
	* @return the number of matching carts
	*/
	public int countByBookId(long userId, long bookId);

	/**
	* Caches the cart in the entity cache if it is enabled.
	*
	* @param cart the cart
	*/
	public void cacheResult(Cart cart);

	/**
	* Caches the carts in the entity cache if it is enabled.
	*
	* @param carts the carts
	*/
	public void cacheResult(java.util.List<Cart> carts);

	/**
	* Creates a new cart with the primary key. Does not add the cart to the database.
	*
	* @param cartId the primary key for the new cart
	* @return the new cart
	*/
	public Cart create(long cartId);

	/**
	* Removes the cart with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cartId the primary key of the cart
	* @return the cart that was removed
	* @throws NoSuchCartException if a cart with the primary key could not be found
	*/
	public Cart remove(long cartId) throws NoSuchCartException;

	public Cart updateImpl(Cart cart);

	/**
	* Returns the cart with the primary key or throws a {@link NoSuchCartException} if it could not be found.
	*
	* @param cartId the primary key of the cart
	* @return the cart
	* @throws NoSuchCartException if a cart with the primary key could not be found
	*/
	public Cart findByPrimaryKey(long cartId) throws NoSuchCartException;

	/**
	* Returns the cart with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cartId the primary key of the cart
	* @return the cart, or <code>null</code> if a cart with the primary key could not be found
	*/
	public Cart fetchByPrimaryKey(long cartId);

	@Override
	public java.util.Map<java.io.Serializable, Cart> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the carts.
	*
	* @return the carts
	*/
	public java.util.List<Cart> findAll();

	/**
	* Returns a range of all the carts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @return the range of carts
	*/
	public java.util.List<Cart> findAll(int start, int end);

	/**
	* Returns an ordered range of all the carts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of carts
	*/
	public java.util.List<Cart> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator);

	/**
	* Returns an ordered range of all the carts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of carts
	*/
	public java.util.List<Cart> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the carts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of carts.
	*
	* @return the number of carts
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}
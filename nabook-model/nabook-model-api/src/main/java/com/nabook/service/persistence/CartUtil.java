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

import com.nabook.model.Cart;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the cart service. This utility wraps {@link com.nabook.service.persistence.impl.CartPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author phantoan
 * @see CartPersistence
 * @see com.nabook.service.persistence.impl.CartPersistenceImpl
 * @generated
 */
@ProviderType
public class CartUtil {
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
	public static void clearCache(Cart cart) {
		getPersistence().clearCache(cart);
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
	public static List<Cart> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Cart> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Cart> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Cart> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Cart update(Cart cart) {
		return getPersistence().update(cart);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Cart update(Cart cart, ServiceContext serviceContext) {
		return getPersistence().update(cart, serviceContext);
	}

	/**
	* Returns all the carts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching carts
	*/
	public static List<Cart> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Cart> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Cart> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Cart> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Cart> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Cart> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first cart in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public static Cart findByUuid_First(java.lang.String uuid,
		OrderByComparator<Cart> orderByComparator)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first cart in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public static Cart fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Cart> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last cart in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public static Cart findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Cart> orderByComparator)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last cart in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public static Cart fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Cart> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the carts before and after the current cart in the ordered set where uuid = &#63;.
	*
	* @param cartId the primary key of the current cart
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cart
	* @throws NoSuchCartException if a cart with the primary key could not be found
	*/
	public static Cart[] findByUuid_PrevAndNext(long cartId,
		java.lang.String uuid, OrderByComparator<Cart> orderByComparator)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence()
				   .findByUuid_PrevAndNext(cartId, uuid, orderByComparator);
	}

	/**
	* Removes all the carts where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of carts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching carts
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the cart where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCartException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public static Cart findByUUID_G(java.lang.String uuid, long groupId)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the cart where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public static Cart fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the cart where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public static Cart fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the cart where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the cart that was removed
	*/
	public static Cart removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of carts where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching carts
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the carts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching carts
	*/
	public static List<Cart> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<Cart> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<Cart> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Cart> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<Cart> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Cart> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first cart in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public static Cart findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Cart> orderByComparator)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first cart in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public static Cart fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Cart> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last cart in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public static Cart findByUuid_C_Last(java.lang.String uuid, long companyId,
		OrderByComparator<Cart> orderByComparator)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last cart in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public static Cart fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Cart> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static Cart[] findByUuid_C_PrevAndNext(long cartId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Cart> orderByComparator)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(cartId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the carts where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of carts where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching carts
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the carts where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching carts
	*/
	public static List<Cart> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

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
	public static List<Cart> findByUserId(long userId, int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

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
	public static List<Cart> findByUserId(long userId, int start, int end,
		OrderByComparator<Cart> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

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
	public static List<Cart> findByUserId(long userId, int start, int end,
		OrderByComparator<Cart> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first cart in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public static Cart findByUserId_First(long userId,
		OrderByComparator<Cart> orderByComparator)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first cart in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public static Cart fetchByUserId_First(long userId,
		OrderByComparator<Cart> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last cart in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public static Cart findByUserId_Last(long userId,
		OrderByComparator<Cart> orderByComparator)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last cart in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public static Cart fetchByUserId_Last(long userId,
		OrderByComparator<Cart> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the carts before and after the current cart in the ordered set where userId = &#63;.
	*
	* @param cartId the primary key of the current cart
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cart
	* @throws NoSuchCartException if a cart with the primary key could not be found
	*/
	public static Cart[] findByUserId_PrevAndNext(long cartId, long userId,
		OrderByComparator<Cart> orderByComparator)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence()
				   .findByUserId_PrevAndNext(cartId, userId, orderByComparator);
	}

	/**
	* Removes all the carts where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of carts where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching carts
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns the cart where userId = &#63; and bookId = &#63; or throws a {@link NoSuchCartException} if it could not be found.
	*
	* @param userId the user ID
	* @param bookId the book ID
	* @return the matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public static Cart findByBookId(long userId, long bookId)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence().findByBookId(userId, bookId);
	}

	/**
	* Returns the cart where userId = &#63; and bookId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param bookId the book ID
	* @return the matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public static Cart fetchByBookId(long userId, long bookId) {
		return getPersistence().fetchByBookId(userId, bookId);
	}

	/**
	* Returns the cart where userId = &#63; and bookId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param bookId the book ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public static Cart fetchByBookId(long userId, long bookId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByBookId(userId, bookId, retrieveFromCache);
	}

	/**
	* Removes the cart where userId = &#63; and bookId = &#63; from the database.
	*
	* @param userId the user ID
	* @param bookId the book ID
	* @return the cart that was removed
	*/
	public static Cart removeByBookId(long userId, long bookId)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence().removeByBookId(userId, bookId);
	}

	/**
	* Returns the number of carts where userId = &#63; and bookId = &#63;.
	*
	* @param userId the user ID
	* @param bookId the book ID
	* @return the number of matching carts
	*/
	public static int countByBookId(long userId, long bookId) {
		return getPersistence().countByBookId(userId, bookId);
	}

	/**
	* Caches the cart in the entity cache if it is enabled.
	*
	* @param cart the cart
	*/
	public static void cacheResult(Cart cart) {
		getPersistence().cacheResult(cart);
	}

	/**
	* Caches the carts in the entity cache if it is enabled.
	*
	* @param carts the carts
	*/
	public static void cacheResult(List<Cart> carts) {
		getPersistence().cacheResult(carts);
	}

	/**
	* Creates a new cart with the primary key. Does not add the cart to the database.
	*
	* @param cartId the primary key for the new cart
	* @return the new cart
	*/
	public static Cart create(long cartId) {
		return getPersistence().create(cartId);
	}

	/**
	* Removes the cart with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cartId the primary key of the cart
	* @return the cart that was removed
	* @throws NoSuchCartException if a cart with the primary key could not be found
	*/
	public static Cart remove(long cartId)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence().remove(cartId);
	}

	public static Cart updateImpl(Cart cart) {
		return getPersistence().updateImpl(cart);
	}

	/**
	* Returns the cart with the primary key or throws a {@link NoSuchCartException} if it could not be found.
	*
	* @param cartId the primary key of the cart
	* @return the cart
	* @throws NoSuchCartException if a cart with the primary key could not be found
	*/
	public static Cart findByPrimaryKey(long cartId)
		throws com.nabook.exception.NoSuchCartException {
		return getPersistence().findByPrimaryKey(cartId);
	}

	/**
	* Returns the cart with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cartId the primary key of the cart
	* @return the cart, or <code>null</code> if a cart with the primary key could not be found
	*/
	public static Cart fetchByPrimaryKey(long cartId) {
		return getPersistence().fetchByPrimaryKey(cartId);
	}

	public static java.util.Map<java.io.Serializable, Cart> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the carts.
	*
	* @return the carts
	*/
	public static List<Cart> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Cart> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Cart> findAll(int start, int end,
		OrderByComparator<Cart> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Cart> findAll(int start, int end,
		OrderByComparator<Cart> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the carts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of carts.
	*
	* @return the number of carts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CartPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CartPersistence, CartPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CartPersistence.class);
}
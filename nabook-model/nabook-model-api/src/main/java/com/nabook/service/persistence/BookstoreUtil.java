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

import com.nabook.model.Bookstore;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the bookstore service. This utility wraps {@link com.nabook.service.persistence.impl.BookstorePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author phantoan
 * @see BookstorePersistence
 * @see com.nabook.service.persistence.impl.BookstorePersistenceImpl
 * @generated
 */
@ProviderType
public class BookstoreUtil {
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
	public static void clearCache(Bookstore bookstore) {
		getPersistence().clearCache(bookstore);
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
	public static List<Bookstore> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Bookstore> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Bookstore> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Bookstore> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Bookstore update(Bookstore bookstore) {
		return getPersistence().update(bookstore);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Bookstore update(Bookstore bookstore,
		ServiceContext serviceContext) {
		return getPersistence().update(bookstore, serviceContext);
	}

	/**
	* Returns all the bookstores where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching bookstores
	*/
	public static List<Bookstore> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the bookstores where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @return the range of matching bookstores
	*/
	public static List<Bookstore> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the bookstores where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookstores
	*/
	public static List<Bookstore> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Bookstore> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookstores where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookstores
	*/
	public static List<Bookstore> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Bookstore> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first bookstore in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public static Bookstore findByUuid_First(java.lang.String uuid,
		OrderByComparator<Bookstore> orderByComparator)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first bookstore in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static Bookstore fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Bookstore> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last bookstore in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public static Bookstore findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Bookstore> orderByComparator)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last bookstore in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static Bookstore fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Bookstore> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the bookstores before and after the current bookstore in the ordered set where uuid = &#63;.
	*
	* @param bookstoreId the primary key of the current bookstore
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookstore
	* @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	*/
	public static Bookstore[] findByUuid_PrevAndNext(long bookstoreId,
		java.lang.String uuid, OrderByComparator<Bookstore> orderByComparator)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence()
				   .findByUuid_PrevAndNext(bookstoreId, uuid, orderByComparator);
	}

	/**
	* Removes all the bookstores where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of bookstores where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching bookstores
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the bookstore where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchBookstoreException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public static Bookstore findByUUID_G(java.lang.String uuid, long groupId)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the bookstore where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static Bookstore fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the bookstore where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static Bookstore fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the bookstore where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the bookstore that was removed
	*/
	public static Bookstore removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of bookstores where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching bookstores
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the bookstores where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching bookstores
	*/
	public static List<Bookstore> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the bookstores where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @return the range of matching bookstores
	*/
	public static List<Bookstore> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the bookstores where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookstores
	*/
	public static List<Bookstore> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Bookstore> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookstores where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookstores
	*/
	public static List<Bookstore> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Bookstore> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first bookstore in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public static Bookstore findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Bookstore> orderByComparator)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first bookstore in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static Bookstore fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Bookstore> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last bookstore in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public static Bookstore findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Bookstore> orderByComparator)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last bookstore in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static Bookstore fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Bookstore> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the bookstores before and after the current bookstore in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param bookstoreId the primary key of the current bookstore
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookstore
	* @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	*/
	public static Bookstore[] findByUuid_C_PrevAndNext(long bookstoreId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Bookstore> orderByComparator)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(bookstoreId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the bookstores where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of bookstores where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching bookstores
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the bookstores where country = &#63; and city = &#63; and prefecture = &#63;.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @return the matching bookstores
	*/
	public static List<Bookstore> findByLocation(java.lang.String country,
		java.lang.String city, java.lang.String prefecture) {
		return getPersistence().findByLocation(country, city, prefecture);
	}

	/**
	* Returns a range of all the bookstores where country = &#63; and city = &#63; and prefecture = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @return the range of matching bookstores
	*/
	public static List<Bookstore> findByLocation(java.lang.String country,
		java.lang.String city, java.lang.String prefecture, int start, int end) {
		return getPersistence()
				   .findByLocation(country, city, prefecture, start, end);
	}

	/**
	* Returns an ordered range of all the bookstores where country = &#63; and city = &#63; and prefecture = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookstores
	*/
	public static List<Bookstore> findByLocation(java.lang.String country,
		java.lang.String city, java.lang.String prefecture, int start, int end,
		OrderByComparator<Bookstore> orderByComparator) {
		return getPersistence()
				   .findByLocation(country, city, prefecture, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookstores where country = &#63; and city = &#63; and prefecture = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookstores
	*/
	public static List<Bookstore> findByLocation(java.lang.String country,
		java.lang.String city, java.lang.String prefecture, int start, int end,
		OrderByComparator<Bookstore> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByLocation(country, city, prefecture, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first bookstore in the ordered set where country = &#63; and city = &#63; and prefecture = &#63;.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public static Bookstore findByLocation_First(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		OrderByComparator<Bookstore> orderByComparator)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence()
				   .findByLocation_First(country, city, prefecture,
			orderByComparator);
	}

	/**
	* Returns the first bookstore in the ordered set where country = &#63; and city = &#63; and prefecture = &#63;.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static Bookstore fetchByLocation_First(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		OrderByComparator<Bookstore> orderByComparator) {
		return getPersistence()
				   .fetchByLocation_First(country, city, prefecture,
			orderByComparator);
	}

	/**
	* Returns the last bookstore in the ordered set where country = &#63; and city = &#63; and prefecture = &#63;.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public static Bookstore findByLocation_Last(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		OrderByComparator<Bookstore> orderByComparator)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence()
				   .findByLocation_Last(country, city, prefecture,
			orderByComparator);
	}

	/**
	* Returns the last bookstore in the ordered set where country = &#63; and city = &#63; and prefecture = &#63;.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static Bookstore fetchByLocation_Last(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		OrderByComparator<Bookstore> orderByComparator) {
		return getPersistence()
				   .fetchByLocation_Last(country, city, prefecture,
			orderByComparator);
	}

	/**
	* Returns the bookstores before and after the current bookstore in the ordered set where country = &#63; and city = &#63; and prefecture = &#63;.
	*
	* @param bookstoreId the primary key of the current bookstore
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookstore
	* @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	*/
	public static Bookstore[] findByLocation_PrevAndNext(long bookstoreId,
		java.lang.String country, java.lang.String city,
		java.lang.String prefecture,
		OrderByComparator<Bookstore> orderByComparator)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence()
				   .findByLocation_PrevAndNext(bookstoreId, country, city,
			prefecture, orderByComparator);
	}

	/**
	* Removes all the bookstores where country = &#63; and city = &#63; and prefecture = &#63; from the database.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	*/
	public static void removeByLocation(java.lang.String country,
		java.lang.String city, java.lang.String prefecture) {
		getPersistence().removeByLocation(country, city, prefecture);
	}

	/**
	* Returns the number of bookstores where country = &#63; and city = &#63; and prefecture = &#63;.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @return the number of matching bookstores
	*/
	public static int countByLocation(java.lang.String country,
		java.lang.String city, java.lang.String prefecture) {
		return getPersistence().countByLocation(country, city, prefecture);
	}

	/**
	* Returns the bookstore where name = &#63; or throws a {@link NoSuchBookstoreException} if it could not be found.
	*
	* @param name the name
	* @return the matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public static Bookstore findByName(java.lang.String name)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence().findByName(name);
	}

	/**
	* Returns the bookstore where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static Bookstore fetchByName(java.lang.String name) {
		return getPersistence().fetchByName(name);
	}

	/**
	* Returns the bookstore where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static Bookstore fetchByName(java.lang.String name,
		boolean retrieveFromCache) {
		return getPersistence().fetchByName(name, retrieveFromCache);
	}

	/**
	* Removes the bookstore where name = &#63; from the database.
	*
	* @param name the name
	* @return the bookstore that was removed
	*/
	public static Bookstore removeByName(java.lang.String name)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence().removeByName(name);
	}

	/**
	* Returns the number of bookstores where name = &#63;.
	*
	* @param name the name
	* @return the number of matching bookstores
	*/
	public static int countByName(java.lang.String name) {
		return getPersistence().countByName(name);
	}

	/**
	* Returns the bookstore where phone = &#63; or throws a {@link NoSuchBookstoreException} if it could not be found.
	*
	* @param phone the phone
	* @return the matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public static Bookstore findByPhone(java.lang.String phone)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence().findByPhone(phone);
	}

	/**
	* Returns the bookstore where phone = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param phone the phone
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static Bookstore fetchByPhone(java.lang.String phone) {
		return getPersistence().fetchByPhone(phone);
	}

	/**
	* Returns the bookstore where phone = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param phone the phone
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static Bookstore fetchByPhone(java.lang.String phone,
		boolean retrieveFromCache) {
		return getPersistence().fetchByPhone(phone, retrieveFromCache);
	}

	/**
	* Removes the bookstore where phone = &#63; from the database.
	*
	* @param phone the phone
	* @return the bookstore that was removed
	*/
	public static Bookstore removeByPhone(java.lang.String phone)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence().removeByPhone(phone);
	}

	/**
	* Returns the number of bookstores where phone = &#63;.
	*
	* @param phone the phone
	* @return the number of matching bookstores
	*/
	public static int countByPhone(java.lang.String phone) {
		return getPersistence().countByPhone(phone);
	}

	/**
	* Returns the bookstore where country = &#63; and city = &#63; and prefecture = &#63; and street = &#63; or throws a {@link NoSuchBookstoreException} if it could not be found.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param street the street
	* @return the matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public static Bookstore findByStoreAddress(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		java.lang.String street)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence()
				   .findByStoreAddress(country, city, prefecture, street);
	}

	/**
	* Returns the bookstore where country = &#63; and city = &#63; and prefecture = &#63; and street = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param street the street
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static Bookstore fetchByStoreAddress(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		java.lang.String street) {
		return getPersistence()
				   .fetchByStoreAddress(country, city, prefecture, street);
	}

	/**
	* Returns the bookstore where country = &#63; and city = &#63; and prefecture = &#63; and street = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param street the street
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static Bookstore fetchByStoreAddress(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		java.lang.String street, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByStoreAddress(country, city, prefecture, street,
			retrieveFromCache);
	}

	/**
	* Removes the bookstore where country = &#63; and city = &#63; and prefecture = &#63; and street = &#63; from the database.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param street the street
	* @return the bookstore that was removed
	*/
	public static Bookstore removeByStoreAddress(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		java.lang.String street)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence()
				   .removeByStoreAddress(country, city, prefecture, street);
	}

	/**
	* Returns the number of bookstores where country = &#63; and city = &#63; and prefecture = &#63; and street = &#63;.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param street the street
	* @return the number of matching bookstores
	*/
	public static int countByStoreAddress(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		java.lang.String street) {
		return getPersistence()
				   .countByStoreAddress(country, city, prefecture, street);
	}

	/**
	* Caches the bookstore in the entity cache if it is enabled.
	*
	* @param bookstore the bookstore
	*/
	public static void cacheResult(Bookstore bookstore) {
		getPersistence().cacheResult(bookstore);
	}

	/**
	* Caches the bookstores in the entity cache if it is enabled.
	*
	* @param bookstores the bookstores
	*/
	public static void cacheResult(List<Bookstore> bookstores) {
		getPersistence().cacheResult(bookstores);
	}

	/**
	* Creates a new bookstore with the primary key. Does not add the bookstore to the database.
	*
	* @param bookstoreId the primary key for the new bookstore
	* @return the new bookstore
	*/
	public static Bookstore create(long bookstoreId) {
		return getPersistence().create(bookstoreId);
	}

	/**
	* Removes the bookstore with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookstoreId the primary key of the bookstore
	* @return the bookstore that was removed
	* @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	*/
	public static Bookstore remove(long bookstoreId)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence().remove(bookstoreId);
	}

	public static Bookstore updateImpl(Bookstore bookstore) {
		return getPersistence().updateImpl(bookstore);
	}

	/**
	* Returns the bookstore with the primary key or throws a {@link NoSuchBookstoreException} if it could not be found.
	*
	* @param bookstoreId the primary key of the bookstore
	* @return the bookstore
	* @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	*/
	public static Bookstore findByPrimaryKey(long bookstoreId)
		throws com.nabook.exception.NoSuchBookstoreException {
		return getPersistence().findByPrimaryKey(bookstoreId);
	}

	/**
	* Returns the bookstore with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookstoreId the primary key of the bookstore
	* @return the bookstore, or <code>null</code> if a bookstore with the primary key could not be found
	*/
	public static Bookstore fetchByPrimaryKey(long bookstoreId) {
		return getPersistence().fetchByPrimaryKey(bookstoreId);
	}

	public static java.util.Map<java.io.Serializable, Bookstore> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the bookstores.
	*
	* @return the bookstores
	*/
	public static List<Bookstore> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the bookstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @return the range of bookstores
	*/
	public static List<Bookstore> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bookstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bookstores
	*/
	public static List<Bookstore> findAll(int start, int end,
		OrderByComparator<Bookstore> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bookstores
	*/
	public static List<Bookstore> findAll(int start, int end,
		OrderByComparator<Bookstore> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the bookstores from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bookstores.
	*
	* @return the number of bookstores
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static BookstorePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BookstorePersistence, BookstorePersistence> _serviceTracker =
		ServiceTrackerFactory.open(BookstorePersistence.class);
}
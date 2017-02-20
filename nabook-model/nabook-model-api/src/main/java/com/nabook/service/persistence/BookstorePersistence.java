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

import com.nabook.exception.NoSuchBookstoreException;

import com.nabook.model.Bookstore;

/**
 * The persistence interface for the bookstore service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author phantoan
 * @see com.nabook.service.persistence.impl.BookstorePersistenceImpl
 * @see BookstoreUtil
 * @generated
 */
@ProviderType
public interface BookstorePersistence extends BasePersistence<Bookstore> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BookstoreUtil} to access the bookstore persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the bookstores where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching bookstores
	*/
	public java.util.List<Bookstore> findByUuid(java.lang.String uuid);

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
	public java.util.List<Bookstore> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<Bookstore> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator);

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
	public java.util.List<Bookstore> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bookstore in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public Bookstore findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException;

	/**
	* Returns the first bookstore in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator);

	/**
	* Returns the last bookstore in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public Bookstore findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException;

	/**
	* Returns the last bookstore in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator);

	/**
	* Returns the bookstores before and after the current bookstore in the ordered set where uuid = &#63;.
	*
	* @param bookstoreId the primary key of the current bookstore
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookstore
	* @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	*/
	public Bookstore[] findByUuid_PrevAndNext(long bookstoreId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException;

	/**
	* Removes all the bookstores where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of bookstores where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching bookstores
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the bookstore where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchBookstoreException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public Bookstore findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchBookstoreException;

	/**
	* Returns the bookstore where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the bookstore where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the bookstore where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the bookstore that was removed
	*/
	public Bookstore removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchBookstoreException;

	/**
	* Returns the number of bookstores where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching bookstores
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the bookstores where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching bookstores
	*/
	public java.util.List<Bookstore> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Bookstore> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Bookstore> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator);

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
	public java.util.List<Bookstore> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bookstore in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public Bookstore findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException;

	/**
	* Returns the first bookstore in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator);

	/**
	* Returns the last bookstore in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public Bookstore findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException;

	/**
	* Returns the last bookstore in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator);

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
	public Bookstore[] findByUuid_C_PrevAndNext(long bookstoreId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException;

	/**
	* Removes all the bookstores where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of bookstores where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching bookstores
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the bookstores where country = &#63; and city = &#63; and prefecture = &#63;.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @return the matching bookstores
	*/
	public java.util.List<Bookstore> findByLocation(java.lang.String country,
		java.lang.String city, java.lang.String prefecture);

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
	public java.util.List<Bookstore> findByLocation(java.lang.String country,
		java.lang.String city, java.lang.String prefecture, int start, int end);

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
	public java.util.List<Bookstore> findByLocation(java.lang.String country,
		java.lang.String city, java.lang.String prefecture, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator);

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
	public java.util.List<Bookstore> findByLocation(java.lang.String country,
		java.lang.String city, java.lang.String prefecture, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator,
		boolean retrieveFromCache);

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
	public Bookstore findByLocation_First(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException;

	/**
	* Returns the first bookstore in the ordered set where country = &#63; and city = &#63; and prefecture = &#63;.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByLocation_First(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator);

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
	public Bookstore findByLocation_Last(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException;

	/**
	* Returns the last bookstore in the ordered set where country = &#63; and city = &#63; and prefecture = &#63;.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByLocation_Last(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator);

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
	public Bookstore[] findByLocation_PrevAndNext(long bookstoreId,
		java.lang.String country, java.lang.String city,
		java.lang.String prefecture,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException;

	/**
	* Removes all the bookstores where country = &#63; and city = &#63; and prefecture = &#63; from the database.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	*/
	public void removeByLocation(java.lang.String country,
		java.lang.String city, java.lang.String prefecture);

	/**
	* Returns the number of bookstores where country = &#63; and city = &#63; and prefecture = &#63;.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @return the number of matching bookstores
	*/
	public int countByLocation(java.lang.String country, java.lang.String city,
		java.lang.String prefecture);

	/**
	* Returns the bookstore where name = &#63; or throws a {@link NoSuchBookstoreException} if it could not be found.
	*
	* @param name the name
	* @return the matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public Bookstore findByName(java.lang.String name)
		throws NoSuchBookstoreException;

	/**
	* Returns the bookstore where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByName(java.lang.String name);

	/**
	* Returns the bookstore where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByName(java.lang.String name,
		boolean retrieveFromCache);

	/**
	* Removes the bookstore where name = &#63; from the database.
	*
	* @param name the name
	* @return the bookstore that was removed
	*/
	public Bookstore removeByName(java.lang.String name)
		throws NoSuchBookstoreException;

	/**
	* Returns the number of bookstores where name = &#63;.
	*
	* @param name the name
	* @return the number of matching bookstores
	*/
	public int countByName(java.lang.String name);

	/**
	* Returns the bookstore where phone = &#63; or throws a {@link NoSuchBookstoreException} if it could not be found.
	*
	* @param phone the phone
	* @return the matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public Bookstore findByPhone(java.lang.String phone)
		throws NoSuchBookstoreException;

	/**
	* Returns the bookstore where phone = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param phone the phone
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByPhone(java.lang.String phone);

	/**
	* Returns the bookstore where phone = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param phone the phone
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByPhone(java.lang.String phone,
		boolean retrieveFromCache);

	/**
	* Removes the bookstore where phone = &#63; from the database.
	*
	* @param phone the phone
	* @return the bookstore that was removed
	*/
	public Bookstore removeByPhone(java.lang.String phone)
		throws NoSuchBookstoreException;

	/**
	* Returns the number of bookstores where phone = &#63;.
	*
	* @param phone the phone
	* @return the number of matching bookstores
	*/
	public int countByPhone(java.lang.String phone);

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
	public Bookstore findByStoreAddress(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		java.lang.String street) throws NoSuchBookstoreException;

	/**
	* Returns the bookstore where country = &#63; and city = &#63; and prefecture = &#63; and street = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param street the street
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByStoreAddress(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		java.lang.String street);

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
	public Bookstore fetchByStoreAddress(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		java.lang.String street, boolean retrieveFromCache);

	/**
	* Removes the bookstore where country = &#63; and city = &#63; and prefecture = &#63; and street = &#63; from the database.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param street the street
	* @return the bookstore that was removed
	*/
	public Bookstore removeByStoreAddress(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		java.lang.String street) throws NoSuchBookstoreException;

	/**
	* Returns the number of bookstores where country = &#63; and city = &#63; and prefecture = &#63; and street = &#63;.
	*
	* @param country the country
	* @param city the city
	* @param prefecture the prefecture
	* @param street the street
	* @return the number of matching bookstores
	*/
	public int countByStoreAddress(java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		java.lang.String street);

	/**
	* Returns all the bookstores where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching bookstores
	*/
	public java.util.List<Bookstore> findByCompanyId(long companyId);

	/**
	* Returns a range of all the bookstores where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @return the range of matching bookstores
	*/
	public java.util.List<Bookstore> findByCompanyId(long companyId, int start,
		int end);

	/**
	* Returns an ordered range of all the bookstores where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookstores
	*/
	public java.util.List<Bookstore> findByCompanyId(long companyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator);

	/**
	* Returns an ordered range of all the bookstores where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookstores
	*/
	public java.util.List<Bookstore> findByCompanyId(long companyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bookstore in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public Bookstore findByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException;

	/**
	* Returns the first bookstore in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator);

	/**
	* Returns the last bookstore in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookstore
	* @throws NoSuchBookstoreException if a matching bookstore could not be found
	*/
	public Bookstore findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException;

	/**
	* Returns the last bookstore in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public Bookstore fetchByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator);

	/**
	* Returns the bookstores before and after the current bookstore in the ordered set where companyId = &#63;.
	*
	* @param bookstoreId the primary key of the current bookstore
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookstore
	* @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	*/
	public Bookstore[] findByCompanyId_PrevAndNext(long bookstoreId,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException;

	/**
	* Removes all the bookstores where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	*/
	public void removeByCompanyId(long companyId);

	/**
	* Returns the number of bookstores where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching bookstores
	*/
	public int countByCompanyId(long companyId);

	/**
	* Caches the bookstore in the entity cache if it is enabled.
	*
	* @param bookstore the bookstore
	*/
	public void cacheResult(Bookstore bookstore);

	/**
	* Caches the bookstores in the entity cache if it is enabled.
	*
	* @param bookstores the bookstores
	*/
	public void cacheResult(java.util.List<Bookstore> bookstores);

	/**
	* Creates a new bookstore with the primary key. Does not add the bookstore to the database.
	*
	* @param bookstoreId the primary key for the new bookstore
	* @return the new bookstore
	*/
	public Bookstore create(long bookstoreId);

	/**
	* Removes the bookstore with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookstoreId the primary key of the bookstore
	* @return the bookstore that was removed
	* @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	*/
	public Bookstore remove(long bookstoreId) throws NoSuchBookstoreException;

	public Bookstore updateImpl(Bookstore bookstore);

	/**
	* Returns the bookstore with the primary key or throws a {@link NoSuchBookstoreException} if it could not be found.
	*
	* @param bookstoreId the primary key of the bookstore
	* @return the bookstore
	* @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	*/
	public Bookstore findByPrimaryKey(long bookstoreId)
		throws NoSuchBookstoreException;

	/**
	* Returns the bookstore with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookstoreId the primary key of the bookstore
	* @return the bookstore, or <code>null</code> if a bookstore with the primary key could not be found
	*/
	public Bookstore fetchByPrimaryKey(long bookstoreId);

	@Override
	public java.util.Map<java.io.Serializable, Bookstore> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the bookstores.
	*
	* @return the bookstores
	*/
	public java.util.List<Bookstore> findAll();

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
	public java.util.List<Bookstore> findAll(int start, int end);

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
	public java.util.List<Bookstore> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator);

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
	public java.util.List<Bookstore> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookstore> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the bookstores from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of bookstores.
	*
	* @return the number of bookstores
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}
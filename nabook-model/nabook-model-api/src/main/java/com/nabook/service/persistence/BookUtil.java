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

import com.nabook.model.Book;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the book service. This utility wraps {@link com.nabook.service.persistence.impl.BookPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author phantoan
 * @see BookPersistence
 * @see com.nabook.service.persistence.impl.BookPersistenceImpl
 * @generated
 */
@ProviderType
public class BookUtil {
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
	public static void clearCache(Book book) {
		getPersistence().clearCache(book);
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
	public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Book> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Book update(Book book) {
		return getPersistence().update(book);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Book update(Book book, ServiceContext serviceContext) {
		return getPersistence().update(book, serviceContext);
	}

	/**
	* Returns all the books where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching books
	*/
	public static List<Book> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the books where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @return the range of matching books
	*/
	public static List<Book> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the books where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching books
	*/
	public static List<Book> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Book> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the books where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching books
	*/
	public static List<Book> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Book> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first book in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book
	* @throws NoSuchBookException if a matching book could not be found
	*/
	public static Book findByUuid_First(java.lang.String uuid,
		OrderByComparator<Book> orderByComparator)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first book in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book, or <code>null</code> if a matching book could not be found
	*/
	public static Book fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Book> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last book in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book
	* @throws NoSuchBookException if a matching book could not be found
	*/
	public static Book findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Book> orderByComparator)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last book in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book, or <code>null</code> if a matching book could not be found
	*/
	public static Book fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Book> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the books before and after the current book in the ordered set where uuid = &#63;.
	*
	* @param bookId the primary key of the current book
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next book
	* @throws NoSuchBookException if a book with the primary key could not be found
	*/
	public static Book[] findByUuid_PrevAndNext(long bookId,
		java.lang.String uuid, OrderByComparator<Book> orderByComparator)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence()
				   .findByUuid_PrevAndNext(bookId, uuid, orderByComparator);
	}

	/**
	* Removes all the books where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of books where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching books
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the book where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchBookException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching book
	* @throws NoSuchBookException if a matching book could not be found
	*/
	public static Book findByUUID_G(java.lang.String uuid, long groupId)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching book, or <code>null</code> if a matching book could not be found
	*/
	public static Book fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching book, or <code>null</code> if a matching book could not be found
	*/
	public static Book fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the book where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the book that was removed
	*/
	public static Book removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of books where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching books
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the books where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching books
	*/
	public static List<Book> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the books where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @return the range of matching books
	*/
	public static List<Book> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the books where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching books
	*/
	public static List<Book> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Book> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the books where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching books
	*/
	public static List<Book> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Book> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book
	* @throws NoSuchBookException if a matching book could not be found
	*/
	public static Book findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Book> orderByComparator)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book, or <code>null</code> if a matching book could not be found
	*/
	public static Book fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Book> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book
	* @throws NoSuchBookException if a matching book could not be found
	*/
	public static Book findByUuid_C_Last(java.lang.String uuid, long companyId,
		OrderByComparator<Book> orderByComparator)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book, or <code>null</code> if a matching book could not be found
	*/
	public static Book fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Book> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the books before and after the current book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param bookId the primary key of the current book
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next book
	* @throws NoSuchBookException if a book with the primary key could not be found
	*/
	public static Book[] findByUuid_C_PrevAndNext(long bookId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Book> orderByComparator)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(bookId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the books where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of books where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching books
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns the book where ISBN = &#63; or throws a {@link NoSuchBookException} if it could not be found.
	*
	* @param ISBN the i s b n
	* @return the matching book
	* @throws NoSuchBookException if a matching book could not be found
	*/
	public static Book findByISBN(java.lang.String ISBN)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence().findByISBN(ISBN);
	}

	/**
	* Returns the book where ISBN = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ISBN the i s b n
	* @return the matching book, or <code>null</code> if a matching book could not be found
	*/
	public static Book fetchByISBN(java.lang.String ISBN) {
		return getPersistence().fetchByISBN(ISBN);
	}

	/**
	* Returns the book where ISBN = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ISBN the i s b n
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching book, or <code>null</code> if a matching book could not be found
	*/
	public static Book fetchByISBN(java.lang.String ISBN,
		boolean retrieveFromCache) {
		return getPersistence().fetchByISBN(ISBN, retrieveFromCache);
	}

	/**
	* Removes the book where ISBN = &#63; from the database.
	*
	* @param ISBN the i s b n
	* @return the book that was removed
	*/
	public static Book removeByISBN(java.lang.String ISBN)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence().removeByISBN(ISBN);
	}

	/**
	* Returns the number of books where ISBN = &#63;.
	*
	* @param ISBN the i s b n
	* @return the number of matching books
	*/
	public static int countByISBN(java.lang.String ISBN) {
		return getPersistence().countByISBN(ISBN);
	}

	/**
	* Returns all the books where publisher = &#63;.
	*
	* @param publisher the publisher
	* @return the matching books
	*/
	public static List<Book> findByPublisher(java.lang.String publisher) {
		return getPersistence().findByPublisher(publisher);
	}

	/**
	* Returns a range of all the books where publisher = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param publisher the publisher
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @return the range of matching books
	*/
	public static List<Book> findByPublisher(java.lang.String publisher,
		int start, int end) {
		return getPersistence().findByPublisher(publisher, start, end);
	}

	/**
	* Returns an ordered range of all the books where publisher = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param publisher the publisher
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching books
	*/
	public static List<Book> findByPublisher(java.lang.String publisher,
		int start, int end, OrderByComparator<Book> orderByComparator) {
		return getPersistence()
				   .findByPublisher(publisher, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the books where publisher = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param publisher the publisher
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching books
	*/
	public static List<Book> findByPublisher(java.lang.String publisher,
		int start, int end, OrderByComparator<Book> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByPublisher(publisher, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first book in the ordered set where publisher = &#63;.
	*
	* @param publisher the publisher
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book
	* @throws NoSuchBookException if a matching book could not be found
	*/
	public static Book findByPublisher_First(java.lang.String publisher,
		OrderByComparator<Book> orderByComparator)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence()
				   .findByPublisher_First(publisher, orderByComparator);
	}

	/**
	* Returns the first book in the ordered set where publisher = &#63;.
	*
	* @param publisher the publisher
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching book, or <code>null</code> if a matching book could not be found
	*/
	public static Book fetchByPublisher_First(java.lang.String publisher,
		OrderByComparator<Book> orderByComparator) {
		return getPersistence()
				   .fetchByPublisher_First(publisher, orderByComparator);
	}

	/**
	* Returns the last book in the ordered set where publisher = &#63;.
	*
	* @param publisher the publisher
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book
	* @throws NoSuchBookException if a matching book could not be found
	*/
	public static Book findByPublisher_Last(java.lang.String publisher,
		OrderByComparator<Book> orderByComparator)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence()
				   .findByPublisher_Last(publisher, orderByComparator);
	}

	/**
	* Returns the last book in the ordered set where publisher = &#63;.
	*
	* @param publisher the publisher
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching book, or <code>null</code> if a matching book could not be found
	*/
	public static Book fetchByPublisher_Last(java.lang.String publisher,
		OrderByComparator<Book> orderByComparator) {
		return getPersistence()
				   .fetchByPublisher_Last(publisher, orderByComparator);
	}

	/**
	* Returns the books before and after the current book in the ordered set where publisher = &#63;.
	*
	* @param bookId the primary key of the current book
	* @param publisher the publisher
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next book
	* @throws NoSuchBookException if a book with the primary key could not be found
	*/
	public static Book[] findByPublisher_PrevAndNext(long bookId,
		java.lang.String publisher, OrderByComparator<Book> orderByComparator)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence()
				   .findByPublisher_PrevAndNext(bookId, publisher,
			orderByComparator);
	}

	/**
	* Removes all the books where publisher = &#63; from the database.
	*
	* @param publisher the publisher
	*/
	public static void removeByPublisher(java.lang.String publisher) {
		getPersistence().removeByPublisher(publisher);
	}

	/**
	* Returns the number of books where publisher = &#63;.
	*
	* @param publisher the publisher
	* @return the number of matching books
	*/
	public static int countByPublisher(java.lang.String publisher) {
		return getPersistence().countByPublisher(publisher);
	}

	/**
	* Caches the book in the entity cache if it is enabled.
	*
	* @param book the book
	*/
	public static void cacheResult(Book book) {
		getPersistence().cacheResult(book);
	}

	/**
	* Caches the books in the entity cache if it is enabled.
	*
	* @param books the books
	*/
	public static void cacheResult(List<Book> books) {
		getPersistence().cacheResult(books);
	}

	/**
	* Creates a new book with the primary key. Does not add the book to the database.
	*
	* @param bookId the primary key for the new book
	* @return the new book
	*/
	public static Book create(long bookId) {
		return getPersistence().create(bookId);
	}

	/**
	* Removes the book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the book
	* @return the book that was removed
	* @throws NoSuchBookException if a book with the primary key could not be found
	*/
	public static Book remove(long bookId)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence().remove(bookId);
	}

	public static Book updateImpl(Book book) {
		return getPersistence().updateImpl(book);
	}

	/**
	* Returns the book with the primary key or throws a {@link NoSuchBookException} if it could not be found.
	*
	* @param bookId the primary key of the book
	* @return the book
	* @throws NoSuchBookException if a book with the primary key could not be found
	*/
	public static Book findByPrimaryKey(long bookId)
		throws com.nabook.exception.NoSuchBookException {
		return getPersistence().findByPrimaryKey(bookId);
	}

	/**
	* Returns the book with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookId the primary key of the book
	* @return the book, or <code>null</code> if a book with the primary key could not be found
	*/
	public static Book fetchByPrimaryKey(long bookId) {
		return getPersistence().fetchByPrimaryKey(bookId);
	}

	public static java.util.Map<java.io.Serializable, Book> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the books.
	*
	* @return the books
	*/
	public static List<Book> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @return the range of books
	*/
	public static List<Book> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of books
	*/
	public static List<Book> findAll(int start, int end,
		OrderByComparator<Book> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of books
	*/
	public static List<Book> findAll(int start, int end,
		OrderByComparator<Book> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the books from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of books.
	*
	* @return the number of books
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	/**
	* Returns the primaryKeys of authors associated with the book.
	*
	* @param pk the primary key of the book
	* @return long[] of the primaryKeys of authors associated with the book
	*/
	public static long[] getAuthorPrimaryKeys(long pk) {
		return getPersistence().getAuthorPrimaryKeys(pk);
	}

	/**
	* Returns all the authors associated with the book.
	*
	* @param pk the primary key of the book
	* @return the authors associated with the book
	*/
	public static List<com.nabook.model.Author> getAuthors(long pk) {
		return getPersistence().getAuthors(pk);
	}

	/**
	* Returns a range of all the authors associated with the book.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the book
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @return the range of authors associated with the book
	*/
	public static List<com.nabook.model.Author> getAuthors(long pk, int start,
		int end) {
		return getPersistence().getAuthors(pk, start, end);
	}

	/**
	* Returns an ordered range of all the authors associated with the book.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the book
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of authors associated with the book
	*/
	public static List<com.nabook.model.Author> getAuthors(long pk, int start,
		int end, OrderByComparator<com.nabook.model.Author> orderByComparator) {
		return getPersistence().getAuthors(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of authors associated with the book.
	*
	* @param pk the primary key of the book
	* @return the number of authors associated with the book
	*/
	public static int getAuthorsSize(long pk) {
		return getPersistence().getAuthorsSize(pk);
	}

	/**
	* Returns <code>true</code> if the author is associated with the book.
	*
	* @param pk the primary key of the book
	* @param authorPK the primary key of the author
	* @return <code>true</code> if the author is associated with the book; <code>false</code> otherwise
	*/
	public static boolean containsAuthor(long pk, long authorPK) {
		return getPersistence().containsAuthor(pk, authorPK);
	}

	/**
	* Returns <code>true</code> if the book has any authors associated with it.
	*
	* @param pk the primary key of the book to check for associations with authors
	* @return <code>true</code> if the book has any authors associated with it; <code>false</code> otherwise
	*/
	public static boolean containsAuthors(long pk) {
		return getPersistence().containsAuthors(pk);
	}

	/**
	* Adds an association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authorPK the primary key of the author
	*/
	public static void addAuthor(long pk, long authorPK) {
		getPersistence().addAuthor(pk, authorPK);
	}

	/**
	* Adds an association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param author the author
	*/
	public static void addAuthor(long pk, com.nabook.model.Author author) {
		getPersistence().addAuthor(pk, author);
	}

	/**
	* Adds an association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authorPKs the primary keys of the authors
	*/
	public static void addAuthors(long pk, long[] authorPKs) {
		getPersistence().addAuthors(pk, authorPKs);
	}

	/**
	* Adds an association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authors the authors
	*/
	public static void addAuthors(long pk, List<com.nabook.model.Author> authors) {
		getPersistence().addAuthors(pk, authors);
	}

	/**
	* Clears all associations between the book and its authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book to clear the associated authors from
	*/
	public static void clearAuthors(long pk) {
		getPersistence().clearAuthors(pk);
	}

	/**
	* Removes the association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authorPK the primary key of the author
	*/
	public static void removeAuthor(long pk, long authorPK) {
		getPersistence().removeAuthor(pk, authorPK);
	}

	/**
	* Removes the association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param author the author
	*/
	public static void removeAuthor(long pk, com.nabook.model.Author author) {
		getPersistence().removeAuthor(pk, author);
	}

	/**
	* Removes the association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authorPKs the primary keys of the authors
	*/
	public static void removeAuthors(long pk, long[] authorPKs) {
		getPersistence().removeAuthors(pk, authorPKs);
	}

	/**
	* Removes the association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authors the authors
	*/
	public static void removeAuthors(long pk,
		List<com.nabook.model.Author> authors) {
		getPersistence().removeAuthors(pk, authors);
	}

	/**
	* Sets the authors associated with the book, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authorPKs the primary keys of the authors to be associated with the book
	*/
	public static void setAuthors(long pk, long[] authorPKs) {
		getPersistence().setAuthors(pk, authorPKs);
	}

	/**
	* Sets the authors associated with the book, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authors the authors to be associated with the book
	*/
	public static void setAuthors(long pk, List<com.nabook.model.Author> authors) {
		getPersistence().setAuthors(pk, authors);
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static BookPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BookPersistence, BookPersistence> _serviceTracker =
		ServiceTrackerFactory.open(BookPersistence.class);
}
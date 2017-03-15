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

package com.nabook.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Book. This utility wraps
 * {@link com.nabook.service.impl.BookLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author phantoan
 * @see BookLocalService
 * @see com.nabook.service.base.BookLocalServiceBaseImpl
 * @see com.nabook.service.impl.BookLocalServiceImpl
 * @generated
 */
@ProviderType
public class BookLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.nabook.service.impl.BookLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean hasAuthorBook(long authorId, long bookId) {
		return getService().hasAuthorBook(authorId, bookId);
	}

	public static boolean hasAuthorBooks(long authorId) {
		return getService().hasAuthorBooks(authorId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static com.nabook.model.Book addBook(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, java.lang.String isbn, java.lang.String title,
		java.lang.String subtitle, java.lang.String edition,
		java.lang.String volume, java.lang.String publisher,
		java.util.Date pubDate, java.lang.String price,
		java.lang.String description, java.sql.Blob thumbnail,
		java.sql.Blob sample)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addBook(serviceContext, userId, isbn, title, subtitle,
			edition, volume, publisher, pubDate, price, description, thumbnail,
			sample);
	}

	/**
	* Adds the book to the database. Also notifies the appropriate model listeners.
	*
	* @param book the book
	* @return the book that was added
	*/
	public static com.nabook.model.Book addBook(com.nabook.model.Book book) {
		return getService().addBook(book);
	}

	/**
	* Creates a new book with the primary key. Does not add the book to the database.
	*
	* @param bookId the primary key for the new book
	* @return the new book
	*/
	public static com.nabook.model.Book createBook(long bookId) {
		return getService().createBook(bookId);
	}

	/**
	* Deletes the book from the database. Also notifies the appropriate model listeners.
	*
	* @param book the book
	* @return the book that was removed
	*/
	public static com.nabook.model.Book deleteBook(com.nabook.model.Book book) {
		return getService().deleteBook(book);
	}

	/**
	* Deletes the book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the book
	* @return the book that was removed
	* @throws PortalException if a book with the primary key could not be found
	* @throws SystemException
	*/
	public static com.nabook.model.Book deleteBook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBook(bookId);
	}

	public static com.nabook.model.Book fetchBook(long bookId) {
		return getService().fetchBook(bookId);
	}

	/**
	* Returns the book matching the UUID and group.
	*
	* @param uuid the book's UUID
	* @param groupId the primary key of the group
	* @return the matching book, or <code>null</code> if a matching book could not be found
	*/
	public static com.nabook.model.Book fetchBookByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchBookByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the book with the primary key.
	*
	* @param bookId the primary key of the book
	* @return the book
	* @throws PortalException if a book with the primary key could not be found
	*/
	public static com.nabook.model.Book getBook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getBook(bookId);
	}

	/**
	* Returns the book matching the UUID and group.
	*
	* @param uuid the book's UUID
	* @param groupId the primary key of the group
	* @return the matching book
	* @throws PortalException if a matching book could not be found
	*/
	public static com.nabook.model.Book getBookByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getBookByUuidAndGroupId(uuid, groupId);
	}

	public static com.nabook.model.Book updateBook(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, long bookId, java.lang.String isbn,
		java.lang.String title, java.lang.String subtitle,
		java.lang.String edition, java.lang.String volume,
		java.lang.String publisher, java.util.Date pubDate,
		java.lang.String price, java.lang.String description,
		java.sql.Blob thumbnail, java.sql.Blob sample)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateBook(serviceContext, userId, bookId, isbn, title,
			subtitle, edition, volume, publisher, pubDate, price, description,
			thumbnail, sample);
	}

	/**
	* Updates the book in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param book the book
	* @return the book that was updated
	*/
	public static com.nabook.model.Book updateBook(com.nabook.model.Book book) {
		return getService().updateBook(book);
	}

	public static com.nabook.model.BookSampleBlobModel getSampleBlobModel(
		java.io.Serializable primaryKey) {
		return getService().getSampleBlobModel(primaryKey);
	}

	public static com.nabook.model.BookThumbnailBlobModel getThumbnailBlobModel(
		java.io.Serializable primaryKey) {
		return getService().getThumbnailBlobModel(primaryKey);
	}

	public static int countAllBook()
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookException {
		return getService().countAllBook();
	}

	public static int getAuthorBooksCount(long authorId) {
		return getService().getAuthorBooksCount(authorId);
	}

	/**
	* Returns the number of books.
	*
	* @return the number of books
	*/
	public static int getBooksCount() {
		return getService().getBooksCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.nabook.model.Book> getAllBooks()
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookException {
		return getService().getAllBooks();
	}

	public static java.util.List<com.nabook.model.Book> getAllBooks(int start,
		int end)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookException {
		return getService().getAllBooks(start, end);
	}

	public static java.util.List<com.nabook.model.Book> getAuthorBooks(
		long authorId) {
		return getService().getAuthorBooks(authorId);
	}

	public static java.util.List<com.nabook.model.Book> getAuthorBooks(
		long authorId, int start, int end) {
		return getService().getAuthorBooks(authorId, start, end);
	}

	public static java.util.List<com.nabook.model.Book> getAuthorBooks(
		long authorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.Book> orderByComparator) {
		return getService()
				   .getAuthorBooks(authorId, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @return the range of books
	*/
	public static java.util.List<com.nabook.model.Book> getBooks(int start,
		int end) {
		return getService().getBooks(start, end);
	}

	/**
	* Returns all the books matching the UUID and company.
	*
	* @param uuid the UUID of the books
	* @param companyId the primary key of the company
	* @return the matching books, or an empty list if no matches were found
	*/
	public static java.util.List<com.nabook.model.Book> getBooksByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getBooksByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of books matching the UUID and company.
	*
	* @param uuid the UUID of the books
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of books
	* @param end the upper bound of the range of books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching books, or an empty list if no matches were found
	*/
	public static java.util.List<com.nabook.model.Book> getBooksByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.Book> orderByComparator) {
		return getService()
				   .getBooksByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	public static java.util.List<com.nabook.model.Book> search(long companyId,
		java.lang.String keywords)
		throws com.liferay.portal.kernel.search.SearchException {
		return getService().search(companyId, keywords);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Returns the authorIds of the authors associated with the book.
	*
	* @param bookId the bookId of the book
	* @return long[] the authorIds of authors associated with the book
	*/
	public static long[] getAuthorPrimaryKeys(long bookId) {
		return getService().getAuthorPrimaryKeys(bookId);
	}

	public static void addAuthorBook(long authorId, com.nabook.model.Book book) {
		getService().addAuthorBook(authorId, book);
	}

	public static void addAuthorBook(long authorId, long bookId) {
		getService().addAuthorBook(authorId, bookId);
	}

	public static void addAuthorBooks(long authorId,
		java.util.List<com.nabook.model.Book> books) {
		getService().addAuthorBooks(authorId, books);
	}

	public static void addAuthorBooks(long authorId, long[] bookIds) {
		getService().addAuthorBooks(authorId, bookIds);
	}

	public static void clearAuthorBooks(long authorId) {
		getService().clearAuthorBooks(authorId);
	}

	public static void deleteAuthorBook(long authorId,
		com.nabook.model.Book book) {
		getService().deleteAuthorBook(authorId, book);
	}

	public static void deleteAuthorBook(long authorId, long bookId) {
		getService().deleteAuthorBook(authorId, bookId);
	}

	public static void deleteAuthorBooks(long authorId,
		java.util.List<com.nabook.model.Book> books) {
		getService().deleteAuthorBooks(authorId, books);
	}

	public static void deleteAuthorBooks(long authorId, long[] bookIds) {
		getService().deleteAuthorBooks(authorId, bookIds);
	}

	public static void setAuthorBooks(long authorId, long[] bookIds) {
		getService().setAuthorBooks(authorId, bookIds);
	}

	public static BookLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BookLocalService, BookLocalService> _serviceTracker =
		ServiceTrackerFactory.open(BookLocalService.class);
}
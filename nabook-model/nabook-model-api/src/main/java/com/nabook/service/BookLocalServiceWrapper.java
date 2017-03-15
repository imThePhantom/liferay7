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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BookLocalService}.
 *
 * @author phantoan
 * @see BookLocalService
 * @generated
 */
@ProviderType
public class BookLocalServiceWrapper implements BookLocalService,
	ServiceWrapper<BookLocalService> {
	public BookLocalServiceWrapper(BookLocalService bookLocalService) {
		_bookLocalService = bookLocalService;
	}

	@Override
	public boolean hasAuthorBook(long authorId, long bookId) {
		return _bookLocalService.hasAuthorBook(authorId, bookId);
	}

	@Override
	public boolean hasAuthorBooks(long authorId) {
		return _bookLocalService.hasAuthorBooks(authorId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _bookLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bookLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _bookLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _bookLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nabook.model.Book addBook(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, java.lang.String isbn, java.lang.String title,
		java.lang.String subtitle, java.lang.String edition,
		java.lang.String volume, java.lang.String publisher,
		java.util.Date pubDate, java.lang.String price,
		java.lang.String description, java.sql.Blob thumbnail,
		java.sql.Blob sample)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookLocalService.addBook(serviceContext, userId, isbn, title,
			subtitle, edition, volume, publisher, pubDate, price, description,
			thumbnail, sample);
	}

	/**
	* Adds the book to the database. Also notifies the appropriate model listeners.
	*
	* @param book the book
	* @return the book that was added
	*/
	@Override
	public com.nabook.model.Book addBook(com.nabook.model.Book book) {
		return _bookLocalService.addBook(book);
	}

	/**
	* Creates a new book with the primary key. Does not add the book to the database.
	*
	* @param bookId the primary key for the new book
	* @return the new book
	*/
	@Override
	public com.nabook.model.Book createBook(long bookId) {
		return _bookLocalService.createBook(bookId);
	}

	/**
	* Deletes the book from the database. Also notifies the appropriate model listeners.
	*
	* @param book the book
	* @return the book that was removed
	*/
	@Override
	public com.nabook.model.Book deleteBook(com.nabook.model.Book book) {
		return _bookLocalService.deleteBook(book);
	}

	/**
	* Deletes the book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the book
	* @return the book that was removed
	* @throws PortalException if a book with the primary key could not be found
	* @throws SystemException
	*/
	@Override
	public com.nabook.model.Book deleteBook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookLocalService.deleteBook(bookId);
	}

	@Override
	public com.nabook.model.Book fetchBook(long bookId) {
		return _bookLocalService.fetchBook(bookId);
	}

	/**
	* Returns the book matching the UUID and group.
	*
	* @param uuid the book's UUID
	* @param groupId the primary key of the group
	* @return the matching book, or <code>null</code> if a matching book could not be found
	*/
	@Override
	public com.nabook.model.Book fetchBookByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _bookLocalService.fetchBookByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the book with the primary key.
	*
	* @param bookId the primary key of the book
	* @return the book
	* @throws PortalException if a book with the primary key could not be found
	*/
	@Override
	public com.nabook.model.Book getBook(long bookId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookLocalService.getBook(bookId);
	}

	/**
	* Returns the book matching the UUID and group.
	*
	* @param uuid the book's UUID
	* @param groupId the primary key of the group
	* @return the matching book
	* @throws PortalException if a matching book could not be found
	*/
	@Override
	public com.nabook.model.Book getBookByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookLocalService.getBookByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.nabook.model.Book updateBook(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, long bookId, java.lang.String isbn,
		java.lang.String title, java.lang.String subtitle,
		java.lang.String edition, java.lang.String volume,
		java.lang.String publisher, java.util.Date pubDate,
		java.lang.String price, java.lang.String description,
		java.sql.Blob thumbnail, java.sql.Blob sample)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookLocalService.updateBook(serviceContext, userId, bookId,
			isbn, title, subtitle, edition, volume, publisher, pubDate, price,
			description, thumbnail, sample);
	}

	/**
	* Updates the book in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param book the book
	* @return the book that was updated
	*/
	@Override
	public com.nabook.model.Book updateBook(com.nabook.model.Book book) {
		return _bookLocalService.updateBook(book);
	}

	@Override
	public com.nabook.model.BookSampleBlobModel getSampleBlobModel(
		java.io.Serializable primaryKey) {
		return _bookLocalService.getSampleBlobModel(primaryKey);
	}

	@Override
	public com.nabook.model.BookThumbnailBlobModel getThumbnailBlobModel(
		java.io.Serializable primaryKey) {
		return _bookLocalService.getThumbnailBlobModel(primaryKey);
	}

	@Override
	public int countAllBook()
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookException {
		return _bookLocalService.countAllBook();
	}

	@Override
	public int getAuthorBooksCount(long authorId) {
		return _bookLocalService.getAuthorBooksCount(authorId);
	}

	/**
	* Returns the number of books.
	*
	* @return the number of books
	*/
	@Override
	public int getBooksCount() {
		return _bookLocalService.getBooksCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _bookLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _bookLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _bookLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _bookLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.nabook.model.Book> getAllBooks()
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookException {
		return _bookLocalService.getAllBooks();
	}

	@Override
	public java.util.List<com.nabook.model.Book> getAllBooks(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookException {
		return _bookLocalService.getAllBooks(start, end);
	}

	@Override
	public java.util.List<com.nabook.model.Book> getAuthorBooks(long authorId) {
		return _bookLocalService.getAuthorBooks(authorId);
	}

	@Override
	public java.util.List<com.nabook.model.Book> getAuthorBooks(long authorId,
		int start, int end) {
		return _bookLocalService.getAuthorBooks(authorId, start, end);
	}

	@Override
	public java.util.List<com.nabook.model.Book> getAuthorBooks(long authorId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.Book> orderByComparator) {
		return _bookLocalService.getAuthorBooks(authorId, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<com.nabook.model.Book> getBooks(int start, int end) {
		return _bookLocalService.getBooks(start, end);
	}

	/**
	* Returns all the books matching the UUID and company.
	*
	* @param uuid the UUID of the books
	* @param companyId the primary key of the company
	* @return the matching books, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.nabook.model.Book> getBooksByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _bookLocalService.getBooksByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.nabook.model.Book> getBooksByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.Book> orderByComparator) {
		return _bookLocalService.getBooksByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.nabook.model.Book> search(long companyId,
		java.lang.String keywords)
		throws com.liferay.portal.kernel.search.SearchException {
		return _bookLocalService.search(companyId, keywords);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _bookLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _bookLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Returns the authorIds of the authors associated with the book.
	*
	* @param bookId the bookId of the book
	* @return long[] the authorIds of authors associated with the book
	*/
	@Override
	public long[] getAuthorPrimaryKeys(long bookId) {
		return _bookLocalService.getAuthorPrimaryKeys(bookId);
	}

	@Override
	public void addAuthorBook(long authorId, com.nabook.model.Book book) {
		_bookLocalService.addAuthorBook(authorId, book);
	}

	@Override
	public void addAuthorBook(long authorId, long bookId) {
		_bookLocalService.addAuthorBook(authorId, bookId);
	}

	@Override
	public void addAuthorBooks(long authorId,
		java.util.List<com.nabook.model.Book> books) {
		_bookLocalService.addAuthorBooks(authorId, books);
	}

	@Override
	public void addAuthorBooks(long authorId, long[] bookIds) {
		_bookLocalService.addAuthorBooks(authorId, bookIds);
	}

	@Override
	public void clearAuthorBooks(long authorId) {
		_bookLocalService.clearAuthorBooks(authorId);
	}

	@Override
	public void deleteAuthorBook(long authorId, com.nabook.model.Book book) {
		_bookLocalService.deleteAuthorBook(authorId, book);
	}

	@Override
	public void deleteAuthorBook(long authorId, long bookId) {
		_bookLocalService.deleteAuthorBook(authorId, bookId);
	}

	@Override
	public void deleteAuthorBooks(long authorId,
		java.util.List<com.nabook.model.Book> books) {
		_bookLocalService.deleteAuthorBooks(authorId, books);
	}

	@Override
	public void deleteAuthorBooks(long authorId, long[] bookIds) {
		_bookLocalService.deleteAuthorBooks(authorId, bookIds);
	}

	@Override
	public void setAuthorBooks(long authorId, long[] bookIds) {
		_bookLocalService.setAuthorBooks(authorId, bookIds);
	}

	@Override
	public BookLocalService getWrappedService() {
		return _bookLocalService;
	}

	@Override
	public void setWrappedService(BookLocalService bookLocalService) {
		_bookLocalService = bookLocalService;
	}

	private BookLocalService _bookLocalService;
}
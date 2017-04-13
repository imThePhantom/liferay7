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
 * Provides a wrapper for {@link AuthorLocalService}.
 *
 * @author phantoan
 * @see AuthorLocalService
 * @generated
 */
@ProviderType
public class AuthorLocalServiceWrapper implements AuthorLocalService,
	ServiceWrapper<AuthorLocalService> {
	public AuthorLocalServiceWrapper(AuthorLocalService authorLocalService) {
		_authorLocalService = authorLocalService;
	}

	@Override
	public boolean hasBookAuthor(long bookId, long authorId) {
		return _authorLocalService.hasBookAuthor(bookId, authorId);
	}

	@Override
	public boolean hasBookAuthors(long bookId) {
		return _authorLocalService.hasBookAuthors(bookId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _authorLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _authorLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _authorLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _authorLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _authorLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _authorLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nabook.model.Author addAuthor(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, java.lang.String fullName, java.lang.String profile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.addAuthor(serviceContext, userId, fullName,
			profile);
	}

	/**
	* Adds the author to the database. Also notifies the appropriate model listeners.
	*
	* @param author the author
	* @return the author that was added
	*/
	@Override
	public com.nabook.model.Author addAuthor(com.nabook.model.Author author) {
		return _authorLocalService.addAuthor(author);
	}

	/**
	* Creates a new author with the primary key. Does not add the author to the database.
	*
	* @param authorId the primary key for the new author
	* @return the new author
	*/
	@Override
	public com.nabook.model.Author createAuthor(long authorId) {
		return _authorLocalService.createAuthor(authorId);
	}

	/**
	* Deletes the author from the database. Also notifies the appropriate model listeners.
	*
	* @param author the author
	* @return the author that was removed
	*/
	@Override
	public com.nabook.model.Author deleteAuthor(com.nabook.model.Author author) {
		return _authorLocalService.deleteAuthor(author);
	}

	/**
	* Deletes the author with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param authorId the primary key of the author
	* @return the author that was removed
	* @throws PortalException if a author with the primary key could not be found
	* @throws SystemException
	*/
	@Override
	public com.nabook.model.Author deleteAuthor(long authorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.deleteAuthor(authorId);
	}

	@Override
	public com.nabook.model.Author fetchAuthor(long authorId) {
		return _authorLocalService.fetchAuthor(authorId);
	}

	/**
	* Returns the author matching the UUID and group.
	*
	* @param uuid the author's UUID
	* @param groupId the primary key of the group
	* @return the matching author, or <code>null</code> if a matching author could not be found
	*/
	@Override
	public com.nabook.model.Author fetchAuthorByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _authorLocalService.fetchAuthorByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the author with the primary key.
	*
	* @param authorId the primary key of the author
	* @return the author
	* @throws PortalException if a author with the primary key could not be found
	*/
	@Override
	public com.nabook.model.Author getAuthor(long authorId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _authorLocalService.getAuthor(authorId);
	}

	/**
	* Returns the author matching the UUID and group.
	*
	* @param uuid the author's UUID
	* @param groupId the primary key of the group
	* @return the matching author
	* @throws PortalException if a matching author could not be found
	*/
	@Override
	public com.nabook.model.Author getAuthorByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _authorLocalService.getAuthorByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.nabook.model.Author updateAuthor(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, long authorId, java.lang.String fullName,
		java.lang.String profile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.updateAuthor(serviceContext, userId,
			authorId, fullName, profile);
	}

	/**
	* Updates the author in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param author the author
	* @return the author that was updated
	*/
	@Override
	public com.nabook.model.Author updateAuthor(com.nabook.model.Author author) {
		return _authorLocalService.updateAuthor(author);
	}

	@Override
	public int countAllAuthor()
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException {
		return _authorLocalService.countAllAuthor();
	}

	/**
	* Returns the number of authors.
	*
	* @return the number of authors
	*/
	@Override
	public int getAuthorsCount() {
		return _authorLocalService.getAuthorsCount();
	}

	@Override
	public int getBookAuthorsCount(long bookId) {
		return _authorLocalService.getBookAuthorsCount(bookId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _authorLocalService.getOSGiServiceIdentifier();
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
		return _authorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _authorLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _authorLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.nabook.model.Author> getAllAuthors()
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException {
		return _authorLocalService.getAllAuthors();
	}

	@Override
	public java.util.List<com.nabook.model.Author> getAllAuthors(int start,
		int end)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException {
		return _authorLocalService.getAllAuthors(start, end);
	}

	/**
	* Returns a range of all the authors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of authors
	* @param end the upper bound of the range of authors (not inclusive)
	* @return the range of authors
	*/
	@Override
	public java.util.List<com.nabook.model.Author> getAuthors(int start, int end) {
		return _authorLocalService.getAuthors(start, end);
	}

	/**
	* Returns all the authors matching the UUID and company.
	*
	* @param uuid the UUID of the authors
	* @param companyId the primary key of the company
	* @return the matching authors, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.nabook.model.Author> getAuthorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _authorLocalService.getAuthorsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of authors matching the UUID and company.
	*
	* @param uuid the UUID of the authors
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of authors
	* @param end the upper bound of the range of authors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching authors, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.nabook.model.Author> getAuthorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.Author> orderByComparator) {
		return _authorLocalService.getAuthorsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.nabook.model.Author> getBookAuthors(long bookId) {
		return _authorLocalService.getBookAuthors(bookId);
	}

	@Override
	public java.util.List<com.nabook.model.Author> getBookAuthors(long bookId,
		int start, int end) {
		return _authorLocalService.getBookAuthors(bookId, start, end);
	}

	@Override
	public java.util.List<com.nabook.model.Author> getBookAuthors(long bookId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.Author> orderByComparator) {
		return _authorLocalService.getBookAuthors(bookId, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.nabook.model.Book> getBooksByAuthor(long authorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException,
			com.nabook.exception.NoSuchBookException {
		return _authorLocalService.getBooksByAuthor(authorId);
	}

	@Override
	public java.util.List<com.nabook.model.Author> search(long companyId,
		java.lang.String keywords)
		throws com.liferay.portal.kernel.search.SearchException {
		return _authorLocalService.search(companyId, keywords);
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
		return _authorLocalService.dynamicQueryCount(dynamicQuery);
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
		return _authorLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Returns the bookIds of the books associated with the author.
	*
	* @param authorId the authorId of the author
	* @return long[] the bookIds of books associated with the author
	*/
	@Override
	public long[] getBookPrimaryKeys(long authorId) {
		return _authorLocalService.getBookPrimaryKeys(authorId);
	}

	@Override
	public void addBookAuthor(long bookId, com.nabook.model.Author author) {
		_authorLocalService.addBookAuthor(bookId, author);
	}

	@Override
	public void addBookAuthor(long bookId, long authorId) {
		_authorLocalService.addBookAuthor(bookId, authorId);
	}

	@Override
	public void addBookAuthors(long bookId,
		java.util.List<com.nabook.model.Author> authors) {
		_authorLocalService.addBookAuthors(bookId, authors);
	}

	@Override
	public void addBookAuthors(long bookId, long[] authorIds) {
		_authorLocalService.addBookAuthors(bookId, authorIds);
	}

	@Override
	public void clearBookAuthors(long bookId) {
		_authorLocalService.clearBookAuthors(bookId);
	}

	@Override
	public void deleteBookAuthor(long bookId, com.nabook.model.Author author) {
		_authorLocalService.deleteBookAuthor(bookId, author);
	}

	@Override
	public void deleteBookAuthor(long bookId, long authorId) {
		_authorLocalService.deleteBookAuthor(bookId, authorId);
	}

	@Override
	public void deleteBookAuthors(long bookId,
		java.util.List<com.nabook.model.Author> authors) {
		_authorLocalService.deleteBookAuthors(bookId, authors);
	}

	@Override
	public void deleteBookAuthors(long bookId, long[] authorIds) {
		_authorLocalService.deleteBookAuthors(bookId, authorIds);
	}

	@Override
	public void setBookAuthors(long bookId, long[] authorIds) {
		_authorLocalService.setBookAuthors(bookId, authorIds);
	}

	@Override
	public AuthorLocalService getWrappedService() {
		return _authorLocalService;
	}

	@Override
	public void setWrappedService(AuthorLocalService authorLocalService) {
		_authorLocalService = authorLocalService;
	}

	private AuthorLocalService _authorLocalService;
}
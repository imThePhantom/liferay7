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
 * Provides a wrapper for {@link BookstoreLocalService}.
 *
 * @author phantoan
 * @see BookstoreLocalService
 * @generated
 */
@ProviderType
public class BookstoreLocalServiceWrapper implements BookstoreLocalService,
	ServiceWrapper<BookstoreLocalService> {
	public BookstoreLocalServiceWrapper(
		BookstoreLocalService bookstoreLocalService) {
		_bookstoreLocalService = bookstoreLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _bookstoreLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bookstoreLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _bookstoreLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _bookstoreLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookstoreLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookstoreLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nabook.model.Bookstore addBookstore(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, java.lang.String name, java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		java.lang.String street, java.lang.String zip, java.lang.String phone)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookstoreLocalService.addBookstore(serviceContext, userId,
			name, country, city, prefecture, street, zip, phone);
	}

	/**
	* Adds the bookstore to the database. Also notifies the appropriate model listeners.
	*
	* @param bookstore the bookstore
	* @return the bookstore that was added
	*/
	@Override
	public com.nabook.model.Bookstore addBookstore(
		com.nabook.model.Bookstore bookstore) {
		return _bookstoreLocalService.addBookstore(bookstore);
	}

	/**
	* Creates a new bookstore with the primary key. Does not add the bookstore to the database.
	*
	* @param bookstoreId the primary key for the new bookstore
	* @return the new bookstore
	*/
	@Override
	public com.nabook.model.Bookstore createBookstore(long bookstoreId) {
		return _bookstoreLocalService.createBookstore(bookstoreId);
	}

	@Override
	public com.nabook.model.Bookstore deleteBookstore(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long bookstoreId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookstoreLocalService.deleteBookstore(serviceContext,
			bookstoreId);
	}

	/**
	* Deletes the bookstore from the database. Also notifies the appropriate model listeners.
	*
	* @param bookstore the bookstore
	* @return the bookstore that was removed
	*/
	@Override
	public com.nabook.model.Bookstore deleteBookstore(
		com.nabook.model.Bookstore bookstore) {
		return _bookstoreLocalService.deleteBookstore(bookstore);
	}

	/**
	* Deletes the bookstore with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookstoreId the primary key of the bookstore
	* @return the bookstore that was removed
	* @throws PortalException if a bookstore with the primary key could not be found
	*/
	@Override
	public com.nabook.model.Bookstore deleteBookstore(long bookstoreId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookstoreLocalService.deleteBookstore(bookstoreId);
	}

	@Override
	public com.nabook.model.Bookstore fetchBookstore(long bookstoreId) {
		return _bookstoreLocalService.fetchBookstore(bookstoreId);
	}

	/**
	* Returns the bookstore matching the UUID and group.
	*
	* @param uuid the bookstore's UUID
	* @param groupId the primary key of the group
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	@Override
	public com.nabook.model.Bookstore fetchBookstoreByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _bookstoreLocalService.fetchBookstoreByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the bookstore with the primary key.
	*
	* @param bookstoreId the primary key of the bookstore
	* @return the bookstore
	* @throws PortalException if a bookstore with the primary key could not be found
	*/
	@Override
	public com.nabook.model.Bookstore getBookstore(long bookstoreId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookstoreLocalService.getBookstore(bookstoreId);
	}

	/**
	* Returns the bookstore matching the UUID and group.
	*
	* @param uuid the bookstore's UUID
	* @param groupId the primary key of the group
	* @return the matching bookstore
	* @throws PortalException if a matching bookstore could not be found
	*/
	@Override
	public com.nabook.model.Bookstore getBookstoreByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookstoreLocalService.getBookstoreByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.nabook.model.Bookstore updateBookstore(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, long bookstoreId, java.lang.String name,
		java.lang.String country, java.lang.String city,
		java.lang.String prefecture, java.lang.String street,
		java.lang.String zip, java.lang.String phone)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bookstoreLocalService.updateBookstore(serviceContext, userId,
			bookstoreId, name, country, city, prefecture, street, zip, phone);
	}

	/**
	* Updates the bookstore in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bookstore the bookstore
	* @return the bookstore that was updated
	*/
	@Override
	public com.nabook.model.Bookstore updateBookstore(
		com.nabook.model.Bookstore bookstore) {
		return _bookstoreLocalService.updateBookstore(bookstore);
	}

	@Override
	public int countBookstores(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookstoreException {
		return _bookstoreLocalService.countBookstores(companyId);
	}

	/**
	* Returns the number of bookstores.
	*
	* @return the number of bookstores
	*/
	@Override
	public int getBookstoresCount() {
		return _bookstoreLocalService.getBookstoresCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _bookstoreLocalService.getOSGiServiceIdentifier();
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
		return _bookstoreLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bookstoreLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bookstoreLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.nabook.model.Bookstore> getAllBookstores(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookstoreException {
		return _bookstoreLocalService.getAllBookstores(companyId);
	}

	@Override
	public java.util.List<com.nabook.model.Bookstore> getAllBookstores(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookstoreException {
		return _bookstoreLocalService.getAllBookstores(companyId, start, end);
	}

	/**
	* Returns a range of all the bookstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @return the range of bookstores
	*/
	@Override
	public java.util.List<com.nabook.model.Bookstore> getBookstores(int start,
		int end) {
		return _bookstoreLocalService.getBookstores(start, end);
	}

	@Override
	public java.util.List<com.nabook.model.Bookstore> getBookstoresByLocation(
		java.lang.String country, java.lang.String city,
		java.lang.String prefecture)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookstoreException {
		return _bookstoreLocalService.getBookstoresByLocation(country, city,
			prefecture);
	}

	@Override
	public java.util.List<com.nabook.model.Bookstore> getBookstoresByLocation(
		java.lang.String country, java.lang.String city,
		java.lang.String prefecture, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookstoreException {
		return _bookstoreLocalService.getBookstoresByLocation(country, city,
			prefecture, start, end);
	}

	/**
	* Returns all the bookstores matching the UUID and company.
	*
	* @param uuid the UUID of the bookstores
	* @param companyId the primary key of the company
	* @return the matching bookstores, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.nabook.model.Bookstore> getBookstoresByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _bookstoreLocalService.getBookstoresByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of bookstores matching the UUID and company.
	*
	* @param uuid the UUID of the bookstores
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching bookstores, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.nabook.model.Bookstore> getBookstoresByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.Bookstore> orderByComparator) {
		return _bookstoreLocalService.getBookstoresByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
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
		return _bookstoreLocalService.dynamicQueryCount(dynamicQuery);
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
		return _bookstoreLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public BookstoreLocalService getWrappedService() {
		return _bookstoreLocalService;
	}

	@Override
	public void setWrappedService(BookstoreLocalService bookstoreLocalService) {
		_bookstoreLocalService = bookstoreLocalService;
	}

	private BookstoreLocalService _bookstoreLocalService;
}
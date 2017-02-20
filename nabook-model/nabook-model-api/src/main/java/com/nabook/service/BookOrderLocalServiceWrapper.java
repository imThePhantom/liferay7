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
 * Provides a wrapper for {@link BookOrderLocalService}.
 *
 * @author phantoan
 * @see BookOrderLocalService
 * @generated
 */
@ProviderType
public class BookOrderLocalServiceWrapper implements BookOrderLocalService,
	ServiceWrapper<BookOrderLocalService> {
	public BookOrderLocalServiceWrapper(
		BookOrderLocalService bookOrderLocalService) {
		_bookOrderLocalService = bookOrderLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _bookOrderLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bookOrderLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _bookOrderLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _bookOrderLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookOrderLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookOrderLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the book order to the database. Also notifies the appropriate model listeners.
	*
	* @param bookOrder the book order
	* @return the book order that was added
	*/
	@Override
	public com.nabook.model.BookOrder addBookOrder(
		com.nabook.model.BookOrder bookOrder) {
		return _bookOrderLocalService.addBookOrder(bookOrder);
	}

	/**
	* Creates a new book order with the primary key. Does not add the book order to the database.
	*
	* @param bookOrderId the primary key for the new book order
	* @return the new book order
	*/
	@Override
	public com.nabook.model.BookOrder createBookOrder(long bookOrderId) {
		return _bookOrderLocalService.createBookOrder(bookOrderId);
	}

	/**
	* Deletes the book order from the database. Also notifies the appropriate model listeners.
	*
	* @param bookOrder the book order
	* @return the book order that was removed
	*/
	@Override
	public com.nabook.model.BookOrder deleteBookOrder(
		com.nabook.model.BookOrder bookOrder) {
		return _bookOrderLocalService.deleteBookOrder(bookOrder);
	}

	/**
	* Deletes the book order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookOrderId the primary key of the book order
	* @return the book order that was removed
	* @throws PortalException if a book order with the primary key could not be found
	*/
	@Override
	public com.nabook.model.BookOrder deleteBookOrder(long bookOrderId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookOrderLocalService.deleteBookOrder(bookOrderId);
	}

	@Override
	public com.nabook.model.BookOrder fetchBookOrder(long bookOrderId) {
		return _bookOrderLocalService.fetchBookOrder(bookOrderId);
	}

	/**
	* Returns the book order matching the UUID and group.
	*
	* @param uuid the book order's UUID
	* @param groupId the primary key of the group
	* @return the matching book order, or <code>null</code> if a matching book order could not be found
	*/
	@Override
	public com.nabook.model.BookOrder fetchBookOrderByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _bookOrderLocalService.fetchBookOrderByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the book order with the primary key.
	*
	* @param bookOrderId the primary key of the book order
	* @return the book order
	* @throws PortalException if a book order with the primary key could not be found
	*/
	@Override
	public com.nabook.model.BookOrder getBookOrder(long bookOrderId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookOrderLocalService.getBookOrder(bookOrderId);
	}

	/**
	* Returns the book order matching the UUID and group.
	*
	* @param uuid the book order's UUID
	* @param groupId the primary key of the group
	* @return the matching book order
	* @throws PortalException if a matching book order could not be found
	*/
	@Override
	public com.nabook.model.BookOrder getBookOrderByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookOrderLocalService.getBookOrderByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the book order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bookOrder the book order
	* @return the book order that was updated
	*/
	@Override
	public com.nabook.model.BookOrder updateBookOrder(
		com.nabook.model.BookOrder bookOrder) {
		return _bookOrderLocalService.updateBookOrder(bookOrder);
	}

	/**
	* Returns the number of book orders.
	*
	* @return the number of book orders
	*/
	@Override
	public int getBookOrdersCount() {
		return _bookOrderLocalService.getBookOrdersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _bookOrderLocalService.getOSGiServiceIdentifier();
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
		return _bookOrderLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bookOrderLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bookOrderLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the book orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @return the range of book orders
	*/
	@Override
	public java.util.List<com.nabook.model.BookOrder> getBookOrders(int start,
		int end) {
		return _bookOrderLocalService.getBookOrders(start, end);
	}

	/**
	* Returns all the book orders matching the UUID and company.
	*
	* @param uuid the UUID of the book orders
	* @param companyId the primary key of the company
	* @return the matching book orders, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.nabook.model.BookOrder> getBookOrdersByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _bookOrderLocalService.getBookOrdersByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of book orders matching the UUID and company.
	*
	* @param uuid the UUID of the book orders
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of book orders
	* @param end the upper bound of the range of book orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching book orders, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.nabook.model.BookOrder> getBookOrdersByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.BookOrder> orderByComparator) {
		return _bookOrderLocalService.getBookOrdersByUuidAndCompanyId(uuid,
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
		return _bookOrderLocalService.dynamicQueryCount(dynamicQuery);
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
		return _bookOrderLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public BookOrderLocalService getWrappedService() {
		return _bookOrderLocalService;
	}

	@Override
	public void setWrappedService(BookOrderLocalService bookOrderLocalService) {
		_bookOrderLocalService = bookOrderLocalService;
	}

	private BookOrderLocalService _bookOrderLocalService;
}
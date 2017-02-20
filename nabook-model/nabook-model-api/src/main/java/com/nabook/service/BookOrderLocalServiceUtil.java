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
 * Provides the local service utility for BookOrder. This utility wraps
 * {@link com.nabook.service.impl.BookOrderLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author phantoan
 * @see BookOrderLocalService
 * @see com.nabook.service.base.BookOrderLocalServiceBaseImpl
 * @see com.nabook.service.impl.BookOrderLocalServiceImpl
 * @generated
 */
@ProviderType
public class BookOrderLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.nabook.service.impl.BookOrderLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
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

	/**
	* Adds the book order to the database. Also notifies the appropriate model listeners.
	*
	* @param bookOrder the book order
	* @return the book order that was added
	*/
	public static com.nabook.model.BookOrder addBookOrder(
		com.nabook.model.BookOrder bookOrder) {
		return getService().addBookOrder(bookOrder);
	}

	/**
	* Creates a new book order with the primary key. Does not add the book order to the database.
	*
	* @param bookOrderId the primary key for the new book order
	* @return the new book order
	*/
	public static com.nabook.model.BookOrder createBookOrder(long bookOrderId) {
		return getService().createBookOrder(bookOrderId);
	}

	/**
	* Deletes the book order from the database. Also notifies the appropriate model listeners.
	*
	* @param bookOrder the book order
	* @return the book order that was removed
	*/
	public static com.nabook.model.BookOrder deleteBookOrder(
		com.nabook.model.BookOrder bookOrder) {
		return getService().deleteBookOrder(bookOrder);
	}

	/**
	* Deletes the book order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookOrderId the primary key of the book order
	* @return the book order that was removed
	* @throws PortalException if a book order with the primary key could not be found
	*/
	public static com.nabook.model.BookOrder deleteBookOrder(long bookOrderId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteBookOrder(bookOrderId);
	}

	public static com.nabook.model.BookOrder fetchBookOrder(long bookOrderId) {
		return getService().fetchBookOrder(bookOrderId);
	}

	/**
	* Returns the book order matching the UUID and group.
	*
	* @param uuid the book order's UUID
	* @param groupId the primary key of the group
	* @return the matching book order, or <code>null</code> if a matching book order could not be found
	*/
	public static com.nabook.model.BookOrder fetchBookOrderByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchBookOrderByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the book order with the primary key.
	*
	* @param bookOrderId the primary key of the book order
	* @return the book order
	* @throws PortalException if a book order with the primary key could not be found
	*/
	public static com.nabook.model.BookOrder getBookOrder(long bookOrderId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getBookOrder(bookOrderId);
	}

	/**
	* Returns the book order matching the UUID and group.
	*
	* @param uuid the book order's UUID
	* @param groupId the primary key of the group
	* @return the matching book order
	* @throws PortalException if a matching book order could not be found
	*/
	public static com.nabook.model.BookOrder getBookOrderByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getBookOrderByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the book order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bookOrder the book order
	* @return the book order that was updated
	*/
	public static com.nabook.model.BookOrder updateBookOrder(
		com.nabook.model.BookOrder bookOrder) {
		return getService().updateBookOrder(bookOrder);
	}

	/**
	* Returns the number of book orders.
	*
	* @return the number of book orders
	*/
	public static int getBookOrdersCount() {
		return getService().getBookOrdersCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<com.nabook.model.BookOrder> getBookOrders(
		int start, int end) {
		return getService().getBookOrders(start, end);
	}

	/**
	* Returns all the book orders matching the UUID and company.
	*
	* @param uuid the UUID of the book orders
	* @param companyId the primary key of the company
	* @return the matching book orders, or an empty list if no matches were found
	*/
	public static java.util.List<com.nabook.model.BookOrder> getBookOrdersByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getBookOrdersByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.nabook.model.BookOrder> getBookOrdersByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.BookOrder> orderByComparator) {
		return getService()
				   .getBookOrdersByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
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

	public static BookOrderLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BookOrderLocalService, BookOrderLocalService> _serviceTracker =
		ServiceTrackerFactory.open(BookOrderLocalService.class);
}
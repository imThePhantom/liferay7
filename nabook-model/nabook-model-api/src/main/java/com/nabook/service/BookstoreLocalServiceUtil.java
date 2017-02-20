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
 * Provides the local service utility for Bookstore. This utility wraps
 * {@link com.nabook.service.impl.BookstoreLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author phantoan
 * @see BookstoreLocalService
 * @see com.nabook.service.base.BookstoreLocalServiceBaseImpl
 * @see com.nabook.service.impl.BookstoreLocalServiceImpl
 * @generated
 */
@ProviderType
public class BookstoreLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.nabook.service.impl.BookstoreLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static com.nabook.model.Bookstore addBookstore(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, java.lang.String name, java.lang.String country,
		java.lang.String city, java.lang.String prefecture,
		java.lang.String street, java.lang.String zip, java.lang.String phone)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addBookstore(serviceContext, userId, name, country, city,
			prefecture, street, zip, phone);
	}

	/**
	* Adds the bookstore to the database. Also notifies the appropriate model listeners.
	*
	* @param bookstore the bookstore
	* @return the bookstore that was added
	*/
	public static com.nabook.model.Bookstore addBookstore(
		com.nabook.model.Bookstore bookstore) {
		return getService().addBookstore(bookstore);
	}

	/**
	* Creates a new bookstore with the primary key. Does not add the bookstore to the database.
	*
	* @param bookstoreId the primary key for the new bookstore
	* @return the new bookstore
	*/
	public static com.nabook.model.Bookstore createBookstore(long bookstoreId) {
		return getService().createBookstore(bookstoreId);
	}

	public static com.nabook.model.Bookstore deleteBookstore(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long bookstoreId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBookstore(serviceContext, bookstoreId);
	}

	/**
	* Deletes the bookstore from the database. Also notifies the appropriate model listeners.
	*
	* @param bookstore the bookstore
	* @return the bookstore that was removed
	*/
	public static com.nabook.model.Bookstore deleteBookstore(
		com.nabook.model.Bookstore bookstore) {
		return getService().deleteBookstore(bookstore);
	}

	/**
	* Deletes the bookstore with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookstoreId the primary key of the bookstore
	* @return the bookstore that was removed
	* @throws PortalException if a bookstore with the primary key could not be found
	*/
	public static com.nabook.model.Bookstore deleteBookstore(long bookstoreId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteBookstore(bookstoreId);
	}

	public static com.nabook.model.Bookstore fetchBookstore(long bookstoreId) {
		return getService().fetchBookstore(bookstoreId);
	}

	/**
	* Returns the bookstore matching the UUID and group.
	*
	* @param uuid the bookstore's UUID
	* @param groupId the primary key of the group
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	public static com.nabook.model.Bookstore fetchBookstoreByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchBookstoreByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the bookstore with the primary key.
	*
	* @param bookstoreId the primary key of the bookstore
	* @return the bookstore
	* @throws PortalException if a bookstore with the primary key could not be found
	*/
	public static com.nabook.model.Bookstore getBookstore(long bookstoreId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getBookstore(bookstoreId);
	}

	/**
	* Returns the bookstore matching the UUID and group.
	*
	* @param uuid the bookstore's UUID
	* @param groupId the primary key of the group
	* @return the matching bookstore
	* @throws PortalException if a matching bookstore could not be found
	*/
	public static com.nabook.model.Bookstore getBookstoreByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getBookstoreByUuidAndGroupId(uuid, groupId);
	}

	public static com.nabook.model.Bookstore updateBookstore(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, long bookstoreId, java.lang.String name,
		java.lang.String country, java.lang.String city,
		java.lang.String prefecture, java.lang.String street,
		java.lang.String zip, java.lang.String phone)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateBookstore(serviceContext, userId, bookstoreId, name,
			country, city, prefecture, street, zip, phone);
	}

	/**
	* Updates the bookstore in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bookstore the bookstore
	* @return the bookstore that was updated
	*/
	public static com.nabook.model.Bookstore updateBookstore(
		com.nabook.model.Bookstore bookstore) {
		return getService().updateBookstore(bookstore);
	}

	public static int countBookstores(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookstoreException {
		return getService().countBookstores(companyId);
	}

	/**
	* Returns the number of bookstores.
	*
	* @return the number of bookstores
	*/
	public static int getBookstoresCount() {
		return getService().getBookstoresCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.nabook.model.Bookstore> getAllBookstores(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookstoreException {
		return getService().getAllBookstores(companyId);
	}

	public static java.util.List<com.nabook.model.Bookstore> getAllBookstores(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookstoreException {
		return getService().getAllBookstores(companyId, start, end);
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
	public static java.util.List<com.nabook.model.Bookstore> getBookstores(
		int start, int end) {
		return getService().getBookstores(start, end);
	}

	public static java.util.List<com.nabook.model.Bookstore> getBookstoresByLocation(
		java.lang.String country, java.lang.String city,
		java.lang.String prefecture)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookstoreException {
		return getService().getBookstoresByLocation(country, city, prefecture);
	}

	public static java.util.List<com.nabook.model.Bookstore> getBookstoresByLocation(
		java.lang.String country, java.lang.String city,
		java.lang.String prefecture, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchBookstoreException {
		return getService()
				   .getBookstoresByLocation(country, city, prefecture, start,
			end);
	}

	/**
	* Returns all the bookstores matching the UUID and company.
	*
	* @param uuid the UUID of the bookstores
	* @param companyId the primary key of the company
	* @return the matching bookstores, or an empty list if no matches were found
	*/
	public static java.util.List<com.nabook.model.Bookstore> getBookstoresByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getBookstoresByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.nabook.model.Bookstore> getBookstoresByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.Bookstore> orderByComparator) {
		return getService()
				   .getBookstoresByUuidAndCompanyId(uuid, companyId, start,
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

	public static BookstoreLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BookstoreLocalService, BookstoreLocalService> _serviceTracker =
		ServiceTrackerFactory.open(BookstoreLocalService.class);
}
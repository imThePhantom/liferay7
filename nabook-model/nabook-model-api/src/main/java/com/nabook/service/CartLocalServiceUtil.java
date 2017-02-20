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
 * Provides the local service utility for Cart. This utility wraps
 * {@link com.nabook.service.impl.CartLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author phantoan
 * @see CartLocalService
 * @see com.nabook.service.base.CartLocalServiceBaseImpl
 * @see com.nabook.service.impl.CartLocalServiceImpl
 * @generated
 */
@ProviderType
public class CartLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.nabook.service.impl.CartLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Adds the cart to the database. Also notifies the appropriate model listeners.
	*
	* @param cart the cart
	* @return the cart that was added
	*/
	public static com.nabook.model.Cart addCart(com.nabook.model.Cart cart) {
		return getService().addCart(cart);
	}

	/**
	* Creates a new cart with the primary key. Does not add the cart to the database.
	*
	* @param cartId the primary key for the new cart
	* @return the new cart
	*/
	public static com.nabook.model.Cart createCart(long cartId) {
		return getService().createCart(cartId);
	}

	/**
	* Deletes the cart from the database. Also notifies the appropriate model listeners.
	*
	* @param cart the cart
	* @return the cart that was removed
	*/
	public static com.nabook.model.Cart deleteCart(com.nabook.model.Cart cart) {
		return getService().deleteCart(cart);
	}

	/**
	* Deletes the cart with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cartId the primary key of the cart
	* @return the cart that was removed
	* @throws PortalException if a cart with the primary key could not be found
	*/
	public static com.nabook.model.Cart deleteCart(long cartId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCart(cartId);
	}

	public static com.nabook.model.Cart fetchCart(long cartId) {
		return getService().fetchCart(cartId);
	}

	/**
	* Returns the cart matching the UUID and group.
	*
	* @param uuid the cart's UUID
	* @param groupId the primary key of the group
	* @return the matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public static com.nabook.model.Cart fetchCartByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchCartByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the cart with the primary key.
	*
	* @param cartId the primary key of the cart
	* @return the cart
	* @throws PortalException if a cart with the primary key could not be found
	*/
	public static com.nabook.model.Cart getCart(long cartId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCart(cartId);
	}

	/**
	* Returns the cart matching the UUID and group.
	*
	* @param uuid the cart's UUID
	* @param groupId the primary key of the group
	* @return the matching cart
	* @throws PortalException if a matching cart could not be found
	*/
	public static com.nabook.model.Cart getCartByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCartByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the cart in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cart the cart
	* @return the cart that was updated
	*/
	public static com.nabook.model.Cart updateCart(com.nabook.model.Cart cart) {
		return getService().updateCart(cart);
	}

	/**
	* Returns the number of carts.
	*
	* @return the number of carts
	*/
	public static int getCartsCount() {
		return getService().getCartsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the carts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @return the range of carts
	*/
	public static java.util.List<com.nabook.model.Cart> getCarts(int start,
		int end) {
		return getService().getCarts(start, end);
	}

	/**
	* Returns all the carts matching the UUID and company.
	*
	* @param uuid the UUID of the carts
	* @param companyId the primary key of the company
	* @return the matching carts, or an empty list if no matches were found
	*/
	public static java.util.List<com.nabook.model.Cart> getCartsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getCartsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of carts matching the UUID and company.
	*
	* @param uuid the UUID of the carts
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching carts, or an empty list if no matches were found
	*/
	public static java.util.List<com.nabook.model.Cart> getCartsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.Cart> orderByComparator) {
		return getService()
				   .getCartsByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
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

	public static CartLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CartLocalService, CartLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CartLocalService.class);
}
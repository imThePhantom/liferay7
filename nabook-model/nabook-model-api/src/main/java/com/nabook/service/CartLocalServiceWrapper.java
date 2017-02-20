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
 * Provides a wrapper for {@link CartLocalService}.
 *
 * @author phantoan
 * @see CartLocalService
 * @generated
 */
@ProviderType
public class CartLocalServiceWrapper implements CartLocalService,
	ServiceWrapper<CartLocalService> {
	public CartLocalServiceWrapper(CartLocalService cartLocalService) {
		_cartLocalService = cartLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cartLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cartLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _cartLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cartLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cartLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cartLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the cart to the database. Also notifies the appropriate model listeners.
	*
	* @param cart the cart
	* @return the cart that was added
	*/
	@Override
	public com.nabook.model.Cart addCart(com.nabook.model.Cart cart) {
		return _cartLocalService.addCart(cart);
	}

	/**
	* Creates a new cart with the primary key. Does not add the cart to the database.
	*
	* @param cartId the primary key for the new cart
	* @return the new cart
	*/
	@Override
	public com.nabook.model.Cart createCart(long cartId) {
		return _cartLocalService.createCart(cartId);
	}

	/**
	* Deletes the cart from the database. Also notifies the appropriate model listeners.
	*
	* @param cart the cart
	* @return the cart that was removed
	*/
	@Override
	public com.nabook.model.Cart deleteCart(com.nabook.model.Cart cart) {
		return _cartLocalService.deleteCart(cart);
	}

	/**
	* Deletes the cart with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cartId the primary key of the cart
	* @return the cart that was removed
	* @throws PortalException if a cart with the primary key could not be found
	*/
	@Override
	public com.nabook.model.Cart deleteCart(long cartId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cartLocalService.deleteCart(cartId);
	}

	@Override
	public com.nabook.model.Cart fetchCart(long cartId) {
		return _cartLocalService.fetchCart(cartId);
	}

	/**
	* Returns the cart matching the UUID and group.
	*
	* @param uuid the cart's UUID
	* @param groupId the primary key of the group
	* @return the matching cart, or <code>null</code> if a matching cart could not be found
	*/
	@Override
	public com.nabook.model.Cart fetchCartByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _cartLocalService.fetchCartByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the cart with the primary key.
	*
	* @param cartId the primary key of the cart
	* @return the cart
	* @throws PortalException if a cart with the primary key could not be found
	*/
	@Override
	public com.nabook.model.Cart getCart(long cartId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cartLocalService.getCart(cartId);
	}

	/**
	* Returns the cart matching the UUID and group.
	*
	* @param uuid the cart's UUID
	* @param groupId the primary key of the group
	* @return the matching cart
	* @throws PortalException if a matching cart could not be found
	*/
	@Override
	public com.nabook.model.Cart getCartByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cartLocalService.getCartByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the cart in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cart the cart
	* @return the cart that was updated
	*/
	@Override
	public com.nabook.model.Cart updateCart(com.nabook.model.Cart cart) {
		return _cartLocalService.updateCart(cart);
	}

	/**
	* Returns the number of carts.
	*
	* @return the number of carts
	*/
	@Override
	public int getCartsCount() {
		return _cartLocalService.getCartsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _cartLocalService.getOSGiServiceIdentifier();
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
		return _cartLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _cartLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _cartLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<com.nabook.model.Cart> getCarts(int start, int end) {
		return _cartLocalService.getCarts(start, end);
	}

	/**
	* Returns all the carts matching the UUID and company.
	*
	* @param uuid the UUID of the carts
	* @param companyId the primary key of the company
	* @return the matching carts, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.nabook.model.Cart> getCartsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _cartLocalService.getCartsByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.nabook.model.Cart> getCartsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.Cart> orderByComparator) {
		return _cartLocalService.getCartsByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
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
		return _cartLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cartLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public CartLocalService getWrappedService() {
		return _cartLocalService;
	}

	@Override
	public void setWrappedService(CartLocalService cartLocalService) {
		_cartLocalService = cartLocalService;
	}

	private CartLocalService _cartLocalService;
}
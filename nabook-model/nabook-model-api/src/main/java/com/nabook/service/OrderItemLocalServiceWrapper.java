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
 * Provides a wrapper for {@link OrderItemLocalService}.
 *
 * @author phantoan
 * @see OrderItemLocalService
 * @generated
 */
@ProviderType
public class OrderItemLocalServiceWrapper implements OrderItemLocalService,
	ServiceWrapper<OrderItemLocalService> {
	public OrderItemLocalServiceWrapper(
		OrderItemLocalService orderItemLocalService) {
		_orderItemLocalService = orderItemLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _orderItemLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _orderItemLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _orderItemLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _orderItemLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _orderItemLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _orderItemLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the order item to the database. Also notifies the appropriate model listeners.
	*
	* @param orderItem the order item
	* @return the order item that was added
	*/
	@Override
	public com.nabook.model.OrderItem addOrderItem(
		com.nabook.model.OrderItem orderItem) {
		return _orderItemLocalService.addOrderItem(orderItem);
	}

	/**
	* Creates a new order item with the primary key. Does not add the order item to the database.
	*
	* @param orderItemId the primary key for the new order item
	* @return the new order item
	*/
	@Override
	public com.nabook.model.OrderItem createOrderItem(long orderItemId) {
		return _orderItemLocalService.createOrderItem(orderItemId);
	}

	/**
	* Deletes the order item from the database. Also notifies the appropriate model listeners.
	*
	* @param orderItem the order item
	* @return the order item that was removed
	*/
	@Override
	public com.nabook.model.OrderItem deleteOrderItem(
		com.nabook.model.OrderItem orderItem) {
		return _orderItemLocalService.deleteOrderItem(orderItem);
	}

	/**
	* Deletes the order item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderItemId the primary key of the order item
	* @return the order item that was removed
	* @throws PortalException if a order item with the primary key could not be found
	*/
	@Override
	public com.nabook.model.OrderItem deleteOrderItem(long orderItemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _orderItemLocalService.deleteOrderItem(orderItemId);
	}

	@Override
	public com.nabook.model.OrderItem fetchOrderItem(long orderItemId) {
		return _orderItemLocalService.fetchOrderItem(orderItemId);
	}

	/**
	* Returns the order item matching the UUID and group.
	*
	* @param uuid the order item's UUID
	* @param groupId the primary key of the group
	* @return the matching order item, or <code>null</code> if a matching order item could not be found
	*/
	@Override
	public com.nabook.model.OrderItem fetchOrderItemByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _orderItemLocalService.fetchOrderItemByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the order item with the primary key.
	*
	* @param orderItemId the primary key of the order item
	* @return the order item
	* @throws PortalException if a order item with the primary key could not be found
	*/
	@Override
	public com.nabook.model.OrderItem getOrderItem(long orderItemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _orderItemLocalService.getOrderItem(orderItemId);
	}

	/**
	* Returns the order item matching the UUID and group.
	*
	* @param uuid the order item's UUID
	* @param groupId the primary key of the group
	* @return the matching order item
	* @throws PortalException if a matching order item could not be found
	*/
	@Override
	public com.nabook.model.OrderItem getOrderItemByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _orderItemLocalService.getOrderItemByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the order item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param orderItem the order item
	* @return the order item that was updated
	*/
	@Override
	public com.nabook.model.OrderItem updateOrderItem(
		com.nabook.model.OrderItem orderItem) {
		return _orderItemLocalService.updateOrderItem(orderItem);
	}

	/**
	* Returns the number of order items.
	*
	* @return the number of order items
	*/
	@Override
	public int getOrderItemsCount() {
		return _orderItemLocalService.getOrderItemsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _orderItemLocalService.getOSGiServiceIdentifier();
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
		return _orderItemLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _orderItemLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _orderItemLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the order items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @return the range of order items
	*/
	@Override
	public java.util.List<com.nabook.model.OrderItem> getOrderItems(int start,
		int end) {
		return _orderItemLocalService.getOrderItems(start, end);
	}

	/**
	* Returns all the order items matching the UUID and company.
	*
	* @param uuid the UUID of the order items
	* @param companyId the primary key of the company
	* @return the matching order items, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.nabook.model.OrderItem> getOrderItemsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _orderItemLocalService.getOrderItemsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of order items matching the UUID and company.
	*
	* @param uuid the UUID of the order items
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of order items
	* @param end the upper bound of the range of order items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching order items, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.nabook.model.OrderItem> getOrderItemsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.OrderItem> orderByComparator) {
		return _orderItemLocalService.getOrderItemsByUuidAndCompanyId(uuid,
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
		return _orderItemLocalService.dynamicQueryCount(dynamicQuery);
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
		return _orderItemLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public OrderItemLocalService getWrappedService() {
		return _orderItemLocalService;
	}

	@Override
	public void setWrappedService(OrderItemLocalService orderItemLocalService) {
		_orderItemLocalService = orderItemLocalService;
	}

	private OrderItemLocalService _orderItemLocalService;
}
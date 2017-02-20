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
 * Provides a wrapper for {@link StockItemLocalService}.
 *
 * @author phantoan
 * @see StockItemLocalService
 * @generated
 */
@ProviderType
public class StockItemLocalServiceWrapper implements StockItemLocalService,
	ServiceWrapper<StockItemLocalService> {
	public StockItemLocalServiceWrapper(
		StockItemLocalService stockItemLocalService) {
		_stockItemLocalService = stockItemLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _stockItemLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _stockItemLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _stockItemLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _stockItemLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _stockItemLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _stockItemLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the stock item to the database. Also notifies the appropriate model listeners.
	*
	* @param stockItem the stock item
	* @return the stock item that was added
	*/
	@Override
	public com.nabook.model.StockItem addStockItem(
		com.nabook.model.StockItem stockItem) {
		return _stockItemLocalService.addStockItem(stockItem);
	}

	/**
	* Creates a new stock item with the primary key. Does not add the stock item to the database.
	*
	* @param stockItemId the primary key for the new stock item
	* @return the new stock item
	*/
	@Override
	public com.nabook.model.StockItem createStockItem(long stockItemId) {
		return _stockItemLocalService.createStockItem(stockItemId);
	}

	/**
	* Deletes the stock item from the database. Also notifies the appropriate model listeners.
	*
	* @param stockItem the stock item
	* @return the stock item that was removed
	*/
	@Override
	public com.nabook.model.StockItem deleteStockItem(
		com.nabook.model.StockItem stockItem) {
		return _stockItemLocalService.deleteStockItem(stockItem);
	}

	/**
	* Deletes the stock item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stockItemId the primary key of the stock item
	* @return the stock item that was removed
	* @throws PortalException if a stock item with the primary key could not be found
	*/
	@Override
	public com.nabook.model.StockItem deleteStockItem(long stockItemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _stockItemLocalService.deleteStockItem(stockItemId);
	}

	@Override
	public com.nabook.model.StockItem fetchStockItem(long stockItemId) {
		return _stockItemLocalService.fetchStockItem(stockItemId);
	}

	/**
	* Returns the stock item matching the UUID and group.
	*
	* @param uuid the stock item's UUID
	* @param groupId the primary key of the group
	* @return the matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	@Override
	public com.nabook.model.StockItem fetchStockItemByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _stockItemLocalService.fetchStockItemByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the stock item with the primary key.
	*
	* @param stockItemId the primary key of the stock item
	* @return the stock item
	* @throws PortalException if a stock item with the primary key could not be found
	*/
	@Override
	public com.nabook.model.StockItem getStockItem(long stockItemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _stockItemLocalService.getStockItem(stockItemId);
	}

	/**
	* Returns the stock item matching the UUID and group.
	*
	* @param uuid the stock item's UUID
	* @param groupId the primary key of the group
	* @return the matching stock item
	* @throws PortalException if a matching stock item could not be found
	*/
	@Override
	public com.nabook.model.StockItem getStockItemByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _stockItemLocalService.getStockItemByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the stock item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param stockItem the stock item
	* @return the stock item that was updated
	*/
	@Override
	public com.nabook.model.StockItem updateStockItem(
		com.nabook.model.StockItem stockItem) {
		return _stockItemLocalService.updateStockItem(stockItem);
	}

	/**
	* Returns the number of stock items.
	*
	* @return the number of stock items
	*/
	@Override
	public int getStockItemsCount() {
		return _stockItemLocalService.getStockItemsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _stockItemLocalService.getOSGiServiceIdentifier();
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
		return _stockItemLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _stockItemLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _stockItemLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the stock items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @return the range of stock items
	*/
	@Override
	public java.util.List<com.nabook.model.StockItem> getStockItems(int start,
		int end) {
		return _stockItemLocalService.getStockItems(start, end);
	}

	/**
	* Returns all the stock items matching the UUID and company.
	*
	* @param uuid the UUID of the stock items
	* @param companyId the primary key of the company
	* @return the matching stock items, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.nabook.model.StockItem> getStockItemsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _stockItemLocalService.getStockItemsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of stock items matching the UUID and company.
	*
	* @param uuid the UUID of the stock items
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching stock items, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.nabook.model.StockItem> getStockItemsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.StockItem> orderByComparator) {
		return _stockItemLocalService.getStockItemsByUuidAndCompanyId(uuid,
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
		return _stockItemLocalService.dynamicQueryCount(dynamicQuery);
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
		return _stockItemLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public StockItemLocalService getWrappedService() {
		return _stockItemLocalService;
	}

	@Override
	public void setWrappedService(StockItemLocalService stockItemLocalService) {
		_stockItemLocalService = stockItemLocalService;
	}

	private StockItemLocalService _stockItemLocalService;
}
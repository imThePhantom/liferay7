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
 * Provides a wrapper for {@link AddressLocalService}.
 *
 * @author phantoan
 * @see AddressLocalService
 * @generated
 */
@ProviderType
public class AddressLocalServiceWrapper implements AddressLocalService,
	ServiceWrapper<AddressLocalService> {
	public AddressLocalServiceWrapper(AddressLocalService addressLocalService) {
		_addressLocalService = addressLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _addressLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addressLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _addressLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _addressLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _addressLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _addressLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the address to the database. Also notifies the appropriate model listeners.
	*
	* @param address the address
	* @return the address that was added
	*/
	@Override
	public com.nabook.model.Address addAddress(com.nabook.model.Address address) {
		return _addressLocalService.addAddress(address);
	}

	/**
	* Creates a new address with the primary key. Does not add the address to the database.
	*
	* @param addressId the primary key for the new address
	* @return the new address
	*/
	@Override
	public com.nabook.model.Address createAddress(long addressId) {
		return _addressLocalService.createAddress(addressId);
	}

	/**
	* Deletes the address from the database. Also notifies the appropriate model listeners.
	*
	* @param address the address
	* @return the address that was removed
	*/
	@Override
	public com.nabook.model.Address deleteAddress(
		com.nabook.model.Address address) {
		return _addressLocalService.deleteAddress(address);
	}

	/**
	* Deletes the address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param addressId the primary key of the address
	* @return the address that was removed
	* @throws PortalException if a address with the primary key could not be found
	*/
	@Override
	public com.nabook.model.Address deleteAddress(long addressId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _addressLocalService.deleteAddress(addressId);
	}

	@Override
	public com.nabook.model.Address fetchAddress(long addressId) {
		return _addressLocalService.fetchAddress(addressId);
	}

	/**
	* Returns the address matching the UUID and group.
	*
	* @param uuid the address's UUID
	* @param groupId the primary key of the group
	* @return the matching address, or <code>null</code> if a matching address could not be found
	*/
	@Override
	public com.nabook.model.Address fetchAddressByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _addressLocalService.fetchAddressByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the address with the primary key.
	*
	* @param addressId the primary key of the address
	* @return the address
	* @throws PortalException if a address with the primary key could not be found
	*/
	@Override
	public com.nabook.model.Address getAddress(long addressId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _addressLocalService.getAddress(addressId);
	}

	/**
	* Returns the address matching the UUID and group.
	*
	* @param uuid the address's UUID
	* @param groupId the primary key of the group
	* @return the matching address
	* @throws PortalException if a matching address could not be found
	*/
	@Override
	public com.nabook.model.Address getAddressByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _addressLocalService.getAddressByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param address the address
	* @return the address that was updated
	*/
	@Override
	public com.nabook.model.Address updateAddress(
		com.nabook.model.Address address) {
		return _addressLocalService.updateAddress(address);
	}

	/**
	* Returns the number of addresses.
	*
	* @return the number of addresses
	*/
	@Override
	public int getAddressesCount() {
		return _addressLocalService.getAddressesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _addressLocalService.getOSGiServiceIdentifier();
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
		return _addressLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _addressLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _addressLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of addresses
	* @param end the upper bound of the range of addresses (not inclusive)
	* @return the range of addresses
	*/
	@Override
	public java.util.List<com.nabook.model.Address> getAddresses(int start,
		int end) {
		return _addressLocalService.getAddresses(start, end);
	}

	/**
	* Returns all the addresses matching the UUID and company.
	*
	* @param uuid the UUID of the addresses
	* @param companyId the primary key of the company
	* @return the matching addresses, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.nabook.model.Address> getAddressesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _addressLocalService.getAddressesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of addresses matching the UUID and company.
	*
	* @param uuid the UUID of the addresses
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of addresses
	* @param end the upper bound of the range of addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching addresses, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.nabook.model.Address> getAddressesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.nabook.model.Address> orderByComparator) {
		return _addressLocalService.getAddressesByUuidAndCompanyId(uuid,
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
		return _addressLocalService.dynamicQueryCount(dynamicQuery);
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
		return _addressLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public AddressLocalService getWrappedService() {
		return _addressLocalService;
	}

	@Override
	public void setWrappedService(AddressLocalService addressLocalService) {
		_addressLocalService = addressLocalService;
	}

	private AddressLocalService _addressLocalService;
}
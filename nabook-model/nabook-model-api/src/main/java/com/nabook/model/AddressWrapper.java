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

package com.nabook.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Address}.
 * </p>
 *
 * @author phantoan
 * @see Address
 * @generated
 */
@ProviderType
public class AddressWrapper implements Address, ModelWrapper<Address> {
	public AddressWrapper(Address address) {
		_address = address;
	}

	@Override
	public Class<?> getModelClass() {
		return Address.class;
	}

	@Override
	public String getModelClassName() {
		return Address.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("addressId", getAddressId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("name", getName());
		attributes.put("phone", getPhone());
		attributes.put("country", getCountry());
		attributes.put("city", getCity());
		attributes.put("prefecture", getPrefecture());
		attributes.put("street", getStreet());
		attributes.put("zip", getZip());
		attributes.put("primary", getPrimary());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long addressId = (Long)attributes.get("addressId");

		if (addressId != null) {
			setAddressId(addressId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String prefecture = (String)attributes.get("prefecture");

		if (prefecture != null) {
			setPrefecture(prefecture);
		}

		String street = (String)attributes.get("street");

		if (street != null) {
			setStreet(street);
		}

		String zip = (String)attributes.get("zip");

		if (zip != null) {
			setZip(zip);
		}

		Boolean primary = (Boolean)attributes.get("primary");

		if (primary != null) {
			setPrimary(primary);
		}
	}

	@Override
	public Address toEscapedModel() {
		return new AddressWrapper(_address.toEscapedModel());
	}

	@Override
	public Address toUnescapedModel() {
		return new AddressWrapper(_address.toUnescapedModel());
	}

	/**
	* Returns the primary of this address.
	*
	* @return the primary of this address
	*/
	@Override
	public boolean getPrimary() {
		return _address.getPrimary();
	}

	@Override
	public boolean isCachedModel() {
		return _address.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _address.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this address is in the Recycle Bin.
	*
	* @return <code>true</code> if this address is in the Recycle Bin; <code>false</code> otherwise
	*/
	@Override
	public boolean isInTrash() {
		return _address.isInTrash();
	}

	/**
	* Returns <code>true</code> if the parent of this address is in the Recycle Bin.
	*
	* @return <code>true</code> if the parent of this address is in the Recycle Bin; <code>false</code> otherwise
	*/
	@Override
	public boolean isInTrashContainer() {
		return _address.isInTrashContainer();
	}

	@Override
	public boolean isInTrashExplicitly() {
		return _address.isInTrashExplicitly();
	}

	@Override
	public boolean isInTrashImplicitly() {
		return _address.isInTrashImplicitly();
	}

	@Override
	public boolean isNew() {
		return _address.isNew();
	}

	/**
	* Returns <code>true</code> if this address is primary.
	*
	* @return <code>true</code> if this address is primary; <code>false</code> otherwise
	*/
	@Override
	public boolean isPrimary() {
		return _address.isPrimary();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _address.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Address> toCacheModel() {
		return _address.toCacheModel();
	}

	/**
	* Returns the trash handler for this address.
	*
	* @return the trash handler for this address
	*/
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return _address.getTrashHandler();
	}

	/**
	* Returns the trash entry created when this address was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this address.
	*
	* @return the trash entry created when this address was moved to the Recycle Bin
	*/
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _address.getTrashEntry();
	}

	@Override
	public int compareTo(Address address) {
		return _address.compareTo(address);
	}

	/**
	* Returns the status of this address.
	*
	* @return the status of this address
	*/
	@Override
	public int getStatus() {
		return _address.getStatus();
	}

	@Override
	public int hashCode() {
		return _address.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _address.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AddressWrapper((Address)_address.clone());
	}

	/**
	* Returns the city of this address.
	*
	* @return the city of this address
	*/
	@Override
	public java.lang.String getCity() {
		return _address.getCity();
	}

	/**
	* Returns the country of this address.
	*
	* @return the country of this address
	*/
	@Override
	public java.lang.String getCountry() {
		return _address.getCountry();
	}

	/**
	* Returns the name of this address.
	*
	* @return the name of this address
	*/
	@Override
	public java.lang.String getName() {
		return _address.getName();
	}

	/**
	* Returns the phone of this address.
	*
	* @return the phone of this address
	*/
	@Override
	public java.lang.String getPhone() {
		return _address.getPhone();
	}

	/**
	* Returns the prefecture of this address.
	*
	* @return the prefecture of this address
	*/
	@Override
	public java.lang.String getPrefecture() {
		return _address.getPrefecture();
	}

	/**
	* Returns the street of this address.
	*
	* @return the street of this address
	*/
	@Override
	public java.lang.String getStreet() {
		return _address.getStreet();
	}

	/**
	* Returns the user name of this address.
	*
	* @return the user name of this address
	*/
	@Override
	public java.lang.String getUserName() {
		return _address.getUserName();
	}

	/**
	* Returns the user uuid of this address.
	*
	* @return the user uuid of this address
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _address.getUserUuid();
	}

	/**
	* Returns the uuid of this address.
	*
	* @return the uuid of this address
	*/
	@Override
	public java.lang.String getUuid() {
		return _address.getUuid();
	}

	/**
	* Returns the zip of this address.
	*
	* @return the zip of this address
	*/
	@Override
	public java.lang.String getZip() {
		return _address.getZip();
	}

	@Override
	public java.lang.String toString() {
		return _address.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _address.toXmlString();
	}

	/**
	* Returns the create date of this address.
	*
	* @return the create date of this address
	*/
	@Override
	public Date getCreateDate() {
		return _address.getCreateDate();
	}

	/**
	* Returns the modified date of this address.
	*
	* @return the modified date of this address
	*/
	@Override
	public Date getModifiedDate() {
		return _address.getModifiedDate();
	}

	/**
	* Returns the address ID of this address.
	*
	* @return the address ID of this address
	*/
	@Override
	public long getAddressId() {
		return _address.getAddressId();
	}

	/**
	* Returns the company ID of this address.
	*
	* @return the company ID of this address
	*/
	@Override
	public long getCompanyId() {
		return _address.getCompanyId();
	}

	/**
	* Returns the group ID of this address.
	*
	* @return the group ID of this address
	*/
	@Override
	public long getGroupId() {
		return _address.getGroupId();
	}

	/**
	* Returns the primary key of this address.
	*
	* @return the primary key of this address
	*/
	@Override
	public long getPrimaryKey() {
		return _address.getPrimaryKey();
	}

	/**
	* Returns the class primary key of the trash entry for this address.
	*
	* @return the class primary key of the trash entry for this address
	*/
	@Override
	public long getTrashEntryClassPK() {
		return _address.getTrashEntryClassPK();
	}

	/**
	* Returns the user ID of this address.
	*
	* @return the user ID of this address
	*/
	@Override
	public long getUserId() {
		return _address.getUserId();
	}

	@Override
	public void persist() {
		_address.persist();
	}

	/**
	* Sets the address ID of this address.
	*
	* @param addressId the address ID of this address
	*/
	@Override
	public void setAddressId(long addressId) {
		_address.setAddressId(addressId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_address.setCachedModel(cachedModel);
	}

	/**
	* Sets the city of this address.
	*
	* @param city the city of this address
	*/
	@Override
	public void setCity(java.lang.String city) {
		_address.setCity(city);
	}

	/**
	* Sets the company ID of this address.
	*
	* @param companyId the company ID of this address
	*/
	@Override
	public void setCompanyId(long companyId) {
		_address.setCompanyId(companyId);
	}

	/**
	* Sets the country of this address.
	*
	* @param country the country of this address
	*/
	@Override
	public void setCountry(java.lang.String country) {
		_address.setCountry(country);
	}

	/**
	* Sets the create date of this address.
	*
	* @param createDate the create date of this address
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_address.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_address.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_address.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_address.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this address.
	*
	* @param groupId the group ID of this address
	*/
	@Override
	public void setGroupId(long groupId) {
		_address.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this address.
	*
	* @param modifiedDate the modified date of this address
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_address.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this address.
	*
	* @param name the name of this address
	*/
	@Override
	public void setName(java.lang.String name) {
		_address.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_address.setNew(n);
	}

	/**
	* Sets the phone of this address.
	*
	* @param phone the phone of this address
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_address.setPhone(phone);
	}

	/**
	* Sets the prefecture of this address.
	*
	* @param prefecture the prefecture of this address
	*/
	@Override
	public void setPrefecture(java.lang.String prefecture) {
		_address.setPrefecture(prefecture);
	}

	/**
	* Sets whether this address is primary.
	*
	* @param primary the primary of this address
	*/
	@Override
	public void setPrimary(boolean primary) {
		_address.setPrimary(primary);
	}

	/**
	* Sets the primary key of this address.
	*
	* @param primaryKey the primary key of this address
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_address.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_address.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the street of this address.
	*
	* @param street the street of this address
	*/
	@Override
	public void setStreet(java.lang.String street) {
		_address.setStreet(street);
	}

	/**
	* Sets the user ID of this address.
	*
	* @param userId the user ID of this address
	*/
	@Override
	public void setUserId(long userId) {
		_address.setUserId(userId);
	}

	/**
	* Sets the user name of this address.
	*
	* @param userName the user name of this address
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_address.setUserName(userName);
	}

	/**
	* Sets the user uuid of this address.
	*
	* @param userUuid the user uuid of this address
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_address.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this address.
	*
	* @param uuid the uuid of this address
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_address.setUuid(uuid);
	}

	/**
	* Sets the zip of this address.
	*
	* @param zip the zip of this address
	*/
	@Override
	public void setZip(java.lang.String zip) {
		_address.setZip(zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AddressWrapper)) {
			return false;
		}

		AddressWrapper addressWrapper = (AddressWrapper)obj;

		if (Objects.equals(_address, addressWrapper._address)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _address.getStagedModelType();
	}

	@Override
	public Address getWrappedModel() {
		return _address;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _address.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _address.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_address.resetOriginalValues();
	}

	private final Address _address;
}
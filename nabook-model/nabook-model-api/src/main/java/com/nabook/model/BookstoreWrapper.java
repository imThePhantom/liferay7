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
 * This class is a wrapper for {@link Bookstore}.
 * </p>
 *
 * @author phantoan
 * @see Bookstore
 * @generated
 */
@ProviderType
public class BookstoreWrapper implements Bookstore, ModelWrapper<Bookstore> {
	public BookstoreWrapper(Bookstore bookstore) {
		_bookstore = bookstore;
	}

	@Override
	public Class<?> getModelClass() {
		return Bookstore.class;
	}

	@Override
	public String getModelClassName() {
		return Bookstore.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bookstoreId", getBookstoreId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("country", getCountry());
		attributes.put("city", getCity());
		attributes.put("prefecture", getPrefecture());
		attributes.put("street", getStreet());
		attributes.put("zip", getZip());
		attributes.put("phone", getPhone());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long bookstoreId = (Long)attributes.get("bookstoreId");

		if (bookstoreId != null) {
			setBookstoreId(bookstoreId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
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

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}
	}

	@Override
	public Bookstore toEscapedModel() {
		return new BookstoreWrapper(_bookstore.toEscapedModel());
	}

	@Override
	public Bookstore toUnescapedModel() {
		return new BookstoreWrapper(_bookstore.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _bookstore.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _bookstore.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _bookstore.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _bookstore.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Bookstore> toCacheModel() {
		return _bookstore.toCacheModel();
	}

	@Override
	public int compareTo(Bookstore bookstore) {
		return _bookstore.compareTo(bookstore);
	}

	@Override
	public int hashCode() {
		return _bookstore.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bookstore.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new BookstoreWrapper((Bookstore)_bookstore.clone());
	}

	/**
	* Returns the city of this bookstore.
	*
	* @return the city of this bookstore
	*/
	@Override
	public java.lang.String getCity() {
		return _bookstore.getCity();
	}

	/**
	* Returns the country of this bookstore.
	*
	* @return the country of this bookstore
	*/
	@Override
	public java.lang.String getCountry() {
		return _bookstore.getCountry();
	}

	/**
	* Returns the name of this bookstore.
	*
	* @return the name of this bookstore
	*/
	@Override
	public java.lang.String getName() {
		return _bookstore.getName();
	}

	/**
	* Returns the phone of this bookstore.
	*
	* @return the phone of this bookstore
	*/
	@Override
	public java.lang.String getPhone() {
		return _bookstore.getPhone();
	}

	/**
	* Returns the prefecture of this bookstore.
	*
	* @return the prefecture of this bookstore
	*/
	@Override
	public java.lang.String getPrefecture() {
		return _bookstore.getPrefecture();
	}

	/**
	* Returns the street of this bookstore.
	*
	* @return the street of this bookstore
	*/
	@Override
	public java.lang.String getStreet() {
		return _bookstore.getStreet();
	}

	/**
	* Returns the user name of this bookstore.
	*
	* @return the user name of this bookstore
	*/
	@Override
	public java.lang.String getUserName() {
		return _bookstore.getUserName();
	}

	/**
	* Returns the user uuid of this bookstore.
	*
	* @return the user uuid of this bookstore
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _bookstore.getUserUuid();
	}

	/**
	* Returns the uuid of this bookstore.
	*
	* @return the uuid of this bookstore
	*/
	@Override
	public java.lang.String getUuid() {
		return _bookstore.getUuid();
	}

	/**
	* Returns the zip of this bookstore.
	*
	* @return the zip of this bookstore
	*/
	@Override
	public java.lang.String getZip() {
		return _bookstore.getZip();
	}

	@Override
	public java.lang.String toString() {
		return _bookstore.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bookstore.toXmlString();
	}

	/**
	* Returns the create date of this bookstore.
	*
	* @return the create date of this bookstore
	*/
	@Override
	public Date getCreateDate() {
		return _bookstore.getCreateDate();
	}

	/**
	* Returns the modified date of this bookstore.
	*
	* @return the modified date of this bookstore
	*/
	@Override
	public Date getModifiedDate() {
		return _bookstore.getModifiedDate();
	}

	/**
	* Returns the bookstore ID of this bookstore.
	*
	* @return the bookstore ID of this bookstore
	*/
	@Override
	public long getBookstoreId() {
		return _bookstore.getBookstoreId();
	}

	/**
	* Returns the company ID of this bookstore.
	*
	* @return the company ID of this bookstore
	*/
	@Override
	public long getCompanyId() {
		return _bookstore.getCompanyId();
	}

	/**
	* Returns the group ID of this bookstore.
	*
	* @return the group ID of this bookstore
	*/
	@Override
	public long getGroupId() {
		return _bookstore.getGroupId();
	}

	/**
	* Returns the primary key of this bookstore.
	*
	* @return the primary key of this bookstore
	*/
	@Override
	public long getPrimaryKey() {
		return _bookstore.getPrimaryKey();
	}

	/**
	* Returns the user ID of this bookstore.
	*
	* @return the user ID of this bookstore
	*/
	@Override
	public long getUserId() {
		return _bookstore.getUserId();
	}

	@Override
	public void persist() {
		_bookstore.persist();
	}

	/**
	* Sets the bookstore ID of this bookstore.
	*
	* @param bookstoreId the bookstore ID of this bookstore
	*/
	@Override
	public void setBookstoreId(long bookstoreId) {
		_bookstore.setBookstoreId(bookstoreId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bookstore.setCachedModel(cachedModel);
	}

	/**
	* Sets the city of this bookstore.
	*
	* @param city the city of this bookstore
	*/
	@Override
	public void setCity(java.lang.String city) {
		_bookstore.setCity(city);
	}

	/**
	* Sets the company ID of this bookstore.
	*
	* @param companyId the company ID of this bookstore
	*/
	@Override
	public void setCompanyId(long companyId) {
		_bookstore.setCompanyId(companyId);
	}

	/**
	* Sets the country of this bookstore.
	*
	* @param country the country of this bookstore
	*/
	@Override
	public void setCountry(java.lang.String country) {
		_bookstore.setCountry(country);
	}

	/**
	* Sets the create date of this bookstore.
	*
	* @param createDate the create date of this bookstore
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_bookstore.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_bookstore.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_bookstore.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_bookstore.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this bookstore.
	*
	* @param groupId the group ID of this bookstore
	*/
	@Override
	public void setGroupId(long groupId) {
		_bookstore.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this bookstore.
	*
	* @param modifiedDate the modified date of this bookstore
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_bookstore.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this bookstore.
	*
	* @param name the name of this bookstore
	*/
	@Override
	public void setName(java.lang.String name) {
		_bookstore.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_bookstore.setNew(n);
	}

	/**
	* Sets the phone of this bookstore.
	*
	* @param phone the phone of this bookstore
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_bookstore.setPhone(phone);
	}

	/**
	* Sets the prefecture of this bookstore.
	*
	* @param prefecture the prefecture of this bookstore
	*/
	@Override
	public void setPrefecture(java.lang.String prefecture) {
		_bookstore.setPrefecture(prefecture);
	}

	/**
	* Sets the primary key of this bookstore.
	*
	* @param primaryKey the primary key of this bookstore
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bookstore.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_bookstore.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the street of this bookstore.
	*
	* @param street the street of this bookstore
	*/
	@Override
	public void setStreet(java.lang.String street) {
		_bookstore.setStreet(street);
	}

	/**
	* Sets the user ID of this bookstore.
	*
	* @param userId the user ID of this bookstore
	*/
	@Override
	public void setUserId(long userId) {
		_bookstore.setUserId(userId);
	}

	/**
	* Sets the user name of this bookstore.
	*
	* @param userName the user name of this bookstore
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_bookstore.setUserName(userName);
	}

	/**
	* Sets the user uuid of this bookstore.
	*
	* @param userUuid the user uuid of this bookstore
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_bookstore.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this bookstore.
	*
	* @param uuid the uuid of this bookstore
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_bookstore.setUuid(uuid);
	}

	/**
	* Sets the zip of this bookstore.
	*
	* @param zip the zip of this bookstore
	*/
	@Override
	public void setZip(java.lang.String zip) {
		_bookstore.setZip(zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BookstoreWrapper)) {
			return false;
		}

		BookstoreWrapper bookstoreWrapper = (BookstoreWrapper)obj;

		if (Objects.equals(_bookstore, bookstoreWrapper._bookstore)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _bookstore.getStagedModelType();
	}

	@Override
	public Bookstore getWrappedModel() {
		return _bookstore;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _bookstore.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _bookstore.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_bookstore.resetOriginalValues();
	}

	private final Bookstore _bookstore;
}
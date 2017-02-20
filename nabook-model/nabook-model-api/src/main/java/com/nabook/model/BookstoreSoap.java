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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author phantoan
 * @generated
 */
@ProviderType
public class BookstoreSoap implements Serializable {
	public static BookstoreSoap toSoapModel(Bookstore model) {
		BookstoreSoap soapModel = new BookstoreSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setBookstoreId(model.getBookstoreId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setName(model.getName());
		soapModel.setCountry(model.getCountry());
		soapModel.setCity(model.getCity());
		soapModel.setPrefecture(model.getPrefecture());
		soapModel.setStreet(model.getStreet());
		soapModel.setZip(model.getZip());
		soapModel.setPhone(model.getPhone());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static BookstoreSoap[] toSoapModels(Bookstore[] models) {
		BookstoreSoap[] soapModels = new BookstoreSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BookstoreSoap[][] toSoapModels(Bookstore[][] models) {
		BookstoreSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BookstoreSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BookstoreSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BookstoreSoap[] toSoapModels(List<Bookstore> models) {
		List<BookstoreSoap> soapModels = new ArrayList<BookstoreSoap>(models.size());

		for (Bookstore model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BookstoreSoap[soapModels.size()]);
	}

	public BookstoreSoap() {
	}

	public long getPrimaryKey() {
		return _bookstoreId;
	}

	public void setPrimaryKey(long pk) {
		setBookstoreId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getBookstoreId() {
		return _bookstoreId;
	}

	public void setBookstoreId(long bookstoreId) {
		_bookstoreId = bookstoreId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getCountry() {
		return _country;
	}

	public void setCountry(String country) {
		_country = country;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getPrefecture() {
		return _prefecture;
	}

	public void setPrefecture(String prefecture) {
		_prefecture = prefecture;
	}

	public String getStreet() {
		return _street;
	}

	public void setStreet(String street) {
		_street = street;
	}

	public String getZip() {
		return _zip;
	}

	public void setZip(String zip) {
		_zip = zip;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private String _uuid;
	private long _bookstoreId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userName;
	private String _name;
	private String _country;
	private String _city;
	private String _prefecture;
	private String _street;
	private String _zip;
	private String _phone;
	private String _description;
}
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
 * This class is used by SOAP remote services, specifically {@link com.nabook.service.http.BookOrderServiceSoap}.
 *
 * @author phantoan
 * @see com.nabook.service.http.BookOrderServiceSoap
 * @generated
 */
@ProviderType
public class BookOrderSoap implements Serializable {
	public static BookOrderSoap toSoapModel(BookOrder model) {
		BookOrderSoap soapModel = new BookOrderSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setBookOrderId(model.getBookOrderId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setStatus(model.getStatus());
		soapModel.setBillingName(model.getBillingName());
		soapModel.setBillingCountry(model.getBillingCountry());
		soapModel.setBillingCity(model.getBillingCity());
		soapModel.setBillingPrefecture(model.getBillingPrefecture());
		soapModel.setBillingStreet(model.getBillingStreet());
		soapModel.setBillingZip(model.getBillingZip());
		soapModel.setShipToBilling(model.getShipToBilling());
		soapModel.setShippingName(model.getShippingName());
		soapModel.setShippingCountry(model.getShippingCountry());
		soapModel.setShippingCity(model.getShippingCity());
		soapModel.setShippingPrefecture(model.getShippingPrefecture());
		soapModel.setShippingStreet(model.getShippingStreet());
		soapModel.setShippingZip(model.getShippingZip());
		soapModel.setPhone(model.getPhone());
		soapModel.setTotal(model.getTotal());
		soapModel.setTax(model.getTax());
		soapModel.setDiscount(model.getDiscount());
		soapModel.setShipfee(model.getShipfee());
		soapModel.setPayment(model.getPayment());

		return soapModel;
	}

	public static BookOrderSoap[] toSoapModels(BookOrder[] models) {
		BookOrderSoap[] soapModels = new BookOrderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BookOrderSoap[][] toSoapModels(BookOrder[][] models) {
		BookOrderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BookOrderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BookOrderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BookOrderSoap[] toSoapModels(List<BookOrder> models) {
		List<BookOrderSoap> soapModels = new ArrayList<BookOrderSoap>(models.size());

		for (BookOrder model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BookOrderSoap[soapModels.size()]);
	}

	public BookOrderSoap() {
	}

	public long getPrimaryKey() {
		return _bookOrderId;
	}

	public void setPrimaryKey(long pk) {
		setBookOrderId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getBookOrderId() {
		return _bookOrderId;
	}

	public void setBookOrderId(long bookOrderId) {
		_bookOrderId = bookOrderId;
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

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getBillingName() {
		return _billingName;
	}

	public void setBillingName(String billingName) {
		_billingName = billingName;
	}

	public String getBillingCountry() {
		return _billingCountry;
	}

	public void setBillingCountry(String billingCountry) {
		_billingCountry = billingCountry;
	}

	public String getBillingCity() {
		return _billingCity;
	}

	public void setBillingCity(String billingCity) {
		_billingCity = billingCity;
	}

	public String getBillingPrefecture() {
		return _billingPrefecture;
	}

	public void setBillingPrefecture(String billingPrefecture) {
		_billingPrefecture = billingPrefecture;
	}

	public String getBillingStreet() {
		return _billingStreet;
	}

	public void setBillingStreet(String billingStreet) {
		_billingStreet = billingStreet;
	}

	public String getBillingZip() {
		return _billingZip;
	}

	public void setBillingZip(String billingZip) {
		_billingZip = billingZip;
	}

	public boolean getShipToBilling() {
		return _shipToBilling;
	}

	public boolean isShipToBilling() {
		return _shipToBilling;
	}

	public void setShipToBilling(boolean shipToBilling) {
		_shipToBilling = shipToBilling;
	}

	public String getShippingName() {
		return _shippingName;
	}

	public void setShippingName(String shippingName) {
		_shippingName = shippingName;
	}

	public String getShippingCountry() {
		return _shippingCountry;
	}

	public void setShippingCountry(String shippingCountry) {
		_shippingCountry = shippingCountry;
	}

	public String getShippingCity() {
		return _shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		_shippingCity = shippingCity;
	}

	public String getShippingPrefecture() {
		return _shippingPrefecture;
	}

	public void setShippingPrefecture(String shippingPrefecture) {
		_shippingPrefecture = shippingPrefecture;
	}

	public String getShippingStreet() {
		return _shippingStreet;
	}

	public void setShippingStreet(String shippingStreet) {
		_shippingStreet = shippingStreet;
	}

	public String getShippingZip() {
		return _shippingZip;
	}

	public void setShippingZip(String shippingZip) {
		_shippingZip = shippingZip;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getTotal() {
		return _total;
	}

	public void setTotal(String total) {
		_total = total;
	}

	public int getTax() {
		return _tax;
	}

	public void setTax(int tax) {
		_tax = tax;
	}

	public int getDiscount() {
		return _discount;
	}

	public void setDiscount(int discount) {
		_discount = discount;
	}

	public String getShipfee() {
		return _shipfee;
	}

	public void setShipfee(String shipfee) {
		_shipfee = shipfee;
	}

	public String getPayment() {
		return _payment;
	}

	public void setPayment(String payment) {
		_payment = payment;
	}

	private String _uuid;
	private long _bookOrderId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userName;
	private String _status;
	private String _billingName;
	private String _billingCountry;
	private String _billingCity;
	private String _billingPrefecture;
	private String _billingStreet;
	private String _billingZip;
	private boolean _shipToBilling;
	private String _shippingName;
	private String _shippingCountry;
	private String _shippingCity;
	private String _shippingPrefecture;
	private String _shippingStreet;
	private String _shippingZip;
	private String _phone;
	private String _total;
	private int _tax;
	private int _discount;
	private String _shipfee;
	private String _payment;
}
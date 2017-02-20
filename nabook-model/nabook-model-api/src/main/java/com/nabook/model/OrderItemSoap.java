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
public class OrderItemSoap implements Serializable {
	public static OrderItemSoap toSoapModel(OrderItem model) {
		OrderItemSoap soapModel = new OrderItemSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setOrderItemId(model.getOrderItemId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setBookOrderId(model.getBookOrderId());
		soapModel.setBookId(model.getBookId());
		soapModel.setPrice(model.getPrice());
		soapModel.setQuantity(model.getQuantity());

		return soapModel;
	}

	public static OrderItemSoap[] toSoapModels(OrderItem[] models) {
		OrderItemSoap[] soapModels = new OrderItemSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OrderItemSoap[][] toSoapModels(OrderItem[][] models) {
		OrderItemSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OrderItemSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OrderItemSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OrderItemSoap[] toSoapModels(List<OrderItem> models) {
		List<OrderItemSoap> soapModels = new ArrayList<OrderItemSoap>(models.size());

		for (OrderItem model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OrderItemSoap[soapModels.size()]);
	}

	public OrderItemSoap() {
	}

	public long getPrimaryKey() {
		return _orderItemId;
	}

	public void setPrimaryKey(long pk) {
		setOrderItemId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getOrderItemId() {
		return _orderItemId;
	}

	public void setOrderItemId(long orderItemId) {
		_orderItemId = orderItemId;
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

	public long getBookOrderId() {
		return _bookOrderId;
	}

	public void setBookOrderId(long bookOrderId) {
		_bookOrderId = bookOrderId;
	}

	public long getBookId() {
		return _bookId;
	}

	public void setBookId(long bookId) {
		_bookId = bookId;
	}

	public String getPrice() {
		return _price;
	}

	public void setPrice(String price) {
		_price = price;
	}

	public int getQuantity() {
		return _quantity;
	}

	public void setQuantity(int quantity) {
		_quantity = quantity;
	}

	private String _uuid;
	private long _orderItemId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userName;
	private long _bookOrderId;
	private long _bookId;
	private String _price;
	private int _quantity;
}
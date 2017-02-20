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
public class StockItemSoap implements Serializable {
	public static StockItemSoap toSoapModel(StockItem model) {
		StockItemSoap soapModel = new StockItemSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setStockItemId(model.getStockItemId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setBookId(model.getBookId());
		soapModel.setRemainingQuantity(model.getRemainingQuantity());

		return soapModel;
	}

	public static StockItemSoap[] toSoapModels(StockItem[] models) {
		StockItemSoap[] soapModels = new StockItemSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StockItemSoap[][] toSoapModels(StockItem[][] models) {
		StockItemSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StockItemSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StockItemSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StockItemSoap[] toSoapModels(List<StockItem> models) {
		List<StockItemSoap> soapModels = new ArrayList<StockItemSoap>(models.size());

		for (StockItem model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StockItemSoap[soapModels.size()]);
	}

	public StockItemSoap() {
	}

	public long getPrimaryKey() {
		return _stockItemId;
	}

	public void setPrimaryKey(long pk) {
		setStockItemId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getStockItemId() {
		return _stockItemId;
	}

	public void setStockItemId(long stockItemId) {
		_stockItemId = stockItemId;
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

	public long getBookId() {
		return _bookId;
	}

	public void setBookId(long bookId) {
		_bookId = bookId;
	}

	public int getRemainingQuantity() {
		return _remainingQuantity;
	}

	public void setRemainingQuantity(int remainingQuantity) {
		_remainingQuantity = remainingQuantity;
	}

	private String _uuid;
	private long _stockItemId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _bookId;
	private int _remainingQuantity;
}
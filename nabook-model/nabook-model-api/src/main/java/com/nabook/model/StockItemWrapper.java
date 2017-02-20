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
 * This class is a wrapper for {@link StockItem}.
 * </p>
 *
 * @author phantoan
 * @see StockItem
 * @generated
 */
@ProviderType
public class StockItemWrapper implements StockItem, ModelWrapper<StockItem> {
	public StockItemWrapper(StockItem stockItem) {
		_stockItem = stockItem;
	}

	@Override
	public Class<?> getModelClass() {
		return StockItem.class;
	}

	@Override
	public String getModelClassName() {
		return StockItem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("stockItemId", getStockItemId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("bookId", getBookId());
		attributes.put("remainingQuantity", getRemainingQuantity());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long stockItemId = (Long)attributes.get("stockItemId");

		if (stockItemId != null) {
			setStockItemId(stockItemId);
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

		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		Integer remainingQuantity = (Integer)attributes.get("remainingQuantity");

		if (remainingQuantity != null) {
			setRemainingQuantity(remainingQuantity);
		}
	}

	@Override
	public StockItem toEscapedModel() {
		return new StockItemWrapper(_stockItem.toEscapedModel());
	}

	@Override
	public StockItem toUnescapedModel() {
		return new StockItemWrapper(_stockItem.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _stockItem.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _stockItem.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _stockItem.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _stockItem.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<StockItem> toCacheModel() {
		return _stockItem.toCacheModel();
	}

	@Override
	public int compareTo(StockItem stockItem) {
		return _stockItem.compareTo(stockItem);
	}

	/**
	* Returns the remaining quantity of this stock item.
	*
	* @return the remaining quantity of this stock item
	*/
	@Override
	public int getRemainingQuantity() {
		return _stockItem.getRemainingQuantity();
	}

	@Override
	public int hashCode() {
		return _stockItem.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _stockItem.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new StockItemWrapper((StockItem)_stockItem.clone());
	}

	/**
	* Returns the user name of this stock item.
	*
	* @return the user name of this stock item
	*/
	@Override
	public java.lang.String getUserName() {
		return _stockItem.getUserName();
	}

	/**
	* Returns the user uuid of this stock item.
	*
	* @return the user uuid of this stock item
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _stockItem.getUserUuid();
	}

	/**
	* Returns the uuid of this stock item.
	*
	* @return the uuid of this stock item
	*/
	@Override
	public java.lang.String getUuid() {
		return _stockItem.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _stockItem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _stockItem.toXmlString();
	}

	/**
	* Returns the create date of this stock item.
	*
	* @return the create date of this stock item
	*/
	@Override
	public Date getCreateDate() {
		return _stockItem.getCreateDate();
	}

	/**
	* Returns the modified date of this stock item.
	*
	* @return the modified date of this stock item
	*/
	@Override
	public Date getModifiedDate() {
		return _stockItem.getModifiedDate();
	}

	/**
	* Returns the book ID of this stock item.
	*
	* @return the book ID of this stock item
	*/
	@Override
	public long getBookId() {
		return _stockItem.getBookId();
	}

	/**
	* Returns the company ID of this stock item.
	*
	* @return the company ID of this stock item
	*/
	@Override
	public long getCompanyId() {
		return _stockItem.getCompanyId();
	}

	/**
	* Returns the group ID of this stock item.
	*
	* @return the group ID of this stock item
	*/
	@Override
	public long getGroupId() {
		return _stockItem.getGroupId();
	}

	/**
	* Returns the primary key of this stock item.
	*
	* @return the primary key of this stock item
	*/
	@Override
	public long getPrimaryKey() {
		return _stockItem.getPrimaryKey();
	}

	/**
	* Returns the stock item ID of this stock item.
	*
	* @return the stock item ID of this stock item
	*/
	@Override
	public long getStockItemId() {
		return _stockItem.getStockItemId();
	}

	/**
	* Returns the user ID of this stock item.
	*
	* @return the user ID of this stock item
	*/
	@Override
	public long getUserId() {
		return _stockItem.getUserId();
	}

	@Override
	public void persist() {
		_stockItem.persist();
	}

	/**
	* Sets the book ID of this stock item.
	*
	* @param bookId the book ID of this stock item
	*/
	@Override
	public void setBookId(long bookId) {
		_stockItem.setBookId(bookId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_stockItem.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this stock item.
	*
	* @param companyId the company ID of this stock item
	*/
	@Override
	public void setCompanyId(long companyId) {
		_stockItem.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this stock item.
	*
	* @param createDate the create date of this stock item
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_stockItem.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_stockItem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_stockItem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_stockItem.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this stock item.
	*
	* @param groupId the group ID of this stock item
	*/
	@Override
	public void setGroupId(long groupId) {
		_stockItem.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this stock item.
	*
	* @param modifiedDate the modified date of this stock item
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_stockItem.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_stockItem.setNew(n);
	}

	/**
	* Sets the primary key of this stock item.
	*
	* @param primaryKey the primary key of this stock item
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_stockItem.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_stockItem.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remaining quantity of this stock item.
	*
	* @param remainingQuantity the remaining quantity of this stock item
	*/
	@Override
	public void setRemainingQuantity(int remainingQuantity) {
		_stockItem.setRemainingQuantity(remainingQuantity);
	}

	/**
	* Sets the stock item ID of this stock item.
	*
	* @param stockItemId the stock item ID of this stock item
	*/
	@Override
	public void setStockItemId(long stockItemId) {
		_stockItem.setStockItemId(stockItemId);
	}

	/**
	* Sets the user ID of this stock item.
	*
	* @param userId the user ID of this stock item
	*/
	@Override
	public void setUserId(long userId) {
		_stockItem.setUserId(userId);
	}

	/**
	* Sets the user name of this stock item.
	*
	* @param userName the user name of this stock item
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_stockItem.setUserName(userName);
	}

	/**
	* Sets the user uuid of this stock item.
	*
	* @param userUuid the user uuid of this stock item
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_stockItem.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this stock item.
	*
	* @param uuid the uuid of this stock item
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_stockItem.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StockItemWrapper)) {
			return false;
		}

		StockItemWrapper stockItemWrapper = (StockItemWrapper)obj;

		if (Objects.equals(_stockItem, stockItemWrapper._stockItem)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _stockItem.getStagedModelType();
	}

	@Override
	public StockItem getWrappedModel() {
		return _stockItem;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _stockItem.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _stockItem.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_stockItem.resetOriginalValues();
	}

	private final StockItem _stockItem;
}
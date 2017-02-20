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
 * This class is a wrapper for {@link OrderItem}.
 * </p>
 *
 * @author phantoan
 * @see OrderItem
 * @generated
 */
@ProviderType
public class OrderItemWrapper implements OrderItem, ModelWrapper<OrderItem> {
	public OrderItemWrapper(OrderItem orderItem) {
		_orderItem = orderItem;
	}

	@Override
	public Class<?> getModelClass() {
		return OrderItem.class;
	}

	@Override
	public String getModelClassName() {
		return OrderItem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("orderItemId", getOrderItemId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("bookOrderId", getBookOrderId());
		attributes.put("bookId", getBookId());
		attributes.put("price", getPrice());
		attributes.put("quantity", getQuantity());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long orderItemId = (Long)attributes.get("orderItemId");

		if (orderItemId != null) {
			setOrderItemId(orderItemId);
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

		Long bookOrderId = (Long)attributes.get("bookOrderId");

		if (bookOrderId != null) {
			setBookOrderId(bookOrderId);
		}

		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		String price = (String)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Integer quantity = (Integer)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}
	}

	@Override
	public OrderItem toEscapedModel() {
		return new OrderItemWrapper(_orderItem.toEscapedModel());
	}

	@Override
	public OrderItem toUnescapedModel() {
		return new OrderItemWrapper(_orderItem.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _orderItem.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _orderItem.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _orderItem.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _orderItem.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<OrderItem> toCacheModel() {
		return _orderItem.toCacheModel();
	}

	@Override
	public int compareTo(OrderItem orderItem) {
		return _orderItem.compareTo(orderItem);
	}

	/**
	* Returns the quantity of this order item.
	*
	* @return the quantity of this order item
	*/
	@Override
	public int getQuantity() {
		return _orderItem.getQuantity();
	}

	@Override
	public int hashCode() {
		return _orderItem.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _orderItem.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new OrderItemWrapper((OrderItem)_orderItem.clone());
	}

	/**
	* Returns the price of this order item.
	*
	* @return the price of this order item
	*/
	@Override
	public java.lang.String getPrice() {
		return _orderItem.getPrice();
	}

	/**
	* Returns the user name of this order item.
	*
	* @return the user name of this order item
	*/
	@Override
	public java.lang.String getUserName() {
		return _orderItem.getUserName();
	}

	/**
	* Returns the user uuid of this order item.
	*
	* @return the user uuid of this order item
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _orderItem.getUserUuid();
	}

	/**
	* Returns the uuid of this order item.
	*
	* @return the uuid of this order item
	*/
	@Override
	public java.lang.String getUuid() {
		return _orderItem.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _orderItem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _orderItem.toXmlString();
	}

	/**
	* Returns the create date of this order item.
	*
	* @return the create date of this order item
	*/
	@Override
	public Date getCreateDate() {
		return _orderItem.getCreateDate();
	}

	/**
	* Returns the modified date of this order item.
	*
	* @return the modified date of this order item
	*/
	@Override
	public Date getModifiedDate() {
		return _orderItem.getModifiedDate();
	}

	/**
	* Returns the book ID of this order item.
	*
	* @return the book ID of this order item
	*/
	@Override
	public long getBookId() {
		return _orderItem.getBookId();
	}

	/**
	* Returns the book order ID of this order item.
	*
	* @return the book order ID of this order item
	*/
	@Override
	public long getBookOrderId() {
		return _orderItem.getBookOrderId();
	}

	/**
	* Returns the company ID of this order item.
	*
	* @return the company ID of this order item
	*/
	@Override
	public long getCompanyId() {
		return _orderItem.getCompanyId();
	}

	/**
	* Returns the group ID of this order item.
	*
	* @return the group ID of this order item
	*/
	@Override
	public long getGroupId() {
		return _orderItem.getGroupId();
	}

	/**
	* Returns the order item ID of this order item.
	*
	* @return the order item ID of this order item
	*/
	@Override
	public long getOrderItemId() {
		return _orderItem.getOrderItemId();
	}

	/**
	* Returns the primary key of this order item.
	*
	* @return the primary key of this order item
	*/
	@Override
	public long getPrimaryKey() {
		return _orderItem.getPrimaryKey();
	}

	/**
	* Returns the user ID of this order item.
	*
	* @return the user ID of this order item
	*/
	@Override
	public long getUserId() {
		return _orderItem.getUserId();
	}

	@Override
	public void persist() {
		_orderItem.persist();
	}

	/**
	* Sets the book ID of this order item.
	*
	* @param bookId the book ID of this order item
	*/
	@Override
	public void setBookId(long bookId) {
		_orderItem.setBookId(bookId);
	}

	/**
	* Sets the book order ID of this order item.
	*
	* @param bookOrderId the book order ID of this order item
	*/
	@Override
	public void setBookOrderId(long bookOrderId) {
		_orderItem.setBookOrderId(bookOrderId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_orderItem.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this order item.
	*
	* @param companyId the company ID of this order item
	*/
	@Override
	public void setCompanyId(long companyId) {
		_orderItem.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this order item.
	*
	* @param createDate the create date of this order item
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_orderItem.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_orderItem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_orderItem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_orderItem.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this order item.
	*
	* @param groupId the group ID of this order item
	*/
	@Override
	public void setGroupId(long groupId) {
		_orderItem.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this order item.
	*
	* @param modifiedDate the modified date of this order item
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_orderItem.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_orderItem.setNew(n);
	}

	/**
	* Sets the order item ID of this order item.
	*
	* @param orderItemId the order item ID of this order item
	*/
	@Override
	public void setOrderItemId(long orderItemId) {
		_orderItem.setOrderItemId(orderItemId);
	}

	/**
	* Sets the price of this order item.
	*
	* @param price the price of this order item
	*/
	@Override
	public void setPrice(java.lang.String price) {
		_orderItem.setPrice(price);
	}

	/**
	* Sets the primary key of this order item.
	*
	* @param primaryKey the primary key of this order item
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_orderItem.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_orderItem.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the quantity of this order item.
	*
	* @param quantity the quantity of this order item
	*/
	@Override
	public void setQuantity(int quantity) {
		_orderItem.setQuantity(quantity);
	}

	/**
	* Sets the user ID of this order item.
	*
	* @param userId the user ID of this order item
	*/
	@Override
	public void setUserId(long userId) {
		_orderItem.setUserId(userId);
	}

	/**
	* Sets the user name of this order item.
	*
	* @param userName the user name of this order item
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_orderItem.setUserName(userName);
	}

	/**
	* Sets the user uuid of this order item.
	*
	* @param userUuid the user uuid of this order item
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_orderItem.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this order item.
	*
	* @param uuid the uuid of this order item
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_orderItem.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrderItemWrapper)) {
			return false;
		}

		OrderItemWrapper orderItemWrapper = (OrderItemWrapper)obj;

		if (Objects.equals(_orderItem, orderItemWrapper._orderItem)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _orderItem.getStagedModelType();
	}

	@Override
	public OrderItem getWrappedModel() {
		return _orderItem;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _orderItem.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _orderItem.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_orderItem.resetOriginalValues();
	}

	private final OrderItem _orderItem;
}
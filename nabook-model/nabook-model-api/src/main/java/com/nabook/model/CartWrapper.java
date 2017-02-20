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
 * This class is a wrapper for {@link Cart}.
 * </p>
 *
 * @author phantoan
 * @see Cart
 * @generated
 */
@ProviderType
public class CartWrapper implements Cart, ModelWrapper<Cart> {
	public CartWrapper(Cart cart) {
		_cart = cart;
	}

	@Override
	public Class<?> getModelClass() {
		return Cart.class;
	}

	@Override
	public String getModelClassName() {
		return Cart.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("cartId", getCartId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("bookId", getBookId());
		attributes.put("quantity", getQuantity());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long cartId = (Long)attributes.get("cartId");

		if (cartId != null) {
			setCartId(cartId);
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

		Integer quantity = (Integer)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}
	}

	@Override
	public Cart toEscapedModel() {
		return new CartWrapper(_cart.toEscapedModel());
	}

	@Override
	public Cart toUnescapedModel() {
		return new CartWrapper(_cart.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _cart.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cart.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cart.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cart.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Cart> toCacheModel() {
		return _cart.toCacheModel();
	}

	@Override
	public int compareTo(Cart cart) {
		return _cart.compareTo(cart);
	}

	/**
	* Returns the quantity of this cart.
	*
	* @return the quantity of this cart
	*/
	@Override
	public int getQuantity() {
		return _cart.getQuantity();
	}

	@Override
	public int hashCode() {
		return _cart.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cart.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CartWrapper((Cart)_cart.clone());
	}

	/**
	* Returns the user name of this cart.
	*
	* @return the user name of this cart
	*/
	@Override
	public java.lang.String getUserName() {
		return _cart.getUserName();
	}

	/**
	* Returns the user uuid of this cart.
	*
	* @return the user uuid of this cart
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _cart.getUserUuid();
	}

	/**
	* Returns the uuid of this cart.
	*
	* @return the uuid of this cart
	*/
	@Override
	public java.lang.String getUuid() {
		return _cart.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _cart.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cart.toXmlString();
	}

	/**
	* Returns the create date of this cart.
	*
	* @return the create date of this cart
	*/
	@Override
	public Date getCreateDate() {
		return _cart.getCreateDate();
	}

	/**
	* Returns the modified date of this cart.
	*
	* @return the modified date of this cart
	*/
	@Override
	public Date getModifiedDate() {
		return _cart.getModifiedDate();
	}

	/**
	* Returns the book ID of this cart.
	*
	* @return the book ID of this cart
	*/
	@Override
	public long getBookId() {
		return _cart.getBookId();
	}

	/**
	* Returns the cart ID of this cart.
	*
	* @return the cart ID of this cart
	*/
	@Override
	public long getCartId() {
		return _cart.getCartId();
	}

	/**
	* Returns the company ID of this cart.
	*
	* @return the company ID of this cart
	*/
	@Override
	public long getCompanyId() {
		return _cart.getCompanyId();
	}

	/**
	* Returns the group ID of this cart.
	*
	* @return the group ID of this cart
	*/
	@Override
	public long getGroupId() {
		return _cart.getGroupId();
	}

	/**
	* Returns the primary key of this cart.
	*
	* @return the primary key of this cart
	*/
	@Override
	public long getPrimaryKey() {
		return _cart.getPrimaryKey();
	}

	/**
	* Returns the user ID of this cart.
	*
	* @return the user ID of this cart
	*/
	@Override
	public long getUserId() {
		return _cart.getUserId();
	}

	@Override
	public void persist() {
		_cart.persist();
	}

	/**
	* Sets the book ID of this cart.
	*
	* @param bookId the book ID of this cart
	*/
	@Override
	public void setBookId(long bookId) {
		_cart.setBookId(bookId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cart.setCachedModel(cachedModel);
	}

	/**
	* Sets the cart ID of this cart.
	*
	* @param cartId the cart ID of this cart
	*/
	@Override
	public void setCartId(long cartId) {
		_cart.setCartId(cartId);
	}

	/**
	* Sets the company ID of this cart.
	*
	* @param companyId the company ID of this cart
	*/
	@Override
	public void setCompanyId(long companyId) {
		_cart.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this cart.
	*
	* @param createDate the create date of this cart
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_cart.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cart.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cart.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cart.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this cart.
	*
	* @param groupId the group ID of this cart
	*/
	@Override
	public void setGroupId(long groupId) {
		_cart.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this cart.
	*
	* @param modifiedDate the modified date of this cart
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_cart.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_cart.setNew(n);
	}

	/**
	* Sets the primary key of this cart.
	*
	* @param primaryKey the primary key of this cart
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cart.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cart.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the quantity of this cart.
	*
	* @param quantity the quantity of this cart
	*/
	@Override
	public void setQuantity(int quantity) {
		_cart.setQuantity(quantity);
	}

	/**
	* Sets the user ID of this cart.
	*
	* @param userId the user ID of this cart
	*/
	@Override
	public void setUserId(long userId) {
		_cart.setUserId(userId);
	}

	/**
	* Sets the user name of this cart.
	*
	* @param userName the user name of this cart
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_cart.setUserName(userName);
	}

	/**
	* Sets the user uuid of this cart.
	*
	* @param userUuid the user uuid of this cart
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_cart.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this cart.
	*
	* @param uuid the uuid of this cart
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_cart.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CartWrapper)) {
			return false;
		}

		CartWrapper cartWrapper = (CartWrapper)obj;

		if (Objects.equals(_cart, cartWrapper._cart)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _cart.getStagedModelType();
	}

	@Override
	public Cart getWrappedModel() {
		return _cart;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cart.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cart.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cart.resetOriginalValues();
	}

	private final Cart _cart;
}
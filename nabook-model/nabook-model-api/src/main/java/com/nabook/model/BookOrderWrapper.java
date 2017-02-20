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
 * This class is a wrapper for {@link BookOrder}.
 * </p>
 *
 * @author phantoan
 * @see BookOrder
 * @generated
 */
@ProviderType
public class BookOrderWrapper implements BookOrder, ModelWrapper<BookOrder> {
	public BookOrderWrapper(BookOrder bookOrder) {
		_bookOrder = bookOrder;
	}

	@Override
	public Class<?> getModelClass() {
		return BookOrder.class;
	}

	@Override
	public String getModelClassName() {
		return BookOrder.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bookOrderId", getBookOrderId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("status", getStatus());
		attributes.put("billingName", getBillingName());
		attributes.put("billingCountry", getBillingCountry());
		attributes.put("billingCity", getBillingCity());
		attributes.put("billingPrefecture", getBillingPrefecture());
		attributes.put("billingStreet", getBillingStreet());
		attributes.put("billingZip", getBillingZip());
		attributes.put("shipToBilling", getShipToBilling());
		attributes.put("shippingName", getShippingName());
		attributes.put("shippingCountry", getShippingCountry());
		attributes.put("shippingCity", getShippingCity());
		attributes.put("shippingPrefecture", getShippingPrefecture());
		attributes.put("shippingStreet", getShippingStreet());
		attributes.put("shippingZip", getShippingZip());
		attributes.put("phone", getPhone());
		attributes.put("total", getTotal());
		attributes.put("tax", getTax());
		attributes.put("discount", getDiscount());
		attributes.put("shipfee", getShipfee());
		attributes.put("payment", getPayment());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long bookOrderId = (Long)attributes.get("bookOrderId");

		if (bookOrderId != null) {
			setBookOrderId(bookOrderId);
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

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String billingName = (String)attributes.get("billingName");

		if (billingName != null) {
			setBillingName(billingName);
		}

		String billingCountry = (String)attributes.get("billingCountry");

		if (billingCountry != null) {
			setBillingCountry(billingCountry);
		}

		String billingCity = (String)attributes.get("billingCity");

		if (billingCity != null) {
			setBillingCity(billingCity);
		}

		String billingPrefecture = (String)attributes.get("billingPrefecture");

		if (billingPrefecture != null) {
			setBillingPrefecture(billingPrefecture);
		}

		String billingStreet = (String)attributes.get("billingStreet");

		if (billingStreet != null) {
			setBillingStreet(billingStreet);
		}

		String billingZip = (String)attributes.get("billingZip");

		if (billingZip != null) {
			setBillingZip(billingZip);
		}

		Boolean shipToBilling = (Boolean)attributes.get("shipToBilling");

		if (shipToBilling != null) {
			setShipToBilling(shipToBilling);
		}

		String shippingName = (String)attributes.get("shippingName");

		if (shippingName != null) {
			setShippingName(shippingName);
		}

		String shippingCountry = (String)attributes.get("shippingCountry");

		if (shippingCountry != null) {
			setShippingCountry(shippingCountry);
		}

		String shippingCity = (String)attributes.get("shippingCity");

		if (shippingCity != null) {
			setShippingCity(shippingCity);
		}

		String shippingPrefecture = (String)attributes.get("shippingPrefecture");

		if (shippingPrefecture != null) {
			setShippingPrefecture(shippingPrefecture);
		}

		String shippingStreet = (String)attributes.get("shippingStreet");

		if (shippingStreet != null) {
			setShippingStreet(shippingStreet);
		}

		String shippingZip = (String)attributes.get("shippingZip");

		if (shippingZip != null) {
			setShippingZip(shippingZip);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String total = (String)attributes.get("total");

		if (total != null) {
			setTotal(total);
		}

		Integer tax = (Integer)attributes.get("tax");

		if (tax != null) {
			setTax(tax);
		}

		Integer discount = (Integer)attributes.get("discount");

		if (discount != null) {
			setDiscount(discount);
		}

		String shipfee = (String)attributes.get("shipfee");

		if (shipfee != null) {
			setShipfee(shipfee);
		}

		String payment = (String)attributes.get("payment");

		if (payment != null) {
			setPayment(payment);
		}
	}

	@Override
	public BookOrder toEscapedModel() {
		return new BookOrderWrapper(_bookOrder.toEscapedModel());
	}

	@Override
	public BookOrder toUnescapedModel() {
		return new BookOrderWrapper(_bookOrder.toUnescapedModel());
	}

	/**
	* Returns the ship to billing of this book order.
	*
	* @return the ship to billing of this book order
	*/
	@Override
	public boolean getShipToBilling() {
		return _bookOrder.getShipToBilling();
	}

	@Override
	public boolean isCachedModel() {
		return _bookOrder.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _bookOrder.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _bookOrder.isNew();
	}

	/**
	* Returns <code>true</code> if this book order is ship to billing.
	*
	* @return <code>true</code> if this book order is ship to billing; <code>false</code> otherwise
	*/
	@Override
	public boolean isShipToBilling() {
		return _bookOrder.isShipToBilling();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _bookOrder.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<BookOrder> toCacheModel() {
		return _bookOrder.toCacheModel();
	}

	@Override
	public int compareTo(BookOrder bookOrder) {
		return _bookOrder.compareTo(bookOrder);
	}

	/**
	* Returns the discount of this book order.
	*
	* @return the discount of this book order
	*/
	@Override
	public int getDiscount() {
		return _bookOrder.getDiscount();
	}

	/**
	* Returns the tax of this book order.
	*
	* @return the tax of this book order
	*/
	@Override
	public int getTax() {
		return _bookOrder.getTax();
	}

	@Override
	public int hashCode() {
		return _bookOrder.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bookOrder.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new BookOrderWrapper((BookOrder)_bookOrder.clone());
	}

	/**
	* Returns the billing city of this book order.
	*
	* @return the billing city of this book order
	*/
	@Override
	public java.lang.String getBillingCity() {
		return _bookOrder.getBillingCity();
	}

	/**
	* Returns the billing country of this book order.
	*
	* @return the billing country of this book order
	*/
	@Override
	public java.lang.String getBillingCountry() {
		return _bookOrder.getBillingCountry();
	}

	/**
	* Returns the billing name of this book order.
	*
	* @return the billing name of this book order
	*/
	@Override
	public java.lang.String getBillingName() {
		return _bookOrder.getBillingName();
	}

	/**
	* Returns the billing prefecture of this book order.
	*
	* @return the billing prefecture of this book order
	*/
	@Override
	public java.lang.String getBillingPrefecture() {
		return _bookOrder.getBillingPrefecture();
	}

	/**
	* Returns the billing street of this book order.
	*
	* @return the billing street of this book order
	*/
	@Override
	public java.lang.String getBillingStreet() {
		return _bookOrder.getBillingStreet();
	}

	/**
	* Returns the billing zip of this book order.
	*
	* @return the billing zip of this book order
	*/
	@Override
	public java.lang.String getBillingZip() {
		return _bookOrder.getBillingZip();
	}

	/**
	* Returns the payment of this book order.
	*
	* @return the payment of this book order
	*/
	@Override
	public java.lang.String getPayment() {
		return _bookOrder.getPayment();
	}

	/**
	* Returns the phone of this book order.
	*
	* @return the phone of this book order
	*/
	@Override
	public java.lang.String getPhone() {
		return _bookOrder.getPhone();
	}

	/**
	* Returns the shipfee of this book order.
	*
	* @return the shipfee of this book order
	*/
	@Override
	public java.lang.String getShipfee() {
		return _bookOrder.getShipfee();
	}

	/**
	* Returns the shipping city of this book order.
	*
	* @return the shipping city of this book order
	*/
	@Override
	public java.lang.String getShippingCity() {
		return _bookOrder.getShippingCity();
	}

	/**
	* Returns the shipping country of this book order.
	*
	* @return the shipping country of this book order
	*/
	@Override
	public java.lang.String getShippingCountry() {
		return _bookOrder.getShippingCountry();
	}

	/**
	* Returns the shipping name of this book order.
	*
	* @return the shipping name of this book order
	*/
	@Override
	public java.lang.String getShippingName() {
		return _bookOrder.getShippingName();
	}

	/**
	* Returns the shipping prefecture of this book order.
	*
	* @return the shipping prefecture of this book order
	*/
	@Override
	public java.lang.String getShippingPrefecture() {
		return _bookOrder.getShippingPrefecture();
	}

	/**
	* Returns the shipping street of this book order.
	*
	* @return the shipping street of this book order
	*/
	@Override
	public java.lang.String getShippingStreet() {
		return _bookOrder.getShippingStreet();
	}

	/**
	* Returns the shipping zip of this book order.
	*
	* @return the shipping zip of this book order
	*/
	@Override
	public java.lang.String getShippingZip() {
		return _bookOrder.getShippingZip();
	}

	/**
	* Returns the status of this book order.
	*
	* @return the status of this book order
	*/
	@Override
	public java.lang.String getStatus() {
		return _bookOrder.getStatus();
	}

	/**
	* Returns the total of this book order.
	*
	* @return the total of this book order
	*/
	@Override
	public java.lang.String getTotal() {
		return _bookOrder.getTotal();
	}

	/**
	* Returns the user name of this book order.
	*
	* @return the user name of this book order
	*/
	@Override
	public java.lang.String getUserName() {
		return _bookOrder.getUserName();
	}

	/**
	* Returns the user uuid of this book order.
	*
	* @return the user uuid of this book order
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _bookOrder.getUserUuid();
	}

	/**
	* Returns the uuid of this book order.
	*
	* @return the uuid of this book order
	*/
	@Override
	public java.lang.String getUuid() {
		return _bookOrder.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _bookOrder.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bookOrder.toXmlString();
	}

	/**
	* Returns the create date of this book order.
	*
	* @return the create date of this book order
	*/
	@Override
	public Date getCreateDate() {
		return _bookOrder.getCreateDate();
	}

	/**
	* Returns the modified date of this book order.
	*
	* @return the modified date of this book order
	*/
	@Override
	public Date getModifiedDate() {
		return _bookOrder.getModifiedDate();
	}

	/**
	* Returns the book order ID of this book order.
	*
	* @return the book order ID of this book order
	*/
	@Override
	public long getBookOrderId() {
		return _bookOrder.getBookOrderId();
	}

	/**
	* Returns the company ID of this book order.
	*
	* @return the company ID of this book order
	*/
	@Override
	public long getCompanyId() {
		return _bookOrder.getCompanyId();
	}

	/**
	* Returns the group ID of this book order.
	*
	* @return the group ID of this book order
	*/
	@Override
	public long getGroupId() {
		return _bookOrder.getGroupId();
	}

	/**
	* Returns the primary key of this book order.
	*
	* @return the primary key of this book order
	*/
	@Override
	public long getPrimaryKey() {
		return _bookOrder.getPrimaryKey();
	}

	/**
	* Returns the user ID of this book order.
	*
	* @return the user ID of this book order
	*/
	@Override
	public long getUserId() {
		return _bookOrder.getUserId();
	}

	@Override
	public void persist() {
		_bookOrder.persist();
	}

	/**
	* Sets the billing city of this book order.
	*
	* @param billingCity the billing city of this book order
	*/
	@Override
	public void setBillingCity(java.lang.String billingCity) {
		_bookOrder.setBillingCity(billingCity);
	}

	/**
	* Sets the billing country of this book order.
	*
	* @param billingCountry the billing country of this book order
	*/
	@Override
	public void setBillingCountry(java.lang.String billingCountry) {
		_bookOrder.setBillingCountry(billingCountry);
	}

	/**
	* Sets the billing name of this book order.
	*
	* @param billingName the billing name of this book order
	*/
	@Override
	public void setBillingName(java.lang.String billingName) {
		_bookOrder.setBillingName(billingName);
	}

	/**
	* Sets the billing prefecture of this book order.
	*
	* @param billingPrefecture the billing prefecture of this book order
	*/
	@Override
	public void setBillingPrefecture(java.lang.String billingPrefecture) {
		_bookOrder.setBillingPrefecture(billingPrefecture);
	}

	/**
	* Sets the billing street of this book order.
	*
	* @param billingStreet the billing street of this book order
	*/
	@Override
	public void setBillingStreet(java.lang.String billingStreet) {
		_bookOrder.setBillingStreet(billingStreet);
	}

	/**
	* Sets the billing zip of this book order.
	*
	* @param billingZip the billing zip of this book order
	*/
	@Override
	public void setBillingZip(java.lang.String billingZip) {
		_bookOrder.setBillingZip(billingZip);
	}

	/**
	* Sets the book order ID of this book order.
	*
	* @param bookOrderId the book order ID of this book order
	*/
	@Override
	public void setBookOrderId(long bookOrderId) {
		_bookOrder.setBookOrderId(bookOrderId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bookOrder.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this book order.
	*
	* @param companyId the company ID of this book order
	*/
	@Override
	public void setCompanyId(long companyId) {
		_bookOrder.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this book order.
	*
	* @param createDate the create date of this book order
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_bookOrder.setCreateDate(createDate);
	}

	/**
	* Sets the discount of this book order.
	*
	* @param discount the discount of this book order
	*/
	@Override
	public void setDiscount(int discount) {
		_bookOrder.setDiscount(discount);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_bookOrder.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_bookOrder.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_bookOrder.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this book order.
	*
	* @param groupId the group ID of this book order
	*/
	@Override
	public void setGroupId(long groupId) {
		_bookOrder.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this book order.
	*
	* @param modifiedDate the modified date of this book order
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_bookOrder.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_bookOrder.setNew(n);
	}

	/**
	* Sets the payment of this book order.
	*
	* @param payment the payment of this book order
	*/
	@Override
	public void setPayment(java.lang.String payment) {
		_bookOrder.setPayment(payment);
	}

	/**
	* Sets the phone of this book order.
	*
	* @param phone the phone of this book order
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_bookOrder.setPhone(phone);
	}

	/**
	* Sets the primary key of this book order.
	*
	* @param primaryKey the primary key of this book order
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bookOrder.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_bookOrder.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this book order is ship to billing.
	*
	* @param shipToBilling the ship to billing of this book order
	*/
	@Override
	public void setShipToBilling(boolean shipToBilling) {
		_bookOrder.setShipToBilling(shipToBilling);
	}

	/**
	* Sets the shipfee of this book order.
	*
	* @param shipfee the shipfee of this book order
	*/
	@Override
	public void setShipfee(java.lang.String shipfee) {
		_bookOrder.setShipfee(shipfee);
	}

	/**
	* Sets the shipping city of this book order.
	*
	* @param shippingCity the shipping city of this book order
	*/
	@Override
	public void setShippingCity(java.lang.String shippingCity) {
		_bookOrder.setShippingCity(shippingCity);
	}

	/**
	* Sets the shipping country of this book order.
	*
	* @param shippingCountry the shipping country of this book order
	*/
	@Override
	public void setShippingCountry(java.lang.String shippingCountry) {
		_bookOrder.setShippingCountry(shippingCountry);
	}

	/**
	* Sets the shipping name of this book order.
	*
	* @param shippingName the shipping name of this book order
	*/
	@Override
	public void setShippingName(java.lang.String shippingName) {
		_bookOrder.setShippingName(shippingName);
	}

	/**
	* Sets the shipping prefecture of this book order.
	*
	* @param shippingPrefecture the shipping prefecture of this book order
	*/
	@Override
	public void setShippingPrefecture(java.lang.String shippingPrefecture) {
		_bookOrder.setShippingPrefecture(shippingPrefecture);
	}

	/**
	* Sets the shipping street of this book order.
	*
	* @param shippingStreet the shipping street of this book order
	*/
	@Override
	public void setShippingStreet(java.lang.String shippingStreet) {
		_bookOrder.setShippingStreet(shippingStreet);
	}

	/**
	* Sets the shipping zip of this book order.
	*
	* @param shippingZip the shipping zip of this book order
	*/
	@Override
	public void setShippingZip(java.lang.String shippingZip) {
		_bookOrder.setShippingZip(shippingZip);
	}

	/**
	* Sets the status of this book order.
	*
	* @param status the status of this book order
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_bookOrder.setStatus(status);
	}

	/**
	* Sets the tax of this book order.
	*
	* @param tax the tax of this book order
	*/
	@Override
	public void setTax(int tax) {
		_bookOrder.setTax(tax);
	}

	/**
	* Sets the total of this book order.
	*
	* @param total the total of this book order
	*/
	@Override
	public void setTotal(java.lang.String total) {
		_bookOrder.setTotal(total);
	}

	/**
	* Sets the user ID of this book order.
	*
	* @param userId the user ID of this book order
	*/
	@Override
	public void setUserId(long userId) {
		_bookOrder.setUserId(userId);
	}

	/**
	* Sets the user name of this book order.
	*
	* @param userName the user name of this book order
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_bookOrder.setUserName(userName);
	}

	/**
	* Sets the user uuid of this book order.
	*
	* @param userUuid the user uuid of this book order
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_bookOrder.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this book order.
	*
	* @param uuid the uuid of this book order
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_bookOrder.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BookOrderWrapper)) {
			return false;
		}

		BookOrderWrapper bookOrderWrapper = (BookOrderWrapper)obj;

		if (Objects.equals(_bookOrder, bookOrderWrapper._bookOrder)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _bookOrder.getStagedModelType();
	}

	@Override
	public BookOrder getWrappedModel() {
		return _bookOrder;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _bookOrder.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _bookOrder.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_bookOrder.resetOriginalValues();
	}

	private final BookOrder _bookOrder;
}
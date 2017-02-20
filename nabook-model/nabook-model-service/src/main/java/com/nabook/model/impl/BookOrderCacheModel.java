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

package com.nabook.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.nabook.model.BookOrder;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BookOrder in entity cache.
 *
 * @author phantoan
 * @see BookOrder
 * @generated
 */
@ProviderType
public class BookOrderCacheModel implements CacheModel<BookOrder>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BookOrderCacheModel)) {
			return false;
		}

		BookOrderCacheModel bookOrderCacheModel = (BookOrderCacheModel)obj;

		if (bookOrderId == bookOrderCacheModel.bookOrderId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bookOrderId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", bookOrderId=");
		sb.append(bookOrderId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", status=");
		sb.append(status);
		sb.append(", billingName=");
		sb.append(billingName);
		sb.append(", billingCountry=");
		sb.append(billingCountry);
		sb.append(", billingCity=");
		sb.append(billingCity);
		sb.append(", billingPrefecture=");
		sb.append(billingPrefecture);
		sb.append(", billingStreet=");
		sb.append(billingStreet);
		sb.append(", billingZip=");
		sb.append(billingZip);
		sb.append(", shipToBilling=");
		sb.append(shipToBilling);
		sb.append(", shippingName=");
		sb.append(shippingName);
		sb.append(", shippingCountry=");
		sb.append(shippingCountry);
		sb.append(", shippingCity=");
		sb.append(shippingCity);
		sb.append(", shippingPrefecture=");
		sb.append(shippingPrefecture);
		sb.append(", shippingStreet=");
		sb.append(shippingStreet);
		sb.append(", shippingZip=");
		sb.append(shippingZip);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", total=");
		sb.append(total);
		sb.append(", tax=");
		sb.append(tax);
		sb.append(", discount=");
		sb.append(discount);
		sb.append(", shipfee=");
		sb.append(shipfee);
		sb.append(", payment=");
		sb.append(payment);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BookOrder toEntityModel() {
		BookOrderImpl bookOrderImpl = new BookOrderImpl();

		if (uuid == null) {
			bookOrderImpl.setUuid(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setUuid(uuid);
		}

		bookOrderImpl.setBookOrderId(bookOrderId);
		bookOrderImpl.setGroupId(groupId);
		bookOrderImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			bookOrderImpl.setCreateDate(null);
		}
		else {
			bookOrderImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			bookOrderImpl.setModifiedDate(null);
		}
		else {
			bookOrderImpl.setModifiedDate(new Date(modifiedDate));
		}

		bookOrderImpl.setUserId(userId);

		if (userName == null) {
			bookOrderImpl.setUserName(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setUserName(userName);
		}

		if (status == null) {
			bookOrderImpl.setStatus(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setStatus(status);
		}

		if (billingName == null) {
			bookOrderImpl.setBillingName(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setBillingName(billingName);
		}

		if (billingCountry == null) {
			bookOrderImpl.setBillingCountry(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setBillingCountry(billingCountry);
		}

		if (billingCity == null) {
			bookOrderImpl.setBillingCity(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setBillingCity(billingCity);
		}

		if (billingPrefecture == null) {
			bookOrderImpl.setBillingPrefecture(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setBillingPrefecture(billingPrefecture);
		}

		if (billingStreet == null) {
			bookOrderImpl.setBillingStreet(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setBillingStreet(billingStreet);
		}

		if (billingZip == null) {
			bookOrderImpl.setBillingZip(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setBillingZip(billingZip);
		}

		bookOrderImpl.setShipToBilling(shipToBilling);

		if (shippingName == null) {
			bookOrderImpl.setShippingName(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setShippingName(shippingName);
		}

		if (shippingCountry == null) {
			bookOrderImpl.setShippingCountry(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setShippingCountry(shippingCountry);
		}

		if (shippingCity == null) {
			bookOrderImpl.setShippingCity(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setShippingCity(shippingCity);
		}

		if (shippingPrefecture == null) {
			bookOrderImpl.setShippingPrefecture(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setShippingPrefecture(shippingPrefecture);
		}

		if (shippingStreet == null) {
			bookOrderImpl.setShippingStreet(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setShippingStreet(shippingStreet);
		}

		if (shippingZip == null) {
			bookOrderImpl.setShippingZip(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setShippingZip(shippingZip);
		}

		if (phone == null) {
			bookOrderImpl.setPhone(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setPhone(phone);
		}

		if (total == null) {
			bookOrderImpl.setTotal(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setTotal(total);
		}

		bookOrderImpl.setTax(tax);
		bookOrderImpl.setDiscount(discount);

		if (shipfee == null) {
			bookOrderImpl.setShipfee(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setShipfee(shipfee);
		}

		if (payment == null) {
			bookOrderImpl.setPayment(StringPool.BLANK);
		}
		else {
			bookOrderImpl.setPayment(payment);
		}

		bookOrderImpl.resetOriginalValues();

		return bookOrderImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		bookOrderId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		status = objectInput.readUTF();
		billingName = objectInput.readUTF();
		billingCountry = objectInput.readUTF();
		billingCity = objectInput.readUTF();
		billingPrefecture = objectInput.readUTF();
		billingStreet = objectInput.readUTF();
		billingZip = objectInput.readUTF();

		shipToBilling = objectInput.readBoolean();
		shippingName = objectInput.readUTF();
		shippingCountry = objectInput.readUTF();
		shippingCity = objectInput.readUTF();
		shippingPrefecture = objectInput.readUTF();
		shippingStreet = objectInput.readUTF();
		shippingZip = objectInput.readUTF();
		phone = objectInput.readUTF();
		total = objectInput.readUTF();

		tax = objectInput.readInt();

		discount = objectInput.readInt();
		shipfee = objectInput.readUTF();
		payment = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(bookOrderId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (billingName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(billingName);
		}

		if (billingCountry == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(billingCountry);
		}

		if (billingCity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(billingCity);
		}

		if (billingPrefecture == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(billingPrefecture);
		}

		if (billingStreet == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(billingStreet);
		}

		if (billingZip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(billingZip);
		}

		objectOutput.writeBoolean(shipToBilling);

		if (shippingName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shippingName);
		}

		if (shippingCountry == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shippingCountry);
		}

		if (shippingCity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shippingCity);
		}

		if (shippingPrefecture == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shippingPrefecture);
		}

		if (shippingStreet == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shippingStreet);
		}

		if (shippingZip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shippingZip);
		}

		if (phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone);
		}

		if (total == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(total);
		}

		objectOutput.writeInt(tax);

		objectOutput.writeInt(discount);

		if (shipfee == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipfee);
		}

		if (payment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(payment);
		}
	}

	public String uuid;
	public long bookOrderId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long userId;
	public String userName;
	public String status;
	public String billingName;
	public String billingCountry;
	public String billingCity;
	public String billingPrefecture;
	public String billingStreet;
	public String billingZip;
	public boolean shipToBilling;
	public String shippingName;
	public String shippingCountry;
	public String shippingCity;
	public String shippingPrefecture;
	public String shippingStreet;
	public String shippingZip;
	public String phone;
	public String total;
	public int tax;
	public int discount;
	public String shipfee;
	public String payment;
}
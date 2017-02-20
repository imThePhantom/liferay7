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

import com.nabook.model.OrderItem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OrderItem in entity cache.
 *
 * @author phantoan
 * @see OrderItem
 * @generated
 */
@ProviderType
public class OrderItemCacheModel implements CacheModel<OrderItem>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrderItemCacheModel)) {
			return false;
		}

		OrderItemCacheModel orderItemCacheModel = (OrderItemCacheModel)obj;

		if (orderItemId == orderItemCacheModel.orderItemId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, orderItemId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", orderItemId=");
		sb.append(orderItemId);
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
		sb.append(", bookOrderId=");
		sb.append(bookOrderId);
		sb.append(", bookId=");
		sb.append(bookId);
		sb.append(", price=");
		sb.append(price);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OrderItem toEntityModel() {
		OrderItemImpl orderItemImpl = new OrderItemImpl();

		if (uuid == null) {
			orderItemImpl.setUuid(StringPool.BLANK);
		}
		else {
			orderItemImpl.setUuid(uuid);
		}

		orderItemImpl.setOrderItemId(orderItemId);
		orderItemImpl.setGroupId(groupId);
		orderItemImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			orderItemImpl.setCreateDate(null);
		}
		else {
			orderItemImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			orderItemImpl.setModifiedDate(null);
		}
		else {
			orderItemImpl.setModifiedDate(new Date(modifiedDate));
		}

		orderItemImpl.setUserId(userId);

		if (userName == null) {
			orderItemImpl.setUserName(StringPool.BLANK);
		}
		else {
			orderItemImpl.setUserName(userName);
		}

		orderItemImpl.setBookOrderId(bookOrderId);
		orderItemImpl.setBookId(bookId);

		if (price == null) {
			orderItemImpl.setPrice(StringPool.BLANK);
		}
		else {
			orderItemImpl.setPrice(price);
		}

		orderItemImpl.setQuantity(quantity);

		orderItemImpl.resetOriginalValues();

		return orderItemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		orderItemId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();

		bookOrderId = objectInput.readLong();

		bookId = objectInput.readLong();
		price = objectInput.readUTF();

		quantity = objectInput.readInt();
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

		objectOutput.writeLong(orderItemId);

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

		objectOutput.writeLong(bookOrderId);

		objectOutput.writeLong(bookId);

		if (price == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(price);
		}

		objectOutput.writeInt(quantity);
	}

	public String uuid;
	public long orderItemId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long userId;
	public String userName;
	public long bookOrderId;
	public long bookId;
	public String price;
	public int quantity;
}
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

import com.nabook.model.StockItem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StockItem in entity cache.
 *
 * @author phantoan
 * @see StockItem
 * @generated
 */
@ProviderType
public class StockItemCacheModel implements CacheModel<StockItem>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StockItemCacheModel)) {
			return false;
		}

		StockItemCacheModel stockItemCacheModel = (StockItemCacheModel)obj;

		if (stockItemId == stockItemCacheModel.stockItemId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, stockItemId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", stockItemId=");
		sb.append(stockItemId);
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
		sb.append(", bookId=");
		sb.append(bookId);
		sb.append(", remainingQuantity=");
		sb.append(remainingQuantity);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public StockItem toEntityModel() {
		StockItemImpl stockItemImpl = new StockItemImpl();

		if (uuid == null) {
			stockItemImpl.setUuid(StringPool.BLANK);
		}
		else {
			stockItemImpl.setUuid(uuid);
		}

		stockItemImpl.setStockItemId(stockItemId);
		stockItemImpl.setGroupId(groupId);
		stockItemImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			stockItemImpl.setCreateDate(null);
		}
		else {
			stockItemImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			stockItemImpl.setModifiedDate(null);
		}
		else {
			stockItemImpl.setModifiedDate(new Date(modifiedDate));
		}

		stockItemImpl.setUserId(userId);

		if (userName == null) {
			stockItemImpl.setUserName(StringPool.BLANK);
		}
		else {
			stockItemImpl.setUserName(userName);
		}

		stockItemImpl.setBookId(bookId);
		stockItemImpl.setRemainingQuantity(remainingQuantity);

		stockItemImpl.resetOriginalValues();

		return stockItemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		stockItemId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();

		bookId = objectInput.readLong();

		remainingQuantity = objectInput.readInt();
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

		objectOutput.writeLong(stockItemId);

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

		objectOutput.writeLong(bookId);

		objectOutput.writeInt(remainingQuantity);
	}

	public String uuid;
	public long stockItemId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long userId;
	public String userName;
	public long bookId;
	public int remainingQuantity;
}
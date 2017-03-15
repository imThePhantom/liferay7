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

import com.nabook.model.Cart;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Cart in entity cache.
 *
 * @author phantoan
 * @see Cart
 * @generated
 */
@ProviderType
public class CartCacheModel implements CacheModel<Cart>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CartCacheModel)) {
			return false;
		}

		CartCacheModel cartCacheModel = (CartCacheModel)obj;

		if (cartId == cartCacheModel.cartId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cartId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", cartId=");
		sb.append(cartId);
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
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Cart toEntityModel() {
		CartImpl cartImpl = new CartImpl();

		if (uuid == null) {
			cartImpl.setUuid(StringPool.BLANK);
		}
		else {
			cartImpl.setUuid(uuid);
		}

		cartImpl.setCartId(cartId);
		cartImpl.setGroupId(groupId);
		cartImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			cartImpl.setCreateDate(null);
		}
		else {
			cartImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cartImpl.setModifiedDate(null);
		}
		else {
			cartImpl.setModifiedDate(new Date(modifiedDate));
		}

		cartImpl.setUserId(userId);

		if (userName == null) {
			cartImpl.setUserName(StringPool.BLANK);
		}
		else {
			cartImpl.setUserName(userName);
		}

		cartImpl.setBookId(bookId);
		cartImpl.setQuantity(quantity);

		cartImpl.resetOriginalValues();

		return cartImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		cartId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();

		bookId = objectInput.readLong();

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

		objectOutput.writeLong(cartId);

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

		objectOutput.writeInt(quantity);
	}

	public String uuid;
	public long cartId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long userId;
	public String userName;
	public long bookId;
	public int quantity;
}
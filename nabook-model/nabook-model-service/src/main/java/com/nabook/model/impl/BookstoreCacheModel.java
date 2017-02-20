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

import com.nabook.model.Bookstore;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Bookstore in entity cache.
 *
 * @author phantoan
 * @see Bookstore
 * @generated
 */
@ProviderType
public class BookstoreCacheModel implements CacheModel<Bookstore>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BookstoreCacheModel)) {
			return false;
		}

		BookstoreCacheModel bookstoreCacheModel = (BookstoreCacheModel)obj;

		if (bookstoreId == bookstoreCacheModel.bookstoreId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bookstoreId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", bookstoreId=");
		sb.append(bookstoreId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", country=");
		sb.append(country);
		sb.append(", city=");
		sb.append(city);
		sb.append(", prefecture=");
		sb.append(prefecture);
		sb.append(", street=");
		sb.append(street);
		sb.append(", zip=");
		sb.append(zip);
		sb.append(", phone=");
		sb.append(phone);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Bookstore toEntityModel() {
		BookstoreImpl bookstoreImpl = new BookstoreImpl();

		if (uuid == null) {
			bookstoreImpl.setUuid(StringPool.BLANK);
		}
		else {
			bookstoreImpl.setUuid(uuid);
		}

		bookstoreImpl.setBookstoreId(bookstoreId);
		bookstoreImpl.setGroupId(groupId);
		bookstoreImpl.setCompanyId(companyId);
		bookstoreImpl.setUserId(userId);

		if (userName == null) {
			bookstoreImpl.setUserName(StringPool.BLANK);
		}
		else {
			bookstoreImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			bookstoreImpl.setCreateDate(null);
		}
		else {
			bookstoreImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			bookstoreImpl.setModifiedDate(null);
		}
		else {
			bookstoreImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			bookstoreImpl.setName(StringPool.BLANK);
		}
		else {
			bookstoreImpl.setName(name);
		}

		if (country == null) {
			bookstoreImpl.setCountry(StringPool.BLANK);
		}
		else {
			bookstoreImpl.setCountry(country);
		}

		if (city == null) {
			bookstoreImpl.setCity(StringPool.BLANK);
		}
		else {
			bookstoreImpl.setCity(city);
		}

		if (prefecture == null) {
			bookstoreImpl.setPrefecture(StringPool.BLANK);
		}
		else {
			bookstoreImpl.setPrefecture(prefecture);
		}

		if (street == null) {
			bookstoreImpl.setStreet(StringPool.BLANK);
		}
		else {
			bookstoreImpl.setStreet(street);
		}

		if (zip == null) {
			bookstoreImpl.setZip(StringPool.BLANK);
		}
		else {
			bookstoreImpl.setZip(zip);
		}

		if (phone == null) {
			bookstoreImpl.setPhone(StringPool.BLANK);
		}
		else {
			bookstoreImpl.setPhone(phone);
		}

		bookstoreImpl.resetOriginalValues();

		return bookstoreImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		bookstoreId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		country = objectInput.readUTF();
		city = objectInput.readUTF();
		prefecture = objectInput.readUTF();
		street = objectInput.readUTF();
		zip = objectInput.readUTF();
		phone = objectInput.readUTF();
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

		objectOutput.writeLong(bookstoreId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (country == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(country);
		}

		if (city == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (prefecture == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(prefecture);
		}

		if (street == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(street);
		}

		if (zip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zip);
		}

		if (phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone);
		}
	}

	public String uuid;
	public long bookstoreId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String country;
	public String city;
	public String prefecture;
	public String street;
	public String zip;
	public String phone;
}
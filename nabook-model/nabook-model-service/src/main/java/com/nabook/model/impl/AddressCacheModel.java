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

import com.nabook.model.Address;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Address in entity cache.
 *
 * @author phantoan
 * @see Address
 * @generated
 */
@ProviderType
public class AddressCacheModel implements CacheModel<Address>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AddressCacheModel)) {
			return false;
		}

		AddressCacheModel addressCacheModel = (AddressCacheModel)obj;

		if (addressId == addressCacheModel.addressId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", addressId=");
		sb.append(addressId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", phone=");
		sb.append(phone);
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
		sb.append(", primary=");
		sb.append(primary);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Address toEntityModel() {
		AddressImpl addressImpl = new AddressImpl();

		if (uuid == null) {
			addressImpl.setUuid(StringPool.BLANK);
		}
		else {
			addressImpl.setUuid(uuid);
		}

		addressImpl.setAddressId(addressId);
		addressImpl.setGroupId(groupId);
		addressImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			addressImpl.setCreateDate(null);
		}
		else {
			addressImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addressImpl.setModifiedDate(null);
		}
		else {
			addressImpl.setModifiedDate(new Date(modifiedDate));
		}

		addressImpl.setUserId(userId);

		if (userName == null) {
			addressImpl.setUserName(StringPool.BLANK);
		}
		else {
			addressImpl.setUserName(userName);
		}

		if (name == null) {
			addressImpl.setName(StringPool.BLANK);
		}
		else {
			addressImpl.setName(name);
		}

		if (phone == null) {
			addressImpl.setPhone(StringPool.BLANK);
		}
		else {
			addressImpl.setPhone(phone);
		}

		if (country == null) {
			addressImpl.setCountry(StringPool.BLANK);
		}
		else {
			addressImpl.setCountry(country);
		}

		if (city == null) {
			addressImpl.setCity(StringPool.BLANK);
		}
		else {
			addressImpl.setCity(city);
		}

		if (prefecture == null) {
			addressImpl.setPrefecture(StringPool.BLANK);
		}
		else {
			addressImpl.setPrefecture(prefecture);
		}

		if (street == null) {
			addressImpl.setStreet(StringPool.BLANK);
		}
		else {
			addressImpl.setStreet(street);
		}

		if (zip == null) {
			addressImpl.setZip(StringPool.BLANK);
		}
		else {
			addressImpl.setZip(zip);
		}

		addressImpl.setPrimary(primary);

		addressImpl.resetOriginalValues();

		return addressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		addressId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		name = objectInput.readUTF();
		phone = objectInput.readUTF();
		country = objectInput.readUTF();
		city = objectInput.readUTF();
		prefecture = objectInput.readUTF();
		street = objectInput.readUTF();
		zip = objectInput.readUTF();

		primary = objectInput.readBoolean();
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

		objectOutput.writeLong(addressId);

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

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone);
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

		objectOutput.writeBoolean(primary);
	}

	public String uuid;
	public long addressId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long userId;
	public String userName;
	public String name;
	public String phone;
	public String country;
	public String city;
	public String prefecture;
	public String street;
	public String zip;
	public boolean primary;
}
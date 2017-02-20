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

import com.nabook.model.Author;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Author in entity cache.
 *
 * @author phantoan
 * @see Author
 * @generated
 */
@ProviderType
public class AuthorCacheModel implements CacheModel<Author>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AuthorCacheModel)) {
			return false;
		}

		AuthorCacheModel authorCacheModel = (AuthorCacheModel)obj;

		if (authorId == authorCacheModel.authorId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, authorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", authorId=");
		sb.append(authorId);
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
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", profile=");
		sb.append(profile);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Author toEntityModel() {
		AuthorImpl authorImpl = new AuthorImpl();

		if (uuid == null) {
			authorImpl.setUuid(StringPool.BLANK);
		}
		else {
			authorImpl.setUuid(uuid);
		}

		authorImpl.setAuthorId(authorId);
		authorImpl.setGroupId(groupId);
		authorImpl.setCompanyId(companyId);
		authorImpl.setUserId(userId);

		if (userName == null) {
			authorImpl.setUserName(StringPool.BLANK);
		}
		else {
			authorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			authorImpl.setCreateDate(null);
		}
		else {
			authorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			authorImpl.setModifiedDate(null);
		}
		else {
			authorImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (fullName == null) {
			authorImpl.setFullName(StringPool.BLANK);
		}
		else {
			authorImpl.setFullName(fullName);
		}

		if (profile == null) {
			authorImpl.setProfile(StringPool.BLANK);
		}
		else {
			authorImpl.setProfile(profile);
		}

		authorImpl.resetOriginalValues();

		return authorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		authorId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		fullName = objectInput.readUTF();
		profile = objectInput.readUTF();
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

		objectOutput.writeLong(authorId);

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

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (profile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(profile);
		}
	}

	public String uuid;
	public long authorId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String fullName;
	public String profile;
}
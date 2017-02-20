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

import com.nabook.model.Book;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Book in entity cache.
 *
 * @author phantoan
 * @see Book
 * @generated
 */
@ProviderType
public class BookCacheModel implements CacheModel<Book>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BookCacheModel)) {
			return false;
		}

		BookCacheModel bookCacheModel = (BookCacheModel)obj;

		if (bookId == bookCacheModel.bookId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bookId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", bookId=");
		sb.append(bookId);
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
		sb.append(", ISBN=");
		sb.append(ISBN);
		sb.append(", title=");
		sb.append(title);
		sb.append(", subtitle=");
		sb.append(subtitle);
		sb.append(", edition=");
		sb.append(edition);
		sb.append(", volume=");
		sb.append(volume);
		sb.append(", publisher=");
		sb.append(publisher);
		sb.append(", pubDate=");
		sb.append(pubDate);
		sb.append(", price=");
		sb.append(price);
		sb.append(", description=");
		sb.append(description);

		return sb.toString();
	}

	@Override
	public Book toEntityModel() {
		BookImpl bookImpl = new BookImpl();

		if (uuid == null) {
			bookImpl.setUuid(StringPool.BLANK);
		}
		else {
			bookImpl.setUuid(uuid);
		}

		bookImpl.setBookId(bookId);
		bookImpl.setGroupId(groupId);
		bookImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			bookImpl.setCreateDate(null);
		}
		else {
			bookImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			bookImpl.setModifiedDate(null);
		}
		else {
			bookImpl.setModifiedDate(new Date(modifiedDate));
		}

		bookImpl.setUserId(userId);

		if (userName == null) {
			bookImpl.setUserName(StringPool.BLANK);
		}
		else {
			bookImpl.setUserName(userName);
		}

		if (ISBN == null) {
			bookImpl.setISBN(StringPool.BLANK);
		}
		else {
			bookImpl.setISBN(ISBN);
		}

		if (title == null) {
			bookImpl.setTitle(StringPool.BLANK);
		}
		else {
			bookImpl.setTitle(title);
		}

		if (subtitle == null) {
			bookImpl.setSubtitle(StringPool.BLANK);
		}
		else {
			bookImpl.setSubtitle(subtitle);
		}

		if (edition == null) {
			bookImpl.setEdition(StringPool.BLANK);
		}
		else {
			bookImpl.setEdition(edition);
		}

		if (volume == null) {
			bookImpl.setVolume(StringPool.BLANK);
		}
		else {
			bookImpl.setVolume(volume);
		}

		if (publisher == null) {
			bookImpl.setPublisher(StringPool.BLANK);
		}
		else {
			bookImpl.setPublisher(publisher);
		}

		if (pubDate == Long.MIN_VALUE) {
			bookImpl.setPubDate(null);
		}
		else {
			bookImpl.setPubDate(new Date(pubDate));
		}

		if (price == null) {
			bookImpl.setPrice(StringPool.BLANK);
		}
		else {
			bookImpl.setPrice(price);
		}

		if (description == null) {
			bookImpl.setDescription(StringPool.BLANK);
		}
		else {
			bookImpl.setDescription(description);
		}

		bookImpl.resetOriginalValues();

		return bookImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		bookId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		ISBN = objectInput.readUTF();
		title = objectInput.readUTF();
		subtitle = objectInput.readUTF();
		edition = objectInput.readUTF();
		volume = objectInput.readUTF();
		publisher = objectInput.readUTF();
		pubDate = objectInput.readLong();
		price = objectInput.readUTF();
		description = objectInput.readUTF();
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

		objectOutput.writeLong(bookId);

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

		if (ISBN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ISBN);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (subtitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subtitle);
		}

		if (edition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(edition);
		}

		if (volume == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(volume);
		}

		if (publisher == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(publisher);
		}

		objectOutput.writeLong(pubDate);

		if (price == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(price);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public String uuid;
	public long bookId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long userId;
	public String userName;
	public String ISBN;
	public String title;
	public String subtitle;
	public String edition;
	public String volume;
	public String publisher;
	public long pubDate;
	public String price;
	public String description;
}
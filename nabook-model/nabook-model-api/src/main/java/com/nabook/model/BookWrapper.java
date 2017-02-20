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

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Book}.
 * </p>
 *
 * @author phantoan
 * @see Book
 * @generated
 */
@ProviderType
public class BookWrapper implements Book, ModelWrapper<Book> {
	public BookWrapper(Book book) {
		_book = book;
	}

	@Override
	public Class<?> getModelClass() {
		return Book.class;
	}

	@Override
	public String getModelClassName() {
		return Book.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bookId", getBookId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ISBN", getISBN());
		attributes.put("title", getTitle());
		attributes.put("subtitle", getSubtitle());
		attributes.put("edition", getEdition());
		attributes.put("volume", getVolume());
		attributes.put("author", getAuthor());
		attributes.put("publisher", getPublisher());
		attributes.put("pubDate", getPubDate());
		attributes.put("description", getDescription());
		attributes.put("thumbnail", getThumbnail());
		attributes.put("sample", getSample());
		attributes.put("price", getPrice());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String ISBN = (String)attributes.get("ISBN");

		if (ISBN != null) {
			setISBN(ISBN);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String subtitle = (String)attributes.get("subtitle");

		if (subtitle != null) {
			setSubtitle(subtitle);
		}

		String edition = (String)attributes.get("edition");

		if (edition != null) {
			setEdition(edition);
		}

		String volume = (String)attributes.get("volume");

		if (volume != null) {
			setVolume(volume);
		}

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		String publisher = (String)attributes.get("publisher");

		if (publisher != null) {
			setPublisher(publisher);
		}

		Date pubDate = (Date)attributes.get("pubDate");

		if (pubDate != null) {
			setPubDate(pubDate);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Blob thumbnail = (Blob)attributes.get("thumbnail");

		if (thumbnail != null) {
			setThumbnail(thumbnail);
		}

		Blob sample = (Blob)attributes.get("sample");

		if (sample != null) {
			setSample(sample);
		}

		String price = (String)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}
	}

	@Override
	public Book toEscapedModel() {
		return new BookWrapper(_book.toEscapedModel());
	}

	@Override
	public Book toUnescapedModel() {
		return new BookWrapper(_book.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _book.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _book.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _book.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _book.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Book> toCacheModel() {
		return _book.toCacheModel();
	}

	@Override
	public int compareTo(Book book) {
		return _book.compareTo(book);
	}

	@Override
	public int hashCode() {
		return _book.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _book.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new BookWrapper((Book)_book.clone());
	}

	/**
	* Returns the author of this book.
	*
	* @return the author of this book
	*/
	@Override
	public java.lang.String getAuthor() {
		return _book.getAuthor();
	}

	/**
	* Returns the description of this book.
	*
	* @return the description of this book
	*/
	@Override
	public java.lang.String getDescription() {
		return _book.getDescription();
	}

	/**
	* Returns the edition of this book.
	*
	* @return the edition of this book
	*/
	@Override
	public java.lang.String getEdition() {
		return _book.getEdition();
	}

	/**
	* Returns the i s b n of this book.
	*
	* @return the i s b n of this book
	*/
	@Override
	public java.lang.String getISBN() {
		return _book.getISBN();
	}

	/**
	* Returns the price of this book.
	*
	* @return the price of this book
	*/
	@Override
	public java.lang.String getPrice() {
		return _book.getPrice();
	}

	/**
	* Returns the publisher of this book.
	*
	* @return the publisher of this book
	*/
	@Override
	public java.lang.String getPublisher() {
		return _book.getPublisher();
	}

	/**
	* Returns the subtitle of this book.
	*
	* @return the subtitle of this book
	*/
	@Override
	public java.lang.String getSubtitle() {
		return _book.getSubtitle();
	}

	/**
	* Returns the title of this book.
	*
	* @return the title of this book
	*/
	@Override
	public java.lang.String getTitle() {
		return _book.getTitle();
	}

	/**
	* Returns the user name of this book.
	*
	* @return the user name of this book
	*/
	@Override
	public java.lang.String getUserName() {
		return _book.getUserName();
	}

	/**
	* Returns the user uuid of this book.
	*
	* @return the user uuid of this book
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _book.getUserUuid();
	}

	/**
	* Returns the uuid of this book.
	*
	* @return the uuid of this book
	*/
	@Override
	public java.lang.String getUuid() {
		return _book.getUuid();
	}

	/**
	* Returns the volume of this book.
	*
	* @return the volume of this book
	*/
	@Override
	public java.lang.String getVolume() {
		return _book.getVolume();
	}

	@Override
	public java.lang.String toString() {
		return _book.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _book.toXmlString();
	}

	/**
	* Returns the sample of this book.
	*
	* @return the sample of this book
	*/
	@Override
	public Blob getSample() {
		return _book.getSample();
	}

	/**
	* Returns the thumbnail of this book.
	*
	* @return the thumbnail of this book
	*/
	@Override
	public Blob getThumbnail() {
		return _book.getThumbnail();
	}

	/**
	* Returns the create date of this book.
	*
	* @return the create date of this book
	*/
	@Override
	public Date getCreateDate() {
		return _book.getCreateDate();
	}

	/**
	* Returns the modified date of this book.
	*
	* @return the modified date of this book
	*/
	@Override
	public Date getModifiedDate() {
		return _book.getModifiedDate();
	}

	/**
	* Returns the pub date of this book.
	*
	* @return the pub date of this book
	*/
	@Override
	public Date getPubDate() {
		return _book.getPubDate();
	}

	/**
	* Returns the book ID of this book.
	*
	* @return the book ID of this book
	*/
	@Override
	public long getBookId() {
		return _book.getBookId();
	}

	/**
	* Returns the company ID of this book.
	*
	* @return the company ID of this book
	*/
	@Override
	public long getCompanyId() {
		return _book.getCompanyId();
	}

	/**
	* Returns the group ID of this book.
	*
	* @return the group ID of this book
	*/
	@Override
	public long getGroupId() {
		return _book.getGroupId();
	}

	/**
	* Returns the primary key of this book.
	*
	* @return the primary key of this book
	*/
	@Override
	public long getPrimaryKey() {
		return _book.getPrimaryKey();
	}

	/**
	* Returns the user ID of this book.
	*
	* @return the user ID of this book
	*/
	@Override
	public long getUserId() {
		return _book.getUserId();
	}

	@Override
	public void persist() {
		_book.persist();
	}

	/**
	* Sets the author of this book.
	*
	* @param author the author of this book
	*/
	@Override
	public void setAuthor(java.lang.String author) {
		_book.setAuthor(author);
	}

	/**
	* Sets the book ID of this book.
	*
	* @param bookId the book ID of this book
	*/
	@Override
	public void setBookId(long bookId) {
		_book.setBookId(bookId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_book.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this book.
	*
	* @param companyId the company ID of this book
	*/
	@Override
	public void setCompanyId(long companyId) {
		_book.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this book.
	*
	* @param createDate the create date of this book
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_book.setCreateDate(createDate);
	}

	/**
	* Sets the description of this book.
	*
	* @param description the description of this book
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_book.setDescription(description);
	}

	/**
	* Sets the edition of this book.
	*
	* @param edition the edition of this book
	*/
	@Override
	public void setEdition(java.lang.String edition) {
		_book.setEdition(edition);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_book.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_book.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_book.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this book.
	*
	* @param groupId the group ID of this book
	*/
	@Override
	public void setGroupId(long groupId) {
		_book.setGroupId(groupId);
	}

	/**
	* Sets the i s b n of this book.
	*
	* @param ISBN the i s b n of this book
	*/
	@Override
	public void setISBN(java.lang.String ISBN) {
		_book.setISBN(ISBN);
	}

	/**
	* Sets the modified date of this book.
	*
	* @param modifiedDate the modified date of this book
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_book.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_book.setNew(n);
	}

	/**
	* Sets the price of this book.
	*
	* @param price the price of this book
	*/
	@Override
	public void setPrice(java.lang.String price) {
		_book.setPrice(price);
	}

	/**
	* Sets the primary key of this book.
	*
	* @param primaryKey the primary key of this book
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_book.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_book.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the pub date of this book.
	*
	* @param pubDate the pub date of this book
	*/
	@Override
	public void setPubDate(Date pubDate) {
		_book.setPubDate(pubDate);
	}

	/**
	* Sets the publisher of this book.
	*
	* @param publisher the publisher of this book
	*/
	@Override
	public void setPublisher(java.lang.String publisher) {
		_book.setPublisher(publisher);
	}

	/**
	* Sets the sample of this book.
	*
	* @param sample the sample of this book
	*/
	@Override
	public void setSample(Blob sample) {
		_book.setSample(sample);
	}

	/**
	* Sets the subtitle of this book.
	*
	* @param subtitle the subtitle of this book
	*/
	@Override
	public void setSubtitle(java.lang.String subtitle) {
		_book.setSubtitle(subtitle);
	}

	/**
	* Sets the thumbnail of this book.
	*
	* @param thumbnail the thumbnail of this book
	*/
	@Override
	public void setThumbnail(Blob thumbnail) {
		_book.setThumbnail(thumbnail);
	}

	/**
	* Sets the title of this book.
	*
	* @param title the title of this book
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_book.setTitle(title);
	}

	/**
	* Sets the user ID of this book.
	*
	* @param userId the user ID of this book
	*/
	@Override
	public void setUserId(long userId) {
		_book.setUserId(userId);
	}

	/**
	* Sets the user name of this book.
	*
	* @param userName the user name of this book
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_book.setUserName(userName);
	}

	/**
	* Sets the user uuid of this book.
	*
	* @param userUuid the user uuid of this book
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_book.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this book.
	*
	* @param uuid the uuid of this book
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_book.setUuid(uuid);
	}

	/**
	* Sets the volume of this book.
	*
	* @param volume the volume of this book
	*/
	@Override
	public void setVolume(java.lang.String volume) {
		_book.setVolume(volume);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BookWrapper)) {
			return false;
		}

		BookWrapper bookWrapper = (BookWrapper)obj;

		if (Objects.equals(_book, bookWrapper._book)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _book.getStagedModelType();
	}

	@Override
	public Book getWrappedModel() {
		return _book;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _book.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _book.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_book.resetOriginalValues();
	}

	private final Book _book;
}
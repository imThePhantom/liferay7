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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.sql.Blob;

import java.util.Date;

/**
 * The base model interface for the Book service. Represents a row in the &quot;nab_Book&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.nabook.model.impl.BookModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.nabook.model.impl.BookImpl}.
 * </p>
 *
 * @author phantoan
 * @see Book
 * @see com.nabook.model.impl.BookImpl
 * @see com.nabook.model.impl.BookModelImpl
 * @generated
 */
@ProviderType
public interface BookModel extends BaseModel<Book>, GroupedModel, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a book model instance should use the {@link Book} interface instead.
	 */

	/**
	 * Returns the primary key of this book.
	 *
	 * @return the primary key of this book
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this book.
	 *
	 * @param primaryKey the primary key of this book
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this book.
	 *
	 * @return the uuid of this book
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this book.
	 *
	 * @param uuid the uuid of this book
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the book ID of this book.
	 *
	 * @return the book ID of this book
	 */
	public long getBookId();

	/**
	 * Sets the book ID of this book.
	 *
	 * @param bookId the book ID of this book
	 */
	public void setBookId(long bookId);

	/**
	 * Returns the group ID of this book.
	 *
	 * @return the group ID of this book
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this book.
	 *
	 * @param groupId the group ID of this book
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this book.
	 *
	 * @return the company ID of this book
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this book.
	 *
	 * @param companyId the company ID of this book
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this book.
	 *
	 * @return the user ID of this book
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this book.
	 *
	 * @param userId the user ID of this book
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this book.
	 *
	 * @return the user uuid of this book
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this book.
	 *
	 * @param userUuid the user uuid of this book
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this book.
	 *
	 * @return the user name of this book
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this book.
	 *
	 * @param userName the user name of this book
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this book.
	 *
	 * @return the create date of this book
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this book.
	 *
	 * @param createDate the create date of this book
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this book.
	 *
	 * @return the modified date of this book
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this book.
	 *
	 * @param modifiedDate the modified date of this book
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the i s b n of this book.
	 *
	 * @return the i s b n of this book
	 */
	@AutoEscape
	public String getISBN();

	/**
	 * Sets the i s b n of this book.
	 *
	 * @param ISBN the i s b n of this book
	 */
	public void setISBN(String ISBN);

	/**
	 * Returns the title of this book.
	 *
	 * @return the title of this book
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this book.
	 *
	 * @param title the title of this book
	 */
	public void setTitle(String title);

	/**
	 * Returns the subtitle of this book.
	 *
	 * @return the subtitle of this book
	 */
	@AutoEscape
	public String getSubtitle();

	/**
	 * Sets the subtitle of this book.
	 *
	 * @param subtitle the subtitle of this book
	 */
	public void setSubtitle(String subtitle);

	/**
	 * Returns the edition of this book.
	 *
	 * @return the edition of this book
	 */
	@AutoEscape
	public String getEdition();

	/**
	 * Sets the edition of this book.
	 *
	 * @param edition the edition of this book
	 */
	public void setEdition(String edition);

	/**
	 * Returns the volume of this book.
	 *
	 * @return the volume of this book
	 */
	@AutoEscape
	public String getVolume();

	/**
	 * Sets the volume of this book.
	 *
	 * @param volume the volume of this book
	 */
	public void setVolume(String volume);

	/**
	 * Returns the author of this book.
	 *
	 * @return the author of this book
	 */
	@AutoEscape
	public String getAuthor();

	/**
	 * Sets the author of this book.
	 *
	 * @param author the author of this book
	 */
	public void setAuthor(String author);

	/**
	 * Returns the publisher of this book.
	 *
	 * @return the publisher of this book
	 */
	@AutoEscape
	public String getPublisher();

	/**
	 * Sets the publisher of this book.
	 *
	 * @param publisher the publisher of this book
	 */
	public void setPublisher(String publisher);

	/**
	 * Returns the pub date of this book.
	 *
	 * @return the pub date of this book
	 */
	public Date getPubDate();

	/**
	 * Sets the pub date of this book.
	 *
	 * @param pubDate the pub date of this book
	 */
	public void setPubDate(Date pubDate);

	/**
	 * Returns the description of this book.
	 *
	 * @return the description of this book
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this book.
	 *
	 * @param description the description of this book
	 */
	public void setDescription(String description);

	/**
	 * Returns the thumbnail of this book.
	 *
	 * @return the thumbnail of this book
	 */
	public Blob getThumbnail();

	/**
	 * Sets the thumbnail of this book.
	 *
	 * @param thumbnail the thumbnail of this book
	 */
	public void setThumbnail(Blob thumbnail);

	/**
	 * Returns the sample of this book.
	 *
	 * @return the sample of this book
	 */
	public Blob getSample();

	/**
	 * Sets the sample of this book.
	 *
	 * @param sample the sample of this book
	 */
	public void setSample(Blob sample);

	/**
	 * Returns the price of this book.
	 *
	 * @return the price of this book
	 */
	@AutoEscape
	public String getPrice();

	/**
	 * Sets the price of this book.
	 *
	 * @param price the price of this book
	 */
	public void setPrice(String price);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Book book);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Book> toCacheModel();

	@Override
	public Book toEscapedModel();

	@Override
	public Book toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
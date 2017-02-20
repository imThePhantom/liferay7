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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Author}.
 * </p>
 *
 * @author phantoan
 * @see Author
 * @generated
 */
@ProviderType
public class AuthorWrapper implements Author, ModelWrapper<Author> {
	public AuthorWrapper(Author author) {
		_author = author;
	}

	@Override
	public Class<?> getModelClass() {
		return Author.class;
	}

	@Override
	public String getModelClassName() {
		return Author.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("authorId", getAuthorId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("fullName", getFullName());
		attributes.put("profile", getProfile());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long authorId = (Long)attributes.get("authorId");

		if (authorId != null) {
			setAuthorId(authorId);
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

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String profile = (String)attributes.get("profile");

		if (profile != null) {
			setProfile(profile);
		}
	}

	@Override
	public Author toEscapedModel() {
		return new AuthorWrapper(_author.toEscapedModel());
	}

	@Override
	public Author toUnescapedModel() {
		return new AuthorWrapper(_author.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _author.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _author.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _author.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _author.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Author> toCacheModel() {
		return _author.toCacheModel();
	}

	@Override
	public int compareTo(Author author) {
		return _author.compareTo(author);
	}

	@Override
	public int hashCode() {
		return _author.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _author.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AuthorWrapper((Author)_author.clone());
	}

	/**
	* Returns the full name of this author.
	*
	* @return the full name of this author
	*/
	@Override
	public java.lang.String getFullName() {
		return _author.getFullName();
	}

	/**
	* Returns the profile of this author.
	*
	* @return the profile of this author
	*/
	@Override
	public java.lang.String getProfile() {
		return _author.getProfile();
	}

	/**
	* Returns the user name of this author.
	*
	* @return the user name of this author
	*/
	@Override
	public java.lang.String getUserName() {
		return _author.getUserName();
	}

	/**
	* Returns the user uuid of this author.
	*
	* @return the user uuid of this author
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _author.getUserUuid();
	}

	/**
	* Returns the uuid of this author.
	*
	* @return the uuid of this author
	*/
	@Override
	public java.lang.String getUuid() {
		return _author.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _author.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _author.toXmlString();
	}

	/**
	* Returns the create date of this author.
	*
	* @return the create date of this author
	*/
	@Override
	public Date getCreateDate() {
		return _author.getCreateDate();
	}

	/**
	* Returns the modified date of this author.
	*
	* @return the modified date of this author
	*/
	@Override
	public Date getModifiedDate() {
		return _author.getModifiedDate();
	}

	/**
	* Returns the author ID of this author.
	*
	* @return the author ID of this author
	*/
	@Override
	public long getAuthorId() {
		return _author.getAuthorId();
	}

	/**
	* Returns the company ID of this author.
	*
	* @return the company ID of this author
	*/
	@Override
	public long getCompanyId() {
		return _author.getCompanyId();
	}

	/**
	* Returns the group ID of this author.
	*
	* @return the group ID of this author
	*/
	@Override
	public long getGroupId() {
		return _author.getGroupId();
	}

	/**
	* Returns the primary key of this author.
	*
	* @return the primary key of this author
	*/
	@Override
	public long getPrimaryKey() {
		return _author.getPrimaryKey();
	}

	/**
	* Returns the user ID of this author.
	*
	* @return the user ID of this author
	*/
	@Override
	public long getUserId() {
		return _author.getUserId();
	}

	@Override
	public void persist() {
		_author.persist();
	}

	/**
	* Sets the author ID of this author.
	*
	* @param authorId the author ID of this author
	*/
	@Override
	public void setAuthorId(long authorId) {
		_author.setAuthorId(authorId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_author.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this author.
	*
	* @param companyId the company ID of this author
	*/
	@Override
	public void setCompanyId(long companyId) {
		_author.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this author.
	*
	* @param createDate the create date of this author
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_author.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_author.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_author.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_author.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the full name of this author.
	*
	* @param fullName the full name of this author
	*/
	@Override
	public void setFullName(java.lang.String fullName) {
		_author.setFullName(fullName);
	}

	/**
	* Sets the group ID of this author.
	*
	* @param groupId the group ID of this author
	*/
	@Override
	public void setGroupId(long groupId) {
		_author.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this author.
	*
	* @param modifiedDate the modified date of this author
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_author.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_author.setNew(n);
	}

	/**
	* Sets the primary key of this author.
	*
	* @param primaryKey the primary key of this author
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_author.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_author.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the profile of this author.
	*
	* @param profile the profile of this author
	*/
	@Override
	public void setProfile(java.lang.String profile) {
		_author.setProfile(profile);
	}

	/**
	* Sets the user ID of this author.
	*
	* @param userId the user ID of this author
	*/
	@Override
	public void setUserId(long userId) {
		_author.setUserId(userId);
	}

	/**
	* Sets the user name of this author.
	*
	* @param userName the user name of this author
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_author.setUserName(userName);
	}

	/**
	* Sets the user uuid of this author.
	*
	* @param userUuid the user uuid of this author
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_author.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this author.
	*
	* @param uuid the uuid of this author
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_author.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AuthorWrapper)) {
			return false;
		}

		AuthorWrapper authorWrapper = (AuthorWrapper)obj;

		if (Objects.equals(_author, authorWrapper._author)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _author.getStagedModelType();
	}

	@Override
	public Author getWrappedModel() {
		return _author;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _author.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _author.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_author.resetOriginalValues();
	}

	private final Author _author;
}
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

import java.util.Date;

/**
 * The base model interface for the StockItem service. Represents a row in the &quot;nab_StockItem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.nabook.model.impl.StockItemModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.nabook.model.impl.StockItemImpl}.
 * </p>
 *
 * @author phantoan
 * @see StockItem
 * @see com.nabook.model.impl.StockItemImpl
 * @see com.nabook.model.impl.StockItemModelImpl
 * @generated
 */
@ProviderType
public interface StockItemModel extends BaseModel<StockItem>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a stock item model instance should use the {@link StockItem} interface instead.
	 */

	/**
	 * Returns the primary key of this stock item.
	 *
	 * @return the primary key of this stock item
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this stock item.
	 *
	 * @param primaryKey the primary key of this stock item
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this stock item.
	 *
	 * @return the uuid of this stock item
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this stock item.
	 *
	 * @param uuid the uuid of this stock item
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the stock item ID of this stock item.
	 *
	 * @return the stock item ID of this stock item
	 */
	public long getStockItemId();

	/**
	 * Sets the stock item ID of this stock item.
	 *
	 * @param stockItemId the stock item ID of this stock item
	 */
	public void setStockItemId(long stockItemId);

	/**
	 * Returns the group ID of this stock item.
	 *
	 * @return the group ID of this stock item
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this stock item.
	 *
	 * @param groupId the group ID of this stock item
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this stock item.
	 *
	 * @return the company ID of this stock item
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this stock item.
	 *
	 * @param companyId the company ID of this stock item
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this stock item.
	 *
	 * @return the user ID of this stock item
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this stock item.
	 *
	 * @param userId the user ID of this stock item
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this stock item.
	 *
	 * @return the user uuid of this stock item
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this stock item.
	 *
	 * @param userUuid the user uuid of this stock item
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this stock item.
	 *
	 * @return the user name of this stock item
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this stock item.
	 *
	 * @param userName the user name of this stock item
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this stock item.
	 *
	 * @return the create date of this stock item
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this stock item.
	 *
	 * @param createDate the create date of this stock item
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this stock item.
	 *
	 * @return the modified date of this stock item
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this stock item.
	 *
	 * @param modifiedDate the modified date of this stock item
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the book ID of this stock item.
	 *
	 * @return the book ID of this stock item
	 */
	public long getBookId();

	/**
	 * Sets the book ID of this stock item.
	 *
	 * @param bookId the book ID of this stock item
	 */
	public void setBookId(long bookId);

	/**
	 * Returns the remaining quantity of this stock item.
	 *
	 * @return the remaining quantity of this stock item
	 */
	public int getRemainingQuantity();

	/**
	 * Sets the remaining quantity of this stock item.
	 *
	 * @param remainingQuantity the remaining quantity of this stock item
	 */
	public void setRemainingQuantity(int remainingQuantity);

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
	public int compareTo(StockItem stockItem);

	@Override
	public int hashCode();

	@Override
	public CacheModel<StockItem> toCacheModel();

	@Override
	public StockItem toEscapedModel();

	@Override
	public StockItem toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
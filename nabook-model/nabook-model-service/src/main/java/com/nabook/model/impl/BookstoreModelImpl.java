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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.nabook.model.Bookstore;
import com.nabook.model.BookstoreModel;
import com.nabook.model.BookstoreSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Bookstore service. Represents a row in the &quot;nab_Bookstore&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link BookstoreModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BookstoreImpl}.
 * </p>
 *
 * @author phantoan
 * @see BookstoreImpl
 * @see Bookstore
 * @see BookstoreModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class BookstoreModelImpl extends BaseModelImpl<Bookstore>
	implements BookstoreModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a bookstore model instance should use the {@link Bookstore} interface instead.
	 */
	public static final String TABLE_NAME = "nab_Bookstore";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "bookstoreId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "name", Types.VARCHAR },
			{ "country", Types.VARCHAR },
			{ "city", Types.VARCHAR },
			{ "prefecture", Types.VARCHAR },
			{ "street", Types.VARCHAR },
			{ "zip", Types.VARCHAR },
			{ "phone", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("bookstoreId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("country", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("city", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("prefecture", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("street", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("zip", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("phone", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table nab_Bookstore (uuid_ VARCHAR(75) null,bookstoreId LONG not null primary key,groupId LONG,companyId LONG,createDate DATE null,modifiedDate DATE null,userId LONG,userName VARCHAR(75) null,name VARCHAR(80) null,country VARCHAR(80) null,city VARCHAR(80) null,prefecture VARCHAR(80) null,street VARCHAR(255) null,zip VARCHAR(75) null,phone VARCHAR(75) null,description VARCHAR(1000) null)";
	public static final String TABLE_SQL_DROP = "drop table nab_Bookstore";
	public static final String ORDER_BY_JPQL = " ORDER BY bookstore.city ASC, bookstore.prefecture ASC";
	public static final String ORDER_BY_SQL = " ORDER BY nab_Bookstore.city ASC, nab_Bookstore.prefecture ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.nabook.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.nabook.model.Bookstore"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.nabook.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.nabook.model.Bookstore"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.nabook.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.nabook.model.Bookstore"),
			true);
	public static final long CITY_COLUMN_BITMASK = 1L;
	public static final long COMPANYID_COLUMN_BITMASK = 2L;
	public static final long COUNTRY_COLUMN_BITMASK = 4L;
	public static final long GROUPID_COLUMN_BITMASK = 8L;
	public static final long NAME_COLUMN_BITMASK = 16L;
	public static final long PHONE_COLUMN_BITMASK = 32L;
	public static final long PREFECTURE_COLUMN_BITMASK = 64L;
	public static final long STREET_COLUMN_BITMASK = 128L;
	public static final long UUID_COLUMN_BITMASK = 256L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Bookstore toModel(BookstoreSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Bookstore model = new BookstoreImpl();

		model.setUuid(soapModel.getUuid());
		model.setBookstoreId(soapModel.getBookstoreId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setName(soapModel.getName());
		model.setCountry(soapModel.getCountry());
		model.setCity(soapModel.getCity());
		model.setPrefecture(soapModel.getPrefecture());
		model.setStreet(soapModel.getStreet());
		model.setZip(soapModel.getZip());
		model.setPhone(soapModel.getPhone());
		model.setDescription(soapModel.getDescription());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Bookstore> toModels(BookstoreSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Bookstore> models = new ArrayList<Bookstore>(soapModels.length);

		for (BookstoreSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.nabook.service.util.ServiceProps.get(
				"lock.expiration.time.com.nabook.model.Bookstore"));

	public BookstoreModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _bookstoreId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBookstoreId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bookstoreId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Bookstore.class;
	}

	@Override
	public String getModelClassName() {
		return Bookstore.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bookstoreId", getBookstoreId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("name", getName());
		attributes.put("country", getCountry());
		attributes.put("city", getCity());
		attributes.put("prefecture", getPrefecture());
		attributes.put("street", getStreet());
		attributes.put("zip", getZip());
		attributes.put("phone", getPhone());
		attributes.put("description", getDescription());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long bookstoreId = (Long)attributes.get("bookstoreId");

		if (bookstoreId != null) {
			setBookstoreId(bookstoreId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String prefecture = (String)attributes.get("prefecture");

		if (prefecture != null) {
			setPrefecture(prefecture);
		}

		String street = (String)attributes.get("street");

		if (street != null) {
			setStreet(street);
		}

		String zip = (String)attributes.get("zip");

		if (zip != null) {
			setZip(zip);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getBookstoreId() {
		return _bookstoreId;
	}

	@Override
	public void setBookstoreId(long bookstoreId) {
		_bookstoreId = bookstoreId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@JSON
	@Override
	public String getCountry() {
		if (_country == null) {
			return StringPool.BLANK;
		}
		else {
			return _country;
		}
	}

	@Override
	public void setCountry(String country) {
		_columnBitmask |= COUNTRY_COLUMN_BITMASK;

		if (_originalCountry == null) {
			_originalCountry = _country;
		}

		_country = country;
	}

	public String getOriginalCountry() {
		return GetterUtil.getString(_originalCountry);
	}

	@JSON
	@Override
	public String getCity() {
		if (_city == null) {
			return StringPool.BLANK;
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_columnBitmask = -1L;

		if (_originalCity == null) {
			_originalCity = _city;
		}

		_city = city;
	}

	public String getOriginalCity() {
		return GetterUtil.getString(_originalCity);
	}

	@JSON
	@Override
	public String getPrefecture() {
		if (_prefecture == null) {
			return StringPool.BLANK;
		}
		else {
			return _prefecture;
		}
	}

	@Override
	public void setPrefecture(String prefecture) {
		_columnBitmask = -1L;

		if (_originalPrefecture == null) {
			_originalPrefecture = _prefecture;
		}

		_prefecture = prefecture;
	}

	public String getOriginalPrefecture() {
		return GetterUtil.getString(_originalPrefecture);
	}

	@JSON
	@Override
	public String getStreet() {
		if (_street == null) {
			return StringPool.BLANK;
		}
		else {
			return _street;
		}
	}

	@Override
	public void setStreet(String street) {
		_columnBitmask |= STREET_COLUMN_BITMASK;

		if (_originalStreet == null) {
			_originalStreet = _street;
		}

		_street = street;
	}

	public String getOriginalStreet() {
		return GetterUtil.getString(_originalStreet);
	}

	@JSON
	@Override
	public String getZip() {
		if (_zip == null) {
			return StringPool.BLANK;
		}
		else {
			return _zip;
		}
	}

	@Override
	public void setZip(String zip) {
		_zip = zip;
	}

	@JSON
	@Override
	public String getPhone() {
		if (_phone == null) {
			return StringPool.BLANK;
		}
		else {
			return _phone;
		}
	}

	@Override
	public void setPhone(String phone) {
		_columnBitmask |= PHONE_COLUMN_BITMASK;

		if (_originalPhone == null) {
			_originalPhone = _phone;
		}

		_phone = phone;
	}

	public String getOriginalPhone() {
		return GetterUtil.getString(_originalPhone);
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Bookstore.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Bookstore.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Bookstore toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Bookstore)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BookstoreImpl bookstoreImpl = new BookstoreImpl();

		bookstoreImpl.setUuid(getUuid());
		bookstoreImpl.setBookstoreId(getBookstoreId());
		bookstoreImpl.setGroupId(getGroupId());
		bookstoreImpl.setCompanyId(getCompanyId());
		bookstoreImpl.setCreateDate(getCreateDate());
		bookstoreImpl.setModifiedDate(getModifiedDate());
		bookstoreImpl.setUserId(getUserId());
		bookstoreImpl.setUserName(getUserName());
		bookstoreImpl.setName(getName());
		bookstoreImpl.setCountry(getCountry());
		bookstoreImpl.setCity(getCity());
		bookstoreImpl.setPrefecture(getPrefecture());
		bookstoreImpl.setStreet(getStreet());
		bookstoreImpl.setZip(getZip());
		bookstoreImpl.setPhone(getPhone());
		bookstoreImpl.setDescription(getDescription());

		bookstoreImpl.resetOriginalValues();

		return bookstoreImpl;
	}

	@Override
	public int compareTo(Bookstore bookstore) {
		int value = 0;

		value = getCity().compareTo(bookstore.getCity());

		if (value != 0) {
			return value;
		}

		value = getPrefecture().compareTo(bookstore.getPrefecture());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Bookstore)) {
			return false;
		}

		Bookstore bookstore = (Bookstore)obj;

		long primaryKey = bookstore.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		BookstoreModelImpl bookstoreModelImpl = this;

		bookstoreModelImpl._originalUuid = bookstoreModelImpl._uuid;

		bookstoreModelImpl._originalGroupId = bookstoreModelImpl._groupId;

		bookstoreModelImpl._setOriginalGroupId = false;

		bookstoreModelImpl._originalCompanyId = bookstoreModelImpl._companyId;

		bookstoreModelImpl._setOriginalCompanyId = false;

		bookstoreModelImpl._setModifiedDate = false;

		bookstoreModelImpl._originalName = bookstoreModelImpl._name;

		bookstoreModelImpl._originalCountry = bookstoreModelImpl._country;

		bookstoreModelImpl._originalCity = bookstoreModelImpl._city;

		bookstoreModelImpl._originalPrefecture = bookstoreModelImpl._prefecture;

		bookstoreModelImpl._originalStreet = bookstoreModelImpl._street;

		bookstoreModelImpl._originalPhone = bookstoreModelImpl._phone;

		bookstoreModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Bookstore> toCacheModel() {
		BookstoreCacheModel bookstoreCacheModel = new BookstoreCacheModel();

		bookstoreCacheModel.uuid = getUuid();

		String uuid = bookstoreCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			bookstoreCacheModel.uuid = null;
		}

		bookstoreCacheModel.bookstoreId = getBookstoreId();

		bookstoreCacheModel.groupId = getGroupId();

		bookstoreCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			bookstoreCacheModel.createDate = createDate.getTime();
		}
		else {
			bookstoreCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			bookstoreCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			bookstoreCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		bookstoreCacheModel.userId = getUserId();

		bookstoreCacheModel.userName = getUserName();

		String userName = bookstoreCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			bookstoreCacheModel.userName = null;
		}

		bookstoreCacheModel.name = getName();

		String name = bookstoreCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			bookstoreCacheModel.name = null;
		}

		bookstoreCacheModel.country = getCountry();

		String country = bookstoreCacheModel.country;

		if ((country != null) && (country.length() == 0)) {
			bookstoreCacheModel.country = null;
		}

		bookstoreCacheModel.city = getCity();

		String city = bookstoreCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			bookstoreCacheModel.city = null;
		}

		bookstoreCacheModel.prefecture = getPrefecture();

		String prefecture = bookstoreCacheModel.prefecture;

		if ((prefecture != null) && (prefecture.length() == 0)) {
			bookstoreCacheModel.prefecture = null;
		}

		bookstoreCacheModel.street = getStreet();

		String street = bookstoreCacheModel.street;

		if ((street != null) && (street.length() == 0)) {
			bookstoreCacheModel.street = null;
		}

		bookstoreCacheModel.zip = getZip();

		String zip = bookstoreCacheModel.zip;

		if ((zip != null) && (zip.length() == 0)) {
			bookstoreCacheModel.zip = null;
		}

		bookstoreCacheModel.phone = getPhone();

		String phone = bookstoreCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			bookstoreCacheModel.phone = null;
		}

		bookstoreCacheModel.description = getDescription();

		String description = bookstoreCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			bookstoreCacheModel.description = null;
		}

		return bookstoreCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", bookstoreId=");
		sb.append(getBookstoreId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", country=");
		sb.append(getCountry());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", prefecture=");
		sb.append(getPrefecture());
		sb.append(", street=");
		sb.append(getStreet());
		sb.append(", zip=");
		sb.append(getZip());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.nabook.model.Bookstore");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bookstoreId</column-name><column-value><![CDATA[");
		sb.append(getBookstoreId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>country</column-name><column-value><![CDATA[");
		sb.append(getCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>prefecture</column-name><column-value><![CDATA[");
		sb.append(getPrefecture());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>street</column-name><column-value><![CDATA[");
		sb.append(getStreet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zip</column-name><column-value><![CDATA[");
		sb.append(getZip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Bookstore.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Bookstore.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _bookstoreId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _userId;
	private String _userName;
	private String _name;
	private String _originalName;
	private String _country;
	private String _originalCountry;
	private String _city;
	private String _originalCity;
	private String _prefecture;
	private String _originalPrefecture;
	private String _street;
	private String _originalStreet;
	private String _zip;
	private String _phone;
	private String _originalPhone;
	private String _description;
	private long _columnBitmask;
	private Bookstore _escapedModel;
}
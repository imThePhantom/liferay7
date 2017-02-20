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

import java.io.Serializable;

import java.sql.Blob;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author phantoan
 * @generated
 */
@ProviderType
public class BookSoap implements Serializable {
	public static BookSoap toSoapModel(Book model) {
		BookSoap soapModel = new BookSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setBookId(model.getBookId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setISBN(model.getISBN());
		soapModel.setTitle(model.getTitle());
		soapModel.setSubtitle(model.getSubtitle());
		soapModel.setEdition(model.getEdition());
		soapModel.setVolume(model.getVolume());
		soapModel.setPublisher(model.getPublisher());
		soapModel.setPubDate(model.getPubDate());
		soapModel.setPrice(model.getPrice());
		soapModel.setDescription(model.getDescription());
		soapModel.setThumbnail(model.getThumbnail());
		soapModel.setSample(model.getSample());

		return soapModel;
	}

	public static BookSoap[] toSoapModels(Book[] models) {
		BookSoap[] soapModels = new BookSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BookSoap[][] toSoapModels(Book[][] models) {
		BookSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BookSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BookSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BookSoap[] toSoapModels(List<Book> models) {
		List<BookSoap> soapModels = new ArrayList<BookSoap>(models.size());

		for (Book model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BookSoap[soapModels.size()]);
	}

	public BookSoap() {
	}

	public long getPrimaryKey() {
		return _bookId;
	}

	public void setPrimaryKey(long pk) {
		setBookId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getBookId() {
		return _bookId;
	}

	public void setBookId(long bookId) {
		_bookId = bookId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getISBN() {
		return _ISBN;
	}

	public void setISBN(String ISBN) {
		_ISBN = ISBN;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getSubtitle() {
		return _subtitle;
	}

	public void setSubtitle(String subtitle) {
		_subtitle = subtitle;
	}

	public String getEdition() {
		return _edition;
	}

	public void setEdition(String edition) {
		_edition = edition;
	}

	public String getVolume() {
		return _volume;
	}

	public void setVolume(String volume) {
		_volume = volume;
	}

	public String getPublisher() {
		return _publisher;
	}

	public void setPublisher(String publisher) {
		_publisher = publisher;
	}

	public Date getPubDate() {
		return _pubDate;
	}

	public void setPubDate(Date pubDate) {
		_pubDate = pubDate;
	}

	public String getPrice() {
		return _price;
	}

	public void setPrice(String price) {
		_price = price;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Blob getThumbnail() {
		return _thumbnail;
	}

	public void setThumbnail(Blob thumbnail) {
		_thumbnail = thumbnail;
	}

	public Blob getSample() {
		return _sample;
	}

	public void setSample(Blob sample) {
		_sample = sample;
	}

	private String _uuid;
	private long _bookId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userName;
	private String _ISBN;
	private String _title;
	private String _subtitle;
	private String _edition;
	private String _volume;
	private String _publisher;
	private Date _pubDate;
	private String _price;
	private String _description;
	private Blob _thumbnail;
	private Blob _sample;
}
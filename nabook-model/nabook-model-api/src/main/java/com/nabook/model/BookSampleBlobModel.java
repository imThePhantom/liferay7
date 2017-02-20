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

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the sample column in Book.
 *
 * @author phantoan
 * @see Book
 * @generated
 */
@ProviderType
public class BookSampleBlobModel {
	public BookSampleBlobModel() {
	}

	public BookSampleBlobModel(long bookId) {
		_bookId = bookId;
	}

	public BookSampleBlobModel(long bookId, Blob sampleBlob) {
		_bookId = bookId;
		_sampleBlob = sampleBlob;
	}

	public long getBookId() {
		return _bookId;
	}

	public void setBookId(long bookId) {
		_bookId = bookId;
	}

	public Blob getSampleBlob() {
		return _sampleBlob;
	}

	public void setSampleBlob(Blob sampleBlob) {
		_sampleBlob = sampleBlob;
	}

	private long _bookId;
	private Blob _sampleBlob;
}
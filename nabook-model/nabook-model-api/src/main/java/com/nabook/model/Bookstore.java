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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Bookstore service. Represents a row in the &quot;nab_Bookstore&quot; database table, with each column mapped to a property of this class.
 *
 * @author phantoan
 * @see BookstoreModel
 * @see com.nabook.model.impl.BookstoreImpl
 * @see com.nabook.model.impl.BookstoreModelImpl
 * @generated
 */
@ImplementationClassName("com.nabook.model.impl.BookstoreImpl")
@ProviderType
public interface Bookstore extends BookstoreModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.nabook.model.impl.BookstoreImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Bookstore, Long> BOOKSTORE_ID_ACCESSOR = new Accessor<Bookstore, Long>() {
			@Override
			public Long get(Bookstore bookstore) {
				return bookstore.getBookstoreId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Bookstore> getTypeClass() {
				return Bookstore.class;
			}
		};
}
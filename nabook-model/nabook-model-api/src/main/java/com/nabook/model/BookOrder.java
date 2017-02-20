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
 * The extended model interface for the BookOrder service. Represents a row in the &quot;nab_BookOrder&quot; database table, with each column mapped to a property of this class.
 *
 * @author phantoan
 * @see BookOrderModel
 * @see com.nabook.model.impl.BookOrderImpl
 * @see com.nabook.model.impl.BookOrderModelImpl
 * @generated
 */
@ImplementationClassName("com.nabook.model.impl.BookOrderImpl")
@ProviderType
public interface BookOrder extends BookOrderModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.nabook.model.impl.BookOrderImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<BookOrder, Long> BOOK_ORDER_ID_ACCESSOR = new Accessor<BookOrder, Long>() {
			@Override
			public Long get(BookOrder bookOrder) {
				return bookOrder.getBookOrderId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<BookOrder> getTypeClass() {
				return BookOrder.class;
			}
		};
}
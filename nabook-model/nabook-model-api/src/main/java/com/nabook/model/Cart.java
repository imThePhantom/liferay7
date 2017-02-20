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
 * The extended model interface for the Cart service. Represents a row in the &quot;nab_Cart&quot; database table, with each column mapped to a property of this class.
 *
 * @author phantoan
 * @see CartModel
 * @see com.nabook.model.impl.CartImpl
 * @see com.nabook.model.impl.CartModelImpl
 * @generated
 */
@ImplementationClassName("com.nabook.model.impl.CartImpl")
@ProviderType
public interface Cart extends CartModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.nabook.model.impl.CartImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Cart, Long> CART_ID_ACCESSOR = new Accessor<Cart, Long>() {
			@Override
			public Long get(Cart cart) {
				return cart.getCartId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Cart> getTypeClass() {
				return Cart.class;
			}
		};
}
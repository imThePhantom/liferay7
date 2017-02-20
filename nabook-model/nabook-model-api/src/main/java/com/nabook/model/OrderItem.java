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
 * The extended model interface for the OrderItem service. Represents a row in the &quot;nab_OrderItem&quot; database table, with each column mapped to a property of this class.
 *
 * @author phantoan
 * @see OrderItemModel
 * @see com.nabook.model.impl.OrderItemImpl
 * @see com.nabook.model.impl.OrderItemModelImpl
 * @generated
 */
@ImplementationClassName("com.nabook.model.impl.OrderItemImpl")
@ProviderType
public interface OrderItem extends OrderItemModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.nabook.model.impl.OrderItemImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OrderItem, Long> ORDER_ITEM_ID_ACCESSOR = new Accessor<OrderItem, Long>() {
			@Override
			public Long get(OrderItem orderItem) {
				return orderItem.getOrderItemId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<OrderItem> getTypeClass() {
				return OrderItem.class;
			}
		};
}
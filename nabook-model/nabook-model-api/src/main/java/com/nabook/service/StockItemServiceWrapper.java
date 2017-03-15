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

package com.nabook.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StockItemService}.
 *
 * @author phantoan
 * @see StockItemService
 * @generated
 */
@ProviderType
public class StockItemServiceWrapper implements StockItemService,
	ServiceWrapper<StockItemService> {
	public StockItemServiceWrapper(StockItemService stockItemService) {
		_stockItemService = stockItemService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _stockItemService.getOSGiServiceIdentifier();
	}

	@Override
	public StockItemService getWrappedService() {
		return _stockItemService;
	}

	@Override
	public void setWrappedService(StockItemService stockItemService) {
		_stockItemService = stockItemService;
	}

	private StockItemService _stockItemService;
}
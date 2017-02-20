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

package com.nabook.exception;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author phantoan
 */
@ProviderType
public class DuplicateAddressException extends PortalException {

	public DuplicateAddressException() {
	}

	public DuplicateAddressException(String msg) {
		super(msg);
	}

	public DuplicateAddressException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public DuplicateAddressException(Throwable cause) {
		super(cause);
	}

}
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
 * Provides a wrapper for {@link AuthorService}.
 *
 * @author phantoan
 * @see AuthorService
 * @generated
 */
@ProviderType
public class AuthorServiceWrapper implements AuthorService,
	ServiceWrapper<AuthorService> {
	public AuthorServiceWrapper(AuthorService authorService) {
		_authorService = authorService;
	}

	@Override
	public com.nabook.model.Author addAuthor(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, java.lang.String fullName, java.lang.String profile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _authorService.addAuthor(serviceContext, userId, fullName,
			profile);
	}

	@Override
	public com.nabook.model.Author deleteAuthor(long authorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _authorService.deleteAuthor(authorId);
	}

	@Override
	public com.nabook.model.Author updateAuthor(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, long authorId, java.lang.String fullName,
		java.lang.String profile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _authorService.updateAuthor(serviceContext, userId, authorId,
			fullName, profile);
	}

	@Override
	public int countAllAuthor()
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException {
		return _authorService.countAllAuthor();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _authorService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.nabook.model.Author> getAllAuthors()
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException {
		return _authorService.getAllAuthors();
	}

	@Override
	public java.util.List<com.nabook.model.Author> getAllAuthors(int start,
		int end)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException {
		return _authorService.getAllAuthors(start, end);
	}

	@Override
	public java.util.List<com.nabook.model.Book> getBooksByAuthor(long authorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException,
			com.nabook.exception.NoSuchBookException {
		return _authorService.getBooksByAuthor(authorId);
	}

	@Override
	public java.util.List<com.nabook.model.Author> search(long companyId,
		java.lang.String keywords)
		throws com.liferay.portal.kernel.search.SearchException {
		return _authorService.search(companyId, keywords);
	}

	@Override
	public AuthorService getWrappedService() {
		return _authorService;
	}

	@Override
	public void setWrappedService(AuthorService authorService) {
		_authorService = authorService;
	}

	private AuthorService _authorService;
}
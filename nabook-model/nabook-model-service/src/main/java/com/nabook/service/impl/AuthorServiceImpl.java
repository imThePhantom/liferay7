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

package com.nabook.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.nabook.exception.NoSuchAuthorException;
import com.nabook.exception.NoSuchBookException;
import com.nabook.model.Author;
import com.nabook.model.Book;
import com.nabook.service.base.AuthorServiceBaseImpl;

/**
 * The implementation of the author remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.nabook.service.AuthorService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author phantoan
 * @see AuthorServiceBaseImpl
 * @see com.nabook.service.AuthorServiceUtil
 */
@ProviderType
public class AuthorServiceImpl extends AuthorServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.nabook.service.AuthorServiceUtil} to access the author remote service.
	 */
	
	public Author addAuthor(ServiceContext serviceContext, long userId, String fullName, String profile)
			throws SystemException, PortalException {

		return authorLocalService.addAuthor(serviceContext, userId, fullName, profile);
	}

	public int countAllAuthor() throws SystemException, NoSuchAuthorException {
		return authorLocalService.countAllAuthor();
	}

	public Author deleteAuthor(long authorId) throws SystemException, PortalException {
		return authorLocalService.deleteAuthor(authorId);
	}

	public List<Author> getAllAuthors() throws SystemException, NoSuchAuthorException {
		return authorLocalService.getAllAuthors();
	}

	public List<Author> getAllAuthors(int start, int end) throws SystemException, NoSuchAuthorException {
		return authorLocalService.getAllAuthors(start, end);
	}

	public List<Book> getBooksByAuthor(long authorId)
			throws SystemException, NoSuchAuthorException, NoSuchBookException {
		return authorLocalService.getBooksByAuthor(authorId);
	}

	public List<Author> search(long companyId, String keywords) throws SearchException {
		return authorLocalService.search(companyId, keywords);
	}

	public Author updateAuthor(ServiceContext serviceContext, long userId, long authorId, String fullName,
			String profile) throws SystemException, PortalException {
		return authorLocalService.updateAuthor(serviceContext, userId, authorId, fullName, profile);
	}

}
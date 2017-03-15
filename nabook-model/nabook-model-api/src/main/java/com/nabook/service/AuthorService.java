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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import com.nabook.exception.NoSuchAuthorException;
import com.nabook.exception.NoSuchBookException;

import com.nabook.model.Author;
import com.nabook.model.Book;

import java.util.List;

/**
 * Provides the remote service interface for Author. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author phantoan
 * @see AuthorServiceUtil
 * @see com.nabook.service.base.AuthorServiceBaseImpl
 * @see com.nabook.service.impl.AuthorServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=nab", "json.web.service.context.path=Author"}, service = AuthorService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AuthorService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AuthorServiceUtil} to access the author remote service. Add custom service methods to {@link com.nabook.service.impl.AuthorServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public Author addAuthor(ServiceContext serviceContext, long userId,
		java.lang.String fullName, java.lang.String profile)
		throws PortalException, SystemException;

	public Author deleteAuthor(long authorId)
		throws PortalException, SystemException;

	public Author updateAuthor(ServiceContext serviceContext, long userId,
		long authorId, java.lang.String fullName, java.lang.String profile)
		throws PortalException, SystemException;

	public int countAllAuthor() throws SystemException, NoSuchAuthorException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Author> getAllAuthors()
		throws SystemException, NoSuchAuthorException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Author> getAllAuthors(int start, int end)
		throws SystemException, NoSuchAuthorException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Book> getBooksByAuthor(long authorId)
		throws SystemException, NoSuchAuthorException, NoSuchBookException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Author> search(long companyId, java.lang.String keywords)
		throws SearchException;
}
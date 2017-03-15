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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Author. This utility wraps
 * {@link com.nabook.service.impl.AuthorServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author phantoan
 * @see AuthorService
 * @see com.nabook.service.base.AuthorServiceBaseImpl
 * @see com.nabook.service.impl.AuthorServiceImpl
 * @generated
 */
@ProviderType
public class AuthorServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.nabook.service.impl.AuthorServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.nabook.model.Author addAuthor(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, java.lang.String fullName, java.lang.String profile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addAuthor(serviceContext, userId, fullName, profile);
	}

	public static com.nabook.model.Author deleteAuthor(long authorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAuthor(authorId);
	}

	public static com.nabook.model.Author updateAuthor(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, long authorId, java.lang.String fullName,
		java.lang.String profile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateAuthor(serviceContext, userId, authorId, fullName,
			profile);
	}

	public static int countAllAuthor()
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException {
		return getService().countAllAuthor();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.nabook.model.Author> getAllAuthors()
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException {
		return getService().getAllAuthors();
	}

	public static java.util.List<com.nabook.model.Author> getAllAuthors(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException {
		return getService().getAllAuthors(start, end);
	}

	public static java.util.List<com.nabook.model.Book> getBooksByAuthor(
		long authorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException,
			com.nabook.exception.NoSuchBookException {
		return getService().getBooksByAuthor(authorId);
	}

	public static java.util.List<com.nabook.model.Author> search(
		long companyId, java.lang.String keywords)
		throws com.liferay.portal.kernel.search.SearchException {
		return getService().search(companyId, keywords);
	}

	public static AuthorService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AuthorService, AuthorService> _serviceTracker = ServiceTrackerFactory.open(AuthorService.class);
}
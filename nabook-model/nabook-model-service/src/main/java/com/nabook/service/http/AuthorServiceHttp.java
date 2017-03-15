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

package com.nabook.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import com.nabook.service.AuthorServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link AuthorServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author phantoan
 * @see AuthorServiceSoap
 * @see HttpPrincipal
 * @see AuthorServiceUtil
 * @generated
 */
@ProviderType
public class AuthorServiceHttp {
	public static com.nabook.model.Author addAuthor(
		HttpPrincipal httpPrincipal,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, java.lang.String fullName, java.lang.String profile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(AuthorServiceUtil.class,
					"addAuthor", _addAuthorParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					serviceContext, userId, fullName, profile);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.nabook.model.Author)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int countAllAuthor(HttpPrincipal httpPrincipal)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException {
		try {
			MethodKey methodKey = new MethodKey(AuthorServiceUtil.class,
					"countAllAuthor", _countAllAuthorParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof com.nabook.exception.NoSuchAuthorException) {
					throw (com.nabook.exception.NoSuchAuthorException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.nabook.model.Author deleteAuthor(
		HttpPrincipal httpPrincipal, long authorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(AuthorServiceUtil.class,
					"deleteAuthor", _deleteAuthorParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, authorId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.nabook.model.Author)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.nabook.model.Author> getAllAuthors(
		HttpPrincipal httpPrincipal)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException {
		try {
			MethodKey methodKey = new MethodKey(AuthorServiceUtil.class,
					"getAllAuthors", _getAllAuthorsParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof com.nabook.exception.NoSuchAuthorException) {
					throw (com.nabook.exception.NoSuchAuthorException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.nabook.model.Author>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.nabook.model.Author> getAllAuthors(
		HttpPrincipal httpPrincipal, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException {
		try {
			MethodKey methodKey = new MethodKey(AuthorServiceUtil.class,
					"getAllAuthors", _getAllAuthorsParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, start,
					end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof com.nabook.exception.NoSuchAuthorException) {
					throw (com.nabook.exception.NoSuchAuthorException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.nabook.model.Author>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.nabook.model.Book> getBooksByAuthor(
		HttpPrincipal httpPrincipal, long authorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nabook.exception.NoSuchAuthorException,
			com.nabook.exception.NoSuchBookException {
		try {
			MethodKey methodKey = new MethodKey(AuthorServiceUtil.class,
					"getBooksByAuthor", _getBooksByAuthorParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey, authorId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof com.nabook.exception.NoSuchAuthorException) {
					throw (com.nabook.exception.NoSuchAuthorException)e;
				}

				if (e instanceof com.nabook.exception.NoSuchBookException) {
					throw (com.nabook.exception.NoSuchBookException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.nabook.model.Book>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.nabook.model.Author> search(
		HttpPrincipal httpPrincipal, long companyId, java.lang.String keywords)
		throws com.liferay.portal.kernel.search.SearchException {
		try {
			MethodKey methodKey = new MethodKey(AuthorServiceUtil.class,
					"search", _searchParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, keywords);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.search.SearchException) {
					throw (com.liferay.portal.kernel.search.SearchException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.nabook.model.Author>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.nabook.model.Author updateAuthor(
		HttpPrincipal httpPrincipal,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long userId, long authorId, java.lang.String fullName,
		java.lang.String profile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(AuthorServiceUtil.class,
					"updateAuthor", _updateAuthorParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					serviceContext, userId, authorId, fullName, profile);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.nabook.model.Author)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AuthorServiceHttp.class);
	private static final Class<?>[] _addAuthorParameterTypes0 = new Class[] {
			com.liferay.portal.kernel.service.ServiceContext.class, long.class,
			java.lang.String.class, java.lang.String.class
		};
	private static final Class<?>[] _countAllAuthorParameterTypes1 = new Class[] {
			
		};
	private static final Class<?>[] _deleteAuthorParameterTypes2 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getAllAuthorsParameterTypes3 = new Class[] {  };
	private static final Class<?>[] _getAllAuthorsParameterTypes4 = new Class[] {
			int.class, int.class
		};
	private static final Class<?>[] _getBooksByAuthorParameterTypes5 = new Class[] {
			long.class
		};
	private static final Class<?>[] _searchParameterTypes6 = new Class[] {
			long.class, java.lang.String.class
		};
	private static final Class<?>[] _updateAuthorParameterTypes7 = new Class[] {
			com.liferay.portal.kernel.service.ServiceContext.class, long.class,
			long.class, java.lang.String.class, java.lang.String.class
		};
}
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

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nabook.exception.NoSuchAuthorException;
import com.nabook.exception.NoSuchBookException;

import com.nabook.model.Author;
import com.nabook.model.Book;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for Author. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author phantoan
 * @see AuthorLocalServiceUtil
 * @see com.nabook.service.base.AuthorLocalServiceBaseImpl
 * @see com.nabook.service.impl.AuthorLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AuthorLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AuthorLocalServiceUtil} to access the author local service. Add custom service methods to {@link com.nabook.service.impl.AuthorLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasBookAuthor(long bookId, long authorId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasBookAuthors(long bookId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	public Author addAuthor(ServiceContext serviceContext, long userId,
		java.lang.String fullName, java.lang.String profile)
		throws PortalException, SystemException;

	/**
	* Adds the author to the database. Also notifies the appropriate model listeners.
	*
	* @param author the author
	* @return the author that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Author addAuthor(Author author);

	/**
	* Creates a new author with the primary key. Does not add the author to the database.
	*
	* @param authorId the primary key for the new author
	* @return the new author
	*/
	public Author createAuthor(long authorId);

	/**
	* Deletes the author from the database. Also notifies the appropriate model listeners.
	*
	* @param author the author
	* @return the author that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Author deleteAuthor(Author author);

	/**
	* Deletes the author with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param authorId the primary key of the author
	* @return the author that was removed
	* @throws PortalException if a author with the primary key could not be found
	* @throws SystemException
	*/
	@Indexable(type = IndexableType.DELETE)
	public Author deleteAuthor(long authorId)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Author fetchAuthor(long authorId);

	/**
	* Returns the author matching the UUID and group.
	*
	* @param uuid the author's UUID
	* @param groupId the primary key of the group
	* @return the matching author, or <code>null</code> if a matching author could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Author fetchAuthorByUuidAndGroupId(java.lang.String uuid,
		long groupId);

	/**
	* Returns the author with the primary key.
	*
	* @param authorId the primary key of the author
	* @return the author
	* @throws PortalException if a author with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Author getAuthor(long authorId) throws PortalException;

	/**
	* Returns the author matching the UUID and group.
	*
	* @param uuid the author's UUID
	* @param groupId the primary key of the group
	* @return the matching author
	* @throws PortalException if a matching author could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Author getAuthorByUuidAndGroupId(java.lang.String uuid, long groupId)
		throws PortalException;

	public Author updateAuthor(ServiceContext serviceContext, long userId,
		long authorId, java.lang.String fullName, java.lang.String profile)
		throws PortalException, SystemException;

	/**
	* Updates the author in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param author the author
	* @return the author that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Author updateAuthor(Author author);

	public int countAllAuthor() throws SystemException, NoSuchAuthorException;

	/**
	* Returns the number of authors.
	*
	* @return the number of authors
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getAuthorsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getBookAuthorsCount(long bookId);

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Author> getAllAuthors()
		throws SystemException, NoSuchAuthorException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Author> getAllAuthors(int start, int end)
		throws SystemException, NoSuchAuthorException;

	/**
	* Returns a range of all the authors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of authors
	* @param end the upper bound of the range of authors (not inclusive)
	* @return the range of authors
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Author> getAuthors(int start, int end);

	/**
	* Returns all the authors matching the UUID and company.
	*
	* @param uuid the UUID of the authors
	* @param companyId the primary key of the company
	* @return the matching authors, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Author> getAuthorsByUuidAndCompanyId(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of authors matching the UUID and company.
	*
	* @param uuid the UUID of the authors
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of authors
	* @param end the upper bound of the range of authors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching authors, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Author> getAuthorsByUuidAndCompanyId(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Author> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Author> getBookAuthors(long bookId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Author> getBookAuthors(long bookId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Author> getBookAuthors(long bookId, int start, int end,
		OrderByComparator<Author> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Book> getBooksByAuthor(long authorId)
		throws SystemException, NoSuchAuthorException, NoSuchBookException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Author> search(long companyId, java.lang.String keywords)
		throws SearchException;

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	/**
	* Returns the bookIds of the books associated with the author.
	*
	* @param authorId the authorId of the author
	* @return long[] the bookIds of books associated with the author
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long[] getBookPrimaryKeys(long authorId);

	public void addBookAuthor(long bookId, Author author);

	public void addBookAuthor(long bookId, long authorId);

	public void addBookAuthors(long bookId, List<Author> authors);

	public void addBookAuthors(long bookId, long[] authorIds);

	public void clearBookAuthors(long bookId);

	public void deleteBookAuthor(long bookId, Author author);

	public void deleteBookAuthor(long bookId, long authorId);

	public void deleteBookAuthors(long bookId, List<Author> authors);

	public void deleteBookAuthors(long bookId, long[] authorIds);

	public void setBookAuthors(long bookId, long[] authorIds);
}
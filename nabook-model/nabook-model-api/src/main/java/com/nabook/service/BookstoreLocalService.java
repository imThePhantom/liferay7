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
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nabook.exception.NoSuchBookstoreException;

import com.nabook.model.Bookstore;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for Bookstore. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author phantoan
 * @see BookstoreLocalServiceUtil
 * @see com.nabook.service.base.BookstoreLocalServiceBaseImpl
 * @see com.nabook.service.impl.BookstoreLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface BookstoreLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BookstoreLocalServiceUtil} to access the bookstore local service. Add custom service methods to {@link com.nabook.service.impl.BookstoreLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
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

	public Bookstore addBookstore(ServiceContext serviceContext, long userId,
		java.lang.String name, java.lang.String country, java.lang.String city,
		java.lang.String prefecture, java.lang.String street,
		java.lang.String zip, java.lang.String phone)
		throws PortalException, SystemException;

	/**
	* Adds the bookstore to the database. Also notifies the appropriate model listeners.
	*
	* @param bookstore the bookstore
	* @return the bookstore that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Bookstore addBookstore(Bookstore bookstore);

	/**
	* Creates a new bookstore with the primary key. Does not add the bookstore to the database.
	*
	* @param bookstoreId the primary key for the new bookstore
	* @return the new bookstore
	*/
	public Bookstore createBookstore(long bookstoreId);

	public Bookstore deleteBookstore(ServiceContext serviceContext,
		long bookstoreId) throws PortalException, SystemException;

	/**
	* Deletes the bookstore from the database. Also notifies the appropriate model listeners.
	*
	* @param bookstore the bookstore
	* @return the bookstore that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Bookstore deleteBookstore(Bookstore bookstore);

	/**
	* Deletes the bookstore with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookstoreId the primary key of the bookstore
	* @return the bookstore that was removed
	* @throws PortalException if a bookstore with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Bookstore deleteBookstore(long bookstoreId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Bookstore fetchBookstore(long bookstoreId);

	/**
	* Returns the bookstore matching the UUID and group.
	*
	* @param uuid the bookstore's UUID
	* @param groupId the primary key of the group
	* @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Bookstore fetchBookstoreByUuidAndGroupId(java.lang.String uuid,
		long groupId);

	/**
	* Returns the bookstore with the primary key.
	*
	* @param bookstoreId the primary key of the bookstore
	* @return the bookstore
	* @throws PortalException if a bookstore with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Bookstore getBookstore(long bookstoreId) throws PortalException;

	/**
	* Returns the bookstore matching the UUID and group.
	*
	* @param uuid the bookstore's UUID
	* @param groupId the primary key of the group
	* @return the matching bookstore
	* @throws PortalException if a matching bookstore could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Bookstore getBookstoreByUuidAndGroupId(java.lang.String uuid,
		long groupId) throws PortalException;

	public Bookstore updateBookstore(ServiceContext serviceContext,
		long userId, long bookstoreId, java.lang.String name,
		java.lang.String country, java.lang.String city,
		java.lang.String prefecture, java.lang.String street,
		java.lang.String zip, java.lang.String phone)
		throws PortalException, SystemException;

	/**
	* Updates the bookstore in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bookstore the bookstore
	* @return the bookstore that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Bookstore updateBookstore(Bookstore bookstore);

	public int countBookstores(long companyId)
		throws SystemException, NoSuchBookstoreException;

	/**
	* Returns the number of bookstores.
	*
	* @return the number of bookstores
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getBookstoresCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<Bookstore> getAllBookstores(long companyId)
		throws SystemException, NoSuchBookstoreException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Bookstore> getAllBookstores(long companyId, int start, int end)
		throws SystemException, NoSuchBookstoreException;

	/**
	* Returns a range of all the bookstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nabook.model.impl.BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @return the range of bookstores
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Bookstore> getBookstores(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Bookstore> getBookstoresByLocation(java.lang.String country,
		java.lang.String city, java.lang.String prefecture)
		throws SystemException, NoSuchBookstoreException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Bookstore> getBookstoresByLocation(java.lang.String country,
		java.lang.String city, java.lang.String prefecture, int start, int end)
		throws SystemException, NoSuchBookstoreException;

	/**
	* Returns all the bookstores matching the UUID and company.
	*
	* @param uuid the UUID of the bookstores
	* @param companyId the primary key of the company
	* @return the matching bookstores, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Bookstore> getBookstoresByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of bookstores matching the UUID and company.
	*
	* @param uuid the UUID of the bookstores
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of bookstores
	* @param end the upper bound of the range of bookstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching bookstores, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Bookstore> getBookstoresByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<Bookstore> orderByComparator);

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
}
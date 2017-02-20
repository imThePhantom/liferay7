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

package com.nabook.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nabook.exception.NoSuchStockItemException;

import com.nabook.model.StockItem;

/**
 * The persistence interface for the stock item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author phantoan
 * @see com.nabook.service.persistence.impl.StockItemPersistenceImpl
 * @see StockItemUtil
 * @generated
 */
@ProviderType
public interface StockItemPersistence extends BasePersistence<StockItem> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StockItemUtil} to access the stock item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the stock items where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching stock items
	*/
	public java.util.List<StockItem> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the stock items where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @return the range of matching stock items
	*/
	public java.util.List<StockItem> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the stock items where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching stock items
	*/
	public java.util.List<StockItem> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator);

	/**
	* Returns an ordered range of all the stock items where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching stock items
	*/
	public java.util.List<StockItem> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first stock item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching stock item
	* @throws NoSuchStockItemException if a matching stock item could not be found
	*/
	public StockItem findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator)
		throws NoSuchStockItemException;

	/**
	* Returns the first stock item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public StockItem fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator);

	/**
	* Returns the last stock item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching stock item
	* @throws NoSuchStockItemException if a matching stock item could not be found
	*/
	public StockItem findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator)
		throws NoSuchStockItemException;

	/**
	* Returns the last stock item in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public StockItem fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator);

	/**
	* Returns the stock items before and after the current stock item in the ordered set where uuid = &#63;.
	*
	* @param stockItemId the primary key of the current stock item
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next stock item
	* @throws NoSuchStockItemException if a stock item with the primary key could not be found
	*/
	public StockItem[] findByUuid_PrevAndNext(long stockItemId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator)
		throws NoSuchStockItemException;

	/**
	* Removes all the stock items where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of stock items where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching stock items
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the stock item where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchStockItemException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching stock item
	* @throws NoSuchStockItemException if a matching stock item could not be found
	*/
	public StockItem findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchStockItemException;

	/**
	* Returns the stock item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public StockItem fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the stock item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public StockItem fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the stock item where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the stock item that was removed
	*/
	public StockItem removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchStockItemException;

	/**
	* Returns the number of stock items where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching stock items
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the stock items where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching stock items
	*/
	public java.util.List<StockItem> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the stock items where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @return the range of matching stock items
	*/
	public java.util.List<StockItem> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the stock items where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching stock items
	*/
	public java.util.List<StockItem> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator);

	/**
	* Returns an ordered range of all the stock items where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching stock items
	*/
	public java.util.List<StockItem> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first stock item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching stock item
	* @throws NoSuchStockItemException if a matching stock item could not be found
	*/
	public StockItem findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator)
		throws NoSuchStockItemException;

	/**
	* Returns the first stock item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public StockItem fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator);

	/**
	* Returns the last stock item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching stock item
	* @throws NoSuchStockItemException if a matching stock item could not be found
	*/
	public StockItem findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator)
		throws NoSuchStockItemException;

	/**
	* Returns the last stock item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public StockItem fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator);

	/**
	* Returns the stock items before and after the current stock item in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param stockItemId the primary key of the current stock item
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next stock item
	* @throws NoSuchStockItemException if a stock item with the primary key could not be found
	*/
	public StockItem[] findByUuid_C_PrevAndNext(long stockItemId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator)
		throws NoSuchStockItemException;

	/**
	* Removes all the stock items where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of stock items where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching stock items
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the stock item where bookId = &#63; or throws a {@link NoSuchStockItemException} if it could not be found.
	*
	* @param bookId the book ID
	* @return the matching stock item
	* @throws NoSuchStockItemException if a matching stock item could not be found
	*/
	public StockItem findByBookId(long bookId) throws NoSuchStockItemException;

	/**
	* Returns the stock item where bookId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param bookId the book ID
	* @return the matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public StockItem fetchByBookId(long bookId);

	/**
	* Returns the stock item where bookId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param bookId the book ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching stock item, or <code>null</code> if a matching stock item could not be found
	*/
	public StockItem fetchByBookId(long bookId, boolean retrieveFromCache);

	/**
	* Removes the stock item where bookId = &#63; from the database.
	*
	* @param bookId the book ID
	* @return the stock item that was removed
	*/
	public StockItem removeByBookId(long bookId)
		throws NoSuchStockItemException;

	/**
	* Returns the number of stock items where bookId = &#63;.
	*
	* @param bookId the book ID
	* @return the number of matching stock items
	*/
	public int countByBookId(long bookId);

	/**
	* Caches the stock item in the entity cache if it is enabled.
	*
	* @param stockItem the stock item
	*/
	public void cacheResult(StockItem stockItem);

	/**
	* Caches the stock items in the entity cache if it is enabled.
	*
	* @param stockItems the stock items
	*/
	public void cacheResult(java.util.List<StockItem> stockItems);

	/**
	* Creates a new stock item with the primary key. Does not add the stock item to the database.
	*
	* @param stockItemId the primary key for the new stock item
	* @return the new stock item
	*/
	public StockItem create(long stockItemId);

	/**
	* Removes the stock item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stockItemId the primary key of the stock item
	* @return the stock item that was removed
	* @throws NoSuchStockItemException if a stock item with the primary key could not be found
	*/
	public StockItem remove(long stockItemId) throws NoSuchStockItemException;

	public StockItem updateImpl(StockItem stockItem);

	/**
	* Returns the stock item with the primary key or throws a {@link NoSuchStockItemException} if it could not be found.
	*
	* @param stockItemId the primary key of the stock item
	* @return the stock item
	* @throws NoSuchStockItemException if a stock item with the primary key could not be found
	*/
	public StockItem findByPrimaryKey(long stockItemId)
		throws NoSuchStockItemException;

	/**
	* Returns the stock item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param stockItemId the primary key of the stock item
	* @return the stock item, or <code>null</code> if a stock item with the primary key could not be found
	*/
	public StockItem fetchByPrimaryKey(long stockItemId);

	@Override
	public java.util.Map<java.io.Serializable, StockItem> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the stock items.
	*
	* @return the stock items
	*/
	public java.util.List<StockItem> findAll();

	/**
	* Returns a range of all the stock items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @return the range of stock items
	*/
	public java.util.List<StockItem> findAll(int start, int end);

	/**
	* Returns an ordered range of all the stock items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of stock items
	*/
	public java.util.List<StockItem> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator);

	/**
	* Returns an ordered range of all the stock items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StockItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stock items
	* @param end the upper bound of the range of stock items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of stock items
	*/
	public java.util.List<StockItem> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StockItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the stock items from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of stock items.
	*
	* @return the number of stock items
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}
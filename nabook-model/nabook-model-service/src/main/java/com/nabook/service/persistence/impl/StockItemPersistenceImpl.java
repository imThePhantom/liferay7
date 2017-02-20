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

package com.nabook.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.nabook.exception.NoSuchStockItemException;

import com.nabook.model.StockItem;
import com.nabook.model.impl.StockItemImpl;
import com.nabook.model.impl.StockItemModelImpl;

import com.nabook.service.persistence.StockItemPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the stock item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author phantoan
 * @see StockItemPersistence
 * @see com.nabook.service.persistence.StockItemUtil
 * @generated
 */
@ProviderType
public class StockItemPersistenceImpl extends BasePersistenceImpl<StockItem>
	implements StockItemPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StockItemUtil} to access the stock item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StockItemImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemModelImpl.FINDER_CACHE_ENABLED, StockItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemModelImpl.FINDER_CACHE_ENABLED, StockItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemModelImpl.FINDER_CACHE_ENABLED, StockItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemModelImpl.FINDER_CACHE_ENABLED, StockItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			StockItemModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the stock items where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching stock items
	 */
	@Override
	public List<StockItem> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<StockItem> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<StockItem> findByUuid(String uuid, int start, int end,
		OrderByComparator<StockItem> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<StockItem> findByUuid(String uuid, int start, int end,
		OrderByComparator<StockItem> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<StockItem> list = null;

		if (retrieveFromCache) {
			list = (List<StockItem>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (StockItem stockItem : list) {
					if (!Objects.equals(uuid, stockItem.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_STOCKITEM_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(StockItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<StockItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<StockItem>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first stock item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching stock item
	 * @throws NoSuchStockItemException if a matching stock item could not be found
	 */
	@Override
	public StockItem findByUuid_First(String uuid,
		OrderByComparator<StockItem> orderByComparator)
		throws NoSuchStockItemException {
		StockItem stockItem = fetchByUuid_First(uuid, orderByComparator);

		if (stockItem != null) {
			return stockItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStockItemException(msg.toString());
	}

	/**
	 * Returns the first stock item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching stock item, or <code>null</code> if a matching stock item could not be found
	 */
	@Override
	public StockItem fetchByUuid_First(String uuid,
		OrderByComparator<StockItem> orderByComparator) {
		List<StockItem> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last stock item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching stock item
	 * @throws NoSuchStockItemException if a matching stock item could not be found
	 */
	@Override
	public StockItem findByUuid_Last(String uuid,
		OrderByComparator<StockItem> orderByComparator)
		throws NoSuchStockItemException {
		StockItem stockItem = fetchByUuid_Last(uuid, orderByComparator);

		if (stockItem != null) {
			return stockItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStockItemException(msg.toString());
	}

	/**
	 * Returns the last stock item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching stock item, or <code>null</code> if a matching stock item could not be found
	 */
	@Override
	public StockItem fetchByUuid_Last(String uuid,
		OrderByComparator<StockItem> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<StockItem> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the stock items before and after the current stock item in the ordered set where uuid = &#63;.
	 *
	 * @param stockItemId the primary key of the current stock item
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next stock item
	 * @throws NoSuchStockItemException if a stock item with the primary key could not be found
	 */
	@Override
	public StockItem[] findByUuid_PrevAndNext(long stockItemId, String uuid,
		OrderByComparator<StockItem> orderByComparator)
		throws NoSuchStockItemException {
		StockItem stockItem = findByPrimaryKey(stockItemId);

		Session session = null;

		try {
			session = openSession();

			StockItem[] array = new StockItemImpl[3];

			array[0] = getByUuid_PrevAndNext(session, stockItem, uuid,
					orderByComparator, true);

			array[1] = stockItem;

			array[2] = getByUuid_PrevAndNext(session, stockItem, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected StockItem getByUuid_PrevAndNext(Session session,
		StockItem stockItem, String uuid,
		OrderByComparator<StockItem> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_STOCKITEM_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(StockItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(stockItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<StockItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the stock items where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (StockItem stockItem : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(stockItem);
		}
	}

	/**
	 * Returns the number of stock items where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching stock items
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_STOCKITEM_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "stockItem.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "stockItem.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(stockItem.uuid IS NULL OR stockItem.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemModelImpl.FINDER_CACHE_ENABLED, StockItemImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			StockItemModelImpl.UUID_COLUMN_BITMASK |
			StockItemModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the stock item where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchStockItemException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching stock item
	 * @throws NoSuchStockItemException if a matching stock item could not be found
	 */
	@Override
	public StockItem findByUUID_G(String uuid, long groupId)
		throws NoSuchStockItemException {
		StockItem stockItem = fetchByUUID_G(uuid, groupId);

		if (stockItem == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchStockItemException(msg.toString());
		}

		return stockItem;
	}

	/**
	 * Returns the stock item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching stock item, or <code>null</code> if a matching stock item could not be found
	 */
	@Override
	public StockItem fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the stock item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching stock item, or <code>null</code> if a matching stock item could not be found
	 */
	@Override
	public StockItem fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof StockItem) {
			StockItem stockItem = (StockItem)result;

			if (!Objects.equals(uuid, stockItem.getUuid()) ||
					(groupId != stockItem.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_STOCKITEM_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<StockItem> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					StockItem stockItem = list.get(0);

					result = stockItem;

					cacheResult(stockItem);

					if ((stockItem.getUuid() == null) ||
							!stockItem.getUuid().equals(uuid) ||
							(stockItem.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, stockItem);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (StockItem)result;
		}
	}

	/**
	 * Removes the stock item where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the stock item that was removed
	 */
	@Override
	public StockItem removeByUUID_G(String uuid, long groupId)
		throws NoSuchStockItemException {
		StockItem stockItem = findByUUID_G(uuid, groupId);

		return remove(stockItem);
	}

	/**
	 * Returns the number of stock items where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching stock items
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_STOCKITEM_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "stockItem.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "stockItem.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(stockItem.uuid IS NULL OR stockItem.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "stockItem.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemModelImpl.FINDER_CACHE_ENABLED, StockItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemModelImpl.FINDER_CACHE_ENABLED, StockItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			StockItemModelImpl.UUID_COLUMN_BITMASK |
			StockItemModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the stock items where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching stock items
	 */
	@Override
	public List<StockItem> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<StockItem> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

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
	@Override
	public List<StockItem> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<StockItem> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<StockItem> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<StockItem> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<StockItem> list = null;

		if (retrieveFromCache) {
			list = (List<StockItem>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (StockItem stockItem : list) {
					if (!Objects.equals(uuid, stockItem.getUuid()) ||
							(companyId != stockItem.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_STOCKITEM_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(StockItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<StockItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<StockItem>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first stock item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching stock item
	 * @throws NoSuchStockItemException if a matching stock item could not be found
	 */
	@Override
	public StockItem findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<StockItem> orderByComparator)
		throws NoSuchStockItemException {
		StockItem stockItem = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (stockItem != null) {
			return stockItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStockItemException(msg.toString());
	}

	/**
	 * Returns the first stock item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching stock item, or <code>null</code> if a matching stock item could not be found
	 */
	@Override
	public StockItem fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<StockItem> orderByComparator) {
		List<StockItem> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last stock item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching stock item
	 * @throws NoSuchStockItemException if a matching stock item could not be found
	 */
	@Override
	public StockItem findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<StockItem> orderByComparator)
		throws NoSuchStockItemException {
		StockItem stockItem = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (stockItem != null) {
			return stockItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStockItemException(msg.toString());
	}

	/**
	 * Returns the last stock item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching stock item, or <code>null</code> if a matching stock item could not be found
	 */
	@Override
	public StockItem fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<StockItem> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<StockItem> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public StockItem[] findByUuid_C_PrevAndNext(long stockItemId, String uuid,
		long companyId, OrderByComparator<StockItem> orderByComparator)
		throws NoSuchStockItemException {
		StockItem stockItem = findByPrimaryKey(stockItemId);

		Session session = null;

		try {
			session = openSession();

			StockItem[] array = new StockItemImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, stockItem, uuid,
					companyId, orderByComparator, true);

			array[1] = stockItem;

			array[2] = getByUuid_C_PrevAndNext(session, stockItem, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected StockItem getByUuid_C_PrevAndNext(Session session,
		StockItem stockItem, String uuid, long companyId,
		OrderByComparator<StockItem> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_STOCKITEM_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(StockItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(stockItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<StockItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the stock items where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (StockItem stockItem : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(stockItem);
		}
	}

	/**
	 * Returns the number of stock items where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching stock items
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_STOCKITEM_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "stockItem.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "stockItem.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(stockItem.uuid IS NULL OR stockItem.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "stockItem.companyId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_BOOKID = new FinderPath(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemModelImpl.FINDER_CACHE_ENABLED, StockItemImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByBookId",
			new String[] { Long.class.getName() },
			StockItemModelImpl.BOOKID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BOOKID = new FinderPath(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBookId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the stock item where bookId = &#63; or throws a {@link NoSuchStockItemException} if it could not be found.
	 *
	 * @param bookId the book ID
	 * @return the matching stock item
	 * @throws NoSuchStockItemException if a matching stock item could not be found
	 */
	@Override
	public StockItem findByBookId(long bookId) throws NoSuchStockItemException {
		StockItem stockItem = fetchByBookId(bookId);

		if (stockItem == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("bookId=");
			msg.append(bookId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchStockItemException(msg.toString());
		}

		return stockItem;
	}

	/**
	 * Returns the stock item where bookId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param bookId the book ID
	 * @return the matching stock item, or <code>null</code> if a matching stock item could not be found
	 */
	@Override
	public StockItem fetchByBookId(long bookId) {
		return fetchByBookId(bookId, true);
	}

	/**
	 * Returns the stock item where bookId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param bookId the book ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching stock item, or <code>null</code> if a matching stock item could not be found
	 */
	@Override
	public StockItem fetchByBookId(long bookId, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { bookId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_BOOKID,
					finderArgs, this);
		}

		if (result instanceof StockItem) {
			StockItem stockItem = (StockItem)result;

			if ((bookId != stockItem.getBookId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_STOCKITEM_WHERE);

			query.append(_FINDER_COLUMN_BOOKID_BOOKID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bookId);

				List<StockItem> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_BOOKID,
						finderArgs, list);
				}
				else {
					StockItem stockItem = list.get(0);

					result = stockItem;

					cacheResult(stockItem);

					if ((stockItem.getBookId() != bookId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_BOOKID,
							finderArgs, stockItem);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_BOOKID, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (StockItem)result;
		}
	}

	/**
	 * Removes the stock item where bookId = &#63; from the database.
	 *
	 * @param bookId the book ID
	 * @return the stock item that was removed
	 */
	@Override
	public StockItem removeByBookId(long bookId)
		throws NoSuchStockItemException {
		StockItem stockItem = findByBookId(bookId);

		return remove(stockItem);
	}

	/**
	 * Returns the number of stock items where bookId = &#63;.
	 *
	 * @param bookId the book ID
	 * @return the number of matching stock items
	 */
	@Override
	public int countByBookId(long bookId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BOOKID;

		Object[] finderArgs = new Object[] { bookId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_STOCKITEM_WHERE);

			query.append(_FINDER_COLUMN_BOOKID_BOOKID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bookId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_BOOKID_BOOKID_2 = "stockItem.bookId = ?";

	public StockItemPersistenceImpl() {
		setModelClass(StockItem.class);
	}

	/**
	 * Caches the stock item in the entity cache if it is enabled.
	 *
	 * @param stockItem the stock item
	 */
	@Override
	public void cacheResult(StockItem stockItem) {
		entityCache.putResult(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemImpl.class, stockItem.getPrimaryKey(), stockItem);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { stockItem.getUuid(), stockItem.getGroupId() },
			stockItem);

		finderCache.putResult(FINDER_PATH_FETCH_BY_BOOKID,
			new Object[] { stockItem.getBookId() }, stockItem);

		stockItem.resetOriginalValues();
	}

	/**
	 * Caches the stock items in the entity cache if it is enabled.
	 *
	 * @param stockItems the stock items
	 */
	@Override
	public void cacheResult(List<StockItem> stockItems) {
		for (StockItem stockItem : stockItems) {
			if (entityCache.getResult(StockItemModelImpl.ENTITY_CACHE_ENABLED,
						StockItemImpl.class, stockItem.getPrimaryKey()) == null) {
				cacheResult(stockItem);
			}
			else {
				stockItem.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all stock items.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(StockItemImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the stock item.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StockItem stockItem) {
		entityCache.removeResult(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemImpl.class, stockItem.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((StockItemModelImpl)stockItem);
	}

	@Override
	public void clearCache(List<StockItem> stockItems) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StockItem stockItem : stockItems) {
			entityCache.removeResult(StockItemModelImpl.ENTITY_CACHE_ENABLED,
				StockItemImpl.class, stockItem.getPrimaryKey());

			clearUniqueFindersCache((StockItemModelImpl)stockItem);
		}
	}

	protected void cacheUniqueFindersCache(
		StockItemModelImpl stockItemModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					stockItemModelImpl.getUuid(),
					stockItemModelImpl.getGroupId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				stockItemModelImpl);

			args = new Object[] { stockItemModelImpl.getBookId() };

			finderCache.putResult(FINDER_PATH_COUNT_BY_BOOKID, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_BOOKID, args,
				stockItemModelImpl);
		}
		else {
			if ((stockItemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						stockItemModelImpl.getUuid(),
						stockItemModelImpl.getGroupId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					stockItemModelImpl);
			}

			if ((stockItemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_BOOKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { stockItemModelImpl.getBookId() };

				finderCache.putResult(FINDER_PATH_COUNT_BY_BOOKID, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_BOOKID, args,
					stockItemModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		StockItemModelImpl stockItemModelImpl) {
		Object[] args = new Object[] {
				stockItemModelImpl.getUuid(), stockItemModelImpl.getGroupId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((stockItemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					stockItemModelImpl.getOriginalUuid(),
					stockItemModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		args = new Object[] { stockItemModelImpl.getBookId() };

		finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKID, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_BOOKID, args);

		if ((stockItemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_BOOKID.getColumnBitmask()) != 0) {
			args = new Object[] { stockItemModelImpl.getOriginalBookId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_BOOKID, args);
		}
	}

	/**
	 * Creates a new stock item with the primary key. Does not add the stock item to the database.
	 *
	 * @param stockItemId the primary key for the new stock item
	 * @return the new stock item
	 */
	@Override
	public StockItem create(long stockItemId) {
		StockItem stockItem = new StockItemImpl();

		stockItem.setNew(true);
		stockItem.setPrimaryKey(stockItemId);

		String uuid = PortalUUIDUtil.generate();

		stockItem.setUuid(uuid);

		stockItem.setCompanyId(companyProvider.getCompanyId());

		return stockItem;
	}

	/**
	 * Removes the stock item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param stockItemId the primary key of the stock item
	 * @return the stock item that was removed
	 * @throws NoSuchStockItemException if a stock item with the primary key could not be found
	 */
	@Override
	public StockItem remove(long stockItemId) throws NoSuchStockItemException {
		return remove((Serializable)stockItemId);
	}

	/**
	 * Removes the stock item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the stock item
	 * @return the stock item that was removed
	 * @throws NoSuchStockItemException if a stock item with the primary key could not be found
	 */
	@Override
	public StockItem remove(Serializable primaryKey)
		throws NoSuchStockItemException {
		Session session = null;

		try {
			session = openSession();

			StockItem stockItem = (StockItem)session.get(StockItemImpl.class,
					primaryKey);

			if (stockItem == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStockItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(stockItem);
		}
		catch (NoSuchStockItemException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected StockItem removeImpl(StockItem stockItem) {
		stockItem = toUnwrappedModel(stockItem);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(stockItem)) {
				stockItem = (StockItem)session.get(StockItemImpl.class,
						stockItem.getPrimaryKeyObj());
			}

			if (stockItem != null) {
				session.delete(stockItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (stockItem != null) {
			clearCache(stockItem);
		}

		return stockItem;
	}

	@Override
	public StockItem updateImpl(StockItem stockItem) {
		stockItem = toUnwrappedModel(stockItem);

		boolean isNew = stockItem.isNew();

		StockItemModelImpl stockItemModelImpl = (StockItemModelImpl)stockItem;

		if (Validator.isNull(stockItem.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			stockItem.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (stockItem.getCreateDate() == null)) {
			if (serviceContext == null) {
				stockItem.setCreateDate(now);
			}
			else {
				stockItem.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!stockItemModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				stockItem.setModifiedDate(now);
			}
			else {
				stockItem.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (stockItem.isNew()) {
				session.save(stockItem);

				stockItem.setNew(false);
			}
			else {
				stockItem = (StockItem)session.merge(stockItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !StockItemModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((stockItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						stockItemModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { stockItemModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((stockItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						stockItemModelImpl.getOriginalUuid(),
						stockItemModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						stockItemModelImpl.getUuid(),
						stockItemModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		entityCache.putResult(StockItemModelImpl.ENTITY_CACHE_ENABLED,
			StockItemImpl.class, stockItem.getPrimaryKey(), stockItem, false);

		clearUniqueFindersCache(stockItemModelImpl);
		cacheUniqueFindersCache(stockItemModelImpl, isNew);

		stockItem.resetOriginalValues();

		return stockItem;
	}

	protected StockItem toUnwrappedModel(StockItem stockItem) {
		if (stockItem instanceof StockItemImpl) {
			return stockItem;
		}

		StockItemImpl stockItemImpl = new StockItemImpl();

		stockItemImpl.setNew(stockItem.isNew());
		stockItemImpl.setPrimaryKey(stockItem.getPrimaryKey());

		stockItemImpl.setUuid(stockItem.getUuid());
		stockItemImpl.setStockItemId(stockItem.getStockItemId());
		stockItemImpl.setGroupId(stockItem.getGroupId());
		stockItemImpl.setCompanyId(stockItem.getCompanyId());
		stockItemImpl.setCreateDate(stockItem.getCreateDate());
		stockItemImpl.setModifiedDate(stockItem.getModifiedDate());
		stockItemImpl.setUserId(stockItem.getUserId());
		stockItemImpl.setUserName(stockItem.getUserName());
		stockItemImpl.setBookId(stockItem.getBookId());
		stockItemImpl.setRemainingQuantity(stockItem.getRemainingQuantity());

		return stockItemImpl;
	}

	/**
	 * Returns the stock item with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the stock item
	 * @return the stock item
	 * @throws NoSuchStockItemException if a stock item with the primary key could not be found
	 */
	@Override
	public StockItem findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStockItemException {
		StockItem stockItem = fetchByPrimaryKey(primaryKey);

		if (stockItem == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStockItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return stockItem;
	}

	/**
	 * Returns the stock item with the primary key or throws a {@link NoSuchStockItemException} if it could not be found.
	 *
	 * @param stockItemId the primary key of the stock item
	 * @return the stock item
	 * @throws NoSuchStockItemException if a stock item with the primary key could not be found
	 */
	@Override
	public StockItem findByPrimaryKey(long stockItemId)
		throws NoSuchStockItemException {
		return findByPrimaryKey((Serializable)stockItemId);
	}

	/**
	 * Returns the stock item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the stock item
	 * @return the stock item, or <code>null</code> if a stock item with the primary key could not be found
	 */
	@Override
	public StockItem fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(StockItemModelImpl.ENTITY_CACHE_ENABLED,
				StockItemImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		StockItem stockItem = (StockItem)serializable;

		if (stockItem == null) {
			Session session = null;

			try {
				session = openSession();

				stockItem = (StockItem)session.get(StockItemImpl.class,
						primaryKey);

				if (stockItem != null) {
					cacheResult(stockItem);
				}
				else {
					entityCache.putResult(StockItemModelImpl.ENTITY_CACHE_ENABLED,
						StockItemImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(StockItemModelImpl.ENTITY_CACHE_ENABLED,
					StockItemImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return stockItem;
	}

	/**
	 * Returns the stock item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param stockItemId the primary key of the stock item
	 * @return the stock item, or <code>null</code> if a stock item with the primary key could not be found
	 */
	@Override
	public StockItem fetchByPrimaryKey(long stockItemId) {
		return fetchByPrimaryKey((Serializable)stockItemId);
	}

	@Override
	public Map<Serializable, StockItem> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, StockItem> map = new HashMap<Serializable, StockItem>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			StockItem stockItem = fetchByPrimaryKey(primaryKey);

			if (stockItem != null) {
				map.put(primaryKey, stockItem);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(StockItemModelImpl.ENTITY_CACHE_ENABLED,
					StockItemImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (StockItem)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_STOCKITEM_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (StockItem stockItem : (List<StockItem>)q.list()) {
				map.put(stockItem.getPrimaryKeyObj(), stockItem);

				cacheResult(stockItem);

				uncachedPrimaryKeys.remove(stockItem.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(StockItemModelImpl.ENTITY_CACHE_ENABLED,
					StockItemImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the stock items.
	 *
	 * @return the stock items
	 */
	@Override
	public List<StockItem> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<StockItem> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<StockItem> findAll(int start, int end,
		OrderByComparator<StockItem> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<StockItem> findAll(int start, int end,
		OrderByComparator<StockItem> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<StockItem> list = null;

		if (retrieveFromCache) {
			list = (List<StockItem>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_STOCKITEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STOCKITEM;

				if (pagination) {
					sql = sql.concat(StockItemModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<StockItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<StockItem>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the stock items from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (StockItem stockItem : findAll()) {
			remove(stockItem);
		}
	}

	/**
	 * Returns the number of stock items.
	 *
	 * @return the number of stock items
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_STOCKITEM);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return StockItemModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the stock item persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(StockItemImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_STOCKITEM = "SELECT stockItem FROM StockItem stockItem";
	private static final String _SQL_SELECT_STOCKITEM_WHERE_PKS_IN = "SELECT stockItem FROM StockItem stockItem WHERE stockItemId IN (";
	private static final String _SQL_SELECT_STOCKITEM_WHERE = "SELECT stockItem FROM StockItem stockItem WHERE ";
	private static final String _SQL_COUNT_STOCKITEM = "SELECT COUNT(stockItem) FROM StockItem stockItem";
	private static final String _SQL_COUNT_STOCKITEM_WHERE = "SELECT COUNT(stockItem) FROM StockItem stockItem WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "stockItem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StockItem exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No StockItem exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(StockItemPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}
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

import com.nabook.exception.NoSuchOrderItemException;

import com.nabook.model.OrderItem;
import com.nabook.model.impl.OrderItemImpl;
import com.nabook.model.impl.OrderItemModelImpl;

import com.nabook.service.persistence.OrderItemPersistence;

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
 * The persistence implementation for the order item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author phantoan
 * @see OrderItemPersistence
 * @see com.nabook.service.persistence.OrderItemUtil
 * @generated
 */
@ProviderType
public class OrderItemPersistenceImpl extends BasePersistenceImpl<OrderItem>
	implements OrderItemPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OrderItemUtil} to access the order item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OrderItemImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, OrderItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, OrderItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, OrderItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, OrderItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			OrderItemModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the order items where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching order items
	 */
	@Override
	public List<OrderItem> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the order items where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @return the range of matching order items
	 */
	@Override
	public List<OrderItem> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the order items where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching order items
	 */
	@Override
	public List<OrderItem> findByUuid(String uuid, int start, int end,
		OrderByComparator<OrderItem> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the order items where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching order items
	 */
	@Override
	public List<OrderItem> findByUuid(String uuid, int start, int end,
		OrderByComparator<OrderItem> orderByComparator,
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

		List<OrderItem> list = null;

		if (retrieveFromCache) {
			list = (List<OrderItem>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OrderItem orderItem : list) {
					if (!Objects.equals(uuid, orderItem.getUuid())) {
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

			query.append(_SQL_SELECT_ORDERITEM_WHERE);

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
				query.append(OrderItemModelImpl.ORDER_BY_JPQL);
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
					list = (List<OrderItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<OrderItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first order item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching order item
	 * @throws NoSuchOrderItemException if a matching order item could not be found
	 */
	@Override
	public OrderItem findByUuid_First(String uuid,
		OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = fetchByUuid_First(uuid, orderByComparator);

		if (orderItem != null) {
			return orderItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrderItemException(msg.toString());
	}

	/**
	 * Returns the first order item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching order item, or <code>null</code> if a matching order item could not be found
	 */
	@Override
	public OrderItem fetchByUuid_First(String uuid,
		OrderByComparator<OrderItem> orderByComparator) {
		List<OrderItem> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last order item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching order item
	 * @throws NoSuchOrderItemException if a matching order item could not be found
	 */
	@Override
	public OrderItem findByUuid_Last(String uuid,
		OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = fetchByUuid_Last(uuid, orderByComparator);

		if (orderItem != null) {
			return orderItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrderItemException(msg.toString());
	}

	/**
	 * Returns the last order item in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching order item, or <code>null</code> if a matching order item could not be found
	 */
	@Override
	public OrderItem fetchByUuid_Last(String uuid,
		OrderByComparator<OrderItem> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OrderItem> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the order items before and after the current order item in the ordered set where uuid = &#63;.
	 *
	 * @param orderItemId the primary key of the current order item
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next order item
	 * @throws NoSuchOrderItemException if a order item with the primary key could not be found
	 */
	@Override
	public OrderItem[] findByUuid_PrevAndNext(long orderItemId, String uuid,
		OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = findByPrimaryKey(orderItemId);

		Session session = null;

		try {
			session = openSession();

			OrderItem[] array = new OrderItemImpl[3];

			array[0] = getByUuid_PrevAndNext(session, orderItem, uuid,
					orderByComparator, true);

			array[1] = orderItem;

			array[2] = getByUuid_PrevAndNext(session, orderItem, uuid,
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

	protected OrderItem getByUuid_PrevAndNext(Session session,
		OrderItem orderItem, String uuid,
		OrderByComparator<OrderItem> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ORDERITEM_WHERE);

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
			query.append(OrderItemModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(orderItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OrderItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the order items where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OrderItem orderItem : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(orderItem);
		}
	}

	/**
	 * Returns the number of order items where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching order items
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ORDERITEM_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "orderItem.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "orderItem.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(orderItem.uuid IS NULL OR orderItem.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, OrderItemImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			OrderItemModelImpl.UUID_COLUMN_BITMASK |
			OrderItemModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the order item where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchOrderItemException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching order item
	 * @throws NoSuchOrderItemException if a matching order item could not be found
	 */
	@Override
	public OrderItem findByUUID_G(String uuid, long groupId)
		throws NoSuchOrderItemException {
		OrderItem orderItem = fetchByUUID_G(uuid, groupId);

		if (orderItem == null) {
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

			throw new NoSuchOrderItemException(msg.toString());
		}

		return orderItem;
	}

	/**
	 * Returns the order item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching order item, or <code>null</code> if a matching order item could not be found
	 */
	@Override
	public OrderItem fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the order item where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching order item, or <code>null</code> if a matching order item could not be found
	 */
	@Override
	public OrderItem fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof OrderItem) {
			OrderItem orderItem = (OrderItem)result;

			if (!Objects.equals(uuid, orderItem.getUuid()) ||
					(groupId != orderItem.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ORDERITEM_WHERE);

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

				List<OrderItem> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					OrderItem orderItem = list.get(0);

					result = orderItem;

					cacheResult(orderItem);

					if ((orderItem.getUuid() == null) ||
							!orderItem.getUuid().equals(uuid) ||
							(orderItem.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, orderItem);
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
			return (OrderItem)result;
		}
	}

	/**
	 * Removes the order item where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the order item that was removed
	 */
	@Override
	public OrderItem removeByUUID_G(String uuid, long groupId)
		throws NoSuchOrderItemException {
		OrderItem orderItem = findByUUID_G(uuid, groupId);

		return remove(orderItem);
	}

	/**
	 * Returns the number of order items where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching order items
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ORDERITEM_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "orderItem.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "orderItem.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(orderItem.uuid IS NULL OR orderItem.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "orderItem.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, OrderItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, OrderItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			OrderItemModelImpl.UUID_COLUMN_BITMASK |
			OrderItemModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the order items where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching order items
	 */
	@Override
	public List<OrderItem> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the order items where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @return the range of matching order items
	 */
	@Override
	public List<OrderItem> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the order items where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching order items
	 */
	@Override
	public List<OrderItem> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<OrderItem> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the order items where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching order items
	 */
	@Override
	public List<OrderItem> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<OrderItem> orderByComparator,
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

		List<OrderItem> list = null;

		if (retrieveFromCache) {
			list = (List<OrderItem>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OrderItem orderItem : list) {
					if (!Objects.equals(uuid, orderItem.getUuid()) ||
							(companyId != orderItem.getCompanyId())) {
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

			query.append(_SQL_SELECT_ORDERITEM_WHERE);

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
				query.append(OrderItemModelImpl.ORDER_BY_JPQL);
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
					list = (List<OrderItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<OrderItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first order item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching order item
	 * @throws NoSuchOrderItemException if a matching order item could not be found
	 */
	@Override
	public OrderItem findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (orderItem != null) {
			return orderItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrderItemException(msg.toString());
	}

	/**
	 * Returns the first order item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching order item, or <code>null</code> if a matching order item could not be found
	 */
	@Override
	public OrderItem fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<OrderItem> orderByComparator) {
		List<OrderItem> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last order item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching order item
	 * @throws NoSuchOrderItemException if a matching order item could not be found
	 */
	@Override
	public OrderItem findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (orderItem != null) {
			return orderItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrderItemException(msg.toString());
	}

	/**
	 * Returns the last order item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching order item, or <code>null</code> if a matching order item could not be found
	 */
	@Override
	public OrderItem fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<OrderItem> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OrderItem> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the order items before and after the current order item in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param orderItemId the primary key of the current order item
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next order item
	 * @throws NoSuchOrderItemException if a order item with the primary key could not be found
	 */
	@Override
	public OrderItem[] findByUuid_C_PrevAndNext(long orderItemId, String uuid,
		long companyId, OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = findByPrimaryKey(orderItemId);

		Session session = null;

		try {
			session = openSession();

			OrderItem[] array = new OrderItemImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, orderItem, uuid,
					companyId, orderByComparator, true);

			array[1] = orderItem;

			array[2] = getByUuid_C_PrevAndNext(session, orderItem, uuid,
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

	protected OrderItem getByUuid_C_PrevAndNext(Session session,
		OrderItem orderItem, String uuid, long companyId,
		OrderByComparator<OrderItem> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_ORDERITEM_WHERE);

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
			query.append(OrderItemModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(orderItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OrderItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the order items where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OrderItem orderItem : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(orderItem);
		}
	}

	/**
	 * Returns the number of order items where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching order items
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ORDERITEM_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "orderItem.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "orderItem.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(orderItem.uuid IS NULL OR orderItem.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "orderItem.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORDERID = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, OrderItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrderId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID =
		new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, OrderItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrderId",
			new String[] { Long.class.getName() },
			OrderItemModelImpl.BOOKORDERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORDERID = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrderId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the order items where bookOrderId = &#63;.
	 *
	 * @param bookOrderId the book order ID
	 * @return the matching order items
	 */
	@Override
	public List<OrderItem> findByOrderId(long bookOrderId) {
		return findByOrderId(bookOrderId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the order items where bookOrderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param bookOrderId the book order ID
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @return the range of matching order items
	 */
	@Override
	public List<OrderItem> findByOrderId(long bookOrderId, int start, int end) {
		return findByOrderId(bookOrderId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the order items where bookOrderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param bookOrderId the book order ID
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching order items
	 */
	@Override
	public List<OrderItem> findByOrderId(long bookOrderId, int start, int end,
		OrderByComparator<OrderItem> orderByComparator) {
		return findByOrderId(bookOrderId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the order items where bookOrderId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param bookOrderId the book order ID
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching order items
	 */
	@Override
	public List<OrderItem> findByOrderId(long bookOrderId, int start, int end,
		OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID;
			finderArgs = new Object[] { bookOrderId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORDERID;
			finderArgs = new Object[] { bookOrderId, start, end, orderByComparator };
		}

		List<OrderItem> list = null;

		if (retrieveFromCache) {
			list = (List<OrderItem>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OrderItem orderItem : list) {
					if ((bookOrderId != orderItem.getBookOrderId())) {
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

			query.append(_SQL_SELECT_ORDERITEM_WHERE);

			query.append(_FINDER_COLUMN_ORDERID_BOOKORDERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OrderItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bookOrderId);

				if (!pagination) {
					list = (List<OrderItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<OrderItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first order item in the ordered set where bookOrderId = &#63;.
	 *
	 * @param bookOrderId the book order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching order item
	 * @throws NoSuchOrderItemException if a matching order item could not be found
	 */
	@Override
	public OrderItem findByOrderId_First(long bookOrderId,
		OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = fetchByOrderId_First(bookOrderId,
				orderByComparator);

		if (orderItem != null) {
			return orderItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookOrderId=");
		msg.append(bookOrderId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrderItemException(msg.toString());
	}

	/**
	 * Returns the first order item in the ordered set where bookOrderId = &#63;.
	 *
	 * @param bookOrderId the book order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching order item, or <code>null</code> if a matching order item could not be found
	 */
	@Override
	public OrderItem fetchByOrderId_First(long bookOrderId,
		OrderByComparator<OrderItem> orderByComparator) {
		List<OrderItem> list = findByOrderId(bookOrderId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last order item in the ordered set where bookOrderId = &#63;.
	 *
	 * @param bookOrderId the book order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching order item
	 * @throws NoSuchOrderItemException if a matching order item could not be found
	 */
	@Override
	public OrderItem findByOrderId_Last(long bookOrderId,
		OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = fetchByOrderId_Last(bookOrderId, orderByComparator);

		if (orderItem != null) {
			return orderItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookOrderId=");
		msg.append(bookOrderId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrderItemException(msg.toString());
	}

	/**
	 * Returns the last order item in the ordered set where bookOrderId = &#63;.
	 *
	 * @param bookOrderId the book order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching order item, or <code>null</code> if a matching order item could not be found
	 */
	@Override
	public OrderItem fetchByOrderId_Last(long bookOrderId,
		OrderByComparator<OrderItem> orderByComparator) {
		int count = countByOrderId(bookOrderId);

		if (count == 0) {
			return null;
		}

		List<OrderItem> list = findByOrderId(bookOrderId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the order items before and after the current order item in the ordered set where bookOrderId = &#63;.
	 *
	 * @param orderItemId the primary key of the current order item
	 * @param bookOrderId the book order ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next order item
	 * @throws NoSuchOrderItemException if a order item with the primary key could not be found
	 */
	@Override
	public OrderItem[] findByOrderId_PrevAndNext(long orderItemId,
		long bookOrderId, OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = findByPrimaryKey(orderItemId);

		Session session = null;

		try {
			session = openSession();

			OrderItem[] array = new OrderItemImpl[3];

			array[0] = getByOrderId_PrevAndNext(session, orderItem,
					bookOrderId, orderByComparator, true);

			array[1] = orderItem;

			array[2] = getByOrderId_PrevAndNext(session, orderItem,
					bookOrderId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OrderItem getByOrderId_PrevAndNext(Session session,
		OrderItem orderItem, long bookOrderId,
		OrderByComparator<OrderItem> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ORDERITEM_WHERE);

		query.append(_FINDER_COLUMN_ORDERID_BOOKORDERID_2);

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
			query.append(OrderItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(bookOrderId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(orderItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OrderItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the order items where bookOrderId = &#63; from the database.
	 *
	 * @param bookOrderId the book order ID
	 */
	@Override
	public void removeByOrderId(long bookOrderId) {
		for (OrderItem orderItem : findByOrderId(bookOrderId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(orderItem);
		}
	}

	/**
	 * Returns the number of order items where bookOrderId = &#63;.
	 *
	 * @param bookOrderId the book order ID
	 * @return the number of matching order items
	 */
	@Override
	public int countByOrderId(long bookOrderId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORDERID;

		Object[] finderArgs = new Object[] { bookOrderId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ORDERITEM_WHERE);

			query.append(_FINDER_COLUMN_ORDERID_BOOKORDERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bookOrderId);

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

	private static final String _FINDER_COLUMN_ORDERID_BOOKORDERID_2 = "orderItem.bookOrderId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKID = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, OrderItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBookId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKID =
		new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, OrderItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBookId",
			new String[] { Long.class.getName() },
			OrderItemModelImpl.BOOKID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BOOKID = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBookId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the order items where bookId = &#63;.
	 *
	 * @param bookId the book ID
	 * @return the matching order items
	 */
	@Override
	public List<OrderItem> findByBookId(long bookId) {
		return findByBookId(bookId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the order items where bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param bookId the book ID
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @return the range of matching order items
	 */
	@Override
	public List<OrderItem> findByBookId(long bookId, int start, int end) {
		return findByBookId(bookId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the order items where bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param bookId the book ID
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching order items
	 */
	@Override
	public List<OrderItem> findByBookId(long bookId, int start, int end,
		OrderByComparator<OrderItem> orderByComparator) {
		return findByBookId(bookId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the order items where bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param bookId the book ID
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching order items
	 */
	@Override
	public List<OrderItem> findByBookId(long bookId, int start, int end,
		OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKID;
			finderArgs = new Object[] { bookId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKID;
			finderArgs = new Object[] { bookId, start, end, orderByComparator };
		}

		List<OrderItem> list = null;

		if (retrieveFromCache) {
			list = (List<OrderItem>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OrderItem orderItem : list) {
					if ((bookId != orderItem.getBookId())) {
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

			query.append(_SQL_SELECT_ORDERITEM_WHERE);

			query.append(_FINDER_COLUMN_BOOKID_BOOKID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OrderItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bookId);

				if (!pagination) {
					list = (List<OrderItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<OrderItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first order item in the ordered set where bookId = &#63;.
	 *
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching order item
	 * @throws NoSuchOrderItemException if a matching order item could not be found
	 */
	@Override
	public OrderItem findByBookId_First(long bookId,
		OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = fetchByBookId_First(bookId, orderByComparator);

		if (orderItem != null) {
			return orderItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookId=");
		msg.append(bookId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrderItemException(msg.toString());
	}

	/**
	 * Returns the first order item in the ordered set where bookId = &#63;.
	 *
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching order item, or <code>null</code> if a matching order item could not be found
	 */
	@Override
	public OrderItem fetchByBookId_First(long bookId,
		OrderByComparator<OrderItem> orderByComparator) {
		List<OrderItem> list = findByBookId(bookId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last order item in the ordered set where bookId = &#63;.
	 *
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching order item
	 * @throws NoSuchOrderItemException if a matching order item could not be found
	 */
	@Override
	public OrderItem findByBookId_Last(long bookId,
		OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = fetchByBookId_Last(bookId, orderByComparator);

		if (orderItem != null) {
			return orderItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bookId=");
		msg.append(bookId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrderItemException(msg.toString());
	}

	/**
	 * Returns the last order item in the ordered set where bookId = &#63;.
	 *
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching order item, or <code>null</code> if a matching order item could not be found
	 */
	@Override
	public OrderItem fetchByBookId_Last(long bookId,
		OrderByComparator<OrderItem> orderByComparator) {
		int count = countByBookId(bookId);

		if (count == 0) {
			return null;
		}

		List<OrderItem> list = findByBookId(bookId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the order items before and after the current order item in the ordered set where bookId = &#63;.
	 *
	 * @param orderItemId the primary key of the current order item
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next order item
	 * @throws NoSuchOrderItemException if a order item with the primary key could not be found
	 */
	@Override
	public OrderItem[] findByBookId_PrevAndNext(long orderItemId, long bookId,
		OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = findByPrimaryKey(orderItemId);

		Session session = null;

		try {
			session = openSession();

			OrderItem[] array = new OrderItemImpl[3];

			array[0] = getByBookId_PrevAndNext(session, orderItem, bookId,
					orderByComparator, true);

			array[1] = orderItem;

			array[2] = getByBookId_PrevAndNext(session, orderItem, bookId,
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

	protected OrderItem getByBookId_PrevAndNext(Session session,
		OrderItem orderItem, long bookId,
		OrderByComparator<OrderItem> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ORDERITEM_WHERE);

		query.append(_FINDER_COLUMN_BOOKID_BOOKID_2);

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
			query.append(OrderItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(bookId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(orderItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OrderItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the order items where bookId = &#63; from the database.
	 *
	 * @param bookId the book ID
	 */
	@Override
	public void removeByBookId(long bookId) {
		for (OrderItem orderItem : findByBookId(bookId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(orderItem);
		}
	}

	/**
	 * Returns the number of order items where bookId = &#63;.
	 *
	 * @param bookId the book ID
	 * @return the number of matching order items
	 */
	@Override
	public int countByBookId(long bookId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BOOKID;

		Object[] finderArgs = new Object[] { bookId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ORDERITEM_WHERE);

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

	private static final String _FINDER_COLUMN_BOOKID_BOOKID_2 = "orderItem.bookId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, OrderItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, OrderItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			OrderItemModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the order items where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching order items
	 */
	@Override
	public List<OrderItem> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the order items where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @return the range of matching order items
	 */
	@Override
	public List<OrderItem> findByUserId(long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the order items where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching order items
	 */
	@Override
	public List<OrderItem> findByUserId(long userId, int start, int end,
		OrderByComparator<OrderItem> orderByComparator) {
		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the order items where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching order items
	 */
	@Override
	public List<OrderItem> findByUserId(long userId, int start, int end,
		OrderByComparator<OrderItem> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<OrderItem> list = null;

		if (retrieveFromCache) {
			list = (List<OrderItem>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OrderItem orderItem : list) {
					if ((userId != orderItem.getUserId())) {
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

			query.append(_SQL_SELECT_ORDERITEM_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OrderItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<OrderItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<OrderItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first order item in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching order item
	 * @throws NoSuchOrderItemException if a matching order item could not be found
	 */
	@Override
	public OrderItem findByUserId_First(long userId,
		OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = fetchByUserId_First(userId, orderByComparator);

		if (orderItem != null) {
			return orderItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrderItemException(msg.toString());
	}

	/**
	 * Returns the first order item in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching order item, or <code>null</code> if a matching order item could not be found
	 */
	@Override
	public OrderItem fetchByUserId_First(long userId,
		OrderByComparator<OrderItem> orderByComparator) {
		List<OrderItem> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last order item in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching order item
	 * @throws NoSuchOrderItemException if a matching order item could not be found
	 */
	@Override
	public OrderItem findByUserId_Last(long userId,
		OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = fetchByUserId_Last(userId, orderByComparator);

		if (orderItem != null) {
			return orderItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrderItemException(msg.toString());
	}

	/**
	 * Returns the last order item in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching order item, or <code>null</code> if a matching order item could not be found
	 */
	@Override
	public OrderItem fetchByUserId_Last(long userId,
		OrderByComparator<OrderItem> orderByComparator) {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<OrderItem> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the order items before and after the current order item in the ordered set where userId = &#63;.
	 *
	 * @param orderItemId the primary key of the current order item
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next order item
	 * @throws NoSuchOrderItemException if a order item with the primary key could not be found
	 */
	@Override
	public OrderItem[] findByUserId_PrevAndNext(long orderItemId, long userId,
		OrderByComparator<OrderItem> orderByComparator)
		throws NoSuchOrderItemException {
		OrderItem orderItem = findByPrimaryKey(orderItemId);

		Session session = null;

		try {
			session = openSession();

			OrderItem[] array = new OrderItemImpl[3];

			array[0] = getByUserId_PrevAndNext(session, orderItem, userId,
					orderByComparator, true);

			array[1] = orderItem;

			array[2] = getByUserId_PrevAndNext(session, orderItem, userId,
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

	protected OrderItem getByUserId_PrevAndNext(Session session,
		OrderItem orderItem, long userId,
		OrderByComparator<OrderItem> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ORDERITEM_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

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
			query.append(OrderItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(orderItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OrderItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the order items where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (OrderItem orderItem : findByUserId(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(orderItem);
		}
	}

	/**
	 * Returns the number of order items where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching order items
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ORDERITEM_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "orderItem.userId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_ORDERITEM = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, OrderItemImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByOrderItem",
			new String[] { Long.class.getName(), Long.class.getName() },
			OrderItemModelImpl.BOOKORDERID_COLUMN_BITMASK |
			OrderItemModelImpl.BOOKID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORDERITEM = new FinderPath(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrderItem",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the order item where bookOrderId = &#63; and bookId = &#63; or throws a {@link NoSuchOrderItemException} if it could not be found.
	 *
	 * @param bookOrderId the book order ID
	 * @param bookId the book ID
	 * @return the matching order item
	 * @throws NoSuchOrderItemException if a matching order item could not be found
	 */
	@Override
	public OrderItem findByOrderItem(long bookOrderId, long bookId)
		throws NoSuchOrderItemException {
		OrderItem orderItem = fetchByOrderItem(bookOrderId, bookId);

		if (orderItem == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("bookOrderId=");
			msg.append(bookOrderId);

			msg.append(", bookId=");
			msg.append(bookId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchOrderItemException(msg.toString());
		}

		return orderItem;
	}

	/**
	 * Returns the order item where bookOrderId = &#63; and bookId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param bookOrderId the book order ID
	 * @param bookId the book ID
	 * @return the matching order item, or <code>null</code> if a matching order item could not be found
	 */
	@Override
	public OrderItem fetchByOrderItem(long bookOrderId, long bookId) {
		return fetchByOrderItem(bookOrderId, bookId, true);
	}

	/**
	 * Returns the order item where bookOrderId = &#63; and bookId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param bookOrderId the book order ID
	 * @param bookId the book ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching order item, or <code>null</code> if a matching order item could not be found
	 */
	@Override
	public OrderItem fetchByOrderItem(long bookOrderId, long bookId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { bookOrderId, bookId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_ORDERITEM,
					finderArgs, this);
		}

		if (result instanceof OrderItem) {
			OrderItem orderItem = (OrderItem)result;

			if ((bookOrderId != orderItem.getBookOrderId()) ||
					(bookId != orderItem.getBookId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ORDERITEM_WHERE);

			query.append(_FINDER_COLUMN_ORDERITEM_BOOKORDERID_2);

			query.append(_FINDER_COLUMN_ORDERITEM_BOOKID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bookOrderId);

				qPos.add(bookId);

				List<OrderItem> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_ORDERITEM,
						finderArgs, list);
				}
				else {
					OrderItem orderItem = list.get(0);

					result = orderItem;

					cacheResult(orderItem);

					if ((orderItem.getBookOrderId() != bookOrderId) ||
							(orderItem.getBookId() != bookId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_ORDERITEM,
							finderArgs, orderItem);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_ORDERITEM,
					finderArgs);

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
			return (OrderItem)result;
		}
	}

	/**
	 * Removes the order item where bookOrderId = &#63; and bookId = &#63; from the database.
	 *
	 * @param bookOrderId the book order ID
	 * @param bookId the book ID
	 * @return the order item that was removed
	 */
	@Override
	public OrderItem removeByOrderItem(long bookOrderId, long bookId)
		throws NoSuchOrderItemException {
		OrderItem orderItem = findByOrderItem(bookOrderId, bookId);

		return remove(orderItem);
	}

	/**
	 * Returns the number of order items where bookOrderId = &#63; and bookId = &#63;.
	 *
	 * @param bookOrderId the book order ID
	 * @param bookId the book ID
	 * @return the number of matching order items
	 */
	@Override
	public int countByOrderItem(long bookOrderId, long bookId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORDERITEM;

		Object[] finderArgs = new Object[] { bookOrderId, bookId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ORDERITEM_WHERE);

			query.append(_FINDER_COLUMN_ORDERITEM_BOOKORDERID_2);

			query.append(_FINDER_COLUMN_ORDERITEM_BOOKID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bookOrderId);

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

	private static final String _FINDER_COLUMN_ORDERITEM_BOOKORDERID_2 = "orderItem.bookOrderId = ? AND ";
	private static final String _FINDER_COLUMN_ORDERITEM_BOOKID_2 = "orderItem.bookId = ?";

	public OrderItemPersistenceImpl() {
		setModelClass(OrderItem.class);
	}

	/**
	 * Caches the order item in the entity cache if it is enabled.
	 *
	 * @param orderItem the order item
	 */
	@Override
	public void cacheResult(OrderItem orderItem) {
		entityCache.putResult(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemImpl.class, orderItem.getPrimaryKey(), orderItem);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { orderItem.getUuid(), orderItem.getGroupId() },
			orderItem);

		finderCache.putResult(FINDER_PATH_FETCH_BY_ORDERITEM,
			new Object[] { orderItem.getBookOrderId(), orderItem.getBookId() },
			orderItem);

		orderItem.resetOriginalValues();
	}

	/**
	 * Caches the order items in the entity cache if it is enabled.
	 *
	 * @param orderItems the order items
	 */
	@Override
	public void cacheResult(List<OrderItem> orderItems) {
		for (OrderItem orderItem : orderItems) {
			if (entityCache.getResult(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
						OrderItemImpl.class, orderItem.getPrimaryKey()) == null) {
				cacheResult(orderItem);
			}
			else {
				orderItem.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all order items.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OrderItemImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the order item.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OrderItem orderItem) {
		entityCache.removeResult(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemImpl.class, orderItem.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((OrderItemModelImpl)orderItem);
	}

	@Override
	public void clearCache(List<OrderItem> orderItems) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OrderItem orderItem : orderItems) {
			entityCache.removeResult(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
				OrderItemImpl.class, orderItem.getPrimaryKey());

			clearUniqueFindersCache((OrderItemModelImpl)orderItem);
		}
	}

	protected void cacheUniqueFindersCache(
		OrderItemModelImpl orderItemModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					orderItemModelImpl.getUuid(),
					orderItemModelImpl.getGroupId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				orderItemModelImpl);

			args = new Object[] {
					orderItemModelImpl.getBookOrderId(),
					orderItemModelImpl.getBookId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_ORDERITEM, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_ORDERITEM, args,
				orderItemModelImpl);
		}
		else {
			if ((orderItemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						orderItemModelImpl.getUuid(),
						orderItemModelImpl.getGroupId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					orderItemModelImpl);
			}

			if ((orderItemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ORDERITEM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						orderItemModelImpl.getBookOrderId(),
						orderItemModelImpl.getBookId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_ORDERITEM, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_ORDERITEM, args,
					orderItemModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		OrderItemModelImpl orderItemModelImpl) {
		Object[] args = new Object[] {
				orderItemModelImpl.getUuid(), orderItemModelImpl.getGroupId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((orderItemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					orderItemModelImpl.getOriginalUuid(),
					orderItemModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		args = new Object[] {
				orderItemModelImpl.getBookOrderId(),
				orderItemModelImpl.getBookId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_ORDERITEM, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_ORDERITEM, args);

		if ((orderItemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ORDERITEM.getColumnBitmask()) != 0) {
			args = new Object[] {
					orderItemModelImpl.getOriginalBookOrderId(),
					orderItemModelImpl.getOriginalBookId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ORDERITEM, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_ORDERITEM, args);
		}
	}

	/**
	 * Creates a new order item with the primary key. Does not add the order item to the database.
	 *
	 * @param orderItemId the primary key for the new order item
	 * @return the new order item
	 */
	@Override
	public OrderItem create(long orderItemId) {
		OrderItem orderItem = new OrderItemImpl();

		orderItem.setNew(true);
		orderItem.setPrimaryKey(orderItemId);

		String uuid = PortalUUIDUtil.generate();

		orderItem.setUuid(uuid);

		orderItem.setCompanyId(companyProvider.getCompanyId());

		return orderItem;
	}

	/**
	 * Removes the order item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param orderItemId the primary key of the order item
	 * @return the order item that was removed
	 * @throws NoSuchOrderItemException if a order item with the primary key could not be found
	 */
	@Override
	public OrderItem remove(long orderItemId) throws NoSuchOrderItemException {
		return remove((Serializable)orderItemId);
	}

	/**
	 * Removes the order item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the order item
	 * @return the order item that was removed
	 * @throws NoSuchOrderItemException if a order item with the primary key could not be found
	 */
	@Override
	public OrderItem remove(Serializable primaryKey)
		throws NoSuchOrderItemException {
		Session session = null;

		try {
			session = openSession();

			OrderItem orderItem = (OrderItem)session.get(OrderItemImpl.class,
					primaryKey);

			if (orderItem == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOrderItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(orderItem);
		}
		catch (NoSuchOrderItemException nsee) {
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
	protected OrderItem removeImpl(OrderItem orderItem) {
		orderItem = toUnwrappedModel(orderItem);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(orderItem)) {
				orderItem = (OrderItem)session.get(OrderItemImpl.class,
						orderItem.getPrimaryKeyObj());
			}

			if (orderItem != null) {
				session.delete(orderItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (orderItem != null) {
			clearCache(orderItem);
		}

		return orderItem;
	}

	@Override
	public OrderItem updateImpl(OrderItem orderItem) {
		orderItem = toUnwrappedModel(orderItem);

		boolean isNew = orderItem.isNew();

		OrderItemModelImpl orderItemModelImpl = (OrderItemModelImpl)orderItem;

		if (Validator.isNull(orderItem.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			orderItem.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (orderItem.getCreateDate() == null)) {
			if (serviceContext == null) {
				orderItem.setCreateDate(now);
			}
			else {
				orderItem.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!orderItemModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				orderItem.setModifiedDate(now);
			}
			else {
				orderItem.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (orderItem.isNew()) {
				session.save(orderItem);

				orderItem.setNew(false);
			}
			else {
				orderItem = (OrderItem)session.merge(orderItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !OrderItemModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((orderItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						orderItemModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { orderItemModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((orderItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						orderItemModelImpl.getOriginalUuid(),
						orderItemModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						orderItemModelImpl.getUuid(),
						orderItemModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((orderItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						orderItemModelImpl.getOriginalBookOrderId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORDERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID,
					args);

				args = new Object[] { orderItemModelImpl.getBookOrderId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORDERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERID,
					args);
			}

			if ((orderItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						orderItemModelImpl.getOriginalBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKID,
					args);

				args = new Object[] { orderItemModelImpl.getBookId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKID,
					args);
			}

			if ((orderItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						orderItemModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { orderItemModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		entityCache.putResult(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
			OrderItemImpl.class, orderItem.getPrimaryKey(), orderItem, false);

		clearUniqueFindersCache(orderItemModelImpl);
		cacheUniqueFindersCache(orderItemModelImpl, isNew);

		orderItem.resetOriginalValues();

		return orderItem;
	}

	protected OrderItem toUnwrappedModel(OrderItem orderItem) {
		if (orderItem instanceof OrderItemImpl) {
			return orderItem;
		}

		OrderItemImpl orderItemImpl = new OrderItemImpl();

		orderItemImpl.setNew(orderItem.isNew());
		orderItemImpl.setPrimaryKey(orderItem.getPrimaryKey());

		orderItemImpl.setUuid(orderItem.getUuid());
		orderItemImpl.setOrderItemId(orderItem.getOrderItemId());
		orderItemImpl.setGroupId(orderItem.getGroupId());
		orderItemImpl.setCompanyId(orderItem.getCompanyId());
		orderItemImpl.setCreateDate(orderItem.getCreateDate());
		orderItemImpl.setModifiedDate(orderItem.getModifiedDate());
		orderItemImpl.setUserId(orderItem.getUserId());
		orderItemImpl.setUserName(orderItem.getUserName());
		orderItemImpl.setBookOrderId(orderItem.getBookOrderId());
		orderItemImpl.setBookId(orderItem.getBookId());
		orderItemImpl.setPrice(orderItem.getPrice());
		orderItemImpl.setQuantity(orderItem.getQuantity());

		return orderItemImpl;
	}

	/**
	 * Returns the order item with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the order item
	 * @return the order item
	 * @throws NoSuchOrderItemException if a order item with the primary key could not be found
	 */
	@Override
	public OrderItem findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOrderItemException {
		OrderItem orderItem = fetchByPrimaryKey(primaryKey);

		if (orderItem == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOrderItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return orderItem;
	}

	/**
	 * Returns the order item with the primary key or throws a {@link NoSuchOrderItemException} if it could not be found.
	 *
	 * @param orderItemId the primary key of the order item
	 * @return the order item
	 * @throws NoSuchOrderItemException if a order item with the primary key could not be found
	 */
	@Override
	public OrderItem findByPrimaryKey(long orderItemId)
		throws NoSuchOrderItemException {
		return findByPrimaryKey((Serializable)orderItemId);
	}

	/**
	 * Returns the order item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the order item
	 * @return the order item, or <code>null</code> if a order item with the primary key could not be found
	 */
	@Override
	public OrderItem fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
				OrderItemImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		OrderItem orderItem = (OrderItem)serializable;

		if (orderItem == null) {
			Session session = null;

			try {
				session = openSession();

				orderItem = (OrderItem)session.get(OrderItemImpl.class,
						primaryKey);

				if (orderItem != null) {
					cacheResult(orderItem);
				}
				else {
					entityCache.putResult(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
						OrderItemImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
					OrderItemImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return orderItem;
	}

	/**
	 * Returns the order item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param orderItemId the primary key of the order item
	 * @return the order item, or <code>null</code> if a order item with the primary key could not be found
	 */
	@Override
	public OrderItem fetchByPrimaryKey(long orderItemId) {
		return fetchByPrimaryKey((Serializable)orderItemId);
	}

	@Override
	public Map<Serializable, OrderItem> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, OrderItem> map = new HashMap<Serializable, OrderItem>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			OrderItem orderItem = fetchByPrimaryKey(primaryKey);

			if (orderItem != null) {
				map.put(primaryKey, orderItem);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
					OrderItemImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (OrderItem)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ORDERITEM_WHERE_PKS_IN);

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

			for (OrderItem orderItem : (List<OrderItem>)q.list()) {
				map.put(orderItem.getPrimaryKeyObj(), orderItem);

				cacheResult(orderItem);

				uncachedPrimaryKeys.remove(orderItem.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(OrderItemModelImpl.ENTITY_CACHE_ENABLED,
					OrderItemImpl.class, primaryKey, nullModel);
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
	 * Returns all the order items.
	 *
	 * @return the order items
	 */
	@Override
	public List<OrderItem> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the order items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @return the range of order items
	 */
	@Override
	public List<OrderItem> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the order items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of order items
	 */
	@Override
	public List<OrderItem> findAll(int start, int end,
		OrderByComparator<OrderItem> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the order items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of order items
	 * @param end the upper bound of the range of order items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of order items
	 */
	@Override
	public List<OrderItem> findAll(int start, int end,
		OrderByComparator<OrderItem> orderByComparator,
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

		List<OrderItem> list = null;

		if (retrieveFromCache) {
			list = (List<OrderItem>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ORDERITEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ORDERITEM;

				if (pagination) {
					sql = sql.concat(OrderItemModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OrderItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<OrderItem>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the order items from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OrderItem orderItem : findAll()) {
			remove(orderItem);
		}
	}

	/**
	 * Returns the number of order items.
	 *
	 * @return the number of order items
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ORDERITEM);

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
		return OrderItemModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the order item persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(OrderItemImpl.class.getName());
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
	private static final String _SQL_SELECT_ORDERITEM = "SELECT orderItem FROM OrderItem orderItem";
	private static final String _SQL_SELECT_ORDERITEM_WHERE_PKS_IN = "SELECT orderItem FROM OrderItem orderItem WHERE orderItemId IN (";
	private static final String _SQL_SELECT_ORDERITEM_WHERE = "SELECT orderItem FROM OrderItem orderItem WHERE ";
	private static final String _SQL_COUNT_ORDERITEM = "SELECT COUNT(orderItem) FROM OrderItem orderItem";
	private static final String _SQL_COUNT_ORDERITEM_WHERE = "SELECT COUNT(orderItem) FROM OrderItem orderItem WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "orderItem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OrderItem exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No OrderItem exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(OrderItemPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}
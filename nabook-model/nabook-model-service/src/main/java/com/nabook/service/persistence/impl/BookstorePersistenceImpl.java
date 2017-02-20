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

import com.nabook.exception.NoSuchBookstoreException;

import com.nabook.model.Bookstore;
import com.nabook.model.impl.BookstoreImpl;
import com.nabook.model.impl.BookstoreModelImpl;

import com.nabook.service.persistence.BookstorePersistence;

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
 * The persistence implementation for the bookstore service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author phantoan
 * @see BookstorePersistence
 * @see com.nabook.service.persistence.BookstoreUtil
 * @generated
 */
@ProviderType
public class BookstorePersistenceImpl extends BasePersistenceImpl<Bookstore>
	implements BookstorePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BookstoreUtil} to access the bookstore persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BookstoreImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, BookstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, BookstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, BookstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, BookstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			BookstoreModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the bookstores where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bookstores
	 */
	@Override
	public List<Bookstore> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bookstores where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @return the range of matching bookstores
	 */
	@Override
	public List<Bookstore> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bookstores where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bookstores
	 */
	@Override
	public List<Bookstore> findByUuid(String uuid, int start, int end,
		OrderByComparator<Bookstore> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bookstores where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching bookstores
	 */
	@Override
	public List<Bookstore> findByUuid(String uuid, int start, int end,
		OrderByComparator<Bookstore> orderByComparator,
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

		List<Bookstore> list = null;

		if (retrieveFromCache) {
			list = (List<Bookstore>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Bookstore bookstore : list) {
					if (!Objects.equals(uuid, bookstore.getUuid())) {
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

			query.append(_SQL_SELECT_BOOKSTORE_WHERE);

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
				query.append(BookstoreModelImpl.ORDER_BY_JPQL);
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
					list = (List<Bookstore>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Bookstore>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bookstore in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookstore
	 * @throws NoSuchBookstoreException if a matching bookstore could not be found
	 */
	@Override
	public Bookstore findByUuid_First(String uuid,
		OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException {
		Bookstore bookstore = fetchByUuid_First(uuid, orderByComparator);

		if (bookstore != null) {
			return bookstore;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBookstoreException(msg.toString());
	}

	/**
	 * Returns the first bookstore in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByUuid_First(String uuid,
		OrderByComparator<Bookstore> orderByComparator) {
		List<Bookstore> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bookstore in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookstore
	 * @throws NoSuchBookstoreException if a matching bookstore could not be found
	 */
	@Override
	public Bookstore findByUuid_Last(String uuid,
		OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException {
		Bookstore bookstore = fetchByUuid_Last(uuid, orderByComparator);

		if (bookstore != null) {
			return bookstore;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBookstoreException(msg.toString());
	}

	/**
	 * Returns the last bookstore in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByUuid_Last(String uuid,
		OrderByComparator<Bookstore> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Bookstore> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bookstores before and after the current bookstore in the ordered set where uuid = &#63;.
	 *
	 * @param bookstoreId the primary key of the current bookstore
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bookstore
	 * @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	 */
	@Override
	public Bookstore[] findByUuid_PrevAndNext(long bookstoreId, String uuid,
		OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException {
		Bookstore bookstore = findByPrimaryKey(bookstoreId);

		Session session = null;

		try {
			session = openSession();

			Bookstore[] array = new BookstoreImpl[3];

			array[0] = getByUuid_PrevAndNext(session, bookstore, uuid,
					orderByComparator, true);

			array[1] = bookstore;

			array[2] = getByUuid_PrevAndNext(session, bookstore, uuid,
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

	protected Bookstore getByUuid_PrevAndNext(Session session,
		Bookstore bookstore, String uuid,
		OrderByComparator<Bookstore> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BOOKSTORE_WHERE);

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
			query.append(BookstoreModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(bookstore);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Bookstore> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bookstores where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Bookstore bookstore : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(bookstore);
		}
	}

	/**
	 * Returns the number of bookstores where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bookstores
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BOOKSTORE_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "bookstore.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "bookstore.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(bookstore.uuid IS NULL OR bookstore.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, BookstoreImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			BookstoreModelImpl.UUID_COLUMN_BITMASK |
			BookstoreModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the bookstore where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchBookstoreException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching bookstore
	 * @throws NoSuchBookstoreException if a matching bookstore could not be found
	 */
	@Override
	public Bookstore findByUUID_G(String uuid, long groupId)
		throws NoSuchBookstoreException {
		Bookstore bookstore = fetchByUUID_G(uuid, groupId);

		if (bookstore == null) {
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

			throw new NoSuchBookstoreException(msg.toString());
		}

		return bookstore;
	}

	/**
	 * Returns the bookstore where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the bookstore where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Bookstore) {
			Bookstore bookstore = (Bookstore)result;

			if (!Objects.equals(uuid, bookstore.getUuid()) ||
					(groupId != bookstore.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_BOOKSTORE_WHERE);

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

				List<Bookstore> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Bookstore bookstore = list.get(0);

					result = bookstore;

					cacheResult(bookstore);

					if ((bookstore.getUuid() == null) ||
							!bookstore.getUuid().equals(uuid) ||
							(bookstore.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, bookstore);
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
			return (Bookstore)result;
		}
	}

	/**
	 * Removes the bookstore where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the bookstore that was removed
	 */
	@Override
	public Bookstore removeByUUID_G(String uuid, long groupId)
		throws NoSuchBookstoreException {
		Bookstore bookstore = findByUUID_G(uuid, groupId);

		return remove(bookstore);
	}

	/**
	 * Returns the number of bookstores where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching bookstores
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_BOOKSTORE_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "bookstore.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "bookstore.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(bookstore.uuid IS NULL OR bookstore.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "bookstore.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, BookstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, BookstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			BookstoreModelImpl.UUID_COLUMN_BITMASK |
			BookstoreModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the bookstores where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching bookstores
	 */
	@Override
	public List<Bookstore> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bookstores where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @return the range of matching bookstores
	 */
	@Override
	public List<Bookstore> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bookstores where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bookstores
	 */
	@Override
	public List<Bookstore> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Bookstore> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bookstores where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching bookstores
	 */
	@Override
	public List<Bookstore> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Bookstore> orderByComparator,
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

		List<Bookstore> list = null;

		if (retrieveFromCache) {
			list = (List<Bookstore>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Bookstore bookstore : list) {
					if (!Objects.equals(uuid, bookstore.getUuid()) ||
							(companyId != bookstore.getCompanyId())) {
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

			query.append(_SQL_SELECT_BOOKSTORE_WHERE);

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
				query.append(BookstoreModelImpl.ORDER_BY_JPQL);
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
					list = (List<Bookstore>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Bookstore>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bookstore in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookstore
	 * @throws NoSuchBookstoreException if a matching bookstore could not be found
	 */
	@Override
	public Bookstore findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException {
		Bookstore bookstore = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (bookstore != null) {
			return bookstore;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBookstoreException(msg.toString());
	}

	/**
	 * Returns the first bookstore in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Bookstore> orderByComparator) {
		List<Bookstore> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bookstore in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookstore
	 * @throws NoSuchBookstoreException if a matching bookstore could not be found
	 */
	@Override
	public Bookstore findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException {
		Bookstore bookstore = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (bookstore != null) {
			return bookstore;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBookstoreException(msg.toString());
	}

	/**
	 * Returns the last bookstore in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Bookstore> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Bookstore> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bookstores before and after the current bookstore in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param bookstoreId the primary key of the current bookstore
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bookstore
	 * @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	 */
	@Override
	public Bookstore[] findByUuid_C_PrevAndNext(long bookstoreId, String uuid,
		long companyId, OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException {
		Bookstore bookstore = findByPrimaryKey(bookstoreId);

		Session session = null;

		try {
			session = openSession();

			Bookstore[] array = new BookstoreImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, bookstore, uuid,
					companyId, orderByComparator, true);

			array[1] = bookstore;

			array[2] = getByUuid_C_PrevAndNext(session, bookstore, uuid,
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

	protected Bookstore getByUuid_C_PrevAndNext(Session session,
		Bookstore bookstore, String uuid, long companyId,
		OrderByComparator<Bookstore> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_BOOKSTORE_WHERE);

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
			query.append(BookstoreModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(bookstore);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Bookstore> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bookstores where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Bookstore bookstore : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bookstore);
		}
	}

	/**
	 * Returns the number of bookstores where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching bookstores
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_BOOKSTORE_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "bookstore.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "bookstore.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(bookstore.uuid IS NULL OR bookstore.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "bookstore.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCATION = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, BookstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLocation",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATION =
		new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, BookstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLocation",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			BookstoreModelImpl.COUNTRY_COLUMN_BITMASK |
			BookstoreModelImpl.CITY_COLUMN_BITMASK |
			BookstoreModelImpl.PREFECTURE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCATION = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLocation",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the bookstores where country = &#63; and city = &#63; and prefecture = &#63;.
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @return the matching bookstores
	 */
	@Override
	public List<Bookstore> findByLocation(String country, String city,
		String prefecture) {
		return findByLocation(country, city, prefecture, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bookstores where country = &#63; and city = &#63; and prefecture = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @return the range of matching bookstores
	 */
	@Override
	public List<Bookstore> findByLocation(String country, String city,
		String prefecture, int start, int end) {
		return findByLocation(country, city, prefecture, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bookstores where country = &#63; and city = &#63; and prefecture = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bookstores
	 */
	@Override
	public List<Bookstore> findByLocation(String country, String city,
		String prefecture, int start, int end,
		OrderByComparator<Bookstore> orderByComparator) {
		return findByLocation(country, city, prefecture, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bookstores where country = &#63; and city = &#63; and prefecture = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching bookstores
	 */
	@Override
	public List<Bookstore> findByLocation(String country, String city,
		String prefecture, int start, int end,
		OrderByComparator<Bookstore> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATION;
			finderArgs = new Object[] { country, city, prefecture };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCATION;
			finderArgs = new Object[] {
					country, city, prefecture,
					
					start, end, orderByComparator
				};
		}

		List<Bookstore> list = null;

		if (retrieveFromCache) {
			list = (List<Bookstore>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Bookstore bookstore : list) {
					if (!Objects.equals(country, bookstore.getCountry()) ||
							!Objects.equals(city, bookstore.getCity()) ||
							!Objects.equals(prefecture,
								bookstore.getPrefecture())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_BOOKSTORE_WHERE);

			boolean bindCountry = false;

			if (country == null) {
				query.append(_FINDER_COLUMN_LOCATION_COUNTRY_1);
			}
			else if (country.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCATION_COUNTRY_3);
			}
			else {
				bindCountry = true;

				query.append(_FINDER_COLUMN_LOCATION_COUNTRY_2);
			}

			boolean bindCity = false;

			if (city == null) {
				query.append(_FINDER_COLUMN_LOCATION_CITY_1);
			}
			else if (city.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCATION_CITY_3);
			}
			else {
				bindCity = true;

				query.append(_FINDER_COLUMN_LOCATION_CITY_2);
			}

			boolean bindPrefecture = false;

			if (prefecture == null) {
				query.append(_FINDER_COLUMN_LOCATION_PREFECTURE_1);
			}
			else if (prefecture.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCATION_PREFECTURE_3);
			}
			else {
				bindPrefecture = true;

				query.append(_FINDER_COLUMN_LOCATION_PREFECTURE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BookstoreModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCountry) {
					qPos.add(country);
				}

				if (bindCity) {
					qPos.add(city);
				}

				if (bindPrefecture) {
					qPos.add(prefecture);
				}

				if (!pagination) {
					list = (List<Bookstore>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Bookstore>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bookstore in the ordered set where country = &#63; and city = &#63; and prefecture = &#63;.
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookstore
	 * @throws NoSuchBookstoreException if a matching bookstore could not be found
	 */
	@Override
	public Bookstore findByLocation_First(String country, String city,
		String prefecture, OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException {
		Bookstore bookstore = fetchByLocation_First(country, city, prefecture,
				orderByComparator);

		if (bookstore != null) {
			return bookstore;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("country=");
		msg.append(country);

		msg.append(", city=");
		msg.append(city);

		msg.append(", prefecture=");
		msg.append(prefecture);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBookstoreException(msg.toString());
	}

	/**
	 * Returns the first bookstore in the ordered set where country = &#63; and city = &#63; and prefecture = &#63;.
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByLocation_First(String country, String city,
		String prefecture, OrderByComparator<Bookstore> orderByComparator) {
		List<Bookstore> list = findByLocation(country, city, prefecture, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bookstore in the ordered set where country = &#63; and city = &#63; and prefecture = &#63;.
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookstore
	 * @throws NoSuchBookstoreException if a matching bookstore could not be found
	 */
	@Override
	public Bookstore findByLocation_Last(String country, String city,
		String prefecture, OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException {
		Bookstore bookstore = fetchByLocation_Last(country, city, prefecture,
				orderByComparator);

		if (bookstore != null) {
			return bookstore;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("country=");
		msg.append(country);

		msg.append(", city=");
		msg.append(city);

		msg.append(", prefecture=");
		msg.append(prefecture);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBookstoreException(msg.toString());
	}

	/**
	 * Returns the last bookstore in the ordered set where country = &#63; and city = &#63; and prefecture = &#63;.
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByLocation_Last(String country, String city,
		String prefecture, OrderByComparator<Bookstore> orderByComparator) {
		int count = countByLocation(country, city, prefecture);

		if (count == 0) {
			return null;
		}

		List<Bookstore> list = findByLocation(country, city, prefecture,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bookstores before and after the current bookstore in the ordered set where country = &#63; and city = &#63; and prefecture = &#63;.
	 *
	 * @param bookstoreId the primary key of the current bookstore
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bookstore
	 * @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	 */
	@Override
	public Bookstore[] findByLocation_PrevAndNext(long bookstoreId,
		String country, String city, String prefecture,
		OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException {
		Bookstore bookstore = findByPrimaryKey(bookstoreId);

		Session session = null;

		try {
			session = openSession();

			Bookstore[] array = new BookstoreImpl[3];

			array[0] = getByLocation_PrevAndNext(session, bookstore, country,
					city, prefecture, orderByComparator, true);

			array[1] = bookstore;

			array[2] = getByLocation_PrevAndNext(session, bookstore, country,
					city, prefecture, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Bookstore getByLocation_PrevAndNext(Session session,
		Bookstore bookstore, String country, String city, String prefecture,
		OrderByComparator<Bookstore> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_BOOKSTORE_WHERE);

		boolean bindCountry = false;

		if (country == null) {
			query.append(_FINDER_COLUMN_LOCATION_COUNTRY_1);
		}
		else if (country.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LOCATION_COUNTRY_3);
		}
		else {
			bindCountry = true;

			query.append(_FINDER_COLUMN_LOCATION_COUNTRY_2);
		}

		boolean bindCity = false;

		if (city == null) {
			query.append(_FINDER_COLUMN_LOCATION_CITY_1);
		}
		else if (city.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LOCATION_CITY_3);
		}
		else {
			bindCity = true;

			query.append(_FINDER_COLUMN_LOCATION_CITY_2);
		}

		boolean bindPrefecture = false;

		if (prefecture == null) {
			query.append(_FINDER_COLUMN_LOCATION_PREFECTURE_1);
		}
		else if (prefecture.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LOCATION_PREFECTURE_3);
		}
		else {
			bindPrefecture = true;

			query.append(_FINDER_COLUMN_LOCATION_PREFECTURE_2);
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
			query.append(BookstoreModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCountry) {
			qPos.add(country);
		}

		if (bindCity) {
			qPos.add(city);
		}

		if (bindPrefecture) {
			qPos.add(prefecture);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bookstore);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Bookstore> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bookstores where country = &#63; and city = &#63; and prefecture = &#63; from the database.
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 */
	@Override
	public void removeByLocation(String country, String city, String prefecture) {
		for (Bookstore bookstore : findByLocation(country, city, prefecture,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bookstore);
		}
	}

	/**
	 * Returns the number of bookstores where country = &#63; and city = &#63; and prefecture = &#63;.
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @return the number of matching bookstores
	 */
	@Override
	public int countByLocation(String country, String city, String prefecture) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOCATION;

		Object[] finderArgs = new Object[] { country, city, prefecture };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_BOOKSTORE_WHERE);

			boolean bindCountry = false;

			if (country == null) {
				query.append(_FINDER_COLUMN_LOCATION_COUNTRY_1);
			}
			else if (country.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCATION_COUNTRY_3);
			}
			else {
				bindCountry = true;

				query.append(_FINDER_COLUMN_LOCATION_COUNTRY_2);
			}

			boolean bindCity = false;

			if (city == null) {
				query.append(_FINDER_COLUMN_LOCATION_CITY_1);
			}
			else if (city.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCATION_CITY_3);
			}
			else {
				bindCity = true;

				query.append(_FINDER_COLUMN_LOCATION_CITY_2);
			}

			boolean bindPrefecture = false;

			if (prefecture == null) {
				query.append(_FINDER_COLUMN_LOCATION_PREFECTURE_1);
			}
			else if (prefecture.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCATION_PREFECTURE_3);
			}
			else {
				bindPrefecture = true;

				query.append(_FINDER_COLUMN_LOCATION_PREFECTURE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCountry) {
					qPos.add(country);
				}

				if (bindCity) {
					qPos.add(city);
				}

				if (bindPrefecture) {
					qPos.add(prefecture);
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

	private static final String _FINDER_COLUMN_LOCATION_COUNTRY_1 = "bookstore.country IS NULL AND ";
	private static final String _FINDER_COLUMN_LOCATION_COUNTRY_2 = "bookstore.country = ? AND ";
	private static final String _FINDER_COLUMN_LOCATION_COUNTRY_3 = "(bookstore.country IS NULL OR bookstore.country = '') AND ";
	private static final String _FINDER_COLUMN_LOCATION_CITY_1 = "bookstore.city IS NULL AND ";
	private static final String _FINDER_COLUMN_LOCATION_CITY_2 = "bookstore.city = ? AND ";
	private static final String _FINDER_COLUMN_LOCATION_CITY_3 = "(bookstore.city IS NULL OR bookstore.city = '') AND ";
	private static final String _FINDER_COLUMN_LOCATION_PREFECTURE_1 = "bookstore.prefecture IS NULL";
	private static final String _FINDER_COLUMN_LOCATION_PREFECTURE_2 = "bookstore.prefecture = ?";
	private static final String _FINDER_COLUMN_LOCATION_PREFECTURE_3 = "(bookstore.prefecture IS NULL OR bookstore.prefecture = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_NAME = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, BookstoreImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByName",
			new String[] { String.class.getName() },
			BookstoreModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
			new String[] { String.class.getName() });

	/**
	 * Returns the bookstore where name = &#63; or throws a {@link NoSuchBookstoreException} if it could not be found.
	 *
	 * @param name the name
	 * @return the matching bookstore
	 * @throws NoSuchBookstoreException if a matching bookstore could not be found
	 */
	@Override
	public Bookstore findByName(String name) throws NoSuchBookstoreException {
		Bookstore bookstore = fetchByName(name);

		if (bookstore == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("name=");
			msg.append(name);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchBookstoreException(msg.toString());
		}

		return bookstore;
	}

	/**
	 * Returns the bookstore where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByName(String name) {
		return fetchByName(name, true);
	}

	/**
	 * Returns the bookstore where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByName(String name, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { name };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_NAME,
					finderArgs, this);
		}

		if (result instanceof Bookstore) {
			Bookstore bookstore = (Bookstore)result;

			if (!Objects.equals(name, bookstore.getName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_BOOKSTORE_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				List<Bookstore> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_NAME,
						finderArgs, list);
				}
				else {
					Bookstore bookstore = list.get(0);

					result = bookstore;

					cacheResult(bookstore);

					if ((bookstore.getName() == null) ||
							!bookstore.getName().equals(name)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_NAME,
							finderArgs, bookstore);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_NAME, finderArgs);

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
			return (Bookstore)result;
		}
	}

	/**
	 * Removes the bookstore where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the bookstore that was removed
	 */
	@Override
	public Bookstore removeByName(String name) throws NoSuchBookstoreException {
		Bookstore bookstore = findByName(name);

		return remove(bookstore);
	}

	/**
	 * Returns the number of bookstores where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching bookstores
	 */
	@Override
	public int countByName(String name) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NAME;

		Object[] finderArgs = new Object[] { name };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BOOKSTORE_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
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

	private static final String _FINDER_COLUMN_NAME_NAME_1 = "bookstore.name IS NULL";
	private static final String _FINDER_COLUMN_NAME_NAME_2 = "bookstore.name = ?";
	private static final String _FINDER_COLUMN_NAME_NAME_3 = "(bookstore.name IS NULL OR bookstore.name = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_PHONE = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, BookstoreImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByPhone",
			new String[] { String.class.getName() },
			BookstoreModelImpl.PHONE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHONE = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPhone",
			new String[] { String.class.getName() });

	/**
	 * Returns the bookstore where phone = &#63; or throws a {@link NoSuchBookstoreException} if it could not be found.
	 *
	 * @param phone the phone
	 * @return the matching bookstore
	 * @throws NoSuchBookstoreException if a matching bookstore could not be found
	 */
	@Override
	public Bookstore findByPhone(String phone) throws NoSuchBookstoreException {
		Bookstore bookstore = fetchByPhone(phone);

		if (bookstore == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("phone=");
			msg.append(phone);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchBookstoreException(msg.toString());
		}

		return bookstore;
	}

	/**
	 * Returns the bookstore where phone = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param phone the phone
	 * @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByPhone(String phone) {
		return fetchByPhone(phone, true);
	}

	/**
	 * Returns the bookstore where phone = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param phone the phone
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByPhone(String phone, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { phone };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_PHONE,
					finderArgs, this);
		}

		if (result instanceof Bookstore) {
			Bookstore bookstore = (Bookstore)result;

			if (!Objects.equals(phone, bookstore.getPhone())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_BOOKSTORE_WHERE);

			boolean bindPhone = false;

			if (phone == null) {
				query.append(_FINDER_COLUMN_PHONE_PHONE_1);
			}
			else if (phone.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PHONE_PHONE_3);
			}
			else {
				bindPhone = true;

				query.append(_FINDER_COLUMN_PHONE_PHONE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPhone) {
					qPos.add(phone);
				}

				List<Bookstore> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_PHONE,
						finderArgs, list);
				}
				else {
					Bookstore bookstore = list.get(0);

					result = bookstore;

					cacheResult(bookstore);

					if ((bookstore.getPhone() == null) ||
							!bookstore.getPhone().equals(phone)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_PHONE,
							finderArgs, bookstore);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_PHONE, finderArgs);

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
			return (Bookstore)result;
		}
	}

	/**
	 * Removes the bookstore where phone = &#63; from the database.
	 *
	 * @param phone the phone
	 * @return the bookstore that was removed
	 */
	@Override
	public Bookstore removeByPhone(String phone)
		throws NoSuchBookstoreException {
		Bookstore bookstore = findByPhone(phone);

		return remove(bookstore);
	}

	/**
	 * Returns the number of bookstores where phone = &#63;.
	 *
	 * @param phone the phone
	 * @return the number of matching bookstores
	 */
	@Override
	public int countByPhone(String phone) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHONE;

		Object[] finderArgs = new Object[] { phone };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BOOKSTORE_WHERE);

			boolean bindPhone = false;

			if (phone == null) {
				query.append(_FINDER_COLUMN_PHONE_PHONE_1);
			}
			else if (phone.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PHONE_PHONE_3);
			}
			else {
				bindPhone = true;

				query.append(_FINDER_COLUMN_PHONE_PHONE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPhone) {
					qPos.add(phone);
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

	private static final String _FINDER_COLUMN_PHONE_PHONE_1 = "bookstore.phone IS NULL";
	private static final String _FINDER_COLUMN_PHONE_PHONE_2 = "bookstore.phone = ?";
	private static final String _FINDER_COLUMN_PHONE_PHONE_3 = "(bookstore.phone IS NULL OR bookstore.phone = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_STOREADDRESS = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, BookstoreImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByStoreAddress",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			BookstoreModelImpl.COUNTRY_COLUMN_BITMASK |
			BookstoreModelImpl.CITY_COLUMN_BITMASK |
			BookstoreModelImpl.PREFECTURE_COLUMN_BITMASK |
			BookstoreModelImpl.STREET_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STOREADDRESS = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStoreAddress",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns the bookstore where country = &#63; and city = &#63; and prefecture = &#63; and street = &#63; or throws a {@link NoSuchBookstoreException} if it could not be found.
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @param street the street
	 * @return the matching bookstore
	 * @throws NoSuchBookstoreException if a matching bookstore could not be found
	 */
	@Override
	public Bookstore findByStoreAddress(String country, String city,
		String prefecture, String street) throws NoSuchBookstoreException {
		Bookstore bookstore = fetchByStoreAddress(country, city, prefecture,
				street);

		if (bookstore == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("country=");
			msg.append(country);

			msg.append(", city=");
			msg.append(city);

			msg.append(", prefecture=");
			msg.append(prefecture);

			msg.append(", street=");
			msg.append(street);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchBookstoreException(msg.toString());
		}

		return bookstore;
	}

	/**
	 * Returns the bookstore where country = &#63; and city = &#63; and prefecture = &#63; and street = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @param street the street
	 * @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByStoreAddress(String country, String city,
		String prefecture, String street) {
		return fetchByStoreAddress(country, city, prefecture, street, true);
	}

	/**
	 * Returns the bookstore where country = &#63; and city = &#63; and prefecture = &#63; and street = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @param street the street
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByStoreAddress(String country, String city,
		String prefecture, String street, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { country, city, prefecture, street };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_STOREADDRESS,
					finderArgs, this);
		}

		if (result instanceof Bookstore) {
			Bookstore bookstore = (Bookstore)result;

			if (!Objects.equals(country, bookstore.getCountry()) ||
					!Objects.equals(city, bookstore.getCity()) ||
					!Objects.equals(prefecture, bookstore.getPrefecture()) ||
					!Objects.equals(street, bookstore.getStreet())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_BOOKSTORE_WHERE);

			boolean bindCountry = false;

			if (country == null) {
				query.append(_FINDER_COLUMN_STOREADDRESS_COUNTRY_1);
			}
			else if (country.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STOREADDRESS_COUNTRY_3);
			}
			else {
				bindCountry = true;

				query.append(_FINDER_COLUMN_STOREADDRESS_COUNTRY_2);
			}

			boolean bindCity = false;

			if (city == null) {
				query.append(_FINDER_COLUMN_STOREADDRESS_CITY_1);
			}
			else if (city.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STOREADDRESS_CITY_3);
			}
			else {
				bindCity = true;

				query.append(_FINDER_COLUMN_STOREADDRESS_CITY_2);
			}

			boolean bindPrefecture = false;

			if (prefecture == null) {
				query.append(_FINDER_COLUMN_STOREADDRESS_PREFECTURE_1);
			}
			else if (prefecture.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STOREADDRESS_PREFECTURE_3);
			}
			else {
				bindPrefecture = true;

				query.append(_FINDER_COLUMN_STOREADDRESS_PREFECTURE_2);
			}

			boolean bindStreet = false;

			if (street == null) {
				query.append(_FINDER_COLUMN_STOREADDRESS_STREET_1);
			}
			else if (street.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STOREADDRESS_STREET_3);
			}
			else {
				bindStreet = true;

				query.append(_FINDER_COLUMN_STOREADDRESS_STREET_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCountry) {
					qPos.add(country);
				}

				if (bindCity) {
					qPos.add(city);
				}

				if (bindPrefecture) {
					qPos.add(prefecture);
				}

				if (bindStreet) {
					qPos.add(street);
				}

				List<Bookstore> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_STOREADDRESS,
						finderArgs, list);
				}
				else {
					Bookstore bookstore = list.get(0);

					result = bookstore;

					cacheResult(bookstore);

					if ((bookstore.getCountry() == null) ||
							!bookstore.getCountry().equals(country) ||
							(bookstore.getCity() == null) ||
							!bookstore.getCity().equals(city) ||
							(bookstore.getPrefecture() == null) ||
							!bookstore.getPrefecture().equals(prefecture) ||
							(bookstore.getStreet() == null) ||
							!bookstore.getStreet().equals(street)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_STOREADDRESS,
							finderArgs, bookstore);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_STOREADDRESS,
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
			return (Bookstore)result;
		}
	}

	/**
	 * Removes the bookstore where country = &#63; and city = &#63; and prefecture = &#63; and street = &#63; from the database.
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @param street the street
	 * @return the bookstore that was removed
	 */
	@Override
	public Bookstore removeByStoreAddress(String country, String city,
		String prefecture, String street) throws NoSuchBookstoreException {
		Bookstore bookstore = findByStoreAddress(country, city, prefecture,
				street);

		return remove(bookstore);
	}

	/**
	 * Returns the number of bookstores where country = &#63; and city = &#63; and prefecture = &#63; and street = &#63;.
	 *
	 * @param country the country
	 * @param city the city
	 * @param prefecture the prefecture
	 * @param street the street
	 * @return the number of matching bookstores
	 */
	@Override
	public int countByStoreAddress(String country, String city,
		String prefecture, String street) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STOREADDRESS;

		Object[] finderArgs = new Object[] { country, city, prefecture, street };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_BOOKSTORE_WHERE);

			boolean bindCountry = false;

			if (country == null) {
				query.append(_FINDER_COLUMN_STOREADDRESS_COUNTRY_1);
			}
			else if (country.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STOREADDRESS_COUNTRY_3);
			}
			else {
				bindCountry = true;

				query.append(_FINDER_COLUMN_STOREADDRESS_COUNTRY_2);
			}

			boolean bindCity = false;

			if (city == null) {
				query.append(_FINDER_COLUMN_STOREADDRESS_CITY_1);
			}
			else if (city.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STOREADDRESS_CITY_3);
			}
			else {
				bindCity = true;

				query.append(_FINDER_COLUMN_STOREADDRESS_CITY_2);
			}

			boolean bindPrefecture = false;

			if (prefecture == null) {
				query.append(_FINDER_COLUMN_STOREADDRESS_PREFECTURE_1);
			}
			else if (prefecture.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STOREADDRESS_PREFECTURE_3);
			}
			else {
				bindPrefecture = true;

				query.append(_FINDER_COLUMN_STOREADDRESS_PREFECTURE_2);
			}

			boolean bindStreet = false;

			if (street == null) {
				query.append(_FINDER_COLUMN_STOREADDRESS_STREET_1);
			}
			else if (street.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STOREADDRESS_STREET_3);
			}
			else {
				bindStreet = true;

				query.append(_FINDER_COLUMN_STOREADDRESS_STREET_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCountry) {
					qPos.add(country);
				}

				if (bindCity) {
					qPos.add(city);
				}

				if (bindPrefecture) {
					qPos.add(prefecture);
				}

				if (bindStreet) {
					qPos.add(street);
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

	private static final String _FINDER_COLUMN_STOREADDRESS_COUNTRY_1 = "bookstore.country IS NULL AND ";
	private static final String _FINDER_COLUMN_STOREADDRESS_COUNTRY_2 = "bookstore.country = ? AND ";
	private static final String _FINDER_COLUMN_STOREADDRESS_COUNTRY_3 = "(bookstore.country IS NULL OR bookstore.country = '') AND ";
	private static final String _FINDER_COLUMN_STOREADDRESS_CITY_1 = "bookstore.city IS NULL AND ";
	private static final String _FINDER_COLUMN_STOREADDRESS_CITY_2 = "bookstore.city = ? AND ";
	private static final String _FINDER_COLUMN_STOREADDRESS_CITY_3 = "(bookstore.city IS NULL OR bookstore.city = '') AND ";
	private static final String _FINDER_COLUMN_STOREADDRESS_PREFECTURE_1 = "bookstore.prefecture IS NULL AND ";
	private static final String _FINDER_COLUMN_STOREADDRESS_PREFECTURE_2 = "bookstore.prefecture = ? AND ";
	private static final String _FINDER_COLUMN_STOREADDRESS_PREFECTURE_3 = "(bookstore.prefecture IS NULL OR bookstore.prefecture = '') AND ";
	private static final String _FINDER_COLUMN_STOREADDRESS_STREET_1 = "bookstore.street IS NULL";
	private static final String _FINDER_COLUMN_STOREADDRESS_STREET_2 = "bookstore.street = ?";
	private static final String _FINDER_COLUMN_STOREADDRESS_STREET_3 = "(bookstore.street IS NULL OR bookstore.street = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, BookstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, BookstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			BookstoreModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the bookstores where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching bookstores
	 */
	@Override
	public List<Bookstore> findByCompanyId(long companyId) {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the bookstores where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @return the range of matching bookstores
	 */
	@Override
	public List<Bookstore> findByCompanyId(long companyId, int start, int end) {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bookstores where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bookstores
	 */
	@Override
	public List<Bookstore> findByCompanyId(long companyId, int start, int end,
		OrderByComparator<Bookstore> orderByComparator) {
		return findByCompanyId(companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bookstores where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching bookstores
	 */
	@Override
	public List<Bookstore> findByCompanyId(long companyId, int start, int end,
		OrderByComparator<Bookstore> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<Bookstore> list = null;

		if (retrieveFromCache) {
			list = (List<Bookstore>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Bookstore bookstore : list) {
					if ((companyId != bookstore.getCompanyId())) {
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

			query.append(_SQL_SELECT_BOOKSTORE_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BookstoreModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Bookstore>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Bookstore>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bookstore in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookstore
	 * @throws NoSuchBookstoreException if a matching bookstore could not be found
	 */
	@Override
	public Bookstore findByCompanyId_First(long companyId,
		OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException {
		Bookstore bookstore = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (bookstore != null) {
			return bookstore;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBookstoreException(msg.toString());
	}

	/**
	 * Returns the first bookstore in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByCompanyId_First(long companyId,
		OrderByComparator<Bookstore> orderByComparator) {
		List<Bookstore> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bookstore in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookstore
	 * @throws NoSuchBookstoreException if a matching bookstore could not be found
	 */
	@Override
	public Bookstore findByCompanyId_Last(long companyId,
		OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException {
		Bookstore bookstore = fetchByCompanyId_Last(companyId, orderByComparator);

		if (bookstore != null) {
			return bookstore;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBookstoreException(msg.toString());
	}

	/**
	 * Returns the last bookstore in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookstore, or <code>null</code> if a matching bookstore could not be found
	 */
	@Override
	public Bookstore fetchByCompanyId_Last(long companyId,
		OrderByComparator<Bookstore> orderByComparator) {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<Bookstore> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bookstores before and after the current bookstore in the ordered set where companyId = &#63;.
	 *
	 * @param bookstoreId the primary key of the current bookstore
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bookstore
	 * @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	 */
	@Override
	public Bookstore[] findByCompanyId_PrevAndNext(long bookstoreId,
		long companyId, OrderByComparator<Bookstore> orderByComparator)
		throws NoSuchBookstoreException {
		Bookstore bookstore = findByPrimaryKey(bookstoreId);

		Session session = null;

		try {
			session = openSession();

			Bookstore[] array = new BookstoreImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, bookstore,
					companyId, orderByComparator, true);

			array[1] = bookstore;

			array[2] = getByCompanyId_PrevAndNext(session, bookstore,
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

	protected Bookstore getByCompanyId_PrevAndNext(Session session,
		Bookstore bookstore, long companyId,
		OrderByComparator<Bookstore> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BOOKSTORE_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

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
			query.append(BookstoreModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bookstore);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Bookstore> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bookstores where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	@Override
	public void removeByCompanyId(long companyId) {
		for (Bookstore bookstore : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bookstore);
		}
	}

	/**
	 * Returns the number of bookstores where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching bookstores
	 */
	@Override
	public int countByCompanyId(long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BOOKSTORE_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "bookstore.companyId = ?";

	public BookstorePersistenceImpl() {
		setModelClass(Bookstore.class);
	}

	/**
	 * Caches the bookstore in the entity cache if it is enabled.
	 *
	 * @param bookstore the bookstore
	 */
	@Override
	public void cacheResult(Bookstore bookstore) {
		entityCache.putResult(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreImpl.class, bookstore.getPrimaryKey(), bookstore);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { bookstore.getUuid(), bookstore.getGroupId() },
			bookstore);

		finderCache.putResult(FINDER_PATH_FETCH_BY_NAME,
			new Object[] { bookstore.getName() }, bookstore);

		finderCache.putResult(FINDER_PATH_FETCH_BY_PHONE,
			new Object[] { bookstore.getPhone() }, bookstore);

		finderCache.putResult(FINDER_PATH_FETCH_BY_STOREADDRESS,
			new Object[] {
				bookstore.getCountry(), bookstore.getCity(),
				bookstore.getPrefecture(), bookstore.getStreet()
			}, bookstore);

		bookstore.resetOriginalValues();
	}

	/**
	 * Caches the bookstores in the entity cache if it is enabled.
	 *
	 * @param bookstores the bookstores
	 */
	@Override
	public void cacheResult(List<Bookstore> bookstores) {
		for (Bookstore bookstore : bookstores) {
			if (entityCache.getResult(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
						BookstoreImpl.class, bookstore.getPrimaryKey()) == null) {
				cacheResult(bookstore);
			}
			else {
				bookstore.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bookstores.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BookstoreImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bookstore.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Bookstore bookstore) {
		entityCache.removeResult(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreImpl.class, bookstore.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((BookstoreModelImpl)bookstore);
	}

	@Override
	public void clearCache(List<Bookstore> bookstores) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Bookstore bookstore : bookstores) {
			entityCache.removeResult(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
				BookstoreImpl.class, bookstore.getPrimaryKey());

			clearUniqueFindersCache((BookstoreModelImpl)bookstore);
		}
	}

	protected void cacheUniqueFindersCache(
		BookstoreModelImpl bookstoreModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					bookstoreModelImpl.getUuid(),
					bookstoreModelImpl.getGroupId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				bookstoreModelImpl);

			args = new Object[] { bookstoreModelImpl.getName() };

			finderCache.putResult(FINDER_PATH_COUNT_BY_NAME, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_NAME, args,
				bookstoreModelImpl);

			args = new Object[] { bookstoreModelImpl.getPhone() };

			finderCache.putResult(FINDER_PATH_COUNT_BY_PHONE, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_PHONE, args,
				bookstoreModelImpl);

			args = new Object[] {
					bookstoreModelImpl.getCountry(),
					bookstoreModelImpl.getCity(),
					bookstoreModelImpl.getPrefecture(),
					bookstoreModelImpl.getStreet()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_STOREADDRESS, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_STOREADDRESS, args,
				bookstoreModelImpl);
		}
		else {
			if ((bookstoreModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bookstoreModelImpl.getUuid(),
						bookstoreModelImpl.getGroupId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					bookstoreModelImpl);
			}

			if ((bookstoreModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { bookstoreModelImpl.getName() };

				finderCache.putResult(FINDER_PATH_COUNT_BY_NAME, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_NAME, args,
					bookstoreModelImpl);
			}

			if ((bookstoreModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PHONE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { bookstoreModelImpl.getPhone() };

				finderCache.putResult(FINDER_PATH_COUNT_BY_PHONE, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_PHONE, args,
					bookstoreModelImpl);
			}

			if ((bookstoreModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_STOREADDRESS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bookstoreModelImpl.getCountry(),
						bookstoreModelImpl.getCity(),
						bookstoreModelImpl.getPrefecture(),
						bookstoreModelImpl.getStreet()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_STOREADDRESS, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_STOREADDRESS, args,
					bookstoreModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		BookstoreModelImpl bookstoreModelImpl) {
		Object[] args = new Object[] {
				bookstoreModelImpl.getUuid(), bookstoreModelImpl.getGroupId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((bookstoreModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					bookstoreModelImpl.getOriginalUuid(),
					bookstoreModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		args = new Object[] { bookstoreModelImpl.getName() };

		finderCache.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_NAME, args);

		if ((bookstoreModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_NAME.getColumnBitmask()) != 0) {
			args = new Object[] { bookstoreModelImpl.getOriginalName() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_NAME, args);
		}

		args = new Object[] { bookstoreModelImpl.getPhone() };

		finderCache.removeResult(FINDER_PATH_COUNT_BY_PHONE, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_PHONE, args);

		if ((bookstoreModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PHONE.getColumnBitmask()) != 0) {
			args = new Object[] { bookstoreModelImpl.getOriginalPhone() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_PHONE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_PHONE, args);
		}

		args = new Object[] {
				bookstoreModelImpl.getCountry(), bookstoreModelImpl.getCity(),
				bookstoreModelImpl.getPrefecture(),
				bookstoreModelImpl.getStreet()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_STOREADDRESS, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_STOREADDRESS, args);

		if ((bookstoreModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_STOREADDRESS.getColumnBitmask()) != 0) {
			args = new Object[] {
					bookstoreModelImpl.getOriginalCountry(),
					bookstoreModelImpl.getOriginalCity(),
					bookstoreModelImpl.getOriginalPrefecture(),
					bookstoreModelImpl.getOriginalStreet()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STOREADDRESS, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_STOREADDRESS, args);
		}
	}

	/**
	 * Creates a new bookstore with the primary key. Does not add the bookstore to the database.
	 *
	 * @param bookstoreId the primary key for the new bookstore
	 * @return the new bookstore
	 */
	@Override
	public Bookstore create(long bookstoreId) {
		Bookstore bookstore = new BookstoreImpl();

		bookstore.setNew(true);
		bookstore.setPrimaryKey(bookstoreId);

		String uuid = PortalUUIDUtil.generate();

		bookstore.setUuid(uuid);

		bookstore.setCompanyId(companyProvider.getCompanyId());

		return bookstore;
	}

	/**
	 * Removes the bookstore with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookstoreId the primary key of the bookstore
	 * @return the bookstore that was removed
	 * @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	 */
	@Override
	public Bookstore remove(long bookstoreId) throws NoSuchBookstoreException {
		return remove((Serializable)bookstoreId);
	}

	/**
	 * Removes the bookstore with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bookstore
	 * @return the bookstore that was removed
	 * @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	 */
	@Override
	public Bookstore remove(Serializable primaryKey)
		throws NoSuchBookstoreException {
		Session session = null;

		try {
			session = openSession();

			Bookstore bookstore = (Bookstore)session.get(BookstoreImpl.class,
					primaryKey);

			if (bookstore == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBookstoreException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bookstore);
		}
		catch (NoSuchBookstoreException nsee) {
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
	protected Bookstore removeImpl(Bookstore bookstore) {
		bookstore = toUnwrappedModel(bookstore);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bookstore)) {
				bookstore = (Bookstore)session.get(BookstoreImpl.class,
						bookstore.getPrimaryKeyObj());
			}

			if (bookstore != null) {
				session.delete(bookstore);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bookstore != null) {
			clearCache(bookstore);
		}

		return bookstore;
	}

	@Override
	public Bookstore updateImpl(Bookstore bookstore) {
		bookstore = toUnwrappedModel(bookstore);

		boolean isNew = bookstore.isNew();

		BookstoreModelImpl bookstoreModelImpl = (BookstoreModelImpl)bookstore;

		if (Validator.isNull(bookstore.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			bookstore.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (bookstore.getCreateDate() == null)) {
			if (serviceContext == null) {
				bookstore.setCreateDate(now);
			}
			else {
				bookstore.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!bookstoreModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				bookstore.setModifiedDate(now);
			}
			else {
				bookstore.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (bookstore.isNew()) {
				session.save(bookstore);

				bookstore.setNew(false);
			}
			else {
				bookstore = (Bookstore)session.merge(bookstore);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !BookstoreModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((bookstoreModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bookstoreModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { bookstoreModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((bookstoreModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bookstoreModelImpl.getOriginalUuid(),
						bookstoreModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						bookstoreModelImpl.getUuid(),
						bookstoreModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((bookstoreModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bookstoreModelImpl.getOriginalCountry(),
						bookstoreModelImpl.getOriginalCity(),
						bookstoreModelImpl.getOriginalPrefecture()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOCATION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATION,
					args);

				args = new Object[] {
						bookstoreModelImpl.getCountry(),
						bookstoreModelImpl.getCity(),
						bookstoreModelImpl.getPrefecture()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOCATION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATION,
					args);
			}

			if ((bookstoreModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bookstoreModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { bookstoreModelImpl.getCompanyId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}
		}

		entityCache.putResult(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
			BookstoreImpl.class, bookstore.getPrimaryKey(), bookstore, false);

		clearUniqueFindersCache(bookstoreModelImpl);
		cacheUniqueFindersCache(bookstoreModelImpl, isNew);

		bookstore.resetOriginalValues();

		return bookstore;
	}

	protected Bookstore toUnwrappedModel(Bookstore bookstore) {
		if (bookstore instanceof BookstoreImpl) {
			return bookstore;
		}

		BookstoreImpl bookstoreImpl = new BookstoreImpl();

		bookstoreImpl.setNew(bookstore.isNew());
		bookstoreImpl.setPrimaryKey(bookstore.getPrimaryKey());

		bookstoreImpl.setUuid(bookstore.getUuid());
		bookstoreImpl.setBookstoreId(bookstore.getBookstoreId());
		bookstoreImpl.setGroupId(bookstore.getGroupId());
		bookstoreImpl.setCompanyId(bookstore.getCompanyId());
		bookstoreImpl.setUserId(bookstore.getUserId());
		bookstoreImpl.setUserName(bookstore.getUserName());
		bookstoreImpl.setCreateDate(bookstore.getCreateDate());
		bookstoreImpl.setModifiedDate(bookstore.getModifiedDate());
		bookstoreImpl.setName(bookstore.getName());
		bookstoreImpl.setCountry(bookstore.getCountry());
		bookstoreImpl.setCity(bookstore.getCity());
		bookstoreImpl.setPrefecture(bookstore.getPrefecture());
		bookstoreImpl.setStreet(bookstore.getStreet());
		bookstoreImpl.setZip(bookstore.getZip());
		bookstoreImpl.setPhone(bookstore.getPhone());

		return bookstoreImpl;
	}

	/**
	 * Returns the bookstore with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bookstore
	 * @return the bookstore
	 * @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	 */
	@Override
	public Bookstore findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBookstoreException {
		Bookstore bookstore = fetchByPrimaryKey(primaryKey);

		if (bookstore == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBookstoreException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bookstore;
	}

	/**
	 * Returns the bookstore with the primary key or throws a {@link NoSuchBookstoreException} if it could not be found.
	 *
	 * @param bookstoreId the primary key of the bookstore
	 * @return the bookstore
	 * @throws NoSuchBookstoreException if a bookstore with the primary key could not be found
	 */
	@Override
	public Bookstore findByPrimaryKey(long bookstoreId)
		throws NoSuchBookstoreException {
		return findByPrimaryKey((Serializable)bookstoreId);
	}

	/**
	 * Returns the bookstore with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bookstore
	 * @return the bookstore, or <code>null</code> if a bookstore with the primary key could not be found
	 */
	@Override
	public Bookstore fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
				BookstoreImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Bookstore bookstore = (Bookstore)serializable;

		if (bookstore == null) {
			Session session = null;

			try {
				session = openSession();

				bookstore = (Bookstore)session.get(BookstoreImpl.class,
						primaryKey);

				if (bookstore != null) {
					cacheResult(bookstore);
				}
				else {
					entityCache.putResult(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
						BookstoreImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
					BookstoreImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bookstore;
	}

	/**
	 * Returns the bookstore with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookstoreId the primary key of the bookstore
	 * @return the bookstore, or <code>null</code> if a bookstore with the primary key could not be found
	 */
	@Override
	public Bookstore fetchByPrimaryKey(long bookstoreId) {
		return fetchByPrimaryKey((Serializable)bookstoreId);
	}

	@Override
	public Map<Serializable, Bookstore> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Bookstore> map = new HashMap<Serializable, Bookstore>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Bookstore bookstore = fetchByPrimaryKey(primaryKey);

			if (bookstore != null) {
				map.put(primaryKey, bookstore);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
					BookstoreImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Bookstore)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BOOKSTORE_WHERE_PKS_IN);

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

			for (Bookstore bookstore : (List<Bookstore>)q.list()) {
				map.put(bookstore.getPrimaryKeyObj(), bookstore);

				cacheResult(bookstore);

				uncachedPrimaryKeys.remove(bookstore.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(BookstoreModelImpl.ENTITY_CACHE_ENABLED,
					BookstoreImpl.class, primaryKey, nullModel);
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
	 * Returns all the bookstores.
	 *
	 * @return the bookstores
	 */
	@Override
	public List<Bookstore> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bookstores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @return the range of bookstores
	 */
	@Override
	public List<Bookstore> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bookstores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bookstores
	 */
	@Override
	public List<Bookstore> findAll(int start, int end,
		OrderByComparator<Bookstore> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bookstores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookstores
	 * @param end the upper bound of the range of bookstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of bookstores
	 */
	@Override
	public List<Bookstore> findAll(int start, int end,
		OrderByComparator<Bookstore> orderByComparator,
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

		List<Bookstore> list = null;

		if (retrieveFromCache) {
			list = (List<Bookstore>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BOOKSTORE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BOOKSTORE;

				if (pagination) {
					sql = sql.concat(BookstoreModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Bookstore>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Bookstore>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the bookstores from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Bookstore bookstore : findAll()) {
			remove(bookstore);
		}
	}

	/**
	 * Returns the number of bookstores.
	 *
	 * @return the number of bookstores
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BOOKSTORE);

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
		return BookstoreModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bookstore persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(BookstoreImpl.class.getName());
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
	private static final String _SQL_SELECT_BOOKSTORE = "SELECT bookstore FROM Bookstore bookstore";
	private static final String _SQL_SELECT_BOOKSTORE_WHERE_PKS_IN = "SELECT bookstore FROM Bookstore bookstore WHERE bookstoreId IN (";
	private static final String _SQL_SELECT_BOOKSTORE_WHERE = "SELECT bookstore FROM Bookstore bookstore WHERE ";
	private static final String _SQL_COUNT_BOOKSTORE = "SELECT COUNT(bookstore) FROM Bookstore bookstore";
	private static final String _SQL_COUNT_BOOKSTORE_WHERE = "SELECT COUNT(bookstore) FROM Bookstore bookstore WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bookstore.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Bookstore exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Bookstore exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(BookstorePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}
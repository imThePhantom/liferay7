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

package com.nabook.service.base;

import com.liferay.asset.kernel.service.persistence.AssetEntryPersistence;
import com.liferay.asset.kernel.service.persistence.AssetLinkPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.liferay.ratings.kernel.service.persistence.RatingsStatsPersistence;

import com.nabook.model.Book;

import com.nabook.service.BookService;
import com.nabook.service.persistence.AddressPersistence;
import com.nabook.service.persistence.AuthorPersistence;
import com.nabook.service.persistence.BookOrderPersistence;
import com.nabook.service.persistence.BookPersistence;
import com.nabook.service.persistence.BookstorePersistence;
import com.nabook.service.persistence.CartPersistence;
import com.nabook.service.persistence.OrderItemPersistence;
import com.nabook.service.persistence.StockItemPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the book remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nabook.service.impl.BookServiceImpl}.
 * </p>
 *
 * @author phantoan
 * @see com.nabook.service.impl.BookServiceImpl
 * @see com.nabook.service.BookServiceUtil
 * @generated
 */
public abstract class BookServiceBaseImpl extends BaseServiceImpl
	implements BookService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.nabook.service.BookServiceUtil} to access the book remote service.
	 */

	/**
	 * Returns the address local service.
	 *
	 * @return the address local service
	 */
	public com.nabook.service.AddressLocalService getAddressLocalService() {
		return addressLocalService;
	}

	/**
	 * Sets the address local service.
	 *
	 * @param addressLocalService the address local service
	 */
	public void setAddressLocalService(
		com.nabook.service.AddressLocalService addressLocalService) {
		this.addressLocalService = addressLocalService;
	}

	/**
	 * Returns the address remote service.
	 *
	 * @return the address remote service
	 */
	public com.nabook.service.AddressService getAddressService() {
		return addressService;
	}

	/**
	 * Sets the address remote service.
	 *
	 * @param addressService the address remote service
	 */
	public void setAddressService(
		com.nabook.service.AddressService addressService) {
		this.addressService = addressService;
	}

	/**
	 * Returns the address persistence.
	 *
	 * @return the address persistence
	 */
	public AddressPersistence getAddressPersistence() {
		return addressPersistence;
	}

	/**
	 * Sets the address persistence.
	 *
	 * @param addressPersistence the address persistence
	 */
	public void setAddressPersistence(AddressPersistence addressPersistence) {
		this.addressPersistence = addressPersistence;
	}

	/**
	 * Returns the author local service.
	 *
	 * @return the author local service
	 */
	public com.nabook.service.AuthorLocalService getAuthorLocalService() {
		return authorLocalService;
	}

	/**
	 * Sets the author local service.
	 *
	 * @param authorLocalService the author local service
	 */
	public void setAuthorLocalService(
		com.nabook.service.AuthorLocalService authorLocalService) {
		this.authorLocalService = authorLocalService;
	}

	/**
	 * Returns the author remote service.
	 *
	 * @return the author remote service
	 */
	public com.nabook.service.AuthorService getAuthorService() {
		return authorService;
	}

	/**
	 * Sets the author remote service.
	 *
	 * @param authorService the author remote service
	 */
	public void setAuthorService(com.nabook.service.AuthorService authorService) {
		this.authorService = authorService;
	}

	/**
	 * Returns the author persistence.
	 *
	 * @return the author persistence
	 */
	public AuthorPersistence getAuthorPersistence() {
		return authorPersistence;
	}

	/**
	 * Sets the author persistence.
	 *
	 * @param authorPersistence the author persistence
	 */
	public void setAuthorPersistence(AuthorPersistence authorPersistence) {
		this.authorPersistence = authorPersistence;
	}

	/**
	 * Returns the book local service.
	 *
	 * @return the book local service
	 */
	public com.nabook.service.BookLocalService getBookLocalService() {
		return bookLocalService;
	}

	/**
	 * Sets the book local service.
	 *
	 * @param bookLocalService the book local service
	 */
	public void setBookLocalService(
		com.nabook.service.BookLocalService bookLocalService) {
		this.bookLocalService = bookLocalService;
	}

	/**
	 * Returns the book remote service.
	 *
	 * @return the book remote service
	 */
	public BookService getBookService() {
		return bookService;
	}

	/**
	 * Sets the book remote service.
	 *
	 * @param bookService the book remote service
	 */
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	/**
	 * Returns the book persistence.
	 *
	 * @return the book persistence
	 */
	public BookPersistence getBookPersistence() {
		return bookPersistence;
	}

	/**
	 * Sets the book persistence.
	 *
	 * @param bookPersistence the book persistence
	 */
	public void setBookPersistence(BookPersistence bookPersistence) {
		this.bookPersistence = bookPersistence;
	}

	/**
	 * Returns the book order local service.
	 *
	 * @return the book order local service
	 */
	public com.nabook.service.BookOrderLocalService getBookOrderLocalService() {
		return bookOrderLocalService;
	}

	/**
	 * Sets the book order local service.
	 *
	 * @param bookOrderLocalService the book order local service
	 */
	public void setBookOrderLocalService(
		com.nabook.service.BookOrderLocalService bookOrderLocalService) {
		this.bookOrderLocalService = bookOrderLocalService;
	}

	/**
	 * Returns the book order remote service.
	 *
	 * @return the book order remote service
	 */
	public com.nabook.service.BookOrderService getBookOrderService() {
		return bookOrderService;
	}

	/**
	 * Sets the book order remote service.
	 *
	 * @param bookOrderService the book order remote service
	 */
	public void setBookOrderService(
		com.nabook.service.BookOrderService bookOrderService) {
		this.bookOrderService = bookOrderService;
	}

	/**
	 * Returns the book order persistence.
	 *
	 * @return the book order persistence
	 */
	public BookOrderPersistence getBookOrderPersistence() {
		return bookOrderPersistence;
	}

	/**
	 * Sets the book order persistence.
	 *
	 * @param bookOrderPersistence the book order persistence
	 */
	public void setBookOrderPersistence(
		BookOrderPersistence bookOrderPersistence) {
		this.bookOrderPersistence = bookOrderPersistence;
	}

	/**
	 * Returns the bookstore local service.
	 *
	 * @return the bookstore local service
	 */
	public com.nabook.service.BookstoreLocalService getBookstoreLocalService() {
		return bookstoreLocalService;
	}

	/**
	 * Sets the bookstore local service.
	 *
	 * @param bookstoreLocalService the bookstore local service
	 */
	public void setBookstoreLocalService(
		com.nabook.service.BookstoreLocalService bookstoreLocalService) {
		this.bookstoreLocalService = bookstoreLocalService;
	}

	/**
	 * Returns the bookstore remote service.
	 *
	 * @return the bookstore remote service
	 */
	public com.nabook.service.BookstoreService getBookstoreService() {
		return bookstoreService;
	}

	/**
	 * Sets the bookstore remote service.
	 *
	 * @param bookstoreService the bookstore remote service
	 */
	public void setBookstoreService(
		com.nabook.service.BookstoreService bookstoreService) {
		this.bookstoreService = bookstoreService;
	}

	/**
	 * Returns the bookstore persistence.
	 *
	 * @return the bookstore persistence
	 */
	public BookstorePersistence getBookstorePersistence() {
		return bookstorePersistence;
	}

	/**
	 * Sets the bookstore persistence.
	 *
	 * @param bookstorePersistence the bookstore persistence
	 */
	public void setBookstorePersistence(
		BookstorePersistence bookstorePersistence) {
		this.bookstorePersistence = bookstorePersistence;
	}

	/**
	 * Returns the cart local service.
	 *
	 * @return the cart local service
	 */
	public com.nabook.service.CartLocalService getCartLocalService() {
		return cartLocalService;
	}

	/**
	 * Sets the cart local service.
	 *
	 * @param cartLocalService the cart local service
	 */
	public void setCartLocalService(
		com.nabook.service.CartLocalService cartLocalService) {
		this.cartLocalService = cartLocalService;
	}

	/**
	 * Returns the cart remote service.
	 *
	 * @return the cart remote service
	 */
	public com.nabook.service.CartService getCartService() {
		return cartService;
	}

	/**
	 * Sets the cart remote service.
	 *
	 * @param cartService the cart remote service
	 */
	public void setCartService(com.nabook.service.CartService cartService) {
		this.cartService = cartService;
	}

	/**
	 * Returns the cart persistence.
	 *
	 * @return the cart persistence
	 */
	public CartPersistence getCartPersistence() {
		return cartPersistence;
	}

	/**
	 * Sets the cart persistence.
	 *
	 * @param cartPersistence the cart persistence
	 */
	public void setCartPersistence(CartPersistence cartPersistence) {
		this.cartPersistence = cartPersistence;
	}

	/**
	 * Returns the order item local service.
	 *
	 * @return the order item local service
	 */
	public com.nabook.service.OrderItemLocalService getOrderItemLocalService() {
		return orderItemLocalService;
	}

	/**
	 * Sets the order item local service.
	 *
	 * @param orderItemLocalService the order item local service
	 */
	public void setOrderItemLocalService(
		com.nabook.service.OrderItemLocalService orderItemLocalService) {
		this.orderItemLocalService = orderItemLocalService;
	}

	/**
	 * Returns the order item remote service.
	 *
	 * @return the order item remote service
	 */
	public com.nabook.service.OrderItemService getOrderItemService() {
		return orderItemService;
	}

	/**
	 * Sets the order item remote service.
	 *
	 * @param orderItemService the order item remote service
	 */
	public void setOrderItemService(
		com.nabook.service.OrderItemService orderItemService) {
		this.orderItemService = orderItemService;
	}

	/**
	 * Returns the order item persistence.
	 *
	 * @return the order item persistence
	 */
	public OrderItemPersistence getOrderItemPersistence() {
		return orderItemPersistence;
	}

	/**
	 * Sets the order item persistence.
	 *
	 * @param orderItemPersistence the order item persistence
	 */
	public void setOrderItemPersistence(
		OrderItemPersistence orderItemPersistence) {
		this.orderItemPersistence = orderItemPersistence;
	}

	/**
	 * Returns the stock item local service.
	 *
	 * @return the stock item local service
	 */
	public com.nabook.service.StockItemLocalService getStockItemLocalService() {
		return stockItemLocalService;
	}

	/**
	 * Sets the stock item local service.
	 *
	 * @param stockItemLocalService the stock item local service
	 */
	public void setStockItemLocalService(
		com.nabook.service.StockItemLocalService stockItemLocalService) {
		this.stockItemLocalService = stockItemLocalService;
	}

	/**
	 * Returns the stock item remote service.
	 *
	 * @return the stock item remote service
	 */
	public com.nabook.service.StockItemService getStockItemService() {
		return stockItemService;
	}

	/**
	 * Sets the stock item remote service.
	 *
	 * @param stockItemService the stock item remote service
	 */
	public void setStockItemService(
		com.nabook.service.StockItemService stockItemService) {
		this.stockItemService = stockItemService;
	}

	/**
	 * Returns the stock item persistence.
	 *
	 * @return the stock item persistence
	 */
	public StockItemPersistence getStockItemPersistence() {
		return stockItemPersistence;
	}

	/**
	 * Sets the stock item persistence.
	 *
	 * @param stockItemPersistence the stock item persistence
	 */
	public void setStockItemPersistence(
		StockItemPersistence stockItemPersistence) {
		this.stockItemPersistence = stockItemPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Returns the asset entry local service.
	 *
	 * @return the asset entry local service
	 */
	public com.liferay.asset.kernel.service.AssetEntryLocalService getAssetEntryLocalService() {
		return assetEntryLocalService;
	}

	/**
	 * Sets the asset entry local service.
	 *
	 * @param assetEntryLocalService the asset entry local service
	 */
	public void setAssetEntryLocalService(
		com.liferay.asset.kernel.service.AssetEntryLocalService assetEntryLocalService) {
		this.assetEntryLocalService = assetEntryLocalService;
	}

	/**
	 * Returns the asset entry remote service.
	 *
	 * @return the asset entry remote service
	 */
	public com.liferay.asset.kernel.service.AssetEntryService getAssetEntryService() {
		return assetEntryService;
	}

	/**
	 * Sets the asset entry remote service.
	 *
	 * @param assetEntryService the asset entry remote service
	 */
	public void setAssetEntryService(
		com.liferay.asset.kernel.service.AssetEntryService assetEntryService) {
		this.assetEntryService = assetEntryService;
	}

	/**
	 * Returns the asset entry persistence.
	 *
	 * @return the asset entry persistence
	 */
	public AssetEntryPersistence getAssetEntryPersistence() {
		return assetEntryPersistence;
	}

	/**
	 * Sets the asset entry persistence.
	 *
	 * @param assetEntryPersistence the asset entry persistence
	 */
	public void setAssetEntryPersistence(
		AssetEntryPersistence assetEntryPersistence) {
		this.assetEntryPersistence = assetEntryPersistence;
	}

	/**
	 * Returns the asset link local service.
	 *
	 * @return the asset link local service
	 */
	public com.liferay.asset.kernel.service.AssetLinkLocalService getAssetLinkLocalService() {
		return assetLinkLocalService;
	}

	/**
	 * Sets the asset link local service.
	 *
	 * @param assetLinkLocalService the asset link local service
	 */
	public void setAssetLinkLocalService(
		com.liferay.asset.kernel.service.AssetLinkLocalService assetLinkLocalService) {
		this.assetLinkLocalService = assetLinkLocalService;
	}

	/**
	 * Returns the asset link persistence.
	 *
	 * @return the asset link persistence
	 */
	public AssetLinkPersistence getAssetLinkPersistence() {
		return assetLinkPersistence;
	}

	/**
	 * Sets the asset link persistence.
	 *
	 * @param assetLinkPersistence the asset link persistence
	 */
	public void setAssetLinkPersistence(
		AssetLinkPersistence assetLinkPersistence) {
		this.assetLinkPersistence = assetLinkPersistence;
	}

	/**
	 * Returns the ratings stats local service.
	 *
	 * @return the ratings stats local service
	 */
	public com.liferay.ratings.kernel.service.RatingsStatsLocalService getRatingsStatsLocalService() {
		return ratingsStatsLocalService;
	}

	/**
	 * Sets the ratings stats local service.
	 *
	 * @param ratingsStatsLocalService the ratings stats local service
	 */
	public void setRatingsStatsLocalService(
		com.liferay.ratings.kernel.service.RatingsStatsLocalService ratingsStatsLocalService) {
		this.ratingsStatsLocalService = ratingsStatsLocalService;
	}

	/**
	 * Returns the ratings stats persistence.
	 *
	 * @return the ratings stats persistence
	 */
	public RatingsStatsPersistence getRatingsStatsPersistence() {
		return ratingsStatsPersistence;
	}

	/**
	 * Sets the ratings stats persistence.
	 *
	 * @param ratingsStatsPersistence the ratings stats persistence
	 */
	public void setRatingsStatsPersistence(
		RatingsStatsPersistence ratingsStatsPersistence) {
		this.ratingsStatsPersistence = ratingsStatsPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return BookService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Book.class;
	}

	protected String getModelClassName() {
		return Book.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = bookPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.nabook.service.AddressLocalService.class)
	protected com.nabook.service.AddressLocalService addressLocalService;
	@BeanReference(type = com.nabook.service.AddressService.class)
	protected com.nabook.service.AddressService addressService;
	@BeanReference(type = AddressPersistence.class)
	protected AddressPersistence addressPersistence;
	@BeanReference(type = com.nabook.service.AuthorLocalService.class)
	protected com.nabook.service.AuthorLocalService authorLocalService;
	@BeanReference(type = com.nabook.service.AuthorService.class)
	protected com.nabook.service.AuthorService authorService;
	@BeanReference(type = AuthorPersistence.class)
	protected AuthorPersistence authorPersistence;
	@BeanReference(type = com.nabook.service.BookLocalService.class)
	protected com.nabook.service.BookLocalService bookLocalService;
	@BeanReference(type = BookService.class)
	protected BookService bookService;
	@BeanReference(type = BookPersistence.class)
	protected BookPersistence bookPersistence;
	@BeanReference(type = com.nabook.service.BookOrderLocalService.class)
	protected com.nabook.service.BookOrderLocalService bookOrderLocalService;
	@BeanReference(type = com.nabook.service.BookOrderService.class)
	protected com.nabook.service.BookOrderService bookOrderService;
	@BeanReference(type = BookOrderPersistence.class)
	protected BookOrderPersistence bookOrderPersistence;
	@BeanReference(type = com.nabook.service.BookstoreLocalService.class)
	protected com.nabook.service.BookstoreLocalService bookstoreLocalService;
	@BeanReference(type = com.nabook.service.BookstoreService.class)
	protected com.nabook.service.BookstoreService bookstoreService;
	@BeanReference(type = BookstorePersistence.class)
	protected BookstorePersistence bookstorePersistence;
	@BeanReference(type = com.nabook.service.CartLocalService.class)
	protected com.nabook.service.CartLocalService cartLocalService;
	@BeanReference(type = com.nabook.service.CartService.class)
	protected com.nabook.service.CartService cartService;
	@BeanReference(type = CartPersistence.class)
	protected CartPersistence cartPersistence;
	@BeanReference(type = com.nabook.service.OrderItemLocalService.class)
	protected com.nabook.service.OrderItemLocalService orderItemLocalService;
	@BeanReference(type = com.nabook.service.OrderItemService.class)
	protected com.nabook.service.OrderItemService orderItemService;
	@BeanReference(type = OrderItemPersistence.class)
	protected OrderItemPersistence orderItemPersistence;
	@BeanReference(type = com.nabook.service.StockItemLocalService.class)
	protected com.nabook.service.StockItemLocalService stockItemLocalService;
	@BeanReference(type = com.nabook.service.StockItemService.class)
	protected com.nabook.service.StockItemService stockItemService;
	@BeanReference(type = StockItemPersistence.class)
	protected StockItemPersistence stockItemPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = com.liferay.asset.kernel.service.AssetEntryLocalService.class)
	protected com.liferay.asset.kernel.service.AssetEntryLocalService assetEntryLocalService;
	@ServiceReference(type = com.liferay.asset.kernel.service.AssetEntryService.class)
	protected com.liferay.asset.kernel.service.AssetEntryService assetEntryService;
	@ServiceReference(type = AssetEntryPersistence.class)
	protected AssetEntryPersistence assetEntryPersistence;
	@ServiceReference(type = com.liferay.asset.kernel.service.AssetLinkLocalService.class)
	protected com.liferay.asset.kernel.service.AssetLinkLocalService assetLinkLocalService;
	@ServiceReference(type = AssetLinkPersistence.class)
	protected AssetLinkPersistence assetLinkPersistence;
	@ServiceReference(type = com.liferay.ratings.kernel.service.RatingsStatsLocalService.class)
	protected com.liferay.ratings.kernel.service.RatingsStatsLocalService ratingsStatsLocalService;
	@ServiceReference(type = RatingsStatsPersistence.class)
	protected RatingsStatsPersistence ratingsStatsPersistence;
}
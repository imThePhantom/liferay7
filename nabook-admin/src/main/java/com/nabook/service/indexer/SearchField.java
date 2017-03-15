package com.nabook.service.indexer;

import com.liferay.portal.kernel.search.Field;

public class SearchField extends Field {
	public static final String BOOKSTORE_NAME = "name";
	public static final String BOOKSTORE_ADDRESS = "address";
	public static final String BOOKSTORE_ZIPCODE = "zip";
	public static final String BOOKSTORE_PHONE = "phone";
	
	public static final String BOOK_ISBN = "ISBN";
	public static final String BOOK_TITLE = "title";
	public static final String BOOK_PUBLISHER = "publisher";
	
	public static final String AUTHOR_NAME = "fullName";
	
	public SearchField(String name) {
		super(name);
	}

}

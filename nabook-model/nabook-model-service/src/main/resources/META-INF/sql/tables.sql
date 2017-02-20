create table nab_Address (
	uuid_ VARCHAR(75) null,
	addressId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	userId LONG,
	userName VARCHAR(75) null,
	name VARCHAR(50) null,
	phone VARCHAR(75) null,
	country VARCHAR(50) null,
	city VARCHAR(50) null,
	prefecture VARCHAR(50) null,
	street VARCHAR(50) null,
	zip VARCHAR(75) null,
	primary_ BOOLEAN
);

create table nab_Author (
	uuid_ VARCHAR(75) null,
	authorId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	fullName VARCHAR(75) null,
	profile VARCHAR(75) null
);

create table nab_Book (
	uuid_ VARCHAR(75) null,
	bookId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	userId LONG,
	userName VARCHAR(75) null,
	ISBN VARCHAR(75) null,
	title VARCHAR(255) null,
	subtitle VARCHAR(255) null,
	edition VARCHAR(50) null,
	volume VARCHAR(50) null,
	publisher VARCHAR(255) null,
	pubDate DATE null,
	price VARCHAR(12) null,
	description VARCHAR(1000) null,
	thumbnail BLOB,
	sample BLOB
);

create table nab_BookOrder (
	uuid_ VARCHAR(75) null,
	bookOrderId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	userId LONG,
	userName VARCHAR(75) null,
	status VARCHAR(75) null,
	billingName VARCHAR(50) null,
	billingCountry VARCHAR(50) null,
	billingCity VARCHAR(50) null,
	billingPrefecture VARCHAR(50) null,
	billingStreet VARCHAR(255) null,
	billingZip VARCHAR(75) null,
	shipToBilling BOOLEAN,
	shippingName VARCHAR(50) null,
	shippingCountry VARCHAR(50) null,
	shippingCity VARCHAR(50) null,
	shippingPrefecture VARCHAR(50) null,
	shippingStreet VARCHAR(255) null,
	shippingZip VARCHAR(75) null,
	phone VARCHAR(75) null,
	total VARCHAR(12) null,
	tax INTEGER,
	discount INTEGER,
	shipfee VARCHAR(12) null,
	payment VARCHAR(12) null
);

create table nab_Books_Authors (
	companyId LONG not null,
	authorId LONG not null,
	bookId LONG not null,
	primary key (authorId, bookId)
);

create table nab_Bookstore (
	uuid_ VARCHAR(75) null,
	bookstoreId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	userId LONG,
	userName VARCHAR(75) null,
	name VARCHAR(50) null,
	country VARCHAR(50) null,
	city VARCHAR(50) null,
	prefecture VARCHAR(50) null,
	street VARCHAR(255) null,
	zip VARCHAR(75) null,
	phone VARCHAR(75) null,
	description VARCHAR(1000) null
);

create table nab_Cart (
	uuid_ VARCHAR(75) null,
	cartId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	userId LONG,
	userName VARCHAR(75) null,
	bookId LONG,
	quantity INTEGER
);

create table nab_OrderItem (
	uuid_ VARCHAR(75) null,
	orderItemId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	userId LONG,
	userName VARCHAR(75) null,
	bookOrderId LONG,
	bookId LONG,
	price VARCHAR(12) null,
	quantity INTEGER
);

create table nab_StockItem (
	uuid_ VARCHAR(75) null,
	stockItemId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	userId LONG,
	userName VARCHAR(75) null,
	bookId LONG,
	remainingQuantity INTEGER
);
create table nab_Address (
	uuid_ VARCHAR(75) null,
	addressId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	userId LONG,
	userName VARCHAR(75) null,
	name VARCHAR(75) null,
	phone VARCHAR(75) null,
	country VARCHAR(75) null,
	city VARCHAR(75) null,
	prefecture VARCHAR(75) null,
	street VARCHAR(75) null,
	zip VARCHAR(75) null,
	primary_ BOOLEAN
);

create table nab_Book (
	uuid_ VARCHAR(75) null,
	bookId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ISBN VARCHAR(75) null,
	title VARCHAR(75) null,
	subtitle VARCHAR(75) null,
	edition VARCHAR(75) null,
	volume VARCHAR(75) null,
	author VARCHAR(75) null,
	publisher VARCHAR(75) null,
	pubDate DATE null,
	description VARCHAR(75) null,
	thumbnail BLOB,
	sample BLOB,
	price VARCHAR(75) null
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
	billingName VARCHAR(75) null,
	billingCountry VARCHAR(75) null,
	billingCity VARCHAR(75) null,
	billingPrefecture VARCHAR(75) null,
	billingStreet VARCHAR(75) null,
	billingZip VARCHAR(75) null,
	shipToBilling BOOLEAN,
	shippingName VARCHAR(75) null,
	shippingCountry VARCHAR(75) null,
	shippingCity VARCHAR(75) null,
	shippingPrefecture VARCHAR(75) null,
	shippingStreet VARCHAR(75) null,
	shippingZip VARCHAR(75) null,
	phone VARCHAR(75) null,
	total VARCHAR(75) null,
	tax INTEGER,
	discount INTEGER,
	shipfee VARCHAR(75) null,
	payment VARCHAR(75) null
);

create table nab_Bookstore (
	uuid_ VARCHAR(75) null,
	bookstoreId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	country VARCHAR(75) null,
	city VARCHAR(75) null,
	prefecture VARCHAR(75) null,
	street VARCHAR(75) null,
	zip VARCHAR(75) null,
	phone VARCHAR(75) null
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
	price VARCHAR(75) null,
	quantity INTEGER
);

create table nab_StockItem (
	uuid_ VARCHAR(75) null,
	stockItemId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	bookId LONG,
	remainingQuantity INTEGER
);
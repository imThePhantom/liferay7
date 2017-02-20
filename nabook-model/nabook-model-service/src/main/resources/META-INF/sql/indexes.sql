create unique index IX_4CA39AF5 on nab_Address (userId, primary_);
create index IX_FB65AADE on nab_Address (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_B57750E0 on nab_Address (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_9F2E4795 on nab_Author (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_B95DAF57 on nab_Author (uuid_[$COLUMN_LENGTH:75$], groupId);

create unique index IX_232133E9 on nab_Book (ISBN[$COLUMN_LENGTH:75$]);
create index IX_B2D0938D on nab_Book (publisher[$COLUMN_LENGTH:255$]);
create index IX_C1E119F3 on nab_Book (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_34BD8135 on nab_Book (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_626A0426 on nab_BookOrder (modifiedDate);
create index IX_99F38255 on nab_BookOrder (userId);
create index IX_5EA3064F on nab_BookOrder (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_1E86D491 on nab_BookOrder (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_CBDDA983 on nab_Books_Authors (authorId);
create index IX_76F8DAA1 on nab_Books_Authors (bookId);
create index IX_6841013F on nab_Books_Authors (companyId);

create unique index IX_CC6836F7 on nab_Bookstore (country[$COLUMN_LENGTH:50$], city[$COLUMN_LENGTH:50$], prefecture[$COLUMN_LENGTH:50$], street[$COLUMN_LENGTH:255$]);
create unique index IX_4CDF434D on nab_Bookstore (name[$COLUMN_LENGTH:50$]);
create unique index IX_C4E8AED0 on nab_Bookstore (phone[$COLUMN_LENGTH:75$]);
create index IX_4E989082 on nab_Bookstore (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_76AF4F84 on nab_Bookstore (uuid_[$COLUMN_LENGTH:75$], groupId);

create unique index IX_816832C8 on nab_Cart (userId, bookId);
create index IX_B41E18AA on nab_Cart (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_FCC8C1AC on nab_Cart (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_3C2A190F on nab_OrderItem (bookId);
create unique index IX_C8AABB11 on nab_OrderItem (bookOrderId, bookId);
create index IX_B4CB88F1 on nab_OrderItem (userId);
create index IX_E30879EB on nab_OrderItem (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D5AC7F2D on nab_OrderItem (uuid_[$COLUMN_LENGTH:75$], groupId);

create unique index IX_3B204AD7 on nab_StockItem (bookId);
create index IX_3F6111B3 on nab_StockItem (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_6D5868F5 on nab_StockItem (uuid_[$COLUMN_LENGTH:75$], groupId);
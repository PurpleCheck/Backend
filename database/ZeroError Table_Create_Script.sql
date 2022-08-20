-- ZeroError.members
CREATE TABLE MEMBERS (
  member_id bigint NOT NULL,
  member_name varchar(100) DEFAULT NULL,
  phone varchar(30) DEFAULT NULL,
  PRIMARY KEY (member_id)
);

-- ZeroError.item
CREATE TABLE ITEM (
  item_id bigint NOT NULL,
  item_name varchar(100) DEFAULT NULL,
  brand_name varchar(100) DEFAULT NULL,
  price int NULL,
  stock_quantity int DEFAULT NULL,
  PRIMARY KEY (item_id)
);

-- ZeroError.orders
CREATE TABLE ORDERS(
  order_id bigint NOT NULL,
  member_id bigint NOT NULL,
  order_date datetime DEFAULT NOW(),
  PRIMARY KEY (order_id),
  FOREIGN KEY (member_id) REFERENCES MEMBERS (member_id)
);
-- ZeroError.order_item
CREATE TABLE ORDER_ITEM (
  order_item_id bigint NOT NULL,
  order_id bigint NOT NULL,
  item_id bigint NOT NULL,
  count int DEFAULT NULL,
  PRIMARY KEY (order_item_id),
  FOREIGN KEY (item_id) REFERENCES ITEM (item_id),
  FOREIGN KEY (order_id) REFERENCES ORDERS (order_id)
);

-- ZeroError.tracking_info
CREATE TABLE TRACKING_INFO (
  tracking_id varchar(100) NOT NULL,
  order_id bigint NOT NULL,
  order_date datetime DEFAULT NOW(),
  PRIMARY KEY (tracking_id),
  FOREIGN KEY (order_id) REFERENCES ORDERS (order_id)
);

-- ZeroError.inspect_info
CREATE TABLE INSPECT_INFO (
  inspect_id bigint NOT NULL,
  order_id bigint NOT NULL,
  tracking_id varchar(100) NOT NULL,
  complete_yn tinyint DEFAULT 0,
  inspect_date datetime DEFAULT NOW(),
  PRIMARY KEY (inspect_id),
  FOREIGN KEY (tracking_id) REFERENCES TRACKING_INFO (tracking_id),
  FOREIGN KEY (order_id) REFERENCES ORDERS (order_id)
);




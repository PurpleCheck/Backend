-- ZeroError.members
CREATE TABLE members (
  member_id bigint NOT NULL,
  member_name varchar(100) DEFAULT NULL,
  phone varchar(30) DEFAULT NULL,
  PRIMARY KEY (member_id)
);

-- ZeroError.item
CREATE TABLE item (
  item_id bigint NOT NULL,
  item_name varchar(100) DEFAULT NULL,
  brand_name varchar(100) DEFAULT NULL,
  price int NULL,
  stock_quantity int DEFAULT NULL,
  PRIMARY KEY (item_id)
);

-- ZeroError.orders
CREATE TABLE orders(
  order_id bigint NOT NULL,
  member_id bigint NOT NULL,
  order_date datetime DEFAULT NOW(),
  PRIMARY KEY (order_id),
  FOREIGN KEY (member_id) REFERENCES members (member_id)
);

-- ZeroError.order_item
CREATE TABLE order_item (
  order_item_id bigint NOT NULL,
  order_id bigint NOT NULL,
  item_id bigint NOT NULL,
  count int DEFAULT NULL,
  PRIMARY KEY (order_item_id),
  FOREIGN KEY (item_id) REFERENCES item (item_id),
  FOREIGN KEY (order_id) REFERENCES orders (order_id)
);

-- ZeroError.tracking_info
CREATE TABLE tracking_info (
  tracking_id varchar(100) NOT NULL,
  order_id bigint NOT NULL,
  order_date datetime DEFAULT NOW(),
  PRIMARY KEY (tracking_id),
  FOREIGN KEY (order_id) REFERENCES orders (order_id)
);

-- ZeroError.inspect_info
CREATE TABLE inspect_info (
  inspect_id bigint NOT NULL,
  order_id bigint NOT NULL,
  tracking_id varchar(100) NOT NULL,
  complete_yn tinyint DEFAULT 0,
  inspect_date datetime DEFAULT NOW(),
  PRIMARY KEY (inspect_id),
  FOREIGN KEY (tracking_id) REFERENCES tracking_info (tracking_id),
  FOREIGN KEY (order_id) REFERENCES orders (order_id)
);




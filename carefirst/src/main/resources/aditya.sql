CREATE SCHEMA carefirst;
CREATE TABLE carefirst.cust (
  `customer_name` varchar(255) DEFAULT NULL,
  `customer_city` varchar(255) DEFAULT NULL,
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`customer_id`)
);


CREATE TABLE carefirst.cli (

 `client_Fname` varchar(255) DEFAULT NULL,
 `client_Sname` varchar(255) DEFAULT NULL,
 `client_email` varchar(255) DEFAULT NULL,
 `client_dob` varchar(255) DEFAULT 19000101,
 `client_weight` varchar(255) DEFAULT NULL,
 `client_address_id` int(11) DEFAULT NULL,
 `client_about` varchar(255) DEFAULT NULL,
 `client_contact_no` varchar(14) DEFAULT NULL,
 `client_login_id` int(11) default NULL,
 `client_id` int(11) NOT NULL AUTO_INCREMENT,

 PRIMARY KEY (`client_id`)
 );
 
 CREATE TABLE carefirst.address (

 `addressFirstLine` varchar(255) DEFAULT NULL,
 `addressSecondLine` varchar(255) DEFAULT NULL,
 `city` varchar(255) DEFAULT NULL,
 `county` varchar(255) DEFAULT 19000101,
 `eircode` varchar(255) DEFAULT NULL,
 `addressId` int(11) NOT NULL AUTO_INCREMENT,

 PRIMARY KEY (`addressId`)
 );
 
 CREATE TABLE carefirst.discount (

 `valid_date` varchar(255) DEFAULT NULL,
 `is_used` varchar(255) DEFAULT NULL,
 `code` varchar(255) DEFAULT NULL,
 `binary` int(11) DEFAULT NULL,
 `discount_id` int(11) NOT NULL AUTO_INCREMENT,

 PRIMARY KEY (`discount_id`)
 );
 
 CREATE TABLE carefirst.login (

 `username` varchar(255) DEFAULT NULL,
 `password` varchar(255) DEFAULT NULL,
 `is_locked` varchar(255) DEFAULT NULL,
 `login_id` int(11) NOT NULL AUTO_INCREMENT,

 PRIMARY KEY (`login_id`)
 );
 
 
 CREATE TABLE carefirst.manager (

 `manager_name` varchar(255) DEFAULT NULL,
 `manager_email` varchar(255) DEFAULT NULL,
 `manager_dob` varchar(255) DEFAULT NULL,
 `manager_contact_no` varchar(255) DEFAULT NULL,
 `address_id` int(11) DEFAULT NULL,
 `login_id` int(11) default NULL,
 `manager_id` int(11) NOT NULL AUTO_INCREMENT,

 PRIMARY KEY (`manager_id`)
 );
 
 
 CREATE TABLE carefirst.order (

 `order_date` varchar(255) DEFAULT NULL,
 `shipped_date` varchar(255) DEFAULT NULL,
 `payment_id` varchar(255) DEFAULT NULL,
 `order_status` varchar(255) DEFAULT 19000101,
 `promo_code` varchar(255) DEFAULT NULL,
 `cart_price` varchar(255) DEFAULT NULL,
 `service_Type` varchar(14) DEFAULT NULL,
  `order_type` varchar(14) DEFAULT NULL,
 `client_id` int(11) DEFAULT NULL,
 `address_id` int(11) default NULL,
 `product_id` int(11) default NULL,
 `delivery_charge` int(11) default NULL,
 `discount_Id` int(11) default NULL,
 `final_amount` int(11) default NULL,
  `is_prescribed` int(11) default NULL,
 `order_id` int(11) NOT NULL AUTO_INCREMENT,

 PRIMARY KEY (`order_id`)
 );
 
 CREATE TABLE carefirst.product (

 `product_code` varchar(255) DEFAULT NULL,
 `product_name` varchar(255) DEFAULT NULL,
 `description` varchar(255) DEFAULT NULL,
 `category` varchar(255) DEFAULT 19000101,
 `quantity` varchar(255) DEFAULT NULL,
 `orignal_price` int(11) DEFAULT NULL,
 `last_price` int(11) default NULL,
 `target_level` int(11) default NULL,
 `reorder_level` int(11) default NULL,
 `minimum_reorder` int(11) default NULL,
 `discount_Id` int(11) default NULL,
 `product_id` int(11) NOT NULL AUTO_INCREMENT,

 PRIMARY KEY (`product_id`)
 );
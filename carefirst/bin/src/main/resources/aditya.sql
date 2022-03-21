CREATE SCHEMA carefirst;
CREATE TABLE carefirst.cust (
  `customer_name` varchar(255) DEFAULT NULL,
  `customer_city` varchar(255) DEFAULT NULL,
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`customer_id`)
);

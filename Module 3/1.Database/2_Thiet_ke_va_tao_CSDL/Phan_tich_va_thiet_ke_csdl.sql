DROP DATABASE IF EXISTS Car;
CREATE DATABASE Car;
USE Car;

CREATE TABLE Customers(
customer_number INT PRIMARY KEY, 
customer_name VARCHAR(50) NOT NULL,
contract_last_name VARCHAR(50) NOT NULL,
contract_first_name VARCHAR(50) NOT NULL,
phone_number VARCHAR(50) NOT NULL,
address_1 VARCHAR(50) NOT NULL,
address_2 VARCHAR(50),
city VARCHAR(50) NOT NULL,
state VARCHAR(50) NOT NULL,
postal_code VARCHAR(15) NOT NULL,
country VARCHAR(50) NOT NULL,
credit_limit INT
);

CREATE TABLE Orders(
order_number INT PRIMARY KEY,
order_date DATE NOT NULL,
required_date DATE NOT NULL,
shipper_date DATE,
status VARCHAR(15) NOT NULL,
comments TEXT,
quantity_ordered INT NOT NULL,
price_each INT NOT NULL
);

CREATE TABLE Payments(
customer_number INT NOT NULL,
check_number VARCHAR(50) NOT NULL,
payment_date DATE NOT NULL,
amount INT NOT NULL
);

CREATE TABLE Products(
product_code VARCHAR(15) NOT NULL,
product_name VARCHAR(70) NOT NULL,
product_scale VARCHAR(10) NOT NULL,
product_vendor VARCHAR(50) NOT NULL,
product_description TEXT NOT NULL,
quantity_in_stock INT NOT NULL,
buy_price INT NOT NULL,
MSRP INT NOT NULL
);

CREATE TABLE Productlines(
product_line VARCHAR(50) NOT NULL,
text_description TEXT,
image VARCHAR(255)
);

CREATE TABLE Employees(
employee_number INT PRIMARY KEY,
last_name VARCHAR(50) NOT NULL,
first_name VARCHAR(50) NOT NULL,
email VARCHAR(100) NOT NULL,
job_title VARCHAR(50) NOT NULL
);

CREATE TABLE Offices(
office_code VARCHAR(10) NOT NULL,
city VARCHAR(50) NOT NULL,
phone_number VARCHAR(50) NOT NULL,
address_line_1 VARCHAR(50) NOT NULL,
address_line_2 VARCHAR(50),
state VARCHAR(50),
country VARCHAR(50) NOT NULL,
postal_code VARCHAR(15) NOT NULL
);
 
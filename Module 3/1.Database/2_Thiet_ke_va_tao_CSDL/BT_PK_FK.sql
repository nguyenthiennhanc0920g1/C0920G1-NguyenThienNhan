DROP DATABASE IF EXISTS Bank;
CREATE DATABASE Bank;
USE Bank;

CREATE TABLE Customers(
customer_number VARCHAR(50) PRIMARY KEY,
full_name VARCHAR(50),
email VARCHAR(50),
phone_number VARCHAR(10)
);

CREATE TABLE `Accounts`(
account_number VARCHAR(50) PRIMARY KEY,
customer_number VARCHAR(50),
account_type VARCHAR(50),
`date` DATE,
balance INT,
FOREIGN KEY (customer_number) REFERENCES `Customers` (customer_number)
);

CREATE TABLE Transactions(
tran_number VARCHAR(50) PRIMARY KEY,
account_number VARCHAR(50),
`date` DATE,
amounts INT,
descriptions VARCHAR(255),
FOREIGN KEY (account_number) REFERENCES `Accounts` (account_number)
);

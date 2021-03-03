drop database if exists Customers;
create database Customers;
use Customers;

create table customers_manager(
id int primary key,
name varchar(250),
email varchar(500),
address varchar(500)
);

insert into customers_manager
values
('1', 'nhan', 'nhan@gmali.com', '123 nhan'),
('2', 'long', 'long@gmali.com', '123 long'),
('3', 'huy', 'huy@gmali.com', '123 huy'),
('4', 'hiep', 'hiep@gmali.com', '123 hiep')
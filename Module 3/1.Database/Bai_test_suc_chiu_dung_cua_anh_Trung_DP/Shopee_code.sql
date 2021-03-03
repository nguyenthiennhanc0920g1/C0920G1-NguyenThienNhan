use shopee;

select * from products;
SET SQL_SAFE_UPDATES = 0;
-- B.Thao tác dữ liệu --
update products set products.price = products.price + 10 where price <= 1000;
update products set products.discount = products.discount + 5 where discount <= 10;
delete from products where products.stock = 0;

-- C.Truy vấn dữ liệu --
select * from products where discount <= 10;
select * from products where stock <= 5;
select * from products where (price - discount) <= 1000;
select * from customers where address = 'Đà Nẵng';
select * from customers where birthday like'%1990%';
select * from customers where birthday = now();
select now();
select * from customers;
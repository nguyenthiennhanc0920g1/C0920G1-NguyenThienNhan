drop database if exists quan_ly_tai_khoan;
create database quan_ly_tai_khoan;
use quan_ly_tai_khoan;

create table tai_khoan(
username varchar(50) primary key,
password varchar(50) not null,
permission int
);

insert into tai_khoan values('nhandn93', '123456', 1);
insert into tai_khoan values('trungdoan', 'phat5k', 2);
insert into tai_khoan values('123', '123', 3);
select * from tai_khoan where username = 'nhandn93' and password = '123456';
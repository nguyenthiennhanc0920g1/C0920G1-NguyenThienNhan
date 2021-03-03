drop database if exists study;
create database study;
use study;
create table danhsach(
id INT auto_increment primary key,
ten varchar(50),
tuoi INT,
khoa_hoc varchar(50),
so_tien int
);

insert into danhsach
value(danhsach.id, 'hoang', 21, 'cntt', 400000),
(danhsach.id, 'viet', 19, 'dtvt', 320000),
(danhsach.id, 'thanh', 18, 'ktdn', 400000),
(danhsach.id, 'nhan', 19, 'ck', 450000),
(danhsach.id, 'huong', 20, 'tcnh', 500000),
(danhsach.id, 'huong', 20, 'tcnh', 200000);

select * from danhsach where ten like '%huong%';
select sum(so_tien) as 'tong so tien cua huong' from danhsach where ten like '%huong%';
select distinct(ten) as 'danh sach ten' from danhsach;
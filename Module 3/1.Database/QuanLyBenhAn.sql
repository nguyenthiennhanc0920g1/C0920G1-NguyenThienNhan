drop database if exists quan_ly_benh_an;
create database quan_ly_benh_an;
use quan_ly_benh_an;

create table benh_nhan(
ma_benh_nhan varchar(10) primary key,
ten_benh_nhan varchar(50) not null
);

create table benh_an(
ma_benh_an varchar(10) primary key,
ngay_nhap_vien date not null,
ngay_xuat_vien date not null,
ly_do_nhap_vien varchar(500),
phuong_phap_dieu_tri varchar(500),
bac_si_dieu_tri varchar(50),
ma_benh_nhan varchar(10),
foreign key (ma_benh_nhan) references benh_nhan(ma_benh_nhan)
);

insert into benh_nhan
values
('BN-001', 'Nguyen Van A'),
('BN-002', 'Nguyen Van C'),
('BN-003', 'Ton Nu D'),
('BN-004', 'Doan Thi E');

insert into benh_an
values
('BA-001', '2016-08-07', '2019-09-10', 'ung thu gan giai doan cuoi', 'phau thuat', 'Le Van B', 'BN-001'),
('BA-002', '2015-11-27', '2020-09-07', 'suy than man', 'dieu tri bang thuoc', 'Nguyen Thi C', 'BN-002'),
('BA-003', '2019-08-07', '2020-12-07', 'covid-2019', 'tho may', 'Tran Anh D', 'BN-003'),
('BA-004', '2017-03-29', '2020-12-07', 'ung thu phoi giai doan cuoi', 'hoa tri', 'Le Tran Van E', 'BN-004');

-- select * from benh_nhan inner join benh_an on benh_nhan.ma_benh_nhan = benh_an.ma_benh_nhan;
-- select ba.*, bn.ten_benh_nhan from benh_nhan as bn inner join benh_an as ba on bn.ma_benh_nhan = ba.ma_benh_nhan where ma_benh_an = 'BA-001';
-- UPDATE benh_an SET ma_benh_an = 'Joe', bac_si_dieu_tri = 101 WHERE ma_benh_an = 'James';

-- select ba.*, bn.ten_benh_nhan from benh_nhan as bn inner join benh_an as ba on bn.ma_benh_nhan = ba.ma_benh_nhan;
-- select ba.*, bn.ten_benh_nhan from benh_nhan as bn
--              inner join benh_an as ba on bn.ma_benh_nhan = ba.ma_benh_nhan where ma_benh_an = 'BA-001';
-- update benh_nhan as bn, benh_an as ba set bn.ten_benh_nhan = 'Nguyen Thien Nhan', ba.ngay_nhap_vien = '2019-02-12', ba.ngay_xuat_vien = '2020-01-01', ba.ly_do_nhap_vien = 'sot xuat huyet', ba.phuong_phap_dieu_tri = 'tu khoi', ba.bac_si_dieu_tri = 'Truong Ngoc H' where ba.ma_benh_nhan = bn.ma_benh_nhan and bn.ma_benh_nhan = 'BN-001';
     -- select ba.*, bn.ten_benh_nhan from benh_nhan as bn 
--      inner join benh_an as ba on bn.ma_benh_nhan = ba.ma_benh_nhan 
--      where ba.ma_benh_nhan = 'BN-002';  
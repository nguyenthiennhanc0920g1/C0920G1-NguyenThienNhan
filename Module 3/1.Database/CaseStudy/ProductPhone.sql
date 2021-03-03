drop database if exists products;
create database products;
use products;

create table product_manager(
id varchar(50) primary key,
name varchar(500),
price double,
img varchar(1000),
quantity int
);

insert into product_manager
values
('I-01', 'iphone', 1000.0, 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fcellphones.com.vn%2Fsforum%2Fbo-bon-iphone-12-lo-thong-so-cau-hinh-va-gia-ban-re-bat-ngo&psig=AOvVaw2m0dakDU2tdHVSO6onkGfV&ust=1610009398613000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPCOlMT2hu4CFQAAAAAdAAAAABAD', 100),
('O-02', 'oppo', 500.0, 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fdienmaycholon.vn%2Fdien-thoai-di-dong%2Foppo-a93-8gb128gb-den&psig=AOvVaw01poVnOdaN8bnsPsAtRv_D&ust=1610009452790000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNCOieD2hu4CFQAAAAAdAAAAABAD', 250),
('V-03', 'vinsmart', 450.0, 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.dienmayxanh.com%2Fkinh-nghiem-hay%2Fvinsmart-ra-mat-smartphone-co-camera-an-duoi-man-h-1291011&psig=AOvVaw2tqfUJlxuUA-KxrPLVjuVJ&ust=1610009515605000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNDEo_v2hu4CFQAAAAAdAAAAABAD', 150),
('S-04', 'samsung', 700.0, 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.thegioididong.com%2Fdtdd%2Fsamsung-galaxy-a50&psig=AOvVaw0eBL9dVPFWcnCwvnCNu1fX&ust=1610009582065000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLCZqaT3hu4CFQAAAAAdAAAAABAD', 300);
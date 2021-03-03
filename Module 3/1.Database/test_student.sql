Drop database if exists student_db;
Create database student_db;
Use student_db;

create table student_list(
id int auto_increment primary key,
name varchar(50) not null,
brithday date,
email varchar(100),
address varchar(250)
);

insert into student_list (name, brithday, email, address)
values
('nhan', '1993-12-13', 'nhan@gmail.com', '123 nhan, da nang'),
('long', '1988-01-13', 'long@gmail.com', '45 long, da nang'),
('huy', '2002-02-13', 'huy@gmail.com', '67 huy, da nang');

select * from student_list where name like '%long%';
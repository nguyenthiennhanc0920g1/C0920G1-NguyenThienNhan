drop database if exists iNotes;
create database iNotes;

use iNotes;

create table note_type(
id int(11),
`name` varchar(100),
`description` varchar(200),
primary key (id, `name`)
);

create table note(
id int(11) primary key,
title varchar(100),
content varchar(500),
type_id int(11),
foreign key (type_id) references note_type(id)
);
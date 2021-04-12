drop database if exists dbgoods;
create database dbgoods default character set utf8;
use dbgoods;
create table tb_goods(
                         id bigint primary key auto_increment,
                         name varchar(100) not null,
                         remark text,
                         createdTime datetime not null
)engine=InnoDB;
insert into tb_goods values (null,'java','very good',now());
insert into tb_goods values (null,'mysql','RDBMS',now());
insert into tb_goods values (null,'Oracle','RDBMS',now());
insert into tb_goods values (null,'java','very good',now());
insert into tb_goods values (null,'mysql','RDBMS',now());
insert into tb_goods values (null,'Oracle','RDBMS',now());
insert into tb_goods values (null,'java','very good',now());
insert into tb_goods values (null,'mysql','RDBMS',now());
insert into tb_goods values (null,'Oracle','RDBMS',now());
insert into tb_goods values (null,'java','very good',now());
insert into tb_goods values (null,'mysql','RDBMS',now());
insert into tb_goods values (null,'Oracle','RDBMS',now());


create database renovation;

use renovation;

-- 用户表
create table user (
	id int(11) not null auto_increment primary key,
	set tinyInt(1) not null comment '性别[男0|女1|保密2]'
)engine=InnoDB default charset=utf-8 comment='用户表'

-- 第三方登录表
create table third_login (
	id int(11) not null auto_increment primary key,
	user_id int(11) not null comment '用户ID',
	openid varchar(32) not null comment '第三方唯一标识',
	source tinyInt(1) not null comment '来源[0微信|1QQ|2微博]'
)engine=InnoDB default charset=utf-8 comment='第三方登录表'

-- 灵感表
create table inspiration (
	id int(11) not null auto_increment primary key,
	img_url varchar(32) not null comment '灵感图片URL',
)engine=InnoDB default charset=utf-8 comment='灵感表'

-- 收藏表
create table collect (
	id int(11) not null auto_increment primary key,
	user_id int(11) not null comment '用户ID',
	inspiration_id int(11) not null comment '灵感ID'
)engine=InnoDB default charset=utf-8 comment='收藏表'
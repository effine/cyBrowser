
create database renovation;

use renovation;

-- 用户表
create table user (
	id int(11) not null auto_increment primary key,
	email varchar(50) comment '邮箱',
	password varchar(50) comment '密码',
	phone varchar(50) comment '电话',
	nick_name varchar(50) not null comment '昵称',
	sex tinyInt(1) not null comment '性别[男0|女1|保密2]',
	avatar varchar(50) comment '头像',
	register_time varchar(50) not null comment '注册时间'
)engine=InnoDB default charset=utf8 comment='用户表'

-- 第三方登录表
create table third_login (
	id int(11) not null auto_increment primary key,
	user_id int(11) default 0 comment '用户ID',
	openid varchar(32) not null comment '第三方唯一标识',
	source tinyInt(1) not null comment '来源[0微信|1QQ|2微博]'
)engine=InnoDB default charset=utf8 comment='第三方登录表'

-- 灵感表
create table inspiration (
	id int(11) not null auto_increment primary key,
	img_url varchar(32) not null comment '灵感图片URL'
)engine=InnoDB default charset=utf8 comment='灵感表'

-- 灵感标签表
create table label (
	id int(11) not null auto_increment primary key,
	user_id int(11) not null comment '用户ID',
	inspiration_id int(11) not null comment '灵感ID',
	content varchar(50) not null comment '标签内容',
	height varchar(50) not null comment '纵向坐标',
 	width varchar(50) not null comment '横向坐标'
)engine=InnoDB default charset=utf8 comment '灵感标签表'

-- 收藏表
create table collect (
	id int(11) not null auto_increment primary key,
	user_id int(11) not null comment '用户ID',
	inspiration_id int(11) not null comment '灵感ID',
	collect_time varchar(50) not null comment '收藏时间'
)engine=InnoDB default charset=utf8 comment='收藏表'

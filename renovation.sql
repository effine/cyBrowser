
create database renovation;

use renovation;

-- 用户表
create table user (
	id int(11) not null auto_increment primary key,
	sex tinyInt(1) not null comment '性别[男0|女1|保密2]'
)engine=InnoDB default charset=utf8 comment='用户表'

-- 第三方登录表
create table third_login (
	id int(11) not null auto_increment primary key,
	user_id int(11) default 0 comment '用户ID',
	openid varchar(32) not null comment '第三方唯一标识',
	source tinyInt(1) not null comment '来源[0微信|1QQ|2微博]',
)engine=InnoDB default charset=utf8 comment='第三方登录表'

-- 灵感表
create table inspiration (
	id int(11) not null auto_increment primary key,
	img_url varchar(32) not null comment '灵感图片URL',
	label varchar(255) default '' comment '灵感标签数组(包含标签内容及位置)',
)engine=InnoDB default charset=utf8 comment='灵感表'

-- 灵感标签表
create table label (
	id int(11) not null auto_increment primary key,
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
	collect_time varchar(50) not null comment '收藏时间',
	is_cancel tinyInt(1) default 0 comment '是否取消收藏'
)engine=InnoDB default charset=utf8 comment='收藏表'

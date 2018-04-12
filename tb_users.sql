/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50027
Source Host           : localhost:3306
Source Database       : kpxt

Target Server Type    : MYSQL
Target Server Version : 50027
File Encoding         : 65001

Date: 2016-07-22 15:17:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_users`
-- ----------------------------
DROP TABLE IF EXISTS `tb_users`;
CREATE TABLE `tb_users` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `zh` varchar(32) default NULL COMMENT '帐号',
  `mm` varchar(128) default NULL COMMENT '密码',
  `xm` varchar(256) default NULL COMMENT '姓名',
  `bm` varchar(256) default NULL COMMENT '部门',
  `zw` varchar(256) default NULL COMMENT '职务',
  `zt` varchar(2) default NULL COMMENT '状态',
  `deleteflag` varchar(2) default NULL COMMENT 'deleteflag',
  `opratetime` datetime default NULL COMMENT 'opratetime',
  `createtime` datetime default NULL COMMENT 'createtime',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息';

-- ----------------------------
-- Records of tb_users
-- ----------------------------
INSERT INTO `tb_users` VALUES ('2', '100002', '123456', '赵明', '1', '1', '0', 'A', '2016-07-21 17:04:56', '2016-07-07 10:15:27');
INSERT INTO `tb_users` VALUES ('3', '100003', '123456', '李静', '1', '2', '0', 'A', '2016-07-21 17:08:00', '2016-07-07 10:16:25');
INSERT INTO `tb_users` VALUES ('324b02c43342453d8a6d75117e7a74ac', 'zhangsan', '123456', '张志健', '1', '3', '0', 'A', '2016-07-21 17:08:14', '2016-07-18 12:39:15');
INSERT INTO `tb_users` VALUES ('32dad24645fe40abb09d3b5f5a563e00', 'yaojie', '111111', '姚捷', '1', '2', '0', 'A', '2016-07-21 17:08:14', '2016-07-21 10:58:27');
INSERT INTO `tb_users` VALUES ('4', '100004', '123456', '王磊', '1', '4', '0', 'A', '2016-07-21 09:55:16', '2016-07-07 10:18:37');
INSERT INTO `tb_users` VALUES ('5', '100000', '123456', '张云', '1', '5', '0', 'A', '2016-07-21 17:08:22', '2016-07-07 10:27:49');
INSERT INTO `tb_users` VALUES ('ac9e27cac0e946048808d4c854f9a65d', 'zhangzhijian', '123456', '张志健', '1', '3', '0', 'A', '2016-07-21 17:01:04', '2016-07-21 17:01:04');
INSERT INTO `tb_users` VALUES ('c6c2680c054d413f89ae7332af0cf47d', 'zhangjin', '111111', '张金', '1', '5', '0', 'A', '2016-07-21 11:01:11', '2016-07-21 11:01:11');

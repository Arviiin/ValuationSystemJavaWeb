/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50027
Source Host           : localhost:3306
Source Database       : kpxt

Target Server Type    : MYSQL
Target Server Version : 50027
File Encoding         : 65001

Date: 2016-07-22 15:17:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_kpzb`
-- ----------------------------
DROP TABLE IF EXISTS `tb_kpzb`;
CREATE TABLE `tb_kpzb` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `zbmc` varchar(256) default NULL COMMENT '指标名称',
  `fz` int(11) default NULL COMMENT '分值',
  `deleteflag` varchar(2) default NULL COMMENT 'deleteflag',
  `opratetime` datetime default NULL COMMENT 'opratetime',
  `createtime` datetime default NULL COMMENT 'createtime',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考评指标';

-- ----------------------------
-- Records of tb_kpzb
-- ----------------------------
INSERT INTO `tb_kpzb` VALUES ('101', '考勤', '20', 'A', '2016-07-07 10:20:37', '2016-07-07 10:20:33');
INSERT INTO `tb_kpzb` VALUES ('102', '创造性', '20', 'A', '2016-07-07 10:21:34', '2016-07-07 10:21:30');
INSERT INTO `tb_kpzb` VALUES ('103', '团队协作', '20', 'A', '2016-07-07 10:22:00', '2016-07-07 10:21:58');
INSERT INTO `tb_kpzb` VALUES ('104', '责任心', '20', 'A', '2016-07-07 11:26:56', '2016-07-07 11:26:54');
INSERT INTO `tb_kpzb` VALUES ('105', '拓展性', '20', 'A', '2016-07-21 14:22:25', '2016-07-21 14:22:28');

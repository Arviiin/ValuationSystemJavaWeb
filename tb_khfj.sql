/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50027
Source Host           : localhost:3306
Source Database       : kpxt

Target Server Type    : MYSQL
Target Server Version : 50027
File Encoding         : 65001

Date: 2016-07-22 15:17:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_khfj`
-- ----------------------------
DROP TABLE IF EXISTS `tb_khfj`;
CREATE TABLE `tb_khfj` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `sszbid` varchar(32) default NULL COMMENT '所属指标id',
  `fjnr` varchar(1024) default NULL COMMENT '分级内容',
  `fz` int(11) default NULL COMMENT '分值',
  `deleteflag` varchar(2) default NULL COMMENT 'deleteflag',
  `opratetime` datetime default NULL COMMENT 'opratetime',
  `createtime` datetime default NULL COMMENT 'createtime',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考核分级';

-- ----------------------------
-- Records of tb_khfj
-- ----------------------------
INSERT INTO `tb_khfj` VALUES ('1', '101', '差', '5', 'A', '2016-07-07 10:23:57', '2016-07-07 10:23:54');
INSERT INTO `tb_khfj` VALUES ('10', '103', '一般', '10', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('11', '103', '较好', '15', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('12', '103', '非常好', '20', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('13', '104', '差', '5', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('14', '104', '一般', '10', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('15', '104', '较好', '15', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('16', '104', '非常好', '20', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('17', '105', '差', '5', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('18', '105', '一般', '10', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('19', '105', '较好', '15', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('2', '101', '一般', '10', 'A', '2016-07-07 10:24:22', '2016-07-07 10:24:19');
INSERT INTO `tb_khfj` VALUES ('20', '105', '非常好', '20', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('3', '101', '较好', '15', 'A', '2016-07-07 10:24:51', '2016-07-07 10:24:48');
INSERT INTO `tb_khfj` VALUES ('4', '101', '非常好', '20', 'A', '2016-07-07 10:25:18', '2016-07-07 10:25:14');
INSERT INTO `tb_khfj` VALUES ('5', '102', '差', '5', 'A', '2016-07-21 14:27:47', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('6', '102', '一般', '10', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('7', '102', '较好', '15', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('8', '102', '非常好', '20', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');
INSERT INTO `tb_khfj` VALUES ('9', '103', '差', '5', 'A', '2016-07-07 10:24:51', '2016-07-21 14:27:50');

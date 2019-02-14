/*
Navicat MySQL Data Transfer

Source Server         : 10.100.99.164
Source Server Version : 50557
Source Host           : 10.100.99.164:3306
Source Database       : deploy

Target Server Type    : MYSQL
Target Server Version : 50557
File Encoding         : 65001

Date: 2019-02-14 18:15:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tester
-- ----------------------------
DROP TABLE IF EXISTS `tester`;
CREATE TABLE `tester` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tester
-- ----------------------------
INSERT INTO `tester` VALUES ('1', '熊安萍');
INSERT INTO `tester` VALUES ('2', '林伟力');
INSERT INTO `tester` VALUES ('3', '唐锐球');
INSERT INTO `tester` VALUES ('4', '王夏丽');
INSERT INTO `tester` VALUES ('5', '韦玄珠');
INSERT INTO `tester` VALUES ('6', '晏颜颜');
INSERT INTO `tester` VALUES ('7', '夏方媛');

-- ----------------------------
-- Table structure for test_project
-- ----------------------------
DROP TABLE IF EXISTS `test_project`;
CREATE TABLE `test_project` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_project
-- ----------------------------
INSERT INTO `test_project` VALUES ('1', 'user-service');

-- ----------------------------
-- Table structure for test_project_extend
-- ----------------------------
DROP TABLE IF EXISTS `test_project_extend`;
CREATE TABLE `test_project_extend` (
  `e_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_name` varchar(255) DEFAULT NULL,
  `branch` varchar(255) DEFAULT NULL,
  `md5` varchar(255) DEFAULT NULL,
  `modify_content` varchar(255) DEFAULT NULL,
  `modify_tester` varchar(255) DEFAULT NULL,
  `modify_date` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_project_extend
-- ----------------------------
INSERT INTO `test_project_extend` VALUES ('1', 'hd-sendmessagetask-service', 'fourth_raise_interest_2019_over_2019_0218\r\n', 'SHA-1: 02baee8cb3f0b7587d9725e09688f9b1f7cce458', '淡定反倒是发送到发送到发送到第三方士大夫士大夫的发送到发送到分手大师', 'xionganping', '02-14 14:48:29', '灰度');

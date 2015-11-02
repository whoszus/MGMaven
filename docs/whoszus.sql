/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : jk

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2015-11-02 18:25:39
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `t_classcatcher`
-- ----------------------------
DROP TABLE IF EXISTS `t_classcatcher`;
CREATE TABLE `t_classcatcher` (
  `name` varchar(30) DEFAULT NULL,
  `tel` varchar(11) DEFAULT NULL,
  `uuid` varchar(64) NOT NULL DEFAULT '',
  `cls` varchar(30) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `nick` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_classcatcher
-- ----------------------------
INSERT INTO `t_classcatcher` VALUES ('linyanying', '18142550223', '', 'å¤§è¡£', '1', 'hello');
INSERT INTO `t_classcatcher` VALUES ('linyanying', '18142550223', 'asdf', 'å¤§è¡£', '1', 'hello');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `UID` varchar(9) NOT NULL DEFAULT '',
  `UNAME` varchar(20) DEFAULT NULL,
  `UPASSWORD` varchar(32) DEFAULT NULL,
  `USEX` int(1) DEFAULT NULL,
  PRIMARY KEY (`UID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('10', 'root', '1844', '0');

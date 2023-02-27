/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80030
 Source Host           : localhost:3306
 Source Schema         : springbootdb

 Target Server Type    : MySQL
 Target Server Version : 80030
 File Encoding         : 65001

 Date: 11/08/2022 20:38:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '配置文件' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES (1, 'picture1', 'http://localhost:8080/springbootweb/upload/picture1.jpg');
INSERT INTO `config` VALUES (2, 'picture2', 'http://localhost:8080/springbootweb/upload/picture2.jpg');
INSERT INTO `config` VALUES (3, 'picture3', 'http://localhost:8080/springbootweb/upload/picture3.jpg');
INSERT INTO `config` VALUES (6, 'homepage', NULL);

-- ----------------------------
-- Table structure for discusszaixianwenzhen
-- ----------------------------
DROP TABLE IF EXISTS `discusszaixianwenzhen`;
CREATE TABLE `discusszaixianwenzhen`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(0) NOT NULL COMMENT '关联表id',
  `userid` bigint(0) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `content` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '评论内容',
  `reply` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '回复内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 147 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '在线问诊评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discusszaixianwenzhen
-- ----------------------------
INSERT INTO `discusszaixianwenzhen` VALUES (141, '2021-04-19 22:21:21', 1, 1, '用户名1', '评论内容1', '回复内容1');
INSERT INTO `discusszaixianwenzhen` VALUES (142, '2021-04-19 22:21:21', 2, 2, '用户名2', '评论内容2', '回复内容2');
INSERT INTO `discusszaixianwenzhen` VALUES (143, '2021-04-19 22:21:21', 3, 3, '用户名3', '评论内容3', '回复内容3');
INSERT INTO `discusszaixianwenzhen` VALUES (144, '2021-04-19 22:21:21', 4, 4, '用户名4', '评论内容4', '回复内容4');
INSERT INTO `discusszaixianwenzhen` VALUES (145, '2021-04-19 22:21:21', 5, 5, '用户名5', '评论内容5', '回复内容5');
INSERT INTO `discusszaixianwenzhen` VALUES (146, '2021-04-19 22:21:21', 6, 6, '用户名6', '评论内容6', '回复内容6');

-- ----------------------------
-- Table structure for guahaojilu
-- ----------------------------
DROP TABLE IF EXISTS `guahaojilu`;
CREATE TABLE `guahaojilu`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yishenggonghao` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医生工号',
  `yishengxingming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医生姓名',
  `suoshuyiyuan` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '所属医院',
  `keshi` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '科室',
  `zhicheng` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '职称',
  `touxiang` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '头像',
  `yuyueshijian` datetime(0) NULL DEFAULT NULL COMMENT '预约时间',
  `guahaoxuzhi` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '挂号须知',
  `yonghuming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sfsh` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '审核回复',
  `userid` bigint(0) NULL DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 87 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '挂号记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of guahaojilu
-- ----------------------------
INSERT INTO `guahaojilu` VALUES (81, '2021-04-19 22:21:21', '医生工号1', '医生姓名1', '所属医院1', '科室1', '职称1', 'http://localhost:8080/springbootweb/upload/guahaojilu_touxiang1.jpg', '2021-04-19 22:21:21', '挂号须知1', '用户名1', '姓名1', '是', '', 1);
INSERT INTO `guahaojilu` VALUES (82, '2021-04-19 22:21:21', '医生工号2', '医生姓名2', '所属医院2', '科室2', '职称2', 'http://localhost:8080/springbootweb/upload/guahaojilu_touxiang2.jpg', '2021-04-19 22:21:21', '挂号须知2', '用户名2', '姓名2', '是', '', 2);
INSERT INTO `guahaojilu` VALUES (83, '2021-04-19 22:21:21', '医生工号3', '医生姓名3', '所属医院3', '科室3', '职称3', 'http://localhost:8080/springbootweb/upload/guahaojilu_touxiang3.jpg', '2021-04-19 22:21:21', '挂号须知3', '用户名3', '姓名3', '是', '', 3);
INSERT INTO `guahaojilu` VALUES (84, '2021-04-19 22:21:21', '医生工号4', '医生姓名4', '所属医院4', '科室4', '职称4', 'http://localhost:8080/springbootweb/upload/guahaojilu_touxiang4.jpg', '2021-04-19 22:21:21', '挂号须知4', '用户名4', '姓名4', '是', '', 4);
INSERT INTO `guahaojilu` VALUES (85, '2021-04-19 22:21:21', '医生工号5', '医生姓名5', '所属医院5', '科室5', '职称5', 'http://localhost:8080/springbootweb/upload/guahaojilu_touxiang5.jpg', '2021-04-19 22:21:21', '挂号须知5', '用户名5', '姓名5', '是', '', 5);
INSERT INTO `guahaojilu` VALUES (86, '2021-04-19 22:21:21', '医生工号6', '医生姓名6', '所属医院6', '科室6', '职称6', 'http://localhost:8080/springbootweb/upload/guahaojilu_touxiang6.jpg', '2021-04-19 22:21:21', '挂号须知6', '用户名6', '姓名6', '是', '', 6);

-- ----------------------------
-- Table structure for jigou
-- ----------------------------
DROP TABLE IF EXISTS `jigou`;
CREATE TABLE `jigou`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yiyuanzhanghao` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '医院账号',
  `mima` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '密码',
  `yiyuanmingcheng` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医院名称',
  `yiyuandengji` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医院等级',
  `yiyuantupian` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医院图片',
  `yiyuandizhi` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医院地址',
  `lianxidianhua` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `yingyeshijian` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '营业时间',
  `xiangxijieshao` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '详细介绍',
  `sfsh` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '审核回复',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `yiyuanzhanghao`(`yiyuanzhanghao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 37 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '机构' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jigou
-- ----------------------------
INSERT INTO `jigou` VALUES (31, '2021-04-19 22:21:21', '机构1', '123456', '医院名称1', '医院等级1', 'http://localhost:8080/springbootweb/upload/jigou_yiyuantupian1.jpg', '医院地址1', '13823888881', '营业时间1', '详细介绍1', '是', '');
INSERT INTO `jigou` VALUES (32, '2021-04-19 22:21:21', '机构2', '123456', '医院名称2', '医院等级2', 'http://localhost:8080/springbootweb/upload/jigou_yiyuantupian2.jpg', '医院地址2', '13823888882', '营业时间2', '详细介绍2', '是', '');
INSERT INTO `jigou` VALUES (33, '2021-04-19 22:21:21', '机构3', '123456', '医院名称3', '医院等级3', 'http://localhost:8080/springbootweb/upload/jigou_yiyuantupian3.jpg', '医院地址3', '13823888883', '营业时间3', '详细介绍3', '是', '');
INSERT INTO `jigou` VALUES (34, '2021-04-19 22:21:21', '机构4', '123456', '医院名称4', '医院等级4', 'http://localhost:8080/springbootweb/upload/jigou_yiyuantupian4.jpg', '医院地址4', '13823888884', '营业时间4', '详细介绍4', '是', '');
INSERT INTO `jigou` VALUES (35, '2021-04-19 22:21:21', '机构5', '123456', '医院名称5', '医院等级5', 'http://localhost:8080/springbootweb/upload/jigou_yiyuantupian5.jpg', '医院地址5', '13823888885', '营业时间5', '详细介绍5', '是', '');
INSERT INTO `jigou` VALUES (36, '2021-04-19 22:21:21', '机构6', '123456', '医院名称6', '医院等级6', 'http://localhost:8080/springbootweb/upload/jigou_yiyuantupian6.jpg', '医院地址6', '13823888886', '营业时间6', '详细介绍6', '是', '');

-- ----------------------------
-- Table structure for keshifenlei
-- ----------------------------
DROP TABLE IF EXISTS `keshifenlei`;
CREATE TABLE `keshifenlei`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `keshifenlei` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '科室分类',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 57 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '科室分类' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of keshifenlei
-- ----------------------------
INSERT INTO `keshifenlei` VALUES (51, '2021-04-19 22:21:21', '科室分类1');
INSERT INTO `keshifenlei` VALUES (52, '2021-04-19 22:21:21', '科室分类2');
INSERT INTO `keshifenlei` VALUES (53, '2021-04-19 22:21:21', '科室分类3');
INSERT INTO `keshifenlei` VALUES (54, '2021-04-19 22:21:21', '科室分类4');
INSERT INTO `keshifenlei` VALUES (55, '2021-04-19 22:21:21', '科室分类5');
INSERT INTO `keshifenlei` VALUES (56, '2021-04-19 22:21:21', '科室分类6');

-- ----------------------------
-- Table structure for keshixinxi
-- ----------------------------
DROP TABLE IF EXISTS `keshixinxi`;
CREATE TABLE `keshixinxi`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `keshi` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '科室',
  `yishenggonghao` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '医生工号',
  `yishengxingming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医生姓名',
  `suoshuyiyuan` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '所属医院',
  `zhicheng` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '职称',
  `touxiang` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '头像',
  `lianxidianhua` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `yishengxiangqing` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '医生详情',
  `shanzhangjibing` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '擅长疾病',
  `guahaoxuzhi` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '挂号须知',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `yishenggonghao`(`yishenggonghao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 67 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '科室信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of keshixinxi
-- ----------------------------
INSERT INTO `keshixinxi` VALUES (61, '2021-04-19 22:21:21', '科室1', '医生工号1', '医生姓名1', '所属医院1', '职称1', 'http://localhost:8080/springbootweb/upload/keshixinxi_touxiang1.jpg', '13823888881', '医生详情1', '擅长疾病1', '挂号须知1');
INSERT INTO `keshixinxi` VALUES (62, '2021-04-19 22:21:21', '科室2', '医生工号2', '医生姓名2', '所属医院2', '职称2', 'http://localhost:8080/springbootweb/upload/keshixinxi_touxiang2.jpg', '13823888882', '医生详情2', '擅长疾病2', '挂号须知2');
INSERT INTO `keshixinxi` VALUES (63, '2021-04-19 22:21:21', '科室3', '医生工号3', '医生姓名3', '所属医院3', '职称3', 'http://localhost:8080/springbootweb/upload/keshixinxi_touxiang3.jpg', '13823888883', '医生详情3', '擅长疾病3', '挂号须知3');
INSERT INTO `keshixinxi` VALUES (64, '2021-04-19 22:21:21', '科室4', '医生工号4', '医生姓名4', '所属医院4', '职称4', 'http://localhost:8080/springbootweb/upload/keshixinxi_touxiang4.jpg', '13823888884', '医生详情4', '擅长疾病4', '挂号须知4');
INSERT INTO `keshixinxi` VALUES (65, '2021-04-19 22:21:21', '科室5', '医生工号5', '医生姓名5', '所属医院5', '职称5', 'http://localhost:8080/springbootweb/upload/keshixinxi_touxiang5.jpg', '13823888885', '医生详情5', '擅长疾病5', '挂号须知5');
INSERT INTO `keshixinxi` VALUES (66, '2021-04-19 22:21:21', '科室6', '医生工号6', '医生姓名6', '所属医院6', '职称6', 'http://localhost:8080/springbootweb/upload/keshixinxi_touxiang6.jpg', '13823888886', '医生详情6', '擅长疾病6', '挂号须知6');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `title` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '标题',
  `introduction` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '简介',
  `picture` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '图片',
  `content` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 137 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '名医讲堂' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (131, '2021-04-19 22:21:21', '标题1', '简介1', 'http://localhost:8080/springbootweb/upload/news_picture1.jpg', '内容1');
INSERT INTO `news` VALUES (132, '2021-04-19 22:21:21', '标题2', '简介2', 'http://localhost:8080/springbootweb/upload/news_picture2.jpg', '内容2');
INSERT INTO `news` VALUES (133, '2021-04-19 22:21:21', '标题3', '简介3', 'http://localhost:8080/springbootweb/upload/news_picture3.jpg', '内容3');
INSERT INTO `news` VALUES (134, '2021-04-19 22:21:21', '标题4', '简介4', 'http://localhost:8080/springbootweb/upload/news_picture4.jpg', '内容4');
INSERT INTO `news` VALUES (135, '2021-04-19 22:21:21', '标题5', '简介5', 'http://localhost:8080/springbootweb/upload/news_picture5.jpg', '内容5');
INSERT INTO `news` VALUES (136, '2021-04-19 22:21:21', '标题6', '简介6', 'http://localhost:8080/springbootweb/upload/news_picture6.jpg', '内容6');

-- ----------------------------
-- Table structure for pingjiayutousu
-- ----------------------------
DROP TABLE IF EXISTS `pingjiayutousu`;
CREATE TABLE `pingjiayutousu`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yishenggonghao` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医生工号',
  `yishengxingming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医生姓名',
  `suoshuyiyuan` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '所属医院',
  `fuwupingjia` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '服务评价',
  `tousujianyi` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '投诉建议',
  `riqi` date NULL DEFAULT NULL COMMENT '日期',
  `yonghuming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '手机',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 127 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '评价与投诉' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pingjiayutousu
-- ----------------------------
INSERT INTO `pingjiayutousu` VALUES (121, '2021-04-19 22:21:21', '医生工号1', '医生姓名1', '所属医院1', '服务评价1', '投诉建议1', '2021-04-19', '用户名1', '姓名1', '手机1');
INSERT INTO `pingjiayutousu` VALUES (122, '2021-04-19 22:21:21', '医生工号2', '医生姓名2', '所属医院2', '服务评价2', '投诉建议2', '2021-04-19', '用户名2', '姓名2', '手机2');
INSERT INTO `pingjiayutousu` VALUES (123, '2021-04-19 22:21:21', '医生工号3', '医生姓名3', '所属医院3', '服务评价3', '投诉建议3', '2021-04-19', '用户名3', '姓名3', '手机3');
INSERT INTO `pingjiayutousu` VALUES (124, '2021-04-19 22:21:21', '医生工号4', '医生姓名4', '所属医院4', '服务评价4', '投诉建议4', '2021-04-19', '用户名4', '姓名4', '手机4');
INSERT INTO `pingjiayutousu` VALUES (125, '2021-04-19 22:21:21', '医生工号5', '医生姓名5', '所属医院5', '服务评价5', '投诉建议5', '2021-04-19', '用户名5', '姓名5', '手机5');
INSERT INTO `pingjiayutousu` VALUES (126, '2021-04-19 22:21:21', '医生工号6', '医生姓名6', '所属医院6', '服务评价6', '投诉建议6', '2021-04-19', '用户名6', '姓名6', '手机6');

-- ----------------------------
-- Table structure for quxiaoguahao
-- ----------------------------
DROP TABLE IF EXISTS `quxiaoguahao`;
CREATE TABLE `quxiaoguahao`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yishenggonghao` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医生工号',
  `yishengxingming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医生姓名',
  `touxiang` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '头像',
  `yuyueshijian` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '预约时间',
  `quxiaoshijian` datetime(0) NULL DEFAULT NULL COMMENT '取消时间',
  `quxiaoyuanyin` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '取消原因',
  `yonghuming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `userid` bigint(0) NULL DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 97 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '取消挂号' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of quxiaoguahao
-- ----------------------------
INSERT INTO `quxiaoguahao` VALUES (91, '2021-04-19 22:21:21', '医生工号1', '医生姓名1', 'http://localhost:8080/springbootweb/upload/quxiaoguahao_touxiang1.jpg', '预约时间1', '2021-04-19 22:21:21', '取消原因1', '用户名1', '姓名1', 1);
INSERT INTO `quxiaoguahao` VALUES (92, '2021-04-19 22:21:21', '医生工号2', '医生姓名2', 'http://localhost:8080/springbootweb/upload/quxiaoguahao_touxiang2.jpg', '预约时间2', '2021-04-19 22:21:21', '取消原因2', '用户名2', '姓名2', 2);
INSERT INTO `quxiaoguahao` VALUES (93, '2021-04-19 22:21:21', '医生工号3', '医生姓名3', 'http://localhost:8080/springbootweb/upload/quxiaoguahao_touxiang3.jpg', '预约时间3', '2021-04-19 22:21:21', '取消原因3', '用户名3', '姓名3', 3);
INSERT INTO `quxiaoguahao` VALUES (94, '2021-04-19 22:21:21', '医生工号4', '医生姓名4', 'http://localhost:8080/springbootweb/upload/quxiaoguahao_touxiang4.jpg', '预约时间4', '2021-04-19 22:21:21', '取消原因4', '用户名4', '姓名4', 4);
INSERT INTO `quxiaoguahao` VALUES (95, '2021-04-19 22:21:21', '医生工号5', '医生姓名5', 'http://localhost:8080/springbootweb/upload/quxiaoguahao_touxiang5.jpg', '预约时间5', '2021-04-19 22:21:21', '取消原因5', '用户名5', '姓名5', 5);
INSERT INTO `quxiaoguahao` VALUES (96, '2021-04-19 22:21:21', '医生工号6', '医生姓名6', 'http://localhost:8080/springbootweb/upload/quxiaoguahao_touxiang6.jpg', '预约时间6', '2021-04-19 22:21:21', '取消原因6', '用户名6', '姓名6', 6);

-- ----------------------------
-- Table structure for shixinmingdan
-- ----------------------------
DROP TABLE IF EXISTS `shixinmingdan`;
CREATE TABLE `shixinmingdan`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yonghuming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `yuyueshixincishu` int(0) NULL DEFAULT NULL COMMENT '预约失信次数',
  `shifoujinyong` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '是否禁用',
  `riqi` date NULL DEFAULT NULL COMMENT '日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 107 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '失信名单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shixinmingdan
-- ----------------------------
INSERT INTO `shixinmingdan` VALUES (101, '2021-04-19 22:21:21', '用户名1', '姓名1', 1, '已禁用', '2021-04-19');
INSERT INTO `shixinmingdan` VALUES (102, '2021-04-19 22:21:21', '用户名2', '姓名2', 2, '已禁用', '2021-04-19');
INSERT INTO `shixinmingdan` VALUES (103, '2021-04-19 22:21:21', '用户名3', '姓名3', 3, '已禁用', '2021-04-19');
INSERT INTO `shixinmingdan` VALUES (104, '2021-04-19 22:21:21', '用户名4', '姓名4', 4, '已禁用', '2021-04-19');
INSERT INTO `shixinmingdan` VALUES (105, '2021-04-19 22:21:21', '用户名5', '姓名5', 5, '已禁用', '2021-04-19');
INSERT INTO `shixinmingdan` VALUES (106, '2021-04-19 22:21:21', '用户名6', '姓名6', 6, '已禁用', '2021-04-19');

-- ----------------------------
-- Table structure for token
-- ----------------------------
DROP TABLE IF EXISTS `token`;
CREATE TABLE `token`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(0) NOT NULL COMMENT '用户id',
  `username` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户名',
  `tablename` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '表名',
  `role` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '角色',
  `token` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '密码',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '新增时间',
  `expiratedtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '过期时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = 'token表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of token
-- ----------------------------
INSERT INTO `token` VALUES (1, 1, 'abo', 'users', '管理员', 'mdewwe3hpibumnac6qne7r115ofhz2m0', '2022-08-09 22:12:35', '2022-08-10 21:07:49');
INSERT INTO `token` VALUES (2, 1660054484969, 'user', 'yonghu', '用户', 'noj3wh2s421tutl2yo3mlzqgvmhunyvr', '2022-08-09 22:14:57', '2022-08-10 20:40:54');
INSERT INTO `token` VALUES (3, 11, '用户1', 'yonghu', '用户', '8gpkdf1qwuxo7ajxzkqlq8at3fblpefu', '2022-08-09 22:18:00', '2022-08-09 23:18:26');
INSERT INTO `token` VALUES (4, 21, '医生1', 'yisheng', '医生', '5lslcs5qz4ypttt6812u5vunp3ecbsdm', '2022-08-09 22:20:54', '2022-08-09 23:20:54');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '密码',
  `role` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '新增时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'abo', 'abo', '管理员', '2021-04-19 22:21:21');

-- ----------------------------
-- Table structure for yisheng
-- ----------------------------
DROP TABLE IF EXISTS `yisheng`;
CREATE TABLE `yisheng`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yishenggonghao` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '医生工号',
  `mima` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '密码',
  `yishengxingming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医生姓名',
  `suoshuyiyuan` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '所属医院',
  `keshi` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '科室',
  `zhicheng` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '职称',
  `xingbie` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '头像',
  `lianxidianhua` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `yishengxiangqing` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '医生详情',
  `sfsh` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '审核回复',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `yishenggonghao`(`yishenggonghao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '医生' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yisheng
-- ----------------------------
INSERT INTO `yisheng` VALUES (21, '2021-04-19 22:21:21', '医生1', '123456', '医生姓名1', '所属医院1', '科室1', '职称1', '男', 'http://localhost:8080/springbootweb/upload/yisheng_touxiang1.jpg', '13823888881', '医生详情1', '是', '');
INSERT INTO `yisheng` VALUES (22, '2021-04-19 22:21:21', '医生2', '123456', '医生姓名2', '所属医院2', '科室2', '职称2', '男', 'http://localhost:8080/springbootweb/upload/yisheng_touxiang2.jpg', '13823888882', '医生详情2', '是', '');
INSERT INTO `yisheng` VALUES (23, '2021-04-19 22:21:21', '医生3', '123456', '医生姓名3', '所属医院3', '科室3', '职称3', '男', 'http://localhost:8080/springbootweb/upload/yisheng_touxiang3.jpg', '13823888883', '医生详情3', '是', '');
INSERT INTO `yisheng` VALUES (24, '2021-04-19 22:21:21', '医生4', '123456', '医生姓名4', '所属医院4', '科室4', '职称4', '男', 'http://localhost:8080/springbootweb/upload/yisheng_touxiang4.jpg', '13823888884', '医生详情4', '是', '');
INSERT INTO `yisheng` VALUES (25, '2021-04-19 22:21:21', '医生5', '123456', '医生姓名5', '所属医院5', '科室5', '职称5', '男', 'http://localhost:8080/springbootweb/upload/yisheng_touxiang5.jpg', '13823888885', '医生详情5', '是', '');
INSERT INTO `yisheng` VALUES (26, '2021-04-19 22:21:21', '医生6', '123456', '医生姓名6', '所属医院6', '科室6', '职称6', '男', 'http://localhost:8080/springbootweb/upload/yisheng_touxiang6.jpg', '13823888886', '医生详情6', '是', '');

-- ----------------------------
-- Table structure for yishengxinxi
-- ----------------------------
DROP TABLE IF EXISTS `yishengxinxi`;
CREATE TABLE `yishengxinxi`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yishenggonghao` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '医生工号',
  `yishengxingming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医生姓名',
  `suoshuyiyuan` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '所属医院',
  `keshi` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '科室',
  `zhicheng` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '职称',
  `touxiang` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '头像',
  `lianxidianhua` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `yishengxiangqing` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '医生详情',
  `shanzhangjibing` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '擅长疾病',
  `guahaoxuzhi` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '挂号须知',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `yishenggonghao`(`yishenggonghao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 77 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '医生信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yishengxinxi
-- ----------------------------
INSERT INTO `yishengxinxi` VALUES (71, '2021-04-19 22:21:21', '医生工号1', '医生姓名1', '所属医院1', '科室1', '职称1', 'http://localhost:8080/springbootweb/upload/yishengxinxi_touxiang1.jpg', '13823888881', '医生详情1', '擅长疾病1', '挂号须知1');
INSERT INTO `yishengxinxi` VALUES (72, '2021-04-19 22:21:21', '医生工号2', '医生姓名2', '所属医院2', '科室2', '职称2', 'http://localhost:8080/springbootweb/upload/yishengxinxi_touxiang2.jpg', '13823888882', '医生详情2', '擅长疾病2', '挂号须知2');
INSERT INTO `yishengxinxi` VALUES (73, '2021-04-19 22:21:21', '医生工号3', '医生姓名3', '所属医院3', '科室3', '职称3', 'http://localhost:8080/springbootweb/upload/yishengxinxi_touxiang3.jpg', '13823888883', '医生详情3', '擅长疾病3', '挂号须知3');
INSERT INTO `yishengxinxi` VALUES (74, '2021-04-19 22:21:21', '医生工号4', '医生姓名4', '所属医院4', '科室4', '职称4', 'http://localhost:8080/springbootweb/upload/yishengxinxi_touxiang4.jpg', '13823888884', '医生详情4', '擅长疾病4', '挂号须知4');
INSERT INTO `yishengxinxi` VALUES (75, '2021-04-19 22:21:21', '医生工号5', '医生姓名5', '所属医院5', '科室5', '职称5', 'http://localhost:8080/springbootweb/upload/yishengxinxi_touxiang5.jpg', '13823888885', '医生详情5', '擅长疾病5', '挂号须知5');
INSERT INTO `yishengxinxi` VALUES (76, '2021-04-19 22:21:21', '医生工号6', '医生姓名6', '所属医院6', '科室6', '职称6', 'http://localhost:8080/springbootweb/upload/yishengxinxi_touxiang6.jpg', '13823888886', '医生详情6', '擅长疾病6', '挂号须知6');

-- ----------------------------
-- Table structure for yiyuanxinxi
-- ----------------------------
DROP TABLE IF EXISTS `yiyuanxinxi`;
CREATE TABLE `yiyuanxinxi`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yiyuanzhanghao` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '医院账号',
  `yiyuanmingcheng` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医院名称',
  `tesekeshi` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '特色科室',
  `zhuanjia` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '专家',
  `yiyuantupian` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医院图片',
  `yiyuandizhi` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医院地址',
  `lianxidianhua` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `yingyeshijian` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '营业时间',
  `xiangxijieshao` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '详细介绍',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '医院信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yiyuanxinxi
-- ----------------------------
INSERT INTO `yiyuanxinxi` VALUES (41, '2021-04-19 22:21:21', '医院账号1', '医院名称1', '特色科室1', '专家1', 'http://localhost:8080/springbootweb/upload/yiyuanxinxi_yiyuantupian1.jpg', '医院地址1', '13823888881', '营业时间1', '详细介绍1');
INSERT INTO `yiyuanxinxi` VALUES (42, '2021-04-19 22:21:21', '医院账号2', '医院名称2', '特色科室2', '专家2', 'http://localhost:8080/springbootweb/upload/yiyuanxinxi_yiyuantupian2.jpg', '医院地址2', '13823888882', '营业时间2', '详细介绍2');
INSERT INTO `yiyuanxinxi` VALUES (43, '2021-04-19 22:21:21', '医院账号3', '医院名称3', '特色科室3', '专家3', 'http://localhost:8080/springbootweb/upload/yiyuanxinxi_yiyuantupian3.jpg', '医院地址3', '13823888883', '营业时间3', '详细介绍3');
INSERT INTO `yiyuanxinxi` VALUES (44, '2021-04-19 22:21:21', '医院账号4', '医院名称4', '特色科室4', '专家4', 'http://localhost:8080/springbootweb/upload/yiyuanxinxi_yiyuantupian4.jpg', '医院地址4', '13823888884', '营业时间4', '详细介绍4');
INSERT INTO `yiyuanxinxi` VALUES (45, '2021-04-19 22:21:21', '医院账号5', '医院名称5', '特色科室5', '专家5', 'http://localhost:8080/springbootweb/upload/yiyuanxinxi_yiyuantupian5.jpg', '医院地址5', '13823888885', '营业时间5', '详细介绍5');
INSERT INTO `yiyuanxinxi` VALUES (46, '2021-04-19 22:21:21', '医院账号6', '医院名称6', '特色科室6', '专家6', 'http://localhost:8080/springbootweb/upload/yiyuanxinxi_yiyuantupian6.jpg', '医院地址6', '13823888886', '营业时间6', '详细介绍6');

-- ----------------------------
-- Table structure for yonghu
-- ----------------------------
DROP TABLE IF EXISTS `yonghu`;
CREATE TABLE `yonghu`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yonghuming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户名',
  `mima` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '密码',
  `xingming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '性别',
  `nianling` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `shouji` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `shenfenzhenghao` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '身份证号',
  `dizhi` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '地址',
  `zhaopian` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `yonghuming`(`yonghuming`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1660054484970 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yonghu
-- ----------------------------
INSERT INTO `yonghu` VALUES (11, '2021-04-19 22:21:21', '用户1', '123456', '姓名1', '男', 1, '13823888881', '773890001@qq.com', '440300199101010001', '地址1', 'http://localhost:8080/springbootweb/upload/yonghu_zhaopian1.jpg');
INSERT INTO `yonghu` VALUES (12, '2021-04-19 22:21:21', '用户2', '123456', '姓名2', '男', 2, '13823888882', '773890002@qq.com', '440300199202020002', '地址2', 'http://localhost:8080/springbootweb/upload/yonghu_zhaopian2.jpg');
INSERT INTO `yonghu` VALUES (13, '2021-04-19 22:21:21', '用户3', '123456', '姓名3', '男', 3, '13823888883', '773890003@qq.com', '440300199303030003', '地址3', 'http://localhost:8080/springbootweb/upload/yonghu_zhaopian3.jpg');
INSERT INTO `yonghu` VALUES (14, '2021-04-19 22:21:21', '用户4', '123456', '姓名4', '男', 4, '13823888884', '773890004@qq.com', '440300199404040004', '地址4', 'http://localhost:8080/springbootweb/upload/yonghu_zhaopian4.jpg');
INSERT INTO `yonghu` VALUES (15, '2021-04-19 22:21:21', '用户5', '123456', '姓名5', '男', 5, '13823888885', '773890005@qq.com', '440300199505050005', '地址5', 'http://localhost:8080/springbootweb/upload/yonghu_zhaopian5.jpg');
INSERT INTO `yonghu` VALUES (16, '2021-04-19 22:21:21', '用户6', '123456', '姓名6', '男', 6, '13823888886', '773890006@qq.com', '440300199606060006', '地址6', 'http://localhost:8080/springbootweb/upload/yonghu_zhaopian6.jpg');
INSERT INTO `yonghu` VALUES (1660054484969, '2022-08-09 22:14:44', 'user', '123456', 'ch', NULL, 18, '18088888888', '891247967@qq.com', '413026199605155741', '5555', NULL);

-- ----------------------------
-- Table structure for zaixianwenzhen
-- ----------------------------
DROP TABLE IF EXISTS `zaixianwenzhen`;
CREATE TABLE `zaixianwenzhen`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yishenggonghao` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医生工号',
  `yishengxingming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '医生姓名',
  `suoshuyiyuan` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '所属医院',
  `keshi` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '科室',
  `yonghuming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `xiangguantupian` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '相关图片',
  `wenzhenqingkuang` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '问诊情况',
  `userid` bigint(0) NULL DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 117 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '在线问诊' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of zaixianwenzhen
-- ----------------------------
INSERT INTO `zaixianwenzhen` VALUES (111, '2021-04-19 22:21:21', '医生工号1', '医生姓名1', '所属医院1', '科室1', '用户名1', '姓名1', 'http://localhost:8080/springbootweb/upload/zaixianwenzhen_xiangguantupian1.jpg', '问诊情况1', 1);
INSERT INTO `zaixianwenzhen` VALUES (112, '2021-04-19 22:21:21', '医生工号2', '医生姓名2', '所属医院2', '科室2', '用户名2', '姓名2', 'http://localhost:8080/springbootweb/upload/zaixianwenzhen_xiangguantupian2.jpg', '问诊情况2', 2);
INSERT INTO `zaixianwenzhen` VALUES (113, '2021-04-19 22:21:21', '医生工号3', '医生姓名3', '所属医院3', '科室3', '用户名3', '姓名3', 'http://localhost:8080/springbootweb/upload/zaixianwenzhen_xiangguantupian3.jpg', '问诊情况3', 3);
INSERT INTO `zaixianwenzhen` VALUES (114, '2021-04-19 22:21:21', '医生工号4', '医生姓名4', '所属医院4', '科室4', '用户名4', '姓名4', 'http://localhost:8080/springbootweb/upload/zaixianwenzhen_xiangguantupian4.jpg', '问诊情况4', 4);
INSERT INTO `zaixianwenzhen` VALUES (115, '2021-04-19 22:21:21', '医生工号5', '医生姓名5', '所属医院5', '科室5', '用户名5', '姓名5', 'http://localhost:8080/springbootweb/upload/zaixianwenzhen_xiangguantupian5.jpg', '问诊情况5', 5);
INSERT INTO `zaixianwenzhen` VALUES (116, '2021-04-19 22:21:21', '医生工号6', '医生姓名6', '所属医院6', '科室6', '用户名6', '姓名6', 'http://localhost:8080/springbootweb/upload/zaixianwenzhen_xiangguantupian6.jpg', '问诊情况6', 6);

SET FOREIGN_KEY_CHECKS = 1;

-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmji1s8
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `ssmji1s8`
--

/*!40000 DROP DATABASE IF EXISTS `ssmji1s8`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssmji1s8` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssmji1s8`;

--
-- Table structure for table `banjitaolun`
--

DROP TABLE IF EXISTS `banjitaolun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banjitaolun` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `neirong` longtext COMMENT '内容',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `fengmian` longtext COMMENT '封面',
  `laoshizhanghao` varchar(200) DEFAULT NULL COMMENT '老师账号',
  `laoshixingming` varchar(200) DEFAULT NULL COMMENT '老师姓名',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684037629165 DEFAULT CHARSET=utf8 COMMENT='班级讨论';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banjitaolun`
--

LOCK TABLES `banjitaolun` WRITE;
/*!40000 ALTER TABLE `banjitaolun` DISABLE KEYS */;
INSERT INTO `banjitaolun` VALUES (141,'2023-05-14 04:09:11','标题1','班级1','内容1','2023-05-14 12:09:11','upload/banjitaolun_fengmian1.jpg,upload/banjitaolun_fengmian2.jpg,upload/banjitaolun_fengmian3.jpg','老师账号1','老师姓名1',1,1,'2023-05-16 13:35:36',2),(142,'2023-05-14 04:09:11','标题2','班级2','内容2','2023-05-14 12:09:11','upload/banjitaolun_fengmian2.jpg,upload/banjitaolun_fengmian3.jpg,upload/banjitaolun_fengmian4.jpg','老师账号2','老师姓名2',2,2,'2023-05-14 12:15:12',3),(143,'2023-05-14 04:09:11','标题3','班级3','内容3','2023-05-14 12:09:11','upload/banjitaolun_fengmian3.jpg,upload/banjitaolun_fengmian4.jpg,upload/banjitaolun_fengmian5.jpg','老师账号3','老师姓名3',3,3,'2023-05-14 12:09:11',3),(144,'2023-05-14 04:09:11','标题4','班级4','内容4','2023-05-14 12:09:11','upload/banjitaolun_fengmian4.jpg,upload/banjitaolun_fengmian5.jpg,upload/banjitaolun_fengmian6.jpg','老师账号4','老师姓名4',5,4,'2023-05-16 13:39:30',5),(145,'2023-05-14 04:09:11','标题5','班级5','内容5','2023-05-14 12:09:11','upload/banjitaolun_fengmian5.jpg,upload/banjitaolun_fengmian6.jpg,upload/banjitaolun_fengmian7.jpg','老师账号5','老师姓名5',5,5,'2023-05-14 12:09:11',5),(146,'2023-05-14 04:09:11','标题6','班级6','内容6','2023-05-14 12:09:11','upload/banjitaolun_fengmian6.jpg,upload/banjitaolun_fengmian7.jpg,upload/banjitaolun_fengmian8.jpg','老师账号6','老师姓名6',6,6,'2023-05-14 12:10:36',7),(147,'2023-05-14 04:09:11','标题7','班级7','内容7','2023-05-14 12:09:11','upload/banjitaolun_fengmian7.jpg,upload/banjitaolun_fengmian8.jpg,upload/banjitaolun_fengmian9.jpg','老师账号7','老师姓名7',7,7,'2023-05-14 12:09:11',7),(148,'2023-05-14 04:09:11','标题8','班级8','内容8','2023-05-14 12:09:11','upload/banjitaolun_fengmian8.jpg,upload/banjitaolun_fengmian9.jpg,upload/banjitaolun_fengmian10.jpg','老师账号8','老师姓名8',8,8,'2023-05-14 12:09:11',8),(1684037629164,'2023-05-14 04:13:48','第2班级套路','2班','<p>新闻 ，是指报纸、电台、电视台、互联网等媒体经常使用的记录与传播信息的 一种文体。是记录社会、传播信息、反映时代的一种文体。新闻概念有广义与狭义之分。广义上:除了发表于报刊、广播、互联网、电视上的评论与专文外的常用文本都属于新闻，包括消息、通讯、特写、速写(有的将速写纳入特写之列)等等; 狭义上:消息是用概括的叙述方式，以较简明扼要的文字，迅速及时地报道附近新近发生的、有价值的事实，使一定人群了解。新闻一般包括标题、导语、主体、背景和结语五部分。前三者是主要部分，后二者是辅助部分。写法以叙述为主兼或有议论、描写、评论等。新闻是包含海量资讯的新闻服务平台,真实反映每时每刻的重要事件。您可以搜索新闻事件、热点话题、人物动态、产品资讯等,快速了解它们的最新进展。</p><p><br></p>','2023-05-14 12:13:33','upload/1684037627028.jpg','22','回家',1,0,'2023-05-14 12:21:22',3);
/*!40000 ALTER TABLE `banjitaolun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banjixinxi`
--

DROP TABLE IF EXISTS `banjixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banjixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `banjirenshu` int(11) DEFAULT NULL COMMENT '班级人数',
  `banjiweizhi` varchar(200) DEFAULT NULL COMMENT '班级位置',
  `banjixuesheng` longtext COMMENT '班级学生',
  `laoshizhanghao` varchar(200) DEFAULT NULL COMMENT '老师账号',
  `laoshixingming` varchar(200) DEFAULT NULL COMMENT '老师姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684037524981 DEFAULT CHARSET=utf8 COMMENT='班级信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banjixinxi`
--

LOCK TABLES `banjixinxi` WRITE;
/*!40000 ALTER TABLE `banjixinxi` DISABLE KEYS */;
INSERT INTO `banjixinxi` VALUES (31,'2023-05-14 04:09:11','班级1',1,'班级位置1','班级学生1','老师账号1','老师姓名1'),(32,'2023-05-14 04:09:11','班级2',2,'班级位置2','班级学生2','老师账号2','老师姓名2'),(33,'2023-05-14 04:09:11','班级3',3,'班级位置3','班级学生3','老师账号3','老师姓名3'),(34,'2023-05-14 04:09:11','班级4',4,'班级位置4','班级学生4','老师账号4','老师姓名4'),(35,'2023-05-14 04:09:11','班级5',5,'班级位置5','班级学生5','老师账号5','老师姓名5'),(36,'2023-05-14 04:09:11','班级6',6,'班级位置6','班级学生6','老师账号6','老师姓名6'),(37,'2023-05-14 04:09:11','班级7',7,'班级位置7','班级学生7','老师账号7','老师姓名7'),(38,'2023-05-14 04:09:11','班级8',8,'班级位置8','班级学生8','老师账号8','老师姓名8'),(1684037524980,'2023-05-14 04:12:04','2班',30,'是的方法是的发送','<p>新闻 ，是指报纸、电台、电视台、互联网等媒体经常使用的记录与传播信息的 一种文体。是记录社会、传播信息、反映时代的一种文体。新闻概念有广义与狭义之分。广义上:除了发表于报刊、广播、互联网、电视上的评论与专文外的常用文本都属于新闻，包括消息、通讯、特写、速写(有的将速写纳入特写之列)等等; 狭义上:消息是用概括的叙述方式，以较简明扼要的文字，迅速及时地报道附近新近发生的、有价值的事实，使一定人群了解。新闻一般包括标题、导语、主体、背景和结语五部分。前三者是主要部分，后二者是辅助部分。写法以叙述为主兼或有议论、描写、评论等。新闻是包含海量资讯的新闻服务平台,真实反映每时每刻的重要事件。您可以搜索新闻事件、热点话题、人物动态、产品资讯等,快速了解它们的最新进展。</p><p>新闻 ，是指报纸、电台、电视台、互联网等媒体经常使用的记录与传播信息的 一种文体。是记录社会、传播信息、反映时代的一种文体。新闻概念有广义与狭义之分。广义上:除了发表于报刊、广播、互联网、电视上的评论与专文外的常用文本都属于新闻，包括消息、通讯、特写、速写(有的将速写纳入特写之列)等等; 狭义上:消息是用概括的叙述方式，以较简明扼要的文字，迅速及时地报道附近新近发生的、有价值的事实，使一定人群了解。新闻一般包括标题、导语、主体、背景和结语五部分。前三者是主要部分，后二者是辅助部分。写法以叙述为主兼或有议论、描写、评论等。新闻是包含海量资讯的新闻服务平台,真实反映每时每刻的重要事件。您可以搜索新闻事件、热点话题、人物动态、产品资讯等,快速了解它们的最新进展。</p><p><br></p>','22','回家');
/*!40000 ALTER TABLE `banjixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `baogaozhanshi`
--

DROP TABLE IF EXISTS `baogaozhanshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baogaozhanshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shiyanmingcheng` varchar(200) DEFAULT NULL COMMENT '实验名称',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `shiyanbaogao` longtext COMMENT '实验报告',
  `shiyanguocheng` longtext COMMENT '实验过程',
  `shiyanjieguo` longtext COMMENT '实验结果',
  `shiyanzongjie` longtext COMMENT '实验总结',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `laoshizhanghao` varchar(200) DEFAULT NULL COMMENT '老师账号',
  `laoshixingming` varchar(200) DEFAULT NULL COMMENT '老师姓名',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684037888908 DEFAULT CHARSET=utf8 COMMENT='报告展示';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baogaozhanshi`
--

LOCK TABLES `baogaozhanshi` WRITE;
/*!40000 ALTER TABLE `baogaozhanshi` DISABLE KEYS */;
INSERT INTO `baogaozhanshi` VALUES (71,'2023-05-14 04:09:11','实验名称1','班级1','','实验过程1','实验结果1','实验总结1','2023-05-14 12:09:11','老师账号1','老师姓名1','学号1','姓名1'),(72,'2023-05-14 04:09:11','实验名称2','班级2','','实验过程2','实验结果2','实验总结2','2023-05-14 12:09:11','老师账号2','老师姓名2','学号2','姓名2'),(73,'2023-05-14 04:09:11','实验名称3','班级3','','实验过程3','实验结果3','实验总结3','2023-05-14 12:09:11','老师账号3','老师姓名3','学号3','姓名3'),(74,'2023-05-14 04:09:11','实验名称4','班级4','','实验过程4','实验结果4','实验总结4','2023-05-14 12:09:11','老师账号4','老师姓名4','学号4','姓名4'),(75,'2023-05-14 04:09:11','实验名称5','班级5','','实验过程5','实验结果5','实验总结5','2023-05-14 12:09:11','老师账号5','老师姓名5','学号5','姓名5'),(76,'2023-05-14 04:09:11','实验名称6','班级6','','实验过程6','实验结果6','实验总结6','2023-05-14 12:09:11','老师账号6','老师姓名6','学号6','姓名6'),(77,'2023-05-14 04:09:11','实验名称7','班级7','','实验过程7','实验结果7','实验总结7','2023-05-14 12:09:11','老师账号7','老师姓名7','学号7','姓名7'),(78,'2023-05-14 04:09:11','实验名称8','班级8','','实验过程8','实验结果8','实验总结8','2023-05-14 12:09:11','老师账号8','老师姓名8','学号8','姓名8'),(1684037888907,'2023-05-14 04:18:08','第一实验','2班','upload/1684037739025.doc','新闻是互联网等媒体经常使用的记录的一种文体。','<p>新闻 ，是指报纸、电台、电视台、互联网等媒体经常使用的记录与传播信息的 一种文体。是记录社会、传播信息、反映时代的一种文体。新闻概念有广义与狭义之分。广义上:除了发表于报刊、广播、互联网、电视上的评论与专文外的常用文本都属于新闻，包括消息、通讯、特写、速写(有的将速写纳入特写之列)等等; 狭义上:消息是用概括的叙述方式，以较简明扼要的文字，迅速及时地报道附近新近发生的、有价值的事实，使一定人群了解。新闻一般包括标题、导语、主体、背景和结语五部分。前三者是主要部分，后二者是辅助部分。写法以叙述为主兼或有议论、描写、评论等。新闻是包含海量资讯的新闻服务平台,真实反映每时每刻的重要事件。您可以搜索新闻事件、热点话题、人物动态、产品资讯等,快速了解它们的最新进展。</p>','<p>新闻 ，是指报纸、电台、电视台、互联网等媒体经常使用的记录与传播信息的 一种文体。是记录社会、传播信息、反映时代的一种文体。新闻概念有广义与狭义之分。广义上:除了发表于报刊、广播、互联网、电视上的评论与专文外的常用文本都属于新闻，包括消息、通讯、特写、速写(有的将速写纳入特写之列)等等; 狭义上:消息是用概括的叙述方式，以较简明扼要的文字，迅速及时地报道附近新近发生的、有价值的事实，使一定人群了解。新闻一般包括标题、导语、主体、背景和结语五部分。前三者是主要部分，后二者是辅助部分。写法以叙述为主兼或有议论、描写、评论等。新闻是包含海量资讯的新闻服务平台,真实反映每时每刻的重要事件。您可以搜索新闻事件、热点话题、人物动态、产品资讯等,快速了解它们的最新进展。</p>','2023-05-14 12:18:04','22','回家','11','水电费');
/*!40000 ALTER TABLE `baogaozhanshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/1684037691819.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussbanjitaolun`
--

DROP TABLE IF EXISTS `discussbanjitaolun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussbanjitaolun` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COMMENT '头像',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684215578595 DEFAULT CHARSET=utf8 COMMENT='班级讨论评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussbanjitaolun`
--

LOCK TABLES `discussbanjitaolun` WRITE;
/*!40000 ALTER TABLE `discussbanjitaolun` DISABLE KEYS */;
INSERT INTO `discussbanjitaolun` VALUES (1684037781901,'2023-05-14 04:16:20',1684037629164,1684037457331,'upload/1684037456365.jpg','11','是的发送到334','是的发送到发送到佛挡杀佛是的发送到发送到发送到'),(1684215344806,'2023-05-16 05:35:44',141,1684215255275,'upload/1684215241644.png','11111','111',NULL),(1684215578594,'2023-05-16 05:39:38',144,1684215255275,'upload/1684215241644.png','11111','111',NULL);
/*!40000 ALTER TABLE `discussbanjitaolun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exampaper`
--

DROP TABLE IF EXISTS `exampaper`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exampaper` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `name` varchar(200) NOT NULL COMMENT '实验题目名称',
  `time` int(11) NOT NULL COMMENT '考试时长(分钟)',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '实验题目状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684217893302 DEFAULT CHARSET=utf8 COMMENT='实验题目表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exampaper`
--

LOCK TABLES `exampaper` WRITE;
/*!40000 ALTER TABLE `exampaper` DISABLE KEYS */;
INSERT INTO `exampaper` VALUES (1,'2023-05-14 04:09:11','十万个为什么',60,1),(1684037637242,'2023-05-14 04:13:56','第一实验题目',22,1),(1684217893301,'2023-05-16 06:18:12','11',60,1);
/*!40000 ALTER TABLE `exampaper` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `examquestion`
--

DROP TABLE IF EXISTS `examquestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `examquestion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `paperid` bigint(20) NOT NULL COMMENT '所属实验题目id（外键）',
  `papername` varchar(200) NOT NULL COMMENT '实验题目名称',
  `questionname` varchar(200) NOT NULL COMMENT '试题名称',
  `options` longtext COMMENT '选项，json字符串',
  `score` bigint(20) DEFAULT '0' COMMENT '分值',
  `answer` varchar(200) DEFAULT NULL COMMENT '正确答案',
  `analysis` longtext COMMENT '答案解析',
  `type` bigint(20) DEFAULT '0' COMMENT '试题类型，0：单选题 1：多选题 2：判断题 3：填空题（暂不考虑多项填空）',
  `sequence` bigint(20) DEFAULT '100' COMMENT '试题排序，值越大排越前面',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684037655138 DEFAULT CHARSET=utf8 COMMENT='试题表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `examquestion`
--

LOCK TABLES `examquestion` WRITE;
/*!40000 ALTER TABLE `examquestion` DISABLE KEYS */;
INSERT INTO `examquestion` VALUES (1,'2023-05-14 04:09:11',1,'十万个为什么','下面动物不属于昆虫的是（）。','[{\"text\":\"A.苍蝇\",\"code\":\"A\"},{\"text\":\"B.蜜蜂\",\"code\":\"B\"},{\"text\":\"C.蜂鸟\",\"code\":\"C\"}]',20,'C','蜂鸟',0,1),(2,'2023-05-14 04:09:11',1,'十万个为什么','油着火后可以用水扑灭。','[{\"text\":\"A.对\",\"code\":\"A\"},{\"text\":\"B.错\",\"code\":\"B\"}]',20,'B','油着火后不可以用水扑灭',2,2),(3,'2023-05-14 04:09:11',1,'十万个为什么','地球是个球体，中间是（ ）。','[]',30,'赤道','赤道',3,3),(4,'2023-05-14 04:09:11',1,'十万个为什么','下面动物中会流汗的有（ ）。','[{\"text\":\"A.马\",\"code\":\"A\"},{\"text\":\"B.猫\",\"code\":\"B\"},{\"text\":\"C.狗\",\"code\":\"C\"}]',30,'A,B','狗不会流汗',1,4),(1684037646596,'2023-05-14 04:14:06',1684037637242,'第一实验题目','是的发送发送到','[{\"text\":\"A.对\",\"code\":\"A\"},{\"text\":\"B.错\",\"code\":\"B\"}]',3,'B','是的防守打法是的',2,1),(1684037655137,'2023-05-14 04:14:14',1684037637242,'第一实验题目','是的发送到发送到','[]',3,'是的发送到','是的发送到',3,2);
/*!40000 ALTER TABLE `examquestion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `examrecord`
--

DROP TABLE IF EXISTS `examrecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `examrecord` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `paperid` bigint(20) NOT NULL COMMENT '实验题目id（外键）',
  `papername` varchar(200) NOT NULL COMMENT '实验题目名称',
  `questionid` bigint(20) NOT NULL COMMENT '试题id（外键）',
  `questionname` varchar(200) NOT NULL COMMENT '试题名称',
  `options` longtext COMMENT '选项，json字符串',
  `score` bigint(20) DEFAULT '0' COMMENT '分值',
  `answer` varchar(200) DEFAULT NULL COMMENT '正确答案',
  `analysis` longtext COMMENT '答案解析',
  `myscore` bigint(20) NOT NULL DEFAULT '0' COMMENT '试题得分',
  `myanswer` varchar(200) DEFAULT NULL COMMENT '考生答案',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684037800673 DEFAULT CHARSET=utf8 COMMENT='考试记录表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `examrecord`
--

LOCK TABLES `examrecord` WRITE;
/*!40000 ALTER TABLE `examrecord` DISABLE KEYS */;
INSERT INTO `examrecord` VALUES (1684037788927,'2023-05-14 04:16:28',1684037457331,'水电费',1,'十万个为什么',1,'下面动物不属于昆虫的是（）。','[{\"text\":\"A.苍蝇\",\"code\":\"A\"},{\"text\":\"B.蜜蜂\",\"code\":\"B\"},{\"text\":\"C.蜂鸟\",\"code\":\"C\"}]',20,'C','蜂鸟',0,'B'),(1684037790532,'2023-05-14 04:16:30',1684037457331,'水电费',1,'十万个为什么',2,'油着火后可以用水扑灭。','[{\"text\":\"A.对\",\"code\":\"A\"},{\"text\":\"B.错\",\"code\":\"B\"}]',20,'B','油着火后不可以用水扑灭',20,'B'),(1684037792459,'2023-05-14 04:16:32',1684037457331,'水电费',1,'十万个为什么',3,'地球是个球体，中间是（ ）。','[]',30,'赤道','赤道',0,'是的发送到'),(1684037795000,'2023-05-14 04:16:34',1684037457331,'水电费',1,'十万个为什么',4,'下面动物中会流汗的有（ ）。','[{\"text\":\"A.马\",\"code\":\"A\"},{\"text\":\"B.猫\",\"code\":\"B\"},{\"text\":\"C.狗\",\"code\":\"C\"}]',30,'A,B','狗不会流汗',0,'B,C'),(1684037798220,'2023-05-14 04:16:38',1684037457331,'水电费',1684037637242,'第一实验题目',1684037646596,'是的发送发送到','[{\"text\":\"A.对\",\"code\":\"A\"},{\"text\":\"B.错\",\"code\":\"B\"}]',3,'B','是的防守打法是的',3,'B'),(1684037800672,'2023-05-14 04:16:39',1684037457331,'水电费',1684037637242,'第一实验题目',1684037655137,'是的发送到发送到','[]',3,'是的发送到','是的发送到',0,'是否是的');
/*!40000 ALTER TABLE `examrecord` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gonggaoxinxi`
--

DROP TABLE IF EXISTS `gonggaoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gonggaoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `jianjie` longtext COMMENT '简介',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `fengmian` longtext COMMENT '封面',
  `neirong` longtext COMMENT '内容',
  `laoshizhanghao` varchar(200) DEFAULT NULL COMMENT '老师账号',
  `laoshixingming` varchar(200) DEFAULT NULL COMMENT '老师姓名',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684037552535 DEFAULT CHARSET=utf8 COMMENT='公告信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gonggaoxinxi`
--

LOCK TABLES `gonggaoxinxi` WRITE;
/*!40000 ALTER TABLE `gonggaoxinxi` DISABLE KEYS */;
INSERT INTO `gonggaoxinxi` VALUES (41,'2023-05-14 04:09:11','标题1','班级1','简介1','2023-05-14','upload/gonggaoxinxi_fengmian1.jpg,upload/gonggaoxinxi_fengmian2.jpg,upload/gonggaoxinxi_fengmian3.jpg','内容1','老师账号1','老师姓名1','2023-05-16 13:36:41',2),(42,'2023-05-14 04:09:11','标题2','班级2','简介2','2023-05-14','upload/gonggaoxinxi_fengmian2.jpg,upload/gonggaoxinxi_fengmian3.jpg,upload/gonggaoxinxi_fengmian4.jpg','内容2','老师账号2','老师姓名2','2023-05-14 12:09:11',2),(43,'2023-05-14 04:09:11','标题3','班级3','简介3','2023-05-14','upload/gonggaoxinxi_fengmian3.jpg,upload/gonggaoxinxi_fengmian4.jpg,upload/gonggaoxinxi_fengmian5.jpg','内容3','老师账号3','老师姓名3','2023-05-14 12:09:11',3),(44,'2023-05-14 04:09:11','标题4','班级4','简介4','2023-05-14','upload/gonggaoxinxi_fengmian4.jpg,upload/gonggaoxinxi_fengmian5.jpg,upload/gonggaoxinxi_fengmian6.jpg','内容4','老师账号4','老师姓名4','2023-05-14 12:09:11',4),(45,'2023-05-14 04:09:11','标题5','班级5','简介5','2023-05-14','upload/gonggaoxinxi_fengmian5.jpg,upload/gonggaoxinxi_fengmian6.jpg,upload/gonggaoxinxi_fengmian7.jpg','内容5','老师账号5','老师姓名5','2023-05-14 12:09:11',5),(46,'2023-05-14 04:09:11','标题6','班级6','简介6','2023-05-14','upload/gonggaoxinxi_fengmian6.jpg,upload/gonggaoxinxi_fengmian7.jpg,upload/gonggaoxinxi_fengmian8.jpg','内容6','老师账号6','老师姓名6','2023-05-14 12:09:11',6),(47,'2023-05-14 04:09:11','标题7','班级7','简介7','2023-05-14','upload/gonggaoxinxi_fengmian7.jpg,upload/gonggaoxinxi_fengmian8.jpg,upload/gonggaoxinxi_fengmian9.jpg','内容7','老师账号7','老师姓名7','2023-05-14 12:09:11',7),(48,'2023-05-14 04:09:11','标题8','班级8','简介8','2023-05-14','upload/gonggaoxinxi_fengmian8.jpg,upload/gonggaoxinxi_fengmian9.jpg,upload/gonggaoxinxi_fengmian10.jpg','内容8','老师账号8','老师姓名8','2023-05-14 12:09:11',8),(1684037552534,'2023-05-14 04:12:32','是否是的','2班','新闻是互联网等媒体经常使用的记录的一种文体。','2023-05-14','upload/1684037546383.png','<p>新闻 ，是指报纸、电台、电视台、互联网等媒体经常使用的记录与传播信息的 一种文体。是记录社会、传播信息、反映时代的一种文体。新闻概念有广义与狭义之分。广义上:除了发表于报刊、广播、互联网、电视上的评论与专文外的常用文本都属于新闻，包括消息、通讯、特写、速写(有的将速写纳入特写之列)等等; 狭义上:消息是用概括的叙述方式，以较简明扼要的文字，迅速及时地报道附近新近发生的、有价值的事实，使一定人群了解。新闻一般包括标题、导语、主体、背景和结语五部分。前三者是主要部分，后二者是辅助部分。写法以叙述为主兼或有议论、描写、评论等。新闻是包含海量资讯的新闻服务平台,真实反映每时每刻的重要事件。您可以搜索新闻事件、热点话题、人物动态、产品资讯等,快速了解它们的最新进展。</p><p><img src=\"http://8.129.11.174:9032/ssmji1s8/upload/1684037551339.png\"></p>','22','回家','2023-05-14 12:16:44',3);
/*!40000 ALTER TABLE `gonggaoxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laoshi`
--

DROP TABLE IF EXISTS `laoshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laoshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `laoshizhanghao` varchar(200) NOT NULL COMMENT '老师账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `laoshixingming` varchar(200) NOT NULL COMMENT '老师姓名',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `touxiang` longtext COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `laoshizhanghao` (`laoshizhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1684037674763 DEFAULT CHARSET=utf8 COMMENT='老师';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laoshi`
--

LOCK TABLES `laoshi` WRITE;
/*!40000 ALTER TABLE `laoshi` DISABLE KEYS */;
INSERT INTO `laoshi` VALUES (21,'2023-05-14 04:09:11','老师账号1','123456','老师姓名1','年龄1','男','13823888881','班级1','upload/laoshi_touxiang1.jpg'),(22,'2023-05-14 04:09:11','老师账号2','123456','老师姓名2','年龄2','男','13823888882','班级2','upload/laoshi_touxiang2.jpg'),(23,'2023-05-14 04:09:11','老师账号3','123456','老师姓名3','年龄3','男','13823888883','班级3','upload/laoshi_touxiang3.jpg'),(24,'2023-05-14 04:09:11','老师账号4','123456','老师姓名4','年龄4','男','13823888884','班级4','upload/laoshi_touxiang4.jpg'),(25,'2023-05-14 04:09:11','老师账号5','123456','老师姓名5','年龄5','男','13823888885','班级5','upload/laoshi_touxiang5.jpg'),(26,'2023-05-14 04:09:11','老师账号6','123456','老师姓名6','年龄6','男','13823888886','班级6','upload/laoshi_touxiang6.jpg'),(27,'2023-05-14 04:09:11','老师账号7','123456','老师姓名7','年龄7','男','13823888887','班级7','upload/laoshi_touxiang7.jpg'),(28,'2023-05-14 04:09:11','老师账号8','123456','老师姓名8','年龄8','男','13823888888','班级8','upload/laoshi_touxiang8.jpg'),(1684037483431,'2023-05-14 04:11:23','22','22','回家','22','男','15111122548','2班','upload/1684037482439.jpg'),(1684037674762,'2023-05-14 04:14:34','22555','22555','时代','22','男','12111155511',NULL,NULL);
/*!40000 ALTER TABLE `laoshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiyanbaogao`
--

DROP TABLE IF EXISTS `shiyanbaogao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiyanbaogao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shiyanmingcheng` varchar(200) DEFAULT NULL COMMENT '实验名称',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `shiyanbaogao` longtext COMMENT '实验报告',
  `shiyanguocheng` longtext COMMENT '实验过程',
  `shiyanjieguo` longtext COMMENT '实验结果',
  `shiyanzongjie` longtext COMMENT '实验总结',
  `shangchuanshijian` datetime DEFAULT NULL COMMENT '上传时间',
  `laoshizhanghao` varchar(200) DEFAULT NULL COMMENT '老师账号',
  `laoshixingming` varchar(200) DEFAULT NULL COMMENT '老师姓名',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `crossuserid` bigint(20) DEFAULT NULL COMMENT '跨表用户id',
  `crossrefid` bigint(20) DEFAULT NULL COMMENT '跨表主键id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684037744720 DEFAULT CHARSET=utf8 COMMENT='实验报告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiyanbaogao`
--

LOCK TABLES `shiyanbaogao` WRITE;
/*!40000 ALTER TABLE `shiyanbaogao` DISABLE KEYS */;
INSERT INTO `shiyanbaogao` VALUES (61,'2023-05-14 04:09:11','实验名称1','班级1','','实验过程1','实验结果1','实验总结1','2023-05-14 12:09:11','老师账号1','老师姓名1','学号1','姓名1',1,1),(62,'2023-05-14 04:09:11','实验名称2','班级2','','实验过程2','实验结果2','实验总结2','2023-05-14 12:09:11','老师账号2','老师姓名2','学号2','姓名2',2,2),(63,'2023-05-14 04:09:11','实验名称3','班级3','','实验过程3','实验结果3','实验总结3','2023-05-14 12:09:11','老师账号3','老师姓名3','学号3','姓名3',3,3),(64,'2023-05-14 04:09:11','实验名称4','班级4','','实验过程4','实验结果4','实验总结4','2023-05-14 12:09:11','老师账号4','老师姓名4','学号4','姓名4',4,4),(65,'2023-05-14 04:09:11','实验名称5','班级5','','实验过程5','实验结果5','实验总结5','2023-05-14 12:09:11','老师账号5','老师姓名5','学号5','姓名5',5,5),(66,'2023-05-14 04:09:11','实验名称6','班级6','','实验过程6','实验结果6','实验总结6','2023-05-14 12:09:11','老师账号6','老师姓名6','学号6','姓名6',6,6),(67,'2023-05-14 04:09:11','实验名称7','班级7','','实验过程7','实验结果7','实验总结7','2023-05-14 12:09:11','老师账号7','老师姓名7','学号7','姓名7',7,7),(68,'2023-05-14 04:09:11','实验名称8','班级8','','实验过程8','实验结果8','实验总结8','2023-05-14 12:09:11','老师账号8','老师姓名8','学号8','姓名8',8,8),(1684037744719,'2023-05-14 04:15:43','第一实验','2班','upload/1684037739025.doc','新闻是互联网等媒体经常使用的记录的一种文体。','<p>新闻 ，是指报纸、电台、电视台、互联网等媒体经常使用的记录与传播信息的 一种文体。是记录社会、传播信息、反映时代的一种文体。新闻概念有广义与狭义之分。广义上:除了发表于报刊、广播、互联网、电视上的评论与专文外的常用文本都属于新闻，包括消息、通讯、特写、速写(有的将速写纳入特写之列)等等; 狭义上:消息是用概括的叙述方式，以较简明扼要的文字，迅速及时地报道附近新近发生的、有价值的事实，使一定人群了解。新闻一般包括标题、导语、主体、背景和结语五部分。前三者是主要部分，后二者是辅助部分。写法以叙述为主兼或有议论、描写、评论等。新闻是包含海量资讯的新闻服务平台,真实反映每时每刻的重要事件。您可以搜索新闻事件、热点话题、人物动态、产品资讯等,快速了解它们的最新进展。</p><p><br></p>','<p>新闻 ，是指报纸、电台、电视台、互联网等媒体经常使用的记录与传播信息的 一种文体。是记录社会、传播信息、反映时代的一种文体。新闻概念有广义与狭义之分。广义上:除了发表于报刊、广播、互联网、电视上的评论与专文外的常用文本都属于新闻，包括消息、通讯、特写、速写(有的将速写纳入特写之列)等等; 狭义上:消息是用概括的叙述方式，以较简明扼要的文字，迅速及时地报道附近新近发生的、有价值的事实，使一定人群了解。新闻一般包括标题、导语、主体、背景和结语五部分。前三者是主要部分，后二者是辅助部分。写法以叙述为主兼或有议论、描写、评论等。新闻是包含海量资讯的新闻服务平台,真实反映每时每刻的重要事件。您可以搜索新闻事件、热点话题、人物动态、产品资讯等,快速了解它们的最新进展。</p><p><br></p>','2023-05-14 12:15:34','22','回家','11','水电费',1684037457331,1684037577233);
/*!40000 ALTER TABLE `shiyanbaogao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiyanchengji`
--

DROP TABLE IF EXISTS `shiyanchengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiyanchengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shiyanmingcheng` varchar(200) DEFAULT NULL COMMENT '实验名称',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `laoshizhanghao` varchar(200) DEFAULT NULL COMMENT '老师账号',
  `laoshixingming` varchar(200) DEFAULT NULL COMMENT '老师姓名',
  `laoshipingfen` float DEFAULT NULL COMMENT '老师评分',
  `laoshibili` float DEFAULT NULL COMMENT '老师比例',
  `xueshengpingfen` float DEFAULT NULL COMMENT '学生评分',
  `xueshengbili` float DEFAULT NULL COMMENT '学生比例',
  `wanchenghuping` float DEFAULT NULL COMMENT '完成互评',
  `hupingbili` float DEFAULT NULL COMMENT '互评比例',
  `chengji` float DEFAULT NULL COMMENT '成绩',
  `pingyu` longtext COMMENT '评语',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  `crossuserid` bigint(20) DEFAULT NULL COMMENT '跨表用户id',
  `crossrefid` bigint(20) DEFAULT NULL COMMENT '跨表主键id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684037996565 DEFAULT CHARSET=utf8 COMMENT='实验成绩';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiyanchengji`
--

LOCK TABLES `shiyanchengji` WRITE;
/*!40000 ALTER TABLE `shiyanchengji` DISABLE KEYS */;
INSERT INTO `shiyanchengji` VALUES (91,'2023-05-14 04:09:11','实验名称1','班级1','学号1','姓名1','老师账号1','老师姓名1',1,1,1,1,1,1,1,'评语1','2023-05-14',1,1),(92,'2023-05-14 04:09:11','实验名称2','班级2','学号2','姓名2','老师账号2','老师姓名2',2,2,2,2,2,2,2,'评语2','2023-05-14',2,2),(93,'2023-05-14 04:09:11','实验名称3','班级3','学号3','姓名3','老师账号3','老师姓名3',3,3,3,3,3,3,3,'评语3','2023-05-14',3,3),(94,'2023-05-14 04:09:11','实验名称4','班级4','学号4','姓名4','老师账号4','老师姓名4',4,4,4,4,4,4,4,'评语4','2023-05-14',4,4),(95,'2023-05-14 04:09:11','实验名称5','班级5','学号5','姓名5','老师账号5','老师姓名5',5,5,5,5,5,5,5,'评语5','2023-05-14',5,5),(96,'2023-05-14 04:09:11','实验名称6','班级6','学号6','姓名6','老师账号6','老师姓名6',6,6,6,6,6,6,6,'评语6','2023-05-14',6,6),(97,'2023-05-14 04:09:11','实验名称7','班级7','学号7','姓名7','老师账号7','老师姓名7',7,7,7,7,7,7,7,'评语7','2023-05-14',7,7),(98,'2023-05-14 04:09:11','实验名称8','班级8','学号8','姓名8','老师账号8','老师姓名8',8,8,8,8,8,8,8,'评语8','2023-05-14',8,8),(1684037996564,'2023-05-14 04:19:56','第一实验','2班','11','水电费','22','回家',100,0.6,20,0.3,10,0.1,67,'新闻是互联网等媒体经常使用的记录的一种文体。','2023-05-14',1684037483431,1684037744719);
/*!40000 ALTER TABLE `shiyanchengji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiyancuijiao`
--

DROP TABLE IF EXISTS `shiyancuijiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiyancuijiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `neirong` longtext NOT NULL COMMENT '内容',
  `tixingshijian` datetime DEFAULT NULL COMMENT '提醒时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `laoshizhanghao` varchar(200) DEFAULT NULL COMMENT '老师账号',
  `laoshixingming` varchar(200) DEFAULT NULL COMMENT '老师姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684037595037 DEFAULT CHARSET=utf8 COMMENT='实验催缴';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiyancuijiao`
--

LOCK TABLES `shiyancuijiao` WRITE;
/*!40000 ALTER TABLE `shiyancuijiao` DISABLE KEYS */;
INSERT INTO `shiyancuijiao` VALUES (101,'2023-05-14 04:09:11','标题1','内容1','2023-05-14 12:09:11','学号1','姓名1','班级1','老师账号1','老师姓名1'),(102,'2023-05-14 04:09:11','标题2','内容2','2023-05-14 12:09:11','学号2','姓名2','班级2','老师账号2','老师姓名2'),(103,'2023-05-14 04:09:11','标题3','内容3','2023-05-14 12:09:11','学号3','姓名3','班级3','老师账号3','老师姓名3'),(104,'2023-05-14 04:09:11','标题4','内容4','2023-05-14 12:09:11','学号4','姓名4','班级4','老师账号4','老师姓名4'),(105,'2023-05-14 04:09:11','标题5','内容5','2023-05-14 12:09:11','学号5','姓名5','班级5','老师账号5','老师姓名5'),(106,'2023-05-14 04:09:11','标题6','内容6','2023-05-14 12:09:11','学号6','姓名6','班级6','老师账号6','老师姓名6'),(107,'2023-05-14 04:09:11','标题7','内容7','2023-05-14 12:09:11','学号7','姓名7','班级7','老师账号7','老师姓名7'),(108,'2023-05-14 04:09:11','标题8','内容8','2023-05-14 12:09:11','学号8','姓名8','班级8','老师账号8','老师姓名8'),(1684037595036,'2023-05-14 04:13:14','你要教实验报告了333333','<p>新闻 ，是指报纸、电台、电视台、互联网等媒体经常使用的记录与传播信息的 一种文体。是记录社会、传播信息、反映时代的一种文体。新闻概念有广义与狭义之分。广义上:除了发表于报刊、广播、互联网、电视上的评论与专文外的常用文本都属于新闻，包括消息、通讯、特写、速写(有的将速写纳入特写之列)等等; 狭义上:消息是用概括的叙述方式，以较简明扼要的文字，迅速及时地报道附近新近发生的、有价值的事实，使一定人群了解。新闻一般包括标题、导语、主体、背景和结语五部分。前三者是主要部分，后二者是辅助部分。写法以叙述为主兼或有议论、描写、评论等。新闻是包含海量资讯的新闻服务平台,真实反映每时每刻的重要事件。您可以搜索新闻事件、热点话题、人物动态、产品资讯等,快速了解它们的最新进展。</p><p><br></p>','2023-05-14 12:13:02','11','水电费','2班','22','回家');
/*!40000 ALTER TABLE `shiyancuijiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiyanxinxi`
--

DROP TABLE IF EXISTS `shiyanxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiyanxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shiyanmingcheng` varchar(200) NOT NULL COMMENT '实验名称',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `kaishishijian` datetime DEFAULT NULL COMMENT '开始时间',
  `shiyanshishu` varchar(200) DEFAULT NULL COMMENT '实验时数',
  `shiyanmude` longtext COMMENT '实验目的',
  `fengmian` longtext COMMENT '封面',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `shiyanzhunbei` longtext COMMENT '实验准备',
  `shiyanyaoqiu` longtext COMMENT '实验要求',
  `jiezhishijian` date DEFAULT NULL COMMENT '截止时间',
  `shiyanneirong` longtext COMMENT '实验内容',
  `laoshizhanghao` varchar(200) DEFAULT NULL COMMENT '老师账号',
  `laoshixingming` varchar(200) DEFAULT NULL COMMENT '老师姓名',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684037577234 DEFAULT CHARSET=utf8 COMMENT='实验信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiyanxinxi`
--

LOCK TABLES `shiyanxinxi` WRITE;
/*!40000 ALTER TABLE `shiyanxinxi` DISABLE KEYS */;
INSERT INTO `shiyanxinxi` VALUES (51,'2023-05-14 04:09:11','实验名称1','班级1','2023-05-14 12:09:11','实验时数1','实验目的1','upload/shiyanxinxi_fengmian1.jpg,upload/shiyanxinxi_fengmian2.jpg,upload/shiyanxinxi_fengmian3.jpg','2023-05-14','实验准备1','实验要求1','2023-05-14','实验内容1','老师账号1','老师姓名1','2023-05-14 12:09:11',1),(52,'2023-05-14 04:09:11','实验名称2','班级2','2023-05-14 12:09:11','实验时数2','实验目的2','upload/shiyanxinxi_fengmian2.jpg,upload/shiyanxinxi_fengmian3.jpg,upload/shiyanxinxi_fengmian4.jpg','2023-05-14','实验准备2','实验要求2','2023-05-14','实验内容2','老师账号2','老师姓名2','2023-05-14 12:09:11',2),(53,'2023-05-14 04:09:11','实验名称3','班级3','2023-05-14 12:09:11','实验时数3','实验目的3','upload/shiyanxinxi_fengmian3.jpg,upload/shiyanxinxi_fengmian4.jpg,upload/shiyanxinxi_fengmian5.jpg','2023-05-14','实验准备3','实验要求3','2023-05-14','实验内容3','老师账号3','老师姓名3','2023-05-14 12:20:55',4),(54,'2023-05-14 04:09:11','实验名称4','班级4','2023-05-14 12:09:11','实验时数4','实验目的4','upload/shiyanxinxi_fengmian4.jpg,upload/shiyanxinxi_fengmian5.jpg,upload/shiyanxinxi_fengmian6.jpg','2023-05-14','实验准备4','实验要求4','2023-05-14','实验内容4','老师账号4','老师姓名4','2023-05-14 12:09:11',4),(55,'2023-05-14 04:09:11','实验名称5','班级5','2023-05-14 12:09:11','实验时数5','实验目的5','upload/shiyanxinxi_fengmian5.jpg,upload/shiyanxinxi_fengmian6.jpg,upload/shiyanxinxi_fengmian7.jpg','2023-05-14','实验准备5','实验要求5','2023-05-14','实验内容5','老师账号5','老师姓名5','2023-05-14 12:09:11',5),(56,'2023-05-14 04:09:11','实验名称6','班级6','2023-05-14 12:09:11','实验时数6','实验目的6','upload/shiyanxinxi_fengmian6.jpg,upload/shiyanxinxi_fengmian7.jpg,upload/shiyanxinxi_fengmian8.jpg','2023-05-14','实验准备6','实验要求6','2023-05-14','实验内容6','老师账号6','老师姓名6','2023-05-14 12:09:11',6),(57,'2023-05-14 04:09:11','实验名称7','班级7','2023-05-14 12:09:11','实验时数7','实验目的7','upload/shiyanxinxi_fengmian7.jpg,upload/shiyanxinxi_fengmian8.jpg,upload/shiyanxinxi_fengmian9.jpg','2023-05-14','实验准备7','实验要求7','2023-05-14','实验内容7','老师账号7','老师姓名7','2023-05-14 12:09:11',7),(58,'2023-05-14 04:09:11','实验名称8','班级8','2023-05-14 12:09:11','实验时数8','实验目的8','upload/shiyanxinxi_fengmian8.jpg,upload/shiyanxinxi_fengmian9.jpg,upload/shiyanxinxi_fengmian10.jpg','2023-05-14','实验准备8','实验要求8','2023-05-14','实验内容8','老师账号8','老师姓名8','2023-05-14 12:09:11',8),(1684037577233,'2023-05-14 04:12:56','第一实验','2班','2023-05-14 12:12:34','3','新闻是互联网等媒体经常使用的记录的一种文体。','upload/1684037569647.jpg','2023-05-14','新闻是互联网等媒体经常使用的记录的一种文体。','新闻是互联网等媒体经常使用的记录的一种文体。','2023-05-16','<p>新闻 ，是指报纸、电台、电视台、互联网等媒体经常使用的记录与传播信息的 一种文体。是记录社会、传播信息、反映时代的一种文体。新闻概念有广义与狭义之分。广义上:除了发表于报刊、广播、互联网、电视上的评论与专文外的常用文本都属于新闻，包括消息、通讯、特写、速写(有的将速写纳入特写之列)等等; 狭义上:消息是用概括的叙述方式，以较简明扼要的文字，迅速及时地报道附近新近发生的、有价值的事实，使一定人群了解。新闻一般包括标题、导语、主体、背景和结语五部分。前三者是主要部分，后二者是辅助部分。写法以叙述为主兼或有议论、描写、评论等。新闻是包含海量资讯的新闻服务平台,真实反映每时每刻的重要事件。您可以搜索新闻事件、热点话题、人物动态、产品资讯等,快速了解它们的最新进展。</p><p><br></p>','22','回家','2023-05-14 12:15:45',2);
/*!40000 ALTER TABLE `shiyanxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext NOT NULL COMMENT '图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩,31:竞拍参与,41:关注)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684215581831 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
INSERT INTO `storeup` VALUES (1684037783886,'2023-05-14 04:16:22',1684037457331,1684037629164,'banjitaolun','第2班级套路','upload/1684037627028.jpg','21',NULL,NULL),(1684037784473,'2023-05-14 04:16:23',1684037457331,1684037629164,'banjitaolun','第2班级套路','upload/1684037627028.jpg','1',NULL,NULL),(1684215581830,'2023-05-16 05:39:41',1684215255275,144,'banjitaolun','标题4','upload/banjitaolun_fengmian4.jpg','21',NULL,NULL);
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1684037457331,'11','xuesheng','学生','motoghi07e62yod62un85ne064q8gnq7','2023-05-14 04:11:00','2023-05-16 06:54:27'),(2,1684037483431,'22','laoshi','管理员','6q8nuq8rmmesuqmwpura2tsww23gvgcy','2023-05-14 04:11:27','2023-05-16 07:12:45'),(3,1,'admin','users','管理员','s9uhgiumnu4zma85jg6bycybkid1x3k6','2023-05-14 04:14:20','2023-05-16 06:51:14'),(4,18,'学号8','xuesheng','学生','sufweverjwfmqxmsfr55zlzgc2kc1ru1','2023-05-14 04:18:17','2023-05-14 05:18:17'),(5,21,'老师账号1','laoshi','管理员','hqc438hfjwpx51ebfcn0bte6ilc822jh','2023-05-14 04:18:43','2023-05-14 05:18:44'),(6,1684215255275,'11111','xuesheng','学生','01ymqtwazbrrbb4n1u1ybf0kn0zjr01f','2023-05-16 05:34:39','2023-05-16 06:34:40'),(7,1684037674762,'22555','laoshi','管理员','195t9ckhy41hq3jofe6mga44eh9f7z72','2023-05-16 05:44:00','2023-05-16 06:44:01');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'haoren1','admin','管理员','2023-05-14 04:09:11');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) NOT NULL COMMENT '学号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `touxiang` longtext COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuehao` (`xuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=1684215255276 DEFAULT CHARSET=utf8 COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (11,'2023-05-14 04:09:11','学号1','123456','姓名1','年龄1','男','13823888881','班级1','upload/xuesheng_touxiang1.jpg'),(12,'2023-05-14 04:09:11','学号2','123456','姓名2','年龄2','男','13823888882','班级2','upload/xuesheng_touxiang2.jpg'),(13,'2023-05-14 04:09:11','学号3','123456','姓名3','年龄3','男','13823888883','班级3','upload/xuesheng_touxiang3.jpg'),(14,'2023-05-14 04:09:11','学号4','123456','姓名4','年龄4','男','13823888884','班级4','upload/xuesheng_touxiang4.jpg'),(15,'2023-05-14 04:09:11','学号5','123456','姓名5','年龄5','男','13823888885','班级5','upload/xuesheng_touxiang5.jpg'),(16,'2023-05-14 04:09:11','学号6','123456','姓名6','年龄6','男','13823888886','班级6','upload/xuesheng_touxiang6.jpg'),(17,'2023-05-14 04:09:11','学号7','123456','姓名7','年龄7','男','13823888887','班级7','upload/xuesheng_touxiang7.jpg'),(18,'2023-05-14 04:09:11','学号8','123456','姓名8','年龄8','男','13823888888','班级8','upload/xuesheng_touxiang8.jpg'),(1684037457331,'2023-05-14 04:10:57','11','11','水电费','11','男','15111111111','2班','upload/1684037456365.jpg'),(1684215255275,'2023-05-16 05:34:15','11111','11111','11111','111','男','12345678900','班级1','upload/1684215241644.png');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xueshenghuping`
--

DROP TABLE IF EXISTS `xueshenghuping`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xueshenghuping` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `pingjiabianhao` varchar(200) DEFAULT NULL COMMENT '评价编号',
  `shiyanmingcheng` varchar(200) DEFAULT NULL COMMENT '实验名称',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `laoshizhanghao` varchar(200) DEFAULT NULL COMMENT '老师账号',
  `laoshixingming` varchar(200) DEFAULT NULL COMMENT '老师姓名',
  `pingfen` float DEFAULT NULL COMMENT '评分',
  `pingyu` longtext COMMENT '评语',
  `pingjiashijian` datetime DEFAULT NULL COMMENT '评价时间',
  `hupingxuehao` varchar(200) DEFAULT NULL COMMENT '互评学号',
  `hupingxingming` varchar(200) DEFAULT NULL COMMENT '互评姓名',
  `crossuserid` bigint(20) DEFAULT NULL COMMENT '跨表用户id',
  `crossrefid` bigint(20) DEFAULT NULL COMMENT '跨表主键id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `pingjiabianhao` (`pingjiabianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1684037917076 DEFAULT CHARSET=utf8 COMMENT='学生互评';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xueshenghuping`
--

LOCK TABLES `xueshenghuping` WRITE;
/*!40000 ALTER TABLE `xueshenghuping` DISABLE KEYS */;
INSERT INTO `xueshenghuping` VALUES (81,'2023-05-14 04:09:11','1111111111','实验名称1','班级1','老师账号1','老师姓名1',1,'评语1','2023-05-14 12:09:11','互评学号1','互评姓名1',1,1),(82,'2023-05-14 04:09:11','2222222222','实验名称2','班级2','老师账号2','老师姓名2',2,'评语2','2023-05-14 12:09:11','互评学号2','互评姓名2',2,2),(83,'2023-05-14 04:09:11','3333333333','实验名称3','班级3','老师账号3','老师姓名3',3,'评语3','2023-05-14 12:09:11','互评学号3','互评姓名3',3,3),(84,'2023-05-14 04:09:11','4444444444','实验名称4','班级4','老师账号4','老师姓名4',4,'评语4','2023-05-14 12:09:11','互评学号4','互评姓名4',4,4),(85,'2023-05-14 04:09:11','5555555555','实验名称5','班级5','老师账号5','老师姓名5',5,'评语5','2023-05-14 12:09:11','互评学号5','互评姓名5',5,5),(86,'2023-05-14 04:09:11','6666666666','实验名称6','班级6','老师账号6','老师姓名6',6,'评语6','2023-05-14 12:09:11','互评学号6','互评姓名6',6,6),(87,'2023-05-14 04:09:11','7777777777','实验名称7','班级7','老师账号7','老师姓名7',7,'评语7','2023-05-14 12:09:11','互评学号7','互评姓名7',7,7),(88,'2023-05-14 04:09:11','8888888888','实验名称8','班级8','老师账号8','老师姓名8',8,'评语8','2023-05-14 12:09:11','互评学号8','互评姓名8',8,8),(1684037917075,'2023-05-14 04:18:36','1684037905405','第一实验','2班','22','回家',20,'学生8 互评的11111','2023-05-14 12:18:25','学号8','姓名8',18,1684037888907);
/*!40000 ALTER TABLE `xueshenghuping` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xueshengzuoye`
--

DROP TABLE IF EXISTS `xueshengzuoye`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xueshengzuoye` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `zuoyemingcheng` varchar(200) DEFAULT NULL COMMENT '作业名称',
  `zuoyewenjian` longtext COMMENT '作业文件',
  `wenjianneirong` longtext COMMENT '文件内容',
  `shangchuanshijian` datetime DEFAULT NULL COMMENT '上传时间',
  `laoshizhanghao` varchar(200) DEFAULT NULL COMMENT '老师账号',
  `laoshixingming` varchar(200) DEFAULT NULL COMMENT '老师姓名',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `crossuserid` bigint(20) DEFAULT NULL COMMENT '跨表用户id',
  `crossrefid` bigint(20) DEFAULT NULL COMMENT '跨表主键id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684037772814 DEFAULT CHARSET=utf8 COMMENT='学生作业';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xueshengzuoye`
--

LOCK TABLES `xueshengzuoye` WRITE;
/*!40000 ALTER TABLE `xueshengzuoye` DISABLE KEYS */;
INSERT INTO `xueshengzuoye` VALUES (121,'2023-05-14 04:09:11','班级1','作业名称1','','文件内容1','2023-05-14 12:09:11','老师账号1','老师姓名1','学号1','姓名1',1,1),(122,'2023-05-14 04:09:11','班级2','作业名称2','','文件内容2','2023-05-14 12:09:11','老师账号2','老师姓名2','学号2','姓名2',2,2),(123,'2023-05-14 04:09:11','班级3','作业名称3','','文件内容3','2023-05-14 12:09:11','老师账号3','老师姓名3','学号3','姓名3',3,3),(124,'2023-05-14 04:09:11','班级4','作业名称4','','文件内容4','2023-05-14 12:09:11','老师账号4','老师姓名4','学号4','姓名4',4,4),(125,'2023-05-14 04:09:11','班级5','作业名称5','','文件内容5','2023-05-14 12:09:11','老师账号5','老师姓名5','学号5','姓名5',5,5),(126,'2023-05-14 04:09:11','班级6','作业名称6','','文件内容6','2023-05-14 12:09:11','老师账号6','老师姓名6','学号6','姓名6',6,6),(127,'2023-05-14 04:09:11','班级7','作业名称7','','文件内容7','2023-05-14 12:09:11','老师账号7','老师姓名7','学号7','姓名7',7,7),(128,'2023-05-14 04:09:11','班级8','作业名称8','','文件内容8','2023-05-14 12:09:11','老师账号8','老师姓名8','学号8','姓名8',8,8),(1684037772813,'2023-05-14 04:16:12','2班','第一实验作业','upload/1684037770096.doc','<p>新闻 ，是指报纸、电台、电视台、互联网等媒体经常使用的记录与传播信息的 一种文体。是记录社会、传播信息、反映时代的一种文体。新闻概念有广义与狭义之分。广义上:除了发表于报刊、广播、互联网、电视上的评论与专文外的常用文本都属于新闻，包括消息、通讯、特写、速写(有的将速写纳入特写之列)等等; 狭义上:消息是用概括的叙述方式，以较简明扼要的文字，迅速及时地报道附近新近发生的、有价值的事实，使一定人群了解。新闻一般包括标题、导语、主体、背景和结语五部分。前三者是主要部分，后二者是辅助部分。写法以叙述为主兼或有议论、描写、评论等。新闻是包含海量资讯的新闻服务平台,真实反映每时每刻的重要事件。您可以搜索新闻事件、热点话题、人物动态、产品资讯等,快速了解它们的最新进展。</p><p><br></p>','2023-05-14 12:16:05','22','回家','11','水电费',1684037457331,1684037607910);
/*!40000 ALTER TABLE `xueshengzuoye` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zuoyechengji`
--

DROP TABLE IF EXISTS `zuoyechengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zuoyechengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `zuoyemingcheng` varchar(200) DEFAULT NULL COMMENT '作业名称',
  `laoshizhanghao` varchar(200) DEFAULT NULL COMMENT '老师账号',
  `laoshixingming` varchar(200) DEFAULT NULL COMMENT '老师姓名',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `zuoyefenshu` float NOT NULL COMMENT '作业分数',
  `pingyu` longtext COMMENT '评语',
  `pingfenriqi` date DEFAULT NULL COMMENT '评分日期',
  `crossuserid` bigint(20) DEFAULT NULL COMMENT '跨表用户id',
  `crossrefid` bigint(20) DEFAULT NULL COMMENT '跨表主键id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684038021108 DEFAULT CHARSET=utf8 COMMENT='作业成绩';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zuoyechengji`
--

LOCK TABLES `zuoyechengji` WRITE;
/*!40000 ALTER TABLE `zuoyechengji` DISABLE KEYS */;
INSERT INTO `zuoyechengji` VALUES (131,'2023-05-14 04:09:11','班级1','作业名称1','老师账号1','老师姓名1','学号1','姓名1',1,'评语1','2023-05-14',1,1),(132,'2023-05-14 04:09:11','班级2','作业名称2','老师账号2','老师姓名2','学号2','姓名2',2,'评语2','2023-05-14',2,2),(133,'2023-05-14 04:09:11','班级3','作业名称3','老师账号3','老师姓名3','学号3','姓名3',3,'评语3','2023-05-14',3,3),(134,'2023-05-14 04:09:11','班级4','作业名称4','老师账号4','老师姓名4','学号4','姓名4',4,'评语4','2023-05-14',4,4),(135,'2023-05-14 04:09:11','班级5','作业名称5','老师账号5','老师姓名5','学号5','姓名5',5,'评语5','2023-05-14',5,5),(136,'2023-05-14 04:09:11','班级6','作业名称6','老师账号6','老师姓名6','学号6','姓名6',6,'评语6','2023-05-14',6,6),(137,'2023-05-14 04:09:11','班级7','作业名称7','老师账号7','老师姓名7','学号7','姓名7',7,'评语7','2023-05-14',7,7),(138,'2023-05-14 04:09:11','班级8','作业名称8','老师账号8','老师姓名8','学号8','姓名8',8,'评语8','2023-05-14',8,8),(1684038021107,'2023-05-14 04:20:20','2班','第一实验作业','22','回家','11','水电费',33,'是的发送到发送发送到  学生11的作业成绩333','2023-05-14',1684037483431,1684037772813);
/*!40000 ALTER TABLE `zuoyechengji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zuoyexinxi`
--

DROP TABLE IF EXISTS `zuoyexinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zuoyexinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `banji` varchar(200) NOT NULL COMMENT '班级',
  `zuoyemingcheng` varchar(200) NOT NULL COMMENT '作业名称',
  `fengmian` longtext COMMENT '封面',
  `zuoyeneirong` longtext COMMENT '作业内容',
  `buzhishijian` datetime DEFAULT NULL COMMENT '布置时间',
  `jiezhishijian` datetime DEFAULT NULL COMMENT '截止时间',
  `laoshizhanghao` varchar(200) DEFAULT NULL COMMENT '老师账号',
  `laoshixingming` varchar(200) DEFAULT NULL COMMENT '老师姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1684037607911 DEFAULT CHARSET=utf8 COMMENT='作业信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zuoyexinxi`
--

LOCK TABLES `zuoyexinxi` WRITE;
/*!40000 ALTER TABLE `zuoyexinxi` DISABLE KEYS */;
INSERT INTO `zuoyexinxi` VALUES (111,'2023-05-14 04:09:11','班级1','作业名称1','upload/zuoyexinxi_fengmian1.jpg,upload/zuoyexinxi_fengmian2.jpg,upload/zuoyexinxi_fengmian3.jpg','作业内容1','2023-05-14 12:09:11','2023-05-14 12:09:11','老师账号1','老师姓名1'),(112,'2023-05-14 04:09:11','班级2','作业名称2','upload/zuoyexinxi_fengmian2.jpg,upload/zuoyexinxi_fengmian3.jpg,upload/zuoyexinxi_fengmian4.jpg','作业内容2','2023-05-14 12:09:11','2023-05-14 12:09:11','老师账号2','老师姓名2'),(113,'2023-05-14 04:09:11','班级3','作业名称3','upload/zuoyexinxi_fengmian3.jpg,upload/zuoyexinxi_fengmian4.jpg,upload/zuoyexinxi_fengmian5.jpg','作业内容3','2023-05-14 12:09:11','2023-05-14 12:09:11','老师账号3','老师姓名3'),(114,'2023-05-14 04:09:11','班级4','作业名称4','upload/zuoyexinxi_fengmian4.jpg,upload/zuoyexinxi_fengmian5.jpg,upload/zuoyexinxi_fengmian6.jpg','作业内容4','2023-05-14 12:09:11','2023-05-14 12:09:11','老师账号4','老师姓名4'),(115,'2023-05-14 04:09:11','班级5','作业名称5','upload/zuoyexinxi_fengmian5.jpg,upload/zuoyexinxi_fengmian6.jpg,upload/zuoyexinxi_fengmian7.jpg','作业内容5','2023-05-14 12:09:11','2023-05-14 12:09:11','老师账号5','老师姓名5'),(116,'2023-05-14 04:09:11','班级6','作业名称6','upload/zuoyexinxi_fengmian6.jpg,upload/zuoyexinxi_fengmian7.jpg,upload/zuoyexinxi_fengmian8.jpg','作业内容6','2023-05-14 12:09:11','2023-05-14 12:09:11','老师账号6','老师姓名6'),(117,'2023-05-14 04:09:11','班级7','作业名称7','upload/zuoyexinxi_fengmian7.jpg,upload/zuoyexinxi_fengmian8.jpg,upload/zuoyexinxi_fengmian9.jpg','作业内容7','2023-05-14 12:09:11','2023-05-14 12:09:11','老师账号7','老师姓名7'),(118,'2023-05-14 04:09:11','班级8','作业名称8','upload/zuoyexinxi_fengmian8.jpg,upload/zuoyexinxi_fengmian9.jpg,upload/zuoyexinxi_fengmian10.jpg','作业内容8','2023-05-14 12:09:11','2023-05-14 12:09:11','老师账号8','老师姓名8'),(1684037607910,'2023-05-14 04:13:27','2班','第一实验作业','upload/1684037605065.jpg','<p>新闻 ，是指报纸、电台、电视台、互联网等媒体经常使用的记录与传播信息的 一种文体。是记录社会、传播信息、反映时代的一种文体。新闻概念有广义与狭义之分。广义上:除了发表于报刊、广播、互联网、电视上的评论与专文外的常用文本都属于新闻，包括消息、通讯、特写、速写(有的将速写纳入特写之列)等等; 狭义上:消息是用概括的叙述方式，以较简明扼要的文字，迅速及时地报道附近新近发生的、有价值的事实，使一定人群了解。新闻一般包括标题、导语、主体、背景和结语五部分。前三者是主要部分，后二者是辅助部分。写法以叙述为主兼或有议论、描写、评论等。新闻是包含海量资讯的新闻服务平台,真实反映每时每刻的重要事件。您可以搜索新闻事件、热点话题、人物动态、产品资讯等,快速了解它们的最新进展。</p><p><br></p>','2023-05-14 12:13:15','2023-05-14 12:13:15','22','回家');
/*!40000 ALTER TABLE `zuoyexinxi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-22 11:20:23

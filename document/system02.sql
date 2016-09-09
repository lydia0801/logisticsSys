CREATE DATABASE  IF NOT EXISTS `system02` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `system02`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: system02
-- ------------------------------------------------------
-- Server version	5.6.17

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
-- Table structure for table `carinfo`
--

DROP TABLE IF EXISTS `carinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carinfo` (
  `car_id` char(50) NOT NULL,
  `car_name` char(50) NOT NULL,
  `car_type` char(50) DEFAULT NULL,
  `car_weight` int(11) DEFAULT NULL,
  `car_V` int(11) DEFAULT NULL,
  `car_state` char(50) DEFAULT NULL,
  `car_unit` char(50) DEFAULT NULL,
  PRIMARY KEY (`car_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carinfo`
--

LOCK TABLES `carinfo` WRITE;
/*!40000 ALTER TABLE `carinfo` DISABLE KEYS */;
INSERT INTO `carinfo` VALUES ('HN001','莲花汽车','大卡车',20,20,'空闲','省公司'),('HN002','莲花汽车2','大卡车',20,20,'运输中','省公司');
/*!40000 ALTER TABLE `carinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customerinfo`
--

DROP TABLE IF EXISTS `customerinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customerinfo` (
  `cus_id` int(11) NOT NULL AUTO_INCREMENT,
  `cus_name` char(50) NOT NULL,
  `login_name` char(50) NOT NULL,
  `login_pwd` char(50) NOT NULL,
  `cus_address` char(200) NOT NULL,
  `cus_phone` char(20) NOT NULL,
  PRIMARY KEY (`cus_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customerinfo`
--

LOCK TABLES `customerinfo` WRITE;
/*!40000 ALTER TABLE `customerinfo` DISABLE KEYS */;
INSERT INTO `customerinfo` VALUES (1,'张三1','zhangsan','111111','湖南1','15096098011'),(2,'navy','navy','123456','湖南','15096098010');
/*!40000 ALTER TABLE `customerinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deliveinfo`
--

DROP TABLE IF EXISTS `deliveinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deliveinfo` (
  `del_id` int(11) NOT NULL AUTO_INCREMENT,
  `del_name` char(50) NOT NULL,
  `del_address` char(200) NOT NULL,
  `del_code` char(20) DEFAULT NULL,
  PRIMARY KEY (`del_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deliveinfo`
--

LOCK TABLES `deliveinfo` WRITE;
/*!40000 ALTER TABLE `deliveinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `deliveinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderinfo`
--

DROP TABLE IF EXISTS `orderinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderinfo` (
  `order_id` char(50) NOT NULL,
  `cus_id` int(11) DEFAULT NULL,
  `car_id` char(50) DEFAULT NULL,
  `order_name` char(100) DEFAULT NULL,
  `order_date` datetime DEFAULT NULL,
  `order_goods` char(50) DEFAULT NULL,
  `order_weight` decimal(8,0) DEFAULT NULL,
  `order_v` decimal(8,0) DEFAULT NULL,
  `order_person` char(50) DEFAULT NULL,
  `send_person` char(50) DEFAULT NULL,
  `send_address` char(200) DEFAULT NULL,
  `send_phone` char(20) DEFAULT NULL,
  `recive_person` char(50) DEFAULT NULL,
  `recive_address` char(200) DEFAULT NULL,
  `recive_phone` char(20) DEFAULT NULL,
  `order_state` char(20) DEFAULT NULL,
  `delive_person` char(50) DEFAULT NULL,
  `order_fee` float DEFAULT NULL,
  `order_remark` text,
  `order_way` char(100) DEFAULT NULL,
  `order_end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `FK_R_2` (`car_id`),
  KEY `FK_R_4` (`cus_id`),
  CONSTRAINT `FK_R_2` FOREIGN KEY (`car_id`) REFERENCES `carinfo` (`car_id`),
  CONSTRAINT `FK_R_4` FOREIGN KEY (`cus_id`) REFERENCES `customerinfo` (`cus_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderinfo`
--

LOCK TABLES `orderinfo` WRITE;
/*!40000 ALTER TABLE `orderinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `orderinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roadlineinfo`
--

DROP TABLE IF EXISTS `roadlineinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roadlineinfo` (
  `road_id` int(11) NOT NULL AUTO_INCREMENT,
  `price_id` int(11) DEFAULT NULL,
  `road_name` char(50) NOT NULL,
  `road_start` char(50) DEFAULT NULL,
  `road_end` char(50) DEFAULT NULL,
  PRIMARY KEY (`road_id`),
  KEY `FK_R_3` (`price_id`),
  CONSTRAINT `FK_R_3` FOREIGN KEY (`price_id`) REFERENCES `roadlineprice` (`price_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roadlineinfo`
--

LOCK TABLES `roadlineinfo` WRITE;
/*!40000 ALTER TABLE `roadlineinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `roadlineinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roadlineprice`
--

DROP TABLE IF EXISTS `roadlineprice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roadlineprice` (
  `price_id` int(11) NOT NULL AUTO_INCREMENT,
  `price_frist_k` float DEFAULT NULL,
  `price_other_k` float DEFAULT NULL,
  `price_frist_v` float DEFAULT NULL,
  `price_other_v` float DEFAULT NULL,
  PRIMARY KEY (`price_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roadlineprice`
--

LOCK TABLES `roadlineprice` WRITE;
/*!40000 ALTER TABLE `roadlineprice` DISABLE KEYS */;
/*!40000 ALTER TABLE `roadlineprice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roleinfo`
--

DROP TABLE IF EXISTS `roleinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roleinfo` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` char(50) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roleinfo`
--

LOCK TABLES `roleinfo` WRITE;
/*!40000 ALTER TABLE `roleinfo` DISABLE KEYS */;
INSERT INTO `roleinfo` VALUES (1,'省公司管理员'),(2,'配送点管理员'),(3,'配送员');
/*!40000 ALTER TABLE `roleinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userinfo`
--

DROP TABLE IF EXISTS `userinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userinfo` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `user_name` char(50) NOT NULL,
  `user_pwd` char(50) NOT NULL,
  `user_state` char(50) NOT NULL,
  `user_unit` varchar(45) DEFAULT NULL,
  `user_real_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `FK_R_1` (`role_id`),
  CONSTRAINT `FK_R_1` FOREIGN KEY (`role_id`) REFERENCES `roleinfo` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1006 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userinfo`
--

LOCK TABLES `userinfo` WRITE;
/*!40000 ALTER TABLE `userinfo` DISABLE KEYS */;
INSERT INTO `userinfo` VALUES (1001,1,'lydia','123456','在职',NULL,NULL),(1002,2,'aa','123456','在职',NULL,NULL),(1003,2,'bb','123456','在职',NULL,NULL),(1004,3,'zhangsan','123456','在职',NULL,NULL),(1005,2,'测试用户','123456','在职','省公司',NULL);
/*!40000 ALTER TABLE `userinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-09-16 11:41:19

CREATE DATABASE  IF NOT EXISTS `users` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `users`;
-- MySQL dump 10.13  Distrib 8.0.17, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: users
-- ------------------------------------------------------
-- Server version	5.7.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Users`
--

DROP TABLE IF EXISTS `Users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Users` (
  `email` varchar(255) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `isAdmin` tinyint(4) NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Users`
--

LOCK TABLES `Users` WRITE;
/*!40000 ALTER TABLE `Users` DISABLE KEYS */;
INSERT INTO `Users` VALUES ('david.simeonovic@heig-vd.ch','dado','dado','password',1),('email1','firstname1','lastname1','password1',127),('email10','firstname10','lastname10','password10',127),('email100','firstname100','lastname100','password100',127),('email11','firstname11','lastname11','password11',127),('email12','firstname12','lastname12','password12',127),('email13','firstname13','lastname13','password13',127),('email14','firstname14','lastname14','password14',127),('email15','firstname15','lastname15','password15',127),('email16','firstname16','lastname16','password16',127),('email17','firstname17','lastname17','password17',127),('email18','firstname18','lastname18','password18',127),('email19','firstname19','lastname19','password19',127),('email2','firstname2','lastname2','password2',127),('email20','firstname20','lastname20','password20',127),('email21','firstname21','lastname21','password21',127),('email22','firstname22','lastname22','password22',127),('email23','firstname23','lastname23','password23',127),('email24','firstname24','lastname24','password24',127),('email25','firstname25','lastname25','password25',127),('email26','firstname26','lastname26','password26',127),('email27','firstname27','lastname27','password27',127),('email28','firstname28','lastname28','password28',127),('email29','firstname29','lastname29','password29',127),('email3','firstname3','lastname3','password3',127),('email30','firstname30','lastname30','password30',127),('email31','firstname31','lastname31','password31',42),('email32','firstname32','lastname32','password32',127),('email33','firstname33','lastname33','password33',127),('email34','firstname34','lastname34','password34',127),('email35','firstname35','lastname35','password35',127),('email36','firstname36','lastname36','password36',127),('email37','firstname37','lastname37','password37',127),('email38','firstname38','lastname38','password38',127),('email39','firstname39','lastname39','password39',127),('email4','firstname4','lastname4','password4',127),('email40','firstname40','lastname40','password40',127),('email41','firstname41','lastname41','password41',127),('email42','firstname42','lastname42','password42',127),('email43','firstname43','lastname43','password43',127),('email44','firstname44','lastname44','password44',127),('email45','firstname45','lastname45','password45',127),('email46','firstname46','lastname46','password46',127),('email47','firstname47','lastname47','password47',127),('email48','firstname48','lastname48','password48',127),('email49','firstname49','lastname49','password49',127),('email5','firstname5','lastname5','password5',127),('email50','firstname50','lastname50','password50',127),('email51','firstname51','lastname51','password51',127),('email52','firstname52','lastname52','password52',127),('email53','firstname53','lastname53','password53',127),('email54','firstname54','lastname54','password54',127),('email55','firstname55','lastname55','password55',127),('email56','firstname56','lastname56','password56',127),('email57','firstname57','lastname57','password57',127),('email58','firstname58','lastname58','password58',127),('email59','firstname59','lastname59','password59',127),('email6','firstname6','lastname6','password6',127),('email60','firstname60','lastname60','password60',127),('email61','firstname61','lastname61','password61',127),('email62','firstname62','lastname62','password62',127),('email63','firstname63','lastname63','password63',127),('email64','firstname64','lastname64','password64',127),('email65','firstname65','lastname65','password65',127),('email66','firstname66','lastname66','password66',127),('email67','firstname67','lastname67','password67',127),('email68','firstname68','lastname68','password68',127),('email69','firstname69','lastname69','password69',127),('email7','firstname7','lastname7','password7',127),('email70','firstname70','lastname70','password70',127),('email71','firstname71','lastname71','password71',127),('email72','firstname72','lastname72','password72',127),('email73','firstname73','lastname73','password73',127),('email74','firstname74','lastname74','password74',127),('email75','firstname75','lastname75','password75',127),('email76','firstname76','lastname76','password76',127),('email77','firstname77','lastname77','password77',127),('email78','firstname78','lastname78','password78',127),('email79','firstname79','lastname79','password79',127),('email8','firstname8','lastname8','password8',127),('email80','firstname80','lastname80','password80',127),('email81','firstname81','lastname81','password81',127),('email82','firstname82','lastname82','password82',127),('email83','firstname83','lastname83','password83',127),('email84','firstname84','lastname84','password84',127),('email85','firstname85','lastname85','password85',127),('email86','firstname86','lastname86','password86',127),('email87','firstname87','lastname87','password87',127),('email88','firstname88','lastname88','password88',127),('email89','firstname89','lastname89','password89',127),('email9','firstname9','lastname9','password9',127),('email90','firstname90','lastname90','password90',127),('email91','firstname91','lastname91','password91',127),('email92','firstname92','lastname92','password92',127),('email93','firstname93','lastname93','password93',127),('email94','firstname94','lastname94','password94',127),('email95','firstname95','lastname95','password95',127),('email96','firstname96','lastname96','password96',127),('email97','firstname97','lastname97','password97',127),('email98','firstname98','lastname98','password98',127),('email99','firstname99','lastname99','password99',127),('user257630591@mail.com','John','Doe','test',0);
/*!40000 ALTER TABLE `Users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-19 20:23:54

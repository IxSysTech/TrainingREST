-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: localhost    Database: users
-- ------------------------------------------------------
-- Server version	5.7.27

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
-- Table structure for table `Users`
--

DROP TABLE IF EXISTS `Users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Users` (
  `email` varchar(255) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `isAdmin` tinyint(4) NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
INSERT INTO `Users` (`email`, `firstname`, `lastname`, `password`, `isAdmin`) VALUES
('email1', 'firstname1', 'lastname1', 'password1', 6967),
('email2', 'firstname2', 'lastname2', 'password2', 9385),
('email3', 'firstname3', 'lastname3', 'password3', 4051),
('email4', 'firstname4', 'lastname4', 'password4', 6542),
('email5', 'firstname5', 'lastname5', 'password5', 6592),
('email6', 'firstname6', 'lastname6', 'password6', 5570),
('email7', 'firstname7', 'lastname7', 'password7', 6415),
('email8', 'firstname8', 'lastname8', 'password8', 5026),
('email9', 'firstname9', 'lastname9', 'password9', 6752),
('email10', 'firstname10', 'lastname10', 'password10', 4740),
('email11', 'firstname11', 'lastname11', 'password11', 7117),
('email12', 'firstname12', 'lastname12', 'password12', 1855),
('email13', 'firstname13', 'lastname13', 'password13', 9315),
('email14', 'firstname14', 'lastname14', 'password14', 2172),
('email15', 'firstname15', 'lastname15', 'password15', 251),
('email16', 'firstname16', 'lastname16', 'password16', 2491),
('email17', 'firstname17', 'lastname17', 'password17', 9952),
('email18', 'firstname18', 'lastname18', 'password18', 2499),
('email19', 'firstname19', 'lastname19', 'password19', 6262),
('email20', 'firstname20', 'lastname20', 'password20', 4731),
('email21', 'firstname21', 'lastname21', 'password21', 5662),
('email22', 'firstname22', 'lastname22', 'password22', 6370),
('email23', 'firstname23', 'lastname23', 'password23', 8258),
('email24', 'firstname24', 'lastname24', 'password24', 8124),
('email25', 'firstname25', 'lastname25', 'password25', 4995),
('email26', 'firstname26', 'lastname26', 'password26', 4628),
('email27', 'firstname27', 'lastname27', 'password27', 7687),
('email28', 'firstname28', 'lastname28', 'password28', 812),
('email29', 'firstname29', 'lastname29', 'password29', 8508),
('email30', 'firstname30', 'lastname30', 'password30', 2709),
('email31', 'firstname31', 'lastname31', 'password31', 42),
('email32', 'firstname32', 'lastname32', 'password32', 994),
('email33', 'firstname33', 'lastname33', 'password33', 5045),
('email34', 'firstname34', 'lastname34', 'password34', 8880),
('email35', 'firstname35', 'lastname35', 'password35', 3972),
('email36', 'firstname36', 'lastname36', 'password36', 7657),
('email37', 'firstname37', 'lastname37', 'password37', 6964),
('email38', 'firstname38', 'lastname38', 'password38', 3786),
('email39', 'firstname39', 'lastname39', 'password39', 8749),
('email40', 'firstname40', 'lastname40', 'password40', 9784),
('email41', 'firstname41', 'lastname41', 'password41', 1009),
('email42', 'firstname42', 'lastname42', 'password42', 1933),
('email43', 'firstname43', 'lastname43', 'password43', 1221),
('email44', 'firstname44', 'lastname44', 'password44', 708),
('email45', 'firstname45', 'lastname45', 'password45', 9250),
('email46', 'firstname46', 'lastname46', 'password46', 6540),
('email47', 'firstname47', 'lastname47', 'password47', 5514),
('email48', 'firstname48', 'lastname48', 'password48', 2977),
('email49', 'firstname49', 'lastname49', 'password49', 3390),
('email50', 'firstname50', 'lastname50', 'password50', 2639),
('email51', 'firstname51', 'lastname51', 'password51', 2967),
('email52', 'firstname52', 'lastname52', 'password52', 4110),
('email53', 'firstname53', 'lastname53', 'password53', 4243),
('email54', 'firstname54', 'lastname54', 'password54', 622),
('email55', 'firstname55', 'lastname55', 'password55', 6129),
('email56', 'firstname56', 'lastname56', 'password56', 2996),
('email57', 'firstname57', 'lastname57', 'password57', 3414),
('email58', 'firstname58', 'lastname58', 'password58', 6854),
('email59', 'firstname59', 'lastname59', 'password59', 7519),
('email60', 'firstname60', 'lastname60', 'password60', 5303),
('email61', 'firstname61', 'lastname61', 'password61', 5533),
('email62', 'firstname62', 'lastname62', 'password62', 6592),
('email63', 'firstname63', 'lastname63', 'password63', 306),
('email64', 'firstname64', 'lastname64', 'password64', 6801),
('email65', 'firstname65', 'lastname65', 'password65', 2886),
('email66', 'firstname66', 'lastname66', 'password66', 1224),
('email67', 'firstname67', 'lastname67', 'password67', 9650),
('email68', 'firstname68', 'lastname68', 'password68', 6712),
('email69', 'firstname69', 'lastname69', 'password69', 8872),
('email70', 'firstname70', 'lastname70', 'password70', 8073),
('email71', 'firstname71', 'lastname71', 'password71', 4806),
('email72', 'firstname72', 'lastname72', 'password72', 1911),
('email73', 'firstname73', 'lastname73', 'password73', 6088),
('email74', 'firstname74', 'lastname74', 'password74', 9545),
('email75', 'firstname75', 'lastname75', 'password75', 1351),
('email76', 'firstname76', 'lastname76', 'password76', 8993),
('email77', 'firstname77', 'lastname77', 'password77', 6262),
('email78', 'firstname78', 'lastname78', 'password78', 2614),
('email79', 'firstname79', 'lastname79', 'password79', 161),
('email80', 'firstname80', 'lastname80', 'password80', 539),
('email81', 'firstname81', 'lastname81', 'password81', 3387),
('email82', 'firstname82', 'lastname82', 'password82', 161),
('email83', 'firstname83', 'lastname83', 'password83', 1975),
('email84', 'firstname84', 'lastname84', 'password84', 7311),
('email85', 'firstname85', 'lastname85', 'password85', 5364),
('email86', 'firstname86', 'lastname86', 'password86', 3080),
('email87', 'firstname87', 'lastname87', 'password87', 527),
('email88', 'firstname88', 'lastname88', 'password88', 4855),
('email89', 'firstname89', 'lastname89', 'password89', 303),
('email90', 'firstname90', 'lastname90', 'password90', 1772),
('email91', 'firstname91', 'lastname91', 'password91', 7251),
('email92', 'firstname92', 'lastname92', 'password92', 9863),
('email93', 'firstname93', 'lastname93', 'password93', 3110),
('email94', 'firstname94', 'lastname94', 'password94', 4559),
('email95', 'firstname95', 'lastname95', 'password95', 9976),
('email96', 'firstname96', 'lastname96', 'password96', 7169),
('email97', 'firstname97', 'lastname97', 'password97', 6570),
('email98', 'firstname98', 'lastname98', 'password98', 1174),
('email99', 'firstname99', 'lastname99', 'password99', 9049),
('email100', 'firstname100', 'lastname100', 'password100', 7225);

--
-- Dumping data for table `Users`
--

LOCK TABLES `Users` WRITE;
/*!40000 ALTER TABLE `Users` DISABLE KEYS */;
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

-- Dump completed on 2020-01-18  9:04:23

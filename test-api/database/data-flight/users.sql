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
('email1', 'firstname1', 'lastname1', 'password1', 1593),
('email2', 'firstname2', 'lastname2', 'password2', 4960),
('email3', 'firstname3', 'lastname3', 'password3', 1523),
('email4', 'firstname4', 'lastname4', 'password4', 6470),
('email5', 'firstname5', 'lastname5', 'password5', 1898),
('email6', 'firstname6', 'lastname6', 'password6', 990),
('email7', 'firstname7', 'lastname7', 'password7', 1885),
('email8', 'firstname8', 'lastname8', 'password8', 2273),
('email9', 'firstname9', 'lastname9', 'password9', 7270),
('email10', 'firstname10', 'lastname10', 'password10', 9396),
('email11', 'firstname11', 'lastname11', 'password11', 1756),
('email12', 'firstname12', 'lastname12', 'password12', 6687),
('email13', 'firstname13', 'lastname13', 'password13', 1772),
('email14', 'firstname14', 'lastname14', 'password14', 271),
('email15', 'firstname15', 'lastname15', 'password15', 8080),
('email16', 'firstname16', 'lastname16', 'password16', 8898),
('email17', 'firstname17', 'lastname17', 'password17', 4226),
('email18', 'firstname18', 'lastname18', 'password18', 662),
('email19', 'firstname19', 'lastname19', 'password19', 9417),
('email20', 'firstname20', 'lastname20', 'password20', 6490),
('email21', 'firstname21', 'lastname21', 'password21', 6529),
('email22', 'firstname22', 'lastname22', 'password22', 3418),
('email23', 'firstname23', 'lastname23', 'password23', 9090),
('email24', 'firstname24', 'lastname24', 'password24', 7454),
('email25', 'firstname25', 'lastname25', 'password25', 6521),
('email26', 'firstname26', 'lastname26', 'password26', 1994),
('email27', 'firstname27', 'lastname27', 'password27', 3326),
('email28', 'firstname28', 'lastname28', 'password28', 7805),
('email29', 'firstname29', 'lastname29', 'password29', 7198),
('email30', 'firstname30', 'lastname30', 'password30', 4871),
('email31', 'firstname31', 'lastname31', 'password31', 8695),
('email32', 'firstname32', 'lastname32', 'password32', 2665),
('email33', 'firstname33', 'lastname33', 'password33', 2896),
('email34', 'firstname34', 'lastname34', 'password34', 6853),
('email35', 'firstname35', 'lastname35', 'password35', 8800),
('email36', 'firstname36', 'lastname36', 'password36', 2585),
('email37', 'firstname37', 'lastname37', 'password37', 426),
('email38', 'firstname38', 'lastname38', 'password38', 9457),
('email39', 'firstname39', 'lastname39', 'password39', 3430),
('email40', 'firstname40', 'lastname40', 'password40', 5447),
('email41', 'firstname41', 'lastname41', 'password41', 6449),
('email42', 'firstname42', 'lastname42', 'password42', 1741),
('email43', 'firstname43', 'lastname43', 'password43', 669),
('email44', 'firstname44', 'lastname44', 'password44', 722),
('email45', 'firstname45', 'lastname45', 'password45', 4489),
('email46', 'firstname46', 'lastname46', 'password46', 9215),
('email47', 'firstname47', 'lastname47', 'password47', 1643),
('email48', 'firstname48', 'lastname48', 'password48', 7064),
('email49', 'firstname49', 'lastname49', 'password49', 7574),
('email50', 'firstname50', 'lastname50', 'password50', 7402),
('email51', 'firstname51', 'lastname51', 'password51', 2334),
('email52', 'firstname52', 'lastname52', 'password52', 5207),
('email53', 'firstname53', 'lastname53', 'password53', 5043),
('email54', 'firstname54', 'lastname54', 'password54', 6974),
('email55', 'firstname55', 'lastname55', 'password55', 745),
('email56', 'firstname56', 'lastname56', 'password56', 4954),
('email57', 'firstname57', 'lastname57', 'password57', 2689),
('email58', 'firstname58', 'lastname58', 'password58', 450),
('email59', 'firstname59', 'lastname59', 'password59', 6050),
('email60', 'firstname60', 'lastname60', 'password60', 1423),
('email61', 'firstname61', 'lastname61', 'password61', 5902),
('email62', 'firstname62', 'lastname62', 'password62', 1034),
('email63', 'firstname63', 'lastname63', 'password63', 8370),
('email64', 'firstname64', 'lastname64', 'password64', 9489),
('email65', 'firstname65', 'lastname65', 'password65', 9580),
('email66', 'firstname66', 'lastname66', 'password66', 3034),
('email67', 'firstname67', 'lastname67', 'password67', 3757),
('email68', 'firstname68', 'lastname68', 'password68', 9210),
('email69', 'firstname69', 'lastname69', 'password69', 412),
('email70', 'firstname70', 'lastname70', 'password70', 3748),
('email71', 'firstname71', 'lastname71', 'password71', 612),
('email72', 'firstname72', 'lastname72', 'password72', 334),
('email73', 'firstname73', 'lastname73', 'password73', 8325),
('email74', 'firstname74', 'lastname74', 'password74', 9205),
('email75', 'firstname75', 'lastname75', 'password75', 7890),
('email76', 'firstname76', 'lastname76', 'password76', 3000),
('email77', 'firstname77', 'lastname77', 'password77', 5457),
('email78', 'firstname78', 'lastname78', 'password78', 8594),
('email79', 'firstname79', 'lastname79', 'password79', 1847),
('email80', 'firstname80', 'lastname80', 'password80', 57),
('email81', 'firstname81', 'lastname81', 'password81', 2244),
('email82', 'firstname82', 'lastname82', 'password82', 3366),
('email83', 'firstname83', 'lastname83', 'password83', 8669),
('email84', 'firstname84', 'lastname84', 'password84', 9037),
('email85', 'firstname85', 'lastname85', 'password85', 2336),
('email86', 'firstname86', 'lastname86', 'password86', 8619),
('email87', 'firstname87', 'lastname87', 'password87', 6244),
('email88', 'firstname88', 'lastname88', 'password88', 5361),
('email89', 'firstname89', 'lastname89', 'password89', 2908),
('email90', 'firstname90', 'lastname90', 'password90', 649),
('email91', 'firstname91', 'lastname91', 'password91', 9769),
('email92', 'firstname92', 'lastname92', 'password92', 595),
('email93', 'firstname93', 'lastname93', 'password93', 8361),
('email94', 'firstname94', 'lastname94', 'password94', 9558),
('email95', 'firstname95', 'lastname95', 'password95', 9147),
('email96', 'firstname96', 'lastname96', 'password96', 9183),
('email97', 'firstname97', 'lastname97', 'password97', 9721),
('email98', 'firstname98', 'lastname98', 'password98', 8192),
('email99', 'firstname99', 'lastname99', 'password99', 8332),
('email100', 'firstname100', 'lastname100', 'password100', 5930);

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

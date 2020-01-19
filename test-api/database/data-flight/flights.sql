-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: localhost    Database: flights
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
-- Table structure for table `Booking`
--

DROP TABLE IF EXISTS `Booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Booking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Passenger_id` int(11) NOT NULL,
  `Flight_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Booking_Flight1_idx` (`Flight_id`),
  KEY `fk_Booking_Passenger_idx` (`Passenger_id`),
  CONSTRAINT `fk_Booking_Flight1` FOREIGN KEY (`Flight_id`) REFERENCES `Flight` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `fk_Booking_Passenger` FOREIGN KEY (`Passenger_id`) REFERENCES `Passenger` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
INSERT INTO `Booking` (`id`, `Passenger_id`, `Flight_id`) VALUES
(1, 21, 96),
(2, 57, 49),
(3, 83, 38),
(4, 80, 32),
(5, 6, 86),
(6, 5, 17),
(7, 46, 4),
(8, 26, 71),
(9, 73, 82),
(10, 29, 52),
(11, 4, 51),
(12, 50, 15),
(13, 37, 28),
(14, 51, 83),
(15, 8, 63),
(16, 89, 59),
(17, 90, 43),
(18, 60, 41),
(19, 24, 74),
(20, 6, 3),
(21, 32, 84),
(22, 98, 94),
(23, 81, 91),
(24, 3, 98),
(25, 68, 47),
(26, 88, 42),
(27, 68, 28),
(28, 95, 10),
(29, 44, 70),
(30, 25, 75),
(31, 75, 14),
(32, 5, 23),
(33, 37, 87),
(34, 71, 65),
(35, 52, 82),
(36, 41, 10),
(37, 98, 63),
(38, 87, 26),
(39, 94, 100),
(40, 86, 61),
(41, 59, 85),
(42, 10, 66),
(43, 16, 43),
(44, 22, 54),
(45, 66, 2),
(46, 48, 60),
(47, 63, 19),
(48, 23, 24),
(49, 78, 47),
(50, 53, 67),
(51, 42, 26),
(52, 17, 3),
(53, 42, 51),
(54, 85, 74),
(55, 60, 38),
(56, 72, 6),
(57, 78, 23),
(58, 22, 8),
(59, 19, 80),
(60, 30, 84),
(61, 16, 38),
(62, 98, 15),
(63, 71, 59),
(64, 21, 7),
(65, 25, 15),
(66, 14, 25),
(67, 57, 22),
(68, 55, 31),
(69, 47, 97),
(70, 53, 7),
(71, 64, 38),
(72, 97, 50),
(73, 81, 30),
(74, 72, 90),
(75, 36, 15),
(76, 11, 36),
(77, 72, 8),
(78, 99, 8),
(79, 95, 67),
(80, 74, 70),
(81, 37, 17),
(82, 85, 49),
(83, 87, 77),
(84, 24, 18),
(85, 59, 83),
(86, 87, 88),
(87, 66, 5),
(88, 86, 15),
(89, 55, 34),
(90, 89, 6),
(91, 48, 28),
(92, 6, 79),
(93, 15, 57),
(94, 41, 43),
(95, 26, 25),
(96, 84, 39),
(97, 80, 94),
(98, 10, 57),
(99, 40, 57),
(100, 71, 10);

--
-- Dumping data for table `Booking`
--

LOCK TABLES `Booking` WRITE;
/*!40000 ALTER TABLE `Booking` DISABLE KEYS */;
/*!40000 ALTER TABLE `Booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Flight`
--

DROP TABLE IF EXISTS `Flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Flight` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `start` varchar(255) NOT NULL,
  `end` varchar(255) NOT NULL,
  `time` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
INSERT INTO `Flight` (`id`, `start`, `end`, `time`) VALUES
(1, 'start1', 'end1', 'time1'),
(2, 'start2', 'end2', 'time2'),
(3, 'start3', 'end3', 'time3'),
(4, 'start4', 'end4', 'time4'),
(5, 'start5', 'end5', 'time5'),
(6, 'start6', 'end6', 'time6'),
(7, 'start7', 'end7', 'time7'),
(8, 'start8', 'end8', 'time8'),
(9, 'start9', 'end9', 'time9'),
(10, 'start10', 'end10', 'time10'),
(11, 'start11', 'end11', 'time11'),
(12, 'start12', 'end12', 'time12'),
(13, 'start13', 'end13', 'time13'),
(14, 'start14', 'end14', 'time14'),
(15, 'start15', 'end15', 'time15'),
(16, 'start16', 'end16', 'time16'),
(17, 'start17', 'end17', 'time17'),
(18, 'start18', 'end18', 'time18'),
(19, 'start19', 'end19', 'time19'),
(20, 'start20', 'end20', 'time20'),
(21, 'start21', 'end21', 'time21'),
(22, 'start22', 'end22', 'time22'),
(23, 'start23', 'end23', 'time23'),
(24, 'start24', 'end24', 'time24'),
(25, 'start25', 'end25', 'time25'),
(26, 'start26', 'end26', 'time26'),
(27, 'start27', 'end27', 'time27'),
(28, 'start28', 'end28', 'time28'),
(29, 'start29', 'end29', 'time29'),
(30, 'start30', 'end30', 'time30'),
(31, 'start31', 'end31', 'time31'),
(32, 'start32', 'end32', 'time32'),
(33, 'start33', 'end33', 'time33'),
(34, 'start34', 'end34', 'time34'),
(35, 'start35', 'end35', 'time35'),
(36, 'start36', 'end36', 'time36'),
(37, 'start37', 'end37', 'time37'),
(38, 'start38', 'end38', 'time38'),
(39, 'start39', 'end39', 'time39'),
(40, 'start40', 'end40', 'time40'),
(41, 'start41', 'end41', 'time41'),
(42, 'start42', 'end42', 'time42'),
(43, 'start43', 'end43', 'time43'),
(44, 'start44', 'end44', 'time44'),
(45, 'start45', 'end45', 'time45'),
(46, 'start46', 'end46', 'time46'),
(47, 'start47', 'end47', 'time47'),
(48, 'start48', 'end48', 'time48'),
(49, 'start49', 'end49', 'time49'),
(50, 'start50', 'end50', 'time50'),
(51, 'start51', 'end51', 'time51'),
(52, 'start52', 'end52', 'time52'),
(53, 'start53', 'end53', 'time53'),
(54, 'start54', 'end54', 'time54'),
(55, 'start55', 'end55', 'time55'),
(56, 'start56', 'end56', 'time56'),
(57, 'start57', 'end57', 'time57'),
(58, 'start58', 'end58', 'time58'),
(59, 'start59', 'end59', 'time59'),
(60, 'start60', 'end60', 'time60'),
(61, 'start61', 'end61', 'time61'),
(62, 'start62', 'end62', 'time62'),
(63, 'start63', 'end63', 'time63'),
(64, 'start64', 'end64', 'time64'),
(65, 'start65', 'end65', 'time65'),
(66, 'start66', 'end66', 'time66'),
(67, 'start67', 'end67', 'time67'),
(68, 'start68', 'end68', 'time68'),
(69, 'start69', 'end69', 'time69'),
(70, 'start70', 'end70', 'time70'),
(71, 'start71', 'end71', 'time71'),
(72, 'start72', 'end72', 'time72'),
(73, 'start73', 'end73', 'time73'),
(74, 'start74', 'end74', 'time74'),
(75, 'start75', 'end75', 'time75'),
(76, 'start76', 'end76', 'time76'),
(77, 'start77', 'end77', 'time77'),
(78, 'start78', 'end78', 'time78'),
(79, 'start79', 'end79', 'time79'),
(80, 'start80', 'end80', 'time80'),
(81, 'start81', 'end81', 'time81'),
(82, 'start82', 'end82', 'time82'),
(83, 'start83', 'end83', 'time83'),
(84, 'start84', 'end84', 'time84'),
(85, 'start85', 'end85', 'time85'),
(86, 'start86', 'end86', 'time86'),
(87, 'start87', 'end87', 'time87'),
(88, 'start88', 'end88', 'time88'),
(89, 'start89', 'end89', 'time89'),
(90, 'start90', 'end90', 'time90'),
(91, 'start91', 'end91', 'time91'),
(92, 'start92', 'end92', 'time92'),
(93, 'start93', 'end93', 'time93'),
(94, 'start94', 'end94', 'time94'),
(95, 'start95', 'end95', 'time95'),
(96, 'start96', 'end96', 'time96'),
(97, 'start97', 'end97', 'time97'),
(98, 'start98', 'end98', 'time98'),
(99, 'start99', 'end99', 'time99'),
(100, 'start100', 'end100', 'time100');

--
-- Dumping data for table `Flight`
--

LOCK TABLES `Flight` WRITE;
/*!40000 ALTER TABLE `Flight` DISABLE KEYS */;
/*!40000 ALTER TABLE `Flight` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Passenger`
--

DROP TABLE IF EXISTS `Passenger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Passenger` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
INSERT INTO `Passenger` (`id`, `firstname`, `lastname`) VALUES
(1, 'firstname1', 'lastname1'),
(2, 'firstname2', 'lastname2'),
(3, 'firstname3', 'lastname3'),
(4, 'firstname4', 'lastname4'),
(5, 'firstname5', 'lastname5'),
(6, 'firstname6', 'lastname6'),
(7, 'firstname7', 'lastname7'),
(8, 'firstname8', 'lastname8'),
(9, 'firstname9', 'lastname9'),
(10, 'firstname10', 'lastname10'),
(11, 'firstname11', 'lastname11'),
(12, 'firstname12', 'lastname12'),
(13, 'firstname13', 'lastname13'),
(14, 'firstname14', 'lastname14'),
(15, 'firstname15', 'lastname15'),
(16, 'firstname16', 'lastname16'),
(17, 'firstname17', 'lastname17'),
(18, 'firstname18', 'lastname18'),
(19, 'firstname19', 'lastname19'),
(20, 'firstname20', 'lastname20'),
(21, 'firstname21', 'lastname21'),
(22, 'firstname22', 'lastname22'),
(23, 'firstname23', 'lastname23'),
(24, 'firstname24', 'lastname24'),
(25, 'firstname25', 'lastname25'),
(26, 'firstname26', 'lastname26'),
(27, 'firstname27', 'lastname27'),
(28, 'firstname28', 'lastname28'),
(29, 'firstname29', 'lastname29'),
(30, 'firstname30', 'lastname30'),
(31, 'firstname31', 'lastname31'),
(32, 'firstname32', 'lastname32'),
(33, 'firstname33', 'lastname33'),
(34, 'firstname34', 'lastname34'),
(35, 'firstname35', 'lastname35'),
(36, 'firstname36', 'lastname36'),
(37, 'firstname37', 'lastname37'),
(38, 'firstname38', 'lastname38'),
(39, 'firstname39', 'lastname39'),
(40, 'firstname40', 'lastname40'),
(41, 'firstname41', 'lastname41'),
(42, 'firstname42', 'lastname42'),
(43, 'firstname43', 'lastname43'),
(44, 'firstname44', 'lastname44'),
(45, 'firstname45', 'lastname45'),
(46, 'firstname46', 'lastname46'),
(47, 'firstname47', 'lastname47'),
(48, 'firstname48', 'lastname48'),
(49, 'firstname49', 'lastname49'),
(50, 'firstname50', 'lastname50'),
(51, 'firstname51', 'lastname51'),
(52, 'firstname52', 'lastname52'),
(53, 'firstname53', 'lastname53'),
(54, 'firstname54', 'lastname54'),
(55, 'firstname55', 'lastname55'),
(56, 'firstname56', 'lastname56'),
(57, 'firstname57', 'lastname57'),
(58, 'firstname58', 'lastname58'),
(59, 'firstname59', 'lastname59'),
(60, 'firstname60', 'lastname60'),
(61, 'firstname61', 'lastname61'),
(62, 'firstname62', 'lastname62'),
(63, 'firstname63', 'lastname63'),
(64, 'firstname64', 'lastname64'),
(65, 'firstname65', 'lastname65'),
(66, 'firstname66', 'lastname66'),
(67, 'firstname67', 'lastname67'),
(68, 'firstname68', 'lastname68'),
(69, 'firstname69', 'lastname69'),
(70, 'firstname70', 'lastname70'),
(71, 'firstname71', 'lastname71'),
(72, 'firstname72', 'lastname72'),
(73, 'firstname73', 'lastname73'),
(74, 'firstname74', 'lastname74'),
(75, 'firstname75', 'lastname75'),
(76, 'firstname76', 'lastname76'),
(77, 'firstname77', 'lastname77'),
(78, 'firstname78', 'lastname78'),
(79, 'firstname79', 'lastname79'),
(80, 'firstname80', 'lastname80'),
(81, 'firstname81', 'lastname81'),
(82, 'firstname82', 'lastname82'),
(83, 'firstname83', 'lastname83'),
(84, 'firstname84', 'lastname84'),
(85, 'firstname85', 'lastname85'),
(86, 'firstname86', 'lastname86'),
(87, 'firstname87', 'lastname87'),
(88, 'firstname88', 'lastname88'),
(89, 'firstname89', 'lastname89'),
(90, 'firstname90', 'lastname90'),
(91, 'firstname91', 'lastname91'),
(92, 'firstname92', 'lastname92'),
(93, 'firstname93', 'lastname93'),
(94, 'firstname94', 'lastname94'),
(95, 'firstname95', 'lastname95'),
(96, 'firstname96', 'lastname96'),
(97, 'firstname97', 'lastname97'),
(98, 'firstname98', 'lastname98'),
(99, 'firstname99', 'lastname99'),
(100, 'firstname100', 'lastname100');

--
-- Dumping data for table `Passenger`
--

LOCK TABLES `Passenger` WRITE;
/*!40000 ALTER TABLE `Passenger` DISABLE KEYS */;
/*!40000 ALTER TABLE `Passenger` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-18  9:00:34


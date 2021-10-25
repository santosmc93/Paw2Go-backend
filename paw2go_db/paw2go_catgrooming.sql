CREATE DATABASE  IF NOT EXISTS `paw2go` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `paw2go`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: paw2go
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `catgrooming`
--

DROP TABLE IF EXISTS `catgrooming`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `catgrooming` (
  `catName` varchar(20) NOT NULL,
  `catbreed` varchar(30) NOT NULL,
  `catAge` int NOT NULL,
  `catAppointment` datetime NOT NULL,
  `extraInstructions` varchar(250) NOT NULL,
  PRIMARY KEY (`catName`,`catbreed`,`catAge`,`catAppointment`,`extraInstructions`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catgrooming`
--

LOCK TABLES `catgrooming` WRITE;
/*!40000 ALTER TABLE `catgrooming` DISABLE KEYS */;
INSERT INTO `catgrooming` VALUES ('Catia','Persian',5,'2021-11-08 10:45:00','She is used to have her hair groomed, so there shouldnt be a big deal'),('Gojira','Scottish fold',4,'2021-10-29 15:00:00','She likes to play with stuff, so she usually wants to put her paw on your hand, I hope it doesn´t gives you any trouble'),('Joe','Unknow',1,'2021-11-08 10:30:00','We don´t know what breed is he, we rescued him since he was a kitten and his hair is growing fast'),('Michiberto','Common',3,'2021-10-18 13:30:00','Once he falls asleep nothing wakes him up, I will try to bring him asleep'),('Sauron','Common',3,'2021-11-08 10:30:00','He can be quite aggresive whne he is in a bad mood, I will check how he´s doing before taking him to you, if it´s neccessary I will rescheduled the appointment');
/*!40000 ALTER TABLE `catgrooming` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-25 17:53:23

CREATE DATABASE  IF NOT EXISTS `hospital_management` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hospital_management`;
-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: hospital_management
-- ------------------------------------------------------
-- Server version	8.0.42

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
-- Table structure for table `emp_info`
--

DROP TABLE IF EXISTS `emp_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emp_info` (
  `NAME` varchar(30) DEFAULT NULL,
  `AGE` varchar(30) DEFAULT NULL,
  `PHONE_NUMBER` varchar(30) DEFAULT NULL,
  `SALARY` varchar(20) DEFAULT NULL,
  `GMAIL` varchar(20) DEFAULT NULL,
  `AADHAR_NUMBER` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp_info`
--

LOCK TABLES `emp_info` WRITE;
/*!40000 ALTER TABLE `emp_info` DISABLE KEYS */;
INSERT INTO `emp_info` VALUES ('Ashvin Dabhi','30','9016532456','30000','ashvin@gmail.com','575454356545'),('Ashvin Dabhi','30','9016532456','30000','ashvin@gmail.com','575454356545'),('dipak baraiya','40','9109532456','60000','dipak@gmail.com','574545356545'),('tarun vadher','30','9726532456','35000','tarun@gmail.com','909874356545'),('atul chag','32','832000456','45000','atul@gmail.com','878754256545'),('maulik dodeja','35','9013352456','37000','dodeja@gmail.com','575453236545'),('karan kaliya','33','9574232456','40000','karan@gmail.com','575450216545'),('viky mer','34','9017542456','45000','viky@gmail.com','575454156545'),('jatin mori','60','9000232456','80000','jatin@gmail.com','579874356545');
/*!40000 ALTER TABLE `emp_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-08-25 17:33:44

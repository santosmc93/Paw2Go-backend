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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id_product` int NOT NULL AUTO_INCREMENT,
  `product_name` varchar(250) NOT NULL,
  `product_description` varchar(250) NOT NULL,
  `product_price` decimal(10,0) NOT NULL,
  `url_image` varchar(200) NOT NULL,
  `for_dog` tinyint NOT NULL,
  `for_cat` tinyint NOT NULL,
  `product_qty` int NOT NULL,
  PRIMARY KEY (`id_product`,`product_name`,`product_description`,`product_price`,`url_image`,`for_dog`,`for_cat`,`product_qty`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (11,'Potaroma Electric Flopping Fish Cat Toy','Interactive Fun for Cats: every time your feline touches this cat kicker toy, the automatic built-in motion sensor kicks into action and the cat teaser fish moves in a wiggling way, intriguing your cat to kick and play',15,'https://m.media-amazon.com/images/I/71IxSLfzftL._AC_SL1500_.jpg',0,1,5),(13,'Seresto 2-Pack Flea and Tick Collar for Cats, 8-Month Cat Flea Collars',' Provides 8-months of continuous flea and tick preventionSeresto flea and tick collar for cats works through contact, so fleas and ticks do not have to bite your cat to die',60,'https://m.media-amazon.com/images/I/617g60Vr7pS._AC_SL1000_.jpg',0,1,10),(14,'Petstages Cat Tracks Cat Toy - Fun Levels of Interactive Play - Circle Track','MENTALLY ENGAGING TRACKS TOY: This interactive cat toy is designed with 3 levels of tracks and 3 brightly colored moving balls to attract kitty’s attention!',13,'https://m.media-amazon.com/images/I/71ZxCeZkjrL._AC_SL1500_.jpg',0,1,7),(15,'Amazon Basics Cat Condo Tree Tower with Hammock Bed and Scratching Post',' Elevated cat hammock with dual scratching post pillars; durable, long-lasting construction. Plush hammock provides a comfortable space for your cat to relax',25,'https://m.media-amazon.com/images/I/91uOGK5bQ5L._AC_SL1500_.jpg',0,1,6),(16,'Pet Republique Cat Nail Clippers – Professional Claw Trimmer for Cat','One of the best cat nail clippers / professional small animal nail clippers on the market. These nail clippers are designed for small breeds: kittens, cats, rabbits, puppy, chinchilla, guinea pig, and more. ',12,'https://m.media-amazon.com/images/I/81udd+vStBL._AC_SL1500_.jpg',0,1,20),(28,'Wall Entry Pet Door','PetSafe Extreme Weather Dog and Cat Door - Aluminum or Plastic Pet Door - Small, Medium, Large and X-Large',100,'https://http2.mlstatic.com/D_NQ_NP_865840-MLM47020532730_082021-O.webp',1,0,12),(29,'Wall Entry Pet Door','PetSafe Extreme Weather Dog and Cat Door - Aluminum or Plastic Pet Door - Small, Medium, Large and X-Large',100,'https://http2.mlstatic.com/D_NQ_NP_865840-MLM47020532730_082021-O.webp',0,1,12),(30,'Automatic Pet Feeder','Automatic Cat and Dog Food Dispenser, Programmable Digital Clock with Sleep Mode Function, 6 Cups Total Capacity, Easy to Clean and Tamper-Resistant Design',100,'https://http2.mlstatic.com/D_NQ_NP_619302-MLM43388755647_092020-O.webp',1,0,12),(31,'Automatic Pet Feeder','Automatic Cat and Dog Food Dispenser, Programmable Digital Clock with Sleep Mode Function, 6 Cups Total Capacity, Easy to Clean and Tamper-Resistant Design',100,'https://http2.mlstatic.com/D_NQ_NP_619302-MLM43388755647_092020-O.webp',0,1,12),(32,'Feeko Dog Chew Toys for Aggressive Chewers Large Breed','Non-Toxic Natural Rubber Long Lasting Indestructible Dog Toys, Tough Durable Puppy Chew Toy for Medium Large Dogs - Fun to Chew, Chase and Fetch',10,'https://www.gatostienda.es/pics/2021/02/10/juguetes-para-perrosjuguetes-para-morder-para-perrosmascota-juguetejuguetes-interactivos-para-perros-grandes-cachorros-gatos-etcrojo-53945.jpg',1,0,12),(33,'Dog leash','Dog Leash, 5 FT Durable Nylon Dog Leash with Comfortable Padded Handle, Highly Reflective Threads for Small and Medium Dogs',7,'https://m.media-amazon.com/images/I/510XDSxTEBL._AC_.jpg',1,0,12),(34,'Harness','Dog Harness No Pull, Walking Pet Harness with 2 Metal Rings and Handle Adjustable Reflective Breathable Oxford Soft Vest Easy Control Front Clip for Small Medium Large Dogs',20,'https://s.libertaddigital.com/2021/03/09/arnes-para-perro-eagloo-hcw-022-l-eu.jpg',1,0,12),(35,'Retractil Dog Leash','Retractable Dog Leash X-Small Breed, 10 ft Durable Pet Walking Leash for Extra Small Dogs/Cats/Small Animals up to 18 lbs, 360° Tangle Free, White',13,'https://www.rufusanddelilah.com/wp-content/uploads/2015/12/Depositphotos_27341579_s-2015.jpg',1,0,12),(36,'Cat Litter','Fresh Step Advanced Cat Litter, Clumping Cat Litter, 99.9% Dust-Free, Gain Scent, 37 lbs Total ( 2 Pack of 18.5 lb Boxes)',13,'https://images.heb.com/is/image/HEBGrocery/001614898',0,1,12),(37,'Pet Hair Remove','Dog & Cat Fur Remover with Self-Cleaning Base - Efficient Animal Hair Removal Tool - Perfect for Furniture, Couch, Carpet, Car Seat',25,'https://m.media-amazon.com/images/I/612Z0-SPMjL._AC_UL640_QL65_.jpg',0,1,12);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-25 17:53:22

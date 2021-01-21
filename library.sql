-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 21, 2021 at 08:27 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
CREATE TABLE IF NOT EXISTS `books` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(50) NOT NULL,
  `subject` varchar(50) NOT NULL,
  `category_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`book_id`),
  KEY `category_ID` (`category_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`book_id`, `book_name`, `subject`, `category_ID`) VALUES
(1, 'Limit250', 'Maths', 1),
(2, 'Rational Function', 'Maths', 2),
(3, 'Derivatives', 'Maths', 2),
(4, 'Complex', 'Function', 2),
(5, 'Maths', 'Maths', 1),
(6, 'Limit1', 'Maths', 1),
(7, 'Maths123', 'Maths', 2),
(8, 'Maths', 'Maths', 2),
(9, 'LimitDe', 'Maths', 1),
(10, 'ComplexNumber', 'Maths', 3),
(11, 'iNumber', 'Maths', 3),
(12, 'Limit1', 'Maths', 1),
(13, 'Limit320', 'Maths', 1),
(14, 'ComplexFunctioin', 'Maths', 2),
(15, 'OOPJava', 'Java', 4);

-- --------------------------------------------------------

--
-- Table structure for table `book_categories`
--

DROP TABLE IF EXISTS `book_categories`;
CREATE TABLE IF NOT EXISTS `book_categories` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book_categories`
--

INSERT INTO `book_categories` (`category_id`, `category_name`) VALUES
(1, 'Limit'),
(2, 'Function'),
(3, 'Complex Number'),
(4, 'Graph');

-- --------------------------------------------------------

--
-- Table structure for table `borrowed`
--

DROP TABLE IF EXISTS `borrowed`;
CREATE TABLE IF NOT EXISTS `borrowed` (
  `borrow_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_ID` int(11) NOT NULL,
  `book_ID` int(11) NOT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`borrow_id`),
  KEY `student_ID` (`student_ID`),
  KEY `book_ID` (`book_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `borrowed`
--

INSERT INTO `borrowed` (`borrow_id`, `student_ID`, `book_ID`, `date`) VALUES
(1, 1, 2, NULL),
(2, 3, 10, NULL),
(3, 4, 11, NULL),
(5, 6, 2, NULL),
(6, 5, 4, NULL),
(7, 30, 11, NULL),
(8, 16, 4, NULL),
(9, 17, 12, NULL),
(10, 18, 10, NULL),
(11, 19, 15, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `majors`
--

DROP TABLE IF EXISTS `majors`;
CREATE TABLE IF NOT EXISTS `majors` (
  `major_id` int(11) NOT NULL AUTO_INCREMENT,
  `major_name` varchar(50) NOT NULL,
  PRIMARY KEY (`major_id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `majors`
--

INSERT INTO `majors` (`major_id`, `major_name`) VALUES
(2, 'Computer Sciences'),
(4, 'E-Commerce'),
(6, 'Telecom & Networking');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
CREATE TABLE IF NOT EXISTS `students` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `major_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`student_id`),
  KEY `major_ID` (`major_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`student_id`, `first_name`, `last_name`, `gender`, `major_ID`) VALUES
(1, 'Posothea', 'Phen', 'Male', 4),
(2, 'Posothea', 'Phen', 'Male', 2),
(3, 'Sreyleap', 'Mor', 'Female', 4),
(4, 'John', 'Cena', 'Male', 6),
(5, 'Molika', 'Hong', 'Female', 6),
(6, 'Theara', 'Nol', 'Male', 2),
(7, 'Senghout', 'Ea', 'Male', 6),
(8, 'Sreyleap', 'Mor', 'F', 4),
(9, 'Ny', 'Sovann', 'Male', 4),
(10, 'Siengkim', 'Lain', 'Male', 6),
(11, 'Neymar', 'Jr', 'Male', 4),
(12, 'KokLim', 'Ou', 'male', 4),
(13, 'Cheangouy', 'Ou', 'M', 4),
(14, 'A', 'B', 'M', 2),
(15, 'C', 'D', 'M', 6),
(16, 'Sorn', 'Nget', 'Male', 4),
(17, 'Kolyaney', 'kuch', 'Female', 4),
(18, 'Sivly', 'Kong', 'Female', 4),
(19, 'Justin', 'Bieber', 'Male', 2);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

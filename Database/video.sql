-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 02, 2015 at 04:01 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `video`
--

-- --------------------------------------------------------

--
-- Table structure for table `cust`
--

CREATE TABLE IF NOT EXISTS `cust` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `email` varchar(100) NOT NULL,
  `age` int(11) NOT NULL,
  `address` varchar(200) NOT NULL,
  `telephone` int(10) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `cust`
--

INSERT INTO `cust` (`cid`, `name`, `email`, `age`, `address`, `telephone`, `password`) VALUES
(1, 'admin', 'admin@admin.com', 11, '12560', 123456789, 'admin'),
(2, 'Dishan Rajapaksha', 'dishan@gmail.com', 21, '12560', 382212345, '1234');

-- --------------------------------------------------------

--
-- Table structure for table `movie`
--

CREATE TABLE IF NOT EXISTS `movie` (
  `vid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `rate` int(11) NOT NULL,
  PRIMARY KEY (`vid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `movie`
--

INSERT INTO `movie` (`vid`, `title`, `rate`) VALUES
(1, 'Harry Potter and Sorcerer''s Stone', 600),
(2, 'Harry Potter and the Deathly Hallows', 600),
(3, 'Narnia', 400),
(4, 'Charlie and the Chocolate Factory', 300),
(5, 'Harry Potter and the Chamber of Secrets', 900),
(6, 'Alice in Wonderland', 800),
(7, 'Hobiit', 300);

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE IF NOT EXISTS `payment` (
  `cid` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(200) NOT NULL,
  `cnum` int(11) NOT NULL,
  `csv` int(11) NOT NULL,
  `ctype` varchar(100) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`cid`, `name`, `email`, `address`, `cnum`, `csv`, `ctype`) VALUES
(2, 'Dishan', 'dishan@dishan.com', '500', 123456789, 321, 'Visa');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE IF NOT EXISTS `reservation` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `total` double NOT NULL,
  `noofdays` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  `noofcopies` int(11) NOT NULL,
  `vid` int(11) NOT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`rid`, `name`, `total`, `noofdays`, `cid`, `noofcopies`, `vid`) VALUES
(1, ' Narnia', 0, 1, 2, 1, 2),
(2, 'Narnia', 400, 1, 2, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `video`
--

CREATE TABLE IF NOT EXISTS `video` (
  `VID` int(11) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(200) NOT NULL,
  `LANGUAGE` varchar(200) NOT NULL,
  `STATUS` varchar(200) NOT NULL,
  `DESCRIPTION` varchar(1000) NOT NULL,
  PRIMARY KEY (`VID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `video`
--

INSERT INTO `video` (`VID`, `TITLE`, `LANGUAGE`, `STATUS`, `DESCRIPTION`) VALUES
(1, 'Harry Potter and Sorcerer''s Stone', 'English', 'Available', 'Rescued from the outrageous neglect of his aunt and uncle, a young boy with a great destiny proves his worth while attending Hogwarts School of Witchcraft and Wizardry.'),
(2, 'Harry Potter and the Deathly Hallows', 'English', 'Available', 'As Harry races against time and evil to destroy the Horcruxes, he uncovers the existence of three most powerful objects in the wizarding world: the Deathly Hallows.'),
(3, 'Narnia', 'English', 'Available', 'Three kids travel through a wardrobe to the land of Narnia and learn of their destiny to free it with the guidance of a mystical lion.'),
(4, 'Charlie and the Chocolate Factory', 'English', 'Available', 'A young boy wins a tour through the most magnificent chocolate factory in the world, led by the world''s most unusual candy maker.'),
(5, 'Harry Potter and the Chamber of Secrets', 'English', 'Available', 'Harry ignores warnings not to return to Hogwarts, only to find the school plagued by a series of mysterious attacks and a strange voice haunting him.'),
(7, 'Hobiit', 'English', 'Not Available', 'Hobbits');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

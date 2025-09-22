-- phpMyAdmin SQL Dump
-- version 3.4.10.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Sep 20, 2025 at 04:58 AM
-- Server version: 5.5.20
-- PHP Version: 5.3.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `kalpesh`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE IF NOT EXISTS `book` (
  `bookId` int(5) NOT NULL,
  `bookName` varchar(255) DEFAULT NULL,
  `AuthorName` varchar(255) DEFAULT NULL,
  `price` int(15) DEFAULT NULL,
  `quantity` int(5) DEFAULT NULL,
  `netAmmount` int(20) DEFAULT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`bookId`, `bookName`, `AuthorName`, `price`, `quantity`, `netAmmount`) VALUES
(89, 'jbdfhj', 'jkbdsfjkb', 65, 4, 260),
(200, 'saurastrani rasadhar', 'zaverchand meghani', 300, 10, 3000);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
  `emp_id` int(5) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `gender` char(10) DEFAULT NULL,
  `emp_type` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`emp_id`, `name`, `gender`, `emp_type`, `department`) VALUES
(233, 'Darshan sankaliya', 'male', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `STUD_ID` varchar(5) DEFAULT NULL,
  `STUD_NAME` varchar(20) DEFAULT NULL,
  `STUD_ADD` varchar(20) DEFAULT NULL,
  `STUD_STD` int(5) DEFAULT NULL,
  `STUD_DOB` varchar(10) DEFAULT NULL,
  `STUD_EMAIL` varchar(50) DEFAULT NULL,
  `USERNAME` varchar(30) DEFAULT NULL,
  `PASSWORD` varchar(30) DEFAULT NULL,
  UNIQUE KEY `STUD_EMAIL` (`STUD_EMAIL`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`STUD_ID`, `STUD_NAME`, `STUD_ADD`, `STUD_STD`, `STUD_DOB`, `STUD_EMAIL`, `USERNAME`, `PASSWORD`) VALUES
('2', 'kalpesh bavaliya', 'hamapar', 0, '2025-09-09', 'kalpes@gmail.com', 'kalpesh', '123'),
('2323', 'kalpesh bavaliya', 'fgh', 0, '2025-09-02', 'kalpeddfs@gmail.com', '34343', '123');

-- --------------------------------------------------------

--
-- Table structure for table `studentdata`
--

CREATE TABLE IF NOT EXISTS `studentdata` (
  `roll` int(5) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentdata`
--

INSERT INTO `studentdata` (`roll`, `name`) VALUES
(1, 'kalpesh bavaliya'),
(2, 'anil baraiya'),
(3, 'dhruv degama'),
(42, 'mahesh bavaliya'),
(5, 'kalpo');

-- --------------------------------------------------------

--
-- Table structure for table `student_ragister`
--

CREATE TABLE IF NOT EXISTS `student_ragister` (
  `sNo` int(5) DEFAULT NULL,
  `sName` varchar(20) DEFAULT NULL,
  `sAddress` varchar(50) DEFAULT NULL,
  `sMobile` int(10) DEFAULT NULL,
  `sDOB` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_ragister`
--

INSERT INTO `student_ragister` (`sNo`, `sName`, `sAddress`, `sMobile`, `sDOB`) VALUES
(23, NULL, 'yujgyj', 66656, '2000-02-23');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int(5) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `mobile_number` int(10) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `address` text,
  `city` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `hobbies` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `user_name`, `mobile_number`, `email`, `password`, `address`, `city`, `gender`, `hobbies`) VALUES
(1, 'kalpesh', 98756652, 'kalpeshj@gmail.com', '244', 'paliyad', 'botad', 'male', 'Travelling'),
(2, 'sfgsd', 987566529, 'kalp9eshj@gmail', '244', 'paliyad', 'botad', 'male', NULL),
(123123, 'sfgsd3123', 987566523, 'kalpeshj@gmail', '244', 'paliyad', 'botad', 'male', 'Reading');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

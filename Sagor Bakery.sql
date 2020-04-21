-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2018 at 08:01 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sagor_bakery`
--

-- --------------------------------------------------------

--
-- Table structure for table `dealer`
--

CREATE TABLE `dealer` (
  `dealer_id` int(5) NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  `phone_no` varchar(15) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `due_balance` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dealer`
--

INSERT INTO `dealer` (`dealer_id`, `name`, `phone_no`, `address`, `due_balance`) VALUES
(2, 'sagor', '01740395560', 'kolabona, Rajshahi', 19552),
(3, 'Romim', '01564784269', 'Dhulaura,Rajshahi', 35490),
(4, 'Naznur', '01712610025', 'Bashbariya,Rajshahi', 40500),
(5, 'Milon', '01730905565', 'Chadlai,Rajshahi', 28000),
(6, 'Rubel', '01732986365', 'Kolapara,Rajshahi', 49000);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `product_id` int(10) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `unite_orice` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`product_id`, `name`, `unite_orice`) VALUES
(1, 'batter bun', 6),
(2, 'medium bun', 15),
(3, 'Large bun', 25),
(4, 'cake', 35),
(5, 'Coconat biscuit', 28),
(6, 'horlicks biscuit', 28),
(7, 'chocolate biscuit', 35),
(8, 'Salt biscuit', 35),
(9, 'Salt biscuit (small)', 25),
(10, 'toast', 30);

-- --------------------------------------------------------

--
-- Table structure for table `product_purchase`
--

CREATE TABLE `product_purchase` (
  `product_purchase_id` int(11) NOT NULL,
  `purchase_id` int(11) DEFAULT NULL,
  `product_name` varchar(20) DEFAULT NULL,
  `quantity` int(5) DEFAULT NULL,
  `total_price` float DEFAULT NULL,
  `unite_price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product_purchase`
--

INSERT INTO `product_purchase` (`product_purchase_id`, `purchase_id`, `product_name`, `quantity`, `total_price`, `unite_price`) VALUES
(2, 2, 'batter bun', 50, 250, 5),
(3, 2, 'Large bun', 20, 500, 25),
(4, 2, 'cake', 10, 350, 35),
(5, 2, 'horlicks biscuit', 30, 840, 28),
(6, 2, 'chocolate biscuit', 20, 700, 35),
(7, 2, 'toast', 30, 900, 30),
(8, 3, 'batter bun', 60, 300, 5),
(9, 3, 'medium bun', 40, 600, 15),
(10, 3, 'Large bun', 30, 750, 25),
(11, 3, 'cake', 25, 875, 35),
(12, 3, 'Coconat biscuit', 30, 840, 28),
(13, 3, 'chocolate biscuit', 30, 1050, 35),
(14, 3, 'Salt biscuit (small)', 30, 750, 25),
(15, 3, 'toast', 30, 900, 30),
(16, 4, 'batter bun', 50, 250, 5),
(17, 4, 'medium bun', 34, 510, 15),
(18, 4, 'Large bun', 29, 725, 25),
(19, 4, 'cake', 19, 665, 35),
(20, 4, 'Coconat biscuit', 25, 700, 28),
(21, 4, 'horlicks biscuit', 25, 700, 28),
(22, 4, 'chocolate biscuit', 30, 1050, 35),
(23, 4, 'toast', 15, 450, 30),
(24, 5, 'batter bun', 50, 250, 5),
(25, 5, 'medium bun', 40, 600, 15),
(26, 5, 'Large bun', 20, 500, 25),
(27, 5, 'cake', 25, 875, 35),
(28, 5, 'Coconat biscuit', 30, 840, 28),
(29, 5, 'horlicks biscuit', 25, 700, 28),
(30, 5, 'Salt biscuit (small)', 25, 625, 25),
(31, 5, 'chocolate biscuit', 25, 875, 35),
(32, 6, 'Large bun', 22, 550, 25),
(33, 6, 'cake', 28, 980, 35),
(34, 6, 'Coconat biscuit', 20, 560, 28);

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE `purchase` (
  `purchase_id` int(100) NOT NULL,
  `purchase_date` date DEFAULT NULL,
  `total_balance` float DEFAULT NULL,
  `submit_balance` float DEFAULT NULL,
  `due_balance` float DEFAULT NULL,
  `dealer_id` int(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchase`
--

INSERT INTO `purchase` (`purchase_id`, `purchase_date`, `total_balance`, `submit_balance`, `due_balance`, `dealer_id`) VALUES
(1, '2018-04-21', 110, 123, -13, 2),
(2, '2018-04-22', 3540, 3050, 490, 3),
(3, '2018-04-21', 6065, 7000, -935, 2),
(4, '2018-04-21', 5050, 6050, -1000, 5),
(5, '2018-04-21', 5265, 6265, -1000, 6),
(6, '2018-04-22', 2090, 3090, -1000, 5);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(15) NOT NULL,
  `upassword` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `upassword`) VALUES
('selim', '123456789');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dealer`
--
ALTER TABLE `dealer`
  ADD PRIMARY KEY (`dealer_id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`product_id`);

--
-- Indexes for table `product_purchase`
--
ALTER TABLE `product_purchase`
  ADD PRIMARY KEY (`product_purchase_id`),
  ADD KEY `purchase_id` (`purchase_id`);

--
-- Indexes for table `purchase`
--
ALTER TABLE `purchase`
  ADD PRIMARY KEY (`purchase_id`),
  ADD KEY `dealer_id` (`dealer_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dealer`
--
ALTER TABLE `dealer`
  MODIFY `dealer_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `product_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `product_purchase`
--
ALTER TABLE `product_purchase`
  MODIFY `product_purchase_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
--
-- AUTO_INCREMENT for table `purchase`
--
ALTER TABLE `purchase`
  MODIFY `purchase_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `product_purchase`
--
ALTER TABLE `product_purchase`
  ADD CONSTRAINT `product_purchase_ibfk_1` FOREIGN KEY (`purchase_id`) REFERENCES `purchase` (`purchase_id`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Constraints for table `purchase`
--
ALTER TABLE `purchase`
  ADD CONSTRAINT `purchase_ibfk_1` FOREIGN KEY (`dealer_id`) REFERENCES `dealer` (`dealer_id`) ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

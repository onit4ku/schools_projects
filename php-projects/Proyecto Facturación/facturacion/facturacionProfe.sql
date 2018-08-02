-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-07-2016 a las 18:56:11
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `facturacionprofe`
--
CREATE DATABASE IF NOT EXISTS `facturacionprofe` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `facturacionprofe`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `NIF_Cliente` varchar(9) CHARACTER SET latin1 NOT NULL,
  `Nombre_Cliente` varchar(30) CHARACTER SET latin1 NOT NULL,
  `Direccion_Cliente` varchar(100) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`NIF_Cliente`, `Nombre_Cliente`, `Direccion_Cliente`) VALUES
('c1', 'cliente1', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `Num_Factura` varchar(11) COLLATE utf8_bin NOT NULL,
  `Fecha_Factura` date NOT NULL,
  `IDR_Cliente` varchar(9) CHARACTER SET latin1 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`Num_Factura`, `Fecha_Factura`, `IDR_Cliente`) VALUES
('1', '0000-00-00', 'c1'),
('5', '0000-00-00', 'C1'),
('8', '0000-00-00', 'C1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `linea`
--

CREATE TABLE `linea` (
  `ID_Linea` int(11) NOT NULL,
  `Cantidad_Linea` int(11) NOT NULL,
  `Precio_Linea` double NOT NULL,
  `IDR_Factura` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `IDR_Producto` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `linea`
--

INSERT INTO `linea` (`ID_Linea`, `Cantidad_Linea`, `Precio_Linea`, `IDR_Factura`, `IDR_Producto`) VALUES
(15, 2, 23, '1', 1),
(16, 2, 23, '1', 1),
(17, 2, 23, '1', 1),
(18, 4, 567, '1', 1),
(19, 4, 567, '1', 1),
(20, 3, 45, '5', 1),
(21, 6, 30, '5', 1),
(22, 3, 2, '8', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `ID_Producto` int(11) NOT NULL,
  `Nombre_Producto` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `Precio_Producto` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`ID_Producto`, `Nombre_Producto`, `Precio_Producto`) VALUES
(1, 'p1', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`NIF_Cliente`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`Num_Factura`),
  ADD KEY `idr_cliente` (`IDR_Cliente`);

--
-- Indices de la tabla `linea`
--
ALTER TABLE `linea`
  ADD PRIMARY KEY (`ID_Linea`),
  ADD KEY `idr_factura` (`IDR_Factura`),
  ADD KEY `idr_producto` (`IDR_Producto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`ID_Producto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `linea`
--
ALTER TABLE `linea`
  MODIFY `ID_Linea` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `ID_Producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`IDR_Cliente`) REFERENCES `cliente` (`NIF_Cliente`);

--
-- Filtros para la tabla `linea`
--
ALTER TABLE `linea`
  ADD CONSTRAINT `linea_ibfk_2` FOREIGN KEY (`IDR_Producto`) REFERENCES `producto` (`ID_Producto`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

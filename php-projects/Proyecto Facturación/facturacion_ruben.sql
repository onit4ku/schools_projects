-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-09-2016 a las 20:04:12
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `facturacion_ruben`
--

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
('12345678K', 'Fulano', 'Calle Falsa 123'),
('213456742', 'Ruben', 'Calle Pepinillo 124'),
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
('12', '2016-07-28', '12345678K'),
('122331', '2016-07-28', '12345678K'),
('1223311', '2016-07-28', '12345678K'),
('12233112', '2016-07-28', '12345678K'),
('122331124', '2016-07-28', '12345678K'),
('1223311248', '2016-07-28', '12345678K'),
('12321312', '2016-07-28', '12345678K'),
('1234214r', '2016-07-28', '12345678K'),
('1245353', '2016-07-28', 'c1'),
('124535322', '2016-07-28', 'c1'),
('13', '2016-07-28', '12345678K'),
('132143114', '2016-07-28', '12345678K'),
('133', '2016-07-28', '12345678K'),
('142412', '2016-07-28', '12345678K'),
('143135', '2016-07-28', '12345678K'),
('15123', '2016-07-28', '12345678K'),
('2135', '2016-07-28', '12345678K'),
('3', '2016-07-28', '12345678K'),
('31', '2016-07-28', '12345678K'),
('321312', '2016-07-28', '12345678K'),
('352', '2016-07-28', '213456742'),
('4', '2016-07-28', '12345678K'),
('41', '2016-07-28', '213456742'),
('412', '2016-07-28', '12345678K'),
('457745', '2016-07-28', '12345678K'),
('46546', '2016-07-28', '213456742'),
('465462', '2016-07-28', '213456742'),
('5', '2016-07-28', 'c1'),
('523', '2016-07-28', '213456742'),
('6', '2016-07-28', '12345678K');

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
(22, 3, 2, '8', 1),
(23, 1, 1.5, '4', 1),
(24, 1, 1.5, '4', 1),
(25, 1, 1.5, '4', 1),
(26, 4, 2.5, '6', 1),
(27, 23, 23, '41', 2),
(28, 23, 23, '41', 2),
(29, 23, 23, '41', 2),
(30, 23, 23, '41', 2),
(31, 0, 0, '124535322', 1),
(32, 0, 0, '124535322', 1),
(33, 0, 0, '124535322', 1),
(34, 0, 0, '124535322', 1),
(35, 0, 0, '124535322', 1),
(36, 0, 0, '124535322', 1),
(37, 0, 0, '124535322', 1),
(38, 0, 0, '124535322', 1),
(39, 123, 123, '12321312', 2),
(40, 0, 41, '1234214r', 2),
(41, 0, 456, '457745', 5),
(42, 0, 0, '457745', 1),
(43, 0, 0, '457745', 1),
(44, 0, 0, '457745', 1),
(45, 0, 321, '132143114', 1),
(46, 214, 123, '523', 1),
(47, 214, 123, '523', 1),
(48, 214, 123, '523', 1),
(49, 214, 123, '523', 1),
(50, 0, 21321, '142412', 1),
(51, 0, 123, '321312', 1),
(52, 241, 123, '352', 5),
(53, 1, 234, '352', 1),
(54, 124, 3213, '352', 1),
(55, 1, 1.5, '', 1),
(56, 1, 1.5, '', 1),
(57, 321, 1, '', 1),
(58, 0, 2, '', 2),
(59, 0, 0, '', 2),
(60, 1, 1, '', 5),
(61, 1, 12, '31', 1),
(62, 1, 12, '31', 1),
(63, 0, 1, '31', 2),
(64, 0, 1, '31', 2),
(65, 0, 1, '31', 2),
(66, 0, 0, '', 2),
(67, 0, 0, '', 1),
(68, 1, 12, '', 1),
(69, 1, 1, '143135', 1),
(70, 1, 1, '143135', 2),
(71, 1, 1, '143135', 5),
(72, 1, 23, '2135', 2),
(73, 0, 0, '', 2),
(74, 0, 0, '', 1),
(75, 0, 0, '', 1),
(76, 0, 0, '', 1),
(77, 0, 0, '', 1),
(78, 0, 0, '', 1),
(79, 0, 0, '', 1),
(80, 0, 0, '', 1),
(81, 0, 0, '', 1),
(82, 0, 0, '', 1);

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
(1, 'p1', 0),
(2, 'Portaminas', 1.5),
(5, 'Lapiz', 1),
(7, '', 0);

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
  MODIFY `ID_Linea` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=83;
--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `ID_Producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
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

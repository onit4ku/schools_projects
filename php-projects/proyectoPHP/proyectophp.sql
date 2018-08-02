-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-02-2014 a las 19:38:06
-- Versión del servidor: 5.6.14
-- Versión de PHP: 5.5.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `proyectophp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `albaranes`
--

CREATE TABLE IF NOT EXISTS `albaranes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_albaran` date DEFAULT NULL,
  `fecha_vencimiento` date DEFAULT NULL,
  `facturado` varchar(20) COLLATE latin1_spanish_ci DEFAULT NULL,
  `fk_contrato` int(11) DEFAULT NULL,
  `nvencimiento` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci AUTO_INCREMENT=49 ;

--
-- Volcado de datos para la tabla `albaranes`
--

INSERT INTO `albaranes` (`id`, `fecha_albaran`, `fecha_vencimiento`, `facturado`, `fk_contrato`, `nvencimiento`) VALUES
(42, '2014-02-20', '2014-02-28', 'Facturado', 23, 3),
(43, '2014-02-20', '2014-02-27', 'Facturado', 24, 2),
(44, '2014-02-28', '2014-03-08', 'Facturado', 25, 1),
(45, '2013-12-23', '2014-02-03', 'No Facturado', 23, 2),
(46, '2013-03-31', '2014-02-26', 'Facturado', 23, 1),
(48, '2014-02-27', '2014-02-27', 'No Facturado', 26, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `empresa` varchar(50) NOT NULL,
  `cif_nif` varchar(50) NOT NULL,
  `contacto` varchar(50) NOT NULL,
  `domicilio` varchar(50) NOT NULL,
  `fk_provincia` int(11) NOT NULL,
  `poblacion` varchar(50) NOT NULL,
  `cp` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `fax` varchar(50) NOT NULL,
  `movil` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `fecha` date NOT NULL,
  `num_cuenta` varchar(50) NOT NULL,
  `forma_pago` varchar(50) NOT NULL,
  `observaciones` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_provincia` (`fk_provincia`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id`, `empresa`, `cif_nif`, `contacto`, `domicilio`, `fk_provincia`, `poblacion`, `cp`, `telefono`, `fax`, `movil`, `email`, `fecha`, `num_cuenta`, `forma_pago`, `observaciones`) VALUES
(8, 'From Software', '153154256-K', 'Iwata', 'Akiba', 1, 'Valencia', '46020', '96535125', '', '656464612', 'frotn2@gmas.com', '2008-01-20', '1000-222-22-55', 'Paypal', 'Ninguna '),
(13, 'Microsoft Redmond', '2245181df78', 'Dpto Cliente 12', 'Redmond Kansas', 2, 'Third Street', '228041', '9124511235', '9124511239', '639152426', 'fordasd@redmond.com', '2012-08-05', '516541-2151-262', 'Transferencia Bancaria', 'Se retrasa  '),
(14, 'Sony Entertainment', '515641561df', 'Howard', 'C/Sonier123', 48, 'Valencia', '22834', '9612215151', '', '651445151', 'carfasd@mail.com', '1999-11-25', '5611-151-12512', 'Domiciliacion bancaria', 'fanboy'),
(15, 'Konami', '564156456d', 'afae', 'C/ronda 123', 29, 'Lugo', '438041', '9124511235', '9124511239', '666999666', 'tron123@gmail.com', '2014-01-15', '1000-222-22-55', 'Domiciliacion bancaria', 'Dia 1'),
(16, 'EA Games', '5546413561ds', 'Richard', 'C/oxigeno', 11, 'Cuarto de pueblo', '', '9166651651', '9724511239', '656964612', 'a12nd3@gmail.com', '2010-11-27', '1000-222-22-55', 'Transferencia Bancaria', 'Dia 15'),
(17, 'Eidos', '12312455k', 'Europe', 'Peter chow 12', 4, 'Almeria', '12405', '91234553', '', '676621025', '', '2012-02-01', '51546-2151-262', 'Paypal', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comercial`
--

CREATE TABLE IF NOT EXISTS `comercial` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `movil` varchar(50) NOT NULL,
  `email` varchar(40) NOT NULL,
  `observaciones` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `comercial`
--

INSERT INTO `comercial` (`id`, `nombre`, `apellidos`, `telefono`, `movil`, `email`, `observaciones`) VALUES
(1, 'Samus', 'Aran', '64521025', '64521025', 'mai123l@gmail.com', 'Deleg2'),
(2, 'Link', 'de Hyrule', '95262165', '612132321', 'sasas@hona.com', 'Hate Ganon'),
(3, 'Mario', 'Plumber', '961565132', '661155555', 'domnig@mail.com', 'Fontanero'),
(4, 'Master', 'Chief', '9166651651', '6611515222', 'halo@gmail.com', 'No cocina'),
(5, 'Ape', 'Escape', '9126616526', '62341441561', 'orochi@gmail.com', 'Monos'),
(6, 'Luigi', 'Plumber', '956415122', '663451121', 'Luigi@amail.com', 'Fontanero');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE IF NOT EXISTS `compras` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `iva` int(11) NOT NULL,
  `forma_pago` varchar(500) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `num_vencimiento` int(11) NOT NULL,
  `pagado` varchar(20) NOT NULL,
  `fecha_compra` date NOT NULL,
  `fk_proveedor` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_proveedor` (`fk_proveedor`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `compras`
--

INSERT INTO `compras` (`id`, `iva`, `forma_pago`, `num_vencimiento`, `pagado`, `fecha_compra`, `fk_proveedor`) VALUES
(1, 10, 'Banco', 2, 'Pagado', '2014-02-11', 4),
(2, 15, 'Paypal', 3, 'No Pagado', '2014-02-01', 6),
(3, 15, 'Transferencia Bancaria', 3, 'Pagado', '2014-02-24', 5),
(4, 23, 'Al contado', 3, 'No Pagado', '2014-02-21', 4),
(5, 15, 'Al contado', 1, 'Pagado', '2014-02-24', 4),
(6, 13, 'Banco', 2, 'Pagado', '2014-02-26', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contratos`
--

CREATE TABLE IF NOT EXISTS `contratos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `iva` int(11) DEFAULT NULL,
  `fecha_contrato` date DEFAULT NULL,
  `forma_pago` varchar(30) CHARACTER SET latin1 COLLATE latin1_spanish_ci DEFAULT NULL,
  `nvencimiento` int(11) DEFAULT NULL,
  `clausulas` varchar(5000) CHARACTER SET latin1 COLLATE latin1_spanish_ci DEFAULT NULL,
  `fk_cliente` int(11) DEFAULT NULL,
  `fk_contrato` int(11) DEFAULT NULL,
  `fk_comercial` int(11) DEFAULT NULL,
  `fk_estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=28 ;

--
-- Volcado de datos para la tabla `contratos`
--

INSERT INTO `contratos` (`id`, `iva`, `fecha_contrato`, `forma_pago`, `nvencimiento`, `clausulas`, `fk_cliente`, `fk_contrato`, `fk_comercial`, `fk_estado`) VALUES
(23, 23, '2014-02-20', 'Domiciliado', 3, '"Para la solucion de cualquier conflicto o cuestion litigiosa derivada de este contrato o acto juridico, incluidos los que de ellos se deriven, asi como su validez, las partes se someten al arbitraje institucional del Tribunal Arbitral de Barcelona, de la Asociacion Catalana para el Arbitraje, (TAB),-cualquiera que fuera su denominacion futura- a quien se encomienda la designacion del arbitro o arbitros y la administracion del arbitraje de acuerdo con su Reglamento vigente al inicio del arbitraje".', 13, 21, 1, 0),
(24, 50, '2014-02-20', 'Al contado', 2, '"Para la solucion de cualquier conflicto o cuestion litigiosa derivada de este contrato o acto juridico, incluidos los que de ellos se deriven, asi como su validez, las partes se someten al arbitraje institucional del Tribunal Arbitral de Barcelona, de la Asociacion Catalana para el Arbitraje, (TAB),-cualquiera que fuera su denominacion futura- a quien se encomienda la designacion del arbitro o arbitros y la administracion del arbitraje de acuerdo con su Reglamento vigente al inicio del arbitraje".', 14, 20, 1, 0),
(25, 15, '2014-02-21', 'Domiciliado', 2, '"Para la solucion de cualquier conflicto o cuestion litigiosa derivada de este contrato o acto juridico, incluidos los que de ellos se deriven, asi como su validez, las partes se someten al arbitraje institucional del Tribunal Arbitral de Barcelona, de la Asociacion Catalana para el Arbitraje, (TAB),-cualquiera que fuera su denominacion futura- a quien se encomienda la designacion del arbitro o arbitros y la administracion del arbitraje de acuerdo con su Reglamento vigente al inicio del arbitraje".', 14, 23, 3, 0),
(26, 23, '2014-02-25', 'Al contado', 3, '"Para la solucion de cualquier conflicto o cuestion litigiosa derivada de este contrato o acto juridico, incluidos los que de ellos se deriven, asi como su validez, las partes se someten al arbitraje institucional del Tribunal Arbitral de Barcelona, de la Asociacion Catalana para el Arbitraje, (TAB),-cualquiera que fuera su denominacion futura- a quien se encomienda la designacion del arbitro o arbitros y la administracion del arbitraje de acuerdo con su Reglamento vigente al inicio del arbitraje".', 16, 25, 5, 1),
(27, 23, '2014-02-27', 'Al contado', 2, '"Para la solucion de cualquier conflicto o cuestion litigiosa derivada de este contrato o acto juridico, incluidos los que de ellos se deriven, asi como su validez, las partes se someten al arbitraje institucional del Tribunal Arbitral de Barcelona, de la Asociacion Catalana para el Arbitraje, (TAB),-cualquiera que fuera su denominacion futura- a quien se encomienda la designacion del arbitro o arbitros y la administracion del arbitraje de acuerdo con su Reglamento vigente al inicio del arbitraje".', 15, NULL, 3, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE IF NOT EXISTS `facturas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `numero` int(11) DEFAULT NULL,
  `fecha_factura` date DEFAULT NULL,
  `cobro` varchar(20) CHARACTER SET latin1 COLLATE latin1_spanish_ci DEFAULT NULL,
  `fk_albaran` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Volcado de datos para la tabla `facturas`
--

INSERT INTO `facturas` (`id`, `numero`, `fecha_factura`, `cobro`, `fk_albaran`) VALUES
(16, 7, '2014-02-24', 'Cobrado', 41),
(17, 8, '2014-02-24', 'No Cobrado', 38),
(18, 9, '2014-02-24', 'Cobrado', 41),
(19, 10, '2014-02-28', 'No Cobrado', 44),
(20, 2, '2014-02-28', 'No Cobrado', 42);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lineas_compra`
--

CREATE TABLE IF NOT EXISTS `lineas_compra` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_proveedor` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `concepto` varchar(40) DEFAULT NULL,
  `importe` float DEFAULT NULL,
  `fk_compra` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Volcado de datos para la tabla `lineas_compra`
--

INSERT INTO `lineas_compra` (`id`, `fk_proveedor`, `fecha`, `concepto`, `importe`, `fk_compra`) VALUES
(5, 2, '2014-02-16', 'Pack Tarrina 1000', 100, 1),
(6, 6, '2014-02-28', 'Hyrule Historia', 20, 2),
(7, 6, '2014-03-29', 'Guantes Heike', 15000, 3),
(8, 5, '2014-02-03', 'Cola de fenix', 200, 3),
(9, 5, '2014-02-03', 'Panacea', 15, 3),
(10, 4, '2014-02-24', 'Tarrina Bulk 50', 34, 5),
(11, 1, '2014-02-26', 'discos', 123, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lineas_contrato`
--

CREATE TABLE IF NOT EXISTS `lineas_contrato` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_proveedor` int(11) DEFAULT NULL,
  `f_publicacion` date DEFAULT NULL,
  `concepto` varchar(50) DEFAULT NULL,
  `importe` float DEFAULT NULL,
  `fk_contratos` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=34 ;

--
-- Volcado de datos para la tabla `lineas_contrato`
--

INSERT INTO `lineas_contrato` (`id`, `fk_proveedor`, `f_publicacion`, `concepto`, `importe`, `fk_contratos`) VALUES
(6, 4, '2014-02-14', 'sdfsdfds', 4454, 7),
(10, 1, '1978-01-22', 'Alquiler 02', 100, 12),
(11, 1, '2014-02-21', 'Discos B', 100, 13),
(14, 4, '2014-02-22', 'Chuches', 1234570, 15),
(15, 6, '2014-02-28', 'Pie de pÃ¡gina', 250, 16),
(16, 7, '2014-03-19', 'Primera pÃ¡gina', 500, 17),
(17, 7, '2014-03-19', 'Caja Grande', 500, 17),
(18, 1, '2014-02-20', '652258', 460, 18),
(19, 1, '2014-02-20', 'Asadero', 320, 18),
(20, 1, '2014-02-19', 'dfsdf', 200, 19),
(21, 6, '1970-01-01', 'Libin', 205, 20),
(22, 6, '1970-01-01', 'Disco Stu', 205, 20),
(23, 6, '1970-01-01', 'Apartamento 01', 205, 20),
(24, 1, '1978-01-19', 'sdfsdf', 50, 21),
(25, 6, '2014-02-19', 'Local Comercial', 414, 21),
(26, 1, '2014-02-19', 'srtyrty', 851, 21),
(27, 1, '2014-02-19', 'Harem', 200, 22),
(28, 1, '2014-02-20', 'Contrato1', 520, 23),
(29, 6, '2014-02-28', 'Contrat 1-2', 250, 23),
(30, 1, '2014-02-21', 'setdg', 100, 24),
(31, 6, '2014-02-22', 'Proten', 150, 24),
(32, 1, '0000-00-00', 'Gears', 1222, 25),
(33, 6, '2014-02-25', 'Smash', 123, 26);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cif_nif` varchar(500) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `nombre` varchar(500) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `contacto` varchar(500) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `telefono` varchar(500) NOT NULL,
  `fax` varchar(500) NOT NULL,
  `movil` varchar(500) NOT NULL,
  `email` varchar(500) NOT NULL,
  `observaciones` varchar(800) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`id`, `cif_nif`, `nombre`, `contacto`, `telefono`, `fax`, `movil`, `email`, `observaciones`) VALUES
(1, '12345112', 'Verbatim', 'Risk', '91923345', '912314256', '654567756', 'verba@gmail.com', ' '),
(2, '12412344', 'Princo', 'Blando', '94215441', '', '651121244', 'raba@gmail.com', '   '),
(4, '2113635612d', 'Natek', 'Info', '651512121', '', '', 'gumer@mail.com', ' '),
(5, '44552454N', 'Edea ProVender', 'Lestato', '962151451', '', '622151551', 'fer@fadfs.com', ' '),
(6, '12345112d', 'Zelda', 'Ruta del calcetin', '916151631', '6516516151', '651561561', 'tloz@gmail.com', 'Veloz');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provincias`
--

CREATE TABLE IF NOT EXISTS `provincias` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=53 ;

--
-- Volcado de datos para la tabla `provincias`
--

INSERT INTO `provincias` (`id`, `nombre`) VALUES
(1, 'Alava'),
(2, 'Albacete'),
(3, 'Alicante'),
(4, 'Almeria'),
(5, 'Asturias'),
(6, 'Avila'),
(7, 'Badajoz'),
(8, 'Baleares'),
(9, 'Barcelona'),
(10, 'Burgos'),
(11, 'Caceres'),
(12, 'Cadiz'),
(13, 'Cantabria'),
(14, 'Castellon'),
(15, 'Ceuta'),
(16, 'Ciudad Real'),
(17, 'Cordoba'),
(18, 'La Corunya'),
(19, 'Cuenca'),
(20, 'Gerona'),
(21, 'Granada'),
(22, 'Guadalajara'),
(23, 'Guipuzcoa'),
(24, 'Huelva'),
(25, 'Huesca'),
(26, 'Jaen'),
(27, 'Leon'),
(28, 'Lerida'),
(29, 'Lugo'),
(30, 'Madrid'),
(31, 'Malaga'),
(32, 'Melilla'),
(33, 'Murcia'),
(34, 'Navarra'),
(35, 'Orense'),
(36, 'Palencia'),
(37, 'Las Palmas'),
(38, 'Pontevedra'),
(39, 'La Rioja'),
(40, 'Salamanca'),
(41, 'Sta. Cruz de Tenerife'),
(42, 'Segovia'),
(43, 'Sevilla'),
(44, 'Soria'),
(45, 'Tarragona'),
(46, 'Teruel'),
(47, 'Toledo'),
(48, 'Valencia'),
(49, 'Valladolid'),
(50, 'Vizcaya'),
(51, 'Zamora'),
(52, 'Zaragoza');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `password`) VALUES
(1, 'admin', '123'),
(2, 'onitaku', 'warcraft');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compras`
--
ALTER TABLE `compras`
  ADD CONSTRAINT `compras_ibfk_1` FOREIGN KEY (`fk_proveedor`) REFERENCES `proveedor` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

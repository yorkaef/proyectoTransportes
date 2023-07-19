-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-07-2023 a las 17:59:57
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `basetransporte`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bus`
--

CREATE TABLE `bus` (
  `busid` char(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `capacidad` int(11) DEFAULT NULL,
  `matricula` varchar(45) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `choferid` char(5) NOT NULL,
  `categoriaid` char(5) NOT NULL,
  `terminaldestinoid` char(5) NOT NULL,
  `terminalorigenid` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `categoriaid` char(5) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `chofer`
--

CREATE TABLE `chofer` (
  `choferid` char(5) NOT NULL,
  `dni` char(8) DEFAULT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellidoMaterno` varchar(30) DEFAULT NULL,
  `apellidoPaterno` varchar(30) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `estadoCivil` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudaddestino`
--

CREATE TABLE `ciudaddestino` (
  `ciudaddestinoid` char(5) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `codigoPostal` varchar(20) DEFAULT NULL,
  `provincia` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadorigen`
--

CREATE TABLE `ciudadorigen` (
  `ciudadorigenid` char(5) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `codigoPostal` varchar(20) DEFAULT NULL,
  `provincia` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasaje`
--

CREATE TABLE `pasaje` (
  `pasajeid` char(5) NOT NULL,
  `horasalida` varchar(10) DEFAULT NULL,
  `fechasalida` date DEFAULT NULL,
  `estado` varchar(15) DEFAULT NULL,
  `busid` char(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasajero`
--

CREATE TABLE `pasajero` (
  `dni` char(8) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellidoMaterno` varchar(30) DEFAULT NULL,
  `apellidoPaterno` varchar(30) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `edad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `terminaldestino`
--

CREATE TABLE `terminaldestino` (
  `terminaldestinoid` char(5) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `ciudaddestinoid` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `terminalorigen`
--

CREATE TABLE `terminalorigen` (
  `terminalorigenid` char(5) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `ciudadorigenid` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `clave` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `nombre`, `clave`) VALUES
(2, 'yorkaef', 'yorkaeff'),
(3, 'yorkaef1', 'yorkaef2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventapasaje`
--

CREATE TABLE `ventapasaje` (
  `ventapasajeid` char(5) NOT NULL,
  `fecha` date DEFAULT NULL,
  `precio` decimal(9,2) DEFAULT NULL,
  `asiento` int(11) NOT NULL,
  `pasajeid` char(5) NOT NULL,
  `dni` char(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bus`
--
ALTER TABLE `bus`
  ADD PRIMARY KEY (`busid`,`choferid`,`categoriaid`,`terminaldestinoid`,`terminalorigenid`),
  ADD UNIQUE KEY `matricula_UNIQUE` (`matricula`),
  ADD KEY `fk_Bus_Chofer_idx` (`choferid`),
  ADD KEY `fk_Bus_Terminal1_idx` (`terminaldestinoid`),
  ADD KEY `fk_Bus_TerminalOrigen1_idx` (`terminalorigenid`),
  ADD KEY `fk_Bus_table11_idx` (`categoriaid`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`categoriaid`);

--
-- Indices de la tabla `chofer`
--
ALTER TABLE `chofer`
  ADD PRIMARY KEY (`choferid`),
  ADD UNIQUE KEY `dni_UNIQUE` (`dni`);

--
-- Indices de la tabla `ciudaddestino`
--
ALTER TABLE `ciudaddestino`
  ADD PRIMARY KEY (`ciudaddestinoid`);

--
-- Indices de la tabla `ciudadorigen`
--
ALTER TABLE `ciudadorigen`
  ADD PRIMARY KEY (`ciudadorigenid`),
  ADD UNIQUE KEY `codigoPostal_UNIQUE` (`codigoPostal`);

--
-- Indices de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD PRIMARY KEY (`pasajeid`,`busid`),
  ADD KEY `fk_Pasaje_Bus1_idx` (`busid`);

--
-- Indices de la tabla `pasajero`
--
ALTER TABLE `pasajero`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `terminaldestino`
--
ALTER TABLE `terminaldestino`
  ADD PRIMARY KEY (`terminaldestinoid`,`ciudaddestinoid`),
  ADD UNIQUE KEY `email_UNIQUE` (`email`),
  ADD KEY `fk_TerminalDestino_CiudadDestino1_idx` (`ciudaddestinoid`);

--
-- Indices de la tabla `terminalorigen`
--
ALTER TABLE `terminalorigen`
  ADD PRIMARY KEY (`terminalorigenid`,`ciudadorigenid`),
  ADD UNIQUE KEY `email_UNIQUE` (`email`),
  ADD KEY `fk_TerminalOrigen_Ciudad1_idx` (`ciudadorigenid`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`);

--
-- Indices de la tabla `ventapasaje`
--
ALTER TABLE `ventapasaje`
  ADD PRIMARY KEY (`ventapasajeid`,`pasajeid`,`dni`),
  ADD UNIQUE KEY `asiento_UNIQUE` (`asiento`),
  ADD KEY `fk_VentaPasaje_Pasaje1_idx` (`pasajeid`),
  ADD KEY `fk_VentaPasaje_Pasajero1_idx` (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bus`
--
ALTER TABLE `bus`
  ADD CONSTRAINT `fk_Bus_Chofer` FOREIGN KEY (`choferid`) REFERENCES `chofer` (`choferid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Bus_Terminal1` FOREIGN KEY (`terminaldestinoid`) REFERENCES `terminaldestino` (`terminaldestinoid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Bus_TerminalOrigen1` FOREIGN KEY (`terminalorigenid`) REFERENCES `terminalorigen` (`terminalorigenid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Bus_table11` FOREIGN KEY (`categoriaid`) REFERENCES `categoria` (`categoriaid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD CONSTRAINT `fk_Pasaje_Bus1` FOREIGN KEY (`busid`) REFERENCES `bus` (`busid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `terminaldestino`
--
ALTER TABLE `terminaldestino`
  ADD CONSTRAINT `fk_TerminalDestino_CiudadDestino1` FOREIGN KEY (`ciudaddestinoid`) REFERENCES `ciudaddestino` (`ciudaddestinoid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `terminalorigen`
--
ALTER TABLE `terminalorigen`
  ADD CONSTRAINT `fk_TerminalOrigen_Ciudad1` FOREIGN KEY (`ciudadorigenid`) REFERENCES `ciudadorigen` (`ciudadorigenid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `ventapasaje`
--
ALTER TABLE `ventapasaje`
  ADD CONSTRAINT `fk_VentaPasaje_Pasaje1` FOREIGN KEY (`pasajeid`) REFERENCES `pasaje` (`pasajeid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_VentaPasaje_Pasajero1` FOREIGN KEY (`dni`) REFERENCES `pasajero` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

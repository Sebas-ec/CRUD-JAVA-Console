-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-07-2022 a las 02:49:41
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `test`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `nameUsuario` varchar(25) NOT NULL,
  `lastnameUsuario` varchar(25) NOT NULL,
  `describeUsuario` varchar(25) NOT NULL,
  `recomendUsuario` varchar(50) NOT NULL,
  `featureUsuario` varchar(25) NOT NULL,
  `improveUsuario` varchar(25) NOT NULL,
  `commentUsuario` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nameUsuario`, `lastnameUsuario`, `describeUsuario`, `recomendUsuario`, `featureUsuario`, `improveUsuario`, `commentUsuario`) VALUES
(3, 'jose', 'manzano', 'junior', 'yes', 'front-end', 'the website', 'nothing add yet.'),
(4, 'sebas', 'guayna', 'back-end user', 'yes', 'junior-medium', 'imrpove their logic', 'add more info pls.'),
(5, 'HUGO', 'BOSS', 'new user in the town', 'yes', 'junior programmer', 'he\'s new', 'nothing to add');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

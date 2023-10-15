CREATE TABLE `cliente` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE `cliente` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255),
  `nome` varchar(255),
  `telefone` varchar(255),
  `nascimento` date DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `servico` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `valor` decimal(6,2) NOT NULL,
  PRIMARY KEY (`id`)
);
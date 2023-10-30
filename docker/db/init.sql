CREATE USER 'keycloak'@'localhost' IDENTIFIED BY 'keycloak';
CREATE DATABASE IF NOT EXISTS `keycloak`;
GRANT ALL PRIVILEGES ON keycloak . * TO 'keycloak'@'localhost';

CREATE USER 'quarkus'@'localhost' IDENTIFIED BY 'quarkus';
CREATE DATABASE IF NOT EXISTS `quarkus`;
GRANT ALL PRIVILEGES ON quarkus . * TO 'quarkus'@'localhost';

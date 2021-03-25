DROP DATABASE db_cinema;
CREATE DATABASE db_cinema;
USE db_cinema;

CREATE TABLE cinema
(
    cinema_id   BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome        VARCHAR(40)  NOT NULL,
    rua         VARCHAR(256) NOT NULL,
    numero      VARCHAR(256) NOT NULL,
    complemento VARCHAR(256),
    bairro      VARCHAR(256) NOT NULL,
    cidade      VARCHAR(256) NOT NULL,
    estado      VARCHAR(256) NOT NULL
);

CREATE TABLE filmes
(
    filmes_id BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome      VARCHAR(256) NOT NULL,
    descrição TEXT,
    diretor   VARCHAR(256),
    atores    VARCHAR(256),
    genero    VARCHAR(256)
);

CREATE TABLE sessoes
(
    sessoes_id BIGINT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    data       DATE    NOT NULL,
    horario    TIME    NOT NULL,
    sala       TINYINT NOT NULL,
    cinema_id  BIGINT  NOT NULL,
    filmes_id  BIGINT  NOT NULL,

    FOREIGN KEY (cinema_id) REFERENCES cinema (cinema_id),
    FOREIGN KEY (filmes_id) references filmes (filmes_id)
);




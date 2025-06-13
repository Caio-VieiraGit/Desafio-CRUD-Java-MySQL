CREATE DATABASE cdz_eliseos_dupla4;

USE cdz_eliseos_dupla4;

CREATE TABLE ordens (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    lider VARCHAR(100) NOT NULL
);

CREATE TABLE templos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    localizacao VARCHAR(100),
    ordem_id INT,
    FOREIGN KEY (ordem_id) REFERENCES ordens(id)
);

CREATE TABLE guardioes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    poder VARCHAR(100),
    templo_id INT,
    FOREIGN KEY (templo_id) REFERENCES templos(id)
);

CREATE TABLE artefatos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    templo_id INT,
    FOREIGN KEY (templo_id) REFERENCES templos(id)
);

CREATE TABLE historicos_templo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    templo_id INT,
    evento TEXT,
    data_evento DATE,
    FOREIGN KEY (templo_id) REFERENCES templos(id)
);

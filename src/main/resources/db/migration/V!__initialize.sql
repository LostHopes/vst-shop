-- Active: 1682858531493@@127.0.0.1@3306@vst
CREATE DATABASE IF NOT EXISTS vst;
USE vst;

CREATE TABLE IF NOT EXISTS Users(
    id BIGINT PRIMARY KEY,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255),
    role VARCHAR(255),
    isActive BOOLEAN
);

CREATE TABLE IF NOT EXISTS Products(
    id BIGINT PRIMARY KEY,
    name VARCHAR(255),
    type VARCHAR(255),
    price DOUBLE,
    isAvailable BOOLEAN,
    salerId BIGINT,
    FOREIGN KEY (salerId) REFERENCES Users(id)
);

CREATE TABLE IF NOT EXISTS Orders(
    id BIGINT NOT NULL PRIMARY KEY,
    price DOUBLE,
    customerId BIGINT NOT NULL,
    productId BIGINT NOT NULL,
    status VARCHAR(255),
    FOREIGN KEY (customerId) REFERENCES Users(id),
    FOREIGN KEY (productId) REFERENCES Products(id)
);

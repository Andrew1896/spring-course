CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    surname VARCHAR(255),
    department VARCHAR(255),
    salary INT,
    details_id INT,
    CONSTRAINT fk_details_id FOREIGN KEY (details_id) REFERENCES details(id)
);

CREATE TABLE details (
    id INT AUTO_INCREMENT PRIMARY KEY,
    detail_info VARCHAR(255)
);

USE my_db;
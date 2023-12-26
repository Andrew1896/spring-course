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

select * from employees;
select * from details;

-- Inserare detalii
INSERT INTO details (detail_info) VALUES
('Detaliu 1'),
('Detaliu 2'),
('Detaliu 3'),
('Detaliu 4'),
('Detaliu 5');

-- Inserare angajați
INSERT INTO employees (name, surname, department, salary, details_id) VALUES
('Angajat 1', 'Prenume1', 'Departament1', 50000, 1),
('Angajat 2', 'Prenume2', 'Departament2', 55000, 2),
('Angajat 3', 'Prenume3', 'Departament1', 60000, 3),
('Angajat 4', 'Prenume4', 'Departament3', 52000, 4),
('Angajat 5', 'Prenume5', 'Departament2', 58000, 5);
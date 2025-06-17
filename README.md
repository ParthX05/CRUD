# Employee management System - Java CRUD with Swing and JDBC

This is a simple desktop application built using **Java Swing** for the UI and **JDBC** for database operations. It performs basic **CRUD (Create, Read, Update, Delete)** operations on student data.

## 🧰 Tech Stack

- Java (JDK 8+)
- Swing (GUI)
- JDBC (MySQL Connector)
- MySQL Database
- NetBeans IDE (Recommended)

## 📌 Features

- Add new employee
- View all employee
- Update existing employee
- Delete employee
- Display data in a JTable

- ## 📋 Database Setup

1. Create a database in MySQL:

  CREATE DATABASE Emp_db;
  USE Emp_db;
  
  CREATE TABLE employees (
      employee_id INT PRIMARY KEY,
      first_name VARCHAR(50),
      lat_name VARCHAR(50),
      salary INT
  );

2. Insert sample data (optional):

  INSERT INTO employees
  VALUES  (111, "Parth", "Mehta", 100000);

3. Make sure to configure your database connection in the Java file:

  String url = "jdbc:mysql://localhost:3306/Emp_db";
  String user = "root";
  String password = "your_mysql_password";
   

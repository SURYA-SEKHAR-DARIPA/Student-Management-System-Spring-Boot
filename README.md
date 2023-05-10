# Student-Management-System-Spring-Boot

Student Management System project is based on Java Spring Boot concept, having Spring Web, Spring Data JPA, MySQL JDBC Driver, Thymeleaf, Spring Boot Dev Tool dependencies in its pom.xml file. The project also contains a main class, controller class, entity class, repository interface, service interface, serviceimpl class, few html files, and an application.properties file.

1. application.property:  This file holds the database configuration properties.

2. StudentController class:  The controller class serves as an intermediary between the client and the back-end services. 

3. StudentRepository Interface:  file serves as an interface to access and manipulate data stored in a database.

4. StudentService Interface:  StudentService Interface holds the declaration of functions which can deal with database inbuild functions. 

5. StudentServiceImpl Class:  StudentserviceImpl class implements the StudentService Interface and holds the definitions of functions that are declared    in StudentService Interface. . The Impl class fetches the JpaRepository inbuild functions like findAll(), findById(), save(), deleteById(), with the    help of StudentRepository class variable to work with database. 







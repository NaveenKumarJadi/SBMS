SpringBoot_Multiple_Database_Configuration
===========================================

Implemented Multiple Database in real time to ensure CAP theorem

What is the CAP theorem for databases?
CAP Theorem and Distributed Database Management Systems
CAP Theorem is a concept that a distributed database system can only have 2 of the 3: *Consistency*, *Availability* and *Partition* Tolerance. CAP Theorem is very important in the Big Data world, especially when we need to make trade off's between the three, based on our unique use case.

**# H2 Database Configuration**

spring.datasource.h2.url=jdbc:h2:mem:testdb

spring.datasource.h2.driverClassName=org.h2.Driver

spring.datasource.h2.username=sa

spring.datasource.h2.password=sa

spring.datasource.h2.platform=h2

**# MySQL Database Configuration**

spring.datasource.mysql.url=jdbc:mysql://localhost:3306/sbmsdb

spring.datasource.mysql.driverClassName=com.mysql.cj.jdbc.Driver

spring.datasource.mysql.username=root

spring.datasource.mysql.password=root

spring.datasource.mysql.platform=mysql

spring.jpa.show-sql=true

spring.jpa.hibernate.ddl-auto=update


*EndPoint urls:*

http://localhost:9090/data

http://localhost:9090/books

http://localhost:9090/users

http://localhost:9090/h2-console

application.properties/application.yml configuration


*MySQL Queries:*

use sbmsdb;

show tables;

select * from book_tbl;

truncate table book_tbl;

drop table book_tbl;

*H2 Queries:*

SELECT * FROM USER_TBL 

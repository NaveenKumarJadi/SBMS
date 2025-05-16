create database batchdemo;

drop database batchdemo;

use batchdemo;

show tables;

show databases;

select * from people;

select * from batch_job_execution;

CREATE TABLE people(

	person_id BIGINT auto_increment NOT NULL PRIMARY KEY,

	first_name VARCHAR(20),

	last_name VARCHAR(20)

);
++++++++++++++++++++
MySQL Queries::
++++++++++++++++++++
show databases;
use sbms;

Create table USER_MASTER(user_id int, user_age int, user_country varchar(20), user_gender varchar(10), user_name varchar(20));

insert into USER_MASTER values(111, 25, 'India', 'Male', 'Navin');

select * from USER_MASTER;


++++++++++++++++++++
console Output::
++++++++++++++++++++

Hibernate: select u1_0.user_id,u1_0.user_age,u1_0.user_country,u1_0.user_gender,u1_0.user_name from user_master u1_0
User [userid=101, username=Ramu, gender=Male, age=25, country=India]
User [userid=102, username=Raju, gender=Male, age=26, country=India]
User [userid=103, username=John, gender=Male, age=30, country=USA]
User [userid=104, username=Smith, gender=Male, age=32, country=Canada]
User [userid=105, username=Ganesh, gender=Male, age=33, country=India]
User [userid=106, username=Orlen, gender=Male, age=34, country=Germany]
User [userid=107, username=Charles, gender=Male, age=35, country=Mexico]
User [userid=108, username=Buttler, gender=Male, age=36, country=Australia]
User [userid=109, username=Cathy, gender=Fe-Male, age=29, country=USA]
User [userid=110, username=Tanny, gender=Fe-Male, age=28, country=Canada]
###################################################
Hibernate: select * from user_master
User [userid=101, username=Ramu, gender=Male, age=25, country=India]
User [userid=102, username=Raju, gender=Male, age=26, country=India]
User [userid=103, username=John, gender=Male, age=30, country=USA]
User [userid=104, username=Smith, gender=Male, age=32, country=Canada]
User [userid=105, username=Ganesh, gender=Male, age=33, country=India]
User [userid=106, username=Orlen, gender=Male, age=34, country=Germany]
User [userid=107, username=Charles, gender=Male, age=35, country=Mexico]
User [userid=108, username=Buttler, gender=Male, age=36, country=Australia]
User [userid=109, username=Cathy, gender=Fe-Male, age=29, country=USA]
User [userid=110, username=Tanny, gender=Fe-Male, age=28, country=Canada]
###################################################
Hibernate: select u1_0.user_id,u1_0.user_age,u1_0.user_country,u1_0.user_gender,u1_0.user_name from user_master u1_0 where u1_0.user_country=?
User [userid=101, username=Ramu, gender=Male, age=25, country=India]
User [userid=102, username=Raju, gender=Male, age=26, country=India]
User [userid=105, username=Ganesh, gender=Male, age=33, country=India]
###################################################
Hibernate: select u1_0.user_id,u1_0.user_age,u1_0.user_country,u1_0.user_gender,u1_0.user_name from user_master u1_0 where u1_0.user_country=? and u1_0.user_age=?
User [userid=101, username=Ramu, gender=Male, age=25, country=India]

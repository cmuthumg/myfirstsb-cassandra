Install Cassandra and run below cql there

CREATE KEYSPACE testdb  WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 3}; 

describe keyspaces ;

use testdb ;

CREATE TABLE student(  
   stu_id int PRIMARY KEY,  
   stu_name text, 
   stu_phone varint  
   );  
   
   

ALTER TABLE student  ADD stu_email text; 

ALTER TABLE student  DROP stu_email text;    

ALTER TABLE student  DROP (stu_fees, stu_phone);   


INSERT INTO student (stu_id, stu_email, stu_name, stu_phone)  VALUES(1, 'AA', 'aa@gamil.com', 9647465363);

INSERT INTO student (stu_id, stu_email, stu_name, stu_phone)  VALUES(2, 'BBB', 'bbbbb@gamil.com', 349845984958);
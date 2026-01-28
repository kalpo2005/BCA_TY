/* Write a PL/SQL Program using explicit cursor to check the gender , if it is male insert it 
in MALE table else insert it in FEMALE table. Consider structure of table STUDENT as 
(rollno,name,std,b_date,gender). Consider structure of table MALE and FEMALE table 
as (rollno,name,std,b_date).  */

SET SERVEROUTPUT ON;
-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment2\assing6_malefemale.sql


DECLARE
    CURSOR myCursor IS SELECT * FROM student;
    memory_var student%ROWTYPE;
    -- %ROWTYPE for all column
BEGIN
    OPEN myCursor;
    LOOP
        FETCH myCursor INTO memory_var;
        EXIT WHEN myCursor%NOTFOUND;

        IF memory_var.gender = 'M' THEN
            INSERT INTO male (rollNo,name,standard,birthDate) VALUES (memory_var.rollNo, memory_var.name, memory_var.standard, memory_var.birthDate);

        ELSE
            INSERT INTO female (rollNo,name,standard,birthDate) VALUES (memory_var.rollNo, memory_var.name, memory_var.standard, memory_var.birthDate);
            
        END IF;

        END LOOP;
    CLOSE myCursor;
END;
/

SELECT * FROM male;
SELECT * FROM female;
/*
DROP TABLE student;
DROP TABLE male;
DROP TABLE female;


CREATE TABLE student(
	rollNo NUMBER(2),
	name VARCHAR2(100),
	standard VARCHAR2(20),
	birthDate DATE,
	gender VARCHAR2(2)	
);
 INSERT INTO student (rollNo,name,standard,birthDate,gender) VALUES (1, 'Anil', 10, '10-MAY-08', 'M');
 INSERT INTO student(rollNo,name,standard,birthDate,gender) VALUES (2, 'Avani', 10, '12-SEP-08', 'F');
INSERT INTO student (rollNo,name,standard,birthDate,gender) VALUES (3, 'Kalpesh',  9,  '22-MAR-09', 'M');
 INSERT INTO student (rollNo,name,standard,birthDate,gender) VALUES (4, 'Maitree', 9,  '30-JUL-09', 'F');

CREATE TABLE male(
	rollNo NUMBER(2),
	name VARCHAR(100),
	standard VARCHAR(20),
	birthDate DATE	
);

CREATE TABLE female(
	rollNo NUMBER(2),
	name VARCHAR(100),
	standard VARCHAR(20),
	birthDate DATE	
);
*/



/*  1. Create a procedure to insert record in STUD table. Consider structure of table STUD as 
(rollno, name, mark1, mark2, mark3). */
-- SET SERVEROUTPUT ON;
-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign1_student.sql
/*
DROP TABLE student;

CREATE TABLE student(
rollNumber NUMBER(5) PRIMARY KEY,
name VARCHAR2(100),
standard NUMBER(2),
mark1 NUMBER(3),
mark2 NUMBER(3),
mark3 NUMBER(3)
); */
CREATE
OR REPLACE PROCEDURE insertStudent (
	rollNumber IN NUMBER,
	name IN VARCHAR2,
	standard IN NUMBER,
	mark1 IN NUMBER,
	mark2 IN NUMBER,
	mark3 IN NUMBER
) IS BEGIN
INSERT INTO
	student (rollNumber, name, standard, mark1, mark2, mark3)
VALUES
	(rollNumber, name, standard, mark1, mark2, mark3);

DBMS_OUTPUT.PUT_LINE ('Data Inserted successfully !!!');

END;

/
/*Create a function that checks where the given rollno exist or not. Consider structure of table student. */

 -- SET SERVEROUTPUT ON;
 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign7_studentexits.sql
 
CREATE OR REPLACE FUNCTION studentExists (
    rollNumberParam IN NUMBER
) RETURN VARCHAR2
IS
    countStudent NUMBER := 0;
BEGIN

    SELECT COUNT(*) 
    INTO countStudent 
    FROM student 
    WHERE rollNumber = rollNumberParam;

    IF countStudent > 0 THEN
        RETURN 'STUDENT EXISTS IN TABLE !!!';
    ELSE
        RETURN 'STUDENT DOES NOT EXIST';
    END IF;

EXCEPTION
    WHEN OTHERS THEN
        RETURN 'UNEXPECTED ERROR !!!';
END;
/

/*
CREATE TABLE student(
rollNumber NUMBER(5) PRIMARY KEY,
name VARCHAR2(100),
standard NUMBER(2),
mark1 NUMBER(3),
mark2 NUMBER(3),
mark3 NUMBER(3)
); */
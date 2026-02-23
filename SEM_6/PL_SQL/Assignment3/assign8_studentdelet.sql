/*  Create a function to delete record in STUD table. Consider structure of table STUD as (rollno, name, mark1, mark2, mark3).  */

 -- SET SERVEROUTPUT ON;
 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign8_studentdelet.sql
 
CREATE OR REPLACE FUNCTION deleteStudents (
    rollNumberParam IN NUMBER) RETURN VARCHAR2
 IS
 
BEGIN

    DELETE FROM student WHERE rollNumber = rollNumberParam;

    IF SQL%ROWCOUNT > 0 THEN
        RETURN 'STUDENT DELETED !!!';
    ELSE
        RETURN 'STUDENT DOES NOT DELETED';
    END IF;

EXCEPTION
    WHEN OTHERS THEN
        RETURN 'UNEXPECTED ERROR !!!';
END;
/

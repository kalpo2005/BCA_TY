/* (4). Write a trigger which will not allow more than 60 students to be enrolled in any class. */

 -- SET SERVEROUTPUT ON;
 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment4\assign4_60student.sql
 
CREATE OR REPLACE TRIGGER limitedStudent
BEFORE INSERT ON student
FOR EACH ROW
DECLARE
    rowCount NUMBER;
BEGIN
    SELECT COUNT(*)
    INTO rowCount
    FROM student
    WHERE classChar = :NEW.classChar;

	DBMS_OUTPUT.PUT_LINE(rowCount);
    IF rowCount >= 60 THEN
        RAISE_APPLICATION_ERROR(-20004, 'MAXIMUM 60 STUDENT IN THIS CLASS');
    END IF;
END;
/
 
 /*
CREATE TABLE student(
rollNumber NUMBER(5),
name VARCHAR2(20),
classChar VARCHAR2(2),
standard NUMBER(2)
); */

/*
BEGIN
   FOR i IN 1..5
   LOOP
      INSERT INTO student(rollNumber, name, classChar, standard)
      VALUES (i, 'kalpesh', 'B', 3);
   END LOOP;
END;
/ */
 
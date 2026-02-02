/*  2. Create a procedure to update the standard of the student who has passed. Consider 
structure of table student.  */

 -- SET SERVEROUTPUT ON;
 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign2_updateStandard.sql
 
 
CREATE OR REPLACE PROCEDURE updateStandard
IS
BEGIN
	UPDATE student SET standard =  (standard + 1) WHERE mark1 >= 33 AND mark1 >= 33 AND mark1 >= 33;
	
	DBMS_OUTPUT.PUT_LINE('Standard Updated successfully !!!');
	
END;
/

/* (1). Write a trigger to restrict user from using the table on Saturday and Sunday.  */

 -- SET SERVEROUTPUT ON;
 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment4\assign1_restrict.sql
 
 CREATE OR REPLACE TRIGGER restrictOnWeekend 
 BEFORE INSERT OR UPDATE OR DELETE ON customer FOR EACH ROW
 
 BEGIN
 
	IF TO_CHAR(SYSDATE,'DY') IN ('SUN','SAT') THEN
		
		RAISE_APPLICATION_ERROR(-20001,'restricton table due to Weekend ');
	END IF;
	
 END;
 /
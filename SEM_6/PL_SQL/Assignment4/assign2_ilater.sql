/*  Write a trigger which will allow only those item numbers to be inserted which 
start with ‘I’ or ‘i’. */

 -- SET SERVEROUTPUT ON;
 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment4\assign2_ilater.sql
 
 CREATE OR REPLACE TRIGGER letterWithI
 BEFORE INSERT OR UPDATE OR DELETE ON customer FOR EACH ROW
 
 BEGIN
 
	IF SUBSTR(:NEW.customerName,1,1) NOT IN ('i','I') THEN
		
		RAISE_APPLICATION_ERROR(-20002,'Letter must be start with i of I ');
	END IF;
	
 END;
 /
/* 16. Write a PL/SQL Program to input customer id and check whether the customer id is 
existing in CUSTOMER table or not. If it exists display the record, otherwise produce an 
appropriate message on the screen.  */

-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing16.sql
-- DROP TABLE customer;


DECLARE
	custIdNo NUMBER(8) := &enter_custId;
	isExits NUMBER;

BEGIN 

	SELECT COUNT(*) INTO isExits FROM customer WHERE custId = custIdNo;
	
	IF isExits > 0 THEN
		DBMS_OUTPUT.PUT_LINE(' CUSTOMER EXITS !!! ');
		
	ELSE
		DBMS_OUTPUT.PUT_LINE(' CUSTOMER NOT EXITS !!! ');
    END IF;
END;
/

SELECT * FROM customer;


-- 3. Write PL/SQL Program to Print Numbers from 1 to 50 

-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing3.sql


DECLARE 

	number1 NUMBER(2);
	
BEGIN
	
	for number1 in 1..50
	loop
	
		DBMS_OUTPUT.PUT_LINE(number1);
	end loop;
	
END;
/
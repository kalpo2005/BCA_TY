-- 5. Write PL/SQL Program to Print even Numbers  from 1 to 50 

-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing5.sql


DECLARE 

	number1 NUMBER(2);
	
BEGIN
	
	for number1 in 1..50
	loop
		
		IF mod(number1,2) = 0 THEN
			DBMS_OUTPUT.PUT_LINE(number1);
		END IF;
		
	end loop;
	
END;
/
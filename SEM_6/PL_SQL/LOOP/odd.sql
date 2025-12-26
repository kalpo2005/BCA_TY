-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\LOOP\odd.sql


DECLARE 

	number1 NUMBER(2);
	
BEGIN
	
	for number1 in 1..50
	loop
		IF mod(number1,2) = 1 THEN
		DBMS_OUTPUT.PUT_LINE(number1);
		
		END IF;
	end loop;
	
END;
/
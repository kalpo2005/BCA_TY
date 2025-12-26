-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\LOOP\NAME.sql


DECLARE 

	number1 NUMBER(2);
	
BEGIN
	
	for number1 in 1..10
	loop
	
		DBMS_OUTPUT.PUT_LINE('Kalpesh Bavaliya !!! ');
	end loop;
	
END;
/
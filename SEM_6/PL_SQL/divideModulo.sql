-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\divideModulo.sql


DECLARE 

	number1 NUMBER(2);
	number2 NUMBER(2);
	
BEGIN
	
	number1 := &number1;
	number2 := &number2;
	
	
	DBMS_OUTPUT.PUT_LINE('A reminder is a : ' || mod(number1,number2));
	
	
END;
/
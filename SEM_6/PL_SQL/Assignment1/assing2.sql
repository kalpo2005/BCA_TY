-- 2. Write a PL/SQL program to input three numbers and print which is maximum. 

-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing2.sql

DECLARE 

	number1 NUMBER(5);
	number2 NUMBER(5);
	number3 NUMBER(5);
	
BEGIN
	
	number1 := &number1;
	number2 := &number2; 
	number3 := &number3; 
	
	IF number2 = number1 AND number1 = number3 THEN
		DBMS_OUTPUT.PUT_LINE('All three Number are same ');
	
	ELSIF number2 < number1 AND number3 < number1	THEN
		DBMS_OUTPUT.PUT_LINE('Number 1 is a big !!!  :' || number1);
		
	ELSIF number2 > number1 AND number2 > number3	THEN
		DBMS_OUTPUT.PUT_LINE('Number 2 is a big !!! :' || number2);
	
	ELSE 
		DBMS_OUTPUT.PUT_LINE('Number 3 is a big !!! : ' || number3);
		
	
	END IF;
	
END;
/
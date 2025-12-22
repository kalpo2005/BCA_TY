-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\CONDITIONS\maxmin.sql


DECLARE 

	number1 NUMBER(5);
	number2 NUMBER(5);
	
BEGIN
	
	number1 := &number1;
	number2 := &number2; 
	
	if number2 = number1 then
	DBMS_OUTPUT.PUT_LINE('Both Number are same ");
	
	else if number2 < number1 then
	DBMS_OUTPUT.PUT_LINE('Number 1 is a big !!!' || number1);
	
	else 
	DBMS_OUTPUT.PUT_LINE('Number 2 is a big !!!! ' || number2);
	
	END if;
	
END;
/
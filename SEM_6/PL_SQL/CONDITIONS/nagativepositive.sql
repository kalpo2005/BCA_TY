-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\CONDITIONS\nagativepositive.sql


DECLARE 

	number1 NUMBER(2);
	
BEGIN
	
	number1 := &number1;
	
	if number1 < 0 then
	DBMS_OUTPUT.PUT_LINE('Number is a nagative !!!');
	
	else 
	DBMS_OUTPUT.PUT_LINE('Number is a positive !!!! ');
	
	END if;
	
END;
/
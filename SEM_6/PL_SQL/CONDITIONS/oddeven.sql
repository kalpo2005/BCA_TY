-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\CONDITIONS\oddeven.sql


DECLARE 

	number1 NUMBER(2);
	
BEGIN
	
	number1 := &number1;
		
	if mod(number1,2) != 0  then
	DBMS_OUTPUT.PUT_LINE('Number is a odd !!!');
	
	else 
	DBMS_OUTPUT.PUT_LINE('Number is a even !!!! ');
	
	END if;
	
END;
/
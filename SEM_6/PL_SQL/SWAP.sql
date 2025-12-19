-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\SWAP.sql



DECLARE 
	number1 NUMBER(3);
	number2 NUMBER(3);
	
BEGIN
	
	number1 := &number1;
	number2 := &number2;
	
	DBMS_OUTPUT.PUT_LINE('Before swaing ');
	DBMS_OUTPUT.PUT_LINE('Number 1 ' || number1);
	DBMS_OUTPUT.PUT_LINE('Number 2 ' || number2);
	
	
	number1 := number1 + number2;
	number2 := number1 - number2 ;
	number1 := number1 - number2 ;
	
	DBMS_OUTPUT.PUT_LINE('After swaing ');
	DBMS_OUTPUT.PUT_LINE('Number 1 ' || number1);
	DBMS_OUTPUT.PUT_LINE('Number 2 ' || number2);
	
	
	
END;
/
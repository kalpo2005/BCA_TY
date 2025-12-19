--  


DECLARE 
	number1 NUMBER(3);
	number2 NUMBER(3);
	
BEGIN
	
	number1 := &number1;
	number2 := &number2;
	
	DBMS_OUTPUT.PUT_LINE('Sum is a : ' || (number1 + number2));
	DBMS_OUTPUT.PUT_LINE('substraction is a : ' || (number1 - number2));
	DBMS_OUTPUT.PUT_LINE('Multiplication is a : ' || (number1 * number2));
	DBMS_OUTPUT.PUT_LINE('Division is a : ' || (number1 / number2));
	
END;
/
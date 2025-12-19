DECLARE 
	number1 NUMBER(3);
	number2 NUMBER(3);
	sumAnswer NUMBER(10);
	
BEGIN
	
	DBMS_OUTPUT.PUT_LINE('------------ Enter value for the sum -------------------');
	number1 := &number1;
	number2 := &number2;
	sumAnswer := number1 + number2;
	
	DBMS_OUTPUT.PUT_LINE('Answer is a : ' || sumAnswer);
	
END;
/
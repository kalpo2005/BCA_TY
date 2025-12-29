-- 10. Write a PL/SQL Program to generate Fibonacci series.

-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing10.sql

DECLARE
	
	number1 NUMBER;
	init    NUMBER;
	firstNumber NUMBER := 0;
	secondNumber NUMBER := 1;
	tempSum NUMBER := 1;
	
BEGIN 

		DBMS_OUTPUT.PUT_LINE(firstNumber);
		DBMS_OUTPUT.PUT_LINE(secondNumber);
	FOR init IN 2..5
	LOOP
		tempSum := firstNumber + secondNumber;
		DBMS_OUTPUT.PUT_LINE(tempSum);
		
		firstNumber := secondNumber;
		secondNumber := tempSum;
		
	END LOOP;

END;
/
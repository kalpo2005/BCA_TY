--6. Write PL/SQL Program to find Sum of Numbers from 1 to 100 

-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing6-2.sql


DECLARE 

	addition NUMBER :=  0;
	number1 NUMBER;
	
BEGIN
	
	FOR number1 IN 1..100
	LOOP
		
		addition := addition + number1;
		
	END LOOP;
		
		DBMS_OUTPUT.PUT_LINE('SUM IS A :  ' || addition );
END;
/

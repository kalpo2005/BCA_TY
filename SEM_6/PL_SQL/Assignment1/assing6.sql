--6. Write PL/SQL Program to find Sum of Numbers from 1 to 100 

-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing6.sql


DECLARE 

	addition NUMBER;
	num NUMBER := &number_for_sum;
	
BEGIN
	
	addition := (num*(num+1))/2;
	DBMS_OUTPUT.PUT_LINE(addition);
		
END;
/

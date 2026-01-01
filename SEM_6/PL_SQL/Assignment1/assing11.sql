-- 10. Write a PL/SQL Program to generate Fibonacci series.

-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing11.sql

DECLARE
	
	number1 NUMBER;
	init    NUMBER;
	count2 NUMBER := 0;

BEGIN 
		number1 := &number1_for_checking_prime;
		
	FOR init IN 1..number1
	LOOP
		IF MOD(number1,init) = 0 THEN 
			count2 := count2 + 1;
		END IF;
		
	END LOOP;
	
	IF count2 = 2 THEN
		dbms_output.put_line(' Number is a Prime !!!!');
	ELSE
		dbms_output.put_line(' Number is NOT Prime !!!!');
	END IF;

END;
/
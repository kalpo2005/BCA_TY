-- 7. Write PL/SQL Program to Accept a Number and Find the Sum of Digits 

-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing7.sql

DECLARE

	number1 NUMBER(7);
	sumValue NUMBER(7);
	reminder NUMBER(7);
	
	
BEGIN	
	number1 := &number_for_the_sum;
	sumValue := 0;
	WHILE number1 > 0
	LOOP
		reminder := mod(number1,10);
		sumValue := sumValue + reminder;
		number1  := floor(number1 / 10);
		
	END LOOP;
	DBMS_OUTPUT.PUT_LINE('Sum is Number : ' || sumValue);
	
	
END;
/
-- 9. Write PL/SQL Program to Print Sum of Even Numbers and Odd Numbers from 1 to 100 

-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing9.sql


DECLARE 

	number1 NUMBER(5);
	oddSum NUMBER := 0;
	evenSum NUMBER := 0;
	
BEGIN
	
	for number1 in 1..100
	loop
		
		IF mod(number1,2) != 0 THEN
			oddSum := oddSum + number1;
		
		ELSE 
			evenSum := evenSum + number1;
		END IF;
		
	end loop;
	
	DBMS_OUTPUT.PUT_LINE('Odd number sum is a : ' || oddSum);
	DBMS_OUTPUT.PUT_LINE('evenSum number sum is a : ' || evenSum);
	
END;
/
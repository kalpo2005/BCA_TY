-- 13. Write a PL/SQL program to Print inputted number is Armstrong or Not 

-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing13.sql

DECLARE

	number1 NUMBER(7);
	arm NUMBER(7);
	reminder NUMBER(7);
	checkNumber NUMBER(7);
	
BEGIN	
	number1 := &number_for_the_armstrong;
	arm     :=0;
	checkNumber := number1;
	
	WHILE number1 > 0
	LOOP
		reminder := mod(number1,10);
		arm      := (reminder * reminder * reminder ) + arm;
		number1  := floor(number1 / 10);
		
	END LOOP;
	
	IF checkNumber = arm THEN
		DBMS_OUTPUT.PUT_LINE('Number is Armstrong : ' || checkNumber);
		
	ELSE
		DBMS_OUTPUT.PUT_LINE('Number Not a Armstrong : ' || checkNumber);
	
	END IF;
	
	
END;
/
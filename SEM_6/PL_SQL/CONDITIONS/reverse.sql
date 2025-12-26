 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\CONDITIONS\reverse.sql


DECLARE

	number1 NUMBER(7);
	rev NUMBER(7);
	reminder NUMBER(7);
	
	
BEGIN	
	number1 := &number_for_the_reverse;
	rev     :=0;
	WHILE number1 > 0
	LOOP
		reminder := mod(number1,10);
		rev      := (rev * 10) + reminder;
		number1  := floor(number1 / 10);
		
	END LOOP;
	DBMS_OUTPUT.PUT_LINE('Reverse Number : ' || rev);
	
	
END;
/
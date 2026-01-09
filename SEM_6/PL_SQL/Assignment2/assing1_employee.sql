/* 1. Write a PL/SQL program using implicit cursor attribute SQL%FOUND to raise the salary 
of employees by 20% and also display also display the appropriate message.  */


-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment2\assing1_employee.sql



DECLARE

	rowCount NUMBER(3) := 0;

BEGIN

	UPDATE employees SET salaryIncrease = salary + (20 * salary / 100);
	
	IF SQL%FOUND THEN
		DBMS_OUTPUT.PUT_LINE('DATA ALL UPDATED !!!');
		rowCount := SQL%ROWCOUNT;
	ELSE
		DBMS_OUTPUT.PUT_LINE('DATA nOT FOUNDED !!!');
		
	END IF;
		DBMS_OUTPUT.PUT_LINE('DATA UPDATED ROWS : ' || rowCount);

END;
/
/*
CREATE TABLE employees(
	empId NUMBER(5),
	empName VARCHAR(50),
	salary NUMBER(5),
	salaryIncrease NUMBER(8,2)
);

INSERT INTO employees(empId,empName,salary) VALUES (23,'KALPESH',2300);
INSERT INTO employees(empId,empName,salary) VALUES (435,'ANIL',79850);
INSERT INTO employees(empId,empName,salary) VALUES (87,'DHRUV',2800);
INSERT INTO employees(empId,empName,salary) VALUES (65,'VIJAY',66666);

*/
/* 8. Write a PL/SQL code to calculate the total salary of first n records of emp table. The 
value of n is passed to cursor as parameter.  */


-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment2\assing8_totalsalary.sql


DECLARE
	CURSOR myCursor(num NUMBER) IS SELECT * FROM employees WHERE ROWNUM <= num;
	memoryVariable employees%ROWTYPE;
	total NUMBER(10) := 0;
	
BEGIN
	
	OPEN myCursor(2);
	
	LOOP 
	
		FETCH myCursor INTO memoryVariable;
		EXIT WHEN myCursor%NOTFOUND;
		total := total + memoryVariable.salary;
	
	END LOOP;
	
	DBMS_OUTPUT.PUT_LINE(total);
	CLOSE myCursor;

END;
/

/*
CREATE TABLE employees(
	empId NUMBER(5),
	empName VARCHAR(50),
	salary NUMBER(5),
	salaryIncrease NUMBER(8,2)
);

INSERT INTO employees(empId,empName,salary) VALUES (23,'KALPESH',6000);
INSERT INTO employees(empId,empName,salary) VALUES (435,'ANIL',79850);
INSERT INTO employees(empId,empName,salary) VALUES (87,'DHRUV',2800);
INSERT INTO employees(empId,empName,salary) VALUES (65,'VIJAY',66666);

*/
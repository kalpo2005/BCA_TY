/* 3. Write a PL/SQL program using explicit cursor that fetch the record from the EMP table.   */


-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment2\assing3_fetch.sql

DECLARE
	CURSOR myCursor IS SELECT * FROM employees;
	memoryVariable employees%ROWTYPE;
	
BEGIN
	
	OPEN myCursor;
	
	LOOP 

		EXIT WHEN myCursor%NOTFOUND;
		FETCH myCursor INTO memoryVariable;
		DBMS_OUTPUT.PUT_LINE('ID : ' || memoryVariable.empId);
		DBMS_OUTPUT.PUT_LINE('NAME : ' || memoryVariable.empName);
		DBMS_OUTPUT.PUT_LINE('salary : ' || memoryVariable.salary);
		DBMS_OUTPUT.PUT_LINE(' ');
		
		
		
	
	END LOOP;
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

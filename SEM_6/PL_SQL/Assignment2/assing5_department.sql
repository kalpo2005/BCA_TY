/* 5. Write a PL/SQL program using explicit cursor to input the department name and displays 
all those employees of this department who have been working since last five years. */


-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment2\assing5_department.sql



CREATE TABLE department(
	empId NUMBER(5),
	empName VARCHAR(50),
	salary NUMBER(5),
	salaryIncrease NUMBER(8,2)
);

DECLARE
	CURSOR myCursor IS SELECT * FROM employees;
	memoryVariable employees%ROWTYPE;
	
BEGIN
	
	OPEN myCursor;
	
	LOOP 
	
		FETCH myCursor INTO memoryVariable;
	
			INSERT INTO newEmp(empId,empName,salary) VALUES(memoryVariable.empId,memoryVariable.empName,memoryVariable.salary);
		
		EXIT WHEN myCursor%NOTFOUND;
	
	END LOOP;
	CLOSE myCursor;

END;
/

SELECT * FROM newEmp;
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
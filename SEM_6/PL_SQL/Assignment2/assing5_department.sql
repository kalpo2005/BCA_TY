/* 5. Write a PL/SQL program using explicit cursor to input the department name and displays 
all those employees of this department who have been working since last five years. */


-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment2\assing5_department.sql



DECLARE

	dept_name department.deptName%type := '&dept_name';
	CURSOR myCursor IS SELECT e.* FROM empdata e, department d WHERE e.deptId = d.deptId AND d.deptName = dept_name AND e.joiningDate <= ADD_MONTHS(SYSDATE,-60);
	memoryVariable empdata%ROWTYPE;
	memoryDept department%ROWTYPE;
	
BEGIN
	
	OPEN myCursor;
	
	LOOP 
	
		FETCH myCursor INTO memoryVariable;
	
		EXIT WHEN myCursor%NOTFOUND;
		
		DBMS_OUTPUT.PUT_LINE(memoryVariable.empId || ' ' || memoryVariable.empName || ' ' || memoryVariable.deptId );
	
	END LOOP;
	CLOSE myCursor;

END;
/


/*
CREATE TABLE department(
  	deptId NUMBER(5) PRIMARY KEY,
	deptName VARCHAR(50)
);

CREATE TABLE empdata(
  	empId NUMBER(5) PRIMARY KEY,
	empName VARCHAR(50),
	deptId references department(deptId),
	joiningDate DATE
);

INSERT INTO department(deptId,deptName) VALUES(1,'DEVELPOMENT');
INSERT INTO department(deptId,deptName) VALUES(2,'TESTING');
INSERT INTO department(deptId,deptName) VALUES(3,'MARKETNG');
INSERT INTO department(deptId,deptName) VALUES(4,'SOCIAL');

INSERT INTO empdata(empId,empName,deptId,joiningDate) VALUES(1,'KALPESH',2,'13-MAY-2005');
INSERT INTO empdata(empId,empName,deptId,joiningDate) VALUES(2,'ANIL',4,'30-JUN-2022');
INSERT INTO empdata(empId,empName,deptId,joiningDate) VALUES(3,'VIJAY',3,'25-DEC-2023');
INSERT INTO empdata(empId,empName,deptId,joiningDate) VALUES(4,'BHAVIK',3,'6-SEP-2018');
INSERT INTO empdata(empId,empName,deptId,joiningDate) VALUES(5,'DHRUV',1,'9-AUG-2020');

*/
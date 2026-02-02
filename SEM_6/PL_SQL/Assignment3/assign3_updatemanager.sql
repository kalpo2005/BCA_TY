/* 3. Create a procedure that takes department ID and changes the manager ID for the 
department to the employee in the department with highest salary. */

 -- SET SERVEROUTPUT ON;
 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign3_updatemanager.sql
 
 
 CREATE OR REPLACE PROCEDURE updateManager(deptId IN NUMBER)
 IS
	managerId ROWTYPE%department.deptId;
	empId ROWTYPE%employee.empId;
 BEGIN
	
	SELECT deptId INTO managerId FROM department WHERE deptName = 'MANAGER';
	
	SELECT e.empId INTO empId FROM employee e, department d WHERE e.deptId = d.deptId AND d.deptId = deptId AND e.salary = (SELECT MAX(salary) FROM employee WHERE deptId = deptId);
	
	UPDATE employee SET deptId = managerId WHERE empId = empId;
 
 END;
 /
 /*
drop table department;
drop table employee;


CREATE TABLE department (
    deptId NUMBER PRIMARY KEY,
    deptName  VARCHAR2(20),
    city VARCHAR2(20)
);

INSERT INTO department(deptId,deptName,city) VALUES (10,'DEVELOPER','AHMEDABAD');
INSERT INTO department(deptId,deptName,city) VALUES (20,'MMANAGER','SURAT');
INSERT INTO department(deptId,deptName,city) VALUES (30,'TESTER','VADODARA');


CREATE TABLE employee (
    empId NUMBER PRIMARY KEY,
    empName VARCHAR2(20),
    job VARCHAR2(20),
    manager NUMBER,
    hireDate DATE,
    salary NUMBER(8,2),
    commission NUMBER(8,2),
    deptId NUMBER REFERENCES department(deptId)
);


INSERT INTO employee(empId,empName,job,manager,hireDate,salary,commission,deptId) VALUES (101,'Anil','MANAGER',NULL,'10-JAN-18',8000,NULL,10);
INSERT INTO employee(empId,empName,job,manager,hireDate,salary,commission,deptId) VALUES (102,'Kalpesh','CLERK',101,'15-JUN-21',1200,NULL,10);
INSERT INTO employee(empId,empName,job,manager,hireDate,salary,commission,deptId) VALUES (103,'Dhruv','SALESMAN',101,'20-MAR-19', 5000,NULL,20);
INSERT INTO employee(empId,empName,job,manager,hireDate,salary,commission,deptId) VALUES (104,'Darshan','MANAGER', NULL,'05-NOV-17',9000,NULL,20);
INSERT INTO employee(empId,empName,job,manager,hireDate,salary,commission,deptId) VALUES (105,'Yash','CLERK',104,'01-JAN-23',900,NULL,30);
INSERT INTO employee(empId,empName,job,manager,hireDate,salary,commission,deptId) VALUES (106,'Parth','ANALYST',104,'18-AUG-20',7000,NULL,30);

set linesize 200;

select * from department;

select * from employee;

*/
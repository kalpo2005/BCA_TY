/*  (5). Write a trigger to insert the existing values of the EMP table into NEWEMP table when the record is deleted from EMP table.  */

 -- SET SERVEROUTPUT ON;
 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment4\assign5_empdelete.sql
 
 CREATE OR REPLACE TRIGGER deleteEmployee
BEFORE DELETE ON employee
FOR EACH ROW
BEGIN
    INSERT INTO newEmployee(empId, empName, salary)
    VALUES (:OLD.empId, :OLD.empName, :OLD.salary);

    DBMS_OUTPUT.PUT_LINE('TOTAL ROWS INSERTED: ' || SQL%ROWCOUNT);
    DBMS_OUTPUT.PUT_LINE('DATA DELETED & INSERTED INTO NEW TABLE !!!');
END;
/
 
  /*
SELECT * FROM employee;
 

 DROP TABLE employee;
 CREATE TABLE employee(
	empId NUMBER(20),
	empName VARCHAR2(30),
	salary NUMBER(10)
);

 DROP TABLE newEmployee;
 CREATE TABLE newEmployee(
	empId NUMBER(20),
	empName VARCHAR2(30),
	salary NUMBER(10)
);

	INSERT INTO employee(empId,empName,passingMarks) VALUES(23,'KALPESH BAVALIYA', 598545);
	INSERT INTO employee(empId,empName,salary) VALUES(24,'ANIL BARAIYA', 596785);
	INSERT INTO employee(empId,empName,salary) VALUES(25,'DHRUV DEGAMA', 5462549);



DELETE FROM employee WHERE empId = 25;
SELECT * FROM employee;
SELECT * FROM newEmployee;

*/
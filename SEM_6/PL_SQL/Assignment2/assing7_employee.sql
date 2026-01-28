/* 7. Write a PL/SQL program using explicit cursor to display employee number, name and 
basic of 5 highest paid employees.  */


-- SET SERVEROUTPUT ON;

 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment2\assing7_employee.sql
 
DECLARE
    CURSOR myCursor IS SELECT * FROM employee7 ORDER BY salary DESC;
    memory_var employee7%ROWTYPE;
    var_count NUMBER := 0;
BEGIN
    OPEN myCursor;
    LOOP
        FETCH myCursor INTO memory_var;
        EXIT WHEN myCursor%NOTFOUND OR var_count = 5;
        var_count := var_count + 1;
        DBMS_OUTPUT.PUT_LINE(memory_var.empNo || ' | ' || memory_var.empName || ' | ' || memory_var.salary);
    END LOOP;
    CLOSE myCursor;
END;
/


-- drop table dept;
-- drop table employee7;


-- CREATE TABLE dept (
--     deptNo NUMBER PRIMARY KEY,
--     deptName  VARCHAR2(20),
--     city VARCHAR2(20)
-- );

-- INSERT INTO dept(deptNo,deptName,city) VALUES (10,'HR','AHMEDABAD');
-- INSERT INTO dept(deptNo,deptName,city) VALUES (20,'SALES','SURAT');
-- INSERT INTO dept(deptNo,deptName,city) VALUES (30,'IT','VADODARA');


-- CREATE TABLE employee7 (
--     empNo NUMBER PRIMARY KEY,
--     empName VARCHAR2(20),
--     job VARCHAR2(20),
--     manager NUMBER,
--     hireDate DATE,
--     salary NUMBER(8,2),
--     commission NUMBER(8,2),
--     deptNo NUMBER REFERENCES dept(deptNo)
-- );


-- INSERT INTO employee7(empNo,empName,job,manager,hireDate,salary,commission,deptNo) VALUES (101,'Anil','MANAGER',NULL,'10-JAN-18',8000,NULL,10);
-- INSERT INTO employee7(empNo,empName,job,manager,hireDate,salary,commission,deptNo) VALUES (102,'Kalpesh','CLERK',101,'15-JUN-21',1200,NULL,10);
-- INSERT INTO employee7(empNo,empName,job,manager,hireDate,salary,commission,deptNo) VALUES (103,'Dhruv','SALESMAN',101,'20-MAR-19', 5000,NULL,20);
-- INSERT INTO employee7(empNo,empName,job,manager,hireDate,salary,commission,deptNo) VALUES (104,'Darshan','MANAGER', NULL,'05-NOV-17',9000,NULL,20);
-- INSERT INTO employee7(empNo,empName,job,manager,hireDate,salary,commission,deptNo) VALUES (105,'Yash','CLERK',104,'01-JAN-23',900,NULL,30);
-- INSERT INTO employee7(empNo,empName,job,manager,hireDate,salary,commission,deptNo) VALUES (106,'Parth','ANALYST',104,'18-AUG-20',7000,NULL,30);

-- set linesize 200;

-- select *from dept;

-- select *from employee7;
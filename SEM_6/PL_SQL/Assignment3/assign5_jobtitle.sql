/* 5.  Create a procedure that takes job title and display all the employees name and their department name.   */

 -- SET SERVEROUTPUT ON;
 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign5_jobtitle.sql
 
CREATE OR REPLACE PROCEDURE jobEmpData (
    jobTitle IN VARCHAR2
) IS
    v_count NUMBER := 0;
BEGIN
    FOR rec IN (
        SELECT e.empName, d.deptName
        FROM employee e, department d WHERE e.deptId = d.deptId AND e.job = jobTitle   
    )
    LOOP
        v_count := v_count + 1;

        DBMS_OUTPUT.PUT_LINE(
            'Employee Name: ' || rec.empName ||
            ' | Department: ' || rec.deptName
        );
    END LOOP;

    IF v_count = 0 THEN
        DBMS_OUTPUT.PUT_LINE(
            'No employees found for job title: ' || jobTitle
        );
    END IF;
END;
/
/* 4. Create a procedure that change name in capital letters by passing employee number to the 
procedure and raise appropriate message is the employee does not exist in the table.  */

 -- SET SERVEROUTPUT ON;
 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign4_capital.sql
 
 
 CREATE OR REPLACE PROCEDURE capitalname (
    empIdParam IN NUMBER
) IS
    empNameParam employee.empName%TYPE;
BEGIN

    SELECT empName
    INTO empNameParam
    FROM employee
    WHERE empId = empIdParam;
	
    -- Update name for the id 
    UPDATE employee
    SET empName = UPPER(empNameParam)
    WHERE empId = empIdParam;

    DBMS_OUTPUT.PUT_LINE('Name updated !!1 ' || UPPER(empNameParam));
	
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Employee with ID ' || empIdParam || ' does not exist.');
   
		WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('An unexpected error occurred.');
END;
/
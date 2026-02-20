/* 6. Create a function that takes department ID and returns the name of the manager of the department. */

 -- SET SERVEROUTPUT ON;
 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign6_managername.sql
 
CREATE OR REPLACE FUNCTION getManagerName (
    deptIdParam IN NUMBER) RETURN VARCHAR2
 IS
    empName employee.empName%TYPE;
BEGIN
    
	SELECT empName INTO empName FROM employee WHERE manager =  deptIdParam;
	
	RETURN 'MANAGER NAME IS A :' || empName;
	
	EXCEPTION
		
		WHEN NO_DATA_FOUND THEN
			RETURN 'NO MANAGER FOUND';
			
		WHEN OTHERS THEN
			RETURN 'UNEXCEPTED ERROR !!!';
END;
/
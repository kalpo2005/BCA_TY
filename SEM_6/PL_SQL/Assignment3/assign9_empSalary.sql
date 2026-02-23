/*  9. Create a function which accepts the empid. If salary<10000 than give raise by 30%. If 
salary <20000 an  salary>=10000 than give raise by 20%. If salary>20000 than give 
raise by 10%.  */

 -- SET SERVEROUTPUT ON;
 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign9_empSalary.sql
 
CREATE OR REPLACE FUNCTION empSalaryIncrease (
    empIdParam IN NUMBER) RETURN VARCHAR2
 IS
	empData employee%ROWTYPE;
	newSalary NUMBER;
BEGIN

	SELECT * INTO empData FROM employee WHERE empId = empIdParam;
	
	IF empData.salary < 10000 THEN
		newSalary := empData.salary + (empData.salary * 30 /100);
	
	ELSIF empData.salary < 20000 AND empData.salary >= 10000 THEN
		newSalary := empData.salary + (empData.salary * 20 /100);
		
	ELSE
		newSalary := empData.salary + (empData.salary * 10 /100);
	END IF;
   
   UPDATE employee SET salary = newSalary WHERE empId = empData.empId;
   
   IF SQL%ROWCOUNT > 0 THEN
        RETURN 'EMP SALARY INCREASED !!!';
    ELSE
        RETURN 'SALARY DOES NOT INCREASED ';
    END IF;

EXCEPTION
	WHEN NO_DATA_FOUND THEN
        RETURN 'Employee not found !!!';

    WHEN OTHERS THEN
        RETURN 'UNEXPECTED ERROR !!!';
END;
/

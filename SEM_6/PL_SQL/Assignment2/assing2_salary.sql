/* 2. Write a PL/SQL program using implicit cursor, which takes as input an employee name. 
If this employee earns more than 5000 then give him commission, which is 25% of his 
salary and if he earns less than 1000 then remove him from the EMP table. Give 
appropriate messages.  */


-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment2\assing2_salary.sql

DECLARE

	empNameEntry VARCHAR2(33) := '&emp_name';
	rowSalary NUMBER;
	rowCount NUMBER(5) := 0;
	
BEGIN
	SELECT salary into rowSalary FROM employees WHERE empName = empNameEntry;
	
	IF rowSalary > 5000 THEN
		
		UPDATE employees SET salary = rowSalary + (25 * rowSalary / 100) WHERE empName = empNameEntry;
		rowCount := SQL%ROWCOUNT;
		DBMS_OUTPUT.PUT_LINE('DATA UPDATED ROWS : ' || rowCount);
	
	ELSE
		DELETE FROM employees WHERE salary < 1000 AND empName = empNameEntry;
		rowCount := SQL%ROWCOUNT;
		DBMS_OUTPUT.PUT_LINE('DATA deleted ROWS : ' || rowCount);
	
	END IF;

END;
/
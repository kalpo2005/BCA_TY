 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign4_procedure.sql

SELECT * FROM employee;
DECLARE
	
	empId NUMBER;
	
BEGIN
	empId := &EMP_ID;
	capitalname(empId);
END;
/

select * from employee;
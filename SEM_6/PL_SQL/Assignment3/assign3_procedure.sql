 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign3_procedure.sql

SELECT * FROM employee;
DECLARE
	
	deptId NUMBER;
	
BEGIN
	deptId := &Dept_ID;
	updateManager(deptId);
END;
/

select * from employee;
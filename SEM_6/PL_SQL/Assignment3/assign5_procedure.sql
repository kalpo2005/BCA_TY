 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign5_procedure.sql

SELECT * FROM employee;
DECLARE
	
	jobTitle VARCHAR2;
	
BEGIN
	jobTitle := &JOB_TITLE;
	jobEmpData(jobTitle);
END;
/

select * from employee;
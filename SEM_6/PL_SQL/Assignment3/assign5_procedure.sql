 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign5_procedure.sql

DECLARE
	
	jobTitle VARCHAR2(20);
	
BEGIN
	jobTitle := '&JOB_TITLE';
	jobEmpData(jobTitle);
END;
/

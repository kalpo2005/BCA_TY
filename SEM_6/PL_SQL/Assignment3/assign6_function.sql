 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign6_function.sql

DECLARE
	
	deptId NUMBER;
	returnData VARCHAR2(100) := '';
	
BEGIN
	deptId := &dept_id;
	returnData := getManagerName(deptId);
	DBMS_OUTPUT.PUT_LINE(returnData);
	
END;
/

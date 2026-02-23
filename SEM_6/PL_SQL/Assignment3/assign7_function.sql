 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign7_function.sql

DECLARE
	
	rollNumber NUMBER;
	returnData VARCHAR2(100);
	
BEGIN
	rollNumber := &student_rollNumber;
	returnData := studentExists(rollNumber);
	DBMS_OUTPUT.PUT_LINE(returnData);
	
END;
/

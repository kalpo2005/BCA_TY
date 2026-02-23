 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign8_function.sql

DECLARE
	
	rollNumber NUMBER;
	returnData VARCHAR2(100);
	
BEGIN
	rollNumber := &rollNumber_for_delete;
	returnData := deleteStudents(rollNumber);
	DBMS_OUTPUT.PUT_LINE(returnData);
	
END;
/

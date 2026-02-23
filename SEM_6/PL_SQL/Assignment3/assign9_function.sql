 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign9_function.sql

DECLARE
	
	empId NUMBER;
	returnData VARCHAR2(100);
	
BEGIN
	empId := &EMP_ID_FOR_SALARY_INCREASE;
	returnData := empSalaryIncrease(empId);
	DBMS_OUTPUT.PUT_LINE(returnData);
	
END;
/

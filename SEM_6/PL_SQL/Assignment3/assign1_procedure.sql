 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign1_procedure.sql
 
 DECLARE
	rollNumber NUMBER(5) := &rollNumber;
	name VARCHAR2(100) := '&name';
	standard NUMBER(2) := &standard;
	mark1 NUMBER(3) := &mark1;
	mark2 NUMBER(3) := &mark2;
	mark3 NUMBER(3) := &mark3;
	
BEGIN

	insertStudent(rollNumber,name,standard,mark1,mark2,mark3);
	
END;
/

SELECT * FROM student;
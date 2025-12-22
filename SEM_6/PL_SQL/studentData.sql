-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\studentData.sql


DECLARE 
	roll NUMBER(3);
	name VARCHAR2(30);
	mark1 NUMBER(2);
	mark2 NUMBER(2);
	mark3 NUMBER(2);
	total NUMBER(3);
	percentage NUMBER(5,2);
	
BEGIN
	
	roll  := &roll;
	name  := '&name';
	mark1 := &mark1;
	mark2 := &mark2;
	mark3 := &mark3;
	
	total := mark1 + mark2 + mark3;
	percentage := (total * 100) / 300;
	
	
	DBMS_OUTPUT.PUT_LINE('Student Detail ');
	DBMS_OUTPUT.PUT_LINE('Student roll number : ' || roll);
	DBMS_OUTPUT.PUT_LINE('Student Name        : ' || name);
	DBMS_OUTPUT.PUT_LINE('Student sub1   mark :' || mark1);
	DBMS_OUTPUT.PUT_LINE('Student sub2   mark :' || mark2);
	DBMS_OUTPUT.PUT_LINE('Student sub3   mark :' || mark3);
	DBMS_OUTPUT.PUT_LINE('Student total  mark :' || total);
	DBMS_OUTPUT.PUT_LINE('Student percentage  :' || percentage);
	--DBMS_OUTPUT.PUT_LINE('Student result is   :' || mark3);
	
	IF (mark1 > 33 AND mark2 > 33 AND mark3 > 33) THEN
	DBMS_OUTPUT.PUT_LINE(' STUDENT RESULT : PASS ');
	
	ELSE
	DBMS_OUTPUT.PUT_LINE(' STUDENT RESULT : FAIL ');
	
	END IF;
	
END;
/
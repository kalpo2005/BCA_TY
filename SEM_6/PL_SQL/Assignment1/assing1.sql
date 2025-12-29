/* 1. Write a PL/SQL Program of mark sheet with displays the seat no, name, marks of 5 
subjects, total of 5 subjects and percentage, also display the result and class of students. */


-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing1.sql


DECLARE 
	roll NUMBER(3);
	name VARCHAR2(30);
	result1 VARCHAR2(30);
	mark1 NUMBER(2);
	mark2 NUMBER(2);
	mark3 NUMBER(2);
	mark4 NUMBER(2);
	mark5 NUMBER(2);
	total NUMBER(3);
	percentage NUMBER(5,2);
	classGrade VARCHAR2(30);
	
BEGIN

	roll  := &roll;
	name  := '&name';
	mark1 := &mark1;
	mark2 := &mark2;
	mark3 := &mark3;
	mark4 := &mark4;
	mark5 := &mark5;
	
	total := mark1 + mark2 + mark3 + mark4 + mark5;
	percentage := (total * 100) / 500;
	
	IF (mark1 > 33 AND mark2 > 33 AND mark3 > 33 AND mark4 > 33 AND mark5 > 33) THEN
	result1 := 'PASS';
	
	ELSE
	result1 := 'FAIL';
	
	END IF;
	
	IF percentage >= 75 THEN
		classGrade := 'DISTINCTION';
	
	ELSIF percentage >= 60 THEN
		classGrade := 'FIRST CLASS';
	
	ELSIF percentage >= 50 THEN
		classGrade := 'SECOND CLASS';
		
	ELSIF percentage >= 33 THEN
		classGrade := 'PASS CLASS';
		
	ELSE
		classGrade := 'FAIL CLASS';
		
	END IF;
	
	DBMS_OUTPUT.PUT_LINE('Student Detail ');
	DBMS_OUTPUT.PUT_LINE('Student roll number : ' || roll);
	DBMS_OUTPUT.PUT_LINE('Student Name        : ' || name);
	DBMS_OUTPUT.PUT_LINE('Student sub1   mark :' || mark1);
	DBMS_OUTPUT.PUT_LINE('Student sub2   mark :' || mark2);
	DBMS_OUTPUT.PUT_LINE('Student sub3   mark :' || mark3);
	DBMS_OUTPUT.PUT_LINE('Student sub4   mark :' || mark4);
	DBMS_OUTPUT.PUT_LINE('Student sub5   mark :' || mark5);
	DBMS_OUTPUT.PUT_LINE('Student total  mark :' || total);
	DBMS_OUTPUT.PUT_LINE('Student percentage  :' || percentage);
	DBMS_OUTPUT.PUT_LINE('Student Class       :' || classGrade);
	DBMS_OUTPUT.PUT_LINE('Student result is   :' || result1);
	
	
END;
/
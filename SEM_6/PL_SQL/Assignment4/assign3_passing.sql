/*  Write a trigger which will allow only those item numbers to be inserted which 
start with ‘I’ or ‘i’. */

 -- SET SERVEROUTPUT ON;
 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment4\assign3_passing.sql
 
 CREATE OR REPLACE TRIGGER subjecRecordUPDATE
 BEFORE UPDATE ON subjecRecord FOR EACH ROW
 
 BEGIN
 
	IF :NEW.passingMarks < :OLD.passingMarks THEN
		
		RAISE_APPLICATION_ERROR(-20003,'MARKS MUST BE GRATER TO OLD MARKS !!!');
		
	END IF;
	
 END;
 /
SELECT * FROM subjecRecord;
 
 /*
 DROP TABLE subjecRecord;
 CREATE TABLE subjecRecord(
	subjectId NUMBER(20),
	subjectName VARCHAR2(30),
	passingMarks NUMBER(2)
);

	INSERT INTO subjecRecord(subjectId,subjectName,passingMarks) VALUES(23,'MATHS', 20);
	INSERT INTO subjecRecord(subjectId,subjectName,passingMarks) VALUES(24,'GUJRATI', 20);
	INSERT INTO subjecRecord(subjectId,subjectName,passingMarks) VALUES(25,'SOCIAL SCIENCE', 20);
	
	UPDATE subjecRecord SET passingMarks = 15 WHERE subjectId = 23;
	UPDATE subjecRecord SET passingMarks = 25 WHERE subjectId = 24;

*/

SELECT * FROM subjecRecord;
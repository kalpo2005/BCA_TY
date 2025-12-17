// Oracle Assignment 3

// CREATE A TABLE 

	CREATE TABLE student_result(
		stud_rollno NUMBER(3),
		stud_name VARCHAR2(15),
		city VARCHAR2(20),
		oracle NUMBER(3),
		se NUMBER(3),
		asp NUMBER(3),
		network NUMBER(3)
	);
	
// Select query
	SELECT * FROM student_result;
	
	
1. Insert 10 record 
	
	INSERT INTO student_result(stud_rollno,stud_name,city,oracle,se,asp,network) VALUES (01,'kalpesh','botad',80,65,78,55);
	
	INSERT INTO student_result(stud_rollno,stud_name,city,oracle,se,asp,network) VALUES (02,'anil','kaniyad',50,88,78,65);
	
	INSERT INTO student_result(stud_rollno,stud_name,city,oracle,se,asp,network) VALUES (03,'dhruv','jamnagr',58,75,74,35);
	
	INSERT INTO student_result(stud_rollno,stud_name,city,oracle,se,asp,network) VALUES (04,'darshan','rajkot',96,55,45,75);
	
	INSERT INTO student_result(stud_rollno,stud_name,city,oracle,se,asp,network) VALUES (05,'jenil','jasdan',85,55,86,36);
	
	INSERT INTO student_result(stud_rollno,stud_name,city,oracle,se,asp,network) VALUES (06,'vijay','surat',35,28,03,45);
	
	INSERT INTO student_result(stud_rollno,stud_name,city,oracle,se,asp,network) VALUES (07,'bhavik','narmada',85,58,86,55);
	
	INSERT INTO student_result(stud_rollno,stud_name,city,oracle,se,asp,network) VALUES (08,'pradip','bharuch',86,45,75,17);
	
	INSERT INTO student_result(stud_rollno,stud_name,city,oracle,se,asp,network) VALUES (09,'yash','amreli',75,52,82,91);
	
	INSERT INTO student_result(stud_rollno,stud_name,city,oracle,se,asp,network) VALUES (10,'haresh','botad',76,58,72,11);

	
2. Display all information
	SELECT * FROM student_result;
	
3. Structure of a database
	DESC student_result;
	
4. Add two new column like total and percenteage
	ALTER TABLE student_result ADD (total NUMBER(3),perc NUMBER(6,2));
	
5. Add two new column like total and percenteage
	UPDATE student_result SET total=oracle+network+asp+se;
	UPDATE student_result SET perc=total/4;
	
6. Unique city
	SELECT DISTINCT city FROM student_result;	
	
7. Descendig by the name
	SELECT * FROM student_result ORDER BY stud_name DESC;
	
8. Info all who frome rajkot or botad
	SELECT * FROM student_result WHERE city = 'botad' OR city='rajkot';
	
9. Total between 175 to 230
	SELECT * FROM student_result WHERE total BETWEEN 175 AND 230;
		
10. 65 IN THE SE SUBJECT 
	SELECT * FROM student_result WHERE se = 65;
	
11. oracle between 50 to 60 and perc are > 55
	SELECT * FROM student_result WHERE oracle BETWEEN 50 AND 60 AND perc < 55;
	>
	
12. All subject is a above 40
	SELECT * FROM student_result WHERE  oracle > 40 AND se > 40 AND asp > 40 AND network > 40;

13. Disriction all student 
	SELECT * FROM student_result WHERE  perc >= 70;
	
14. delete asp in >55 and network in <60
	DELETE FROM student_result WHERE asp > 55 AND network < 60;

15. Rename a table
	RENAME studentMarksheet TO student_result;
	
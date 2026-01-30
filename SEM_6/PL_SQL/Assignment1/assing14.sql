/* 14. Write a PL/SQL Program to find area of circles with radius greater than 3 and less than 
 equal to 7 and store the result in a table with attributes radius and area. */

-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing14.sql

 CREATE TABLE storeArea(
     radius NUMBER(10,2),
     area   NUMBER(10,2)
 );

DECLARE
    r NUMBER;
    a NUMBER;
    isDone VARCHAR(10) := 'NO';

BEGIN 

    for r in 4..7
	 loop
            a := r * r * 3.14;
            INSERT INTO storeArea(radius, area) VALUES (r, a);
            isDone := 'OK';
		
		
    END LOOP;

END;
/

SELECT * FROM storeArea;

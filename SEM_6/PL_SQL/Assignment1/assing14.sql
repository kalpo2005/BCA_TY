/* 14. Write a PL/SQL Program to find area of circles with radius greater than 3 and less than 
 equal to 7 and store the result in a table with attributes radius and area. */

-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing14.sql

 CREATE TABLE storeArea(
     radius NUMBER(10,2),
     area   NUMBER(10,2)
 );

DECLARE r NUMBER;

a NUMBER;

BEGIN -- Calculate and insert area for radius > 3 and <= 7
FOR r IN 10..12 LOOP a := 3.14 * r * r;

INSERT INTO
    storeArea(radisus, area)
VALUES
    (r, a);

END LOOP;

COMMIT;

END;

/
/*
10. Create a function that take customer number and return the bill amount from the 
CUSTOMER table. 
*/

-- SET SERVEROUTPUT ON; 	
 -- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment3\assign10_ammounts.sql
 
CREATE OR REPLACE FUNCTION findAmount (
    customerIdParam IN NUMBER) RETURN VARCHAR2
 IS
	customerDetail customer%ROWTYPE;
BEGIN

	SELECT * INTO customerDetail FROM customer WHERE customerId = customerIdParam;
	
	RETURN 'CUSTOMER name is ' || customerDetail.customerName || ' || Amount is a '|| customerDetail.amount; 
   
EXCEPTION
	WHEN NO_DATA_FOUND THEN
        RETURN 'CUSTOMER not found !!!';

    WHEN OTHERS THEN
        RETURN 'UNEXPECTED ERROR !!!';
END;
/

/*

CREATE TABLE customer(
	customerId NUMBER(3),
	customerName VARCHAR2(50),
	amount NUMBER(10)
);

	INSERT INTO customer(customerId,customerName,amount) VALUES(23,'KALPESH BAVALIYA',25000);
	INSERT INTO customer(customerId,customerName,amount) VALUES(24,'DARSHAN SANKALIYA',999999);
	INSERT INTO customer(customerId,customerName,amount) VALUES(25,'YAS DHOLAKIYA',566565);
	INSERT INTO customer(customerId,customerName,amount) VALUES(21,'DHRUV DEGAMA',265600);
	INSERT INTO customer(customerId,customerName,amount) VALUES(83,'Ishita BARAIYA',2000);
	INSERT INTO customer(customerId,customerName,amount) VALUES(73,'iran MAKWANA',2004750);

*/

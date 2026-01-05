/* 15. Write a PL/SQL Program to insert records in CUSTOMER table. Consider structure of 
table CUSTOMER as (cust_id, cust_name, cust_area, cust_phone).  */

-- @ D:\KALPESH_BAVALIYA\SEM_6\PL_SQL\Assignment1\assing15.sql

 CREATE TABLE customer(
     custId NUMBER(8),
     custName   VARCHAR2(50),
     custArea   VARCHAR2(50),
     custPhone NUMBER(15)
 );

DECLARE
	custId NUMBER(8) := &custId,
    custName   VARCHAR2(50) := '&custName';
    custArea   VARCHAR2(50) := '&cust_area';
    custPhone NUMBER(15) := &custPhone;

BEGIN 

	INSERT INTO customer(custId,custName,custArea,custPhone) VALUES (custId,custName,custArea,custPhone);
    
END;
/


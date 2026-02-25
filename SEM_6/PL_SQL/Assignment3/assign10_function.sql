 --  	  

 SELECT * FROM customer;
DECLARE
	
	custmerId NUMBER;
	returnData VARCHAR2(100);
	
BEGIN
	custmerId := &CUSTOMER_ID_FOR_GETTING_INFO;
	returnData := findAmount(custmerId);
	DBMS_OUTPUT.PUT_LINE(returnData);
	
END;
/

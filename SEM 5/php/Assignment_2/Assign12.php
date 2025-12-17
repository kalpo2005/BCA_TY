<?php
	
	echo "Display all the Date functions :";
	
	// 1. DATE FUNCTIONS
	echo "<h2>Date function </h2>" ;
	echo "<b> Today date is with time : </b>" .date("y-m-d h:i:s");
	
	// 2. DATE FUNCTIONS
	echo "<h2>Time function </h2>" ;
	echo "<b> Today date is with time : </b>" .time("h:i:s");
	
	// 3. GETDATE FUNCTIONS
	echo "<h2>GETDATE function </h2>" ;
	$getDate = getdate();
	echo "<pre>";
	print_r($getDate);
	
	// 4. GET TIME OF DAY
	echo "<h2>Get time of day function </h2>" ;
		$getDate = gettimeofday();
	echo "<pre>";
	print_r($getDate);
	
	// 5. LOCAL TIME OF THE SYSTERM
	echo "<br> <h2>LOCAL of day function </h2>" ;
		$getDate = localtime(time(),true);
	echo "<pre>";
	print_r($getDate);
	
	// 6. CHECK DATE OF THE SYSTERM
	echo "<h2>CHECK DATE function </h2>" ;

	echo "<br> <p>Date 25/23/2005</p>" ;
	echo "<pre>";
	var_dump(checkdate(23,25,2005));
	
	echo "<p>Date 2/12/2005</p>" ;
	echo "<pre>";
	var_dump(checkdate(12,2,2005));
	
?>
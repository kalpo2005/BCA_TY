<?php

	$host = 'localhost';
	$user = 'root';
	$password = '';
	$database = 'kalpesh';

	$conn = mysqli_connect($host,$user,$password,$database);
	
	if(!$conn){
		die("Database not connected !!!!");
	}
	$sql = "INSERT INTO studentData(roll,name) VALUE (23,'KALPESH')";
	
	if(!mysqli_query($conn,$sql)){
		die("query fail !!!");
	}
	echo "Data successfully insert !!! ";
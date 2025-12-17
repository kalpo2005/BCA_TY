<?php

	$host = 'localhost';
	$user = 'root';
	$password = '';
	//$database = 'kalpesh';

		$conn = mysqli_connect($host,$user,$password);
		
		if(!$conn){
			die("Database not connected !!!!");
		}
		
		if(mysqli_query($conn,"CREATE DATABASE kalpeshDemo"))
		//if(mysqli_query($conn,"drop DATABASE kk"))
			echo "done database ";
		else
			echo " no create";

?>
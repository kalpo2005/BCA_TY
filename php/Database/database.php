<?php

	function getDatabase(){
		$host = 'localhost';
		$user = 'root';
		$password = '';
		$database = 'kalpesh';

		$conn = mysqli_connect($host,$user,$password,$database);
		
		if(!$conn){
			die("Database not connected !!!!");
		}
		
		return $conn;
	}
	
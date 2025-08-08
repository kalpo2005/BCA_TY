<?php
	require_once "database.php";
	
	$conn = getDatabase();
	
	// for the crating table
	$sql = CREATE TABLE users(
				user_id INT(5) PRIMARY  KEY AUTO INCREMENT,
				
				
			);
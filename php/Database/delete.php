<?php

	require_once "database.php";
	
	$conn = getDatabase();
	$tableName = "studentdata";
	$result = "";
	if($_SERVER['REQUEST_METHOD']==='POST'){
		$data = array();
		
		foreach($_POST as $key=>$value){
			$data[$key]=$value;
		}
		
		$keys = array_keys($data);
	
		$sql = "DELETE FROM {$tableName} WHERE R";
		
		try{
			if(!mysqli_query($conn,$sql))
				die("Query Failed !!!");
			else
				$result = "Data successfully Inseted !!!";
		}catch(Exception $e){
				echo $e->getMessage();
		}
	}	
?>

<html>
	<head>
		<title>Demo 1</title>
		<link rel="stylesheet" href="css/style.css">
	</head>

	<body>
		<div class="container">
			<h2>demo 1</h2>
			<form method="POST">
				<input type="number" name="roll" required placeholder="Enter a roll Number">
				
				<input type="text" name="name" required placeholder="Enter a student name">
				<button type="submit">Insert Data</button>
			</form>
		</div>
		<div class="result"><h3><?php echo $result; ?></h3></div>
	</body>
</html>
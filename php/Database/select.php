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
	
		$sql = "SELECT * FROM {$tableName} WHERE roll = {$data['roll']}";
		
		try{
			$kal = mysqli_query($conn,$sql);
			$row = mysqli_affected_rows($conn);
			if($row === 0){
				$result = "No data found";
			}
			else{
				while($data = mysqli_fetch_assoc($kal)){
				
					//$data = mysqli_fetch_assoc($kal);
					$result.="Student roll no :".$data['roll'];
					$result.=", Student name is :" .$data['name']."<br>";
				}
			}
		}catch(Exception $e){
				echo $e->getMessage();
		}
		
	}	
?>

<html>
	<head>
		<title>Select records </title>
		<link rel="stylesheet" href="css/style.css">
	</head>

	<body>
		<div class="container">
			<h2>Select records</h2>
			<form method="POST">
				<input type="number" name="roll" required placeholder="Enter a roll for Select ">
				
				<button type="submit">Fetch Record</button>
			</form>
		</div>
		<div class="result"><h3><?php echo $result; ?></h3></div>
	</body>
</html>
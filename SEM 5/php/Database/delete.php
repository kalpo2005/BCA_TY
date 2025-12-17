<?php

	require_once "../../Database/database.php";
	
	$conn = getDatabase();
	$tableName = "studentdata";
	$result = "";
	if($_SERVER['REQUEST_METHOD']==='POST'){
		$data = array();
		
		foreach($_POST as $key=>$value){
			$data[$key]=$value;
		}
		
		$keys = array_keys($data);
	
		$sql = "DELETE FROM {$tableName} WHERE roll = {$data['roll']}";
		
		try{
			$kal = mysqli_query($conn,$sql);
			//echo $kal;
			if(mysqli_affected_rows($conn)!==0){
				$result = "Data successfully Deleted";
			}
			else{
				$result = "Data can't deleted ";
			}
		}catch(Exception $e){
				echo $e->getMessage();
		}
		
	}	
?>

<html>
	<head>
		<title>Delete records </title>
		<link rel="stylesheet" href="css/style.css">
	</head>

	<body>
		<div class="container">
			<h2>Delete records</h2>
			<form method="POST">
				<input type="number" name="roll" required placeholder="Enter a roll for delete ">
				
				<button type="submit">Delete Record</button>
			</form>
		</div>
		<div class="result"><h3><?php echo $result; ?></h3></div>
	</body>
</html>
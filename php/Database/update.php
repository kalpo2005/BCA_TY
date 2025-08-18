<?php

	require_once "database.php";
	
	$conn = getDatabase();
	$tableName = "studentdata";
	$result = "";
	if($_SERVER['REQUEST_METHOD']==='POST'){
		
		$where = $_POST['rollOld'];
		$data = array();
		unset($_POST['rollOld']);
		
		foreach($_POST as $key=>$value){
			if(!empty($value))
				$data[]="$key = '$value'";
		}
		
		 $sql = "UPDATE {$tableName} SET ". implode(',',$data)." WHERE roll = $where";
		// echo $sql;
	
		$update = mysqli_query($conn,$sql);
		if(!$update || mysqli_affected_rows($conn)===0)
			$result = "Data wan not updated !!!";
		else
			$result = "Data update successfully !!!";
	}
?>

<html>
	<head>
		<title>Update data</title>
		<link rel="stylesheet" href="css/style.css">
	</head>

	<body>
		<div class="container">
			<h2>Update data</h2>
			<form method="POST">
				<input type="number" name="rollOld" required placeholder="Enter a roll Number">
				
				<input type="number" name="roll" placeholder="Enter a new roll number">
				<input type="text" name="name" placeholder="Enter a new name">
				
				
				<button type="submit">update Data</button>
			</form>
		</div>
		<div class="result"><h3><?php echo $result; ?></h3></div>
	</body>
</html>
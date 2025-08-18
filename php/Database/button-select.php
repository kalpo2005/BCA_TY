<?php

	require_once "database.php";
	
	$conn = getDatabase();
	$tableName = "studentdata";
	$result = "";
	$data = array();
	if($_SERVER['REQUEST_METHOD']==='POST'){
		
		$sql = "SELECT * FROM {$tableName} ORDER BY roll ASC";
		$kal = mysqli_query($conn,$sql);
			$row = mysqli_affected_rows($conn);
			if($row === 0){
				$result = "No data found";
			}
			else{
				$i=0;
				while($row >$i){
					$data[$i] = mysqli_fetch_assoc($kal);
					$i++;
				}unset($data[$i]);
				$lenght = count($data);
			}
				$result = "Roll Number is : {$data[0]['roll']}, Student name is : {$data[0]['name']}";
			//echo"<pre>";
		//print_r($data);
		
		if(isset($_POST['first']) && $_POST['first']==="first"){
			$result = "Roll Number is : {$data[0]['roll']}, Student name is : {$data[0]['name']}";
		}
		
		if(isset($_POST['prev']) && $_POST['prev']==="prev"){
		
		}
		
		if(isset($_POST['next']) && $_POST['next']==="next"){
			
		}
		
		if(isset($_POST['last']) && $_POST['last']==="last"){
				$result = "Roll Number is : {$data[$lenght-1]['roll']}, Student name is : {$data[$lenght-1]['name']}";
			
		}
	}
?>

<html>
	<head>
		<title>Select records </title>
		
	</head>

	<body>
		<div class="container">
			<h2>Select records</h2>
			<form method="POST">
				<input type="submit" name="first" value="first"></input>
				<input type="submit" name="prev" value="prev"></input>
				<input type="submit" name="next" value="next"></input>
				<input type="submit" name="last"  value="last"></input>
			</form>
		</div>
		<div class="result"><h3><?php echo $result; ?></h3></div>
	</body>
</html>
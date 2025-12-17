<?php

	require_once "../../Database/database.php";
	
	$conn = getDatabase();
	$tableName = "studentdata";
	$result = "";
	$data = array();
	$currentPage=0;
	$sql = "SELECT * FROM {$tableName} ORDER BY roll ASC";
		$kal = mysqli_query($conn,$sql);
		if(!$kal) die("Something went wrong  !!!");
		
			$row = mysqli_affected_rows($conn);
			if($row === 0){
				$result = "No data found";
			}
			else{
				$i=0;
				while($row >$i){
					$data[$i] = mysqli_fetch_assoc($kal);
					$i++;
				}
				unset($data[$i]);
				$lenght = count($data);
			} 
	
	if($_SERVER['REQUEST_METHOD']==='POST'){
		
		if(isset($_POST['first']) && $_POST['first']==="first"){
			$currentPage=0;
		}
		
		if(isset($_POST['prev']) && $_POST['prev']==="prev"){
		$currentPage=$_POST['page']-1;
		
		if($currentPage<0)
				$currentPage=$lenght-1;
		}
		
		if(isset($_POST['next']) && $_POST['next']==="next"){
			$currentPage=$_POST['page']+1;
			if($currentPage>$lenght-1)
				$currentPage=0;
		}
		
		if(isset($_POST['last']) && $_POST['last']==="last"){
			$currentPage=$lenght-1;
		}
	}
	
	$result = "Roll Number is : {$data[$currentPage]['roll']}, Student name is : {$data[$currentPage]['name']}";
?>

<html>
	<head>
		<title>Select records </title>
		
	</head>

	<body>
		<div class="container">
			<h2>Select records</h2>
			<form method="POST">
			<input type="hidden" name="page" value="<?php echo $currentPage; ?>">
				<input type="submit" name="first" value="first"></input>
				<input type="submit" name="prev" value="prev"></input>
				<input type="submit" name="next" value="next"></input>
				<input type="submit" name="last"  value="last"></input>
			</form>
		</div>
		<div class="result"><h3><?php echo $result; ?></h3></div>
	</body>
</html>
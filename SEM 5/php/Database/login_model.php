<?php
	require_once "database.php";
	
	$conn = getDatabase();
	
	// for the crating table
	/*$sql = "CREATE TABLE users(
				user_id INT(5) PRIMARY  KEY,
				user_name VARCHAR(255),
				mobile_number INT(10),
				email VARCHAR(255) UNIQUE,
				password VARCHAR(255),
				address TEXT(2000),
				city VARCHAR(255),
				gender VARCHAR(255)
			)";
	*/
	
	$tableName = "users";
	$result = "";
	if($_SERVER['REQUEST_METHOD']==='POST'){
		$data = array();
		
		foreach($_POST as $key=>$value){
			if(is_array($value) && !empty($value)){
				$data[$key] = "'". implode(',',$value) . "'";
			}else if(!empty($value)){
					$data[$key]="'".$value."'";
			}
		}
		
		$keys = array_keys($data);
	
		 $sql = "INSERT INTO {$tableName} (".implode(',',$keys).") VALUE (".implode(',',$data).")";

	
		if(!mysqli_query($conn,$sql))
			$result = "Query Failed !!!";
		else
			$result = "Data successfully Inseted !!!";
	if($result!="")
	{
		echo"<script>
		a=confirm('{$result}');
		if(a) window.location.href='addUser.php';
		</script>";
		
		//header("Location:addUser.php");
	}		

	}
?>	
	

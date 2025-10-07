<?php

require_once "../../Database/database.php";

$conn = getDatabase();
$tableName = "student";
$result = "";
$isLogin = false;
$isError = false;
$error = array();
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
	$data = array();	

	foreach ($_POST as $key => $value) {
		
		if(empty($_POST[$key])){
			$isError = true;
			$error[$key] = "Fill the user " .$key;	
		
		}else{
			// all the validatoin
			if(is_Numeric($key === 'USERNAME')){
				$isError = true;
				$error[$key] = "usernamme must be string";		
			}
		}		
			$data[$key] = $value;
	}
	
	if(!$isError){
	$keys = array_keys($data);

	$sql = "INSERT INTO {$tableName} ('" . implode("' , '", $keys) . "') VALUES (" . implode(',', $data) . ")";
	try {
		if (!mysqli_query($conn, $sql)) {
		echo $sql;
			die("Query Failed !!!");
		} else {
			$result = "Data successfully Inseted !!!";
		}
	} catch (Exception $e) {
		$result =  $e->getMessage();
	}

	echo "<script>alert(' $result')</script>";

	if ($isLogin) {
		header("Location:welcome.php?name=" . $data['STUD_NAME']);
	}}
}
?>

<html>

<head>
	<title>Contact form</title>
	<link rel="stylesheet" href="..\css\main.css">
</head>

<body>
	<div class="container">
		<table>
			<thead>
				<tr>

					<th colspan="2">
						<h3>STUDENT INFORMATION</h3>

					</th>
				</tr>
			</thead>

			<tbody>
				<form method="POST">

					<tr>
						<td>USERNAME:</td>
						<td><input type="text" name="USERNAME" value="<?php if(isset($data['USERNAME'])) echo $data['USERNAME']; ?>" placeholder="Enter username" >
						<?php if(!empty($error['USERNAME']) && $isError ){
							echo "<p class='errorMessage'>". $error['USERNAME'] . "</p>"; } ?>
						</td>
						
					</tr>

					<tr>
						<td>student Email:</td>
						<td><input type="email" name="STUD_EMAIL"  value="<?php if(isset($data['STUD_EMAIL'])) echo $data['STUD_EMAIL']; ?>" placeholder="Enter email id" >
						<?php if(!empty($error['STUD_EMAIL']) && $isError ){
						echo "<p class='errorMessage'>". $error['STUD_EMAIL'] . "</p>"; } ?>
						</td>
					</tr>

					<tr>
						<td>PASSWORD</td>
						<td><input type="password" name="PASSWORD" value="<?php if(isset($data['PASSWORD'])) echo $data['PASSWORD']; ?>" placeholder="Enter password" >
						<?php if(!empty($error['PASSWORD']) && $isError ){
						echo "<p class='errorMessage'>". $error['PASSWORD'] . "</p>"; } ?>
						</td>
					</tr>

					<tr>
						<td>STUD_ID</td>
						<td><input type="number" name="STUD_ID" value="<?php if(isset($data['STUD_ID'])) echo $data['STUD_ID']; ?>" placeholder="Enter student id" >
						<?php if(!empty($error['STUD_ID']) && $isError ){
						echo "<p class='errorMessage'>". $error['STUD_ID'] . "</p>"; } ?>
						</td>
					</tr>

					<tr>
						<td>NAME</td>
						<td><input type="text" name="STUD_NAME" value="<?php if(isset($data['STUD_NAME'])) echo $data['STUD_NAME']; ?>" placeholder="Enter your name" >
						<?php if(!empty($error['STUD_NAME']) && $isError ){
						echo "<p class='errorMessage'>". $error['STUD_NAME'] . "</p>"; } ?>
						</td>
					</tr>

					<tr>
						<td>ADDRESS</td>
						<td><input type="text" name="STUD_ADD" value="<?php if(isset($data['STUD_ADD'])) echo $data['STUD_ADD']; ?>" placeholder="Enter address" >
						<?php if(!empty($error['STUD_ADD']) && $isError ){
						echo "<p class='errorMessage'>". $error['STUD_ADD'] . "</p>"; } ?>
						</td>
					</tr>

					<tr>
						<td>STANDARD</td>
						<td><input type="text" name="STUD_STD" value="<?php if(isset($data['STUD_STD'])) echo $data['STUD_STD']; ?>" placeholder="Enter standard" >
						<?php if(!empty($error['STUD_STD']) && $isError ){
						echo "<p class='errorMessage'>". $error['STUD_STD'] . "</p>"; } ?>
						</td>
					</tr>

					<tr>
						<td>DOB</td>
						<td><input type="date" name="STUD_DOB" value="<?php if(isset($data['STUD_DOB'])) echo $data['STUD_DOB']; ?>" placeholder="Enter dob" >
						<?php if(!empty($error['STUD_DOB']) && $isError ){
						echo "<p class='errorMessage'>". $error['STUD_DOB'] . "</p>"; } ?>
						</td>
					</tr>

					<tr>
						<td colspan="2"><button type="submit" id="btn">Submit</button></td>
					</tr>

				</form>
			</tbody>

		</table>

		<!--CREATE TABLE student(			
STUD_ID VARCHAR(05),
STUD_NAME VARCHAR(20),
STUD_ADD VARCHAR(20),
STUD_STD INT(05),
STUD_DOB VARCHAR(10),
STUD_EMAIL VARCHAR(50) UNIQUE,
USERNAME VARCHAR(30),
PASSWORD VARCHAR(30)
); -->


	</div>
</body>

</html>
<?php

require_once "../../Database/database.php";

$conn = getDatabase();
$tableName = "student";
$result = "";
$isLogin = false;
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
	$data = array();

	foreach ($_POST as $key => $value) {
		$data[$key] = "'" . $value . "'";
	}
	
	$keys = array_keys($data);

	$sql = "INSERT INTO {$tableName} (" . implode(',', $keys) . ") VALUES (" . implode(',', $data) . ")";
	try {
		if (!mysqli_query($conn, $sql)) {
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
	}
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
						<td><input type="text" name="USERNAME" placeholder="Enter username" required></td>
					</tr>

					<tr>
						<td>student Email:</td>
						<td><input type="email" name="STUD_EMAIL" placeholder="Enter email id" required></td>
					</tr>

					<tr>
						<td>PASSWORD</td>
						<td><input type="password" name="PASSWORD" placeholder="Enter password" required></td>
					</tr>

					<tr>
						<td>STUD_ID</td>
						<td><input type="number" name="STUD_ID" placeholder="Enter student id" required></td>
					</tr>

					<tr>
						<td>NAME</td>
						<td><input type="text" name="STUD_NAME" placeholder="Enter your name" required></td>
					</tr>

					<tr>
						<td>ADDRESS</td>
						<td><input type="text" name="STUD_ADD" placeholder="Enter address" required></td>
					</tr>

					<tr>
						<td>STANDARD</td>
						<td><input type="text" name="STUD_STD" placeholder="Enter standard" required></td>
					</tr>

					<tr>
						<td>DOB</td>
						<td><input type="date" name="STUD_DOB" placeholder="Enter dob" required></td>
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
<?php

require_once "../../Database/database.php";

$conn = getDatabase();
$tableName = "student";
$result = "";
$isLogin = false;
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
	$data = array();

	foreach ($_POST as $key => $value) {
		$data[$key] = $value;
	}

	$keys = array_keys($data);

	$sql = "SELECT * FROM {$tableName} WHERE USERNAME = '{$data['USERNAME']}'";

	try {
		$kal = mysqli_query($conn, $sql);
		$row = mysqli_affected_rows($conn);
		if ($row === 0) {
			die("No user found");
		} else {
			$student = mysqli_fetch_assoc($kal);
			if ($student['PASSWORD'] === $data['PASSWORD']) {
				$sendData = '';
				foreach ($student as $key => $value) {
					$sendData .= "$key=$value&";
				}
				header("Location:welcome.php?" . $sendData);
			} else {
				throw new Exception("Password match !!!");
			}
		}
	} catch (Exception $e) {
		die($e->getMessage());
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

					<td>PASSWORD</td>
					<td><input type="password" name="PASSWORD" placeholder="Enter password" required></td>
					</tr>

					<tr>
						<td colspan="2"><button type="submit" id="btn">Submit</button></td>
					</tr>

				</form>
			</tbody>

		</table>




	</div>
</body>




</html>
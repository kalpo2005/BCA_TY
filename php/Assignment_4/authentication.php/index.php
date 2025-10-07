<?php
session_start();

if(!isset($_SESSION['isLogin']) || $_SESSION['isLogin'] != true){
	header("Location:login.php");
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Home page</title>
	<link rel="stylesheet" href="..\css\main.css">
</head>

<body>

	<div class="container">
		<h2>You are successfully Login !!!</h2>

		<form method="POST" id="form" action="logout.php">

			<div class="field">
				<p>Click here to logout !!!</p>
				<button type="submit" id="btn">Logout</button>
			</div>

		</form>
	</div>

</body>

</html>
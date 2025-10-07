<?php
session_start();

if(isset($_SESSION['isLogin']) && $_SESSION['isLogin']=== true)
	header("Location:index.php");

$isError = false;
$error = array();
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
	$data = array();

	foreach ($_POST as $key => $value) {

		if (empty($_POST[$key])) {
			$isError = true;
			$error[$key] = "Fill the user " . $key . "!!!";
		}
		$data[$key] = $value;
	}


	//username validation
	if (!empty($data['username'])) {
		if ($data['username'] !== 'kalpesh') {
			$isError = true;
			$error['username'] = "User not found !!!";
		}
	}
	
	if(!$isError && $data['password'] !== '123'){
		$isError = true;
		$error['password'] = "password is wrong !!!";
	}
	
	if(!$isError){
		$_SESSION['isLogin'] = true;
		header("Location:index.php");
	}

}
?>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Login Form</title>
	<link rel="stylesheet" href="..\css\main.css">
</head>

<body>

	<div class="container">
		<h2>Enter your credential</h2>

		<form method="POST" id="form" action="">


			<div class="field">
				<p>Username</p>
				<input type="text" name="username" value="<?php if (isset($data['username'])) echo $data['username']; ?>" placeholder="Enter username">
				<?php if (!empty($error['username']) && $isError) {
					echo "<p class='errorMessage'>" . $error['username'] . "</p>";
				} ?>
			</div>


			<div class="field">
				<p>Enter Password</p>
				<input type="password" name="password" value="<?php if (isset($data['password'])) echo $data['password']; ?>" placeholder="Enter password">
				<?php if (!empty($error['password']) && $isError) {
					echo "<p class='errorMessage'>" . $error['password'] . "</p>";
				} ?>
			</div>

			<div class="field">
				<button type="submit" id="btn">Submit</button>
			</div>

		</form>
	</div>

</body>

</html>
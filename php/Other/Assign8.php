<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
	$Number1 =floor($_POST['number1']/10);	
	$Number2 = $_POST['number1']%10;	

}
?>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Seprate Number</title>
	<link rel="stylesheet" href="index.css">
</head>

<body>

	<div class="container">
		<h2>Seprate Number</h2>

		<form method="POST" id="form">

			<div class="field">
				<p>Number 1</p>
				<input type="number" name="number1" placeholder="Enter Number for seprate" required>
			</div>

			<div class="field">
				<button type="submit" id="btn">Submit</button>
			</div>

		</form>
	</div>

	<?php if (isset($Number1)): ?>
		<div class="result">
			<h3> Number 1 is: <?php echo $Number1; ?></h3>
			<h3> Number 2 is :<?php echo $Number2; ?></h3>
			
		</div>
	<?php endif; ?>
	
</body>

</html>
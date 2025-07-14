<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
	$Number = $_POST['number1'];	
	$km= $Number/1000;
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Registration Form</title>
	<link rel="stylesheet" href="index.css">
</head>

<body>

	<div class="container">
		<h2>Registration Form</h2>

		<form method="POST" id="form">

			<div class="field">
				<p>Meter</p>
				<input type="number" name="number1" placeholder="Enter Meter" required>
			</div>

			

			<div class="field">
				<button type="submit" id="btn">Submit</button>
			</div>

		</form>
	</div>

	<?php if (isset($km)): ?>
		<div class="result">
			<h3> <?php echo $Number. " meter is ".$km . " KiloMeter "; ?></h3>
		</div>
	<?php endif; ?>
	
</body>

</html>
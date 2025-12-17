<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
	$number1 = $_POST['number1'];	
	$number2 = $_POST['number2'];	
	$number3 = $_POST['number3'];	

	if($number1 > $number2){
		if($number1 > $number3)
			$grater=$number1;
		else
			$grater=$number3;
	}else{
		if($number2 > $number3)
			$grater=$number2;
		else
			$grater=$number3;
	}
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>swap</title>
	<link rel="stylesheet" href="index.css">
	
</head>

<body>

	<div class="container">
		<h2>find big number</h2>

		<form method="POST" id="form">

			<div class="field">
				<p>Number 1</p>
				<input type="number" name="number1" placeholder="Enter Number 1" required>
			</div>

			<div class="field">
				<p>Number 2</p>
				<input type="number" name="number2" placeholder="Enter Number 2" required>
			</div>
			
			<div class="field">
				<p>Number 3</p>
				<input type="number" name="number3" placeholder="Enter Number 3" required>
			</div>

			<div class="field">
				<button type="submit" id="btn">Submit</button>
			</div>

		</form>
	</div>

	<?php if (isset($grater)): ?>
		<div class="result">
			<h3> Number is  <?php echo $grater; ?></h3>
			
		</div>
	<?php endif; ?>
	
</body>

</html>
<?php

	if($_SERVER["REQUEST_METHOD"]==="POST"){
		$number1 = $_POST['number1'];
		$number2 = $_POST['number2'];
		
		$sum = $number1+$number2; 
		$sub = $number1-$number2;
		
	}
?>	
<html>
	<head>
	<title>sum</title>
	<link rel="stylesheet" href="main.css">
	
	</head>
	
	<body>
	
	<div class="container">

	<h2>Calcutalor</h2>
	<form method="POST" action="">
	
	<div class="input-field">
		<span style="display:block;">Enter a number 1</span>
		<input type="number" name="number1">
		
		</div>
		
		<div class="input-field">
		<span style="display:block;">Enter a number 2</span>
		<input type="number" name="number2">
		
		</div>
		
		<div class="input-field">	
		<input type="submit" value="submit">
		</div>
	
	</form>
	
	<div class="result">
	
	<?php if(isset($sub)): ?>
	<h5>A sum is a :<?php echo $sum	?></h5>
	<h5>A sub is a:<?php echo $sub	?></h5>
	
	<?php endif; ?>
	</div>
	</body>

</html>




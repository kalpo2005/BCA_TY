<?php

	if($_SERVER["REQUEST_METHOD"]==="POST"){
		$number=$_POST['number_1'];
		
		if($number%2==0)
			$isEven = true;
		else
			$isEven = false;
	}
?>	
<html>
	<head>
		<title>Marksheet</title>
		<link rel="stylesheet" href="main.css">	
	</head>
	
	<body>
	
		<div class="container">

			<h2>Odd Even</h2>
			<form method="POST" action="">
	
				<div class="input-field">	
					<span style="display:block;">Enter a subject 1</span>
					<input type="number" name="number_1">		
				</div>		
		
				<div class="input-field">	
					<button type="submit" value="submit">Submit</button>
				</div>
	
			</form>
	
			<div class="result">
	
				<?php if(isset($isEven) && $isEven): ?>
					<h5>A number is a even :<?php echo $number;	?></h5>
				<?php endif; ?>
				
				<?php if(isset($isEven )&& !$isEven): ?>
					<h5>A number is odd :<?php echo $number;	?></h5>	
				<?php endif; ?>
			</div>
	
		</div>
		
	</body>
</html>




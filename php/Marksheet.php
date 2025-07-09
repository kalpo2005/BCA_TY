<?php

	if($_SERVER["REQUEST_METHOD"]==="POST"){
		$number = $_POST['number'];
		
		if($number%4 ===0)
		$leapYear=true;
	else
		$leapYear =false;
	}
?>	
<html>
	<head>
	<title>Marksheet</title>
	<link rel="stylesheet" href="main.css">
	
	</head>
	
	<body>
	
	<div class="container">
	<form method="POST" action="">
	
	<div class="input-field">
		<span style="display:block;">Enter a number</span>
		<input type="number" name="number">
		
		</div>
		
		<div class="input-field">	
		<input type="submit" value="submit">
		</div>
	
	</form>
	
	<div class="result">
		<?php if(isset($leapYear)&& $leapYear):  ?>
		
		<div><p>The Number is a leapYear</p></div>
			<?php endif; ?>
			
			<?php if(isset($leapYear)&&!$leapYear):  ?>
		
		<div><p>The Number is a not leapYear</p></div>
			<?php endif; ?>
			
			</div>
	
	</div>
	</body>

</html>




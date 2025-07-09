<?php
$number=0;
	if($_SERVER["REQUEST_METHOD"]==="POST"){
		$number=$_POST['number_1'];
		
		if($number%4==0)
			$isEven = true;
		else
			$isEven = false;
	}
?>	
<html>
	<head>
		<title>Leap Year finding</title>
		<link rel="stylesheet" href="main.css">	
	</head>
	
	<body>
	
		<div class="container">

			<h2></h2>
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
					<h5>A number is a leapYear :<?php echo $number;?></h5>
				
				<?php else: ?>
					<h5>A number is a  not leapYear :<?php echo $number;?></h5>
				<?php endif; ?>
			</div>
	
		</div>
		
	</body>
</html>




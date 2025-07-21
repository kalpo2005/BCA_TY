<?php
	if($_SERVER['REQUEST_METHOD']==="POST"){
		
		$total =0;
		foreach($_POST as $key=>$mark)
		{
			$marks[$key]=$mark;
			echo $marks[$key];
			$total+=$mark;
		}
		$percentage = $total/5;
		
		$isDone=true;
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
			<form method="POST">
	
				<div class="input-field">	
					<span style="display:block;">Enter a subject 1</span>
					<input type="number" name="subject_1">		
				</div>

				<div class="input-field">	
					<span style="display:block;">Enter a subject 2</span>
					<input type="number" name="subject_2">		
				</div>
				
				<div class="input-field">	
					<span style="display:block;">Enter a subject 3</span>
					<input type="number" name="subject_3">		
				</div>
				
				<div class="input-field">	
					<span style="display:block;">Enter a subject 4</span>
					<input type="number" name="subject_4">		
				</div>
				
				<div class="input-field">	
					<span style="display:block;">Enter a subject 5</span>
					<input type="number" name="subject_5">		
				</div>
				
		
				<div class="input-field">	
					<button type="submit" value="submit">Submit</button>
				</div>
	
			</form>
	
			<div class="result">
				
				<?php if(isset($marks)): ?>
					<h5>Subject marks is : <?php echo $marks['subject_1']; ?></h5>
					<h5>Subject marks is : <?php echo $marks['subject_2']; ?></h5>
					<h5>Subject marks is : <?php echo $marks['subject_3']; ?></h5>
					<h5>Subject marks is : <?php echo $marks['subject_4']; ?></h5>
					<h5>Subject marks is : <?php echo $marks['subject_5']; ?></h5>
					<p>Total marks is a : <?php echo $total; ?></p>
					<p>percentage is a : <?php echo $percentage; ?></p>
					
				<?php endif;?>
			</div>
	
		</div>
		
	</body>
</html>




<?php
	if($_SERVER['REQUEST_METHOD']==="POST"){
		
		$total =0;
		$number1= $_POST['number1'];
		$number2= $_POST['number2'];
		$choice = $_POST['choice'];
		
		
		
		function addition(){
			global $number1;
			global $number2;
			return $number1+$number2;
		}
		function substraction(){
			global $number1;
			global $number2;
			return $number1-$number2;
		}
		function multiplication(){
			global $number1;
			global $number2;
			return $number1*$number2;
		}
		function division(){
			global $number1;
			global $number2;
			return $number1/$number2;
		}	
		
		
		/*switch($choice){
			case 'sum' :
			$total = addition();
			break;
			case 'sub' :
			$total = substraction();
			break;
			case 'multiplication' :
			$total = multiplication();
			break;
			case 'division' :
			$total = division();
			break;
			
			default :
			break;
		}*/
		
		if($choice==='sum')
			$total = $number1+$number2;
		else if($choice==='sub')
			$total = $number1-$number2;
		else if($choice  === 'multiplication')
			$total = $number1*$number2;
		else
			$total = $number1/$number2;
	}
		
		

	
?>	
<html>
	<head>
		<title>Manually calculator</title>
		<link rel="stylesheet" href="main.css">	
	</head>
	
	<body>
	
		<div class="container">

			<h2>Manually calculator</h2>
			<form method="POST" id="form">
	
				<div class="input-field">	
					<input type="number" name="number1" placeholder="Enter a number 1">		
				</div>

				<div class="input-field">	
					<input type="number" name="number2" placeholder="Enter a number 2">		
				</div>
				
				<div class="input-field">	
					<span style="display:block;">Select operation</span>
					<select  name="choice">	
					<option selected>Select option</option>					
						<option value="sum">Additon</option>
						<option value="sub">Substraction</option>
						<option value="multiplication">Multiplication</option>
						<option value="division">Division</option>
					</select>
				</div>
		
				<div class="input-field">	
					<button type="submit" value="submit">Submit</button>
				</div>
	
			</form>
	
			<div class="result">
				
				<?php if(isset($total)): ?>
					<h5>Answer is  : <?php echo $total ?></h5>
					
				<?php endif;?>
			</div>
	
		</div>
		
	</body>
</html>




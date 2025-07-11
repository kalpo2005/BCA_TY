<?php

	if($_SERVER['REQUEST_METHOD']==='POST'){

	$data = array();
	foreach($_POST as $key=>$value)
	$data[$key]=$value;
	echo $value;
	}

?>


<html>
	<head>
	
		<style>
			body{
			height:100vh;
			display:flex;
			justify-content:center;
			align-items:center;
			font-family:arial;
			}
		
		</style>
	
	</head>
	
	<body>
		
		<div class="container">
		<h2>Ragistration Form</h2>
		
		<form id="form" method="POST">
			
			<div class="field">
				<p>Username</p>
				<input type="text" placeholder="Enter username" name="username">
			</div>
			
			<div class="field">
				<p>phone number</p>
				<input type="number" placeholder="Enter mobile number" name="mobile">
			</div>
			
			
			<div class="field">
				<p>Email</p>
				<input type="text" placeholder="Enter user email" name="email">
			</div>
			
			<div class="field">
				<p>Password</p>
				<input type="password" placeholder="Enter password" name="username">
			</div>
			
			<div class="field">
				<p>Address</p>
				<textarea type="text" placeholder="Enter user name" name="address">
				</textarea>
			</div>
			
			<div class="field">
				<p>City</p>
				<select name="city">
					<option value="empty" disable>Select city</option>
					<option value="botad">botad</option>
					<option value="rajkot">rajkot</option>
					<option value="jamnagar">jamnagar</option>
				</select>
			</div>
		
			<div class="field">
				<p>Gender</p>
				
				<input type="radio" placeholder="Enter user name" name="gender" value="male">male
				
				<input type="radio" placeholder="Enter user name" name="gender" value="female">female
				
			</div>
			
			<div class="field">
				<p>Hobbies</p>
				
				<input type="checkbox" placeholder="Enter user name" name="hobbies" value="male">Reading
				
				<input type="checkbox" placeholder="Enter user name" name="hobbies" value="female">Travelling
				
			</div>
		
			<div class="field">	
				<input type="submit" name="submit" value="submit">
			</div>
				
		</form>
		
		</div>
		
		<?php 
			if(isset($data)){
				var_dump($data);
			}
		?>
	
	</body>

</html>
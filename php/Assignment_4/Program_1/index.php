<?php

$isError = false;
$error = array();
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
	$data = array();	

	foreach ($_POST as $key => $value) {
		
		if(empty($_POST[$key])){
			$isError = true;
			$error[$key] = "Fill the user " .$key . "!!!";	
		}
			$data[$key] = $value;	
	}
	
	
	//username validation
	if(!empty($data['username'])){
		if(!preg_match('/^[A-z] + $/',$data['username'])){
			$isError = true;
			$validNext = true;
			$error['username'] = "Username Must be in alphbate string !!!";	
		}
		
		if(!empty($validNext) && strlen($data['username']) > 10){
			$error['username'] = "Username Must be less 10 char !!!";	
		}
	}
	
	//user idvalidation
	if(!empty($data['id'])){
		$validNext = true;
		if(!preg_match('/^[0-9]/',$data['id'])){
			$isError = true;
			$validNext = false;
			$error['id'] = "User id is must be numeric!!!";	
		}
		
		if(!empty($validNext) && strlen($data['id']) > 3){
			$isError = true;
			$error['id'] = "User id Must be less 3 number !!!";	
		}
	}
	
	//user mobile idvalidation
	if(!empty($data['mobile'])){
		$validNext = true;
		if(!preg_match('/^[0-9]/',$data['mobile'])){
			$isError = true;
			$validNext = false;
			$error['mobile'] = "User id is must be numeric!!!";	
		}
		
		if(!empty($validNext) && strlen($data['mobile']) === 10){
			$isError = true;
			$error['mobile'] = "User mobile No Must be  10 digit !!!";	
		}
	}
	
	// email validation
	if(!empty($data['email']) && filter_var($data['email'],FILTER_VAR_EMAIL)){
			$error['email'] = "User email is not valid !!!";	
	}
	
	if(!$isError){
		
		
	}
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Registration Form</title>
	<link rel="stylesheet" href="..\css\main.css">
</head>

<body>

	<div class="container">
		<h2>Registration Form</h2>

		<form method="POST" id="form" action="">

			<div class="field">
				<p>User Id</p>
				<input type="text" name="id" value="<?php if(isset($data['id'])) echo $data['id']; ?>" placeholder="Enter User Id">
				<?php if(!empty($error['id']) && $isError ){
						echo "<p class='errorMessage'>". $error['id'] . "</p>"; } ?>
			</div>
		
			<div class="field">
				<p>Username</p>
				<input type="text" name="username" value="<?php if(isset($data['username'])) echo $data['username']; ?>" placeholder="Enter username">
				<?php if(!empty($error['username']) && $isError ){
						echo "<p class='errorMessage'>". $error['username'] . "</p>"; } ?>
			</div>

			<div class="field">
				<p>mobile Number</p>
				<input type="number" name="mobile" value="<?php if(isset($data['mobile'])) echo $data['mobile']; ?>" placeholder="Enter mobile number">
				<?php if(!empty($error['mobile']) && $isError ){
						echo "<p class='errorMessage'>". $error['mobile'] . "</p>"; } ?>
			</div>

			<div class="field">
				<p>email</p>
				<input type="text" name="email" value="<?php if(isset($data['email'])) echo $data['email']; ?>" placeholder="Enter email">
				<?php if(!empty($error['email']) && $isError ){
						echo "<p class='errorMessage'>". $error['email'] . "</p>"; } ?>
			</div>

			<div class="field">
				<p>Enter Password</p>
				<input type="password" name="password" value="<?php if(isset($data['password'])) echo $data['password']; ?>" placeholder="Enter password">
				<?php if(!empty($error['password']) && $isError ){
						echo "<p class='errorMessage'>". $error['password'] . "</p>"; } ?>
			</div>
			
			<div class="field">
				<p>Confirm Password</p>
				<input type="password" name="confirmPassword" value="<?php if(isset($data['confirmPassword'])) echo $data['confirmPassword']; ?>" placeholder="Enter password">
				<?php if(!empty($error['confirmPassword']) && $isError ){
						echo "<p class='errorMessage'>". $error['confirmPassword'] . "</p>"; } ?>
			</div>

			<div class="field">
				<p>Address</p>
				<textarea name="address" placeholder="Enter address" value="<?php if(isset($data['address'])) echo $data['address']; ?>" rows="3"></textarea>
				<?php if(!empty($error['address']) && $isError ){
						echo "<p class='errorMessage'>". $error['address'] . "</p>"; } ?>
			</div>

			<div class="field">
				<p>City</p>
				<select name="city">
					<option value="" disabled selected>Select city</option>
					<option value="botad">Botad</option>
					<option value="rajkot">Rajkot</option>
					<option value="jamnagar">Jamnagar</option>
				</select>
				<?php if(!empty($error['city']) && $isError ){
						echo "<p class='errorMessage'>". $error['city'] . "</p>"; } ?>
			</div>

			<div class="field">
				<p>Gender</p>
				<label><input type="radio" name="gender" value="male"> Male</label>
				<label><input type="radio" name="gender" value="female"> Female</label>
			</div>

		<!--	<div class="field">
				<p>Hobbies</p>
				<label><input type="checkbox" name="hobbies[]" value="Reading"> Reading</label>
				<label><input type="checkbox" name="hobbies[]" value="Travelling"> Travelling</label>
			</div> -->

			<div class="field">
				<button type="submit" id="btn">Submit</button>
			</div>

		</form>
	</div>
<!--
	<?php if (isset($data)): ?>
	
		<div>
			<table>
				<thead>
					<tr>
						<th>Detail</th>
						<th>Information</th>
					</tr>
				</thead>
				<tbody>
					<?php foreach ($data as $key => $value): ?>
						<tr>
							<td><?php echo (ucfirst($key)); ?></td>
							<td>
								<?php
								if (is_array($value)) {
									echo (implode(', ', $value));
								} else {
									echo ($value);
								}
								?>
							</td>
						</tr>
					<?php endforeach; ?>
				</tbody>
			</table>
		</div>
	<?php endif; ?>
	-->
</body>

</html>
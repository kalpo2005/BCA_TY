
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Registration Form</title>
	<link rel="stylesheet" href="..\Assignment_4\css\main.css">

</head>

<body>

	<div class="container">
		<h2>Registration Form</h2>

		<form method="POST" id="form" action="">

			<div class="field">
				<p>User Id</p>
				<input type="number" name="user_id" placeholder="Enter User Id" required>
			</div>
		
			<div class="field">
				<p>Username</p>
				<input type="text" name="username" placeholder="Enter username" required>
			</div>

			<div class="field">
				<p>mobile_number</p>
				<input type="number" name="mobile" placeholder="Enter mobile number" required>
			</div>

			<div class="field">
				<p>email</p>
				<input type="text" name="email" placeholder="Enter email" required>
			</div>

			<div class="field">
				<p>Password</p>
				<input type="password" name="password" placeholder="Enter password" required>
			</div>

			<div class="field">
				<p>Address</p>
				<textarea name="address" placeholder="Enter address" rows="3"></textarea>
			</div>

			<div class="field">
				<p>City</p>
				<select name="city" required>
					<option value="" disabled selected>Select city</option>
					<option value="botad">Botad</option>
					<option value="rajkot">Rajkot</option>
					<option value="jamnagar">Jamnagar</option>
				</select>
			</div>

			<div class="field">
				<p>Gender</p>
				<label><input type="radio" name="gender" value="male" required checked> Male</label>
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
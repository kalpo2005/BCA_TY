<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
	
	foreach ($_POST as $key => $value) {
		$data[$key] = $value;
	}	
	print_r($data);
}
?>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Registration Form</title>

	<style>
		body {
			margin: 0;
			padding: 0;
			font-family: 'Segoe UI', sans-serif;
			background: #f4f4f4;
			display: flex;
			gap: 1em;
			justify-content: center;
			align-items: flex-start;
			min-height: 100vh;
		}

		.container {
			background: white;
			margin-top: 30px;
			padding: 2em;
			border-radius: 10px;
			box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
			width: 400px;
		}

		h2 {
			text-align: center;
			margin-bottom: 1em;
		}

		.field {
			margin-bottom: 1em;
		}

		.field p {
			margin: 0 0 5px;
			font-weight: bold;
			font-size: 0.9em;
		}

		.field input[type="text"],
		.field input[type="number"],
		.field input[type="password"],
		.field textarea,
		.field select {
			width: 100%;
			padding: 8px 10px;
			border: 1px solid #ccc;
			border-radius: 5px;
			font-size: 0.9em;
			outline: none;
		}

		.field textarea {
			resize: vertical;
			font-family: inherit;
		}

		.field input[type="radio"],
		.field input[type="checkbox"] {
			margin-right: 5px;
		}

		.field label {
			margin-right: 10px;
		}

		button {
			width: 100%;
			padding: 10px;
			background-color: #0077cc;
			color: white;
			border: none;
			border-radius: 5px;
			font-size: 1em;
			cursor: pointer;
			transition: background 0.3s;
		}

		button:hover {
			background-color: #005fa3;
		}

		table {
			width: 300px;
			margin: 30px auto;
			border-collapse: collapse;
			font-size: 0.95em;
			background: #fff;
			box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
		}

		table th,
		table td {
			padding: 10px;
			border: 1px solid #ccc;
			text-align: left;
		}

		table th {
			background: #0077cc;
			color: white;
		}
	</style>
</head>

<body>

	<div class="container">
		<h2>Registration Form</h2>

		<form method="POST" id="form" action="">

			<div class="field">
				<p>Username</p>
				<input type="text" name="username" placeholder="Enter username" required>
			</div>

			<div class="field">
				<p>Phone Number</p>
				<input type="number" name="mobile" placeholder="Enter mobile number" required>
			</div>

			<div class="field">
				<p>Email</p>
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

			<div class="field">
				<p>Hobbies</p>
				<label><input type="checkbox" name="hobbies[]" value="Reading" checked> Reading</label>
				<label><input type="checkbox" name="hobbies[]" value="Travelling" checked> Travelling</label>
			</div>

			<div class="field">
				<button type="submit" id="btn">Submit</button>
			</div>

		</form>
	</div>

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
	
</body>

</html>
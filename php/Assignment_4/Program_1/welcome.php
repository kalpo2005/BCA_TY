<?php
session_start();
$data = $_SESSION['userdata'];
?>

<html>

<head>
	<title>Contact form</title>
	<link rel="stylesheet" href="..\css\main.css">
</head>

<body>

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
</body>

</html>
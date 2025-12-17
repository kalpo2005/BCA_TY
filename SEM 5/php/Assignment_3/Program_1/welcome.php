
<html>
	<head>
		<title>Contact form</title>
		<link rel="stylesheet" href="..\css\main.css">
	</head>
	
	<body>
		<div class="container" style="display:inline-block;">
			
			<h1>Welcome Mr./Miss/Mrs <?php echo $_GET['name']; ?></h1>
			
			<p>Your Query <strong><?php echo $_GET['message']; ?></strong> successfully send on your email <strong><?php echo $_GET['email']; ?></strong> and we will contact you on <strong><?php echo $_GET['mobile']; ?></strong>.</p>
			
		</div>
	</body>

</html>
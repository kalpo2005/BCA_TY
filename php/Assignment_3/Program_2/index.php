<?php
	
	$data = '';
	if($_SERVER['REQUEST_METHOD']==='POST'){
		foreach($_POST as $key=>$value){
			$data .= "{$key}=$value&";
		}
		header("Location:welcome.php?".$data);
	}
?>

<html>
	<head>
		<title>Contact form</title>
		<link rel="stylesheet" href="..\css\main.css">
	</head>
	
	<body>
		<div class="container">
			<table>
				<thead>
					<tr>

						<th colspan="2" >
							<h3>STUDENT INFORMATION</h3>
							
						</th>
					</tr>
				</thead>
				
				<tbody>
					<form method="POST">
						
						<tr>
							<td>USERNAME:</td>
							<td><input type="text" name="name" placeholder="Enter your name" required></td>
						</tr>
						
						<tr>
							<td>PASSWORD</td>
							<td><input type="password" name="name" placeholder="Enter your name" required></td>
						</tr>
						
						<tr>
							<td>STUD_ID</td>
							<td><input type="text" name="name" placeholder="Enter your name" required></td>
						</tr>
						
						<tr>
							<td>NAME</td>
							<td><input type="text" name="name" placeholder="Enter your name" required></td>
						</tr>
						
						<tr>
							<td>ADDRESS</td>
							<td><input type="text" name="name" placeholder="Enter your name" required></td>
						</tr>
						
						<tr>
							<td>STANDARD</td>
							<td><input type="text" name="name" placeholder="Enter your name" required></td>
						</tr>
						
						<tr>
							<td>DOB</td>
							<td><input type="date" name="name" placeholder="Enter your name" required></td>
						</tr>
						
					</form>
				</tbody>
				
			</table>

<!--CREATE TABLE student(			
STUD_ID VARCHAR(05)
STUD_NAME VARCHAR(20)
STUD_ADD VARCHAR(20)
STUD_STD INT(05)
STUD_DOB VARCHAR(10)
STUD_EMAIL VARCHAR(10)
USERNAME VARCHAR(30)
PASSWORD VARCHAR(30)
); -->

		
		</div>
	</body>
	
	
	

</html>
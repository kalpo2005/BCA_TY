<?php
if(isset($_POST['submit'])){
	$name = $_POST['name'];
	$mobileNumber = $_POST['mobileNumber'];
	$Email = $_POST['Email'];
	$gender = $_POST['gender'];
	$address = $_POST['address'];
	$city = $_POST['city'];
	$Password = $_POST['Password'];
}

?>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body {
			display: grid;
			place-content: center;
        }

        form {
			width: 550px;
			height: 450px;
			padding-left: 30px;
		//	background-color: aqua;
			border: 2px solid green;
        }
		
		h2,h3{
			margin-top:10px;
			text-align: center;
		}
		
		
		table{
			margin-top: 60px;
			width: 350px;
			height: 300px;
			text-align: left;
		/*	background-color: aqua;*/
			border: 2px solid black;
			padding: 5px;
		}
		
		th,td{
			border: 2px solid black;
			padding-left: 5px;
		}
		
		

    </style>
</head>
<body>
    <form method="post">
	    <h2>Register Form</h2>
        <label>Name :</label>
        <input type="text" name="name" placeholder="Enter Your Name" required><br><br>
		
		<label>Mobile Number : </label>
            <input class="secure-input" type="tel" name="mobileNumber" 
                   placeholder="+91 xxxxx xxxxx" required><br><br>
		
		<label>Email :</label>
        <input type="email" name="Email" placeholder="demo@gmail.com" required><br><br>
		
		<label>Address :</label>
        <textarea name="address" rows="2" column="30" placeholder="Enter Your Address" required>
		</textarea><br><br>

        <label>City :</label>
        <select name="city">
		    <option>Select City</option>
		    <option>Botad</option>
		    <option>Kaniyad</option>
		    <option>Hamapar</option>
		</select><br><br>

        <label>Gender :</label>
        <input type="radio" value="Male" name="gender" checked>Male
        <input type="radio" value="Female" name="gender">Female
        <input type="radio" value="Other" name="gender">Other <br><br>

        <label>Hobbies :</label>
        <input type="checkbox" value="Cricket" name="Hobbies" checked>Cricket
        <input type="checkbox" value="Hockey" name="Hobbies">Hockey<br><br>
		
		<label>Password :</label>
        <input type="Password" name="Password"equired><br>
		
		<h3><input class="center" type="submit" name="submit" value="Submit"> </h3>
    </form>
	
	<?php if(!empty($name)) { ?>
	   
	   <table>
	     <tr>
		    <th>Name
			<td><?php echo $name ?>
		 </tr>
		 <tr>
		    <th>Phone Number
			<td><?php echo $mobileNumber ?>
		 </tr>
		 <tr>
		    <th>Email
			<td><?php echo $Email ?>
		 </tr>
		 <tr>
		    <th>gender
			<td><?php echo $gender ?>
		 </tr>
		 <tr>
		    <th>address
			<td><?php echo $address ?>
		 </tr>
		 <tr>
		    <th>city
			<td><?php echo $city ?>
		 </tr>
		 <tr>
		    <th>Password
			<td><?php echo $Password ?>
		 </tr>
	   
	   
	   </table>
	<?php } ?>
</body>
</html>

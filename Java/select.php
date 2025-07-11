<html>
<head>
<body>
<form method="POST">
NUMBER 1:<input type="number" name="t1"><br>
NUMBER 2:<input type="number" name="t2"><br>
	<select name="ch">
		<option value="add">
		ADDITION
		</option><br>
		<option value="sub">
		SUBTRACTION
		</option value="mul">
		MULTIPLICATION
		</option value="div">
		DIVISION
		</option><br>
	</select>
	<input type="submit" name="submit">	
</form>
<?php
		if(isset($_POST['submit']))
		{
			$num1=$_POST['t1'];
			$num2=$_POST['t2'];
			$ch=$_POST['ch'];
			$sum;$sub;$mul;$div;
			
			if(ch=="add")
			{
				$sum=$num1+num2;
				echo "SUM OF NUMBER:-".$sum;
			}
			else if($ch=="sub")
			{
				$sub=$num1-num2;
				echo "SUB OF NUMBER:-".$sub;
			}
			else if($ch=="mul")
			{
				$mul=$num1*num2;
				echo "MUL OF NUMBER".$mul;
			}
			else if($ch=="div")
			{
				$div=$num1/num2;
				echo "DIV OF NUMBER".$div;
			}
		}
?>
</body>
</head>
</html>		
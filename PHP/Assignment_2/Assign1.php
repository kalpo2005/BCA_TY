<?php

	$number2= 204;
	$number1= 1006;
	$number3= 22005;
	$result = "Number is bigger : ";
	
	$result .= ($number1 > $number2  ? ($number1 > $number3 ? $number1:$number3):($number2 > $number3 ? $number2 :$number3));
	echo $result;
		
?>

<!-- <html>
	<head>
		<title>Assignment - $i.php</title>
	</head>
	
	<body>
	
	</body>

</html> -->
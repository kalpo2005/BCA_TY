<?php

	function displayArr($arr){
		foreach($arr as $value){
			echo $value . ",";
		}
	}

	$arr = array(54,24,368,7,35,15,88);
	
	echo "<br>  Unsorted array <br>";
	displayArr($arr);
	
	sort($arr); // sorting a array
	
	echo "<br> Sorted array <br>";
	displayArr($arr);
?>
<?php
	
	$arr1 = array(10,20,30,40,50);
	$arr2 = array(40,50,60,70,80);
	
	$diffArray = array_diff($arr1,$arr2);
	
	if(empty($diffArray))
		die("Array value are same !!!");
	else{
		echo "<br> Array differant value is a : ".implode(',',$diffArray);
	}
	
?>
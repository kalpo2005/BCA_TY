<?php
//Array sum 


	$arr_1 = array(10,30,56,67,90);
	$arr_2 = array(2,50,96,65);
	
	if(count($arr_1)!==count($arr_2)){
		echo "Array index is not same !!!!";
		die();
	}

	echo "<br> First array is a :";
	for($i = 0; $i<count($arr_1);$i++){
		echo $arr_1[$i] . ", ";
	}
	
	echo "<br>Second array is a :";
	for($i = 0; $i<count($arr_2);$i++){
		echo $arr_2[$i] . ", ";
	}
	echo "<br>Sum of aray is a  : <br>";
	for($i = 0; $i<count($arr_1);$i++){
		echo  $arr_2[$i]+$arr_1[$i]. "<br>";
	}
<?php
	
	function showArray($arr){
		for($i=0;$i<count($arr);$i++){
			for($j=0;$j<count($arr[$i]);$j++){
				echo " " . $arr[$i][$j];
			}
			echo "<br>";
		}
	}
	
	function sumOfArray($arr1,$arr2){
		for($i=0;$i<count($arr1);$i++){
			for($j=0;$j<count($arr1[$i]);$j++){
				echo $arr1[$i][$j] + $arr2[$i][$j] . "  ";
			}
			echo "<br>";
		}
	}
	
	$arr_1 = array(
		array(10,20,30),
		array(40,50,60),
		array(70,80,90)
	);
	
	$arr_2= array(
		array(90,80,70),
		array(60,50,40),
		array(30,20,10)
		
	);
	
	
	//for the first array printing
	echo "<br> First array is a : <br>";
	showArray($arr_1);
	
	//for the Second array printing
	echo "<br> second array is a : <br>";
	showArray($arr_2);

	//for the sum of array printing
	echo "<br>Array sum is  : <br>";
	sumOfArray($arr_1,$arr_2);

	
?>
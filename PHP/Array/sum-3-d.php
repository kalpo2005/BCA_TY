<?php

	function showArray($arr){
		for($i=0;$i<count($arr); $i++){
			for($j=0;$j<count($arr[$i]); $j++){
				for($k=0;$k<count($arr[$i][$j]);$k++){
					echo $arr[$i][$j][$k]."  ";
				}
				echo "<br>";
			}
			echo "<br>";
		}
	}
	
	function sumArray($arr1,$arr2){
		$sum = array();
		for($i=0;$i<count($arr1); $i++){
			for($j=0;$j<count($arr1[$i]); $j++){
				for($k=0;$k<count($arr1[$i][$j]);$k++){
					$sum[$i][$j][$k] = $arr1[$i][$j][$k] + $arr2[$i][$j][$k] ;
				}
			}
		}
		return $sum;
	}

	$arr1 = array(
				array(
					array(10,20,30),
					array(30,20,10),
				),
				array(
					array(32,35,94),
					array(30,20,10),
				),
				array(
					array(45,49,45),
					array(50,90,90),
				)
			);
			
	$arr2 = array(
				array(
					array(45,98,36),
					array(25,60,25),
				),
				array(
					array(78,95,62),
					array(89,45,40),
				),
				array(
					array(79,98,11),
					array(45,46,66),
				)
			);
			
	//for the first array printing
	echo "<br> First array is a : <br>";
	showArray($arr1);
	
	//for the Second array printing
	echo "<br> second array is a : <br>";
	showArray($arr2);
	
	// for the sum
	$sum = sumArray($arr1,$arr2);
	
	//Sum of array is a 
	echo "<br> sum of array is a <br>";
	showArray($sum);
	//var_dump($sum);

?>
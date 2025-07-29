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
	function showArray2d($arr){
		for($i=0;$i<count($arr); $i++){
			for($j=0;$j<count($arr[$i]); $j++){
				echo $arr[$i][$j]."  ";
			}
			echo "<br>";
		}
	}
	
	function sumArray($arr){
		
		for($i=0;$i<count($arr[0][0]);$i++){
			for($j=0;$j<count($arr[0]); $j++){
				$final[$j][$i] = 0;
				for($k=0;$k<count($arr); $k++){
					$final[$j][$i]+=$arr[$k][$j][$i];
				}
			}
		}
		return $final;
	}

	$arr1 = array(
				array(
					array(10,20,30),
					array(32,35,94)
				),
				array(
					array(32,35,94),
					array(32,35,94)
				),
				array(
					array(45,49,45),
					array(32,35,94)
				)
			);
			
	
	//for the first array printing
	echo "<br> First array is a : <br>";
	showArray($arr1);

	// for the sum
	$final= array();
	$final = sumArray($arr1);
	
	//Sum of array is a 
	echo "<br> sum of array is a <br>";
	showArray2d($final);

?>
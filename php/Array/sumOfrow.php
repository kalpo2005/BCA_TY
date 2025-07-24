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
	
	function sumArray($arr1){
		$sum = array();
		$m =0;
		
		for($i=0;$i<3;$i++){
			
	for($j=0;$j<3-1; $j++){
					$add =0;
				for($k=0;$k<3; $k++){
					print_r($arr1[$k][$j]). "<br>";
					$add += $arr1[$k][$j][$i] . " ";
				}
						
				echo $add . " ";					
			}
			echo "<br>";
			
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
			
	
	//for the first array printing
	echo "<br> First array is a : <br>";
	showArray($arr1);

	// for the sum
	$sum = sumArray($arr1);
	
	//Sum of array is a 
	echo "<br> sum of array is a <br>";
	showArray($sum);

?>
<?php
	
	function showArray($arr){
		for($i=0;$i<count($arr);$i++){
			for($j=0;$j<count($arr[$i]);$j++){
				echo " " . $arr[$i][$j];
			}
			echo "<br>";
		}
	}
	
	function multiplicationOfArray($arr1,$arr2){
		$multiplication = array();
		for($i=0;$i<count($arr1);$i++){
			$sum =0;
			for($j=0;$j<count($arr1[$i]);$j++){
				for($k=0; $k<count($arr1); $k++){
					$sum += $arr1[$i][$k]*$arr2[$k][$j];
				}
				$multiplication[$i][$j]=$sum;
			}
		}
		
		return $multiplication;
	}
	
	// $multiplication[$i][$j] =$arr1[$i][$j] + $arr2[$i][$j];
	
	$arr_1 = array(
		array(1,2,3),
		array(4,2,3),
		array(7,5,7)
	);
	
	$arr_2= array(
		array(3,8,2),
		array(2,3,4),
		array(1,2,5)
		
	);
	
	
	//for the first array printing
	echo "<br> First array is a : <br>";
	showArray($arr_1);
	
	//for the Second array printing
	echo "<br> second array is a : <br>";
	showArray($arr_2);
	
	// for the multiplication logic 
	$multiplication = multiplicationOfArray($arr_1,$arr_2);

	//for the Multiplicaton of array printing
	echo "<br>Array Multiplicaton is  : <br>";
		showArray($multiplication);

	
?>
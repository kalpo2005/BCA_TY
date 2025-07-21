<?php
//Array sum 
	
	function shortArray($kal)
	{
		echo "<br> UnShorted array is a :";
		for($i = 0; $i<count($kal);$i++){
			echo $kal[$i] . ", ";
		}
		
		 sort($kal);

		echo "<br> Shorted array is a :";
		for($i = 0; $i<count($kal);$i++){
			echo $kal[$i] . ", ";
		}
	
	}

	$arr_1 = array(10,2,56,67,90);
	$arr_2 = array(2,50,96,5,55);

	shortArray($arr_1);
	shortArray($arr_2);
	
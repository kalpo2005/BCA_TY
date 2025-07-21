<?php

	$arr = array(
				array(
					array(10,20,30),
					array(30,20,10),
				),
				array(
					array(32,35,94),
					array(30,20,10),
				),
				array(
					array(40,20,30),
					array(50,90,90),
				),
			);

			
	for($i=0;$i<count($arr); $i++){
		for($j=0;$j<count($arr[$i]); $j++){
			for($k=0;$k<count($arr[$i][$j]);$k++){
				echo $arr[$i][$j][$k]."  ";
			}
			echo "<br>";
		}
		echo "<br>";
	}

?>
<?php
	
	$arr1 = array(10,20,30,40,50);
	$arr2 = array(10,20,30,40,50);
	$isSame = false;
	
	if(count($arr1)!== count($arr2)){
		die("array lenght are not same !!!");
	}
	
	foreach($arr1 as $value){
		foreach($arr2 as $value2){
			if($value === $value2)
				$isSame=true;
		}
		if(!$isSame)
			die("array elemens are not same !!!");
	}
	
	if($isSame)
			die("array elemens are same !!!");
?>
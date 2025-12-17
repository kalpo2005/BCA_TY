<?php
	$number = 32;
	
	for($i=1;$i<$number; $i++){
		if($i > 15 )
			continue;
		echo "{$i} ,";
	}
?>
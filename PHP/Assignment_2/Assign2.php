<?php
	$data = array(
		'kalpesh'=>20,
		'darshan'=>64,
		'jay'=>57,
		'ravi'=>95,
		'yash'=>21,
		'utsav'=>54
	);
	
	//For the printting 
	foreach($data as $key => $value){
		echo "<br> Name of Person : <b>{$key} </b> and their Age is <b> {$value}. </b>";
	}
?>
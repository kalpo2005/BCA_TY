<?php
	$data = array(
		'kalpesh'=>20,
		'anil'=>64,
		'darshan'=>57,
		'dhruv'=>95,
		'vijay'=>21,
		'yash'=>54
	);
	
	//For the printting 
	foreach($data as $key => $value){
		echo "<br> Name of person : <b>{$key} </b> and their age is <b> {$value}. </b>";
	}
?>
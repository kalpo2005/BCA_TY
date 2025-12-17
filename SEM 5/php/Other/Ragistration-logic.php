<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
	
	foreach ($_POST as $key => $value) {
		$data[$key] = $value;
	}
/*	foreach($data as $key=>$value){
		echo $key."and value {$value} <br>";
	}*/
	header("location:Ragistration.php");	
}
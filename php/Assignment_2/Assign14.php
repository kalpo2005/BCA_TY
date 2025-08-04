<?php
    $str1 = "Anil";
    $str2 = "Baraiya Anil bavaliya Anil kalpesh";
	$str3 = "kalpesh";
	$str4 = "Baraiya";
	$str5 = "Anil";
	$no1 = 97;
	
	print "print(".$str1.") => ".$str1;
	
	echo "<br><br>chr(".$no1.") => ".chr($no1);
	
	echo "<br><br>echo(".$str1.") => ".$str1;
	
	echo "<br><br>strlen(".$str1.") => ".strlen($str1);
	
	echo "<br><br>str_word_count(".$str2.") => ".str_word_count($str2);
	
	echo "<br><br>strrev(".$str2.") => ".strrev($str2);
	
	echo "<br><br>strpos(".$str2." , ".$str1.") => ".strpos($str2,$str1);
	
	$count = 0;
	echo "<br><br>str_replace(".$str1." , ".$str3.",".$str2." , ".$count.") => ".str_replace($str1,$str3,$str2,$count);
	echo " ".$count;
	
	echo "<br><br>ltrim(".$str2." , ".$str4.") => ".ltrim($str2,$str4);
	
	echo "<br><br>rtrim(".$str2." , ".$str3.") => ".rtrim($str2,$str3);
	
	echo "<br><br>trim(".$str2." , ".$str4."".$str3.") => ".trim($str2,$str4.$str3);
	
	echo "<br><br>strcmp(".$str1." , ".$str5.") => ".strcmp($str1,$str5);
	
	echo "<br><br>substr_replace(".$str2." , ".$str4.",2,6) => ".substr_replace($str2,$str4,2,6);
	
	
	echo "<br><br>stristr(".$str2." , ".$str1.") => ".stristr($str2,$str1);
	
	echo "<br><br>strstr(".$str2." , ".$str1.") => ".strstr($str2,$str1);
	
	echo "<br><br>ucwords(".$str2.") => ".ucwords($str2);
	
	echo "<br><br>ucfirst(".$str2.") => ".ucfirst($str2);
	
	echo "<br><br>strtolower(".$str2.") => ".strtolower($str2);
	
	echo "<br><br>strtoupper(".$str2.") => ".strtoupper($str2);
  
?>
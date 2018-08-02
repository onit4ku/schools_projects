<?php

$a = 212;
$b = 12;
$c = 32;

if ($a >= $b){ 
	if ($a >= $c)
		echo "$a es mayor que $b y que $c"; 
	else
		echo "$c es mayor que $a y que $b"; 
	 }else{
		if( $b >= $c )
			echo "$b es mayor que $a y que $c"; 
		else
			echo "$c es mayor que $b y que $c"; 
} 
?>
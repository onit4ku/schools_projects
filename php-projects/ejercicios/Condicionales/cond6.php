<?php
$a = 12;
$b = 53;
$c = 4;

 if (($a >= $b) && ($a >= $c)) 
	echo "$a es mayor que $b y que $c"; 
	elseif($b >= $a && $b >= $c)
		echo "$b es mayor que $a y que $c"; 
	else
		echo "$c es mayor que $a y que $b";

?>
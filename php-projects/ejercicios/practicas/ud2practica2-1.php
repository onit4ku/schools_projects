<?php

$num2=rand(1,10);

$num=rand(1,10);

if($num<$num2){
	echo "$num2 es mayor que $num";
}else{
	if($num2<$num){
	echo "$num es mayor que $num2";
	}else{
	echo "Ambos numeros son iguales";
}}

?>

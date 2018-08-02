<?php

//Obtener el mayor de dos números enteros positivos.


  $valor=rand(1,100);
  $valorb=rand(1,100);
 
  echo "los numeros aleatorios son $valor y $valorb <br>";
  if ($valor>$valorb)
  {
    echo $valor." es el mayor";
  }else{
  	
  	echo $valorb." es el mayor";
  	
  }
  
  ?>
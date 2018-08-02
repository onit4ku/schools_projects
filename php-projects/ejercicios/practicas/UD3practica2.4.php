<?php

//Hacer un programa que lo muestre por pantalla al valor generado. Mostrar además si
//es menor o igual a 50 o si es mayor.

  $valor=rand(1,100);
 
  echo "el numero aleatorio es $valor <br>";
  if ($valor<=50)
  {
    echo $valor." es menor que 50";
  }else{
  	
  	echo " es mayor que $valor";
  	
  }
  
  ?>
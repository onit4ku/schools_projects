<?php


//Ejercicio3: Dado un número del 1 al 7 indique a que día de la semana corresponde.

  $valor=rand(1,7);
  
  echo "el numero aleatorio es $valor <br>";
 
  switch ($valor){
  	
  	case 1:
  		echo "lunes";
  		break;
  	case 2:
  		echo "martes";
  		break;
  	case 3:
  		echo "miercoles";
  		break;
  	case 4:
  		echo "jueves";
  		break;
  	case 5:
  		echo "viernes";
  		break;
  	case 6:
  		echo "sabado";
  		break;
  	case 7:
  		echo "domingo";
  		break;
  	
  }
 
  
  ?>
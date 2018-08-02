<?php


//Generar un valor aleatorio entre 1 y 3.
//Luego imprimir en castellano el número

  $valor=rand(1,3);
  
  echo "el numero aleatorio es $valor <br>";
 
  switch ($valor){
  	
  	case 1:
  		echo "uno";
  		break;
  	case 2:
  		echo "dos";
  		break;
  	case 3:
  		echo "tres";
  		break;

  	
  }
 
  
  ?>
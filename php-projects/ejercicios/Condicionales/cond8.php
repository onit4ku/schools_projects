<?php 
$posicion = $arriba;
switch($posicion) {
	case "arriba": 
		echo "se ejecuta";
		echo " el valor arriba";
	break;
	case "abajo": 
		echo "se ejecuta";
		echo " el valor abajo";
	break;
	default: 
		echo "se ejecuta";
		echo " distinto de arriba y abajo";
}
?>
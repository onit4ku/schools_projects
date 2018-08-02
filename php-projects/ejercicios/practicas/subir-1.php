<?php

	$tamano = $_FILES["archivo"]['size'];
	$tipo = $_FILES["archivo"]['type'];
	$archivo = $_FILES["archivo"]['name'];
	$prefijo = substr(md5(uniqid(rand())),0,6);
	 

		$destino =  "upload/".$archivo;
		echo "Archivo subido: <b>".$archivo."</b>";


?>
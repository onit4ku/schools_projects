
<?php
$nombre=$_POST['nombre'];
$estudios=$_POST['estudios'];

echo "Su nombre es $nombre y ";

if($estudios=='NoTiene'){
	echo "No tiene estudios.";
}

if($estudios=='Primarios'){
	echo "Tiene los estudios primarios.";
}

if($estudios=='Secundarios'){
	echo "Tiene los estudios secundarios.";
}
?>

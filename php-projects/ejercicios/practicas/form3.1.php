<?php
$nombre=$_POST['nombre'];
$futbol=$_POST['Futbol'];
$tenis=$_POST['Tenis'];
$Baloncesto=$_POST['Baloncesto'];
$Waterpolo=$_POST['Waterpolo'];
$deporte=0;

if($futbol==true){
	$deporte++;
}

if($tenis==true){
	$deporte++;
}

if($Baloncesto==true){
	$deporte++;
}

if($Waterpolo==true){
	$deporte++;
}

echo "Su nombre es $nombre y practica $deporte deportes.";

?>
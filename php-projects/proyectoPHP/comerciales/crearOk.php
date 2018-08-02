<?php
include('../include/conexion.php'); 
conectarBD();

// Crear comercial en BD
$nombre = $_POST['nombre'];
$apellidos = $_POST['apellidos'];
$telefono = $_POST['telefono'];
$movil = $_POST['movil'];
$email = $_POST['email'];
$observaciones = $_POST['observaciones'];

$consulta = "INSERT INTO comercial( nombre, apellidos, telefono, movil, email, observaciones)
			values('".$nombre."','".$apellidos."','".$telefono."','".$movil."','".$email."','".$observaciones."')";

$resultado = mysql_query($consulta);

header("location:listado.php");
?>


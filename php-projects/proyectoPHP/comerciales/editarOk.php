<?php
include('../include/conexion.php'); 
conectarBD();

session_start();
$id = $_SESSION['id'];

$nombre = $_POST['nombre'];
$apellidos = $_POST['apellidos'];
$telefono = $_POST['telefono'];
$movil = $_POST['movil'];
$email = $_POST['email'];
$observaciones = $_POST['observaciones'];
// modificar cliente 

$consulta = "UPDATE comercial SET nombre='".$nombre."',apellidos='".$apellidos."',telefono='".$telefono."', movil='".$movil."', email='".$email."', observaciones='".$observaciones."' WHERE id='".$id."'";
$resultado = mysql_query($consulta);

header("location:listado.php");
?>

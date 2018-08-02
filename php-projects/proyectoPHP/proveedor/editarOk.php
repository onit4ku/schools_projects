<?php
	include('../include/conexion.php'); 
	conectarBD();

	session_start();
	$id = $_SESSION['id'];

	$cif = $_POST['cif_nif'];
	$nombre = $_POST['nombre'];
	$contacto = $_POST['contacto'];
	$telefono = $_POST['telefono'];
	$fax = $_POST['fax'];
	$movil = $_POST['movil'];
	$email = $_POST['email'];
	$observaciones = $_POST['observaciones'];
	// modificar cliente 

	$consulta = "UPDATE proveedor SET cif_nif='".$cif."', nombre='".$nombre."',contacto='".$contacto."',telefono='".$telefono."', fax='".$fax."', movil='".$movil."', email='".$email."', observaciones='".$observaciones."' WHERE id='".$id."'";
	$resultado = mysql_query($consulta);

	header("location:listado.php");
?>

<?php 
	include('../include/conexion.php'); 
	conectarBD();

	// Crear proveedor en BD
	$cif = $_POST['cif_nif'];
	$nombre = $_POST['nombre'];
	$contacto = $_POST['contacto'];
	$telefono = $_POST['telefono'];
	$fax = $_POST['fax'];
	$movil = $_POST['movil'];
	$email = $_POST['email'];
	$observaciones = $_POST['observaciones'];

	$consulta = "INSERT INTO proveedor(cif_nif, nombre, contacto, telefono, fax, movil, email, observaciones)
				values('".$cif."','".$nombre."','".$contacto."','".$telefono."','".$fax."','".$movil."','".$email."','".$observaciones."')";

	$resultado = mysql_query($consulta);

	header("location:listado.php");
?>
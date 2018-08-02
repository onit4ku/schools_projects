<?php
	include('../include/conexion.php'); 
	conectarBD();

	// Eliminar proveedor
	$id = $_GET['id'];

	$consulta = "DELETE from proveedor WHERE id='".$id."'";
	$resultado = mysql_query($consulta);

	header("location:listado.php");
?>

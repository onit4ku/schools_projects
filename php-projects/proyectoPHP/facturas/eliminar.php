<?php
	include('../include/conexion.php'); 
	conectarBD();

	// Eliminar factura
	$id = $_GET['id'];
	
	$consulta = "DELETE from facturas where id=".$id;
	$resultado = mysql_query($consulta);
	
	header("location:listado.php");
	cerrarBD();
?>
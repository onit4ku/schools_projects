<?php
	include('../include/conexion.php'); 
	conectarBD();

	// Eliminar cliente
    $id = $_GET['id'];

    $consulta = "DELETE from clientes WHERE id='".$id."'";
    $resultado = mysql_query($consulta);

    header("location:listado.php");
?>
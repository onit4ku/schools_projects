<?php
	include('../include/conexion.php'); 
	conectarBD();

	// Eliminar comercial
    $id = $_GET['id'];

    $consulta = "DELETE from comercial WHERE id='".$id."'";
    $resultado = mysql_query($consulta);

    header("location:listado.php");
?>

<?php
	include('../include/conexion.php'); 
	conectarBD();

	// Eliminar contratos
    $id = $_GET['id'];

    $consulta = "DELETE from contratacion WHERE id='".$id."'";
    $resultado = mysql_query($consulta);

    header("location:listado.php");
?>

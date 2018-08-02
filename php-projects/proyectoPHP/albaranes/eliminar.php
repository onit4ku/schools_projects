<?php
    include('../include/conexion.php'); 
    conectarBD();

    // Eliminar albarán
    $id = $_GET['id'];

    $consulta = "DELETE from albaranes WHERE id='".$id."'";
    $resultado = mysql_query($consulta);

    header("location:listado.php");
?>

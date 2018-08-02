<?php
    include('../include/conexion.php'); 
    conectarBD();

    session_start();
    $id = $_SESSION['id'];

        if(isset($_POST['cobrado']))
        {
            $cobro = "Cobrado";   
        }
        else
        {
            $cobro = "No Cobrado";   
        }
        $consulta = "UPDATE facturas SET cobro='".$cobro."' WHERE id=".$_GET['id'];

        $resultado = mysql_query($consulta);
        cerrarBD();

    header("location:listado.php");
?>
<?php 
    include('../include/conexion.php'); 
    conectarBD();

    $falbaran = $_POST['falbaran'];
    $fvencimiento = $_POST['fvencimiento'];
    $facturado = $_POST['factura'];
    $fkcontrato = $_POST['fkcontrato'];

    $consulta = "UPDATE albaranes SET fecha_albaran='".$falbaran."', fecha_vencimiento='".$fvencimiento."', facturado='".$facturado."', fk_contrato=".$fkcontrato." WHERE id=".$_GET['id'];

    $resultado = mysql_query($consulta);
    cerrarBD();

    header("location:listado.php");
?>
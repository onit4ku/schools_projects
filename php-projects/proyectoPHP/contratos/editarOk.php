<?php
    include('../include/conexion.php'); 
    conectarBD();

    session_start();
    $id = $_SESSION['id'];

    $fecha_contrato = $_POST['fecha_contrato'];
    $fk_cliente = $_POST['fk_cliente'];
    $fk_comercial = $_POST['fk_comercial'];
    $num_vencimientos = $_POST['nvencimiento'];
    $iva_aplicado = $_POST['iva'];
    $forma_pago = $_POST['forma_pago'];
    $clausula_contrato = $_POST['clausulas'];

    // modificar contrato 
    $consulta = "UPDATE contratos SET fecha_contrato='".$fecha_contrato."', fk_cliente='".$fk_cliente."', fk_comercial='".$fk_comercial."', nvencimiento='".$num_vencimientos."', iva='".$iva_aplicado."', forma_pago='".$forma_pago."', clausulas='".$clausula_contrato."' WHERE id='".$id."'";
    $resultado = mysql_query($consulta);

header("location:listado.php");
?>
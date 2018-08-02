<?php
    include('../include/conexion.php'); 
    conectarBD();

    $iva = $_POST['iva'];
    $fcontrato = $_POST['fcontrato'];
    $fpago = $_POST['fpago'];
    $nvencimiento = $_POST['nvencimiento'];
    $clausulas = $_POST['clausulas'];
    $ncliente = $_POST['ncliente'];
    $ncomercial = $_POST['ncomercial'];
    $date = str_replace('/', '-', $fcontrato);
    $fcontrato = date('Y-m-d', strtotime($date));
    $consulta = "INSERT into contratos(iva, fecha_contrato, forma_pago, nvencimiento, clausulas, fk_cliente, fk_comercial, fk_estado)           values(".$iva.", '".$fcontrato."', '".$fpago."', ".$nvencimiento.", '".$clausulas."', ".$ncliente.", ".$ncomercial.", ".$nvencimiento.")";
		
    $resultado = mysql_query($consulta);

    $nlineas = $_POST['nlineas'];
    $resultado2 = mysql_query("SHOW TABLE STATUS LIKE 'contratos'");
    $row = mysql_fetch_array($resultado2);
    $sigId = $row['Auto_increment']-1;

    for($i=0; $i<=$nlineas; $i++)
    {
        $fkproveedor = $_POST["fkproveedor".$i];
        $fechapu = $_POST["fechapu".$i];
        $concepto = $_POST["concepto".$i];
        $importe = $_POST["importe".$i];

        $consulta2 = "INSERT into lineas_contrato(fk_proveedor, f_publicacion, concepto, importe, fk_contratos) values(".$fkproveedor.", '".$fechapu."', '".$concepto."', ".$importe.",".$sigId.")";
        $resultado3 = mysql_query($consulta2);
    }
    cerrarBD();
header("location:listado.php");?>
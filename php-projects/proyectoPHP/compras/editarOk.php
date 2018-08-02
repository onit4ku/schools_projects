<?php
    include('../include/conexion.php'); 
    conectarBD();

    $id = $_GET['id'];
	$iva = $_POST['iva'];
	$fcompra = $_POST['fcompra'];
	$fpago = $_POST['fpago'];
	$nvencimiento = $_POST['nvencimiento'];
	$pagado = $_POST['pagado'];
	$nproveedor = $_POST['nproveedor'];

	$date = str_replace('/', '-', $fcompra);
   	$fcompra = date('Y-m-d', strtotime($date));

    //Actualizar
	$consulta = "UPDATE compras SET iva=".$iva.", fecha_compra='".$fcompra."', forma_pago='".$fpago."',num_vencimiento=".$nvencimiento.",  pagado='".$pagado."', fk_proveedor=".$nproveedor." WHERE id=".$id;
 
    $resultado = mysql_query($consulta);

    //Líneas contrato
    $nlineas = $_POST['nlineas'];
   
    $resultado2 = mysql_query("SHOW TABLE STATUS LIKE 'compras'");
    $row = mysql_fetch_array($resultado2);

    for($i=1; $i<=$nlineas; $i++)
    {
        $fk_proveedor = $_POST["proveedor".$i];
        $f_publicacion = $_POST["fepublicacion".$i];
        $concepto = $_POST["concepto".$i];
        $importe = $_POST["importe".$i];
        $idlin = $_POST["idlin".$i];

        $date = str_replace('/', '-', $f_publicacion);
        $fpublicacion = date('Y-m-d', strtotime($date));

        $consulta2 = "UPDATE lineas_compra SET fk_proveedor='".$fk_proveedor."', fecha='".$fpublicacion."', concepto='".$concepto."',     importe='".$importe."' WHERE id=".$idlin;

        $resultado3 = mysql_query($consulta2);
    }

	cerrarBD();
   
    echo $consulta2;

header("location:listado.php");
?>
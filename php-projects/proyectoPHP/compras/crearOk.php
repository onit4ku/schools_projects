<?php
include('../include/conexion.php'); 
conectarBD();

/*------------Recogida de datos del contrato-----------------*/

$iva = $_POST['iva'];
$fcompra = $_POST['fcompra'];
$fpago = $_POST['fpago'];
$nvencimiento = $_POST['nvencimiento'];
$clausulas = $_POST['clausulas'];
$nproveedor = $_POST['nproveedor'];
$date = str_replace('/', '-', $fcompra);
$fcompra = date('Y-m-d', strtotime($date));

/*----------------------------------------------------------*/

$consulta = "INSERT into compras(iva, forma_pago, num_vencimiento, pagado, fecha_compra, fk_proveedor) values(".$iva.", '".$fpago."', '".$nvencimiento."', 'Pagado', '".$fcompra."', ".$nproveedor.")";

$resultado = mysql_query($consulta);

/*------------Recogida de datos de las lineas de contrato----------------*/

$nlineas = $_POST['nlineas'];

$resultado2 = mysql_query("SHOW TABLE STATUS LIKE 'compras'");
$row = mysql_fetch_array($resultado2);
$sigId = $row['Auto_increment']-1;

for($i=0; $i<=$nlineas; $i++)
{
    $fkproveedor = $_POST["fkproveedor".$i];
$fechapu = $_POST["fechapu".$i];
$concepto = $_POST["concepto".$i];
$importe = $_POST["importe".$i];


$consulta2 = "INSERT into lineas_compra(fk_proveedor, fecha, concepto, importe, fk_compra) values(".$fkproveedor.", '".$fechapu."', '".$concepto."', ".$importe.",".$sigId.")";
        //echo $consulta;	
        echo $consulta2;			

$resultado3 = mysql_query($consulta2);


}
cerrarBD();

header("location:listado.php");
?>

<?php
	include('../include/conexion.php');
	conectarBD();
	
	$numero = $_POST['numero'];
	$fechafactura = date('Y-m-d');
	$cobro = $_POST['cobro'];

	$fkalbaran = $_GET['id'];
	$consulta = "INSERT INTO facturas(numero, fecha_factura, cobro, fk_albaran) values('".$numero."', '".$fechafactura."','".$cobro."', ".$fkalbaran.")";
	
	$consulta2 = "UPDATE albaranes SET facturado='Facturado' WHERE id=".$fkalbaran;
	
	$resultado = mysql_query($consulta);
	$resultado2 = mysql_query($consulta2);
	cerrarBD();

header('location:listado.php');
?>

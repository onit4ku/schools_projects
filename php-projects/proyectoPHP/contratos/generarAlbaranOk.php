<?php
	include("../include/conexion.php");
	conectarBD();
	
	/*---------Datos Recogidos---------*/
	$fechaalbaran = $_POST['falbaran'];
	$fechavencimiento = $_POST['fvencimiento'];
	$facturado = $_POST['facturado'];
	
	if($facturado == "on")
	{
		$facturado = "Facturado";
	}
	else
	{
		$facturado = "No Facturado";
	}

	$contrato = $_GET['id'];
	$nvencimiento = $_GET['num'];
	/*--------------------------------*/
	$consulta = "INSERT INTO albaranes(fecha_albaran, fecha_vencimiento, facturado, fk_contrato, nvencimiento) values('".$fechaalbaran."', '".$fechavencimiento."', '".$facturado."', ".$contrato.", ".$nvencimiento.")";
	
	$nvencimiento--;
	$consulta2 = "UPDATE contratos SET fk_estado=".$nvencimiento." WHERE id=".$contrato;
	

	$resultado = mysql_query($consulta);
	$resultado2 = mysql_query($consulta2);
	/*---------------------------------*/
	cerrarBD();
	header("location:listado.php");
?>

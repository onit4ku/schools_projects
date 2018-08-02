<?php
	echo $_REQUEST['nombre'];
	echo "<br>";

	$totalDeportes = 0;
	$deporte1 = $_REQUEST['deporte1'];
	$deporte2 = $_REQUEST['deporte2'];
	$deporte3 = $_REQUEST['deporte3'];
	$deporte4 = $_REQUEST['deporte4'];
	$deporte5 = $_REQUEST['deporte5'];
	
	if($deporte1 != null)
	{
		$totalDeportes++;
	}
	if($deporte2 != null)
	{
		$totalDeportes++;
	}
	if($deporte3 != null)
	{
		$totalDeportes++;
	}
	if($deporte4 != null)
	{
		$totalDeportes++;
	}
	if($deporte5 != null)
	{
		$totalDeportes++;
	}
	
	echo "El numero total de deportes es $totalDeportes";
?>
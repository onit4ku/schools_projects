<?php
	echo $_POST['nombre'];
	echo "<br>";

	$totalDeportes = 0;
	$deporte1 = $_POST['deporte1'];
	$deporte2 = $_POST['deporte2'];
	$deporte3 = $_POST['deporte3'];
	$deporte4 = $_POST['deporte4'];
	$deporte5 = $_POST['deporte5'];
	
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

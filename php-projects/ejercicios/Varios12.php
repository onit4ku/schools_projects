<?php
	$dias = array('lunes','martes','miercoles','jueves','viernes','sabado','domingo');
	
	echo "El primer dia de la semana es $dias[0]";
	echo "<br>";
	
	for($i = 0; $i<count($dias); $i++)
	{
		if($i == count($dias)-1)
		{
			echo "El ultimo dia de la semana es $dias[$i]";
		}
	}
?>
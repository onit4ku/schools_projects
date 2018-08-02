<?php
	$num1 = $_POST['variable1'];
	$num2 = $_POST['variable2'];
	$num3 = $_POST['variable3'];
	$num4 = $_POST['variable4'];

	$calculo = $num1 * $num2 * $num3 * $num4;
	$resultado['result'] = $calculo;
	echo json_encode($resultado);
?>

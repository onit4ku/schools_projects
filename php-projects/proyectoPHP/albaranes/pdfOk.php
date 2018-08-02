<?php
	require_once('../dompdf/dompdf_config.inc.php');
	
	ob_start(); //activa el almacenamiento en búfer de salida.
	
	require_once('pdf.php');
	$dompdf = new DOMPDF();
	$dompdf->load_html(ob_get_clean());
	$dompdf->render();
	$dompdf->stream("albaran.pdf");
?>

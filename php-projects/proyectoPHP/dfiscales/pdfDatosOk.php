<?php
	require_once('../dompdf/dompdf_config.inc.php');
	
	ob_start();
	
	require_once('pdfDatos.php');
	$dompdf = new DOMPDF();
	$dompdf->load_html(ob_get_clean());
	$dompdf->render();
	$dompdf->stream("DatosFiscales.pdf");
?>

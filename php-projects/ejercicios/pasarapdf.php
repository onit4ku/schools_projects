<?php
require_once("../dompdf/dompdf_config.inc.php");

$html =
  '<html><body>'.
  '<p>Mi pagina pasada a pdf</p>'.
  '</body></html>';

$dompdf = new DOMPDF();
$dompdf->load_html($html);
$dompdf->render();
$dompdf->stream("sample.pdf");

?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>
<?php

$DescriptorFichero = fopen("fichero_prueba.txt","w"); 

$string1 = "Este es el texto escrito en el string"; 
fputs($DescriptorFichero,$string1); 


fclose($DescriptorFichero); 
echo "Escrito.";
?>
<body>
</body>
</html>
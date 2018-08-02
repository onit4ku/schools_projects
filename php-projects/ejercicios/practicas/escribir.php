<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>
<?php

#Abrimos el fichero en modo de escritura 
$DescriptorFichero = fopen("fichero_prueba.txt","w"); 

#Escribimos la primera línea dentro de él 
$string1 = "Esta es la primera línea de texto"; 
fputs($DescriptorFichero,$string1); 


fclose($Descriptor2); 
echo "Escrito.";
?>
<body>
</body>
</html>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>
<?php

$DescriptorFichero = fopen("fichero_prueba.txt","r"); 

while(!feof($DescriptorFichero)){ 

    $buffer = fgets($DescriptorFichero,4096); 

    echo $buffer."<BR><BR><BR><BR>";
    echo "<<<-----Fin del fichero<BR>";
} 

?>
<body>
</body>
</html>

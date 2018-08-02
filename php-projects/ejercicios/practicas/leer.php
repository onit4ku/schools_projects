<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>
<?php

#Abrimos el fichero en modo lectura 
$DescriptorFichero = fopen("fichero_prueba.txt","r"); 

#Hasta que no lleguemos al final del fichero 
while(!feof($DescriptorFichero)){ 

    #Capturamos 4096 caracteres dentro de la línea, 
    #o menos si hay un retorno de carro antes 
    $buffer = fgets($DescriptorFichero,4096); 

    #Soltamos el texto, añadiendo <BR> detrás 
    echo $buffer."<BR>";
    echo "Leido 1<BR>";
} 
echo "Leido 2";

?>
<body>
</body>
</html>

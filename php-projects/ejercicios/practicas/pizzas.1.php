<html>
<body>
<?php
$nombre=$_POST['nombre'];
$direccion=$_POST['direccion'];

$jq=$_POST['jq'];
$jqcantidad=$_POST['jqcantidad'];

$napolitana=$_POST['napolitana'];
$ncantidad=$_POST['ncantidad'];

$muzarella=$_POST['muzarella'];
$mcantidad=$_POST['mcantidad'];


echo "Su nombre es $nombre y la direccion del pedido es $direccion<br><br>";


if(jq==true){
	echo "Usted a pedido $jqcantidad de Jamon y Queso<br>";
}

if(napolitana==true){
	echo "Usted a pedido $ncantidad de Napolitana<br>";
}

if(mozarella==true){
	echo "Usted a pedido $mcantidad de Mozarella<br>";
}

$archivo= "pedidos.txt"; // el nombre de tu archivo
$contenido= $_POST['nombre'];
$fch= fopen($archivo, "w"); // Abres el archivo para escribir en él
fwrite($fch, $contenido); // Grabas
fclose($fch); // Cierras el archivo.

?>
</body>
</html>

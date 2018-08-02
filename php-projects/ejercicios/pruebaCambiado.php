<?php

$id		 =$_GET['id'];
$Categoria=$_GET['Categoria'];
$Sueldo   =$_GET['Sueldo'];

echo "$id";
echo "$Sueldo";
echo "$Categoria";

$conectar=mysql_connect("localhost","root","bbdd");

mysql_select_db("test",$conectar);

$consulta = "UPDATE empleados SET Sueldo='$Sueldo', Categoria='$Categoria' where Nombre='$id';";

echo "$consulta";

mysql_query($consulta);

mysql_close();

?>

<li><a href='principal.php?id=Nombre%20desc'>-Volver-</a></li>
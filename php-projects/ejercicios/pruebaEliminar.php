<?php
$id=$_GET['id'];

echo "$id"," Se ha eliminado";

$conectar=mysql_connect("localhost","root","bbdd");

mysql_select_db("test",$conectar);

$consulta = "delete from empleados where Nombre='$id';";

mysql_query($consulta);
mysql_close();

?>

<li><a href='principal.php?id=Nombre%20desc'>-Volver-</a></li>
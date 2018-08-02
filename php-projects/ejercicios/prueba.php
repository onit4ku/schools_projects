<?php
$id=$_GET['id'];

$conexion=mysql_connect("localhost","root","bbdd");

mysql_select_db("test",$conexion);

$consulta = "select * from empleados where Nombre='$id';";

$resultado=mysql_query($consulta);

while($fila = mysql_fetch_array($resultado)){
 echo "<strong>",$fila['Nombre'],"</strong>  ";
 echo 			  $fila['Categoria'],"		";
 echo 			  $fila['Sueldo'],"		";
}
mysql_close();
?>

<li><a href='principal.php?id=Nombre%20desc'>-Volver-</a></li>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<?php
  $conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");

	$registros=mysql_query("select nombre from alumnos where codigocurso=$_REQUEST[codigo]",$conexion) or
  die("error en el select:".mysql_error());

echo "Alumnos inscritos a dicho curso<br>";
while ($reg=mysql_fetch_array($registros))
{
  echo $reg['nombre']." - ";
}

mysql_close($conexion);
?>

</body>
</html>


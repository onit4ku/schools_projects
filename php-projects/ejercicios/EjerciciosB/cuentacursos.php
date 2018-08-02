<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<?php
  	$conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");

	$registros=mysql_query("select nombrecurso from cursos",$conexion) or
  	die("Problemas en el select:".mysql_error());

while ($reg=mysql_fetch_array($registros))
{
  echo "Nombre del curso:".$reg['nombrecurso']."<br>";
  echo "<hr>";
}

$registros=mysql_query("select count(*) as cantidad from cursos",$conexion) or
  die("Problemas en el select:".mysql_error());

$reg=mysql_fetch_array($registros);
echo "La cantidad de cursos son :".$reg['cantidad'];

mysql_close($conexion);
?>

</body>
</html>


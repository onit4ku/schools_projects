<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<?php
  $conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");

$registros=mysql_query("select codigo,nombrecurso from cursos",$conexion) or
  die("error en el select:".mysql_error());

while ($reg=mysql_fetch_array($registros))
{
  echo "Codigo:".$reg['codigo']."<br>";
  echo "Nombre del curso:<a href=\"otro2.php?codigo=$reg[codigo]\">".$reg['nombrecurso']."</a><br>";
  echo "<hr>";
}

mysql_close($conexion);
?>

</body>
</html>


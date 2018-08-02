<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<?php
  $conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");

	$datos=mysql_query("select codigo,nombre, codigocurso from alumnos where nombre='$_REQUEST[nombre]'",$conexion) or
  	die("error en el select".mysql_error());

$i=0;
while ($recorrer=mysql_fetch_array($datos))
{
	
	echo "<table border=1>";
	
	echo "<tr>";
		echo "<td>";
			echo "Nombre";
		echo "</td>";
		echo "<td>";
			echo "Curso";
		echo "</td>";
	echo "</tr>";
	
	echo "<tr>";
		echo "<td>";
			echo $recorrer['nombre'];
	 	echo "</td>";
	 	echo "<td>";
 	
  switch ($recorrer['codigocurso']) {
    case 1:echo "marcas";
           break;
    case 2:echo "bbdd";
           break;
    case 3:echo "php";
           break;
    case 4:echo "cliente";
           break;
  }
  echo "</td>";
  echo "</tr>";
  $i++;
}

if ($i==0)
{
  echo "Alumno no encontrado";
}

mysql_close($conexion);
?>

</body>
</html>
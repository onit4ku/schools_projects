<html>
<body>

<?php
  $conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");

	$datos=mysql_query("select codigo,nombrecurso from cursos",$conexion) or
	die("error en el select".mysql_error());
	
	echo "<table border=1>";
	
	echo "<tr>";
		echo "<td>";
			echo "Código";
		echo "</td>";
		echo "<td>";
			echo "Nombre Curso";
		echo "</td>";
	echo "</tr>";
	
	while ($recorrer=mysql_fetch_array($datos))
	{	
	echo "<tr>";
	  echo "<td>";
	  echo $recorrer['codigo'];
	  echo "</td>";
	  echo "<td>";
	  echo $recorrer['nombrecurso'];
	  echo "</td>";
	echo "</tr>";
	}
	echo "</table>";
	
	mysql_close($conexion);
?>

</body>
</html>
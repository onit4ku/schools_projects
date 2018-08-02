<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<?php
  $conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");

	mysql_query("delete from cursos",$conexion) or
  	die("Error en el delete:".mysql_error());
	echo "Se han matado todos los cursos.";
	mysql_close($conexion);
?>

</body>
</html>


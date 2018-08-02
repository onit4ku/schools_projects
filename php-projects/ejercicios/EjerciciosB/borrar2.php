<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<?php
  $conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");

	$datos=mysql_query("select codigo from cursos where nombrecurso='$_REQUEST[nombrecurso]'",$conexion) or
  	die("error en el select".mysql_error());

	if ($reg=mysql_fetch_array($datos))
	{
	  mysql_query("delete from cursos where nombrecurso='$_REQUEST[nombrecurso]'",$conexion) or
	    die("error en el delete:".mysql_error());
	  echo "Se ha matado el curso";
	}
	else
	{
	  echo "No existe ese curso";
	}
	mysql_close($conexion);
?>

</body>
</html>
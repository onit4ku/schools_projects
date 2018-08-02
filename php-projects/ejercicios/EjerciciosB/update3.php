<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<?php
  	$conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");
    
	$registros=mysql_query("update cursos set nombrecurso='$_REQUEST[nombrecurso]' where codigo=$_REQUEST[codigo]",$conexion) or
  	die("error en el select:".mysql_error());
  	echo "Se actualizó el nombre del curso";
?>

</body>
</html>
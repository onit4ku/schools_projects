<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<?php
  	$conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");
    
	mysql_query("insert into alumnos(nombre,mail,codigocurso) values ('$_REQUEST[nombre]','$_REQUEST[mail]',$_REQUEST[radio1])", $conexion) or
  	die("error en el select".mysql_error());
	mysql_close($conexion);
	echo "Dado de alta.";
?>

</body>
</html>


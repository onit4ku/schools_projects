<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<?php
  $conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");
    
	$registros=mysql_query("update 
		alumnos set codigocurso=$_REQUEST[codigocurso], 
		nombre='$_REQUEST[nombre]',
		mail='$_REQUEST[mail]'							  
                where codigo=$_REQUEST[codigo]",$conexion) or
  	die("error en el update:".mysql_error());
  	echo "El curso se ha actualizado";
?>

</body>
</html>


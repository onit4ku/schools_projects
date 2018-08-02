<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>	
<body>
	
<?php
  $conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");

	$datos=mysql_query("select nombre,mail,nombrecurso from alumnos as alu
               inner join cursos as cur on cur.codigo=alu.codigocurso
			   where alu.codigo=$_REQUEST[codigo]",$conexion) or
           die("error en el select:".mysql_error());

if ($reg=mysql_fetch_array($datos))
{
  echo "Nombre:".$reg['nombre']."<br>";
  echo "Correo:".$reg['mail']."<br>";  
  echo "Curso:".$reg['nombrecurso']."<br>";
}
else
{
  echo "No existe un alumno con ese código.";
}
mysql_close($conexion);
?>

</body>
</html>


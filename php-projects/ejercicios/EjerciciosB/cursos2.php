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

  	mysql_query("insert into cursos(nombrecurso) values ('$_REQUEST[nombrecurso]')", $conexion) or
    die("error en el select".mysql_error());
  
 	mysql_close($conexion);

  echo "El curso se ha dado de alta.";
?>

</body>
</html>

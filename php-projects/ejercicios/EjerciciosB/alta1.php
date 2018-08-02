<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<form action="alta2.php" method="post">
Introduce el nombre:
<input type="text" name="nombre"><br>
Introduce el correo:
<input type="text" name="mail"><br>
Selecciona el curso:<br><br>

<?php
  	$conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");
    
	$datos=mysql_query("select codigo,nombrecurso from cursos",$conexion) or
  	die("error en el select:".mysql_error());

	while ($recorrido=mysql_fetch_array($datos))
	{
	  echo "<input type=\"radio\" name=\"radio1\" value=\"$recorrido[codigo]\">".$recorrido['nombrecurso']."<br>";
	}
?>
<br>
<input type="submit" value="Enviar">
</form>

</body>
</html>


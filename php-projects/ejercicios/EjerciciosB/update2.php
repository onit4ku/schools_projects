<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<?php
  $conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");
    
	$datos=mysql_query("select * from cursos
                        where codigo=$_REQUEST[codigo]",$conexion) or
  die("error en el select:".mysql_error());
	
	if ($recorrido=mysql_fetch_array($datos))
	{
?>

		<form action="update3.php" method="post">
		Ingrese el nuevo nombre del curso:
		<input type="text" name="nombrecurso" value="<?php echo $recorrido['nombrecurso'] ?>">
		<input type="hidden" name="codigo" value="<?php echo $recorrido['codigo'] ?>">
		<br>
		<input type="submit" value="Modificar">
		</form>

<?php
	}
else
  echo "No existe un curso con ese código";
?>

</body>
</html>


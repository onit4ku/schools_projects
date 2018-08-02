<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<?php
  $conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");
    
	$recorridoistros=mysql_query("select * from alumnos where codigo=$_REQUEST[codigo]",$conexion) or
  	die("error en el select:".mysql_error());
	
if ($datos=mysql_fetch_array($recorridoistros))
{
?>
<form action="updatealumnos3.php" method="post">
Nombre: <input type="text" name="nombre" value="<?php echo $datos['nombre'] ?>"><br>
Mail: <input type="text" name="mail" value="<?php echo $datos['mail'] ?>"><br>
<input type="hidden" name="codigo" value="<?php echo $datos['codigo'] ?>">
<select name="codigocurso">
<?php
$recorridoistros=mysql_query("select * from cursos",$conexion) or
  die("error en el select:".mysql_error());
while ($recorrido=mysql_fetch_array($recorridoistros))
{
  if ($datos['codigocurso']==$recorrido['codigo'])
    echo "<option value=\"$recorrido[codigo]\" selected>$recorrido[nombrecurso]</option>";
  else
    echo "<option value=\"$recorrido[codigo]\">$recorrido[nombrecurso]</option>";
}
?>
</select>
<br>
<input type="submit" value="Modificar">
</form>
<?php
}
else
  echo "No existe alumno con dicho mail";
?>

</body>
</html>
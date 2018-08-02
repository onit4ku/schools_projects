<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<?php
  $conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");
    
	$registros=mysql_query("select count(alu.codigo) as     
	    cantidad,nombrecurso,codigocurso from alumnos as alu
	    inner join cursos as cur on cur.codigo=alu.codigocurso
	    group by alu.codigocurso",$conexion) or
  	die("error en el select:".mysql_error());
	
while ($reg=mysql_fetch_array($registros))
{
  echo "Nombre del curso: ".$reg['nombrecurso']."<br>";
  echo "Cantidad de inscritos: ".$reg['cantidad']."<br>";
  $registros2=mysql_query("select nombre from alumnos 
                   where codigocurso=$reg[codigocurso]",$conexion) or
    die("Problemas en el select:".mysql_error());
  while	($reg2=mysql_fetch_array($registros2))
  {
     echo $reg2['nombre']."-";
  }
  echo "<hr>";
}
mysql_close($conexion);
?>

</body>
</html>


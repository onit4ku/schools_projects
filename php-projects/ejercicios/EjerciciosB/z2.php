<html>
<head>
<title>EJERCICIO Z2.</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<p>
Confeccionar una librería que contenga una función llamada retornarConexion, la misma debe llamar a las funciones mysql_connect y mysql_select_db y retornar la variable que generó la función mysql_connect.
Tener en cuenta que a esta función la deben implementar en el archivo "pagina2.php".
En el archivo "pagina1.php" incluir la librería que contiene la función retornarConexion. Luego imprimir todos los registros de la tabla alumnos.
</p>
<?php

require_once("z22.php");
$conexion=retornarConexion();

$registros=mysql_query("select alu.codigo as codigo,nombre,email,codigocurso, 
               nombrec from alumnos as alu
               inner join cursos as cur on cur.codigo=alu.codigocurso",  
           $conexion) or
  die("Problemas en el select:".mysql_error());

while ($reg=mysql_fetch_array($registros))
{
  echo "Codigo:".$reg['codigo']."<br>";
  echo "Nombre:".$reg['nombre']."<br>";
  echo "Mail:".$reg['email']."<br>";
  echo "Curso:".$reg['nombrec']."<br>";
  echo "<hr>";
}
mysql_close($conexion);
?>
</body>
</html>


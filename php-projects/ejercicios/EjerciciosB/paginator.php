	
<?php
if (isset($_REQUEST['pos']))
  $inicio=$_REQUEST['pos'];
else
  $inicio=0;
?>	
	
<html>
<body>

<?php
  $conexion=mysql_connect("localhost","root","bbdd") or
    die("error al conectar");

	mysql_select_db("base1",$conexion) or
    die("error al seleccionar la bbdd");
    
	$registros=mysql_query("select codigo,nombrecurso from cursos
           limit $inicio,3",  
           $conexion) or
  die("error en el select:".mysql_error());
$impresos=0;
while ($reg=mysql_fetch_array($registros))
{
  $impresos++;
  echo "Codigo:".$reg['codigo']."<br>";
  echo "Nombre:".$reg['nombrecurso']."<br>";
  echo "<hr>";
}
mysql_close($conexion);
if ($inicio==0)
  echo "anteriores ";
else
{
  $anterior=$inicio-3;
  echo "<a href=\"paginator.php?pos=$anterior\">Anteriores </a>";
}
if ($impresos==3)
{
  $proximo=$inicio+3;
  echo "<a href=\"paginator.php?pos=$proximo\">Siguientes</a>";
}
else
  echo "siguientes";
?>

</body>
</html>


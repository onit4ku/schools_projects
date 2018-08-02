<html>
<style>
strong{border:2px solid red;background:red;}
</style>
<body>

<?php
$conexion=mysql_connect("localhost","root","bbdd");
mysql_select_db("empresa_bd",$conexion);

$consulta = "SELECT * FROM Departamentos";
$consulta2 = "SELECT * FROM Empleados";

$resultado = mysql_query($consulta);
$resultado2 = mysql_query($consulta2);


while($fila = mysql_fetch_array($resultado)){
 echo "<strong>",$fila['CodDpto'],"</strong>","<br>";
 echo $fila['Descripcion'],"<br>";
 echo $fila['Situacion'],"<br><br><br><br>";
}

echo "<hr><hr><br><br>";

while($fila2 = mysql_fetch_array($resultado2)){
	echo "<strong>",$fila2['CodEmp'],"</strong>","<br>";
	echo $fila2['Nombre'],"<br>";
	echo $fila2['Categoria'],"<br>";
	echo $fila2['Sueldo'],"<br>";
	echo $fila2['ConDpto'],"<br><br>";
}
?>

</body>
</html>
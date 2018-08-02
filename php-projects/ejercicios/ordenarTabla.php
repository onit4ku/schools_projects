<html>
<head>

<style>
table{
	border:2px solid #000;
}

td{
	border:2px solid #000;
	width:150px;
	text-align:center;
}

table a{
	text-decoration:none;
}

</style>

</head>

<body>

<form action="busqueda-especifica.php" name="busqueda-especifica" method="GET">
Buscar por:
<select name="lista">
<option>Nombre</option>
<option>Categoria</option>
<option>Sueldo</option>
</select>
<input type="text" name="busqueda"><input type="submit" value="Buscar">
</form>

<table>
<th><a href=ordenarTabla.php?id=<?php echo "$NombreT";?>>Nombre</a></th>
<th><a href=ordenarTabla.php?id=<?php echo "$categoriaT";?>>Categoria</a></th>
<th><a href=ordenarTabla.php?id=<?php echo "$sueldoT";?>>Sueldo</a></th>
<?php
$i=0;

$tabla=$_GET['id'];

$conectar=mysql_connect("localhost","root","bbdd");
mysql_select_db("test",$conectar);


if($tabla=="Nombre"){
$consulta = "SELECT * FROM empleados order by Nombre";
}else if (
	$tabla=="Categoria"){
	$consulta = "SELECT * FROM empleados order by Categoria";
}else{
	$consulta = "SELECT * FROM empleados order by Sueldo";
}


$resultado = mysql_query($consulta);


while($fila = mysql_fetch_array($resultado)){
	echo "<tr><td>";
 echo "<strong>",$fila['Nombre'],"</strong>  ";
 	echo "</td>";
 	echo "<td>";
 echo $fila['Categoria'],"		";
 	echo "</td>";
 	echo "<td>";
 echo $fila['Sueldo'],"		";
 	echo "</td>";
 $Nombre=$fila['Nombre'];
 $Categoria=$fila['Categoria'];
 $Sueldo=$fila['Sueldo'];
 echo "<td>";
 ?>

<a href=pruebaEliminar.php?id=<?php echo "$Nombre";?>>Eliminar</a>
<a href=prueba.php?id=<?php echo "$Nombre";?>>Ver</a>
<a href=pruebaModificar.php?id=<?php echo "$Nombre";?>>Modificar</a><br><br>

<?php
	echo "</td>";
	echo "</tr>";
}
?>
</table>

</body></html>
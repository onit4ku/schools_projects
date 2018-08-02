<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<link href="estilo.css" rel="stylesheet" type="text/css">
		<title>&Iacute;ndice del Programa</title>
<style>
table{
	border:4px solid #ff7f00;
}

td{
	border:4px solid #ff7f00;
	width:200px;
	text-align:center;
	background-color: black;
}

hr{
	color: blue;

}

table a{
	text-decoration:none;
}

</style>

</head>

<body>
<center>
<h3>Recorrido de los datos:</h3>

<form action="busqueda-especifica.php" name="busqueda-especifica" method="GET">
Buscar por:
<select name="lista">
<option>Nombre</option>
<option>Categoria</option>
<option>Sueldo</option>
</select>
<input type="text" name="busqueda"><input type="submit" value="Buscar">
</form>

<?php 



	$NombreT			="Nombre asc";
	$categoriaT		="Categoria";
	$sueldoT    	="Sueldo";
	
	$TAMANO_PAGINA = 2;

	$pagina = $_GET["pagina"];
	$ordenar=$_GET['id'];
	
	

	$i=0;

	$conectar=mysql_connect("localhost","root","bbdd") or die("NO se pudo realizar la conexión");

	mysql_select_db("test",$conectar) or die("ERROR con la base de datos");
?>

<table>
<th>Ordenar por Nombre<a href="principal.php?id=<?php echo "Nombre asc";?>"><img src="up.png"></a>
			<a href="principal.php?id=<?php echo  		   "Nombre desc";?>"><img src="down.png"></a>
</th>

<?php


if(
	$ordenar == null){
	$consulta = "SELECT * FROM empleados";
}else{
	if(isset(
		$_GET['id']))
			{
				$consulta = "SELECT * FROM empleados order by $ordenar";	
			}
}

$resultado = mysql_query($consulta);




while($fila = mysql_fetch_array($resultado)){
	echo "<tr>";
	echo "<td>";
 	echo "<strong>",$fila['Nombre'],"</strong>  ";
 	echo "</td>";
 	echo "<td>";
	echo $fila['Categoria'],"		";
 	echo "</td>";
 	echo "<td>";
	echo $fila['Sueldo'],"		";
 	echo "</td>";
 		$Nombre		=$fila['Nombre'];
 		$Categoria	=$fila['Categoria'];
 		$Sueldo		=$fila['Sueldo'];
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
</center>


<?php


if (!$pagina) {
    $inicio = 0;
    $pagina=1;
}
else {
    $inicio = ($pagina - 1) * $TAMANO_PAGINA;
} 


$ssql = "select * from empleados " ;
$rs = mysql_query($ssql,$conectar);
$num_total_registros = mysql_num_rows($rs);

$total_paginas = ceil($num_total_registros / $TAMANO_PAGINA);

echo "Numero de registros encontrados: " . $num_total_registros . "<br>";
echo "Se muestran paginas de " . $TAMANO_PAGINA . " registros cada una<br>";
echo "Mostrando la pagina " . $pagina . " de " . $total_paginas . "<p>"; 

$ssql = "select * from empleados "  . " limit " . $inicio . "," . $TAMANO_PAGINA;
$rs = mysql_query($ssql);
while ($fila = mysql_fetch_object($rs)){
    echo $fila-> Nombre . "<br>";
}

mysql_close($conectar); 

if ($total_paginas > 1){
    for ($i=1;$i<=$total_paginas;$i++){
       if ($pagina == $i)
          echo $pagina . " ";
       else
          echo "<a href='principal.php?pagina=" . $i . "'>" . $i . "</a> ";
    }
} 
?>



<li><a href='menu.html'>-Volver-</a></li>
</body></html>


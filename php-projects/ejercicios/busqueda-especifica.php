<?php
$columna=$_GET['lista'];
$dato_busqueda=$_GET['busqueda'];

$conectar=mysql_connect("localhost","root","bbdd");
mysql_select_db("test",$conectar);



if($columna=="Nombre"){
	$consulta = "SELECT * FROM empleados where Nombre like '%$dato_busqueda%';";
}else if($columna=="Categoria"){
	$consulta = "SELECT * FROM empleados where Categoria like '%$dato_busqueda%';";
}else{
	$consulta = "SELECT * FROM empleados where Sueldo like '%$dato_busqueda%';";
}

$resultado = mysql_query($consulta);

while($fila = mysql_fetch_array($resultado)){
	echo "<strong>",$fila['Nombre'],"</strong>  ";
	echo $fila['Categoria'],"		";
	echo $fila['Sueldo'],"		";

	$Nombre=$fila['Nombre'];
	$Categoria=$fila['Categoria'];
	$Sueldo=$fila['Sueldo'];
}
?>
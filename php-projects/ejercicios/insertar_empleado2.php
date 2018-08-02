<html>
<body>

<h3>Empleado insertado.</h3>

<?php
	$CodEmp=$_POST['CodEmp'];
	$Nombre=$_POST['Nombre'];
	$Categoria=$_POST['Categoria'];
	$Sueldo=$_POST['Sueldo'];
	$CodDpto=$_POST['CodDpto'];


$conexion=	mysql_connect("localhost","root","bbdd");
				mysql_select_db("test",$conexion);

$insertar = "insert into Empleados values('$CodEmp','$Nombre','$Categoria','$Sueldo','$CodDpto');";
mysql_query($insertar);
mysql_close();
?>
<li><a href='principal.php?id=Nombre%20desc'>-Volver-</a></li>
</body>
</html>
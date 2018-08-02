<html>
<body>

<h3>Departamento Insertado.</h3>

<?php
	$CodDpto=$_POST['CodDpto'];
	$Descripcion=$_POST['Descripcion'];
	$Situacion=$_POST['Situacion'];

$conexion=	mysql_connect("localhost","root","bbdd");
				mysql_select_db("test",$conexion);

$insertar = "insert into Departamentos values('$CodDpto','$Descripcion','$Situacion');";
mysql_query($insertar);
mysql_close();
?>
</body>
</html>
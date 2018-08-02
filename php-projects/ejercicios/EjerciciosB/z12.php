<?php
session_start();
$conexion=mysql_connect("localhost","root","bbdd") or
  die("Problemas en la conexion");
mysql_select_db("basezeta",$conexion) or
  die("Problemas en la selección de la base de datos");
$registros=mysql_query("select codigo, nombre, codigocurso
                        from alumnos where email='$_REQUEST[mail]'",$conexion) or
  die("Problemas en el select:".mysql_error());
if ($reg=mysql_fetch_array($registros))
{
  $_SESSION['usuario']=$reg['nombre'];
}
?>
<html>
<head>
<title>EJERCICIO Z1.</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<div align="center" class="principal" style="border-style: dotted; font-family: fantasy; text-align: center; background-color: #FFFF00; " name="central">
<a href="z13.php">Entrar a la página principal</a>;
</div>
</body>
</html>


<?php
include_once('include/conexion.php');

session_start();
conectarBD();

// Recoger usu. ,contraseña y mirar si estan en BD

$usuario = $_POST['nombre'];
$passw = $_POST['passw'];

$consulta = "SELECT * from usuarios where nombre='".$usuario."' and password='".$passw."'";
$resultado = mysql_query($consulta);
$fila = mysql_fetch_array($resultado);

if($fila == 0)
{
	$_SESSION['noexiste'] = 1;
	header("location:login.php");
}
else 
{
	header("location:clientes/listado.php?pag=1");
	$_SESSION['usuario'] = $usuario;
}
//Si es usu. válido redirigir al listado de clientes 
//Si no es válido redirigir a login.php y mostrar mensaje de error 


?>

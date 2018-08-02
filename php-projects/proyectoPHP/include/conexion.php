<?php

$dbhost = "localhost"; 
$dbusuario = "root";      
$dbpassword = "bbdd";
$db = "proyectoPHP";
$conexion = 0;

//$GLOBALS Significa simplemente que es una variable que está disponible en cualquier parte del script. Cuando quiero utilizar una variable declarada fuera de una función
 
function conectarBD()
{   
    $GLOBALS['conexion'] = mysql_connect($GLOBALS['dbhost'], $GLOBALS['dbusuario'], $GLOBALS['dbpassword']);
    mysql_select_db($GLOBALS['db'], $GLOBALS['conexion']);
}
 
function cerrarBD()
{
    mysql_close($GLOBALS['conexion']);     
}
?>

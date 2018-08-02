<?php
function retornarConexion()
{
  $conexion=mysql_connect("localhost","root","bbdd") or
    die("Problemas en la conexion");
  mysql_select_db("basezeta",$conexion) or
    die("Problemas en la selección de la base de datos");
  return $conexion;
}  
?>
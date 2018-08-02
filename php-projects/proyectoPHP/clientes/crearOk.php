<?php
include('../include/conexion.php'); 
conectarBD();

// Crear cliente en BD
$empresa = $_POST['empresa'];
$cif = $_POST['cif_nif'];
$contacto = $_POST['contacto'];
$domicilio = $_POST['domicilio'];
$provincia = $_POST['provincia'];
$poblacion = $_POST['poblacion'];
$cp = $_POST['cp'];
$telefono = $_POST['telefono'];
$fax = $_POST['fax'];
$movil = $_POST['movil'];
$email = $_POST['email'];
$fecha = $_POST['fecha'];
$numCuenta = $_POST['num_cuenta'];
$formaPago = $_POST['forma_pago'];
$observaciones = $_POST['observaciones'];

$consulta = "INSERT INTO clientes(empresa, cif_nif, contacto, domicilio, fk_provincia, poblacion, cp, telefono, fax, movil, email, fecha, num_cuenta, forma_pago ,observaciones)
			values('".$empresa."','".$cif."','".$contacto."','".$domicilio."','".$provincia."','".$poblacion."','".$cp."','".$telefono."','".$fax."','".$movil."','".$email."','".$fecha."','".$numCuenta."','".$formaPago."','".$observaciones."')";

$resultado = mysql_query($consulta);

header("location:listado.php");
?>


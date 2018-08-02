<?php
include('../include/conexion.php'); 
conectarBD();

session_start();
$id = $_SESSION['id'];

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
// modificar cliente 

$consulta = "UPDATE clientes SET empresa='".$empresa."', cif_nif='".$cif."', contacto='".$contacto."', domicilio='".$domicilio."', fk_provincia='.$provincia.
', poblacion='".$poblacion."', cp='".$cp."', telefono='".$telefono."', fax='".$fax."', movil='".$movil."', email='".$email."', fecha='".$fecha."', num_cuenta='".$numCuenta."', forma_pago='".$formaPago."', observaciones='".$observaciones."' WHERE id='".$id."'";
$resultado = mysql_query($consulta);

header("location:listado.php");
?>

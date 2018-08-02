<?php

$nombre = $_POST['nombre'];
$email = $_POST['email'];
$empresa = $_POST['empresa'];
$mensaje = $_POST['mensaje'];

$para = 'whoisrg@gmail.com';
$asunto = 'Asunto...';

$header = "From: " . $email . "\r\n";
$header .= "X-Mailer: PHP/" . phpversion() . " \r\n";
$header .= "Mime-Version: 1.0 \r\n";
$header .= "Content-Type: text/plain";

$cuerpo = "Este mensaje fue enviado por " . $nombre . ", de la empresa " . $empresa . " \r\n";
$cuerpo .= "Su e-mail es: " . $email . " \r\n";
$cuerpo .= "Mensaje: " . $mensaje . " \r\n";
$cuerpo .= "Enviado el " . date('d/m/Y', time());

if (mail($para, $asunto, $cuerpo, $header)){
	echo " El mensaje ha sido enviado.";
} 
	else 
		echo "Error al enviar el formulario.";
?>
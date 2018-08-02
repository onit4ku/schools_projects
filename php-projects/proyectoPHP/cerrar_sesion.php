<?php

// Cerrar sesión
	session_start();
	unset($_SESSION['usuario']);
	header("location:login.php");
?>

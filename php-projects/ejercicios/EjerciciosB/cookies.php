<!--sesiones -->

<?php
	session_start();
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Cookies y sesiones</title>
</head>

<body>
<!--cookies -->
<?php
	@$numero=$_COOKIE['visitante'];
	$numero+=1;
	setcookie("visitante",$numero,time()+1000);
	
	if($numero==1)
		{
			print "Es la $numero vez que visitas";
		}
	if($numero>1)
		{
			print "Es la $numero vez  que visitas";
		}
?> 

<!--sesiones -->

<?php
	if(isset($_SESSION['nombre'])){
		echo "<p>Has iniciado sesion: " . $_SESSION['nombre'] . "";
		echo "<p><a href='pagina3.php'>Cerrar Sesion</a></p>";
	}else {
?>

	<form action="pagina2.php" method="post">
		<p>Nombre:<input type="text" name="nombre" required/></p><br />
		<input type="submit" value="Enviar" />
	</form>
	
<?php
	}
?>
<a href="pagina2.php">Ir a pagina 2</a>


</body>
</html>
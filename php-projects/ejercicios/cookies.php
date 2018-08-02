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
<p style="font-size:18px;">el fondo de la página cambiará dependiendo del resto de la division entre 5 del número de visitas</p>

<?php
	@$numero=$_COOKIE['color'];
	$numero+=1;
	setcookie("color",$numero,time()+86400);
	extract($_COOKIE);
	$colores=array('red','cyan','yellow','green','orange');
	@print "<body bgcolor='".$colores[$color%5]."'></body>";
?> 


<?php
	@$numero=$_COOKIE['visitante'];
	$numero+=1;
	setcookie("visitante",$numero,time()+20000);
	
	if($numero==1)
		{
			print "Es la $numero ª vez que visitas esta página";
		}
	if($numero>1)
		{
			print "Es la $numero ª vez  que visitas esta página";
		}
?> 

<!--sesiones -->

<?php
	if(isset($_SESSION['nombre'])){
		echo "<p>Has iniciado sesion: " . $_SESSION['nombre'] . "";
		echo "<p><a href='pagina3.php'>Cerrar Sesion</a></p>";
	}else {
?>

	<form action="pagina2.php" method="POST">
	<p>Nombre:<input type="text" placeholder="Tu Nombre" name="nombre" required/></p><br />
	<input type="submit" value="Enviar" />
	</form>
<?php
	}
?>
<a href="pagina2.php">Ir a pagina 2</a>


</body>
</html>
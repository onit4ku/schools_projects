<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	
		<link href="estilo.css" rel="stylesheet" type="text/css">
		<title>Insertar Empleado</title>
		
		
	</head>
	
<body>

<h3>Insertar Empleado:</h3>


<form action="insertar_empleado2.php" method="POST">
		CodEmp: <input type="text" name="CodEmp"><br>
		Nombre: <input type="text" name="Nombre"><br>
		Categoria: <input type="text" name="Categoria"><br>
		Sueldo: <input type="text" name="Sueldo"><br>
		CodDpto: <input type="text" name="CodDpto"><br>
		<button type="submit" name="enviar">Insertar</button>
</form>

<li><a href='principal.php?id=Nombre%20desc'>-Volver-</a></li>
</body>
</html>
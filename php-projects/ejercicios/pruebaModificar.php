<html>
<body>
<?php

	$id=$_GET['id'];

	$conectar=mysql_connect("localhost","root","bbdd") or die("NO se pudo realizar la conexión");

	mysql_select_db("test",$conectar) or die("ERROR con la base de datos");

	$consulta = "SELECT * FROM empleados where Nombre='$id';";

	$resultado = mysql_query($consulta);

		while($fila = mysql_fetch_array($resultado)){
			$Nombre		=$fila['Nombre'];
			$Categoria	=$fila['Categoria'];
			$Sueldo		=$fila['Sueldo'];
		}

?>
		<form action="pruebaCambiado.php" method="get">
			Nombre:     <input type="text" name="id" value="<?php echo              "$id"; ?>"><br>
			Sueldo:     <input type="text" name="Sueldo" placeholder="<?php echo    "$Sueldo"; ?>"><br>
			Categoria:  <!--<input type="text" name="Categoria" placeholder="<?php echo "$Categoria"; ?>">-->
									
							<select name="Categoria">
								<option>Informatico</option>
								<option>Tecnico</option>
								<option>Jakier</option>
								<option>Becario</option>
								<option>Dehoniano</option>
							</select><br>
							<input type="submit" name="Enviar">
		</form>
		
		
		<li><a href='principal.php?id=Nombre%20desc'>-Volver-</a></li>
</body>
</html>
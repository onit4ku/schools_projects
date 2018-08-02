<html>
<head>
<title>EJERCICIO Z3.</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<pre>
Confeccionar un programa que solicite el ingreso de una clave en un formulario. La segunda página debe verificar si ingresó el string "z80" y mostrar un mensaje de bienvenida, en caso contrario, esta página debe redireccionar a la primera página nuevamente.
Cuando tenemos que redireccionar a una página que está en el mismo sitio, sólo es necesario disponer su nombre: 
< ?php
if ($_REQUEST['direccion']<>"z80")
header("Location: pagina1.php");
?>

Otra cosa interesante que podemos hacer es pasar como parámetro en la segunda página un código de error:
< ?php
if ($_REQUEST['direccion']<>"z80")
header("Location: pagina1.php?error=1");
?>

Y luego en la primera página mostrar un mensaje de error si es que la página recibe este parámetro:
< ?php
if (isset($_REQUEST['error']))
echo "Ingreso clave incorrecta";
?>
</pre>

<?php
{
  if (isset($_REQUEST['error']))
    echo "Ingresó clave incorrecta<br>";
}	
?>
<form method="post" action="z32.php">
Ingrese la clave:
<input type="password" name="clave">
<br>
<input type="submit" value="confirmar">
</form>

</body>
</html>
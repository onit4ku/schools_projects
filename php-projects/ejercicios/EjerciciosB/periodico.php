<html> 
<head> 
<title>Periodico</title> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<style type="text/css">
h1{ color:blue;
	size:120px;
	font-family: sans-serif;	
}
</style>
</head> 
<body> 
<?php

if (isset($_COOKIE['titular']))

echo ("<h1 > '$_COOKIE[titular]'</h1>");

?>

<form method="post" action="periodico2.php">

</br>

<input type="radio" name="noticias" value="Noticias Politica">Noticias Politica

</br>

<input type="radio" name="noticias" value="Noticias Deportivas">Noticias Deportivas

</br>

<input type="radio" name="noticias" value="Noticias Economicas">Noticias Economicas

</br> 

</br>

<input type="submit" value="Cambiar">

</form>

</body>

</html>
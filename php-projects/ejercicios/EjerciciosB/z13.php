<?php
session_start();
?>
<html>
<head>
<title>EJERCICIO Z1.</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<?php
  if (isset($_SESSION['usuario']))
  {
    echo "Bienvenido ".$_SESSION['usuario'];
  }
  else
  {
	echo "No tiene permitido visitar esta página.";
  }
	
?>
</body>
</html>
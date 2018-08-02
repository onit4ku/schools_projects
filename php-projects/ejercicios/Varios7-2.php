<html>
<head></head>
<body>

<?php
  echo $_REQUEST['nombre'];
  echo "<br>";
  if ($_REQUEST['edad']>=18)
  {
    echo "Mayor de edad.";
  }
  else
  {
    echo "No eres mayor de edad";
  }
?>
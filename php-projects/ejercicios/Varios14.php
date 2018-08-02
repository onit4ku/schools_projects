	
<html>
<body>

<?php

  function comprobar($cla1,$cla2)
  {
    if ($cla1!=$cla2)
	  echo "Las claves son distintas";
  }
  
  comprobar($_REQUEST['clave1'],$_REQUEST['clave2']);

?>

	<h2>Se han verificado las claves.</h2>

</body>
</html>


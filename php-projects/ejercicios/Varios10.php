<?php
	echo $_REQUEST['nombre'];
	echo "<br>";
	
	$combo1 = $_REQUEST['combo'];
	
	if($combo1 == 'mayortresmil')
	{
		echo "Debes pagar impuestos";
	}else {
		echo "No debes pagar impuestos";
	}
?>
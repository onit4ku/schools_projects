<html>

<head>

<style type="text/css">
</style>

</head>

<body>


<?php

$SueldoReal=0;
$SalarioTrabajador=1000;
$Impuesto=20;


$SueldoReal=$SalarioTrabajador-(($SalarioTrabajador/100)*$Impuesto);
echo $SueldoReal;


?>


</body>
</html>
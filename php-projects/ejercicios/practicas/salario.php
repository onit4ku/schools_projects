<?php

$SalarioTrabajador = 1200;
$Impuesto = 21;

$SueldoReal = $SalarioTrabajador - (($SalarioTrabajador /100) * $Impuesto);

echo "el sueldo real es: $SueldoReal";


?>
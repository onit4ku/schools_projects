<html>

<head>

<style type="text/css">

h1 {color:red; font-size:40;}
h2 {color:green; font-size:35;}
h3 {color:blue; font-size:;}

</style>

</head>

<body>


<?php

$var=6;
$var2=7;
$var3=8;
$var_l="7";

function random(){
$var=rand(1, 10);
}

random();

print "$var"+"$var2"+"$var3";
print "<h1>$var_l</h1>";


?>


</body>
</html>
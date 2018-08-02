<html>
<head>
</head>

<body>
<?php 
$nombre=$_REQUEST['nombre'];
$edad=(int)$_REQUEST['edad'];

echo "Usted se llama $nombre<br>";
echo "Tiene una edad de $edad<br>";

if($edad>=18){
echo "Es mayor de edad.";
}else{
echo "Es menor mde edad.";
}
?>




</body>
</html>
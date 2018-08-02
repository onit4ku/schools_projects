<?php

if($_POST['noticias'] == "Noticias Politica") 

 {
setcookie("titular", "Noticias Politica", time()+60,"/");
}
else if($_POST['noticias'] == "Noticias Deportivas")
{
setcookie("titular", "Noticias Deportivas", time()+60,"/");
}
else if($_POST['noticias'] == "Noticias Economicas")
{
setcookie("titular", "Noticias Economicas", time()+60,"/");
}

header("location:periodico.php"); 

?>
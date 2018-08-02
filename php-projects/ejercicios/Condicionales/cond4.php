<?php
$noticia = array(
$titulo=> 'Php Clase 5 - Bucles',
$cuerpo => 'Aquí va el contenido de la clase 5 de php, mucho texto, mucho mucho',
$autor => 'Vero'
);

foreach ($noticia as &$i){
	echo '<br>';
	echo $i;

}
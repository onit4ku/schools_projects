<?php
  echo "Tabla del 2 con  for";
  echo "<br>";

  for($i=2;$i<=20;$i=$i+2)
  {
    echo $i;
    echo "-";
  }
  echo "<br>";
  echo "<br>";
  echo "Tabla del 2 con while";
  echo "<br>";
  $i=2;
  while ($i<=20)
  {
    echo $i;
    echo "-";
	$i=$i+2;
  }
  echo "<br>";
  echo "<br>";
  echo "Tabla del 2 con do/while";
  echo "<br>";
  $i=2;
  do {
    echo $i;
    echo "-";
	$i=$i+2;	
  } while ($i<=20);

?>
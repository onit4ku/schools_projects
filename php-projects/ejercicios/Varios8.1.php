<?php
  echo "<br>";
  echo $_REQUEST['nombre'];
  echo "<br>";
  
	  if ($_REQUEST['radio1']=="SinEstudios")
	  {
	    echo "Sin estudios.";
	  }
	  
	  if ($_REQUEST['radio1']=="EstudiosrPimarios")
	  {
	      echo "Estudios primarios.";
	  }
	  
	  if ($_REQUEST['radio1']=="EstudiosSecundarios")
	  {
	    echo "Estudios secundarios.";	
	  }
	  
	  if ($_REQUEST['radio1']=="EstudiosUniversitarios")
	  {
	    echo "Estudios universitarios.";	
	  }
  
?>
<html>
<head>
	<title>Subida m&uacute;ltiple de archivos</title>
</head>
<body>
 
<?php
 
function listar($ruta){
   if (is_dir($ruta)) {
      if ($dir = opendir($ruta)) {
      	echo "<p>";
         while (($file = readdir($dir)) !== false) {
         	if ($file != "." && $file != "..") {
         		echo "<br>$file - " . filetype($ruta . $file); 
         	}
         }
         echo "</p>";
      closedir($dir);
      }
   }else
      echo "<br>No es ruta valida";
} 
 
    $count = 0;
    $exito = 0;
    if ($_SERVER['REQUEST_METHOD'] == 'POST'){
	    foreach ($_FILES['files']['name'] as $i => $name) {
		    if (strlen($_FILES['files']['name'][$i]) > 1) {
			    if (move_uploaded_file($_FILES['files']['tmp_name'][$i], 'upload/'.$name)) {
			    	$count++;
			    	$exito = 1;
			    }
		    }
	    }
    }
    if ($exito == 1) {
    	echo "<p style='color: green'>Subida con &eacute;xito</p>";
    }
 
    listar("./upload/"); 
?>
 
	<form method="post" enctype="multipart/form-data">
        <input type="file" name="files[]" id="files" multiple="" directory="" webkitdirectory="" mozdirectory="">
        <input class="button" type="submit" value="Upload" />
    </form>
</body>
</html>
<?php
	
    $var1 = $_POST['variable1'];
    $var2 = $_POST['variable2'];
	//$con=mysqli_connect("example.com","jack","ab123","my_db");
	$con=mysqli_connect("localhost",$var1,$var2,"bd_name");

	// Check connection
	if (mysqli_connect_errno($con))
	{		
		$devuelve = "Failed to connect to MySQL: " . mysqli_connect_error();
	}
	else{
		//the people table should exist in your database
		$result = mysqli_query($con,"SELECT * FROM people");
		$devuelve = "<table border=1>";
		
			$devuelve = $devuelve. "<tr><td> " . "Name" . "</td><td> " . "Age" ."</td><td> Imagen </td></tr>";
		while($row = mysqli_fetch_array($result))
		{
			// name and number are the columns you have in the people table
			$devuelve = $devuelve. "<tr><td> " . $row['name'] . '</td><td> ' . $row['age'] ."</td><td><img src='".$row['link']."'/></td></tr>";
		}
		$devuelve = $devuelve."</table>";
	
	}
     
    // Array con las respuestas
    $respuesta['devuelve'] = $devuelve;
    //$respuesta['datos'] = $datos;
     
	echo json_encode($respuesta);

?>

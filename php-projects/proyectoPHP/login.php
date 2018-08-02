<html lang="en" style="-webkit-text-size-adjust: 100%; -ms-text-size-adjust: 100%;">
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=0" />
	<link rel="shortcut icon" type="image/x-icon" href="css/images/favicon.ico" />
	<link rel="stylesheet" href="css/login.css" type="text/css" media="all" />
	<link href='http://fonts.googleapis.com/css?family=Ubuntu:400,500,700' rel='stylesheet' type='text/css' />

</head>
<body>

	<?php 
		
		//Aquí mostrar mensaje de usuario 
			session_start();
			if(isset($_SESSION['noexiste']))
			{
				echo "El usuario no existe o la contraseña es erronea";
				unset($_SESSION['noexiste']);
			}
		 ?>
	
<div class="container">
	<section id="content">
		<form action="loginOk.php" method="post" enctype="multipart/form-data" id="form" name="form">
			<h1>Inicio de sesión:</h1>
			<div>
				<input type="text" name="nombre" placeholder="Usuario" required="" id="username" />
			</div>
			<div>
				<input type="password" name="passw" placeholder="Contraseña" required="" id="password" />
			</div>
			<div>
				<input type="submit" value="Iniciar" />
				<a href="#">¿Recordar password?</a>
				<a href="#">Registrarse</a>
			</div>
		</form>
		<div class="button">
		</div>
	</section>
</div>
</body>
</html>
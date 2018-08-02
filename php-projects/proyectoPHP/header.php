<html lang="es" style="-webkit-text-size-adjust: 100%; -ms-text-size-adjust: 100%;">
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=0" />
	<title>PubliSystem by Onitaku.com</title>
	<link rel="shortcut icon" type="image/x-icon" href="css/images/favicon.ico" />
	<link rel="stylesheet" href="../css/style.css" type="text/css" media="all" />
	<link href='http://fonts.googleapis.com/css?family=Ubuntu:400,500,700' rel='stylesheet' type='text/css' />
	
	<script src="../js/jquery-1.8.0.min.js" type="text/javascript"></script>
	<!--[if lt IE 9]>
		<script src="js/modernizr.custom.js"></script>
	<![endif]-->
	<script src="js/jquery.flexslider-min.js" type="text/javascript"></script>
	<script src="js/functions.js" type="text/javascript"></script>
</head>
	
<body>
	
<!-- wraper -->
	<div id="wrapper">
		<!-- shell -->
		<div class="shell">
			<!-- container -->
			<div class="container">
				<!-- header -->
				<header id="header">
					
				<?php
  					session_start();
				?>	
					
					<h1><img src="../logo.png"  title="Logo"></img></h1>
					<h4>
						  <?php    
											
						//Aqui se muestra mensaje de bienvenida al usuario y el link de cerrar sesión
										$usuario = $_SESSION['usuario'];
										echo "Bienvenido ".$usuario;
						?>
						<a href="../cerrar_sesion.php" target="_parent" class="txtmenu">Cerrar sesión</a>
					</h4>
				</header>
				<!-- end of header -->
            
				<!-- navigation -->
            <br><br>
				<nav id="navigation">
                    
					<a href="#" class="nav-btn">Inicio<span class="arr"></span></a>
					<ul>
						<li><a href="../clientes/listado.php?pag=1">Clientes</a></li>
						<li><a href="../comerciales/listado.php?pag=1">Comerciales</a></li>
						<li><a href="../proveedor/listado.php?pag=1">Proveedores</a></li>
                        <li><a href="../albaranes/listado.php?pag=1">Albaranes</a></li>
                        <li><a href="../contratos/listado.php?pag=1">Contratos</a></li>
                        <li><a href="../facturas/listado.php?pag=1">Facturas</a></li>
                        <li><a href="../compras/listado.php?pag=1">Compras</a></li>
                        <li><a href="../dfiscales/listado.php?pag=1">D.Fiscales</a></li>
					</ul>
				</nav>
				<!-- end of navigation -->
	</div>
	<!-- end of wrapper -->
</body>
</html>

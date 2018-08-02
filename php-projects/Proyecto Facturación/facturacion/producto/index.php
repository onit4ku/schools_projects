<?php
require_once 'producto.entidad.php';
require_once 'producto.model.php';
error_reporting(E_ALL & ~E_NOTICE | E_STRICT);

// Logica
$alm = new Producto();
$model = new ProductoModel();

header('Content-Type: text/html; charset=ISO-8859-1');
if(isset($_REQUEST['action']))
{
	switch($_REQUEST['action'])
	{
		case 'actualizar':
			$alm->__SET('Nombre_Producto',    $_REQUEST['Nombre_Producto']);
			$alm->__SET('ID_Producto',        $_REQUEST['ID_Producto']);
			$alm->__SET('Precio_Producto',    $_REQUEST['Precio_Producto']);


            echo $alm->__GET('Precio_Producto');

            echo $alm->__GET('ID_Producto');


			$model->Actualizar($alm);
        
			header('Location: index.php');

			break;

		case 'registrar':
			$alm->__SET('Nombre_Producto',    $_REQUEST['Nombre_Producto']);
			$alm->__SET('ID_Producto',        $_REQUEST['ID_Producto']);
			$alm->__SET('Precio_Producto',    $_REQUEST['Precio_Producto']);

			$model->Registrar($alm);
			header('Location: index.php');
			break;

		case 'eliminar':
			$model->Eliminar($_REQUEST['ID_Producto']);
			header('Location: index.php');
			break;

		case 'editar':
			$alm = $model->Obtener($_REQUEST['ID_Producto']);
			break;
	}
}
?>

<!DOCTYPE html>
<html lang="es">
	<head>
		<title>ABM - Producto</title>
        <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
        <meta charset="utf-8" />
	</head>
    <body style="padding:15px; background-color: #231F20; color:#FFF;">

        <div class="pure-g">
            <div class="pure-u-1-12">
                <form action="?action=<?php echo $alm->ID_Producto > 0 ? 'actualizar' : 'registrar'; ?>" method="post" class="pure-form pure-form-stacked" style="margin-bottom:30px;">                    
                    <table style="width:750px;">
                         <tr>
                            
                            <td><input type="hidden" name="ID_Producto" value="<?php echo $alm->__GET('ID_Producto'); ?>" style="width:100%;" /></td>
                        </tr>

                        <tr>
                            <th style="text-align:left;">Nombre Producto:</th>
                            <td><input type="text" name="Nombre_Producto" value="<?php echo $alm->__GET('Nombre_Producto'); ?>" style="width:100%;" /></td>
                        </tr>
                        <tr>
                            <th style="text-align:left;">Precio:</th>
                               <td><input type="text" name="Precio_Producto" value="<?php echo $alm->__GET('Precio_Producto'); ?>" style="width:100%;" /></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <button type="submit" class="pure-button pure-button-primary">Alta</button>
                                  <a class="pure-button" href="../_index.html">Atr&aacute;s</a>
                            </td>
                        </tr>
                    </table>
                </form>
                <table width="750px" class="pure-table pure-table-horizontal">
                    <thead>
                        <tr>
                            <th style="text-align:left;">ID</th>
                            <th style="text-align:left;">Producto</th>
                            <th style="text-align:left;">Precio</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <?php foreach($model->Listar() as $r): ?>
                        <tr>
                            <td><?php echo $r->__GET('ID_Producto'); ?></td>
                            <td><?php echo $r->__GET('Nombre_Producto'); ?></td>
                            <td><?php echo $r->__GET('Precio_Producto'); ?></td>
                            <td><img src="../img/b_edit.png" title="Editar" alt="Editar" class="icon ic_b_edit">
                                <a style="color:orange;" href="?action=editar&ID_Producto=<?php echo $r->ID_Producto; ?>">Editar</a>
                            </td>
                            <td><img src="../img/b_drop.png" title="Eliminar" alt="Eliminar" class="icon ic_b_borrar">
                                <a style="color:red;" href="?action=eliminar&ID_Producto=<?php echo $r->ID_Producto; ?>">Eliminar</a>
                            </td>
                        </tr>
                    <?php endforeach; ?>
                </table>     
            </div>
        </div>
    </body>
</html>
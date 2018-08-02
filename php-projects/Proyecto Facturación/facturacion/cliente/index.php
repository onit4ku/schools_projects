<?php
require_once 'cliente.entidad.php';
require_once 'cliente.model.php';
error_reporting(E_ALL & ~E_NOTICE | E_STRICT);

// Logica
$alm = new Cliente();
$model = new ClienteModel();

header('Content-Type: text/html; charset=ISO-8859-1');
if(isset($_REQUEST['action']))
{
	switch($_REQUEST['action'])
	{
		case 'actualizar':
			$alm->__SET('Nombre_Cliente',        $_REQUEST['Nombre_Cliente']);
			$alm->__SET('NIF_Cliente',           $_REQUEST['NIF_Cliente']);
			$alm->__SET('Direccion_Cliente',     $_REQUEST['Direccion_Cliente']);

			$model->Actualizar($alm);
			header('Location: index.php');
			break;

		case 'registrar':
			$alm->__SET('Nombre_Cliente',        $_REQUEST['Nombre_Cliente']);
			$alm->__SET('NIF_Cliente',           $_REQUEST['NIF_Cliente']);
			$alm->__SET('Direccion_Cliente',     $_REQUEST['Direccion_Cliente']);

			$model->Registrar($alm);
			header('Location: index.php');
			break;

		case 'eliminar':
			$model->Eliminar($_REQUEST['NIF_Cliente']);
			header('Location: index.php');
			break;

		case 'editar':
			$alm = $model->Obtener($_REQUEST['NIF_Cliente']);
			break;
	}
}

?>

<!DOCTYPE html>
<html lang="es">
	<head>
		<title>ABM - Cliente</title>

        <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
        <meta charset="utf-8" />
	</head>
    <body style="padding:15px; background-color: #231F20; color:#FFF;">

        <div class="pure-g">
            <div class="pure-u-1-12">
                
                <form action="?action=<?php echo $alm->NIF_Cliente > 0 ? 'actualizar' : 'registrar'; ?>" method="post" class="pure-form pure-form-stacked" style="margin-bottom:30px;">                    
                    <table style="width:500px;">
                        <tr>
                            <th style="text-align:left;">Nombre Cliente</th>
                            <td><input type="text" name="Nombre_Cliente" value="<?php echo $alm->__GET('Nombre_Cliente'); ?>" style="width:100%;" /></td>
                        </tr>
                        <tr>
                            <th style="text-align:left;">NIF Cliente</th>
                            <td><input type="text" name="NIF_Cliente" value="<?php echo $alm->__GET('NIF_Cliente'); ?>" style="width:100%;" /></td>
                        </tr>
                        <tr>
                            <th style="text-align:left;">Direcci&oacute;n</th>
                               <td><input type="text" name="Direccion_Cliente" value="<?php echo $alm->__GET('Direccion_Cliente'); ?>" style="width:100%;" /></td>
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
                            <th style="text-align:left;">Cliente</th>
                            <th style="text-align:left;">NIF</th>
                            <th style="text-align:left;">Direcci&oacute;n</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <?php foreach($model->Listar() as $r): ?>
                        <tr>
                            <td><?php echo $r->__GET('Nombre_Cliente'); ?></td>
                            <td><?php echo $r->__GET('NIF_Cliente'); ?></td>
                            <td><?php echo $r->__GET('Direccion_Cliente'); ?></td>
                            <td><img src="../img/b_edit.png" title="Editar" alt="Editar" class="icon ic_b_edit">
                                <a href="?action=editar&NIF_Cliente=<?php echo $r->NIF_Cliente; ?>">Editar</a>
                            </td>
                            <td><img src="../img/b_drop.png" title="Eliminar" alt="Eliminar" class="icon ic_b_borrar">
                                <a href="?action=eliminar&NIF_Cliente=<?php echo $r->NIF_Cliente; ?>">Eliminar</a>
                            </td>
                        </tr>
                    <?php endforeach; ?>
                </table>     
              
            </div>
        </div>

    </body>
</html>
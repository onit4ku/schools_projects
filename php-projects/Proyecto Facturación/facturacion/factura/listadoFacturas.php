<?php
require_once 'factura.entidad.php';
require_once 'factura.model.php';

error_reporting(E_ALL & ~E_NOTICE | E_STRICT);

// Logica
$alm = new Factura();
$model = new FacturaModel();


header('Content-Type: text/html; charset=ISO-8859-1');
if(isset($_REQUEST['action']))
{
    switch($_REQUEST['action'])
    {
        case 'actualizar':
            $alm->__SET('Num_Factura',                 $_REQUEST['Num_Factura']);
            $alm->__SET('Fecha_Factura',               $_REQUEST['Fecha_Factura']);
            $alm->__SET('IDR_Cliente',                 $_REQUEST['IDR_Cliente']);

            $model->Actualizar($alm);
            header('Location: index.php');
            break;

        case 'registrar':
            $alm->__SET('Num_Factura',                $_REQUEST['Num_Factura']);
            $alm->__SET('Fecha_Factura',              $_REQUEST['Fecha_Factura']);
            $alm->__SET('IDR_Cliente',                $_REQUEST['IDR_Cliente']);

            $model->Registrar($alm);
            header('Location: index.php');
            break;

        case 'eliminar':
            $model->Eliminar($_REQUEST['Num_Factura']);
            header('Location: index.php');
            break;

        case 'editar':
            $alm = $model->Obtener($_REQUEST['Num_Factura']);
            break;
    }
}

?>

<!DOCTYPE html>
<html lang="es">
    <head>
        <title>ABM - Factura</title>
        <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
        <meta charset="utf-8" />
    </head>
    <body style="padding:15px; background-color: #231F20; color:#FFF;">

        <div class="pure-g">
            <div class="pure-u-1-12">
                <form action="?action=<?php echo $alm->Num_Factura > 0 ? 'actualizar' : 'registrar'; ?>" method="post" class="pure-form pure-form-stacked" style="margin-bottom:30px;">                    
                    <table style="width:570px;">
                        <tr>
                            <td><input type="hidden" name="ID_Factura" value="<?php echo $alm->__GET('ID_Factura'); ?>" style="width:100%;" /></td>
                        </tr>
                       
                        <tr>
                            <td colspan="2">
                              
                                  <a class="pure-button" href="factura.php">Atr&aacute;s</a>
                            </td>
                        </tr>
                    </table>
                </form>

                <table width="570px" class="pure-table pure-table-horizontal">
                    <thead>
                        <tr>
                            <th style="text-align:left;">Fecha Factura</th>
                            <th style="text-align:left;">N&uacute;mero Factura</th>
                            <th style="text-align:left;">IDR Cliente</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <?php foreach($model->Listar() as $r): ?>
                        <tr>
                            <td ><?php echo $r->__GET('Fecha_Factura'); ?></td>
                            <td><?php echo $r->__GET('Num_Factura'); ?></td>
                            <td><?php echo $r->__GET('IDR_Cliente'); ?></td>
                        
                            <td><img src="../img/b_drop.png" title="Eliminar" alt="Eliminar" class="icon ic_b_borrar">
                                <a style="color:orange;" href="factura.php?action=eliminar&Num_Factura=<?php echo $r->Num_Factura; ?>">Eliminar</a>
                            </td>
                        </tr>
                    <?php endforeach; ?>
                </table>     
            </div>
        </div>
    </body>
</html>
<?php
    require_once 'facturaDAO.php';
    require_once 'facturaVO.php';
    
    require_once 'lineaVO.php';
    require_once 'lineaDAO.php';
    
    require_once '../producto/producto.model.php';
    require_once '../producto/producto.entidad.php';
    
    require_once '../cliente/cliente.model.php';
    require_once '../cliente/cliente.entidad.php';
    
    error_reporting(E_ALL & ~E_NOTICE | E_STRICT);
    
    // Logica
    $alm2   = new Producto();
    $model2 = new ProductoModel();
    
    $alm3   = new Cliente();
    $model3 = new ClienteModel();
    
    $fra      = new facturaVO();
    $modelFra = new facturaDAO();
    
    $linea      = new lineaVO();
    $modellinea = new lineaDAO();
    
    
    if (isset($_REQUEST['facturacion'])) {
        switch ($_REQUEST['facturacion']) {
            case 'registrar':
                $fra->setNumFactura($_REQUEST['numero']);
                $fra->setFechaFactura($_REQUEST['fecha']);
                $fra->setCliente($_REQUEST['cliente']);
                
                $modelFra->Registrar($fra);
                //header('Location: index.php');
                break;
        }
    }
    if (isset($_REQUEST['lineas'])) {
        switch ($_REQUEST['lineas']) {
            case 'registrar':
                $linea->setCantidad($_REQUEST['cantidad']);
                $linea->setPrecio($_REQUEST['precio']);
                $linea->setProducto($_REQUEST['producto']);
                $linea->setFactura($_REQUEST['numero']);
                
                $modellinea->Registrar($linea);
                //header('Location: index.php');
                break;
            
            case 'eliminar':
                //$modelFra->Eliminar($_REQUEST['id']);
                //header('Location: index.php');
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
                <table>
                    <tr>
                        <td>  <a style="background-color:green; color:#FFF;" class="pure-button" href="../_index.html">Atr&aacute;s</a></td>
                        <td><a class="pure-button" href="../factura/listadoFacturas.php">Listado Facturas</a></td>
                        <td> <a  class="pure-button" href="factura.php">Nueva Factura</a></td>
                    </tr>
                </table>


                <h1>Factura</h1>
                <?php
                    if (!isset($_REQUEST['facturacion']) && !isset($_REQUEST['lineas'])) {
                    ?>
                <form action="?facturacion=registrar" method="post" class="pure-form pure-form-stacked" style="margin-bottom:30px;">
                    <table style="width:750px;">
                        <tr>
                            <th style="text-align:left;">Numero: </th>
                            <td><input type="text" required name="numero" style="width:185px;" /></td>
                        </tr>
                        <tr>
                            <th style="text-align:left;">Fecha: </th>
                            <td><input type="date" required name="fecha" value="<?php
                                echo date('Y-m-d');
                                ?>"/></td>
                        </tr>
                        <tr>
                            <th style="text-align:left;">Cliente: </th>
                            <td name="cliente" style="width:100%">
                                <select name="cliente">
                                    <?php
                                        foreach ($model3->Listar() as $r):
                                        ?>
                                    <option value="<?php
                                        echo $r->__GET('NIF_Cliente');
                                        ?>" >
                                        <?php
                                            echo $r->__GET('Nombre_Cliente');
                                            ?>
                                    </option>
                                    <?php
                                        endforeach;
                                        ?>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <button type="submit" class="pure-button pure-button-primary">Guardar</button>
                            </td>
                        </tr>
                    </table>
                </form>
                <?php
                    }
                    ?>
                <?php
                    if (isset($_REQUEST['facturacion']) || isset($_REQUEST['lineas'])) {
                    ?>
                    <table style="width:100%;"> 
                        <tr>
                            <th style="text-align:left; color:orange;">Numero: </th>
                            <td>
                                <h4 style="width:100%;" ><?php echo $_REQUEST['numero']; ?></h4>
                            </td>
                       </tr>
                       <tr>
                            <th style="text-align:left;  color:orange;">Fecha: </th>
                            <td>
                                <h4 style="width:100%;"><?php echo $_REQUEST['fecha']; ?></h4>
                            </td>
                       </tr>
                       <tr>
                            <th style="text-align:left;  color:orange;">Cliente: </th>
                            <td>
                                <h4 style="width:100%;"><?php echo $_REQUEST['cliente']; ?></h4>
                            </td>
                        </tr>    
                    </table>
                    <br/>
                <h1>Lineas</h1>
                <form action="?lineas=registrar" method="post" class="pure-form pure-form-stacked" style="margin-bottom:30px;">
                    <input style="width:100%;" type="hidden" name="numero"  value="<?php
                        echo $_REQUEST['numero'];
                        ?>"  style="width:100%;" />
                    <input style="width:100%;" type="hidden" name="fecha"  value="<?php
                        echo $_REQUEST['fecha'];
                        ?>"  style="width:100%;" />
                    <input style="width:100%;" type="hidden" name="cliente" value="<?php
                        echo $_REQUEST['cliente'];
                        ?>"/>
                    <br/>
                    <table style="width:750px;" class="pure-table pure-table-horizontal">
                        <thead>
                            <tr>
                                <th style="text-align:left;"></th>
                                <th style="text-align:left;">Cantidad</th>
                                <th style="text-align:left;">Producto</th>
                                <th style="text-align:left;">Precio</th>
                                <th style="text-align:left;"></th>
                            </tr>
                        </thead>
                        <tr>
                            <td></td>
                            <td><input type="text" name="cantidad" style="width:100%;" /></td>
                            <td >
                                <select name="producto">
                                    <?php
                                        foreach ($model2->Listar() as $r):
                                        ?>
                                    <option value="<?php
                                        echo $r->__GET('ID_Producto');
                                        ?>" >
                                        <?php
                                            echo $r->__GET('Nombre_Producto');
                                            ?>
                                    </option>
                                    <?php
                                        endforeach;
                                        ?>
                                </select>
                            </td>
                            <td><input type="text" name="precio" style="width:100%;" /></td>
                            <td> <button type="submit" class="pure-button pure-button-primary">Guardar</button></td>
                        </tr>
                    </table >
                </form>
                <table style="width:750px;" class="pure-table pure-table-horizontal">
                    <thead>
                        <tr>
                            <th style="text-align:left;">Cantidad</th>
                            <th style="text-align:left;">Producto</th>
                            <th style="text-align:left;">Precio</th>
                            <th style="text-align:left;"></th>
                        </tr>
                    </thead>
                    <?php
                        foreach ($modellinea->Listar($_REQUEST['numero']) as $r):
                        ?>
                    <tr>
                        <td><?php
                            echo $r->getCantidad();
                            ?></td>
                        <td>
                            <?php
                                echo $r->getProducto();
                                ?>
                        </td>
                        <td>
                            <?php
                                echo $r->getPrecio();
                                ?>
                        </td>
                        <td><img src="../img/b_drop.png" title="Eliminar" alt="Eliminar" class="icon ic_b_borrar">
                            <a style="color:orange;" href="factura.php?lineas=registrar?action=eliminar&ID_Linea=<?php echo $r->ID_Linea; ?>">Eliminar</a>
                        </td>
                    </tr>
                    <?php
                        endforeach;
                        ?>
                </table>
                <?php
                    }
                    ?>
            </div>
        </div>
    </body>
</html>
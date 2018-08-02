<?php 
    include('../include/conexion.php');
    include('../header.php');

    // Detalle de compras
    conectarBD();
    $compra = $_GET['id'];
    $consulta ="SELECT * from compras where id=".$compra;
    $resultado = mysql_query($consulta);
    $row = mysql_fetch_array($resultado);

    //Fecha al formato Español
    $date = str_replace('/', '-', $row['fecha_compra']);
    $fcompra = date('d-m-Y', strtotime($date));
?>
<br><br>
    <table class="CSSTableGenerator" align="center">
        <tr>
            <?php 
                $consulta2 = "SELECT * from proveedor where id=".$row['fk_proveedor'];
                $resultado2 = mysql_query($consulta2);
                $row2 = mysql_fetch_array($resultado2);
            ?>
            <td><span>Proveedor: <?php echo $row2['nombre']?></span></td>
        </tr>						
        <tr>
            <td><span>Fecha de compra: <?php echo $fcompra?></span></td>
        </tr>
        <tr>
            <td><span>Iva: <?php echo $row['iva']?>%</span></td>
        </tr>

        <tr>
            <td><span>Forma de pago: <?php echo $row['forma_pago']?></span></td>
        </tr>
        <tr>
            <td><span>NºVencimiento: <?php echo $row['num_vencimiento']?></span></td>
        </tr>
        <tr>
            <td><span>Estado del Pago: <?php echo $row['pagado']?></span></td>
        </tr>
    </table>
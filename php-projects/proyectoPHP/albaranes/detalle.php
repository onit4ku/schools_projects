<?php 
    include('../include/conexion.php');
    include('../header.php');

    // Detalle de albarán
    conectarBD();
    $albaran = $_GET['id'];
    $consulta ="SELECT * from albaranes where id=".$albaran;
    $resultado = mysql_query($consulta);
    $row = mysql_fetch_array($resultado);

    //Fecha al formato Español
    $date = str_replace('/', '-', $row['fecha_albaran']);
    $falbaran = date('d-m-Y', strtotime($date));

    $date = str_replace('/', '-', $row['fecha_vencimiento']);
    $fvencimiento = date('d-m-Y', strtotime($date));
?>
    <br><br>

<table  class="CSSTableGenerator" align="center">
    <tr>
        <td>
            <span><strong>Fecha Albarán:</strong> <?php echo $falbaran?></span>
        </td>
    </tr>
    <tr>
        <td>
            <span><strong>Fecha Vencimiento:</strong> <?php echo $fvencimiento?></span>
        </td>
    </tr>
    <tr>
        <td>
            <span><strong>Albarán Facturado:</strong> <?php echo $row['facturado']?></span>
        </td>
    </tr>
    <tr>
        <td>
            <span><strong>Contrato Número:</strong> <?php echo $row['fk_contrato']?></span>
        </td>
    </tr>
</table>
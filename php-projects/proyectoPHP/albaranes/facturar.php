<?php 
    include('../include/conexion.php');
	include('../header.php');
    conectarBD();

    $id = $_GET['id'];
    $numerofa = "SELECT SUBSTR(numero,1, 1) from facturas ORDER BY numero desc";
    $resultadofa = mysql_query($numerofa);
    $rowfa = mysql_fetch_array($resultadofa);
 ?>
<br><br>

<center>
    <form class="contact_form" action="facturarOk.php?id=<?php echo $id?>" method="post">

    <h2>FACTURA</h2>
        <br>
        <table>
            <tr>
                <td><span>Número: </span></td>
            <td><input type="text" name="numero" value="<?php $sigfactura = $rowfa[0] + 1; echo $sigfactura.'/'.date('y')?>"/></td>
            </tr>
            <tr>
                <td><span>Fecha factura: </span></td>
            <td><input type="date" name="fechafactura" value="<?php echo date('d-m-Y')?>"/></td>
            </tr>
            <tr>
                <td><span>Estado del pago: </span></td>
                <td><select name="cobro">
                        <option value="No Cobrado">No Cobrado</option>
                        <option value="Cobrado">Cobrado</option>
                    </select></td>
            </tr>
        </table><br>
        <input class="boton" type="submit" value="Crear factura" />
        <input class="boton" type="reset" value="Reestablecer datos" />
    </form><br><br><br><br><br><br><br><br>
</center>
<?php cerrarBD(); include('../footer.php'); ?>
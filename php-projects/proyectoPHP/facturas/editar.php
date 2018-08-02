<?php 
	include("../include/conexion.php"); conectarBD();
	include('../header.php');  
?>
<center><br>
    <?php 
	// Editar Factura
        $id = $_GET['id'];
        $factura = $_GET['id'];
        $consulta ="SELECT * from facturas where id=".$factura;
        $resultado = mysql_query($consulta);
        $row = mysql_fetch_array($resultado)
    ?>                  
		
    <form class="contact_form" action="editarOk.php?id=<?php echo $factura ?>" method="post">
        <H2>Modificar Factura</H2>
            <ul>
                <li>*Cobrado: <input type="checkbox" name="cobrado" 
                    <?php 
                        if($row['cobro'] == "Cobrado")
                        {
                            echo "checked";
                        }
                    ?>/>
                </li>
            </ul>
            <input class="submit" type=submit value="Modificar" />
    </form>
</center>

<?php include('../footer.php');  ?>

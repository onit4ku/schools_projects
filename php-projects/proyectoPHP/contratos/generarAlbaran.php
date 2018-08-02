<?php
    include("../include/conexion.php");
    include("../header.php");
    conectarBD();
        
    $id = $_GET['id'];
    $nvencimiento = $_GET['num'];
?>
<center>
    <form class="contact_form" action="generarAlbaranOk.php?id=<?php echo $id?>&num=<?php echo $nvencimiento?>" method="post">
        <br><h2>Albarán</h2><br>

					<table class="CSSTableGenerator">
                        <th>Crear Albaranes</th>
						<tr>
							<td><span>Fecha de Albarán: </span></td>
							<td><input type="date" name="falbaran"/></td>
						</tr>
						<tr>
							<td><span>Fecha de Vencimiento: </span></td>
							<td><input type="date" name="fvencimiento"/></td>
						</tr>
						<tr>
							<td><span>Facturado: </span></td>
							<td><input type="checkbox" name="facturado"/></td>
						</tr>
					</table>
					<input class="boton" type="submit" value="Crear albaran" />
					<input class="boton" type="reset" value="Borrar datos" />
				</form>
</center>
    <?php   include("../footer.php");cerrarBD();?>
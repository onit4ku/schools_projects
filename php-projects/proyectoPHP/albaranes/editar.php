<?php 
	include("../include/conexion.php"); conectarBD();
	include('../header.php');  
?>
<center>   
<?php 
	// Editar Albarán
            $id = $_GET['id'];
            $consulta = "SELECT * from albaranes where id=".$id;
            $resultado = mysql_query($consulta);
            $row = mysql_fetch_array($resultado);
        ?>                  
		
    <form action="editarOk.php?id=<?php echo $id ?>" class="contact_form" method="post">
    <h2>Modificar Albarán</h2><br>
        
        <span >Fecha Albarán: </span>
                <input  name="falbaran" value="<?php  echo $row['fecha_albaran']?>" type="date" >
                <br>
        <span >Fecha Vencimiento:</span>      
                <input  name="fvencimiento" value="<?php echo $row['fecha_vencimiento']?>" type="date" >
                <br>
        <tr>
        <td><span>Facturado: </span></td>
        <td>
            <select name="factura">
                <option value="<?php echo $row['facturado']?>"><?php echo $row['facturado']?></option>
                <option value="Facturado">Facturado</option>
                <option value="No Facturado">No Facturado</option>

            </select>
        </td>
        </tr><br>
        <tr>
        <td><span>Contrato: </span></td>
        <td>
            <select name="fkcontrato">
                <option value="<?php echo $row['fk_contrato']?>"><?php echo $row['fk_contrato']?></option>						
                <?php
                    $consulta2 = "SELECT c.id from contratos c";
                    $resultado2 = mysql_query($consulta2);

                    while($row2 = mysql_fetch_array($resultado2))
                    {
                ?>
                    <option value="<?php echo $row2['id']?>"><?php echo $row2['id']?></option>
                <?php		
                    }
                ?>
            </select>
        </td>
        </tr><br>
        <input type="submit" class="submit" value="Modificar"> 
        <input type="reset" value="Restablecer Datos">
        </form>
    </center>
<?php include('../footer.php'); ?>
<?php 
	include("../include/conexion.php"); conectarBD();
	include('../header.php');  
?>
<center>   
<?php 
	// Editar Compras
	$id = $_GET['id'];
	$_SESSION['id'] = $id;
	
	$consulta = "SELECT * from compras where id=".$id;
    $resultado = mysql_query($consulta);
    $row = mysql_fetch_array($resultado);
?>                            
    <form action="editarOk.php?id=<?php echo $id ?>" class="contact_form" method="post"><br>
    
    <H2>Actualizar Contrato</H2><br>
    
	<table>
        <tr>
            <td><span>Proveedor: </span></td>
            <td>
                <select name="nproveedor">									
                    <?php 
                        $cprov = "SELECT * from proveedor";
                        $resprov = mysql_query($cprov);
                        while($rowprov = mysql_fetch_array($resprov)){
                    ?>
                    <option value="<?php echo $rowprov['id']; ?>"
                    <?php if ($row['fk_proveedor'] == $rowprov['id']) echo "selected";?>>
                    <?php echo $rowprov['nombre']?>
                    </option>

                    <?php		
                        }
                    ?>
                </select>
            </td>
        </tr>						
        <tr>
            <td><span>Fecha de compra: </span></td>
            <td>	
                <input type="date" name="fcompra" value="<?php echo $row['fecha_compra'] ?>"/>
            </td>
        </tr>						
        <tr>
            <td><span>%IVA aplicado: </span></td>
            <td><input type="text" name="iva" value="<?php echo $row['iva']?>"/></td>
        </tr>

        <tr>
            <td><span>Forma de pago: </span></td>
            <td><input type="text" name="fpago" value="<?php echo $row['forma_pago']?>"/></td>
        </tr>
        <tr>
            <td><span>Número Vencimiento: </span></td>
            <td><input type="text" name="nvencimiento" value="<?php echo $row['num_vencimiento']?>"/></td>
        </tr>
        <tr>
            <td><span>Pagado: </span></td>
            <td><input type="text" name="pagado" value="<?php echo $row['pagado']?>"/></td>
        </tr>

    </table><br>
        
    <h2>Lineas de Compra</h2><br>
        
    <table id="lineas">
        <tr>
            <th>Proveedor</th>
            <th>Fecha Public.</th>
            <th>Concepto</th>
            <th>Importe</th>
        </tr>
        <?php
            $consulta4 = "SELECT * from lineas_compra where fk_compra=".$id;						
            $resultado4 = mysql_query($consulta4);
            $i = 0;
            while($row4 = mysql_fetch_array($resultado4))
            {
                 $i++;
        ?>
            <tr>
                <td>
                    <select name="proveedor<?php echo $i?>">
                        <?php
                            $cprov = "SELECT * from proveedor";			
                            $resprov = mysql_query($cprov);
                        while($rowprov = mysql_fetch_array($resprov))
                        {                                            
                       ?>
                         <option value="<?php echo $rowprov['id'];?>"
                            <?php if ($row4['fk_proveedor'] == $rowprov['id']) echo "selected"; ?>>    
                             <?php echo $rowprov['nombre']; ?>
                        </option>               
                        <?php
                            }
                        ?>
                    </select>
                </td>
                <td>          
                <input type="date" name="fepublicacion<?php echo $i?>" value="<?php echo $row4['fecha']?>"/></td>
                <td><textarea name="concepto<?php echo $i?>"><?php echo $row4['concepto']?></textarea></td>
                <td><input type="text" name="importe<?php echo $i?>" value="<?php echo $row4['importe']?>"/></td>
                <td><input type="hidden" name="idlin<?php echo $i?>" value="<?php echo $row4['id'];?>"/></td>
            </tr>
        <?php
            }
        ?>
    </table><br>
        
    <input type="hidden" id="nlineas" name="nlineas" value="<?php echo $i?>"/>
    <input class="submit" type="submit" value="Actualizar" />
    <input class="submit" type="reset" value="Reestablecer" />
        
    </form>
        <?php
            cerrarBD();
        ?>
    </center>

<?php  include('../footer.php');  ?>
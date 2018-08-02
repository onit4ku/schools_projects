<?php 
	include("../include/conexion.php"); conectarBD();
	include('../header.php');  
?>
<center>   
<?php 
	// Editar Contrato
	$id = $_GET['id'];
	$_SESSION['id'] = $id;
	
	$consulta = "SELECT * from contratos where id=".$id;
    $resultado = mysql_query($consulta);
    $row = mysql_fetch_array($resultado);
?>                            
    <form action="editarOk.php" class="contact_form" method="post"><br>
        <H2>Información Contratación</H2><br>
    
        <span >Fecha: </span>
   
        <input  name="fecha_contrato" value="<?php  echo $row['fecha_contrato']?>" type="date" ><br>
      
    
        <span >Cliente: </span>
    
        <select id='buscar' id="fk_cliente" name="fk_cliente" >		
        
            <option value="<?php echo $row['fk_cliente']?>">										
				<?php
					$cProv = "SELECT * from clientes where id=".$row['fk_cliente'];
    				$rProv = mysql_query($cProv);
    				$fProv = mysql_fetch_array($rProv);
    				
    				echo $fProv['empresa'];
    			?>
            </option>   
            
				<?php
					$consulProv = "SELECT * from clientes";
    				$resultProv = mysql_query($consulProv);
    				
    				while($rowProv = mysql_fetch_array($resultProv))
    				{
                ?>
                	<option value="<?php echo $rowProv['id']?>">
					<?php  echo $rowProv['empresa']?>
                    </option>
                
                <?php
    				}
                ?>
                						
			 </select><br>
            <span >Comercial: </span>
            <select id="fk_comercial" name="fk_comercial" >		
                <option value="<?php echo $row['fk_comercial']?>">										
				<?php
					$cProv = "SELECT * from comercial where id=".$row['fk_comercial'];
    				$rProv = mysql_query($cProv);
    				$fProv = mysql_fetch_array($rProv);
    				echo $fProv['nombre'];
    			?>
    			</option>   
            
				<?php
					$consulProv = "SELECT * from comercial";
    				$resultProv = mysql_query($consulProv);
    				
    				while($rowProv = mysql_fetch_array($resultProv))
    				{
                ?>
                	<option value="<?php echo $rowProv['id']?>">
					<?php  echo $rowProv['nombre']?>
                    </option>
                
                <?php
    				}
                ?>
                						
			 </select>
        
                <span >Num. Vencimientos:</span>
                <input  name="nvencimiento" value="<?php  echo $row['nvencimiento']?>" type="text" ><br>
             
                <span >IVA:</span>
                <input  name="iva" value="<?php  echo $row['iva']?>" type="text" ><br>
             
                <span >Forma de pago: </span>
                <input  name="forma_pago" value="<?php  echo $row['forma_pago']?>" type="text" ><br>
             
                <span >Cláusula de contrato:</span>
                <input  name="clausulas" value="<?php  echo $row['clausulas']?>" type="text" ><br>
                
                <input  type="submit" value="Modificar"> 
                <input type="reset"  value="Restablecer Datos">
             
               </form>
    </center>
<?php  include('../footer.php');  ?>
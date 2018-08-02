<?php 
	include("../include/conexion.php"); conectarBD();
	include('../header.php');  
?>
<center>   
<?php 
	// Editar Cliente
            $id = $_GET['id'];
            $_SESSION['id'] = $id;
            $consulta = "SELECT * from clientes where id=".$id;
            $resultado = mysql_query($consulta);
            $row = mysql_fetch_array($resultado);
        ?>                  
		
    <form action="editarOk.php" class="contact_form" method="post" name="crear">
        
            <H2>MODIFICAR CLIENTE</H2>
<br>
        
        <span >Empresa: </span>
                <input  name="empresa" value="<?php  echo $row['empresa']?>" type="text" >
                <br>
        <span >CIF/NIF:</span>      
                <input  name="cif_nif" value="<?php echo $row['cif_nif']?>" type="text" >
                <br>
        <span >Contacto: </span>       
                <input  name="contacto" value="<?php echo $row['contacto']?>" type="text" >
                <br>
        <span >Domicilio:</span>    
                <input  name="domicilio" value="<?php echo $row['domicilio']?>" type="text" >
                <br>
        
        <span>Provincia: </span>
            <select name="provincia">
                    <option value="<?php echo $row['fk_provincia']?>">
				        <?php
                            $consulPro = "SELECT * from provincias where id=".$row['fk_provincia'];
                            $resulPro = mysql_query($consulPro);
                            $rowPro = mysql_fetch_array($resulPro);
                                echo $rowPro['nombre'];
                        ?>
                    </option>
                        <?php
                            $consulta2 ="SELECT * from provincias";
                            $resultado2 = mysql_query($consulta2);
                            
                            while($row2 = mysql_fetch_array($resultado2))
                            {
                        ?>
                    <option value="<?php echo $row2['id'];?>"><?php echo $row2['nombre']?></option>
                        <?php		
                            }
                        ?>
                    </select><br>
            <tr>
				
            
           <span >Población:</span>
                <input  name="poblacion" value="<?php  echo $row['poblacion']?>" type="text" ><br>
            <span >CP:</span>
				<input  name="cp" value="<?php  echo $row['cp']?>" type="text" ><br>
             <span >Teléfono: </span>
                <input  name="telefono" value="<?php  echo $row['telefono']?>" type="text" ><br>
            <span >Fax:</span>
                  <input  name="fax" value="<?php  echo $row['fax']?>" type="text" ><br>
           <span >Móvil: </span>
                  <input  name="movil" value="<?php  echo $row['movil']?>" type="text" ><br>
              <span >Email: </span>
               <input  name="email" value="<?php echo $row['email']?>" type="text" ><br>
             <span >Fecha: Año-Mes-Dia </span>
               <input  name="fecha" value="<?php echo $row['fecha']?>" type="date" ><br>
             <span >Numero de Cuenta: </span>
                <input  name="num_cuenta" value="<?php echo $row['num_cuenta']?>" type="text" class="campotocho"><br>
           <span >Forma Pago: </span>
                <input  name="forma_pago" value="<?php echo $row['forma_pago']?>" type="text" class="campotocho"><br>
            <span >Observaciones: </span>
                <textarea  name="observaciones" ><?php echo $row['observaciones']; ?> </textarea><br>
            <input type="hidden" name="id_cliente" value="<?php echo $row['id'] ?>">
            
              <input  type="submit" class="submit"  value="Modificar"> 
               <input id="bajocrear" name="Submit2" type="reset" class="botonListar" value="Restablecer Datos">
               </form>
    			</center>
<?php  include('../footer.php');  ?>
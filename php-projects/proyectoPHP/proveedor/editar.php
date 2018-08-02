<?php 
	include("../include/conexion.php"); conectarBD();
	include('../header.php');  
?>
<center>   
<?php 
	// Editar Proveedor
	$id = $_GET['id'];
	$_SESSION['id'] = $id;
	
	$consulta = "SELECT * from proveedor where id=".$id;
    $resultado = mysql_query($consulta);
    $row = mysql_fetch_array($resultado);
?>                            
    <form action="editarOk.php" class="contact_form" method="post" enctype="multipart/form-data" name="crear"
    target="_self" id="crear"><br>
        <H2>Modificar Proveedor</H2><br>  
        
        <span >CIF/NIF:</span>      
        <input  name="cif_nif" value="<?php echo $row['cif_nif']?>" type="text" ><br>
        
        <span >Nombre: </span>       
        <input  name="nombre" value="<?php echo $row['nombre']?>" type="text" ><br>
        
        <span >Teléfono: </span>
        <input  name="telefono" value="<?php  echo $row['telefono']?>" type="text" ><br>
        
        <span >Móvil: </span>
        <input  name="movil" value="<?php  echo $row['movil']?>" type="text" ><br>
        
        <span >Fax:</span>
        <input  name="fax" value="<?php  echo $row['fax']?>" type="text" ><br>
        
        <span >Contacto: </span>       
        <input  name="contacto" value="<?php echo $row['contacto']?>" type="text" ><br>
        
        <span >Email: </span>
        <input  name="email" value="<?php echo $row['email']?>" type="text" ><br>
        
        <span >Observaciones: </span>
        <textarea  name="observaciones" ><?php echo $row['observaciones']; ?> </textarea><br>
        <input type="hidden" name="id_cliente" value="<?php echo $row['id'] ?>">
        
        <input  type="submit" value="Modificar"> 
        <input  type="reset" value="Restablecer Datos">
    </form>
    </center>

<?php  include('../footer.php');  ?>
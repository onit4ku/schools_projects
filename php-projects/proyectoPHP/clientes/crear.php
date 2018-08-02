<?php include("../include/conexion.php"); conectarBD(); ?>
<?php include('../header.php');  ?>
<center>
    <form action="crearOk.php" class="contact_form" method="post" id="crear">
        <ul>
        <li>
             <h2>Crear Cliente</h2>
        </li>
        <li>
		
        <label>Empresa: </label>
        <input  name="empresa" type="text">
           </li>
        <li>

        <label>CIF/NIF:</label>
        <input  name="cif_nif" type="text">
           </li>
        <li>

        <label >Contacto: </label>
        <input name="contacto" type="text">
           </li>
        <li>

        <label>Domicilio:</label>
        <input  name="domicilio" type="text" >
           </li>
        <li>

        <?php
        	// SQL provincias
        	$consulta = "SELECT * FROM provincias";
       		$resultado = mysql_query($consulta);
        ?>
        
        <label >Provincia: </label>
        <select id='buscar' id="id" name="provincia" >
        <option>Seleccione una provincia</option>
        <?php
			// Desplegable de provincias
			while($row = mysql_fetch_array($resultado))
				{
        ?>
        <option value="<?php  echo $row['id']?>"> 
        <?php  echo $row['nombre']?> </option>
        <?php
           		 }
        ?>
        </select>
        
           </li>
        <li>

        <label >Poblacion:</label>
        <input  name="poblacion" type="text" >
           </li>
        <li>

        <label >Cp:</label>
        <input  name="cp" type="text" >
           </li>
        <li>

        <label >Teléfono </label>
        <input  name="telefono" type="text" >
           </li>
        <li>

        <label >Fax:</label>
        <input  name="fax" type="text" >
           </li>
        <li>

        <label >Móvil: </label>
        <input  name="movil" type="text" >
        </li>
        <li>
        
        <label >Email: </label>
        <input  name="email" type="text" >
        </li>
        <li>
        
        <label >Fecha: </label>
        <input  name="fecha" type="text" placeholder="Año-Mes-Dia">
        </li>
        <li>
        
        
        <label >Nº Cuenta: </label>
        <input  name="num_cuenta" type="text">
        </li>
        <li>
        
        <label >Forma de pago: </label>
        <input  name="forma_pago" type="text">
        </li><br>
        <li>
        
        <label >Observaciones: </label>
        
        <textarea  name="observaciones" cols="40" rows="6"></textarea>
        </li>
        
        </li>
        <li>
        <button class="submit" type="submit">Crear </button>
        <button class="submit" type="reset">Borrar datos</button>
        </li>
    </form>
</center>
<?php  include('../footer.php');  ?>
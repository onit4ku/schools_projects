<?php include("../include/conexion.php"); conectarBD(); ?>
<?php include('../header.php');  ?>

<center>
    <form action="crearOk.php" class="contact_form" method="post" id="crear">
       <ul>
        <li>
            <h2>Crear Proveedor</h2>
        </li>
        <li>
        <label >CIF/NIF:</label>
        <input  name="cif_nif" type="text" ><br>
        </li>
        <li>        
        <label >Nombre: </label>
        <input  name="nombre" type="text"><br>
        </li>
        <li>       
        <label >Contacto: </label>
        <input  name="contacto" type="text"><br>
        </li>
        <li>
        <label >Teléfono </label>
        <input  name="telefono" type="text" ><br>
        </li>
        <li>
        <label >Fax:</label>
        <input  name="fax" type="text" ><br>
        
        </li>
        <li>
        <label >Móvil: </label>
        <input  name="movil" type="text">
        </li>
        <li>
        <label >Email: </label>
        <input  name="email" type="text">
        </li>
        <li>
        <label >Observaciones: </label>
        <textarea  name="observaciones" cols="40" rows="6" ></textarea>
        </li>
        <li>
        <button class="submit" type="submit">Crear </button>
        <button class="submit" type="reset">Borrar datos</button>
        </li>
        </ul>
    </form>
</center>
<?php  include('../footer.php');  ?>
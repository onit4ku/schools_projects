<?php include("../include/conexion.php"); conectarBD(); ?>
<?php include('../header.php');  ?>

<center>
    <form action="crearOk.php" class="contact_form" method="post" id="crear">
      <ul>
        <li>
            <h2>Crear Comercial</h2>
        </li>
        <li>
        <label >Nombre:</label>
        <input  name="nombre" type="text">
        </li>
        <li>
        <label >Apellido: </label>
        <input  name="apellidos" type="text" >
        </li>
        <li>
        <label >Teléfono </label>
        <input  name="telefono" type="text">
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
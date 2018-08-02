<?php 
    include('../include/conexion.php'); 
    include('../header.php'); 
?>
<br><br>
    <!--Campos de Busqueda -->
    <div class="search">
        <table id="busquedas" name="busquedas" border="0" cellpadding="5" cellspacing="0">
            <form action="listado.php" method="post">
              <tr>
                <td>
                  <select id='buscar' name='buscar' >
                    <option value='id'>Id</option>
                    <option value='cobro'>Cobro</option>
                    <option value='ffactura'>Fecha Factura</option>
                  </select></td>
                <td  align="right"><input type="text" id="clave" name="clave"  value="" placeholder="Buscar …"></td>
                <td  align="right"><input id="lupa" type="image" style="width: 20px;" src="../lupa.png" title="Buscar"></td>
              </tr>
            </form>
        </table> 
    </div><br><br>
    <form name="formRegistros" action="" method="post">
    
    
    <center>
    <table class="CSSTableGenerator">
    
    	<tr>
        	<th width="50px" scope="col">Número</th>
            <th width="150px" scope="col">Fecha</th>
            <th width="50px" scope="col">Cobro</th>
            <th width="180px" scope="col">Albaran</th>
            <th width="180px" scope="col">Herramientas</th>
        </tr>
    
     <?php 
        $buscar = "";
        $clave = "";
        $labusqueda;
        if(isset($_POST['buscar'])){
            $buscar = $_POST['buscar'];
        }

        if(isset($_POST['clave'])){
            $clave = $_POST['clave'];
        }

        if($buscar != "" && $clave != ""){
            $labusqueda = true;
        }
        else{
            $labusqueda = false;
        }

        conectarBD();
        if($labusqueda == true)
        {
            $consulta = "SELECT * from facturas where ";
            switch($buscar)
            {
                case 'id':	$consulta .= " id like '%".$clave."%'";
                                break;

                case 'cobro': $consulta .= " cobro like '%".$clave."%'";
                                 break;

                case 'ffactura': $consulta .= " fecha_factura like '%".$clave."%'";
                                 break;

            }
            $labusqueda = false;
        }
        else
        {
            $consulta = "SELECT * from facturas";

            $resultado = mysql_query($consulta);
            $cantidad = 4;
            $registros = mysql_num_rows($resultado);
            $paginas = ceil($registros/$cantidad);

            if(!isset($_GET['pag'])){
                $pag_actual = 1;
            }
            else{
                $pag_actual = $_GET['pag'];
            }

            if($pag_actual == 1){
                $desde = 0;
            }
            else{
                $desde = $pag_actual * $cantidad - $cantidad;
            }
            $consulta = $consulta." LIMIT $desde, $cantidad";
        }

        $resultado = mysql_query($consulta);
        while($row = mysql_fetch_array($resultado))
        {
    ?>
    
    	<tr>
        	<td><?php echo $row['numero']?></td>
            <td>
                <?php 
                    $date = str_replace('/', '-', $row['fecha_factura']);
                    $ffactura = date('d-m-Y', strtotime($date));
                    echo $ffactura;
                ?>
            </td>
            <td><?php echo $row['cobro']?></td>
            <td><?php echo $row['fk_albaran']?></td>

            <td> 
                <a href="editar.php?id=<?php echo $row['id']?>"> 
                    <img src="../editar1.png" title="Modificar"  border="0"></img>
                </a> 
				<a href="eliminar.php?id=<?php echo $row['id']?>"> 
				    <img src="../borrar1.png" title="Borrar" hspace="5" border="0"></img>
				</a>
        		<a href="#"> 
				    <img src="../pdf.png" title="Borrar" hspace="5" border="0"></img>
				</a>
            </td>
        </tr>    
               
        <?php
			}
			cerrarBD();
		?>
                	</table><br>
        <?php 
            if(isset($desde))
            {
                $registro_inicio = $desde + 1;
                $registro_fin = $registro_inicio + 2;

                // Mostrar registro_inicio a $registro_fin mostrados de $total_registros disponibles.
                echo "Mostrados desde el ".$registro_inicio." registro hasta el registro ".$registro_fin." de ".$registros." registros";
            }
        ?>
        <?php
			if($clave == "")
			{
	            if($pag_actual !=1 && $pag_actual != $paginas)
	            {
	               $pag_anterior = $pag_actual - 1;
	               echo "<a href='listado.php?pag=$pag_anterior'>[ < Anterior ]</a>";
	               $pag_siguiente = $pag_actual + 1;
	               echo "<a href='listado.php?pag=$pag_siguiente'>[ Siguiente > ]</a>";
	            }
	            else if($pag_actual == $paginas)
	            {
	              $pag_anterior = $pag_actual - 1;
	              echo "<a href='listado.php?pag=$pag_anterior'>[ < Anterior ]</a>";
	            }
	            else if($pag_actual ==1)
	            {
	              $pag_siguiente = $pag_actual + 1;
	              echo "<a href='listado.php?pag=$pag_siguiente'>[ Siguiente > ]</a>";
	            }
			}
		?>                
     </form>
    </center>
 <?php  include('../footer.php');  ?>
<?php 
    include('../include/conexion.php'); 
    include('../header.php'); 
    conectarBD();
?>

<br><br>
    <!--Crear compra-->
    <a id="crearCompra" href="crear.php" target="_parent">Crear Compra</a>   
    <!--Campos de Busqueda -->
    <div class="search">
        <table border="0" cellpadding="5" cellspacing="0">
            <form action="listado.php" method="post">
              <tr>
                <td>
                  <select id='buscar' name='buscar' >
						<option value="id">Id</option>
						<option value="pagado">Pagado</option>
						<option value="fecha_compra">Fecha compra</option>
                  </select></td>
                <td  align="right"><input type="text" id="clave" name="clave"  value="" placeholder="Buscar …"></td>
                <td  align="right"><input id="lupa" type="image" style="width: 20px;" src="../lupa.png" title="Buscar"></td>
              </tr>
            </form>
        </table> 
            </div><br><br>

    <form method="post">
    <center>
    <table class="CSSTableGenerator">
    
    	<tr>
        	<th width="30px" scope="col">ID</th>
            <th width="150px" scope="col">Fecha</th>
            <th width="100px" scope="col">Pagado</th>
            <th width="180px" scope="col">Número Vencimientos</th>
            <th width="120px" scope="col">Proveedor</th>
            <th width="160px" scope="col">Herramientas</th>
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

    // Generar el listado de compras con la busqueda 
                if($labusqueda == true)
                {
                    $consulta = "SELECT * from compras where ";
                    switch($buscar)
                    {
                        case 'id':	$consulta .= " id like '%".$clave."%'";
                                        break;

                        case 'pagado': $consulta .= " pagado like '%".$clave."%'";
                                         break;

                        case 'fechacompra': $consulta .= " fecha_compra like '%".$clave."%'";
                                         break;
                    }
                    $labusqueda = false;
                }
                else
                {
                    $consulta = "SELECT c.*, pr.nombre from compras c inner join proveedor pr on c.fk_proveedor = pr.id";

                    //Realizamos la busqueda
                    $resultado = mysql_query($consulta);
                    //==================== Paginacion ==================== //
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
        	<td><?php echo $row['id']?></td>
            <td>
                <?php 
                    $date = str_replace('/', '-', $row['fecha_compra']);
                    $fcompra = date('d-m-Y', strtotime($date));
                    echo $fcompra;
                ?>
            </td>
            <td><?php echo $row['pagado']?></td>
            <td><?php echo $row['num_vencimiento']?></td>
            <td><?php echo $row['nombre']?></td>
            <td> 
            <a href="editar.php?id=<?php echo $row['id']?>"> 
           		<img src="../editar1.png" title="Modificar"  border="0"></img>
				</a> 
            <a href="eliminar.php?id=<?php echo $row['id']?>"> 
				<img src="../borrar1.png" title="Borrar" hspace="5" border="0"></img>
            </a>
            <a href="detalle.php?id=<?php echo $row['id']?>"> 
				<img src="../lupa.png" title="detalle" hspace="5" border="0"></img>
            </a>
            <a href="pdfOk.php?id=<?php echo $row['id']?>"> 
				<img src="../pdf.png" title="pdf" hspace="5" border="0"></img>
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
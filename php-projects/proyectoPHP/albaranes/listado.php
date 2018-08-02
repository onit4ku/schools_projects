<?php 
    include('../include/conexion.php');
	include('../header.php');
 ?>
   <br>
   <br>
<div class="search">
    <table id="busquedas" name="busquedas" border="0" cellpadding="5" cellspacing="0">
                            <form action="listado.php" method="post">
                              <tr>
                                <td></td>
                                <td>
                                  <select id='buscar' name='buscar' >
                                    <option value="id">Id</option>
                                    <option value="facturado">Facturado</option>
                                    <option value="fecha_albaran">F.Albaran</option>
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
        	<th width="170px" scope="col">Fecha Albarán</th>
            <th width="170px" scope="col">Fecha Vencimiento</th>
            <th width="90px" scope="col">Contrato</th>
            <th width="80px" scope="col">Facturado</th>
            <th width="150px" scope="col">Herramientas</th>
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
                // Generar el listado de albaranes 
                if($labusqueda == true)
                {
                    $consulta = "SELECT * from albaranes where ";
                    switch($buscar)
                    {
                        case 'Id':	$consulta .= " id like '%".$clave."%'";
                                        break;

                        case 'Facturado': $consulta .= " facturado like '%".$clave."%'";
                                         break;

                        case 'F.Albaran': $consulta .= " fecha_albaran like '%".$clave."%'";
                                         break;

                    }
                    $labusqueda = false;
                }
                else
                {
                    $consulta = "SELECT * from albaranes";

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
        	<td>
                <?php 
                    $date = str_replace('/', '-', $row['fecha_albaran']);
                    $falbaran = date('d-m-Y', strtotime($date));
                    echo $falbaran;
                ?>
            </td>
        	<td>
                <?php 
                    $date = str_replace('/', '-', $row['fecha_vencimiento']);
                    $fvenc = date('d-m-Y', strtotime($date));
                    echo $fvenc;
                ?>
            </td>
            <td><?php echo $row['fk_contrato']?></td>
            <td><?php echo $row['facturado']?></td>
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
                    <img src="../pdf.png" title="PDF" hspace="5" border="0"></img>
                </a>
                                                                                   
                <?php
                    if($row['facturado'] != "Facturado")
                    {
                ?>
                    <a href="facturar.php?id=<?php echo $row['id']?>"><img src='../factura.png' /></a></td>
                <?php
                    }
                ?>                                                                  
                                                                                   
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
								echo "<p id='mostrados'>Mostrados desde el registro ".$registro_inicio."  hasta el registro ".$registro_fin." de ".$registros." registros</p>";
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
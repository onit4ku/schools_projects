<?php 
    include('../include/conexion.php');
	include('../header.php');
 ?>
   <br>
   <br>
<a id="crearcliente" href="../clientes/crear.php" target="_parent">Crear cliente</a>   
<div class="search">
    <table id="busquedas" name="busquedas" border="0" cellpadding="5" cellspacing="0">
                            <form action="listado.php" method="post">
                              <tr>
                                <td></td>
                                <td>
                                  <select id='buscar' name='buscar' >
                                    <option value='empresa'>Empresa</option>
                                    <option value='cif_nif'>CIF/NIF</option>
                                    <option value='cp'>CP</option>
                                    <option value='domicilio'>Domicilio</option>
                                    <option value='poblacion'>Población</option>
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
            <th width="150px" scope="col">Empresa</th>
            <th width="100px" scope="col">NIF / CIF</th>
            <th width="90px" scope="col">CP</th>
            <th width="120px" scope="col">Población</th>
            <th width="160px" scope="col">Domicilio</th>
            <th width="50px" scope="col">Generar</th>
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
        // Generar el listado de clientes 
        if($labusqueda == true)
        {
            $consulta = "SELECT * from clientes where ";
            switch($buscar)
            {
                case 'empresa':	$consulta .= " empresa like '%".$clave."%'";

                    break;

                case 'cif_nif': $consulta .= " cif_nif like '%".$clave."%'";

                    break;

                case 'cp': $consulta .= " cp like '%".$clave."%'";

                    break;

                case 'poblacion': $consulta .= " poblacion like '%".$clave."%'";

                    break;

                case 'domicilio': $consulta .= " domicilio like '%".$clave."%'";

                    break;
            }
            $labusqueda = false;
        }
        else
        {
            $consulta = "SELECT * from clientes";

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
            <td><?php echo $row['empresa']?></td>
            <td><?php echo $row['cif_nif']?></td>
            <td><?php echo $row['cp']?></td>
            <td><?php echo $row['poblacion']?></td>
            <td><?php echo $row['domicilio']?></td>
            <td>
				<a href="../dfiscales/pdfDatosOk.php?id=<?php  echo $row['id'];?>"> 
				<img src="../pdf.png" title="Generar PDF" hspace="5" border="0"></img>
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
    </center><br>
 <?php  include('../footer.php');  ?>
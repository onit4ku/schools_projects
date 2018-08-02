<?php 
    include('../include/conexion.php');
    include('../header.php');
    conectarBD();
?>
<br><br>
 <!--Crear Contrato-->
    <a href="crear.php" target="_parent">Crear Contrato</a> 
    <!--Campos de Busqueda -->
         <div class="search">

    <table border="0" cellpadding="5" cellspacing="0">
        <form action="listado.php" method="post">
          <tr>
            <td>
              <select>
                <option value="id">Id</option>
                <option value="fk_cliente">Cliente</option>
                <option value="fecha_contrato">Fecha Contrato</option>
              </select>
            </td>
            <td><input type="text" id="clave" placeholder="Buscar ..."></td>
            <td><input type="image" style="width: 20px;" src="../lupa.png"></td>
          </tr>
        </form>
    </table> 
    </div>

    <form name="formRegistros" action="" method="post">
    
    <br>
    <center>
    <table class="CSSTableGenerator">
    
    	<tr>
            <th>Id Contrato</th>
            <th>Cliente</th>
            <th>Número de Vencimientos</th>
            <th>Fecha de Contrato</th>
            <th>Herramientas</th>
        </tr>
            <?php
                $consulta = "SELECT c.*, cl.empresa from contratos c inner join clientes cl on c.fk_cliente = cl.id";
                $resultado = mysql_query($consulta);

                /*------------Paginación----------------------*/

                $cantidad = 4;
                $total_registros = mysql_num_rows($resultado);
                $num_paginas = ceil($total_registros / $cantidad);

                if(!isset($_GET['pag'])) 
                {
                    $pag_actual = 1;					
                }
                else
                {
                    $pag_actual = $_GET['pag']; 
                }

                if($pag_actual == 1)
                {
                    $desde = 0;
                }
                else
                {
                    $desde = $pag_actual * $cantidad - $cantidad;
                }

                $consulta = $consulta." LIMIT $desde,$cantidad";
                $resultado = mysql_query($consulta);		
                while($row = mysql_fetch_array($resultado))
                {
            ?>
                <tr>
                    <td><?php echo $row['id']?></td>
                    <td><?php echo $row['empresa']?></td>
                    <td><?php echo $row['nvencimiento']?></td>
                    <td><?php 
                        $date = str_replace('/', '-', $row['fecha_contrato']);
                        $fcontrato = date('d-m-Y', strtotime($date));
                        echo $fcontrato;
                        ?>
                    </td>
                     <td class="filas"><a class="linkstabla" href="eliminar.php?id=<?php  echo $row['id'];?>">
                         <img src="../borrar1.png" /></a>
                    <a class="linkstabla" href="editar.php?id=<?php  echo $row['id']; ?>">
                        <img src="../editar1.png" /> </a>
                    <a class="linkstabla" href="pdfOk.php?id=<?php  echo $row['id']; ?>">
                        <img src="../pdf.png" /> </a>
                    <a class="linkstabla" href="detalle.php?id=<?php  echo $row['id']; ?>">
                        <img src="../lupa.png" /> </a>
                    <?php
                        if($row['fk_estado'] != 0)
                        {
                    ?>
                        <a href="generarAlbaran.php?id=<?php echo $row['id']?>&num=<?php echo                                                                       $row['fk_estado']?>"><img src='../factura.png' /></a></td>
                    <?php
                        }
                    ?>
                </tr>
            <?php	
                }
            ?>
        </table>
        <br>
        <?php
            $registro_inicio = $desde + 1;
            $registro_fin = $registro_inicio + 3;

            if($pag_actual !=1 && $pag_actual != $num_paginas)
            {
                $pag_anterior = $pag_actual - 1;
                echo "<a  href='listado.php?pag=$pag_anterior'>[ < Anterior ]</a>"; 
                $pag_siguiente = $pag_actual + 1;
                echo "<a  href='listado.php?pag=$pag_siguiente'>[ Siguiente > ]</a>"; 
            }
            else if($pag_actual == $num_paginas)
            {
                if($total_registros > 4)
                {
                    $pag_anterior = $pag_actual - 1;
                    echo "<a href='listado.php?pag=$pag_anterior'>[ < Anterior ]</a>";
                }
                $registro_fin = $total_registros;
            }
            else if($pag_actual ==1)
            {
                $pag_siguiente = $pag_actual + 1;
                echo "<a  href='listado.php?pag=$pag_siguiente'>[ Siguiente > ]</a>"; 
            }

            echo "<p id='mostrados'>Mostrados desde el registro ".$registro_inicio."  hasta el registro ".$registro_fin." de ".$total_registros." registros</p>";
        ?>

        <?php
			cerrarBD();
		?>
                	</table>
     </form>
    </center>
 <?php  include('../footer.php');  ?>
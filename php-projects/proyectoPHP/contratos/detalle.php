<?php 
    include('../include/conexion.php');
    include('../header.php');

    // Detalle de contratos
    conectarBD();
    $id = $_GET['id'];

    $consulta = "SELECT * from contratos as c inner join clientes as p on c.fk_cliente  = p.id  WHERE c.id='".$id."'";
    $resultado = mysql_query($consulta);
    $row = mysql_fetch_array($resultado);

    $consulta2 = "SELECT * from contratos as c inner join comercial as p on c.fk_comercial  = p.id  WHERE c.id='".$id."'";
    $resultado2 = mysql_query($consulta2);
    $row2 = mysql_fetch_array($resultado2);
?>
<br><br>
<table  class="CSSTableGenerator" align="center">
	<tr>
		<td width="1"><strong>Fecha: </strong>
		<td align="left">
		<?php
            $date = str_replace('/', '-', $row['fecha_contrato']);
            $fcontrato = date('d-m-Y', strtotime($date));
            echo $fcontrato;
        ?>
		</td>
	</tr>
	<tr>
		<td width="1"><strong>Cliente: </strong></td>
		<td align="left"><?php  echo $row['empresa']?></td>
	</tr>
	<tr>
		<td width="1"><strong>Comercial: </strong></td>
		<td align="left"><?php echo $row2['nombre']?></td>
	</tr>
	<tr>
		<td width="1"><strong>Número de Vencimientos: </strong></td>
		<td align="left"><?php  echo $row['nvencimiento']?></td>
	</tr>
    <tr>
		<td width="1"><strong>IVA: </strong></td>
		<td align="left"><?php  echo $row['iva']?></td>
	</tr>
    <tr>
		<td width="1"><strong>Forma de pago: </strong></td>
		<td align="left"><?php  echo $row['forma_pago']?></td>
	</tr>
    <tr>
		<td width="1"><strong>Cláusula de contrato: </strong></td>
		<td align="left"><?php  echo $row['clausulas']?></td>
	</tr>
   </table>
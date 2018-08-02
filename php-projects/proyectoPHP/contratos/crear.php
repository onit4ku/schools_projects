<?php include("../include/conexion.php"); conectarBD(); ?>
<?php include('../header.php');  ?>

<center>
    <form action="crearOk.php" class="contact_form" method="post" id="crear"><br>

            <h2>Crear contrato</h2><br>

        <table>
<!--	/*CLIENTE*/		-->				
						<td><span>Cliente: </span></td>
							<td>
							    <select name="ncliente">
								<?php
									$consucliente = "SELECT * from clientes";
									$resultcliente = mysql_query($consucliente);
									while($rowcliente = mysql_fetch_array($resultcliente))
									{
								?>
									<option value="<?php echo $rowcliente['id']?>"><?php echo $rowcliente['empresa']?></option>
								<?php
									}
								?>
							    </select>
							</td>						
<!--/*FECHA CONTRATO*/	-->					
						<tr>
							<td><span>Fecha de contrato: </span></td>
							<td><input type="date" name="fcontrato"/></td>
						</tr>
						<tr>
							<td><span>Iva: </span></td>
							<td><input type="text" name="iva" /></td>
						</tr>
						
						<tr>
							<td><span>Forma de pago: </span></td>
							<td><input type="text" name="fpago"/></td>
						</tr>
						<tr>
							<td><span>NºVencimiento: </span></td>
							<td><input type="text" name="nvencimiento"/></td>
						</tr>
						<tr>
							<td><span>Clausulas: </span></td>
							<td><textarea name="clausulas" cols="20" rows="10" placeholder="Si el trabajador no está de acuerdo con el despido puede reclamar ante el juzgado del social dentro de un plazo de 20 idas siguientes a la fecha en que se haya producido ese despido. Antes de la celebración del juicio existe un acto previo de conciliación, sino se llega a ningún acuerdo se celebra un juicio que terminara mediante una sentencia. El juez califica en su sentencia el despido como procedente, improcedente ó nulo."></textarea></td>
						</tr>
						<tr>
							
						</tr>
						<tr>
							<td><span>Comercial: </span></td>
							<td>
							    <select name="ncomercial">
							   	<?php
									$consultaC = "SELECT * from comercial";
									$resultadoC = mysql_query($consultaC);
									while($rowcomercial = mysql_fetch_array($resultadoC))
									{
								?> 
									<option value="<?php echo $rowcomercial['id']?>"><?php echo $rowcomercial['nombre'] ?></option>
								<?php
									}
								?>
							    </select>
							</td>
						</tr>
					</table>
					<h2>Lineas de contrato</h2>
					<table id="lineas">
						<tr>
							<td>Proveedor</td>
							<td>Fecha Public.</td>
							<td>Concepto</td>
							<td>Importe</td>
						</tr>
						<tr id="clona0">
							<td>		
								<select name="fkproveedor0">
									<?php 
										$consulta = "SELECT * from proveedor";
										$resultado = mysql_query($consulta);
										while($row = mysql_fetch_array($resultado))
										{
									?>
											<option value="<?php echo $row['id']?>"><?php echo $row['nombre']?></option>
									<?php
										}
									?>
								</select>
							</td>
							<td>
								<input type="date" name="fechapu0" />
							</td>
							<td>		
								<textarea name="concepto0"></textarea>
							</td>
							<td>
								<input type="text" name="importe0" />
							</td>
                            
							<td>		
								<input type="button" value="Eliminar" onclick="eliminame(this)"/>
							</td>
						</tr>

					</table>
					
					<input class="boton" type="submit" value="Crear" />
					<input class="boton" type="reset" value="Borrar datos" />
                    <input type="hidden" id="nlineas" name="nlineas" value="0"/>
				</form>
				<button id="agregar">Agregar linea</button>
			</div>
		</div>
		<script>
           var clonar;
			var i = 0;
			$("#agregar").on('click', function()
			{
				if($('#clona0').length > 0)
				{
						    clonar = $('#clona0');
				}
				else 
				{
				    clonar = $('#clona' + i);
				}
				i++;
				clonar.clone().attr('id','clona'+i).insertAfter(clonar);
				
				$("#nlineas").val(i);
				
				var hijo = document.getElementById("clona"+i);
				hijo.childNodes[1].childNodes[1].setAttribute("name","fkproveedor"+i);
				hijo.childNodes[3].childNodes[1].setAttribute("name","fechapu"+i);
				hijo.childNodes[5].childNodes[1].setAttribute("name","concepto"+i);
				hijo.childNodes[7].childNodes[1].setAttribute("name","importe"+i);
			}	
			);

			function eliminame(e)
			{
				if(i == 0)
				{
					alert("No puede haber un contrato sin lineas");
				}
				else
				{				
					e.parentNode.parentNode.parentNode.removeChild(e.parentNode.parentNode);
					i--;
				}
			}			
		</script>
		

<?php  include('../footer.php');  ?>

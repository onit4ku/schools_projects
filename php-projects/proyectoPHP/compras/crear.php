<?php include("../include/conexion.php"); conectarBD(); ?>
<?php include('../header.php');  ?>

<center>
    <form action="crearOk.php" class="contact_form" method="post" id="crear">

            <h2>Crear Compra</h2>
  
        <table>			
						<td><span>Proveedor: </span></td>
							<td>
							    <select name="nproveedor">
								<?php
									$consuprov = "SELECT * from proveedor";
									$resultprov = mysql_query($consuprov);
									while($rowprov = mysql_fetch_array($resultprov))
									{
								?>
									<option value="<?php echo $rowprov['id']?>"><?php echo $rowprov['nombre']?></option>
								<?php
									}
								?>
							    </select>
							</td>											
						<tr>
							<td><span>Fecha de compra: </span></td>
							<td><input type="date" name="fcompra"/></td>
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
							<td><span>Iva: </span></td>
							<td><input type="text" name="iva" /></td>
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

					</table><br>
					
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

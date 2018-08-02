$(function()
{
	$("#calcular").click(
		function(e)
		{
			$.post("calculado.php", {variable1: $('#numero1').val(), variable2: $('#numero2').val(), variable3: $('#numero3').val(), variable4: $('#numero4').val()},
			 function(r)
			{
				$('#resultado').html('Respuesta: ' + r.result);
			}
			, 'json').error(function(e)
				{
					alert("error");
				}
			);
		}
	);
}
);

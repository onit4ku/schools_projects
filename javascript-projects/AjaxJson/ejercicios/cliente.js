    $(function(){
		$('#getData').click(
			function(e){
//THIS CODE DOES THE SAME AS THE ONE COMMENTED
				$.post("servidor.php", {variable1: $('#text1').val(), variable2: $('#text2').val()},
				function(r){
					$('#answer').html('Server answer: '+r.devuelve);
					//$(".number").click(function(){$(this).fadeIn().fadeOut("slow", arguments.callee);});
				},
				'json')
				.error(function(e){
					alert('Ocurrió un error al realizar la petición: '+e);
				});
		})
	});
/*		
	$.ajax({
	type: "POST",
	url: "servidor.php",
	data: {variable1: $('#text1').val(), variable2: $('#text2').val()},
	success: function(r){
						$('#answer').html('Server answer: '+r.devuelve);
						$(".number").click(function(){$(this).fadeIn().fadeOut("slow", arguments.callee);});
					},
	dataType: 'json'

				}
			)
		})
	});
*/

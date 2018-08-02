    $(function(){
		$('#getData').click(
			function(e){
//THIS CODE DOES THE SAME AS THE ONE COMMENTED
					$.ajax({
						type: "POST",
						url: "servidor.php",
						data: {variable1: $('#text1').val(), variable2: $('#text2').val()},
						complete: function (xhr, status) {
							if (status === 'error' || !xhr.responseText) {
								handleError();
							}
							else {
								var data = xhr.responseText;
								$('#answer').html('Server answer: '+JSON.parse(data).devuelve);
								//...
							}
						},
						dataType: 'json'

					}
				)
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

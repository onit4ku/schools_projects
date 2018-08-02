    $(function(){
		$('#getData').click(
			function(e){
//THIS CODE DOES THE SAME AS THE ONE COMMENTED
					$.ajax({
						url: "serv.txt",
						success: function (data) {
								$('#answer').html("<pre>"+data+"</pre>");
							},
						dataType: 'text'

					})
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

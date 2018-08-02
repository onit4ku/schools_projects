    $(function(){
		$('#getData').click(
			function(e){
					jsonObject = {"one": "info",
					"two": 2,
					"more": "morint"};

					// some jQuery to write to file
					$.ajax({
						type : "POST",
						url : "servidor.php",
						dataType : 'json', 
						data : {
							json : JSON.stringify(jsonObject) /* convert here only */
						}
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

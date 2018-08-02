colordefecto='red';

function pillaColor(colores) {
	colordefecto=colores.style.backgroundColor;
	document.getElementById('colorSelect').innerHTML=colordefecto;
}

pincel=true;

function pinta(e){
	if(pincel){
		e.style.backgroundColor=colordefecto;
	}
}


function activar(){
	if(pincel){
		pincel=false;
		document.getElementById('colorPincel').innerHTML="disabled";
		}
	else{
		pincel=true;
		document.getElementById('colorPincel').innerHTML="enabled";
		}	
	}



function creaTabla(){

		var ancho = document.getElementById('Ancho').value;
		var alto = document.getElementById('Alto').value;
		var tabla=document.createElement('table');
		
		tabla.setAttribute('id','lienzo');
		tabla.setAttribute('style',"border:solid black 1px;");
		
		for(var i=0;i < alto ; i++){
			columna=document.createElement('tr')
			for(var c=0; c<ancho; c++){
					td=document.createElement('td');
					td.setAttribute('onClick','activar()');
					td.setAttribute('onMouseover','pinta(this)');
					if(c==0){
						td.setAttribute('onMouseover','Fila(this)');
						td.setAttribute('id',c);
					}
					td.setAttribute('style','width:20px;height:20px;background-color:#eeeeee;');	
					columna.appendChild(td);
			}
			tabla.appendChild(columna);
	}
	document.body.appendChild(tabla);
}

function Fila(element){
		var padre=element.parentNode;
		var element=element.id;
		for(var i=padre.childNodes.length-1;0 <= i;i--){
			padre.childNodes[i].style.backgroundColor=colordefecto;
			}
	}

function Correos() {

var emails=document.getElementById('Correo').value;
	var emails_array=emails.split(',');
	
	var tabla=document.createElement('table');
	tabla.setAttribute('style',"border:solid black 1px;");
	var columna=document.createElement('tr');
	var td=document.createElement('td');
	
	td.appendChild(document.createTextNode('First Let'));
	columna.appendChild(td);
	tabla.appendChild(columna);
	
	for(var i=emails_array.length -1; 0 <= i;i--){
			nombre=emails_array[i].split('@');
			nombre=nombre[0].trim();
			nombre=nombre.split('');
			var columna=document.createElement('tr');
			var td=document.createElement('td');
			td.appendChild(document.createTextNode(nombre[1]));
			columna.appendChild(td);
			tabla.appendChild(columna);
	
	}
		document.body.appendChild(tabla);
}
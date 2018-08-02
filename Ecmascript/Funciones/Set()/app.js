console.log("=======Uso de Conjuntos: Set();==========");

let lenguajes = new Set();

lenguajes.add('php');
lenguajes.add('java');
lenguajes.add('c#');
lenguajes.add('swift');

console.log(lenguajes);

console.log("Tiene php? " + lenguajes.has('php'));

console.log("Tamaño: " + lenguajes.size);

console.log("Eliminar php: " + lenguajes.delete('php'));

console.log("Imprimir la lista: ");

lenguajes.forEach(
	(lenguaje) => console.log(lenguaje));

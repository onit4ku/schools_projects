
console.log("=======Uso de Map();==========");

let mapa = new Map(); //instancia de la clase Map();

mapa.set('nombre', 'Pikachu');
mapa.set('color', 'Amarillo');
mapa.set('tipo', 'Eléctrico');

console.log(mapa);

console.log(mapa.get('nombre'));
console.log("Tiene color? " + mapa.has('color'));
console.log("Eliminar el tipo: " + mapa.delete('tipo'));

console.log(mapa);
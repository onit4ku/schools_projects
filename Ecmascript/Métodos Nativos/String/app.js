
let mensaje = 'Ganbatte!';

console.log(mensaje.repeat(3));

//indice desde donde vamos a buscar
console.log(mensaje.startsWith('bat', 3)); //principio a fin
console.log(mensaje.endsWith('bat', 4)); //fina a principio

//buscará un valor incluido
console.log(mensaje.includes('te'));
//buscará un valor incluido desde el indice que le digamos
console.log(mensaje.includes('te',3));
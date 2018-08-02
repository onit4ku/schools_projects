const cuentas={cliente:'Ruben'};
const alimentos={nombre:'Nigiri', cantidad:4};
const bebidas={tipo:'sin alcohol', marca:'estrella galicia'};


Object.assign(cuentas,alimentos,bebidas);

console.log(cuentas);

console.log(cuentas.nombre);

console.log(cuentas.cliente);
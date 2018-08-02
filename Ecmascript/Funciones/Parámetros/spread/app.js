// funciones con parametro spread o distribuido

function comprarJuego(nombre, precio, cantidad) {
    console.log(nombre, precio, cantidad);

}

var juego = ['batman', 25.00, 2];

comprarJuego(...juego);
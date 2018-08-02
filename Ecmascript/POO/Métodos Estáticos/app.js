class Operaciones{
	static sumar(x,y){
		return x+y;
	}

	static restar(x,y){
		return x-y;
	}
}

// Dado que podemos utilizar los metodos estaticos, ya no tenemos que hacer instancias

console.log(Operaciones.sumar(10,20));
console.log(Operaciones.restar(10,20));
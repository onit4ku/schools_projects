class Persona {
    constructor(nombre, edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    getNombre() {
        return this.nombre;
    }

    getEdad() {
        return this.edad;
    }

    setNombre(nombre) {
        this.nombre = nombre;
    }

    setEdad(edad) {
        this.edad = edad;
    }

}

class Profesor extends Persona {
    constructor(nombre, edad, codigo) {
        super(nombre, edad);
        this.codigo = codigo;
    }
}

let profesor = new Profesor("Onizuka", 34, 0124);

console.log(profesor);

console.log(profesor.getNombre);
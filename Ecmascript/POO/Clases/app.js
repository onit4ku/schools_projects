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

let persona = new Persona('Ruben', 29);
persona.setEdad(30);
console.log(persona);

/**
 * Write a description of class PersonaException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

/** esta clase NO debe ser modificada */

public class PersonaException extends Exception {
    private String valor, causa;    
    
    public PersonaException (String valor, String causa) {
        this.valor = valor;
        this.causa = causa; 
    }
    
    public String toString () {
        return "-----------------------\n" +
               getClass().getName() + ": " + 
               valor + " --> " + causa;
    }
    
    public String getMessage () {
        return toString();
    }
    
}
/*Herencia
 */
package Herencia;

public class Persona {
    private String nombre; //protected para herencia 
    private String apellidos;
    private int edad;
    
    //Constructor
    public Persona(String nombre, String apelidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apelidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
    
    
}

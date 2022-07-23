
package Herencia;

public class Estudiante extends Persona{ //Herencia
    private int codigoEstudiante;
    private float notaFinal;
    
    //Constructor
    public Estudiante(String nombre, String apellidos, int edad, int codigoEstudiante, float notaFinal){
        super(nombre,apellidos,edad); //atributos ya heredados de la clase Persona 
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Mostrando los datos del estudiante..");
        System.out.println("Nombre:"+getNombre());
        System.out.println("Apellidos:"+getApellidos());
        System.out.println("Edad:"+getEdad());
        System.out.println("Codigo Estudiante:"+codigoEstudiante);
        System.out.println("Nota final:"+notaFinal);
    }
}

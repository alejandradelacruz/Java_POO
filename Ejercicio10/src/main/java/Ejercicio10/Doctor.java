/* Ejercicio 10: Crear un programa para simular un equipo de futbol (futbolista, entrenador y doctor),
para lo cual tendremos lo siguiente: 
    - Una super clase Persona, que tendrá los siguientes datos: nombre, apellido, edad.
    - La sub clase Futbolista tendrá los siguientes datos: dorsal y posición.
    - La sub clase Entrenador tendrá de dato la estrategia que utiliza.
    - La sub clase Doctor, la titulación y los años de experiencia 
Hacer un menú donde se tengan las siguientes opciones:
    - Viaje de equipo
    - Entrenamiento 
    - Partido de futbol
    - Planificar entrenamiento
    - Entrevista
    - Curar lesión
*/
package Ejercicio10;

public class Doctor extends Persona{
    private String titulacion;
    private int añosExperiencia; 

    public Doctor(String titulacion, int añosExperiencia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Da asistencia en un partido de futbol");   
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Da asistencia en un entrenamiento");
    }
    
    public void curarLesion(){
        System.out.println("Curar lesion");
    }
    
}

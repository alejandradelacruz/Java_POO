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

public class Futbolista extends Persona{
    private int dorsal;
    private String posicion; 

    public Futbolista(int dorsal, String posicion, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override //Sobre escribiendo el metodo abstracto de la clase padre
    public void partidoFutbol(){
        System.out.println("Juega el partido de futbol");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Entrena");
    }  
    
    public void entrevista(){
        System.out.println("Da una entrevista");
        
    }
    
    
    
}

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

public class Entrenador extends Persona{
    private String estrategia; 

    public Entrenador(String estrategia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    @Override
    public void partidoFutbol(){
        System.out.println("Dirige un partido de futbol");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Dirige un entrenamiento");
    }
    
    public void planificarEntrenamiento(){
        System.out.println("Planificar entrenamiento");
    }

    
    
    
    
}

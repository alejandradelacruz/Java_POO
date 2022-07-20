 /* Ejercicio 4: Construir un programa para una competencia de atletismo, el programa
 * debe gestionar una serie de atletas caracterizados por su número de atleta, nombre 
 * y tiempo de carrera, al final el programa debe mostrar los datos del atleta 
 * ganador de la carrera. 
 */

package Ejercicio4;

public class Atletas {
    //Atributos
    private int numeroAtleta;
    private String nombreAtleta;
    private float tiempo;
 
    
    //Constructor 
    public Atletas(int numeroAtleta, String nombreAtleta, float tiempo) {
        this.numeroAtleta = numeroAtleta;
        this.nombreAtleta = nombreAtleta;
        this.tiempo = tiempo;
    }
    
    //Metodo

    public float getTiempo() {
        return tiempo;
    }
    
    public String mostraDatos(){
        return "Numero:"+numeroAtleta+"\n Nombre:"+nombreAtleta+"\n tiempo:"+tiempo+"\n";        
    }   
}

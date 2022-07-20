/* Ejercicio 4: Construir un programa para una competencia de atletismo, el programa
 * debe gestionar una serie de atletas caracterizados por su número de atleta, nombre 
 * y tiempo de carrera, al final el programa debe mostrar los datos del atleta 
 * ganador de la carrera. 
 */
package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static int indiceAtletaGanador(Atletas atletas[]){
        float tiempo;
        int indice = 0 ;
        tiempo = atletas[indice].getTiempo(); 
        for(int i=1; i<atletas.length; i++){ //comienzo desde el segundo ya que el primero ya lo guarde
            if(atletas[i].getTiempo() < tiempo){
                tiempo = atletas[i].getTiempo();
                indice = i;
            }
        }
        return indice;
    }
    
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String nombreAtleta; 
        int numeroAtleta, Atleta,indiceGanador;
        float tiempo; 
        
        System.out.print("Digite la cantidad de atletas:");
        Atleta = entrada.nextInt();
        
        //Creamos los objetos para cada atleta
        Atletas atletas[] = new Atletas[Atleta];
        
        for(int i=0; i<atletas.length; i++){
            System.out.println("\n Digite los datos del atleta"+(i+1)+" : ");
            System.out.print("Introduzca el numero del atleta:");
            numeroAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Introduzca el nombre del atleta:");
            nombreAtleta = entrada.nextLine();
            System.out.print("Introduzca el tiempo de carrera:");
            tiempo = entrada.nextFloat();
            
            atletas[i] = new Atletas(numeroAtleta, nombreAtleta, tiempo);
        }
        
        indiceGanador = indiceAtletaGanador(atletas);
        System.out.println("\n ***** El atleta ganador es: *****");
        System.out.println(atletas[indiceGanador].mostraDatos());
    } 
}

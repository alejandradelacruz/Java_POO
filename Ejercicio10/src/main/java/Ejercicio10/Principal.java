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

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner entrada = new Scanner(System.in);
            
    static Persona futbolista1 = new Futbolista(9,"Delantero","Gonzalo","Higuain",29); //Polimorfismo
    static Persona futbolista2 = new Futbolista(21,"Delantero","Paulo","Dybala",23); //Polimorfismo
    static Persona entrenador = new Entrenador("Defensiva","Massimiliano","Allegri",49); //Hicimos un Upcasting
    static Persona medico = new Doctor("Licenciado en Fisioterapeuta",20,"Alex","Marroni",55);
    
    public static void main(String [] args){
        //rellenado el arreglo
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(medico);
        
        menu();
           
    }
    
    public static void menu(){
        int op;
        do{
            System.out.println("\t.:Menu:.");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de futbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesion");
            System.out.println("7. Salir");
            System.out.print("Opcion:");
            op = entrada.nextInt();
            
            switch(op){
                case 1: //Viaje de quipo 
                    System.out.println("");
                    viajarEquipo();
                    break;
                case 2: //Entrenamiento
                    System.out.println("");
                    entrenarEquipo();
                    break;
                case 3: //Partido de futbol
                    System.out.println("");
                    partidoFutbol();
                    break;
                case 4: //Planificar entrenamiento
                    System.out.println("");
                    planificarEntrenamiento();
                    break;
                case 5: //Entrevista
                    System.out.println("");
                    entrevista();
                    break;
                case 6: //Curar lesion
                    System.out.println("");
                    curarLesion();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Error se equivo de opcion de menu");
                    break;   
            }
            System.out.println("");
        }while(op != 7);
    }
    
    public static void viajarEquipo(){
        for(Persona equipo: persona){
            System.out.println(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.viajar();
        }
    }
    
    public static void entrenarEquipo(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.entrenamiento();
        }
    }
    
    public static void partidoFutbol(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.partidoFutbol();
        }
    }
    
    public static void planificarEntrenamiento(){
        System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+" -> ");
        ((Entrenador)entrenador).planificarEntrenamiento(); //Hacemos un downcasting
    }
    
    public static void entrevista(){
        System.out.println(futbolista1.getNombre()+" "+futbolista1.getApellido()+" -> ");
        ((Futbolista)futbolista1).entrevista();
         System.out.println(futbolista2.getNombre()+" "+futbolista2.getApellido()+" -> ");
        ((Futbolista)futbolista2).entrevista();
    }
    
    public static void curarLesion(){
        System.out.println(medico.getNombre()+" "+medico.getApellido()+" -> ");
        ((Doctor)medico).curarLesion();
    }
}

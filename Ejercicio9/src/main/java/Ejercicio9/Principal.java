/* Ejercicio 9: Hacer un programa para calcular el área de Poligonos (Triángulos y Rectangulos)
 * el programa debe ser capaz de almacenar un arreglo N triángulos y rectangulos, al final 
 * mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente:
    - Una super clase llamada Poligono
    - Una sub clase llamada Rectangulo
    - Una sub clase llamada Triangulo 
 */
package Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    //Creando el arreglo dinamico 
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>(); //Arreglo de poligonos dinamico
    static Scanner entrada = new Scanner(System.in);

    public static void main(String [] args){
        //Llenar un poligono  
        llenarPoligono(); 
        
        //mostrar los datos y el area de cada poligono
        mostrarResultados();
    }
    public static void llenarPoligono(){
    char respuesta;
    int opcion;
        do{
            do{
                System.out.println("Digite que poligono desea:");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.println("Opcion:");
                opcion = entrada.nextInt();
            }while(opcion<1 || opcion>2);
            
            switch(opcion){
                case 1: //Llenar un triangulo
                    llenarTriangulo();
                    break;
                case 2: //Llenar un rectangulo
                    llenarRectangulo();
                    break;
            }
            System.out.println("\nDesea introducir otro poligono(s/n)");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        }while(respuesta=='s' || respuesta == 'S');
    }
    
    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        System.out.print("Digite el lado 1 de triangulo:");
        lado1 = entrada.nextDouble();
        System.out.print("\nDigite el lado 2 de triangulo:");
        lado2 = entrada.nextDouble();
        System.out.print("\nDigite el lado 3 de triangulo:");
        lado3 = entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3); //objeto

        //Guardamos un triangulo dentro de nuestro arreglo de poligonos
        poligono.add(triangulo); //Estoy almacenado dentro de mi arreglo poligono a mi objeto triangulo
    }  
    
    public static void llenarRectangulo(){
        double lado1,lado2;
        System.out.print("\nDigite el lado 1 del rectangulo:");
        lado1 = entrada.nextDouble();
        System.out.print("\nDigite el lado 2 del rectangulo:");
        lado2 = entrada.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        poligono.add(rectangulo); //Estoy almacenado dentro de mi arreglo poligono a mi objeto rectangulo
    }
    
    public static void mostrarResultados(){
        //Recorriendo el arreglo de poligonos
        for(Poligono poli: poligono){ //buble for each
            System.out.println(poli.toString());
            System.out.println("Area= "+poli.area());
            System.out.println("");   
        }
    }
}


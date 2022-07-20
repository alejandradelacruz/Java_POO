/* 
 * Ejercicio3: Construir un programa que dada una serie de vehiculos caracterizados
 *por su marca, modelo y precio, imprima las propiedades del vehículo más barato. 
 * Para ello, se deberán leer por teclado las caracteristicas de cada vehículo y crear
 *una clase que represente a cada uno de ellos. 
 */
package Ejercicio3;

import java.util.Scanner;

public class MainEj3 {
    public static int indiceCocheMBarato(Ejercicio3 coches[]){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio(); //Le pasamos el primer precio del primer coches en precio
        for (int i=1; i<coches.length; i++){
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
    return indice;
}
    
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String marca,modelo;
        float precio;
        int numeroVehiculos, indiceBarato;
        
        System.out.print("Digite la cantidad de vehiculos:");
        numeroVehiculos = entrada.nextInt();
        
        //Creamos los objetos para los coches 
        Ejercicio3 coches[] = new Ejercicio3[numeroVehiculos];
        
        for(int i=0; i<coches.length; i++){ //.length cantidad de vehiculos
            entrada.nextLine();
            System.out.println("\n Digite las caracteristicas del coche"+(i+1)+":");
            System.out.print("Introduzca Marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca Precio: ");
            precio = entrada.nextFloat();
            
            coches[i] = new Ejercicio3(marca, modelo, precio);
        }
        
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\n El coche mas barato es:");
        System.out.println(coches[indiceBarato].mostrarDatos());     
    }
}

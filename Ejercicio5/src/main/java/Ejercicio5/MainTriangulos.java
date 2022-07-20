/* Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. 
 * Para ellos defina los atributos necesarios que se requieren, proporcione métodos 
 * de consulta, un método constructor e implemente métodos para calcular el perímetro
 * y el área de un triangulo, además implementar un método que a partir de un arreglo
 * de triángulos devuelva el área del triángulo de mayor superficie. 
 */
package Ejercicio5;

import java.util.Scanner;

public class MainTriangulos {
    public static double TrianguloMsuperficie(Triangulos triangulos[]){
        double Area;
        
        Area = triangulos[0].obtenerArea();
        for(int i=1; i<triangulos.length;i++){
            if(triangulos[i].obtenerArea() > Area){
                Area = triangulos[i].obtenerArea();
            }
        }
        return Area;
    }
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        double base,lado;
        int nTriangulos, indiceMSup;
        
        System.out.print("Digite la cantidad de triangulo:");
        nTriangulos = entrada.nextInt();
        
        //Creamos los objetos para los triangulos
        Triangulos triangulos[] = new Triangulos[nTriangulos];
        
        for(int i=0; i<triangulos.length; i++){
            entrada.nextLine();
            System.out.println("\n Digite los datos del triangulo"+(i+1)+":");
            System.out.print("Introduzca la base:");
            base = entrada.nextDouble();
            System.out.print("Introduzca la altura:");
            lado = entrada.nextDouble();
            
            triangulos[i] = new Triangulos(base, lado); 
            System.out.println("\nEl perimetro del triangulo es:"+triangulos[i].obtenerPerimetro());
            System.out.println("\nEl area del triangulo es:"+triangulos[i].obtenerArea());
        }
        System.out.println("\n El area del triangulo de mayor superficie es:"+TrianguloMsuperficie(triangulos));  
    }
}

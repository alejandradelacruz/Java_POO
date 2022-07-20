/* Ejercicio 6: Construir un programa para trabajar con 2 números compejos, implemente el siguiente menú
 * 1. Sumar dos números complejos.
 * 2. Multiplicar 2 números complejos.
 * 3. Comparar 2 números complejos (iguales o no).
 * 4. Multiplicar un número complejo por un entero 
 */
package Ejercicio6;

import java.util.Scanner;

public class MainEj6 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        /*
            numero1 = 3 + 4i
            numero2 = 2 + 5i
        */
        Complejos numero1,numero2,suma,mult;
        double a,b,c,d;
        int op,entero;
        
        do{
            System.out.println("\t.:Operaciones con Numeros complejos:.");
            System.out.println("1. Sumar dos numeros complejos");
            System.out.println("2. Multiplicar 2 numeros complejos");
            System.out.println("3. Comparar 2 numeros complejos");
            System.out.println("4. Multiplicar un numero complejo por un entero");
            System.out.println("5. Salir");
            System.out.print("Opcion:");
            op = entrada.nextInt();
        
        switch(op){
            case 1:
                System.out.println("\n Digite el primer numero complejo");
                System.out.print("Digite la parte real:");
                a = entrada.nextDouble();
                System.out.print("Digite la parte imaginaria:");
                b = entrada.nextDouble();
                System.out.println("\n Digite el segundo numero complejo");
                System.out.print("Digite la parte real:");
                c = entrada.nextDouble();
                System.out.print("Digite la parte imaginaria:");
                d = entrada.nextDouble();
                
                numero1 = new Complejos(a,b);   // numero1 = 3 + 4i
                numero2 = new Complejos(c,d);   // numero2 = 2 + 5i
                
                suma = numero1.calcularSuma(numero2);
                System.out.println("\n La suma es:"+suma.getA()+" + "+suma.getB()+"i");
                break; 
            case 2: 
                System.out.println("\n Digite el primer numero complejo");
                System.out.print("Digite la parte real:");
                a = entrada.nextDouble();
                System.out.print("Digite la parte imaginaria:");
                b = entrada.nextDouble();
                System.out.println("\n Digite el segundo numero complejo");
                System.out.print("Digite la parte real:");
                c = entrada.nextDouble();
                System.out.print("Digite la parte imaginaria:");
                d = entrada.nextDouble();
                
                numero1 = new Complejos(a,b);   // numero1 = 3 + 4i
                numero2 = new Complejos(c,d);   // numero2 = 2 + 5i
                
                mult = numero1.calcularMultiplicacion(numero2);
                System.out.println("\n La multiplicacion es:"+mult.getA()+" + "+mult.getB()+"i");
                break; 
            case 3:
                System.out.println("\n Digite el primer numero complejo");
                System.out.print("Digite la parte real:");
                a = entrada.nextDouble();
                System.out.print("Digite la parte imaginaria:");
                b = entrada.nextDouble();
                System.out.println("\n Digite el segundo numero complejo");
                System.out.print("Digite la parte real:");
                c = entrada.nextDouble();
                System.out.print("Digite la parte imaginaria:");
                d = entrada.nextDouble();
                
                numero1 = new Complejos(a,b);   // numero1 = 3 + 4i
                numero2 = new Complejos(c,d);   // numero2 = 2 + 5i
                
                if(numero1.compararComplejos(numero2)){
                    System.out.println("\n Los numeros complejos son iguales");
                }else{
                    System.out.println("\n Los numeros complejos no son iguales");
                }
                break;
            case 4: 
                System.out.println("\n Digite el primer numero complejo");
                System.out.print("Digite la parte real:");
                a = entrada.nextDouble();
                System.out.print("Digite la parte imaginaria:");
                b = entrada.nextDouble();
                System.out.print("\n Digite el numero entero:");
                entero = entrada.nextInt();
                
                numero1 = new Complejos(a,b);
                
                mult = numero1.MultiplicacionporEntero(entero);
                System.out.println("\n La multiplicacion es:"+mult.getA()+" + "+mult.getB()+"i");
                break;
        }
        System.out.println("");
        }while(op != 5);
    }
}

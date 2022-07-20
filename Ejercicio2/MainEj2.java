/* 
 * Ejercicio 2: Construir un programa que permita dirigir el movimiento de un objeto
 * dentro de un tablero y actualice su posición dentro del mismo. Los movimientos 
 * posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. Tras cada movimiento el programa
 * mostrara la nueva direccion elegida y las coordenadas de situacion del objeto dentro
 * del tablero. 
*/
package Ejercicio2;

import java.util.Scanner;

public class MainEj2 {
    public static void main (String [] args){
     
        Scanner entrada = new Scanner(System.in);
        Ejercicio2 Ej2; //clase con objeto
        int x,y;
        int op, incremento=0;
        
        System.out.print("\n Digite la coordenado inicial de X: ");
        x = entrada.nextInt();
        System.out.print("\n Digite la coordenada inicial de Y:");
        y = entrada.nextInt();
        
        //Posicion inicial del objeto
        Ej2 = new Ejercicio2(x,y);
        
        do{
            System.out.println("\n\t .:MENU:.");
            System.out.println("(1). Mover hacia ARRIBA");
            System.out.println("(2). Mover hacia ABAJO");
            System.out.println("(3). Mover hacia la DERECHA");
            System.out.println("(4). Mover hacia la IZQUIERDA");
            System.out.println("(5). salir");
            System.out.print("Digite la opcion");
            op = entrada.nextInt();
            
            if(op != 5){
                System.out.println("\n Digite la cantidad de espacios a moverse:");
                incremento = entrada.nextInt();
            }
            
            switch (op){
                case 1:
                    Ej2.moverArriba(incremento);
                    break;
                case 2:
                    Ej2.moverAbajo(incremento);
                    break;
                case 3:
                    Ej2.moverDerecha(incremento);
                    break;
                case 4:
                    Ej2.moverIzquierda(incremento);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Error, se equivoco de opcion de menu");
                    break;
            }
            System.out.println("\n Posicion actual(X,Y):("+Ej2.getX()+" , "+Ej2.getY()+")");
        }while(op!=5);   
    }
}

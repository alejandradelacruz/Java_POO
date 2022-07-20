/* 
 * Ejercicio1: Construir un programa que calcule el área y el perimetro de un
 * cuadrilátero dada la longitud de sus lados. Los valores de la longiutd deberán
 * introducirce por linea de orden. Si es un cuadrilátero, solo se proporcionara la 
 * longitud de uno de los lados del constructor. 
 */

package Ejercicio1;

import javax.swing.JOptionPane;

public class Mainej1 {
    public static void main(String[] args){
        Ejercicio1 ej1;
        float lado1,lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1"));
        
        if(lado1 == lado2){ //Es un cuadrado
            ej1 = new Ejercicio1(lado1);
        }else{
            ej1 = new Ejercicio1(lado1,lado2);
        }
        
        System.out.println("El perimetro es:"+ej1.getPerimetro());
        System.out.println("El area es:"+ej1.getArea());
    }
    
}

/* 
 * Ejercicio1: Construir un programa que calcule el área y el perimetro de un
 * cuadrilátero dada la longitud de sus lados. Los valores de la longiutd deberán
 * introducirce por linea de orden. Si es un cuadrilátero, solo se proporcionara la 
 * longitud de uno de los lados del constructor. 
 */
package Ejercicio1;

public class Ejercicio1 {
    //Atributos
    private float lado1;
    private float lado2; 
    
    //Metodo constructor 1: (Cuadrilatero)
    public Ejercicio1(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Metodo constructor1: (Cuadrado)
    public Ejercicio1(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    
    public float getPerimetro(){
      float perimetro = 2 * (lado1+lado2);
      return perimetro; 
    } 
    
    public float getArea(){
        float area = (lado1*lado2);
        return area;
    }   
}

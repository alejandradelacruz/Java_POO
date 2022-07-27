/* Ejercicio 9: Hacer un programa para calcular el área de Poligonos (Triángulos y Rectangulos)
 * el programa debe ser capaz de almacenar un arreglo N triángulos y rectangulos, al final 
 * mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente:
    - Una super clase llamada Poligono
    - Una sub clase llamada Rectangulo
    - Una sub clase llamada Triangulo 
 */
package Ejercicio9;

public class Triangulo extends Poligono{
    //Atrbutos
    private double lado1; 
    private double lado2;
    private double lado3; 
    
    //Metodos constructo4

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return "Triangulo: " +super.toString()+ "\nlado1: " + lado1 + "\nlado2: " + lado2 + "\nlado3:" + lado3;
    }
    
    @Override
    public double area(){
        double p= (lado1+lado2+lado3)/2;
        return Math.sqrt((p*(p-lado1)*(p-lado2)*(p-lado3)));
    }   
}

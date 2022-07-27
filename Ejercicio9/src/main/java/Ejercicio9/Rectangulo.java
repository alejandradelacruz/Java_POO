/* Ejercicio 9: Hacer un programa para calcular el área de Poligonos (Triángulos y Rectangulos)
 * el programa debe ser capaz de almacenar un arreglo N triángulos y rectangulos, al final 
 * mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente:
    - Una super clase llamada Poligono
    - Una sub clase llamada Rectangulo
    - Una sub clase llamada Triangulo 
 */
package Ejercicio9;

public class Rectangulo extends Poligono{
    //Atributos
    private double lado1;
    private double lado2; 
    
    //Metodo constructor 
    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo:" + super.toString() +"\nlado1: " + lado1 + "\nlado2: " + lado2;
    }
    
    @Override
    public double area(){
        return lado1 * lado2; 
    } 
}

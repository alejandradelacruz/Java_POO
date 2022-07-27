/* Ejercicio 9: Hacer un programa para calcular el área de Poligonos (Triángulos y Rectangulos)
 * el programa debe ser capaz de almacenar un arreglo N triángulos y rectangulos, al final 
 * mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente:
    - Una super clase llamada Poligono
    - Una sub clase llamada Rectangulo
    - Una sub clase llamada Triangulo 
 */
package Ejercicio9;

public abstract class Poligono {
    //Atributos
    protected int nLados; 
    
    //Metodo constructor 

    public Poligono(int nLados) {
        this.nLados = nLados;
    }
    
    //Implementacion del toString 
    @Override
    public String toString() {
        return "nLados: " + nLados;
    }  
    
    public abstract double area();
}

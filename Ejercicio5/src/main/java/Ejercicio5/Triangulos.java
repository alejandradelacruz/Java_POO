/* Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. 
 * Para ellos defina los atributos necesarios que se requieren, proporcione métodos 
 * de consulta, un método constructor e implemente métodos para calcular el perímetro
 * y el área de un triangulo, además implementar un método que a partir de un arreglo
 * de triángulos devuelva el área del triángulo de mayor superficie. 
 */
package Ejercicio5;

public class Triangulos {
    //Atributos 
    private double base; 
    private double lado; 

    public Triangulos(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double obtenerArea(){
        double Area = (base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
        return Area;
    }
    
    public double obtenerPerimetro(){
        double Perimetro = 2*lado+base;
        return Perimetro;
    } 
    
    public String mostrarDatos(){
        return "Base:"+base+"\nLado"+lado+"\nPerimetro"+obtenerPerimetro()+"\nArea"+obtenerArea()+"\n";
    }
}

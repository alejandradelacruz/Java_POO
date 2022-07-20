/* 
 * Ejercicio3: Construir un programa que dada una serie de vehiculos caracterizados
 *por su marca, modelo y precio, imprima las propiedades del vehículo más barato. 
 * Para ello, se deberán leer por teclado las caracteristicas de cada vehículo y crear
 *una clase que represente a cada uno de ellos. 
 */
package Ejercicio3;

public class Ejercicio3 {
    //Atributos
    private String marca; 
    private String modelo;
    private float precio;
    
    //Metodos
    //Constrictor
    public Ejercicio3(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return "Marca:"+marca+"\nModelo"+modelo+"\n precio $"+precio+"\n";        
    }    
}

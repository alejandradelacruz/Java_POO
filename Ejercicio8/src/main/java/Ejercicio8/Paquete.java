/* Ejercicio 8: Una empresa de envío de paquetes tiene varias sucursales en todo el país.
 * Cada sucursal esta definida por su número de sucursal, dirección y ciudad. Para calcular el
 * precio que cuesta enviar cada paquete, las sucursales tienen en cuenta el precio del paquete y la prioridad,
 * sabiendo que se cobra un dólar por kilo, 10 dorales más si la prioridad es alta y 20 si es espress.
 * Cada paquete enviado tendrá un número de referencia y el DNI de la persona que lo envía. 
 */
package Ejercicio8;

public class Paquete {
    private int numeroReferencia; 
    private String DNI;
    private double peso;
    private int prioridad; 
    
    //Método constructor

    public Paquete(int numeroReferencia, String DNI, double peso, int prioridad) {
        this.numeroReferencia = numeroReferencia;
        this.DNI = DNI;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumeroReferencia() {
        return numeroReferencia;
    }

    public String getDNI() {
        return DNI;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }
    
    public String mostrarDatosPaquete(){
        return "Numero paquete:+"+numeroReferencia+"\nDNI:"+DNI+"\nPeso:"+peso+"\nPrioridad:"+prioridad;
    }
    
    
}

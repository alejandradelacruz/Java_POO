/* Ejercicio 8: Una empresa de envío de paquetes tiene varias sucursales en todo el país.
 * Cada sucursal esta definida por su número de sucursal, dirección y ciudad. Para calcular el
 * precio que cuesta enviar cada paquete, las sucursales tienen en cuenta el precio del paquete y la prioridad,
 * sabiendo que se cobra un dólar por kilo, 10 dorales más si la prioridad es alta y 20 si es espress.
 * Cada paquete enviado tendrá un número de referencia y el DNI de la persona que lo envía. 
 */
package Ejercicio8;

public class Sucursal {
    //Atributos
    private int numeroSucursal;
    private String direccion;
    private String ciudad; 
    
    //Metodo constructor 
    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public String mostrarDatosSucursal(){
        return "Numero sucursal:"+numeroSucursal+"\nDireccion:"+direccion+"\nCiudad:"+ciudad;
    }
    
    public double calcular_precio(Paquete t){
        double precio;
        precio = t.getPeso(); //peso incial
        if(t.getPrioridad() == 1){
            precio += 10;
        }
        if(t.getPrioridad() == 2){
            precio += 20;
        }
        return precio;
    }
}

/* Ejercicio 7: Hacer un programa sencillo para realizar gestiones en un banco para lo cual 
 * tendremos 2 cases (Cliente y Cuenta). Considerar que un cliente se caracteriza por su nombre
 * apellido y DNI. El cliente puede consultar saldo, asi como ingresar y retirar dinero 
 * de sus cuentas. Ademas cada cuenta se caracteriza por un numero de cuenta y saldo 
 */
package Ejercicio7;

public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    private Cuenta cuenta[]; //arreglo de objeto de la Clase cuenta
    
    //Creamos el constructor

    public Cliente(String nombre, String apellido, String DNI, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.cuenta = cuentas;
    }
    

    public String getNombre() { //para mandar el nombre
        return nombre;
    }

    public String getApellido() { //para mandar el apellido
        return apellido;
    }

    public String getDNI() { //para mandar el DNI
        return DNI;
    }
    
    public double consultarSaldo(int n){ //n-> indice a cuenta, a que cuenta quiero consultar saldo
        return cuenta[n].getSaldo();
    }
    
    public void ingresarDinero(int n, double cantidad){
        cuenta[n].ingresarDinero(cantidad);
    }
    
    public void retirarDinero(int n, double cantidad){
        cuenta[n].retirarDinero(cantidad);
    }
}

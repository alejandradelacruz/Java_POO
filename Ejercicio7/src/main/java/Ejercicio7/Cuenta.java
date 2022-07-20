/* Ejercicio 7: Hacer un programa sencillo para realizar gestiones en un banco para lo cual 
 * tendremos 2 cases (Cliente y Cuenta). Considerar que un cliente se caracteriza por su nombre
 * apellido y DNI. El cliente puede consultar saldo, asi como ingresar y retirar dinero 
 * de sus cuentas. Ademas cada cuenta se caracteriza por un numero de cuenta y saldo 
 */
package Ejercicio7;

public class Cuenta {
    private int numeroCuenta;
    private double saldo; 
    
    //Creamos el constructor
    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void ingresarDinero(double cantidad){ //no retorna nada porque solo voy a modificar
        saldo += cantidad;
    }
    
    public void retirarDinero(double cantidad){
        saldo -= cantidad;
    }
    
    
}

/* Ejercicio 7: Hacer un programa sencillo para realizar gestiones en un banco para lo cual 
 * tendremos 2 cases (Cliente y Cuenta). Considerar que un cliente se caracteriza por su nombre
 * apellido y DNI. El cliente puede consultar saldo, asi como ingresar y retirar dinero 
 * de sus cuentas. Ademas cada cuenta se caracteriza por un numero de cuenta y saldo 
 */
package Ejercicio7;

import java.util.Scanner;

public class MainEj7 {
        
        //metodo para hacerla busqueda de todas las cuentas 
        public static int buscarNumeroCuenta(Cuenta cuentas[], int n){
            int i=0,indice=0;
            boolean encontrado = false; 
            
            //Busqueda secuencial
            while((i<cuentas.length) && (encontrado==false)){
                if(cuentas[i].getNumeroCuenta() == n){
                    encontrado = true;
                    indice = i;
                }
                i++;
            }
            if(encontrado == false){
                indice = -1;
            }
            return indice;
        }
        
        public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String nombre,apellido,DNI;
        int numeroCuenta,nCuentas, op,indiceCuenta;
        double saldo,cantidad;
        
        //Creamos los objetos
        Cuenta cuentas[];
        Cliente cliente; //utilizamos un solo cliente
        
        System.out.print("Digite el nombre del cliente:");
        nombre = entrada.nextLine();
        System.out.print("Digite el apellido del cliente:");
        apellido = entrada.nextLine();
        System.out.print("Digite el DNI del cliente:");
        DNI = entrada.nextLine();
        System.out.print("Digite cuantas cuentas tiene:");
        nCuentas = entrada.nextInt();
        
        cuentas = new Cuenta[nCuentas]; 
        
        for(int i=0; i<cuentas.length; i++){
            System.out.println("\nDigite los datos para la cuenta:"+(i+1));
            System.out.print("\nDigite el numero de cuenta");
            numeroCuenta = entrada.nextInt();
            System.out.print("\n Digite el saldo de la cuenta");
            saldo = entrada.nextDouble();
            
            cuentas[i] = new Cuenta(numeroCuenta,saldo);
        }
        
        cliente = new Cliente(nombre, apellido, DNI, cuentas); //inicializar
            do{
                System.out.println("\t.:MENU:.");
                System.out.println("1. Ingresar dinero en la cuenta");
                System.out.println("2. Retirar dinero de la cuenta");
                System.out.println("3. Consultar saldo de la cuenta");
                System.out.println("4. Sair"); 
                System.out.print("Opcion:");
                op = entrada.nextInt();
                
                switch(op){
                    case 1:
                        System.out.print("\nDigite el numero de cuenta:");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                        
                        if(indiceCuenta ==-1){
                            System.out.println("\nEl numero de cuenta ingresado no existe");
                        }else{
                            System.out.print("\nDigite la cantidad de dinero a ingresar $:");
                            cantidad = entrada.nextDouble();
                            
                            cliente.ingresarDinero(indiceCuenta, cantidad);
                            System.out.println("\nIngreso realizado correctamente");
                            System.out.println("Saldo disponible:"+cliente.consultarSaldo(indiceCuenta));
                        }
                        break;
                    case 2:
                        System.out.print("\nDigite el numero de cuenta:");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                        
                        if(indiceCuenta ==-1){
                            System.out.println("\nEl numero de cuenta ingresado no existe");
                        }else{
                            System.out.print("\nDigite la cantidad de dinero a retirar $:");
                            cantidad = entrada.nextDouble();
                            
                            if(cantidad>cliente.consultarSaldo(indiceCuenta)){
                                System.out.println("\nSaldo insuficiente");
                            }else{
                                cliente.retirarDinero(indiceCuenta, cantidad);
                                System.out.println("\nRetirorealizado correctamente");
                                System.out.println("Saldo disponible:"+cliente.consultarSaldo(indiceCuenta));  
                            }
                        }
                        break;
                    case 3: 
                        System.out.print("\nDigite el numero de cuenta:");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                        
                        if(indiceCuenta ==-1){
                            System.out.println("\nEl numero de cuenta ingresado no existe");
                        }else{
                            System.out.println("Saldo disponible:"+cliente.consultarSaldo(indiceCuenta));
                        }
                        break;
                    case 4:
                        break;
                        }
                        System.out.println("");
            }while(op != 4);   
    }  
}

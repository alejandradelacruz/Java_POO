/* Ejercicio 8: Una empresa de envío de paquetes tiene varias sucursales en todo el país.
 * Cada sucursal esta definida por su número de sucursal, dirección y ciudad. Para calcular el
 * precio que cuesta enviar cada paquete, las sucursales tienen en cuenta el precio del paquete y la prioridad,
 * sabiendo que se cobra un dólar por kilo, 10 dorales más si la prioridad es alta y 20 si es espress.
 * Cada paquete enviado tendrá un número de referencia y el DNI de la persona que lo envía. 
 */
package Ejercicio8;

import java.util.Scanner;

public class MainEj8 {
    
    public static int buscarSucursal(Sucursal s[], int numeroSucursal, int contadorSucursal){
        int indice = 0;
        boolean encontrado = false;
        
        for(int i=0; i<contadorSucursal; i++){
            if(s[i].getNumeroSucursal() == numeroSucursal){
                encontrado = true;
                indice = i;
            }
        }
        if(encontrado == false){
            indice = -1;
        }
        return indice; 
    }
    
        public static int buscarPaquete(Paquete p[], int numeroPaquete, int contadorPaquete){
        int indice = 0;
        boolean encontrado = false;
        
        for(int i=0; i<contadorPaquete; i++){
            if(p[i].getNumeroReferencia() == numeroPaquete){
                encontrado = true;
                indice = i;
            }
        }
        if(encontrado == false){
            indice = -1;
        }
        return indice; 
    }
    
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        
        int numeroSucursal, numeroReferencia, prioridad, op;
        int contadorSucursal = 0, contadorPaquete = 0, indiceSucursal = 0, indicePaquete = 0; 
        String direccion, ciudad, DNI;
        double peso, precioPaquete;
        Sucursal sucursal[] = new Sucursal[50];
        Paquete paquete[] = new Paquete[100];
        
        do{
            System.out.println("\t.:MENU:.");
            System.out.println("1. Crear una nueva sucursal");
            System.out.println("2. Enviar paquete");
            System.out.println("3. Consultar sucursal");
            System.out.println("4. Consultar paquete");
            System.out.println("5. Mostrar todas las sucursales");
            System.out.println("6. Mostrar todos los paquetes");
            System.out.println("7. Salir");
            System.out.print("Digite una opcion:");
            op = entrada.nextInt();
            
            switch(op){
                case 1:
                    System.out.print("\n Digite el numero de sucursal:");
                    numeroSucursal = entrada.nextInt();
                    entrada.nextLine(); //Limpiar buffer
                    System.out.print("Digite la direccion:");
                    direccion = entrada.nextLine();
                    System.out.print("Digite la ciudad:");
                    ciudad = entrada.nextLine();
                    
                    sucursal[contadorSucursal] = new Sucursal(numeroSucursal,direccion,ciudad); 
                    break;
                case 2: 
                    if(indiceSucursal == -1){
                        System.out.println(" La sucursal NO existe");
                    }else{
                        System.out.print("\nDigite el numero de paquete:");
                        numeroReferencia = entrada.nextInt();
                        System.out.print("Digite el DNI de la persona:");
                        DNI = entrada.nextLine();
                        System.out.print("Digite el peso del paquete:");
                        peso = entrada.nextDouble();
                        System.out.print("Digite la prioridad (0=Normal, 1=alta, 2=express):");
                        prioridad = entrada.nextInt();
                        
                        paquete[contadorPaquete] = new Paquete(numeroReferencia, DNI, peso, prioridad); 
                        
                        precioPaquete = sucursal[indiceSucursal].calcular_precio(paquete[contadorPaquete]);
                        
                        System.out.println("\nEl precio es: $"+precioPaquete);
                        contadorPaquete++;
                        break;
                    }
                case 3:
                    System.out.print("\nDigite el numero de sucursal:");
                    numeroSucursal = entrada.nextInt();
                    
                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
                    
                    if(indiceSucursal ==-1){
                        System.out.println("La sucursal NO existe");
                    }else{
                        System.out.println("\nLos datos de la sucursal son: ");
                        System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
                    }
                    break;
                case 4: 
                    System.out.print("\nDigite el numero de paquete:");
                    numeroReferencia = entrada.nextInt();
                    
                    indicePaquete = buscarPaquete(paquete, numeroReferencia, contadorPaquete);
                    
                    if(indicePaquete ==-1){
                        System.out.println("El paquete NO existe");
                    }else{
                        System.out.println("\nLos datos del paquete son: ");
                        System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
                    }
                    break;
                case 5: 
                    for(int i=0; i<contadorSucursal;i++){
                        System.out.println("\nLos datos de la sucursal N°"+(i+1)+":");
                        System.out.println(sucursal[i].mostrarDatosSucursal());
                    }
                    break; 
                case 6: 
                    for(int i=0; i<contadorPaquete;i++){
                        System.out.println("\nLos datos del paquete N°"+(i+1)+":");
                        System.out.println(paquete[i].mostrarDatosPaquete());
                    }
                    break;
                case 7:
                    break;
            }
        }while(op != 7);
    }
    
}

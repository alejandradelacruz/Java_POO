//throw -> para hacer excepciones para que nosotros queramos, java no las tiene
package Java.TratamientoExcepciones;

import java.util.Scanner;

public class throwprueba {

    //Si el usuario digita cero mandamos una excepcion
    private int numero;
    private Scanner entrada = new Scanner(System.in);

    public void introducirNumeros() throws excepcioncero{
        //throws -> declara las excepciones del tipo tal
        do{
            System.out.print("Digite un numero:");
            numero = entrada.nextInt();

            if(numero == 0){ //Quiero que se produzca una excepcion personalizada
                throw new excepcioncero(); //lanza una excepcion de tipo tal
            }

        }while(numero != 0 && numero !=1);
    }

    public static void main(String [] args) {

        throwprueba prueba = new throwprueba();
        try{
            prueba.introducirNumeros();
        }catch(excepcioncero ex){
            System.out.println("Ha introducido el numero 0");
        }
        System.out.println("Programa terminado");
    } 
}

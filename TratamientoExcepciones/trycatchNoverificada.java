//try catch para excepciones NO verificadas del tipo derivan del runTimeExcepcion (no te obliga a que las captures o corrigas)

package Java.TratamientoExcepciones;

import javax.swing.JOptionPane;

public class trycatchNoverificada {

    public void operaciones(){
        int num1 = 5, num2 =0;
        
        int resultado = num1/num2;
        System.out.println(resultado);
    }

    public void operaciones2(){
        try{
            operaciones();
        }catch(ArithmeticException a){
            JOptionPane.showMessageDialog(null, "Error, ha intendo dividir un numero entre 0");
        }
        System.out.println("Programa terminado");
    }

    public static void main(String [] args){

        trycatchNoverificada prueba = new trycatchNoverificada();

        prueba.operaciones2();
    }
    
}


//try catch para excepciones verificadas del tipo IOException
package Java.TratamientoExcepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class trycatchVerificada {
    
    public void leerArchivo() throws FileNotFoundException,IOException {
        //twrows -> se utiliza para declarar excepciones de un metodo cuando no queremos evitar el metodo 
        File archivo = new File ("C:\\Users\\User\\Desktop\\AyED\\Java\\TratamientoExcepciones\\texto.txt");
        FileReader fr = new FileReader(archivo);  
        BufferedReader bf = new BufferedReader(fr);
        String linea; 

        while((linea = bf.readLine()) != null){
            System.out.println(linea);
        }
    }

    public void leerArchivo2() {
        try{
            leerArchivo();
        }catch(FileNotFoundException ex){ //captura la excepcion del tipo (tipo)
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo deseado, por favor verifique la ruta");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada");
        }finally{
            //se va a ejecutar si el try es exitoso o si no 
            //Se ejecuta siempre
        }
        
        System.out.println("Programa terminado");
    }

    public static void main(String [] args){
        trycatchVerificada prueba = new trycatchVerificada();

        prueba.leerArchivo2();
    }
    
}

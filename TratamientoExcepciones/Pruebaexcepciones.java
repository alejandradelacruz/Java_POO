//Declaracion de las excepciones de un métodos

package Java.TratamientoExcepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pruebaexcepciones{

    public void leerArchivo() throws FileNotFoundException{
        //twrows -> se utiliza para declarar excepciones de un metodo cuando no queremos evitar el metodo 
        File archivo = new File ("C:\\Users\\User\\Desktop\\AyED\\Java\\TratamientoExcepciones\\texto.txt");
        FileReader fr = new FileReader(archivo);  
    }

    public void leerArchivo2() throws IOException{
        leerArchivo();
    }

    public static void main(String [] args){
    }
} 
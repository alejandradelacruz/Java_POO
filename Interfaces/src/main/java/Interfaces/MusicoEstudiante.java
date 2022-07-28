
package Interfaces;

public class MusicoEstudiante implements Musico,Estudiante{ //Para heredar mas de una sub clase
    
    @Override //Sobre escribiendo el metodo
    public void hablar(){ //De la clase Persona
        System.out.println("Estoy hablando español");
    }
    
    @Override //Sobre escribiendo el metodo
    public void tocarMusica(){ //De la clase Musica
        System.out.println("Estoy tocando la guitarra");
    }
    
    @Override //Sobre escribiendo el metodo
    public void estudiar(){ //De la clase Estudiante
        System.out.println("Estoy estudiando programacio");
    } 
}

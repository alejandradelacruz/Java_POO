//Polimorfimos
package Polimorfismo;

public class Vehiculo {
    //Atributos
    protected String matricula;
    protected String marca;
    protected String modelo; 
    
    //Metodo constructor
    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public String mostrarDatos(){
        return "Matricula:"+matricula+"\nmarca:"+marca+"\nmodelo:"+modelo;
    }
    
    
    
}

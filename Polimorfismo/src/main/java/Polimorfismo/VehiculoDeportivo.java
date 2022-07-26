
package Polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
  private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    
    @Override //sobre escribir los datos
    public String mostrarDatos(){
        return "Matricula:"+matricula+"\nmarca:"+marca+"\nmodelo:"+modelo+"\nNumero de cilindradas:"+cilindrada;
    }  
}

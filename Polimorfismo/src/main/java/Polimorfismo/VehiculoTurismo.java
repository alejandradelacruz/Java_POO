
package Polimorfismo;

public class VehiculoTurismo extends Vehiculo {
    private int nPuertas;

    public VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
        super(matricula,marca,modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }
    
    @Override //sobre escribir los datos
    public String mostrarDatos(){
        return "Matricula:"+matricula+"\nmarca:"+marca+"\nmodelo:"+modelo+"\nNumero de puertas:"+nPuertas;
    }    
}

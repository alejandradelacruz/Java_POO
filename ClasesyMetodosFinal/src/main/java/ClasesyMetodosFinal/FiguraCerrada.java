
package ClasesyMetodosFinal;

//clase tipo final (no puedes heredar ningun hijo de esa clase)
public class FiguraCerrada extends Figura{
    private int nLados;

    public FiguraCerrada(int nLados, double tamaño) {
        super(tamaño);
        this.nLados = nLados;
    }
    
    //Metodo de tipo final (no puede existir un metodo con el mismo nombre de subclases que salga de esta)
    public void dibujar(){
        System.out.println("Dibujo de la figura cerrada");
    }
}

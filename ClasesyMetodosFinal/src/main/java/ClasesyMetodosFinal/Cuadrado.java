
package ClasesyMetodosFinal;

public class Cuadrado extends FiguraCerrada{
    private double area;

    public Cuadrado(double area, int nLados, double tamaño) {
        super(nLados, tamaño);
        this.area = area;
    }
    
    public void dibujar(){
        System.out.println("Dibujados un cuadrado");
    }
    
}

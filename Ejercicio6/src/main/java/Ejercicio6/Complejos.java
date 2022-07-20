/* Ejercicio 6: Construir un programa para trabajar con 2 números compejos, implemente el siguiente menú
 * 1. Sumar dos números complejos.
 * 2. Multiplicar 2 números complejos.
 * 3. Comparar 2 números complejos (iguales o no).
 * 4. Multiplicar un número complejo por un entero 
 */
package Ejercicio6;

public class Complejos {
    
    //Ejemplo de un numero complejo: 3 + 4i (una parte real y una imaginaria)
    
    private double a; //Para la parte real 
    private double b; //Para la parte imaginaria 
    
    //Creamos el constructor llamado complejo 
    public Complejos(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    //Creamos el getA para la parte real 
    public double getA() {
        return a;
    }
    
    //Creamos el getB para la parte imaginaria 
    public double getB() {
        return b;
    }
    
    /*
            :SUMA DE DOS NUMEROS COMPLEJOS
            numero1 = 3 + 4i
            numero2 = 2 + 6i
    
            suma = 5 + 9i
    
            Complejos numero1 = new Compeljos(3,4);
            numero1.calcularSuma(numero2); 
    */
    
    //Creamos los metodos de nuestro menú
    public Complejos calcularSuma (Complejos c){ //retorna un numeroComplejo
        Complejos suma = new Complejos(a+c.getA(),b+c.getB()); //Me va a devolver un numeroComplejo
        return suma; 
    }
    
    /*
            :MULTIPLICAR DOS NUMEROS COMPLEJOS
            numero1 = 3 + 4i
            numero2 = 2 + 5i
    
            mult = (3*2 - 4*5) + (3*5 + 4*2)i
    */
    
    public Complejos calcularMultiplicacion(Complejos c){
        Complejos mult = new Complejos((a*c.getA()- b*c.getB()),(a*c.getB() + b*c.getA()));
        return mult; 
    }
    
    /*
            : COMPARAR DOS NUMEROS COMPLEJOS :
            numero1 = 3 + 4i
            numero2 = 2 + 5i
    */
    
    public boolean compararComplejos(Complejos c){
        boolean Igualdad = false;
        if ((a==c.getA()) && (b==c.getB())){
            Igualdad = true;
        }
        return Igualdad;
    }
    
    /*
            :MULTIPLICAR UN NUMERO ENTERO CON UN COMPLEJO
            numero1 = 3 + 4I
            nENTERO = 2:
    
            mult = 6 + 8i
     */ 
    
    public Complejos MultiplicacionporEntero(int entero){
        Complejos mult = new Complejos(a*entero,b*entero);
        return mult; 
    }    
}

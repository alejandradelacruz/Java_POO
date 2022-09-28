/*                        ------------- GESTION AEROPORTUARIA ----------------------
    Diseñar y codificar una aplicacion informatica para una compañia de gestion aeroportuaria satisfaciendo
    los siguientes requisitos: 
    * Para cada aeropuerto es necesario saber: 
        a) Todas las compañias de vuelos que operan en el.
        b) Nombre del aeropuerto, la ciudad donde se ubica y el pais al que pertence.
    * Cada compañia se caracteriza por el nombre y la lista de vuelos que ofrece.
    * Los vuelos estan definidos por su identificador la ciudad de origen, la ciudad de destino, el precio del viaje,
    la lista de pasajeros, el numero maximo de pasajeros permitidos en el vuelo y el numero real de pasajeros que ha 
    reservado asiento en el avion. 
    * Los aeropuerts pueden ser privados o publicos.
        a) Los aeropuertos privados tienen serie de empresas que los patrocinan y es necesario saber el nombre de
        cada una de esas empresas.
        b) Para los aeropuertos publicos se requiere saber la cantidad de dinero correspondiente a la subvencion guebernamental.
    * Se necesita gestionar tambien la informacion de los pasajeros.
        a) Para cada pasajero se necesita saber nombre, numero de pasaporte y nacionalidad. 
*/  
package Proyecto_Aeropuerto;

public class Vuelo {
    //Encapsulamiento
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino; 
    private double precio; 
    private int numMaxPasajeros; 
    private int numActPasajeros; 
    private Pasajero listaPasajeros[]; //arreglo de objetos de tipo Pasajero

    //Metodo constructor
    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActPasajeros = 0; //inicializar un vuelo en 0 (para insertar)
        this.listaPasajeros = new Pasajero[numMaxPasajeros]; //Para indicar el numero maximo de pasajeros 
    }
    
    //El usuario me va a enviar un pasajero y yo lo voy a enviar a "pasajero" dentro del arreglo de listaPasajero
    //El "numActPasajeros" lo voy a utilizar como iterador 
    public void insertarPasajero(Pasajero pasajero){
        listaPasajeros[numActPasajeros] = pasajero; 
        numActPasajeros++;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActPasajeros() {
        return numActPasajeros;
    }
    
    //Metodo para obtener un solo pasajero "SOLO UNO" 
    //(1). Opcion 
    public Pasajero getPasajero(int i){
        return listaPasajeros[i];
    }
    
    //(2). Opcion
    public Pasajero getPasajero(String pasaporte){
        boolean encontrado = false; 
        int i=0;
        Pasajero pas=null; 
        //Busqueda secuencial
        while((encontrado == false) && (i<listaPasajeros.length)){
            //if(pasaporte.equals(listaPasajeros[i].getPasaporte());
            if(pasaporte == listaPasajeros[i].getPasaporte()){
                encontrado = true; 
                pas = listaPasajeros[i];
            }
            i++;
            }
            return pas;
        }   
}

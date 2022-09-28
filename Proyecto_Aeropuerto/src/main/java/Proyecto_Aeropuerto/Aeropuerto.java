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

public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String pais; 
    private Compañia listaCompañias[] = new Compañia[10];
    private int numCompañia; 

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais; 
        this.numCompañia = 0; 
    }
    
    public Aeropuerto(String nombre, String ciudad, String pais, Compañia c[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais; 
        listaCompañias = c;
        this.numCompañia = c.length; 
    }
    
    public void insertarCompañia(Compañia compañia){
        listaCompañias[numCompañia] = compañia; 
        numCompañia++; 
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Compañia[] getListaCompañias() {
        return listaCompañias;
    }

    public int getNumCompañia() {
        return numCompañia;
    }
    
    public Compañia getCompañia(int i){
        return listaCompañias[i];
    }
    
    public Compañia getCompañia(String nombre){
        boolean encontrado = false;
        int i=0;
        Compañia c = null; 
        while((!encontrado) && (i<listaCompañias.length)){
            if(nombre.equals(listaCompañias[i].getNombre())){
                encontrado=true;
                c=listaCompañias[i];
            }
            i++;
        }
        return c;
    }
}

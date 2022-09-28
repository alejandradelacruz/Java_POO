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

public class AeropuertoPublico extends Aeropuerto{
    private double subvencion;

    public AeropuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPublico(double subvencion, String nombre, String ciudad, String pais, Compañia[] c) {
        super(nombre, ciudad, pais, c);
        this.subvencion = subvencion;
    }

    public AeropuertoPublico(double subvencion, String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }

    public double getSubvencion() {
        return subvencion;
    }
}

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Ciudades iteraCiudades = new Ciudades();
        iteraCiudades.agregarCiudades();
        ArrayList<Ciudad> listaCiudades = iteraCiudades.obtenerListado();

        System.out.println("Implementando Iterador desde un Arraylist");

        while (iteraCiudades.hayMas()){
            Ciudad ciudad = (Ciudad) iteraCiudades.siguiente();
            System.out.println("Ciudad: " + ciudad.getNombre());
        }

        System.out.println("***************************");
        System.out.println();

        System.out.println("Implementando iterador desde HashMap");
        Paises iteraPaises = new Paises();
        iteraPaises.agregarPaises();
        iteraPaises.Prueba();
        HashMap<Integer, Pais> paises = iteraPaises.obtenerListado();

        while (iteraPaises.hayMas()){
            Pais pais = (Pais) iteraPaises.siguiente();
            System.out.println("Pais: " +  pais.getNombre());
        }
    }
}

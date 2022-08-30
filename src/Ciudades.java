import java.util.ArrayList;

public class Ciudades implements IIteraUbicacion{

    private ArrayList<Ciudad> ciudades = new ArrayList<>();
    private int contador;

    public void agregarCiudades(){
        ciudades.add(new Ciudad("Abejorral"));
        ciudades.add(new Ciudad("Abriaquí"));
        ciudades.add(new Ciudad("Acandí"));
        ciudades.add(new Ciudad("Achí"));
        ciudades.add(new Ciudad("Agua De Dios"));
        ciudades.add(new Ciudad("Aguachica"));
        ciudades.add(new Ciudad("Aguadas"));
        ciudades.add(new Ciudad("Aguazul"));
        ciudades.add(new Ciudad("Agustín Codazzi"));
        ciudades.add(new Ciudad("Albán"));
        ciudades.add(new Ciudad("Albania"));
    }

    public ArrayList<Ciudad> obtenerListado(){
        return ciudades;
    }
    @Override
    public boolean hayMas() {
        return contador < ciudades.size();
    }
    @Override
    public void restaura() {
        contador = 0;
    }

    @Override
    public Ubicacion siguiente() {
        Ciudad ciudad = ciudades.get(contador);
        contador += 1;
        return ciudad;
    }
}

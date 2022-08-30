import java.util.HashMap;

public class Paises implements IIteraUbicacion{

    private HashMap<Integer,Pais> paises = new HashMap<>();
    private int contador = 1;

    public void agregarPaises(){
        paises.put(1,new Pais("Andorra"));
        paises.put(2,new Pais("Emiratos Árabes Unidos"));
        paises.put(3,new Pais("Afganistán"));
        paises.put(4,new Pais("Antigua y Barbuda"));
        paises.put(5,new Pais("Anguila"));
        paises.put(6,new Pais("Albania"));
        paises.put(7,new Pais("Armenia"));
        paises.put(8,new Pais("Antillas Holandesas"));
        paises.put(9,new Pais("Angola"));
        paises.put(10,new Pais("Antártida"));
    }

    public void Prueba(){
        for(Pais pais:paises.values()){
            System.out.println(pais.getNombre());
        }
    }
    public HashMap<Integer,Pais> obtenerListado(){
        return paises;
    }
    @Override
    public boolean hayMas() {
        return contador < paises.size();
    }

    @Override
    public void restaura() {
        contador = 1;
    }

    @Override
    public Ubicacion siguiente() {
        Pais pais = paises.get(contador);
        contador += 1;
        return pais;
    }
}

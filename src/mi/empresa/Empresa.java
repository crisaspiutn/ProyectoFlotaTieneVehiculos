package mi.empresa;

import java.util.ArrayList;

import mi.vehiculos.Flota;

public class Empresa{
    private ArrayList<Flota> flotas;
    public Empresa(){
        flotas=new ArrayList<Flota>();
    }
    public void agregarFlota(Flota flotaNueva){
        flotas.add(flotaNueva);
    }
    public ArrayList<Flota> getFlotas() {
        return flotas;
    }
}
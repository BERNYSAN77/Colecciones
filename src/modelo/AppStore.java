package modelo;

import java.util.ArrayList;
import java.util.List;

public class AppStore {
    List<Juego> juegos;

    public AppStore(){
        juegos = new ArrayList<Juego>();
    }

    public void cargarDatows(){
        juegos.add(new Juego("Fifa2026","Deportes",15,15,50));
        juegos.add(new Juego("Roblox","Acción",50,35,30));
    }

    public List<Juego> getJuegos() {
        return juegos;
    }
    public void agregarJuego(Juego j){
        if(j != null){
            juegos.add(j);
        }
    }
}

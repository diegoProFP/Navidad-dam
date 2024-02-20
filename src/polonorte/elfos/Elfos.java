package polonorte.elfos;

public class Elfos {
    int vida, escudo, defensa;
    String nombre;
    String[][] posicion;

    public Elfos(int vida, int escudo, int defensa, String nombre, String[][] posicion) {
        this.vida = vida;
        this.escudo = escudo;
        this.defensa = defensa;
        this.nombre = nombre;
        this.posicion = posicion;
    }
}
package Ej2;

public class Carta {
    public String nombre;
    public int costeMana;
    public String imagen;
    public String tipo;
    public String subtipo;
    public String habilidad;
    public String rareza;
    public String expansion;
    public String artista;
    public int fuerza;
    public int resistencia;

    public Carta(String nombre, int costeMana, String imagen, String tipo, String subtipo, String habilidad, String rareza, String expansion, String artista, int fuerza, int resistencia) {
        this.nombre = nombre;
        this.costeMana = costeMana;
        this.imagen = imagen;
        this.tipo = tipo;
        this.subtipo = subtipo;
        this.habilidad = habilidad;
        this.rareza = rareza;
        this.expansion = expansion;
        this.artista = artista;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCosteMana() {
        return costeMana;
    }

    public String getImagen() {
        return imagen;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSubtipo() {
        return subtipo;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public String getRareza() {
        return rareza;
    }

    public String getExpansion() {
        return expansion;
    }

    public String getArtista() {
        return artista;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }
}

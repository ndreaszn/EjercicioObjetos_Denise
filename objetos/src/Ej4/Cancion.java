package Ej4;

public class Cancion {
    public String titulo;
    public String artista;
    public String album;
    public int duracion;
    public String genero;
    public int numReproducciones;

    public Cancion(String titulo, String artista, String album, int duracion, String genero, int numReproducciones) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracion = duracion;
        this.genero = genero;
        this.numReproducciones = numReproducciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumReproducciones() {
        return numReproducciones;
    }
}
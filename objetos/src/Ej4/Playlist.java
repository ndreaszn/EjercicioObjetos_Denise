package Ej4;

public class Playlist {
    public String nombre;
    public Cancion[] canciones;

    public Playlist(String nombre, Cancion[] canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public Cancion[] getCanciones() {
        return canciones;
    }

    public void mostrarCanciones() {
        System.out.println("\n--- Playlist: " + nombre + " ---");
        for (int i = 0; i < canciones.length; i++) {
            Cancion c = canciones[i];
            System.out.println("- " + c.getTitulo() + " | " + c.getArtista() +
                    " | " + c.getDuracion() + "s | Género: " + c.getGenero());
        }
    }
}
package Ej4;

public class Main {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Sweden", "C418", "Minecraft Volume Alpha", 210, "Ambient", 50000000);
        Cancion c2 = new Cancion("Mice on Venus", "C418", "Minecraft Volume Alpha", 280, "Ambient", 30000000);
        Cancion c3 = new Cancion("Wet Hands", "C418", "Minecraft Volume Alpha", 90, "Ambient", 25000000);

        Cancion[] canciones = {c1, c2, c3};

        Playlist miPlaylist = new Playlist("minecrafting", canciones);

        Usuario u1 = new Usuario("andreabevibin", "dname@gmail.com", "premium",
                "24-06-2017", miPlaylist);

        u1.mostrarDetalles();
        u1.getPlaylist().mostrarCanciones();
    }
}

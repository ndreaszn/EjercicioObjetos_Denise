package Ej4;

public class Usuario {
    public String username;
    public String email;
    public String tipoCuenta;
    public String fechaRegistro;
    public Playlist playlist;

    public Usuario(String username, String email, String tipoCuenta, String fechaRegistro, Playlist playlist) {
        this.username = username;
        this.email = email;
        this.tipoCuenta = tipoCuenta;
        this.fechaRegistro = fechaRegistro;
        this.playlist = playlist;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void mostrarDetalles() {
        System.out.println("--- Detalles del Usuario ---");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Fecha de registro: " + fechaRegistro);
        System.out.println("Playlist favorita: " + playlist.getNombre());
    }
}
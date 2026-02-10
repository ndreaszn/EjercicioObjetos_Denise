package Ej5;

public class Habilidad {
    public String nombre;
    public String descripcion;
    public int costeRecurso;
    public int enfriamiento;
    public int nivel;
    public String teclaAsignada;

    public Habilidad(String nombre, String descripcion, int costeRecurso, int enfriamiento, int nivel, String teclaAsignada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costeRecurso = costeRecurso;
        this.enfriamiento = enfriamiento;
        this.nivel = nivel;
        this.teclaAsignada = teclaAsignada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCosteRecurso() {
        return costeRecurso;
    }

    public int getEnfriamiento() {
        return enfriamiento;
    }

    public int getNivel() {
        return nivel;
    }

    public String getTeclaAsignada() {
        return teclaAsignada;
    }
}
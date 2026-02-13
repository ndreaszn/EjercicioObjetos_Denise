package Ej5;

public class Campeon {
    public String nombre;
    public String rolPrincipal;
    public String dificultad;
    public String recurso;
    public int vidaMaxima;
    public int danoAtaque;
    public int poderHabilidad;
    public int armadura;
    public int resistenciaMagica;
    public Habilidad pasiva;
    public Habilidad Q;
    public Habilidad W;
    public Habilidad E;
    public Habilidad R;

    public Campeon(String nombre, String rolPrincipal, String dificultad, String recurso, int vidaMaxima, int danoAtaque, int poderHabilidad, int armadura, int resistenciaMagica, Habilidad pasiva, Habilidad Q, Habilidad W, Habilidad E, Habilidad R) {
        this.nombre = nombre;
        this.rolPrincipal = rolPrincipal;
        this.dificultad = dificultad;
        this.recurso = recurso;
        this.vidaMaxima = vidaMaxima;
        this.danoAtaque = danoAtaque;
        this.poderHabilidad = poderHabilidad;
        this.armadura = armadura;
        this.resistenciaMagica = resistenciaMagica;
        this.pasiva = pasiva;
        this.Q = Q;
        this.W = W;
        this.E = E;
        this.R = R;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getRolPrincipal() {
        return rolPrincipal;
    }

    public String getDificultad() {
        return dificultad;
    }

    public String getRecurso() {
        return recurso;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getDanoAtaque() {
        return danoAtaque;
    }

    public int getPoderHabilidad() {
        return poderHabilidad;
    }

    public int getArmadura() {
        return armadura;
    }

    public int getResistenciaMagica() {
        return resistenciaMagica;
    }

    public Habilidad getPasiva() {
        return pasiva;
    }

    public Habilidad getQ() {
        return Q;
    }

    public Habilidad getW() {
        return W;
    }

    public Habilidad getE() {
        return E;
    }

    public Habilidad getR() {
        return R;
    }

    public void mostrarInfo() {
        System.out.println("--- Campeón: " + nombre + " ---");
        System.out.println("Rol: " + rolPrincipal);
        System.out.println("Dificultad: " + dificultad);
        System.out.println("Recurso: " + recurso);
        System.out.println("Vida máxima: " + vidaMaxima);
        System.out.println("Daño de ataque: " + danoAtaque);
        System.out.println("Poder de habilidad: " + poderHabilidad);
        System.out.println("Armadura: " + armadura);
        System.out.println("Resistencia mágica: " + resistenciaMagica);
    }

    public void mostrarHabilidades() {
        System.out.println("\n--- Habilidades ---");
        mostrarHabilidad("Pasiva", pasiva);
        mostrarHabilidad("Q", Q);
        mostrarHabilidad("W", W);
        mostrarHabilidad("E", E);
        mostrarHabilidad("R", R);
    }

    private void mostrarHabilidad(String tipo, Habilidad h) {
        System.out.println("\n[" + tipo + "] " + h.getNombre());
        System.out.println("  Descripción: " + h.getDescripcion());
        System.out.println("  Coste: " + h.getCosteRecurso() + " | Enfriamiento: " + h.getEnfriamiento() + "s | Nivel: " + h.getNivel());
    }
}
package Ej5;

public class Main {
    public static void main(String[] args) {
        // Crear habilidades de Lux
        Habilidad pasiva = new Habilidad("Iluminación", "Los hechizos marcan a enemigos con luz", 0, 0, 1, "Pasiva");
        Habilidad q = new Habilidad("Atadura de luz", "Lanza una esfera de luz que ata a enemigos", 50, 11, 5, "Q");
        Habilidad w = new Habilidad("Vara prismática", "Lanza su vara que escuda aliados", 60, 12, 3, "W");
        Habilidad e = new Habilidad("Singularidad de luz", "Crea una zona luminosa que revela y ralentiza", 70, 10, 4, "E");
        Habilidad r = new Habilidad("Chispa final", "Dispara un rayo de luz devastador", 100, 80, 2, "R");

        // Crear campeón
        Campeon c1 = new Campeon("Lux", "Mago", "Moderada", "Maná", 560, 54, 85, 19, 30,
                pasiva, q, w, e, r);

        // Mostrar información
        c1.mostrarInfo();
        c1.mostrarHabilidades();
    }
}
package Ej2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Carta c1 = new Carta("Ragost, Deft Gastronaut", 10, "img/card.png",
                "Legendary Creature", "Lobster Citizen", "sum goated shi",
                "Rare", "idk", "Denise Name jeje", 2, 2);


        System.out.println("---- " + c1.getNombre() + " ----");
        System.out.println("Coste Maná: " + c1.getCosteMana());
        System.out.println("Imagen: " + c1.getImagen());
        System.out.println("Tipo de carta: " + c1.getTipo());
        System.out.println("Subtipo de carta: " + c1.getSubtipo());
        System.out.println("Habilidad: " + c1.getHabilidad());
        System.out.println("Rareza: " + c1.getRareza());
        System.out.println("Expansión: " + c1.getExpansion());
        System.out.println("Artista: " + c1.getArtista());
        System.out.println("Fuerza/Resistencia: " + c1.getFuerza() + "/" + c1.getResistencia());

    }
}

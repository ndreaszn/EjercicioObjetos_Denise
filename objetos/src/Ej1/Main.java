package Ej1;

public class Main {
    public static void main(String[] args) {

        Pokemon pokemon = new Pokemon(4, "Charmander", "Fire", 1);

        pokemon.setEvolution("Charmeleon");
        pokemon.setDevolution(null);
        pokemon.setCaptured(true);

        System.out.println("Nombre: " + pokemon.getName());
        System.out.println("Tipo: " + pokemon.getType());
        System.out.println("Capturado: " + pokemon.isCaptured());
        System.out.println("Evoluciona a: " + pokemon.getEvolution());

    }
}

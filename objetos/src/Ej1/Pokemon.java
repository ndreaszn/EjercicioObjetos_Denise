package Ej1;

public class Pokemon {

    public String name;
    public String type;
    public int generation;
    public boolean captured;
    public int id;
    public String evolution;
    public String devolution;

    public Pokemon(int id, String name, String type, int generation) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.generation = generation;
        this.captured = false;
        this.evolution = null;
        this.devolution = null;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }


    public int getGeneration() {
        return generation;
    }

    public boolean isCaptured() {
        return captured;
    }

    public void setCaptured(boolean captured) {
        this.captured = captured;
    }

    public int getId() {
        return id;
    }

    public String getEvolution() {
        return evolution;
    }

    public void setEvolution(String evolution) {
        this.evolution = evolution;
    }

    public String getDevolution() {
        return devolution;
    }

    public void setDevolution(String devolution) {
        this.devolution = devolution;
    }
}

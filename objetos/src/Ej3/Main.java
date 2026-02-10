package Ej3;

public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Denise", "Name", "02-05-2007", "60097429Q", "Mujer",  1.6f, 45, "N/A", "N/A", "N/A", "N/A");

        System.out.println("Paciente: " + p1.getNombre() + " " + p1.getApellidos());
        System.out.println("Fecha de nacimiento: " + p1.getFechaNacimiento());
        System.out.println("DNI: " + p1.getDni());
        System.out.println("Sexo: " + p1.getSexo());
        System.out.println("Altura: " + p1.getAltura());
        System.out.println("Peso: " + p1.getPeso());
        System.out.println("Alergias: " + p1.getAlergias());
        System.out.println("Medicamentos: " + p1.getMedicamentos());
        System.out.println("Enfermedades: " + p1.getEnfermedades());
        System.out.println("Operaciones quirúrgicas: " + p1.getOperaciones());
        System.out.println("IMC: " + p1.getMasaCorp());
    }
}

package Ej3;

public class Paciente {
    public String nombre;
    public String apellidos;
    public String fechaNacimiento;
    public String dni;
    public String sexo;
    public float altura;
    public int peso;
    public String alergias;
    public String medicamentos;
    public String enfermedades;
    public String operaciones;
    public float masaCorp;

    public Paciente(String nombre, String apellidos, String fechaNacimiento, String dni, String sexo, float altura, int peso, String alergias, String medicamentos, String enfermedades, String operaciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.alergias = alergias;
        this.medicamentos = medicamentos;
        this.enfermedades = enfermedades;
        this.operaciones = operaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public float getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public String getOperaciones() {
        return operaciones;
    }

    public float getMasaCorp() {
        masaCorp = (float) getPeso() / (getAltura() * getAltura());
        return masaCorp;
    }
}

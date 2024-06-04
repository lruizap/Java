package Objetos.EjercicioExamen.ejercicioSuperHeroes;

import java.util.ArrayList;
import java.util.Random;

public class SuperHeroe {
    private String identificador;
    private String nombre;
    private int edad;
    private ArrayList<String> habilidades;
    private boolean esVillano;

    // Constructor vacío
    public SuperHeroe() {
        Random rand = new Random();
        this.identificador = "SH" + rand.nextInt(10000);
        this.nombre = "";
        this.edad = 0;
        this.habilidades = new ArrayList<>();
        this.esVillano = false;
    }

    // Constructor con parámetros
    public SuperHeroe(String identificador, String nombre, int edad, ArrayList<String> habilidades, boolean esVillano) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.edad = edad;
        this.habilidades = habilidades;
        this.esVillano = esVillano;
    }

    // Getters y Setters
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public boolean isEsVillano() {
        return esVillano;
    }

    public void setEsVillano(boolean esVillano) {
        this.esVillano = esVillano;
    }

    // Método toString
    @Override
    public String toString() {
        return "SuperHeroe:\n" +
               "*************************************************************\n" +
               "Identificador: " + identificador + "\n" +
               "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Habilidades: " + habilidades + "\n" +
               "Es Villano: " + esVillano + "\n" +
               "*************************************************************\n";
    }
}
package Objetos.EjercicioExamen.ejercicioFamilia;

import java.util.Random;

public class Persona {
    private int identificador;
    private String nombre;
    private int edad;
    private double ingresos;
    private boolean esProgenitor;

    // Constructor vacío
    public Persona() {
        Random rand = new Random();
        this.identificador = rand.nextInt(10000);
        this.nombre = "";
        this.edad = 0;
        this.ingresos = 10000.0 * rand.nextDouble();
        this.esProgenitor = false;
    }

    // Constructor con parámetros
    public Persona(int identificador, String nombre, int edad, double ingresos, boolean esProgenitor) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.edad = edad;
        this.ingresos = ingresos;
        this.esProgenitor = esProgenitor;
    }

    // Getters y Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
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

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public boolean isEsProgenitor() {
        return esProgenitor;
    }

    public void setEsProgenitor(boolean esProgenitor) {
        this.esProgenitor = esProgenitor;
    }

    // Método toString
    @Override
    public String toString() {
        return "Persona:\n" +
               "*************************************************************\n" +
               "Identificador: " + identificador + "\n" +
               "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Ingresos: " + ingresos + "\n" +
               "Es Progenitor: " + esProgenitor + "\n" +
               "*************************************************************\n";
    }
}

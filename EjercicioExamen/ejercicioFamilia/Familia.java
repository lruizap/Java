package EjercicioExamen.ejercicioFamilia;

import java.util.Random;

public class Familia {
    private String identificador;
    private String nombre;
    private String direccion;
    public boolean esNumerosa;
    private boolean esMonoparental;
    private double ingresosMensuales;
    private Persona[] personas;

    // Constructor vacío
    public Familia() {
        Random rand = new Random();
        this.identificador = "F" + rand.nextInt(10000);
        this.nombre = "";
        this.direccion = "";
        this.esNumerosa = false;
        this.esMonoparental = false;
        this.ingresosMensuales = 10000.0 * rand.nextDouble();;
        this.personas = new Persona[0];
    }

    // Constructor con parámetros
    public Familia(String identificador, String nombre, String direccion, boolean esNumerosa, boolean esMonoparental, double ingresosMensuales, Persona[] personas) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.direccion = direccion;
        this.esNumerosa = esNumerosa;
        this.esMonoparental = esMonoparental;
        this.ingresosMensuales = ingresosMensuales;
        this.personas = personas;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEsMonoparental() {
        return esMonoparental;
    }

    public void setEsMonoparental(boolean esMonoparental) {
        this.esMonoparental = esMonoparental;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Familia:\n")
          .append("*************************************************************\n")
          .append("Identificador: ").append(identificador).append("\n")
          .append("Nombre: ").append(nombre).append("\n")
          .append("Dirección: ").append(direccion).append("\n")
          .append("Es Numerosa: ").append(esNumerosa).append("\n")
          .append("Es Monoparental: ").append(esMonoparental).append("\n")
          .append("Ingresos Mensuales: ").append(ingresosMensuales).append("\n")
          .append("Personas: ").append(personas.length).append("\n")
          .append("*************************************************************\n");

        for (Persona persona : personas) {
            sb.append(persona.toString()).append("\n");
        }
        return sb.toString();
    }

    // Funciones de la clase Familia
    public int numPersonas() {
        return personas.length;
    }

    public int numPersonasIngresos(double ingreso) {
        int count = 0;
        for (Persona persona : personas) {
            if (persona.getIngresos() < ingreso) {
                count++;
            }
        }
        return count;
    }

    public void sumaIngresos() {
        double total = 0;
        for (Persona persona : personas) {
            total += persona.getIngresos();
        }
        ingresosMensuales = total;
    }

    public boolean asignarRolProgenitor(String nombre, boolean esProgenitor) {
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                if (persona.isEsProgenitor() || esProgenitor) {
                    return false;
                } else {
                    persona.setEsProgenitor(true);
                    return true;
                }
            }
        }
        return false;
    }
}

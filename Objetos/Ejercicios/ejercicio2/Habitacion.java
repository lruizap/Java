package Objetos.Ejercicios.ejercicio2;

public class Habitacion {
    private int numero;
    private String tipo;
    private double precioPorNoche;
    private boolean disponible;

    public Habitacion(int numero, String tipo, double precioPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.disponible = true;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void ocupar() {
        disponible = false;
    }

    public void liberar() {
        disponible = true;
    }

    public void mostrarInformacion() {
        System.out.println("Habitación #" + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Precio por noche: " + precioPorNoche);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
        System.out.println();
    }
}

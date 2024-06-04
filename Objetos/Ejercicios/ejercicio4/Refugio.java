package Objetos.Ejercicios.ejercicio4;
import java.util.ArrayList;

public class Refugio {
    private String nombre;
    private String direccion;
    private ArrayList<Animal> animales;

    public Refugio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.animales = new ArrayList<>();
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

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
        System.out.println("Animal agregado: " + animal.getNombre());
    }

    public void mostrarAnimales() {
        System.out.println("Animales en el refugio " + nombre + ":");
        for (Animal animal : animales) {
            animal.mostrarInformacion();
            animal.hacerSonido();
            System.out.println();
        }
    }
}

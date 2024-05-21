package Ejercicios.ejercicio;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String id;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public void prestarLibro(Libro libro) {
        if (!libro.isPrestado()) {
            libro.prestar();
            librosPrestados.add(libro);
        } else {
            System.out.println("El libro \"" + libro.getTitulo() + "\" no está disponible para préstamo.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            libro.devolver();
            librosPrestados.remove(libro);
        } else {
            System.out.println("El libro \"" + libro.getTitulo() + "\" no está prestado por este usuario.");
        }
    }

    public void listarLibrosPrestados() {
        System.out.println("Libros prestados por " + nombre + ":");
        for (Libro libro : librosPrestados) {
            System.out.println("- " + libro.getTitulo() + " por " + libro.getAutor());
        }
    }
}

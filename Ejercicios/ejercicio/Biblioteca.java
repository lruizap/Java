package Ejercicios.ejercicio;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro \"" + libro.getTitulo() + "\" agregado a la biblioteca.");
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario \"" + usuario.getNombre() + "\" registrado en la biblioteca.");
    }

    public Libro buscarLibroPorISBN(String ISBN) {
        for (Libro libro : libros) {
            if (libro.getISBN().equals(ISBN)) {
                return libro;
            }
        }
        System.out.println("No se encontró un libro con el ISBN: " + ISBN);
        return null;
    }

    public Usuario buscarUsuarioPorId(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        System.out.println("No se encontró un usuario con el ID: " + id);
        return null;
    }
}

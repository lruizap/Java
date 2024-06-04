package Objetos.Ejercicios.ejercicio;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "1234567890");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "0987654321");

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan Pérez", "001");
        Usuario usuario2 = new Usuario("Ana Gómez", "002");

        // Registrar usuarios en la biblioteca
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // Prestar libros a los usuarios
        usuario1.prestarLibro(libro1);
        usuario1.prestarLibro(libro2);

        // Listar libros prestados por el usuario1
        usuario1.listarLibrosPrestados();

        // Devolver un libro
        usuario1.devolverLibro(libro1);

        // Listar libros prestados por el usuario1 nuevamente
        usuario1.listarLibrosPrestados();

        // Intentar prestar un libro que ya está prestado
        usuario2.prestarLibro(libro2);
    }
}

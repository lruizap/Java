# Enunciado del Ejercicio:

## Sistema de Gestión de Biblioteca

**Objetivo:** Crear un sistema simple de gestión de biblioteca utilizando la programación orientada a objetos en Java. El sistema gestionará libros y usuarios, permitiendo prestar y devolver libros, así como mantener un registro de los libros prestados.

### Instrucciones:

1. **Clase `Libro`**:

   - **Propiedades:**
     - `titulo` (String): Título del libro.
     - `autor` (String): Autor del libro.
     - `ISBN` (String): Número ISBN del libro.
     - `prestado` (boolean): Indica si el libro está prestado o no.
   - **Métodos:**
     - Constructor para inicializar las propiedades del libro.
     - Getters para todas las propiedades.
     - Método `prestar()` que marca el libro como prestado si no lo está y muestra un mensaje.
     - Método `devolver()` que marca el libro como no prestado si lo está y muestra un mensaje.

2. **Clase `Usuario`**:

   - **Propiedades:**
     - `nombre` (String): Nombre del usuario.
     - `id` (String): Identificador único del usuario.
     - `librosPrestados` (ArrayList<Libro>): Lista de libros prestados por el usuario.
   - **Métodos:**
     - Constructor para inicializar las propiedades del usuario.
     - Getters para `nombre` e `id`.
     - Método `prestarLibro(Libro libro)` que permite al usuario prestar un libro si no está prestado.
     - Método `devolverLibro(Libro libro)` que permite al usuario devolver un libro si lo tiene prestado.
     - Método `listarLibrosPrestados()` que muestra la lista de libros prestados por el usuario.

3. **Clase `Biblioteca`**:

   - **Propiedades:**
     - `libros` (ArrayList<Libro>): Lista de libros en la biblioteca.
     - `usuarios` (ArrayList<Usuario>): Lista de usuarios registrados en la biblioteca.
   - **Métodos:**
     - Constructor para inicializar las listas de libros y usuarios.
     - Método `agregarLibro(Libro libro)` que agrega un libro a la biblioteca.
     - Método `registrarUsuario(Usuario usuario)` que registra un usuario en la biblioteca.
     - Método `buscarLibroPorISBN(String ISBN)` que busca y devuelve un libro por su ISBN.
     - Método `buscarUsuarioPorId(String id)` que busca y devuelve un usuario por su ID.

4. **Clase `Main`**:
   - En el método `main`, realiza las siguientes acciones:
     - Crear una instancia de `Biblioteca`.
     - Crear varios objetos `Libro` y agregar estos libros a la biblioteca.
     - Crear varios objetos `Usuario` y registrar estos usuarios en la biblioteca.
     - Prestar libros a los usuarios y mostrar mensajes apropiados.
     - Listar los libros prestados por un usuario.
     - Devolver un libro y mostrar mensajes apropiados.
     - Intentar prestar un libro que ya está prestado y manejar el caso adecuadamente.

#### Ejemplo de Salida Esperada:

```plaintext
Libro "El Quijote" agregado a la biblioteca.
Libro "Cien Años de Soledad" agregado a la biblioteca.
Usuario "Juan Pérez" registrado en la biblioteca.
Usuario "Ana Gómez" registrado en la biblioteca.
El libro "El Quijote" ha sido prestado.
El libro "Cien Años de Soledad" ha sido prestado.
Libros prestados por Juan Pérez:
- El Quijote por Miguel de Cervantes
- Cien Años de Soledad por Gabriel García Márquez
El libro "El Quijote" ha sido devuelto.
Libros prestados por Juan Pérez:
- Cien Años de Soledad por Gabriel García Márquez
El libro "Cien Años de Soledad" no está disponible para préstamo.
```

Este ejercicio tiene como objetivo poner en práctica los conceptos de clases, objetos, encapsulación, y la interacción entre múltiples clases en un contexto más complejo y realista.

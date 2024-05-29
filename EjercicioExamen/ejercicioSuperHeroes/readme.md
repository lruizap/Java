# Enunciado del Ejercicio:

## Sistema de Gestión de Superhéroes

**Objetivo:** Crear un sistema de gestión de superhéroes utilizando la programación orientada a objetos en Java. El sistema gestionará diferentes superhéroes y sus habilidades, permitiendo realizar operaciones como agregar superhéroes, contar el número de superhéroes y encontrar los superhéroes con una habilidad específica.

### Clases a Implementar:

1. **Clase `SuperHeroe`**:

   - **Propiedades:**
     - `identificador` (String): Identificador único del superhéroe.
     - `nombre` (String): Nombre del superhéroe.
     - `edad` (int): Edad del superhéroe.
     - `habilidades` (ArrayList<String>): Lista de habilidades del superhéroe.
     - `esVillano` (boolean): Indica si el superhéroe es un villano.
   - **Métodos:**
     - Constructor vacío que genera valores por defecto.
     - Constructor que recibe todos los parámetros.
     - Getters y setters para todas las propiedades.
     - Método `toString()` que muestra la información del superhéroe de manera formateada.

2. **Clase `Equipo`**:
   - **Propiedades:**
     - `nombre` (String): Nombre del equipo.
     - `baseOperaciones` (String): Base de operaciones del equipo.
     - `superHeroes` (ArrayList<SuperHeroe>): Lista de superhéroes en el equipo.
   - **Métodos:**
     - Constructor que inicializa las propiedades.
     - Método `agregarSuperHeroe(SuperHeroe superHeroe)` que agrega un superhéroe al equipo.
     - Método `numSuperHeroes()` que devuelve la cantidad de superhéroes en el equipo.
     - Método `buscarSuperHeroesPorHabilidad(String habilidad)` que devuelve una lista de superhéroes con una habilidad específica.
     - Método `mostrarSuperHeroes()` que muestra la información de todos los superhéroes en el equipo.

Este código define las clases `SuperHeroe` y `Equipo` con sus respectivos atributos y métodos, incluyendo el constructor, getters, setters, y el método `toString`. Además, la clase `Equipo` contiene métodos para agregar superhéroes, contar el número de superhéroes, buscar superhéroes por habilidad y mostrar la información de todos los superhéroes. Finalmente, el archivo `Main.java` crea instancias de estas clases y demuestra cómo utilizarlas.

# Enunciado del Ejercicio:

## Sistema de Gestión de Animales en un Refugio

**Objetivo:** Crear un sistema de gestión de animales en un refugio utilizando la programación orientada a objetos en Java. El sistema gestionará diferentes tipos de animales (Perro y Gato), heredando de una clase base `Animal`. También incluirá una clase `Refugio` que gestionará la adición y visualización de animales en el refugio.

### Instrucciones:

1. **Clase `Animal` (Clase base)**:

   - **Propiedades:**
     - `nombre` (String): Nombre del animal.
     - `edad` (int): Edad del animal.
     - `especie` (String): Especie del animal.
   - **Métodos:**
     - Constructor para inicializar las propiedades.
     - Getters y setters para todas las propiedades.
     - Método `hacerSonido()`: Método abstracto para hacer sonido (cada tipo de animal tendrá su propio sonido).
     - Método `mostrarInformacion()`: Método para mostrar la información del animal.

2. **Clase `Perro` (Heredada de `Animal`)**:

   - **Propiedades Adicionales:**
     - `raza` (String): Raza del perro.
   - **Métodos:**
     - Constructor para inicializar las propiedades incluyendo las de la clase base.
     - Override del método `hacerSonido()`: Implementar sonido específico para perros.
     - Override del método `mostrarInformacion()`: Mostrar información específica del perro.

3. **Clase `Gato` (Heredada de `Animal`)**:

   - **Propiedades Adicionales:**
     - `color` (String): Color del gato.
   - **Métodos:**
     - Constructor para inicializar las propiedades incluyendo las de la clase base.
     - Override del método `hacerSonido()`: Implementar sonido específico para gatos.
     - Override del método `mostrarInformacion()`: Mostrar información específica del gato.

4. **Clase `Refugio`**:
   - **Propiedades:**
     - `nombre` (String): Nombre del refugio.
     - `direccion` (String): Dirección del refugio.
     - `animales` (ArrayList<Animal>): Lista de animales en el refugio.
   - **Métodos:**
     - Constructor para inicializar las propiedades.
     - Método `agregarAnimal(Animal animal)`: Agregar un animal a la lista de animales.
     - Método `mostrarAnimales()`: Mostrar la información de todos los animales en el refugio.

En este ejercicio, se ha creado un sistema de gestión de un refugio de animales, utilizando herencia para definir clases específicas `Perro` y `Gato` que heredan de la clase base `Animal`. La clase `Refugio` gestiona la adición y visualización de los animales.

public class Main {
    public static void main(String[] args) {
        // Crear el refugio
        Refugio refugio = new Refugio("Refugio Felino-Canino", "456 Calle de los Animales");

        // Crear animales
        Perro perro1 = new Perro("Max", 3, "Perro", "Labrador");
        Gato gato1 = new Gato("Luna", 2, "Gato", "Negro");

        // Agregar animales al refugio
        refugio.agregarAnimal(perro1);
        refugio.agregarAnimal(gato1);

        // Mostrar información de los animales en el refugio
        refugio.mostrarAnimales();
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear objetos de tipo Persona
        Persona persona1 = new Persona("Juan", 30, "Ingeniero");
        Persona persona2 = new Persona("María", 25, "Doctora");
        
        // Acceder a las propiedades de los objetos
        System.out.println("Información de la persona 1:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Ocupación: " + persona1.getOcupacion());
        
        System.out.println("\nInformación de la persona 2:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("Ocupación: " + persona2.getOcupacion());

        Persona persona3 = new Persona(null, 0, null);

        persona3.setNombre("Paco");
        persona3.setEdad(40);
        persona3.setOcupacion("Profesor");

        System.out.println("\nInformación de la persona 3:");
        System.out.println("Nombre: " + persona3.getNombre());
        System.out.println("Edad: " + persona3.getEdad());
        System.out.println("Ocupación: " + persona3.getOcupacion());

        // Llamar a un método externo pasando un objeto como parámetro
        System.out.println("\nImprimir información de la persona 1,2,3 desde un método externo:");
        // imprimirInformacion(persona1);

        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
        persona3.mostrarInformacion();
    }

    // Método externo que toma un objeto Persona como parámetro
    public static void imprimirInformacion(Persona persona) {
        persona.mostrarInformacion();
    }
}

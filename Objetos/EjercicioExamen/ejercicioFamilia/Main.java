package Objetos.EjercicioExamen.ejercicioFamilia;

public class Main {
    public static void main(String[] args) {
        // Crear personas
        Persona p1 = new Persona(1, "Juan", 40, 2500.0, false);
        Persona p2 = new Persona(2, "Ana", 38, 3000.0, false);
        Persona p3 = new Persona(3, "Luis", 16, 0.0, false);
        Persona p4 = new Persona(4, "Marta", 10, 0.0, false);

        // Crear array de personas
        Persona[] personas = {p1, p2, p3, p4};

        // Crear familia
        Familia familia = new Familia("F123", "Familia García", "Calle Falsa 123", true, false, 0.0, personas);

        // Mostrar información de la familia
        System.out.println(familia);

        // Mostrar el número de personas en la familia
        System.out.println("Número de personas en la familia: " + familia.numPersonas());

        // Mostrar el número de personas con ingresos inferiores a 2000
        System.out.println("Número de personas con ingresos inferiores a 2000: " + familia.numPersonasIngresos(2000));

        // Sumar los ingresos de la familia
        familia.sumaIngresos();
        System.out.println("Ingresos mensuales de la familia después de la suma: " + familia.getIngresosMensuales());

        // Asignar rol de progenitor
        boolean asignado = familia.asignarRolProgenitor("Juan", true);
        System.out.println("Asignar rol de progenitor a Juan: " + asignado);

        // Mostrar información actualizada de la familia
        System.out.println(familia);
    }
}

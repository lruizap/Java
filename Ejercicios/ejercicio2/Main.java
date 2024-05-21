package Ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear el hotel
        Hotel hotel = new Hotel("Hotel Java", "123 Calle Principal");

        // Crear habitaciones
        Habitacion habitacion1 = new Habitacion(101, "Sencilla", 50.0);
        Habitacion habitacion2 = new Habitacion(102, "Doble", 80.0);
        Habitacion habitacion3 = new Habitacion(103, "Suite", 150.0);

        // Agregar habitaciones al hotel
        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);
        hotel.agregarHabitacion(habitacion3);

        // Crear clientes
        Cliente cliente1 = new Cliente("Carlos López", "C001", "555-1234");
        Cliente cliente2 = new Cliente("María Fernández", "C002", "555-5678");

        // Realizar reservas
        hotel.realizarReserva(cliente1, 101, "2024-06-01", "2024-06-10");
        hotel.realizarReserva(cliente2, 102, "2024-06-05", "2024-06-15");

        // Consultar disponibilidad
        hotel.consultarDisponibilidad();

        // Mostrar información de reservas
        hotel.mostrarInformacionReservas();

        // Cancelar una reserva
        hotel.cancelarReserva(cliente1, 101);

        // Consultar disponibilidad después de cancelar
        hotel.consultarDisponibilidad();

        // Mostrar información de reservas después de cancelar
        hotel.mostrarInformacionReservas();
    }
}



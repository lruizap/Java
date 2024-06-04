package Objetos.Ejercicios.ejercicio2;

import java.util.ArrayList;

public class Hotel {
    private String nombre;
    private String direccion;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Reserva> reservas;

    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
        System.out.println("Habitación #" + habitacion.getNumero() + " agregada al hotel.");
    }

    public void realizarReserva(Cliente cliente, int numeroHabitacion, String fechaInicio, String fechaFin) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numeroHabitacion) {
                if (habitacion.isDisponible()) {
                    Reserva reserva = new Reserva(cliente, habitacion, fechaInicio, fechaFin);
                    reservas.add(reserva);
                    habitacion.ocupar();
                    System.out.println("Reserva realizada para la habitación #" + numeroHabitacion + ".");
                    return;
                } else {
                    System.out.println("La habitación #" + numeroHabitacion + " no está disponible.");
                    return;
                }
            }
        }
        System.out.println("No se encontró la habitación #" + numeroHabitacion + ".");
    }

    public void cancelarReserva(Cliente cliente, int numeroHabitacion) {
        for (Reserva reserva : reservas) {
            if (reserva.getCliente().equals(cliente) && reserva.getHabitacion().getNumero() == numeroHabitacion) {
                reservas.remove(reserva);
                reserva.getHabitacion().liberar();
                System.out.println("Reserva cancelada para la habitación #" + numeroHabitacion + ".");
                return;
            }
        }
        System.out.println("No se encontró una reserva para la habitación #" + numeroHabitacion + " del cliente " + cliente.getNombre() + ".");
    }

    public void consultarDisponibilidad() {
        System.out.println("Disponibilidad de habitaciones:");
        for (Habitacion habitacion : habitaciones) {
            habitacion.mostrarInformacion();
        }
    }

    public void mostrarInformacionReservas() {
        System.out.println("Reservas realizadas:");
        for (Reserva reserva : reservas) {
            reserva.mostrarInformacion();
        }
    }
}

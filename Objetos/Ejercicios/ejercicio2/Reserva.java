package Objetos.Ejercicios.ejercicio2;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private String fechaInicio;
    private String fechaFin;

    public Reserva(Cliente cliente, Habitacion habitacion, String fechaInicio, String fechaFin) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void mostrarInformacion() {
        System.out.println("Reserva:");
        cliente.mostrarInformacion();
        habitacion.mostrarInformacion();
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Fecha de fin: " + fechaFin);
        System.out.println();
    }
}

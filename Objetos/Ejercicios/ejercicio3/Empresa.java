package Objetos.Ejercicios.ejercicio3;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    public Empresa() {
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado \"" + empleado.getNombre() + "\" agregado a la empresa.");
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente \"" + cliente.getNombre() + "\" agregado a la empresa.");
    }

    public void mostrarInformacionPersonas() {
        System.out.println("Empleados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
        }
        System.out.println("Clientes:");
        for (Cliente cliente : clientes) {
            cliente.mostrarInformacion();
        }
    }
}


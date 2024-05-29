package Ejercicios.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Crear empleados
        Empleado empleado1 = new Empleado("Juan Pérez", "E001", "juan.perez@empresa.com", 50000.0, "Ingeniero");
        Empleado empleado2 = new Empleado("Ana Gómez", "E002", "ana.gomez@empresa.com", 60000.0, "Gerente");

        // Crear clientes
        Cliente cliente1 = new Cliente("Carlos López", "C001", "carlos.lopez@correo.com", "2022-01-15", 1500.75);
        Cliente cliente2 = new Cliente("María Fernández", "C002", "maria.fernandez@correo.com", "2023-03-22", 2750.30);

        // Agregar empleados y clientes a la empresa
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarCliente(cliente1);
        empresa.agregarCliente(cliente2);

        // Mostrar información de todos los empleados y clientes
        empresa.mostrarInformacionPersonas();
    }
}


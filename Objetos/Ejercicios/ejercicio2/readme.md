# Enunciado del Ejercicio:

## Sistema de Gestión de Reservas de Hotel

**Objetivo:** Crear un sistema de gestión de reservas de un hotel utilizando la programación orientada a objetos en Java. El sistema gestionará habitaciones, clientes, y reservas, permitiendo realizar y cancelar reservas, así como consultar el estado de las habitaciones.

### Instrucciones:

1. **Clase `Habitacion`**:

   - **Propiedades:**
     - `numero` (int): Número de la habitación.
     - `tipo` (String): Tipo de habitación (e.g., "Sencilla", "Doble", "Suite").
     - `precioPorNoche` (double): Precio por noche de la habitación.
     - `disponible` (boolean): Indica si la habitación está disponible o no.
   - **Métodos:**
     - Constructor para inicializar las propiedades.
     - Getters y setters para todas las propiedades.
     - Método `ocupar()` que marca la habitación como no disponible.
     - Método `liberar()` que marca la habitación como disponible.
     - Método `mostrarInformacion()` que muestra la información de la habitación.

2. **Clase `Cliente`**:

   - **Propiedades:**
     - `nombre` (String): Nombre del cliente.
     - `id` (String): Identificador único del cliente.
     - `telefono` (String): Número de teléfono del cliente.
   - **Métodos:**
     - Constructor para inicializar las propiedades.
     - Getters y setters para todas las propiedades.
     - Método `mostrarInformacion()` que muestra la información del cliente.

3. **Clase `Reserva`**:

   - **Propiedades:**
     - `cliente` (Cliente): Objeto `Cliente` que realiza la reserva.
     - `habitacion` (Habitacion): Objeto `Habitacion` que se reserva.
     - `fechaInicio` (String): Fecha de inicio de la reserva.
     - `fechaFin` (String): Fecha de fin de la reserva.
   - **Métodos:**
     - Constructor para inicializar las propiedades.
     - Getters y setters para todas las propiedades.
     - Método `mostrarInformacion()` que muestra la información de la reserva.

4. **Clase `Hotel`**:
   - **Propiedades:**
     - `nombre` (String): Nombre del hotel.
     - `direccion` (String): Dirección del hotel.
     - `habitaciones` (ArrayList<Habitacion>): Lista de habitaciones del hotel.
     - `reservas` (ArrayList<Reserva>): Lista de reservas realizadas.
   - **Métodos:**
     - Constructor para inicializar las propiedades.
     - Método `agregarHabitacion(Habitacion habitacion)` que agrega una habitación a la lista de habitaciones.
     - Método `realizarReserva(Cliente cliente, int numeroHabitacion, String fechaInicio, String fechaFin)` que realiza una reserva si la habitación está disponible.
     - Método `cancelarReserva(Cliente cliente, int numeroHabitacion)` que cancela una reserva si existe.
     - Método `consultarDisponibilidad()` que muestra la disponibilidad de todas las habitaciones.
     - Método `mostrarInformacionReservas()` que muestra la información de todas las reservas realizadas.

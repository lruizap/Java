# Enunciado del Ejercicio:

## Sistema de Gestión de Empleados y Clientes

**Objetivo:** Crear un sistema de gestión de personas en una empresa utilizando la programación orientada a objetos en Java, implementando el concepto de herencia. El sistema gestionará empleados y clientes, permitiendo registrar y mostrar información específica de cada tipo de persona.

### Instrucciones:

1. **Clase `Persona` (Clase base)**

   - **Propiedades:**
     - `nombre` (String): Nombre de la persona.
     - `id` (String): Identificador único de la persona.
     - `email` (String): Correo electrónico de la persona.
   - **Métodos:**
     - Constructor para inicializar las propiedades.
     - Getters y setters para todas las propiedades.
     - Método `mostrarInformacion()` que muestra la información básica de la persona.

2. **Clase `Empleado` (Heredada de `Persona`)**

   - **Propiedades:**
     - `salario` (double): Salario del empleado.
     - `puesto` (String): Puesto del empleado en la empresa.
   - **Métodos:**
     - Constructor que inicializa las propiedades de `Persona` y las propiedades adicionales de `Empleado`.
     - Getters y setters para las propiedades adicionales.
     - Método `mostrarInformacion()` que muestra la información del empleado, sobrescribiendo el método de `Persona`.

3. **Clase `Cliente` (Heredada de `Persona`)**

   - **Propiedades:**
     - `fechaRegistro` (String): Fecha de registro del cliente.
     - `compraTotal` (double): Monto total de compras del cliente.
   - **Métodos:**
     - Constructor que inicializa las propiedades de `Persona` y las propiedades adicionales de `Cliente`.
     - Getters y setters para las propiedades adicionales.
     - Método `mostrarInformacion()` que muestra la información del cliente, sobrescribiendo el método de `Persona`.

4. **Clase `Empresa`**

   - **Propiedades:**
     - `empleados` (ArrayList<Empleado>): Lista de empleados de la empresa.
     - `clientes` (ArrayList<Cliente>): Lista de clientes de la empresa.
   - **Métodos:**
     - Constructor para inicializar las listas de empleados y clientes.
     - Método `agregarEmpleado(Empleado empleado)` que agrega un empleado a la lista de empleados.
     - Método `agregarCliente(Cliente cliente)` que agrega un cliente a la lista de clientes.
     - Método `mostrarInformacionPersonas()` que muestra la información de todos los empleados y clientes.

5. **Clase `Main`**
   - En el método `main`, realiza las siguientes acciones:
     - Crear una instancia de `Empresa`.
     - Crear varios objetos `Empleado` y `Cliente`, y agregarlos a la empresa.
     - Mostrar la información de todos los empleados y clientes registrados en la empresa.

### Ejemplo de Salida Esperada:

```plaintext
Empleado:
Nombre: Juan Pérez
ID: E001
Email: juan.perez@empresa.com
Salario: 50000.0
Puesto: Ingeniero

Empleado:
Nombre: Ana Gómez
ID: E002
Email: ana.gomez@empresa.com
Salario: 60000.0
Puesto: Gerente

Cliente:
Nombre: Carlos López
ID: C001
Email: carlos.lopez@correo.com
Fecha de Registro: 2022-01-15
Compra Total: 1500.75

Cliente:
Nombre: María Fernández
ID: C002
Email: maria.fernandez@correo.com
Fecha de Registro: 2023-03-22
Compra Total: 2750.30
```

Este ejercicio involucra la creación de una jerarquía de clases utilizando herencia y la implementación de métodos para manejar la información de empleados y clientes dentro de una empresa.

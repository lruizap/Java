package empresa;

import java.sql.*;
import java.util.Scanner;

public class App {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/Empresa";
    private static final String USER = "root";
    private static final String PASS = "tu_contraseña";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            if (conn != null) {
                System.out.println("Conexión exitosa a la base de datos MySQL.");
                Scanner scanner = new Scanner(System.in);

                Departamento departamento = new Departamento(conn);
                Empleado empleado = new Empleado(conn);
                Proyecto proyecto = new Proyecto(conn);

                boolean salir = false;
                while (!salir) {
                    System.out.println("\nSeleccione una opción:");
                    System.out.println("1. Insertar departamento");
                    System.out.println("2. Actualizar departamento");
                    System.out.println("3. Eliminar departamento");
                    System.out.println("4. Insertar empleado");
                    System.out.println("5. Actualizar empleado");
                    System.out.println("6. Eliminar empleado");
                    System.out.println("7. Insertar proyecto");
                    System.out.println("8. Actualizar proyecto");
                    System.out.println("9. Eliminar proyecto");
                    System.out.println("10. Salir");

                    int opcion = scanner.nextInt();
                    scanner.nextLine();  // Limpiar buffer

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese nombre del departamento: ");
                            String nombreDept = scanner.nextLine();
                            System.out.print("Ingrese ubicación del departamento: ");
                            String ubicacion = scanner.nextLine();
                            departamento.insertar(nombreDept, ubicacion);
                            break;
                        case 2:
                            System.out.print("Ingrese ID del departamento a actualizar: ");
                            int idDept = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Ingrese nuevo nombre del departamento: ");
                            nombreDept = scanner.nextLine();
                            System.out.print("Ingrese nueva ubicación del departamento: ");
                            ubicacion = scanner.nextLine();
                            departamento.actualizar(idDept, nombreDept, ubicacion);
                            break;
                        case 3:
                            System.out.print("Ingrese ID del departamento a eliminar: ");
                            idDept = scanner.nextInt();
                            departamento.eliminar(idDept);
                            break;
                        case 4:
                            System.out.print("Ingrese nombre del empleado: ");
                            String nombreEmp = scanner.nextLine();
                            System.out.print("Ingrese apellido del empleado: ");
                            String apellido = scanner.nextLine();
                            System.out.print("Ingrese email del empleado: ");
                            String email = scanner.nextLine();
                            System.out.print("Ingrese ID del departamento: ");
                            int departamentoId = scanner.nextInt();
                            empleado.insertar(nombreEmp, apellido, email, departamentoId);
                            break;
                        case 5:
                            System.out.print("Ingrese ID del empleado a actualizar: ");
                            int idEmp = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Ingrese nuevo nombre del empleado: ");
                            nombreEmp = scanner.nextLine();
                            System.out.print("Ingrese nuevo apellido del empleado: ");
                            apellido = scanner.nextLine();
                            System.out.print("Ingrese nuevo email del empleado: ");
                            email = scanner.nextLine();
                            System.out.print("Ingrese nuevo ID del departamento: ");
                            departamentoId = scanner.nextInt();
                            empleado.actualizar(idEmp, nombreEmp, apellido, email, departamentoId);
                            break;
                        case 6:
                            System.out.print("Ingrese ID del empleado a eliminar: ");
                            idEmp = scanner.nextInt();
                            empleado.eliminar(idEmp);
                            break;
                        case 7:
                            System.out.print("Ingrese nombre del proyecto: ");
                            String nombreProy = scanner.nextLine();
                            System.out.print("Ingrese descripción del proyecto: ");
                            String descripcion = scanner.nextLine();
                            System.out.print("Ingrese ID del departamento: ");
                            departamentoId = scanner.nextInt();
                            proyecto.insertar(nombreProy, descripcion, departamentoId);
                            break;
                        case 8:
                            System.out.print("Ingrese ID del proyecto a actualizar: ");
                            int idProy = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Ingrese nuevo nombre del proyecto: ");
                            nombreProy = scanner.nextLine();
                            System.out.print("Ingrese nueva descripción del proyecto: ");
                            descripcion = scanner.nextLine();
                            System.out.print("Ingrese nuevo ID del departamento: ");
                            departamentoId = scanner.nextInt();
                            proyecto.actualizar(idProy, nombreProy, descripcion, departamentoId);
                            break;
                        case 9:
                            System.out.print("Ingrese ID del proyecto a eliminar: ");
                            idProy = scanner.nextInt();
                            proyecto.eliminar(idProy);
                            break;
                        case 10:
                            salir = true;
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                }

                scanner.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

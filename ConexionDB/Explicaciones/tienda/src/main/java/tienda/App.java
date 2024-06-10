package tienda;

import java.sql.*;
import java.util.Scanner;

public class App 
{
    private static final String DB_URL = "jdbc:sqlite:tienda.db";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            if (conn != null) {
                System.out.println("Conexión exitosa a la base de datos MySQL.");
                interactuarConBaseDeDatos(conn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void interactuarConBaseDeDatos(Connection conn) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Ver tablas");
            System.out.println("2. Ver datos de una tabla");
            System.out.println("3. Modificar datos");
            System.out.println("4. Crear un nuevo registro");
            System.out.println("5. Eliminar un registro");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer

            switch (opcion) {
                case 1:
                    verTablas(conn);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la tabla: ");
                    String tabla = scanner.nextLine();
                    verDatosDeTabla(conn, tabla);
                    break;
                case 3:
                    modificarDatos(conn, scanner);
                    break;
                case 4:
                    crearNuevoRegistro(conn, scanner);
                    break;
                case 5:
                    eliminarRegistro(conn, scanner);
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }

    private static void verTablas(Connection conn) {
        String query = "SHOW TABLES";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("Tablas en la base de datos:");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void verDatosDeTabla(Connection conn, String tabla) {
        String query = "SELECT * FROM " + tabla;
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void modificarDatos(Connection conn, Scanner scanner) {
        System.out.print("Ingrese la tabla a modificar: ");
        String tabla = scanner.nextLine();
        System.out.print("Ingrese la columna a modificar: ");
        String columna = scanner.nextLine();
        System.out.print("Ingrese el nuevo valor: ");
        String valor = scanner.nextLine();
        System.out.print("Ingrese la condición (e.g., id=1): ");
        String condicion = scanner.nextLine();

        String query = "UPDATE " + tabla + " SET " + columna + " = ? WHERE " + condicion;

        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, valor);
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void crearNuevoRegistro(Connection conn, Scanner scanner) {
        System.out.print("Ingrese la tabla para insertar el nuevo registro: ");
        String tabla = scanner.nextLine();

        String query;
        if (tabla.equalsIgnoreCase("usuarios")) {
            query = "INSERT INTO usuarios (nombre, correo, direccion, fecha_nacimiento) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                System.out.print("Ingrese nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese correo: ");
                String correo = scanner.nextLine();
                System.out.print("Ingrese direccion: ");
                String direccion = scanner.nextLine();
                System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
                String fechaNacimiento = scanner.nextLine();

                pstmt.setString(1, nombre);
                pstmt.setString(2, correo);
                pstmt.setString(3, direccion);
                pstmt.setString(4, fechaNacimiento);
                int filasAfectadas = pstmt.executeUpdate();
                System.out.println("Filas afectadas: " + filasAfectadas);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (tabla.equalsIgnoreCase("productos")) {
            query = "INSERT INTO productos (nombre, descripcion, precio) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                System.out.print("Ingrese nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese descripcion: ");
                String descripcion = scanner.nextLine();
                System.out.print("Ingrese precio: ");
                double precio = scanner.nextDouble();
                scanner.nextLine();  // Limpiar buffer

                pstmt.setString(1, nombre);
                pstmt.setString(2, descripcion);
                pstmt.setDouble(3, precio);
                int filasAfectadas = pstmt.executeUpdate();
                System.out.println("Filas afectadas: " + filasAfectadas);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (tabla.equalsIgnoreCase("pedidos")) {
            query = "INSERT INTO pedidos (usuario_id, producto_id, cantidad, fecha_pedido) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                System.out.print("Ingrese usuario_id: ");
                int usuarioId = scanner.nextInt();
                System.out.print("Ingrese producto_id: ");
                int productoId = scanner.nextInt();
                System.out.print("Ingrese cantidad: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine();  // Limpiar buffer
                System.out.print("Ingrese fecha de pedido (YYYY-MM-DD): ");
                String fechaPedido = scanner.nextLine();

                pstmt.setInt(1, usuarioId);
                pstmt.setInt(2, productoId);
                pstmt.setInt(3, cantidad);
                pstmt.setString(4, fechaPedido);
                int filasAfectadas = pstmt.executeUpdate();
                System.out.println("Filas afectadas: " + filasAfectadas);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Tabla no reconocida.");
        }
    }

    private static void eliminarRegistro(Connection conn, Scanner scanner) {
        System.out.print("Ingrese el nombre de la tabla: ");
        String tabla = scanner.nextLine();

        System.out.print("Ingrese la condición para eliminar (ej. id=1): ");
        String condicion = scanner.nextLine();

        String query = "DELETE FROM " + tabla + " WHERE " + condicion;
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

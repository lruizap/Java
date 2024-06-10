package empresa;

import java.sql.*;

public class Empleado {
    private Connection conn;

    public Empleado(Connection conn) {
        this.conn = conn;
    }

    public void insertar(String nombre, String apellido, String email, int departamentoId) {
        String query = "INSERT INTO Empleados (nombre, apellido, email, departamento_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setString(3, email);
            pstmt.setInt(4, departamentoId);
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizar(int id, String nombre, String apellido, String email, int departamentoId) {
        String query = "UPDATE Empleados SET nombre = ?, apellido = ?, email = ?, departamento_id = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setString(3, email);
            pstmt.setInt(4, departamentoId);
            pstmt.setInt(5, id);
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        String query = "DELETE FROM Empleados WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

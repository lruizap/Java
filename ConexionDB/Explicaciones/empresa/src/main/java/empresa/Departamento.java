package empresa;

import java.sql.*;

public class Departamento {
    private Connection conn;

    public Departamento(Connection conn) {
        this.conn = conn;
    }

    public void insertar(String nombre, String ubicacion) {
        String query = "INSERT INTO Departamentos (nombre, ubicacion) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, ubicacion);
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizar(int id, String nombre, String ubicacion) {
        String query = "UPDATE Departamentos SET nombre = ?, ubicacion = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, ubicacion);
            pstmt.setInt(3, id);
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        String query = "DELETE FROM Departamentos WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

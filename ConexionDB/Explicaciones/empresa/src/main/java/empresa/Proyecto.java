package empresa;

import java.sql.*;

public class Proyecto {
    private Connection conn;

    public Proyecto(Connection conn) {
        this.conn = conn;
    }

    public void insertar(String nombre, String descripcion, int departamentoId) {
        String query = "INSERT INTO Proyectos (nombre, descripcion, departamento_id) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, descripcion);
            pstmt.setInt(3, departamentoId);
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizar(int id, String nombre, String descripcion, int departamentoId) {
        String query = "UPDATE Proyectos SET nombre = ?, descripcion = ?, departamento_id = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, descripcion);
            pstmt.setInt(3, departamentoId);
            pstmt.setInt(4, id);
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        String query = "DELETE FROM Proyectos WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

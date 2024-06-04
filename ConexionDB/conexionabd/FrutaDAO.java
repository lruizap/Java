package ConexionDB.conexionabd;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FrutaDAO {
	
	public static final int ERROR_SQL_BORRAR = -1;
	
	//Creamos el metodo eliminar
		public static int removeFruta(Connection con, int idFruta) {
			try {
				Statement stmt = con.createStatement();
				
				int numAff = stmt.executeUpdate("DELETE FROM FRUTA WHERE idFruta= " + idFruta);
				
				return numAff;
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return ERROR_SQL_BORRAR;
			}
		}
		
		//Creamos el metodo insertar
		public static int insertFruta(Connection con, FrutaDO fruta) {
			try {
				int numAff = ERROR_SQL_BORRAR;
				
				String query = "INSERT INTO avestruz (nombre, daño, puntosRec, tipo) VALUES(?,?,?,?)";
				
				PreparedStatement pstmt = con.prepareStatement(query);
				
				pstmt.setString(1, fruta.getNombre());
				pstmt.setInt(2, fruta.getDaño());
				pstmt.setInt(3, fruta.getPuntosRec());
				pstmt.setString(4, fruta.getTipo());
				
				numAff = pstmt.executeUpdate(query);

				return numAff;
			}
			catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				return ERROR_SQL_BORRAR;
			}
		}
		
		//Creamos el metodo Actualizar
		public static int updateFruta(Connection con, FrutaDO fruta) {
			try {
				Statement stmt = con.createStatement();
				
				boolean campoPrevio = false;
				int numAff = -1;
				String query = "UPDATE FRUTA SET nombre = ?, daño = ?, puntosRec = ?, tipo = ? WHERE idFruta = ?";
				
				if (fruta.getNombre() != null || fruta.getDaño() != 0 ||  fruta.getPuntosRec() != 0 || fruta.getTipo() != null) {
					return 0;
				}
				
				return numAff;
				
			}
			catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				return ERROR_SQL_BORRAR;
			}
		}
		
		//Creamos el metodo cargar
		public static ResultSet loadFruta(Connection con, int idFruta) {
			
			try {
				String query = "SELECT * FROM FRUTA WHERE idFruta=?";
				
				PreparedStatement pstmt = con.prepareStatement(query);
				
				pstmt.setInt(1, idFruta);
				
				ResultSet rs = pstmt.executeQuery();
				
				return rs;
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
	
}

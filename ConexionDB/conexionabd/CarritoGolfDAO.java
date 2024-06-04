package ConexionDB.conexionabd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CarritoGolfDAO {
	
	public static final int ERROR_SQL_BORRAR = -1;
	
	//Creamos el metodo eliminar
	public static int removeCarrito(Connection con, int idCarrito) {
		try {
			Statement stmt = con.createStatement();
			
			int numAff = stmt.executeUpdate("DELETE FROM CARRITOGOLF WHERE idCarrito= " + idCarrito);
			
			return numAff;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR_SQL_BORRAR;
		}
	}
	
	//Creamos el metodo insetar
		public static int insertAvestruz(Connection con, CarritoGolfDO carrito) {
			try {
				int numAff = ERROR_SQL_BORRAR;
				
				String query = "INSERT INTO carrito (numSerie, marca, velocidadMax, armamento, municion) VALUES(?,?,?,?,?)";
				
				PreparedStatement pstmt = con.prepareStatement(query);
				
				pstmt.setInt(1, carrito.getNumSerie());
				pstmt.setString(2, carrito.getMarca());
				pstmt.setInt(3, carrito.getVelocidadMax());
				pstmt.setString(4, carrito.getArmamento());
				pstmt.setInt(5, carrito.getMunicion());
				
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
		public static int updateCarrito(Connection con, CarritoGolfDO carrito) {
			try {
				Statement stmt = con.createStatement();
				
				boolean campoPrevio = false;
				int numAff = -1;
				String query = "UPDATE CARRITO SET numSerie = ?, marca = ?, velocidadMax = ?, armamento = ?, municion = ? WHERE idCarrito = ?";
				
				if (carrito.getNumSerie() != 0 || carrito.getMarca() != null ||  carrito.getVelocidadMax() != 0 || carrito.getArmamento() != null || carrito.getMunicion() != 0) {
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
		public static ResultSet loadCarrito(Connection con, int idCarrito) {
			
			try {
				String query = "SELECT * FROM CARRITO WHERE idCarrito=?";
				
				PreparedStatement pstmt = con.prepareStatement(query);
				
				pstmt.setInt(1, idCarrito);
				
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

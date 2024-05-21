package conexionabd;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class KoalaDAO {
	
	public static final int ERROR_SQL_BORRAR = -1;
	
	//Creamos el metodo eliminar
		public static int removeKoala(Connection con, int idKoala) {
			try {
				Statement stmt = con.createStatement();
				
				int numAff = stmt.executeUpdate("DELETE FROM KOALA WHERE idKoala= " + idKoala);
				
				return numAff;
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return ERROR_SQL_BORRAR;
			}
		}
		
		//Creamos el metodo insetar
		public static int insertKoala(Connection con, KoalaDO koala) {
			try {
				int numAff = ERROR_SQL_BORRAR;
				
				String query = "INSERT INTO avestruz (nombre, nickGuerra, edad, color, fuerza, inteligencia, horasSueño, tiempoBerserk) VALUES(?,?,?,?,?,?,?,?)";
				
				PreparedStatement pstmt = con.prepareStatement(query);
				
				pstmt.setString(1, koala.getNombre());
				pstmt.setString(2, koala.getNickGuerra());
				pstmt.setInt(3, koala.getEdad());
				pstmt.setString(4, koala.getColor());
				pstmt.setInt(5, koala.getFuerza());
				pstmt.setInt(6, koala.getInteligencia());
				pstmt.setInt(7, koala.getHorasSueño());
				pstmt.setInt(8, koala.getTiempoBerserk());
				
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
		public static int updateKoala(Connection con, KoalaDO koala) {
			try {
				Statement stmt = con.createStatement();
				
				boolean campoPrevio = false;
				int numAff = -1;
				String query = "UPDATE KOALA SET nombre = ?, nickGuerra = ?, edad = ?, color = ?, fuerza = ?, inteligencia = ?, horasSueño = ?, tiempoBerserk = ? WHERE idKoala = ?";
				
				if (koala.getNombre() != null || koala.getNickGuerra() != null ||  koala.getEdad() != 0 || koala.getColor() != null || koala.getFuerza() != 0 || koala.getInteligencia() != 0 || koala.getHorasSueño() != 0 || koala.getTiempoBerserk() != 0) {
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
		public static ResultSet loadKoala(Connection con, int idKoala) {
			
			try {
				String query = "SELECT * FROM KOALA WHERE idKoala=?";
				
				PreparedStatement pstmt = con.prepareStatement(query);
				
				pstmt.setInt(1, idKoala);
				
				ResultSet rs = pstmt.executeQuery();
				
				return rs;
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		
		//Funcion cargarFrutas
		public ArrayList<FrutaDO> cargarFrutas(int id, Connection con) {
	        ArrayList<FrutaDO> listaFrutas = new ArrayList<>();

	        try {
	            String query = "SELECT * FROM frutas WHERE id_koala = ?";
	            
	            PreparedStatement pstmt = con.prepareStatement(query);
	            pstmt.setInt(1, id);
	            
	            ResultSet rs = pstmt.executeQuery();
	            
	            while (rs.next()) {
	                int idFruta = rs.getInt("idFruta");
	                String nombre = rs.getString("nombre");
	                int daño = rs.getInt(0);
	                int puntosRec = rs.getInt(0);
	                String tipo = rs.getString("tipo");
	                
	                FrutaDO fruta = new FrutaDO(idFruta, nombre, daño, puntosRec, tipo);
	                listaFrutas.add(fruta);
	            }
	            
	            rs.close();
	            pstmt.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return listaFrutas;
	    }
	
}

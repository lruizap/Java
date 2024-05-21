package conexionabd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AvestruzDAO {

	public static final int ERROR_SQL_BORRAR = -1;
	
	//Creamos el metodo eliminar
	public static int removeAvestruz(Connection con, int idAvestruz) {
		try {
			Statement stmt = con.createStatement();
			
			int numAff = stmt.executeUpdate("DELETE FROM AVESTRUZ WHERE idAvestruz= " + idAvestruz);
			
			return numAff;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR_SQL_BORRAR;
		}
	}
	
	//Creamos el metodo insertar
	public static int insertAvestruz(Connection con, AvestruzDO avestruz) {
		try {
			int numAff = ERROR_SQL_BORRAR;
			
			String query = "INSERT INTO avestruz (nombre, nickGuerra, edad, altura, nivelMalaLeche, numHuevos) VALUES(?,?,?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, avestruz.getNombre());
			pstmt.setString(2, avestruz.getNickGuerra());
			pstmt.setInt(3, avestruz.getEdad());
			pstmt.setInt(4, avestruz.getAltura());
			pstmt.setInt(5, avestruz.getNivelMalaLeche());
			pstmt.setInt(6, avestruz.getNumHuevos());
			
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
	public static int updateAvestruz(Connection con, AvestruzDO avestruz) {
		try {
			Statement stmt = con.createStatement();
			
			boolean campoPrevio = false;
			int numAff = -1;
			String query = "UPDATE AVESTRUZ SET nombre = ?, nickGuerra = ?, edad = ?, altura = ?, nivelMalaLeche = ?, numHuevos = ? WHERE idAvestuz = ?";
			
			if (avestruz.getNombre() != null || avestruz.getNickGuerra() != null ||  avestruz.getEdad() != 0 || avestruz.getAltura() != 0 || avestruz.getNivelMalaLeche() != 0 || avestruz.getNumHuevos() != 0) {
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
	public static ResultSet loadAvestruz(Connection con, int idAvestruz) {
		
		try {
			String query = "SELECT * FROM AVESTRUZ WHERE idAvestruz=?";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, idAvestruz);
			
			ResultSet rs = pstmt.executeQuery();
			
			return rs;
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	//Funcion cargarLacayos
	public static ArrayList<KoalaDO> cargarLacayos(Connection con, int idAvestruz) {
		ArrayList<KoalaDO> listaKoalas = new ArrayList<>();
		
		try {
            
            String query = "SELECT * FROM koalas WHERE id_avestruz = ?";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, idAvestruz);
            
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String nickGuerra = rs.getString("nickGuerra");
                int edad = rs.getInt(0);
                String color = rs.getString("color");
                int fuerza = rs.getInt(0);
                int inteligencia = rs.getInt(0);
                int horasSueño = rs.getInt(0);
                int tiempoBerserk = rs.getInt(0);
                
                KoalaDO koala = new KoalaDO(id, nombre, nickGuerra, edad, color, fuerza, inteligencia, horasSueño, tiempoBerserk);
                listaKoalas.add(koala);
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaKoalas;
	}
	
	//Funcion cargarFrutas
	public int cargarFrutas(int idAvestruz, Connection con) {
        int cantidadFrutas = 0;

        try {
            String query = "SELECT SUM(cantidad_frutas) AS total_frutas FROM fruta WHERE id_avestruz = ?";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, idAvestruz);
            
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                cantidadFrutas = rs.getInt("total_frutas");
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cantidadFrutas;
    }
	
	//Funcion cargarLacayosFiltrado
	public ArrayList<KoalaDO> cargarLacayosFiltrado(Connection con, int idAvestruz, String[] parametros) {
        ArrayList<KoalaDO> listaKoalas = new ArrayList<>();

        try {
            if (parametros.length != 4) {
                throw new IllegalArgumentException("El array de parámetros debe tener exactamente 4 elementos");
            }
            
            String campo = parametros[0];
            String comparacion = parametros[1];
            String valor = parametros[2];
            String tipoDato = parametros[3];

            if (!tipoDato.equals("entero") && !tipoDato.equals("cadena")) {
                throw new IllegalArgumentException("El tipo de dato debe ser 'entero' o 'cadena'");
            }

            if (!comparacion.equals(">") && !comparacion.equals("<") && !comparacion.equals("=") && !comparacion.equals("like")) {
                throw new IllegalArgumentException("El operador de comparación no es válido");
            }

            String query = "SELECT * FROM koalas WHERE id_avestruz = ? AND ";

            if (tipoDato.equals("entero")) {
                query += campo + " " + comparacion + " " + valor;
            } else if (tipoDato.equals("cadena")) {
                query += campo + " " + comparacion + " '" + valor + "'";
            }

            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, idAvestruz);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
            	int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String nickGuerra = rs.getString("nickGuerra");
                int edad = rs.getInt(0);
                String color = rs.getString("color");
                int fuerza = rs.getInt(0);
                int inteligencia = rs.getInt(0);
                int horasSueño = rs.getInt(0);
                int tiempoBerserk = rs.getInt(0);
                
                KoalaDO koala = new KoalaDO(id, nombre, nickGuerra, edad, color, fuerza, inteligencia, horasSueño, tiempoBerserk);
                listaKoalas.add(koala);
            }

            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaKoalas;
    }
	
	//Funcion cargarLacayosPaginado
	public ArrayList<KoalaDO> cargarLacayosPaginado(Connection con, int idAvestruz, int numElem, int numPag) {
        ArrayList<KoalaDO> listaKoalas = new ArrayList<>();

        try {
            int offset = (numPag - 1) * numElem;

            String query = "SELECT * FROM koalas WHERE id_avestruz = ? LIMIT ? OFFSET ?";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, idAvestruz);
            pstmt.setInt(2, numElem);
            pstmt.setInt(3, offset);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
            	int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String nickGuerra = rs.getString("nickGuerra");
                int edad = rs.getInt(0);
                String color = rs.getString("color");
                int fuerza = rs.getInt(0);
                int inteligencia = rs.getInt(0);
                int horasSueño = rs.getInt(0);
                int tiempoBerserk = rs.getInt(0);
                
                KoalaDO koala = new KoalaDO(id, nombre, nickGuerra, edad, color, fuerza, inteligencia, horasSueño, tiempoBerserk);
                listaKoalas.add(koala);
            }

            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaKoalas;
    }
	
}

package conexionabd;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {
	
	public static Connection conectarBD() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tienda","root","");
			
			return con;
		}
		catch (Exception exception) {
			System.out.println("Error al conectarse");
			exception.printStackTrace();
			return null;
		}
			
	}
	
}

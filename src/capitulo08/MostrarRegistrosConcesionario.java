package capitulo08;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;

public class MostrarRegistrosConcesionario {

	public static void main(String[] args) {
		queryConcesionario();
	}
	
	/**
	 * 
	 */
	private static void queryConcesionario() {
		
		String driver = JDBCProperties.getProperty("JDBC_DRIVER_CLASS");
		String user = JDBCProperties.getProperty("JDBC_USER");
		String password = JDBCProperties.getProperty("JDBC_PASSWORD");
		String host = JDBCProperties.getProperty("JDBC_HOST");
		String schema = JDBCProperties.getProperty("JDBC_SCHEMA_NAME");
		String properties = JDBCProperties.getProperty("JDBC_PROPERTIES");
		
		try {
			// A través de la siguiente línea se comprueba si hay acceso al driver MySQL, si no es así
			// no se puede trabajar con esa BBDD.
			Class.forName(driver);
			
			// Se necesita obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// se le tiene que pasar los parámetros de conexión.
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://" + host + "/" + schema + properties, user, password);
			
			// Para poder ejecutar una consulta se necesita utilizar un objeto de tipo Statement
			Statement s = (Statement) conn.createStatement();
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery("select * from concesionario");
			
			// Navegación del objeto ResultSet
			while (rs.next())
				System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " " + rs.getString(3)+ " " + rs.getString(4));
			
			// Se cierran los elementos
			rs.close();
			s.close();
			conn.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver MySQL");
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
		}
	}

}

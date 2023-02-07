package capitulo08.bloque01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class InsertUpdateDelete {

	public static void main(String[] args) {
		int opt;
		try {
			Connection conn = getConnection();
			do {
				opt = menu(conn);
			} while (opt != 0);
			conn.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver MySQL");
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
		}
	}
	
	/**
	 * Método para realizar la conexión
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		String driver = capitulo08.JDBCProperties.getProperty("JDBC_DRIVER_CLASS");
		String user = capitulo08.JDBCProperties.getProperty("JDBC_USER");
		String password = capitulo08.JDBCProperties.getProperty("JDBC_PASSWORD");
		String host = capitulo08.JDBCProperties.getProperty("JDBC_HOST");
		String schema = capitulo08.JDBCProperties.getProperty("JDBC_SCHEMA_NAME");
		String properties = capitulo08.JDBCProperties.getProperty("JDBC_PROPERTIES");
		Class.forName(driver);
		return (Connection) DriverManager.getConnection ("jdbc:mysql://" + host + "/" + schema + properties, user, password);
	}
	
	/**
	 * Método para ejecutar el menú
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	public static int menu(Connection conn) throws SQLException {
		int opt = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la opción deseada:\n0. Salir\n1. Mostrar registros"
				+ "\n2. Insertar registro\n3. Actualizar registro\n4. Eliminar registro"));
		if (opt == 1) select(conn);
		if (opt == 2) insert(conn);
		if (opt == 3) update(conn);
		if (opt == 4) delete(conn);
		return opt;
	}
	
	/**
	 * Método para mostrar los registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void select(Connection conn) throws SQLException {
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select * from tutorialjavacoches.fabricante");
		while (rs.next())
			System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " " + rs.getString(3));
		System.out.println();
		rs.close();
		s.close();
	}
	
	/**
	 * Método para insertar registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void insert(Connection conn) throws SQLException {
		Statement s = (Statement) conn.createStatement();
		String cif = JOptionPane.showInputDialog("Introduzca el CIF del fabricante:");
		String name = JOptionPane.showInputDialog("Introduzca el nombre del fabricante:");
		int affectedRows = s.executeUpdate("insert into tutorialjavacoches.fabricante values ("
				+ getNextValid(conn) + ",'" + cif + "','" + name + "')");
		System.out.println("Filas afectadas: " + affectedRows + "\n");
		s.close();
	}
	
	/**
	 * Método para actualizar registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void update(Connection conn) throws SQLException {
		Statement s = (Statement) conn.createStatement();
		int id, affectedRows = 0;
		do {
			id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ID del fabricante que quiere actualizar:"));
			if (!exists(conn,id)) System.out.println("El ID introducido no es válido.\n");
		} while (!exists(conn,id));
		String cif = JOptionPane.showInputDialog("Introduzca el nuevo CIF del fabricante:");
		String name = JOptionPane.showInputDialog("Introduzca el nuevo nombre del fabricante:");
		affectedRows = s.executeUpdate("update tutorialjavacoches.fabricante set cif = '"
				+ cif + "', nombre = '" + name + "' where id = " + id);
		System.out.println("Filas afectadas: " + affectedRows + "\n");
		s.close();
	}
	
	/**
	 * Método para eliminar registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void delete(Connection conn) throws SQLException {
		Statement s = (Statement) conn.createStatement();
		int id, affectedRows = 0;
		do {
			id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ID del fabricante que quiere eliminar:"));
			if (!exists(conn,id)) System.out.println("El ID introducido no es válido.\n");
		} while (!exists(conn,id));
		affectedRows = s.executeUpdate("delete from tutorialjavacoches.fabricante where id = " + id);
		System.out.println("Filas afectadas: " + affectedRows + "\n");
		s.close();
	}
	
	/**
	 * Método para comprobar el siguiente registro válido
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	public static int getNextValid(Connection conn) throws SQLException {
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) from tutorialjavacoches.fabricante");		
		while (rs.next()) {
			int id = rs.getInt(1) + 1;
			rs.close();
			s.close();
			return id;
		}
		rs.close();
		s.close();
		return 1;
	}
	
	/**
	 * Método para comprobar si existe el registro
	 * @param conn
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public static boolean exists(Connection conn, int id) throws SQLException {
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select id from tutorialjavacoches.fabricante where id = " + id);
		if (rs.next()) {
			rs.close();
			s.close();
			return true;
		}
		rs.close();
		s.close();
		return false;
	}

}

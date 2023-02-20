package capitulo08.bloque02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Principal {

	/**
	 * Método main
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Connection conn = getConnection();
			tablesMenu(conn);
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
	 * Método para ejecutar el menú de selección de tabla
	 * @return
	 */
	private static void tablesMenu(Connection conn) throws SQLException {
		int opt;
		do {
			opt = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la opción deseada:\n0. Salir\n1. Tabla fabricante"
					+ "\n2. Tabla concesionario\n3. Tabla cliente\n4. Tabla coche\n5. Tabla venta"));
			if (opt == 1) statementsMenu(conn, "fabricante");
			else if (opt == 2) statementsMenu(conn, "concesionario");
			else if (opt == 3) statementsMenu(conn, "cliente");
			else if (opt == 4) statementsMenu(conn, "coche");
			else if (opt == 5) statementsMenu(conn, "venta");
		} while (opt > 0);
	}
	
	/**
	 * Método para ejecutar el menú de CRUD
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	public static void statementsMenu(Connection conn, String table) throws SQLException {
		int opt;
		do {
			opt = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la opción deseada:\n0. Salir\n1. Mostrar registros"
					+ "\n2. Insertar registro\n3. Actualizar registro\n4. Eliminar registro"));
			if (opt == 1) select(conn, table);
			else if (opt == 2) {
				if (table == "fabricante") ControladorFabricante.insert(conn);
				else if (table == "concesionario") ControladorConcesionario.insert(conn);
				else if (table == "cliente") ControladorCliente.insert(conn);
				else if (table == "coche") ControladorCoche.insert(conn);
				else if (table == "venta") ControladorVenta.insert(conn);
			}
			else if (opt == 3) {
				if (table == "fabricante") ControladorFabricante.update(conn);
				else if (table == "concesionario") ControladorConcesionario.update(conn);
				else if (table == "cliente") ControladorCliente.update(conn);
				else if (table == "coche") ControladorCoche.update(conn);
				else if (table == "venta") ControladorVenta.update(conn);
			}
			else if (opt == 4) delete(conn, table);
		} while (opt > 0);
	}
	
	/**
	 * Método para mostrar los registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void select(Connection conn, String table) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("select * from tutorialjavacoches." + table);
		ResultSet rs = ps.executeQuery();
			if (table == "fabricante")
				while (rs.next())
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			else if (table == "concesionario")
				while (rs.next())
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			else if (table == "cliente")
				while (rs.next())
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
							+ " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getBoolean(7));
			else if (table == "coche")
				while (rs.next())
					System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getString(3)
							+ " " + rs.getString(4) + " " + rs.getString(5));
			else if (table == "venta")
				while (rs.next())
					System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getInt(3) + " "
							+ rs.getInt(4) + " " + rs.getString(5) + " " + rs.getFloat(6));
		System.out.println();
		rs.close();
		ps.close();
	}
	
	/**
	 * Método para eliminar registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void delete(Connection conn, String table) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("delete from tutorialjavacoches." + table + " where id = " 
					+ getId(conn, table, null, "Introduzca el ID que quiere eliminar:"));
		System.out.println("Filas afectadas: " + ps.executeUpdate() + "\n");
		ps.close();
	}
	
	/**
	 * Método para comprobar el siguiente registro válido
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	public static int getNextValid(Connection conn, String table) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("select max(id) from tutorialjavacoches." + table);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			int id = rs.getInt(1) + 1;
			rs.close();
			ps.close();
			return id;
		}
		rs.close();
		ps.close();
		return 1;
	}
	
	/**
	 * Método para introducir una ID
	 * @param conn
	 * @param str
	 * @return
	 * @throws SQLException
	 */
	public static int getId(Connection conn, String table, String id, String str) throws SQLException {
		int newId;
		do {
			newId = Integer.parseInt(getNewValue(id, str));
			if (!exists(conn, table, newId)) JOptionPane.showMessageDialog(null,"El ID introducido no es válido.\n");
		} while (!exists(conn, table, newId));
		return newId;
	}
	
	/**
	 * Método para comprobar si existe una ID
	 * @param conn
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public static boolean exists(Connection conn, String table, int id) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("select id from tutorialjavacoches." + table + " where id = " + id);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			rs.close();
			ps.close();
			return true;
		}
		rs.close();
		ps.close();
		return false;
	}
	
	/**
	 * Método para introducir un nuevo valor
	 * @param value
	 * @param str
	 * @return
	 */
	public static String getNewValue(String value, String str) {
		String newValue = JOptionPane.showInputDialog(str);
		if (newValue.isBlank()) return value;
		return newValue;
	}
	
	/**
	 * Método para introducir una fecha
	 * @param str
	 * @return
	 */
	public static Date getDate(String date, String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date parsedDate = null;
		try {
			parsedDate = sdf.parse(getNewValue(date, str));
		} catch (ParseException e) {
			System.out.println ("La fecha introducida no tiene el formato correcto (dd-MM-yyyy).");
		}
		return parsedDate;
	}

}

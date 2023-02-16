package capitulo08.bloque02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ControladorCoche {
	
	/**
	 * Método para insertar registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void insert(Connection conn) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("insert into tutorialjavacoches.coche"
				+ " (id, idfabricante, bastidor, modelo, color) values (?, ?, ?, ?, ?)");
		ps.setInt(1, Principal.getNextValid(conn, "coche"));
		Principal.select(conn, "fabricante");
		ps.setInt(2, Principal.getId(conn, "fabricante", null, "Introduzca el ID del fabricante:"));
		ps.setString(3, JOptionPane.showInputDialog("Introduzca el bastidor:"));
		ps.setString(4, JOptionPane.showInputDialog("Introduzca el modelo:"));
		ps.setString(5, JOptionPane.showInputDialog("Introduzca el color:"));
		System.out.println("Filas afectadas: " + ps.executeUpdate() + "\n");
		ps.close();
	}
	
	/**
	 * Método para actualizar registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void update(Connection conn) throws SQLException {
		int id = Principal.getId(conn, "coche", null, "Introduzca el ID:");
		PreparedStatement ps = conn.prepareStatement("select * from tutorialjavacoches.coche where id = " + id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		PreparedStatement psu = conn.prepareStatement("update tutorialjavacoches.coche set "
				+ "idfabricante = ?, bastidor = ?, modelo = ?, color = ? where id = " + id);
		Principal.select(conn, "fabricante");
		psu.setInt(1, Principal.getId(conn, "fabricante", rs.getString(2), "Introduzca el nuevo ID del fabricante:"
				+ "\n(deje el campo vacío si no quiere modificarlo)"));
		psu.setString(2, Principal.getNewValue(rs.getString(3), "Introduzca el nuevo bastidor:"
				+ "\n(deje el campo vacío si no quiere modificarlo)"));
		psu.setString(3, Principal.getNewValue(rs.getString(4), "Introduzca el nuevo modelo:"
				+ "\n(deje el campo vacío si no quiere modificarlo)"));
		psu.setString(4, Principal.getNewValue(rs.getString(5), "Introduzca el nuevo color:"
				+ "\n(deje el campo vacío si no quiere modificarlo)"));
		System.out.println("Filas afectadas: " + psu.executeUpdate() + "\n");
		psu.close();
		rs.close();
		ps.close();
	}

}

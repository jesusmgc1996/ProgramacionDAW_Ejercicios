package capitulo08.bloque02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ControladorFabricante {
	
	/**
	 * Método para insertar registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void insert(Connection conn) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("insert into tutorialjavacoches.fabricante"
				+ " (id, cif, nombre) values (?, ?, ?)");
		ps.setInt(1, Principal.getNextValid(conn, "fabricante"));
		ps.setString(2, JOptionPane.showInputDialog("Introduzca el CIF:"));
		ps.setString(3, JOptionPane.showInputDialog("Introduzca el nombre:"));
		System.out.println("Filas afectadas: " + ps.executeUpdate() + "\n");
		ps.close();
	}
	
	/**
	 * Método para actualizar registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void update(Connection conn) throws SQLException {
		int id = Principal.getId(conn, "fabricante", null, "Introduzca el ID:");
		PreparedStatement ps = conn.prepareStatement("select * from tutorialjavacoches.fabricante where id = " + id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		PreparedStatement psu = conn.prepareStatement("update tutorialjavacoches.fabricante"
				+ " set cif = ?, nombre = ? where id = " + id);
		psu.setString(1, Principal.getNewValue(rs.getString(2),	"Introduzca el nuevo CIF:"
				+ "\n(deje el campo vacío si no quiere modificarlo)"));
		psu.setString(2, Principal.getNewValue(rs.getString(3), "Introduzca el nuevo nombre:"
				+ "\n(deje el campo vacío si no quiere modificarlo)"));
		System.out.println("Filas afectadas: " + psu.executeUpdate() + "\n");
		psu.close();
		rs.close();
		ps.close();
	}
	
}

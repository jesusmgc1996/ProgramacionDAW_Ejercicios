package capitulo08.bloque02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ControladorConcesionario {
	
	/**
	 * Método para insertar registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void insert(Connection conn) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("insert into tutorialjavacoches.concesionario"
				+ " (id, cif, nombre, localidad) values (?, ?, ?, ?)");
		ps.setInt(1, Principal.getNextValid(conn, "concesionario"));
		ps.setString(2, JOptionPane.showInputDialog("Introduzca el CIF:"));
		ps.setString(3, JOptionPane.showInputDialog("Introduzca el nombre:"));
		ps.setString(4, JOptionPane.showInputDialog("Introduzca la localidad:"));
		System.out.println("Filas afectadas: " + ps.executeUpdate() + "\n");
		ps.close();
	}
	
	/**
	 * Método para actualizar registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void update(Connection conn) throws SQLException {
		int id = Principal.getId(conn, "concesionario", null, "Introduzca el ID:");
		PreparedStatement ps = conn.prepareStatement("select * from tutorialjavacoches.concesionario where id = " + id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		PreparedStatement psu = conn.prepareStatement("update tutorialjavacoches.concesionario"
				+ " set cif = ?, nombre = ?, localidad = ? where id = " + id);
		psu.setString(1, Principal.getNewValue(rs.getString(2),	"Introduzca el nuevo CIF:"
				+ "\n(deje el campo vacío si no quiere modificarlo)"));
		psu.setString(2, Principal.getNewValue(rs.getString(3), "Introduzca el nuevo nombre:"
				+ "\n(deje el campo vacío si no quiere modificarlo)"));
		psu.setString(3, Principal.getNewValue(rs.getString(4), "Introduzca la nueva localidad:"
				+ "\n(deje el campo vacío si no quiere modificarla)"));
		System.out.println("Filas afectadas: " + psu.executeUpdate() + "\n");
		psu.close();
		rs.close();
		ps.close();
	}
	
}

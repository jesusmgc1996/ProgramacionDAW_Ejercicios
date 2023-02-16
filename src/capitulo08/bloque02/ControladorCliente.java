package capitulo08.bloque02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ControladorCliente {
	
	/**
	 * Método para insertar registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void insert(Connection conn) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("insert into tutorialjavacoches.cliente "
				+ "(id, nombre, apellidos, localidad, dniNie, fechaNac, activo) values (?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, Principal.getNextValid(conn, "cliente"));
		ps.setString(2, JOptionPane.showInputDialog("Introduzca el nombre:"));
		ps.setString(3, JOptionPane.showInputDialog("Introduzca los apellidos:"));
		ps.setString(4, JOptionPane.showInputDialog("Introduzca la localidad:"));
		ps.setString(5, JOptionPane.showInputDialog("Introduzca el DNI:"));
		ps.setDate(6, new Date(Principal.getDate(null, "Introduzca la fecha de nacimiento (dd-MM-yyyy):").getTime()));
		ps.setBoolean(7, Boolean.parseBoolean(JOptionPane.showInputDialog("Introduzca el estado laboral:"
				+ "\n- true (si está activo)\n- false (si no está activo)")));
		System.out.println("Filas afectadas: " + ps.executeUpdate() + "\n");
		ps.close();
	}
	
	/**
	 * Método para actualizar registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void update(Connection conn) throws SQLException {
		int id = Principal.getId(conn, "cliente", null, "Introduzca el ID:");
		PreparedStatement ps = conn.prepareStatement("select * from tutorialjavacoches.cliente where id = " + id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		PreparedStatement psu = conn.prepareStatement("update tutorialjavacoches.cliente set "
				+ "nombre = ?, apellidos = ?, localidad = ?, dniNie = ?, fechaNac = ?, activo = ? where id = " + id);
		psu.setString(1, Principal.getNewValue(rs.getString(2), "Introduzca el nuevo nombre:"
				+ "\n(deje el campo vacío si no quiere modificarlo)"));
		psu.setString(2, Principal.getNewValue(rs.getString(3), "Introduzca los nuevos apellidos:"
				+ "\n(deje el campo vacío si no quiere modificarlos)"));
		psu.setString(3, Principal.getNewValue(rs.getString(4), "Introduzca la nuevo localidad:"
				+ "\n(deje el campo vacío si no quiere modificarla)"));
		psu.setString(4, Principal.getNewValue(rs.getString(5), "Introduzca el nuevo DNI:"
				+ "\n(deje el campo vacío si no quiere modificarlo)"));
		psu.setDate(5, new Date(Principal.getDate(rs.getDate(6).toString(), "Introduzca la  nueva fecha de nacimiento (dd-MM-yyyy):"
				+ "\n(deje el campo vacío si no quiere modificarla)").getTime()));
		Boolean active = rs.getBoolean(7);
		psu.setBoolean(6, Boolean.parseBoolean(Principal.getNewValue(active.toString(), "Introduzca el nuevo estado laboral:"
				+ "\n(deje el campo vacío si no quiere modificarlo)\n- true (si está activo)\n- false (si no está activo)")));
		System.out.println("Filas afectadas: " + psu.executeUpdate() + "\n");
		psu.close();
		rs.close();
		ps.close();
	}

}

package capitulo08.bloque02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ControladorVenta {
	
	/**
	 * Método para insertar registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void insert(Connection conn) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("insert into tutorialjavacoches.venta "
				+ "(id, idCliente, idConcesionario, idCoche, fecha, precioVenta) values (?, ?, ?, ?, ?, ?)");
		ps.setInt(1, Principal.getNextValid(conn, "venta"));
		Principal.select(conn, "cliente");
		ps.setInt(2, Principal.getId(conn, "cliente", null, "Introduzca el ID del cliente:"));
		Principal.select(conn, "concesionario");
		ps.setInt(3, Principal.getId(conn, "concesionario", null, "Introduzca el ID del concesionario:"));
		Principal.select(conn, "coche");
		ps.setInt(4, Principal.getId(conn, "coche", null, "Introduzca el ID del coche:"));
		ps.setDate(5, new Date(Principal.getDate(null, "Introduzca la fecha de venta (dd-MM-yyyy):").getTime()));
		ps.setFloat(6, Float.parseFloat(JOptionPane.showInputDialog("Introduzca el precio:")));
		System.out.println("Filas afectadas: " + ps.executeUpdate() + "\n");
		ps.close();
	}
	
	/**
	 * Método para actualizar registros
	 * @param conn
	 * @throws SQLException
	 */
	public static void update(Connection conn) throws SQLException {
		int id = Principal.getId(conn, "venta", null, "Introduzca el ID:");
		PreparedStatement ps = conn.prepareStatement("select * from tutorialjavacoches.venta where id = " + id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		PreparedStatement psu = conn.prepareStatement("update tutorialjavacoches.venta set "
				+ "idCliente = ?, idConcesionario = ?, idCoche = ?, fecha = ?, precioVenta = ? where id = " + id);
		Principal.select(conn, "cliente");
		psu.setInt(1, Principal.getId(conn, "cliente", rs.getString(2), "Introduzca el nuevo ID del cliente:"
				+ "\n(deje el campo vacío si no quiere modificarlo)"));
		Principal.select(conn, "concesionario");
		psu.setInt(2, Principal.getId(conn, "concesionario", rs.getString(3), "Introduzca el nuevo ID del concesionario:"
				+ "\n(deje el campo vacío si no quiere modificarlo)"));
		Principal.select(conn, "coche");
		psu.setInt(3, Principal.getId(conn, "coche", rs.getString(4), "Introduzca el nuevo ID del coche:"
				+ "\n(deje el campo vacío si no quiere modificarlo)"));
		psu.setDate(4, new Date(Principal.getDate(rs.getDate(5).toString(), "Introduzca la nueva fecha de venta (dd-MM-yyyy):"
				+ "\n(deje el campo vacío si no quiere modificarla)").getTime()));
		psu.setFloat(5, Float.parseFloat(Principal.getNewValue(rs.getString(6), "Introduzca el nuevo precio:"
				+ "\n(deje el campo vacío si no quiere modificarlo)")));
		System.out.println("Filas afectadas: " + psu.executeUpdate() + "\n");
		psu.close();
		rs.close();
		ps.close();
	}

}

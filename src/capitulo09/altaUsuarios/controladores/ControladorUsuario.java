package capitulo09.altaUsuarios.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import capitulo09.altaUsuarios.modelos.Usuario;

public class ControladorUsuario {
	
	/**
	 * Método para obtener un registro
	 * @param usuario
	 * @return
	 */
	public static Usuario getUsuario(String usuario) {
		Usuario u = null;
		try {
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from altausuarios.usuario where usuario = '" + usuario + "'");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u = new Usuario();
				u.setId(rs.getInt(1));
				u.setEmail(rs.getString(2));
				u.setUsuario(rs.getString(3));
				u.setPassword(rs.getString(4));
				u.setIdIdioma(rs.getInt(5));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	/**
	 * Método para insertar un registro
	 * @param u
	 * @return
	 */
	public static int insertar(Usuario u) {
		int affectedRows = 0;
		try {
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into altausuarios.usuario values (?, ?, ?, ?, ?)");
			ps.setInt(1, getSiguienteIdValido(conn));
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getUsuario());
			ps.setString(4, u.getPassword());
			ps.setInt(5, u.getIdIdioma());
			affectedRows = ps.executeUpdate();
			ps.close();
			conn.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return affectedRows;
	}
	
	/**
	 * Método para obtener el siguiente id válido
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	public static int getSiguienteIdValido(Connection conn) throws SQLException {
		int id = 1;
		PreparedStatement ps = conn.prepareStatement("select max(id) from altausuarios.usuario");
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			id = rs.getInt(1) + 1;
		}
		rs.close();
		ps.close();
		return id;
	}
	
}

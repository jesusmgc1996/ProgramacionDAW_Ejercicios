package capitulo09.altaUsuarios.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import capitulo09.altaUsuarios.modelos.Acuerdo;

public class ControladorAcuerdo {
	
	/**
	 * Método para obtener un registro
	 * @param id
	 * @return
	 */
	public static Acuerdo getAcuerdo(int id) {
		Acuerdo a = null;
		try {
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from altausuarios.acuerdo where idIdioma = " + id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				a = new Acuerdo();
				a.setId(rs.getInt(1));
				a.setDescripcion(rs.getString(2));
				a.setIdIdioma(rs.getInt(3));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}

}

package capitulo09.altaUsuarios.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import capitulo09.altaUsuarios.modelos.Idioma;

public class ControladorIdioma {

	/**
	 * Método para guardar los registros en una lista
	 * @param id
	 * @return
	 */
	public static List<Idioma> getAll(int id) {
		List<Idioma> idiomas = new ArrayList<Idioma>();
		try {
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from altausuarios.idioma where idPais = " + id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Idioma i = new Idioma();
				i.setId(rs.getInt(1));
				i.setDescripcion(rs.getString(2));
				i.setIdPais(rs.getInt(3));
				idiomas.add(i);
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return idiomas;
	}
	
}

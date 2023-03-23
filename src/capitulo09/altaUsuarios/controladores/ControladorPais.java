package capitulo09.altaUsuarios.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import capitulo09.altaUsuarios.modelos.Pais;

public class ControladorPais {
	
	/**
	 * Método para guardar los registros en una lista
	 * @return
	 */
	public static List<Pais> getAll() {
		List<Pais> paises = new ArrayList<Pais>();
		try {
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from altausuarios.pais");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Pais p = new Pais();
				p.setId(rs.getInt(1));
				p.setDescripcion(rs.getString(2));
				paises.add(p);
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return paises;
	}

}

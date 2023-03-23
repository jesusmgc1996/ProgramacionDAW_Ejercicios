package Examenes.examen23032023.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Examenes.examen23032023.modelo.Localidad;

public class ControladorLocalidad {

	/**
	 * Método para guardar los registros en una lista
	 * @return
	 */
	public static List<Localidad> getAll() {
		List<Localidad> localidades = new ArrayList<Localidad>();
		try {
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from alquileres.localidad");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Localidad l = new Localidad();
				l.setId(rs.getInt(1));
				l.setDescripcion(rs.getString(2));
				localidades.add(l);
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return localidades;
	}
	
}

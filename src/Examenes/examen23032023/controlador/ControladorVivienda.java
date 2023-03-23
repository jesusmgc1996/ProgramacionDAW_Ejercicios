package Examenes.examen23032023.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Examenes.examen23032023.modelo.Vivienda;

public class ControladorVivienda {

	/**
	 * Método para guardar los registros en una lista
	 * @param id
	 * @return
	 */
	public static List<Vivienda> getAll(int id) {
		List<Vivienda> viviendas = new ArrayList<Vivienda>();
		try {
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from alquileres.vivienda where idLocalidad = " + id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Vivienda v = new Vivienda();
				v.setId(rs.getInt(1));
				v.setDescripcion(rs.getString(2));
				v.setIdLocalidad(rs.getInt(3));
				viviendas.add(v);
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return viviendas;
	}

}

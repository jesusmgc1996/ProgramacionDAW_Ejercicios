package Examenes.examen23032023.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Examenes.examen23032023.modelo.Inquilino;

public class ControladorInquilino {
	
	/**
	 * Método para modificar un registro
	 * @param i
	 * @return
	 */
	public static int modificar(Inquilino i) {
		int filas = 0;
		try {
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement("update alquileres.inquilino set dni = ?, nombreCompleto = ?,"
					+ " fechaInicioAlquiler = ?, fechaFinAlquiler = ?, cuotaMensual = ? where id = " + i.getId());
			ps.setString(1, i.getDni());
			ps.setString(2, i.getNombreCompleto());
			if (i.getFechaInicioAlquiler() != null) {
				ps.setDate(3, new java.sql.Date(i.getFechaInicioAlquiler().getTime()));
			}
			else {
				ps.setDate(3, null);
			}
			if (i.getFechaFinAlquiler() != null) {
				ps.setDate(4, new java.sql.Date(i.getFechaFinAlquiler().getTime()));
			}
			else {
				ps.setDate(4, null);
			}
			ps.setFloat(5, i.getCuotaMensual());
			filas = ps.executeUpdate();
			ps.close();
			conn.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return filas;
	}
	
	/**
	 * Método para obtener un registro
	 * @param id
	 * @return
	 */
	public static Inquilino getInquilino(int id) {
		Inquilino i = null;
		try {
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from alquileres.inquilino where idVivienda = " + id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				i = new Inquilino();
				i.setId(rs.getInt(1));
				i.setDni(rs.getString(2));
				i.setNombreCompleto(rs.getString(3));
				i.setFechaInicioAlquiler(rs.getDate(4));
				i.setFechaFinAlquiler(rs.getDate(5));
				i.setCuotaMensual(rs.getFloat(6));
				i.setIdVivienda(rs.getInt(7));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

}

package Examenes.examen14032023.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Examenes.examen14032023.modelo.Materia;

public class ControladorMateria {
	
	/**
	 * Método para modificar un registro
	 * @param m
	 * @return
	 */
	public static int modificar(Materia m) {
		int affectedRows = 0;
		try {
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement("update nivelesymaterias.materia set"
					+ " nombre = ?, codigo = ?, urlClassroom = ?, admiteMatricula = ?, fechaInicio = ?"
					+ " where id = " + m.getId());
			ps.setString(1, m.getNombre());
			ps.setString(2, m.getCodigo());
			ps.setString(3, m.getUrl());
			ps.setBoolean(4, m.getMatricula());
			ps.setDate(5, new java.sql.Date(m.getFechaInicio().getTime()));
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
	 * Método para obtener un registro
	 * @param id
	 * @return
	 */
	public static Materia getMateria(int id) {
		Materia m = null;
		try {
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from nivelesymaterias.materia where id = " + id);
			ResultSet rs = ps.executeQuery();
			if (rs != null && rs.next()) {
				m = new Materia();
				m.setId(rs.getInt("id"));
				m.setNombre(rs.getString("nombre"));
				m.setIdNivel(rs.getInt("idNivel"));
				m.setCodigo(rs.getString("codigo"));
				m.setUrl(rs.getString("urlClassroom"));
				m.setMatricula(rs.getBoolean("admiteMatricula"));
				m.setFechaInicio(rs.getDate("fechaInicio"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return m;
	}
	
	/**
	 * Método para guardar los registros en una lista
	 * @param id
	 * @return
	 */
	public static List<Materia> getAll(int id) {
		List<Materia> materias = new ArrayList<Materia>();
		try {
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from nivelesymaterias.materia where idNivel = " + id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Materia m = new Materia();
				m.setId(rs.getInt(1));
				m.setNombre(rs.getString(2));
				m.setIdNivel(rs.getInt(3));
				m.setCodigo(rs.getString(4));
				m.setUrl(rs.getString(5));
				m.setMatricula(rs.getBoolean(6));
				m.setFechaInicio(rs.getDate(7));
				materias.add(m);
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return materias;
	}

}

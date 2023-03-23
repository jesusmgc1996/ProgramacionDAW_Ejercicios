package Examenes.examen23032023.modelo;

import java.util.Date;

public class Inquilino {

	private int id;
	private String dni;
	private String nombreCompleto;
	private Date fechaInicioAlquiler;
	private Date fechaFinAlquiler;
	private float cuotaMensual;
	private int idVivienda;
	
	/**
	 * 
	 */
	public Inquilino() {
		super();
	}

	/**
	 * @param id
	 * @param dni
	 * @param nombreCompleto
	 * @param fechaInicioAlquiler
	 * @param fechaFinAlquiler
	 * @param cuotaMensual
	 * @param idVivienda
	 */
	public Inquilino(int id, String dni, String nombreCompleto, Date fechaInicioAlquiler, Date fechaFinAlquiler,
			float cuotaMensual, int idVivienda) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
		this.fechaInicioAlquiler = fechaInicioAlquiler;
		this.fechaFinAlquiler = fechaFinAlquiler;
		this.cuotaMensual = cuotaMensual;
		this.idVivienda = idVivienda;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Date getFechaInicioAlquiler() {
		return fechaInicioAlquiler;
	}

	public void setFechaInicioAlquiler(Date fechaInicioAlquiler) {
		this.fechaInicioAlquiler = fechaInicioAlquiler;
	}

	public Date getFechaFinAlquiler() {
		return fechaFinAlquiler;
	}

	public void setFechaFinAlquiler(Date fechaFinAlquiler) {
		this.fechaFinAlquiler = fechaFinAlquiler;
	}

	public float getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(float cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	public int getIdVivienda() {
		return idVivienda;
	}

	public void setIdVivienda(int idVivienda) {
		this.idVivienda = idVivienda;
	}

	@Override
	public String toString() {
		return "Inquilino [id=" + id + ", dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", fechaInicioAlquiler="
				+ fechaInicioAlquiler + ", fechaFinAlquiler=" + fechaFinAlquiler + ", cuotaMensual=" + cuotaMensual
				+ ", idVivienda=" + idVivienda + "]";
	}
	
}

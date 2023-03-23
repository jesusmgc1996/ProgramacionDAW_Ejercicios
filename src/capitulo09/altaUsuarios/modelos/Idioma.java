package capitulo09.altaUsuarios.modelos;

public class Idioma {

	private int id;
	private String descripcion;
	private int idPais;
	
	/**
	 * 
	 */
	public Idioma() {
		super();
	}

	/**
	 * @param id
	 * @param descripcion
	 * @param idPais
	 */
	public Idioma(int id, String descripcion, int idPais) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.idPais = idPais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	@Override
	public String toString() {
		return descripcion;
	}
	
}

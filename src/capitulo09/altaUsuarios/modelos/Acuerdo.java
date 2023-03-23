package capitulo09.altaUsuarios.modelos;

public class Acuerdo {

	private int id;
	private String descripcion;
	private int idIdioma;
	
	/**
	 * 
	 */
	public Acuerdo() {
		super();
	}

	/**
	 * @param id
	 * @param descripcion
	 * @param idIdioma
	 */
	public Acuerdo(int id, String descripcion, int idIdioma) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.idIdioma = idIdioma;
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

	public int getIdIdioma() {
		return idIdioma;
	}

	public void setIdIdioma(int idIdioma) {
		this.idIdioma = idIdioma;
	}

	@Override
	public String toString() {
		return "Acuerdo [id=" + id + ", descripcion=" + descripcion + ", idIdioma=" + idIdioma + "]";
	}
	
}

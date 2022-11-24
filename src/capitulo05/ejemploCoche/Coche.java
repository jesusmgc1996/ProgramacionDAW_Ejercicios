package capitulo05.ejemploCoche;

public class Coche {
	
	// Propiedades de la clase. Fields - Propiedades.
	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private float km;
	
	/**
	 * Método constructor por defecto
	 */
	public Coche() {
	}
	
	/**
	 * Método constructor
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param matricula
	 * @param km
	 */
	public Coche (String marca, String modelo, String color, String matricula, float km) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.color = color;
		this.km = km;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca (String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatrícula (String matricula) {
		this.matricula = matricula;
	}
	
	public float getKm() {
		return km;
	}
	
	public void setKm (float km) {
		this.km = km;
	}

	public String toString() {
		return "Marca: " + marca + " - Modelo: " + modelo + " - Color: " + color +
				" - Matrícula: " + matricula + " - Km: " + km;
	}

}

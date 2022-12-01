package capitulo05.examenBatalla;

public class Personaje {

	private String nombre;
	private int puntosVida;
	private boolean vivo = true;
	private int disparosRecibidos = 0;
	
	/**
	 * 
	 */
	public Personaje() {
		super();
		puntosVida = (int) Math.round(Math.random() * 50 + 50);
	}

	/**
	 * @param nombre
	 * @param puntosVida
	 * @param vivo
	 * @param disparosRecibidos
	 */
	public Personaje(String nombre, int puntosVida, boolean vivo, int disparosRecibidos) {
		super();
		this.nombre = nombre;
		this.puntosVida = puntosVida;
		this.vivo = vivo;
		this.disparosRecibidos = disparosRecibidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public int getDisparosRecibidos() {
		return disparosRecibidos;
	}

	public void setDisparosRecibidos(int disparosRecibidos) {
		this.disparosRecibidos = disparosRecibidos;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", puntosVida=" + puntosVida + ", vivo=" + vivo + ", disparosRecibidos="
				+ disparosRecibidos + "]";
	}
	
}

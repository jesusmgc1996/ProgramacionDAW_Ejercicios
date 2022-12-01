package capitulo05.examenBatalla;

public class Humano extends Personaje {

	/**
	 * 
	 */
	public Humano() {
		super();
	}

	/**
	 * @param nombre
	 * @param puntosVida
	 * @param vivo
	 * @param disparosRecibidos
	 */
	public Humano(String nombre, int puntosVida, boolean vivo, int disparosRecibidos) {
		super(nombre, puntosVida, vivo, disparosRecibidos);
	}

	@Override
	public String toString() {
		return "Humano [getNombre()=" + getNombre() + ", getPuntosVida()=" + getPuntosVida() + ", isVivo()=" + isVivo()
				+ ", getDisparosRecibidos()=" + getDisparosRecibidos() + "]";
	}

}

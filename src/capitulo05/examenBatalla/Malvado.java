package capitulo05.examenBatalla;

public class Malvado extends Personaje {

	/**
	 * 
	 */
	public Malvado() {
		super();
	}

	/**
	 * @param nombre
	 * @param puntosVida
	 * @param vivo
	 * @param disparosRecibidos
	 */
	public Malvado(String nombre, int puntosVida, boolean vivo, int disparosRecibidos) {
		super(nombre, puntosVida, vivo, disparosRecibidos);
	}

	@Override
	public String toString() {
		return "Malvado [getNombre()=" + getNombre() + ", getPuntosVida()=" + getPuntosVida() + ", isVivo()=" + isVivo()
				+ ", getDisparosRecibidos()=" + getDisparosRecibidos() + "]";
	}
	
}

package capitulo05.examenPoker;

import java.util.Arrays;

public class Baraja {
	
	private Carta cartas[] = new Carta[52];
	
	/**
	 * 
	 */
	public Baraja() {
		super();
		int j = 0;
		// Inicializo las cartas de la baraja
		// Picas
		for (int i = 0; i < 13; i++, j++)
			this.cartas[j] = new Carta("Picas", i + 1, j);
		// Diamantes
		for (int i = 0; i < 13; i++, j++)
			this.cartas[j] = new Carta("Diamantes", i + 1, j);
		// Tréboles
		for (int i = 0; i < 13; i++, j++)
			this.cartas[j] = new Carta("Tréboles", i + 1, j);
		// Corazones
		for (int i = 0; i < 13; i++, j++)
			this.cartas[j] = new Carta("Corazones", i + 1, j);
	}
	
	/**
	 * @param cartas
	 */
	public Baraja(Carta[] cartas) {
		super();
		this.cartas = cartas;
	}
	
	/**
	 * Método para pasar una carta de abajo hasta arriba
	 */
	public void pasarUnaCartaDeAbajoHastaArriba() {
		Carta aux = cartas[0];
		for (int i = 0; i < cartas.length - 1; i++)
			cartas[i] = cartas[i + 1];
		cartas[cartas.length - 1] = aux;
	}
	
	/**
	 * Método para pasar una carta de arriba hasta abajo
	 */
	public void pasarUnaCartaDeArribaHastaAbajo() {
		Carta aux = cartas[cartas.length - 1];
		for (int i = cartas.length - 1; i > 0; i--)
			cartas[i] = cartas[i - 1];
		cartas[0] = aux;
	}
	
	/**
	 * Método para mezclar la baraja
	 */
	public void mezclar() {
		for (int i = 0; i < 1000; i++) {
			int pos1 = (int) Math.round(Math.random() * (cartas.length - 1));
			int pos2 = (int) Math.round(Math.random() * (cartas.length - 1));
			Carta aux = cartas[pos1];
			cartas[pos1] = cartas[pos2];
			cartas[pos2] = aux;
		}
	}
	
	/**
	 * Método para ordenar la baraja
	 */
	public void ordenar() {
		int j;
		for (int i = 1; i < cartas.length; i++) {
			Carta aux = cartas[i];
			for (j = i; j > 0 && cartas[j - 1].getId() > aux.getId(); j--)
				cartas[j] = cartas [j - 1];
			cartas[j] = aux;
		}
	}
	
	/**
	 * Método para repartir una mano a un jugador
	 * @param j
	 */
	public void repartirManoAJugador(Jugador j) {
		int cont = 0;
		for (int i = 0; i < cartas.length && cont < 5; i++)
			if (cartas[i] != null) {
				j.getMano()[cont] = cartas[i];
				cartas[i] = null;
				cont++;
			}
	}
	
	public Carta[] getCartas() {
		return cartas;
	}
	
	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(cartas);
	}
	
}

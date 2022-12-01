package capitulo05.examenPoker;

import java.util.Arrays;

public class Poker {
	
	private Jugador jugadores[] = new Jugador[5];

	/**
	 * 
	 */
	public Poker() {
		super();
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i] = new Jugador();
			jugadores[i].setNombre("Jugador " + (i + 1));
		}
	}

	/**
	 * @param jugadores
	 */
	public Poker(Jugador[] jugadores) {
		super();
		this.jugadores = jugadores;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return Arrays.toString(jugadores);
	}
	
}

package capitulo05.examenPoker;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Baraja baraja = new Baraja();
		
		System.out.println(baraja.toString());
		baraja.pasarUnaCartaDeAbajoHastaArriba();
		System.out.println(baraja.toString());
		baraja.pasarUnaCartaDeArribaHastaAbajo();
		System.out.println(baraja.toString());
		baraja.mezclar();
		System.out.println(baraja.toString());
//		baraja.ordenar();
//		System.out.println(baraja.toString());
		
		Poker poker = new Poker();
		
		for (int i = 0; i < poker.getJugadores().length; i++) {
			baraja.repartirManoAJugador(poker.getJugadores()[i]);
			System.out.println(Arrays.toString(poker.getJugadores()[i].getMano()));
			poker.getJugadores()[i].inspeccionarMano();
		}
		
		System.out.println(baraja.toString());
	}

}

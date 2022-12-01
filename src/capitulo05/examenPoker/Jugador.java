package capitulo05.examenPoker;

import java.util.Arrays;

public class Jugador {
	
	private String nombre = "";
	private Carta mano[] = new Carta[5];
	
	/**
	 * 
	 */
	public Jugador() {
		super();
	}
	
	/**
	 * @param nombre
	 * @param cartas
	 */
	public Jugador(String nombre, Carta[] cartas) {
		super();
		this.nombre = nombre;
		this.mano = cartas;
	}
	
	/**
	 * Método para inspeccionar la mano del jugador
	 * @return
	 */
	public void inspeccionarMano() {
		for (int i = 0; i < mano.length; i++) {
			int contadorCartasIguales = 0;
			for (int j = 0; j < mano.length; j++)
				if (mano[i].getValor() == mano[j].getValor()) contadorCartasIguales++;
			switch (contadorCartasIguales) {
			case 4:
				System.out.println("Tienes un póker de " + mano[i].getValor());
				break;
			case 3:
				System.out.println("Tienes un trío de " + mano[i].getValor());
				break;
			case 2:
				System.out.println("Tienes una pareja de " + mano[i].getValor());
			}
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Carta[] getMano() {
		return mano;
	}
	
	public void setMano(Carta[] mano) {
		this.mano = mano;
	}
	
	@Override
	public String toString() {
		return nombre + ": " + Arrays.toString(mano);
	}

}

package capitulo05.examenBatalla;

import java.util.Arrays;

public class CampoBatalla {
	
	public static int LONGITUD_ARRAYS = 20;

	private String nombre;
	private Malvado malvados[] = new Malvado[LONGITUD_ARRAYS];
	private Humano humanos[] = new Humano[LONGITUD_ARRAYS];
	
	/**
	 * 
	 */
	public CampoBatalla() {
		super();
		// Se inicializan los personajes
		for (int i = 0; i < humanos.length; i++) {
			malvados[i] = new Malvado();
			humanos[i] = new Humano();
			malvados[i].setNombre("Malvado " + (i + 1));
			humanos[i].setNombre("Humano " + (i + 1));
			if (i == humanos.length - 1) { // Se les dobla la vida a los últimos personajes de cada bando
				malvados[i].setPuntosVida(malvados[i].getPuntosVida() * 2);
				humanos[i].setPuntosVida(humanos[i].getPuntosVida() * 2);
			}
		}
	}
	
	/**
	 * @param nombre
	 * @param malvados
	 * @param humanos
	 */
	public CampoBatalla(String nombre, Malvado[] malvados, Humano[] humanos) {
		super();
		this.nombre = nombre;
		this.malvados = malvados;
		this.humanos = humanos;
	}

	/**
	 * Método para mezclar los malvados
	 */
	public void mezclarMalvados() {
		for (int i = 0; i < 1000; i++) {
			int pos1 = (int) Math.round(Math.random() * (malvados.length - 1));
			int pos2 = (int) Math.round(Math.random() * (malvados.length - 1));
			Malvado m = malvados[pos1];
			malvados[pos1] = malvados[pos2];
			malvados[pos2] = m;
		}
	}
	
	/**
	 * Método para mezclar los humanos
	 */
	public void mezclarHumanos() {
		for (int i = 0; i < 1000; i++) {
			int pos1 = (int) Math.round(Math.random() * (humanos.length - 1));
			int pos2 = (int) Math.round(Math.random() * (humanos.length - 1));
			Humano h = humanos[pos1];
			humanos[pos1] = humanos[pos2];
			humanos[pos2] = h;
		}
	}
	
	/**
	 * Método para simular la batalla
	 */
	public void batalla() {
		int p, malvadosEliminados = 0, humanosEliminados = 0;
		do {
			p = primerMalvadoVivo(); // Humano dispara a los malvados
			malvados[p].setPuntosVida(malvados[p].getPuntosVida() - (int) Math.round(Math.random() * 20 + 5));
			malvados[p].setDisparosRecibidos(malvados[p].getDisparosRecibidos() + 1);
			if (malvados[p].getPuntosVida() <= 0) { // Malvado muere
				malvados[p].setVivo(false);
				malvadosEliminados++;
			}
			if (malvadosEliminados < 20) {
				p = primerHumanoVivo(); // Si hay algún malvado vivo, dispara a los humanos
				humanos[p].setPuntosVida(humanos[p].getPuntosVida() - (int) Math.round(Math.random() * 20 + 5));
				humanos[p].setDisparosRecibidos(humanos[p].getDisparosRecibidos() + 1);
				if (humanos[p].getPuntosVida() <= 0) { // Humano muere
					humanos[p].setVivo(false);
					humanosEliminados++;
				}
			}
			System.out.println(toString());
		} while (malvadosEliminados < 20 && humanosEliminados < 20);
		// La batalla acaba cuando uno de los bandos se queda sin personajes vivos
		if (malvadosEliminados == 20) System.out.println("\nHan ganado los humanos");
		if (humanosEliminados == 20) System.out.println("\nHan ganado los malvados");
	}
	
	/**
	 * Método para encontrar el primer malvado vivo
	 * @return
	 */
	public int primerMalvadoVivo () {
		for (int i = 0; i < malvados.length; i++)
			if (malvados[i].isVivo() == true) return i;
		return 0;
	}
	
	/**
	 * Método para encontrar el primer humano vivo
	 * @return
	 */
	public int primerHumanoVivo () {
		for (int i = 0; i < humanos.length; i++)
			if (humanos[i].isVivo() == true) return i;
		return 0;
	}
	
	/**
	 * Método para encontrar el humano más fácil y el más difícil de eliminar
	 */
	public void humanosEliminados() {
		Humano humanoMasFacil = humanos[0];
		Humano humanoMasDificil = humanos[0];
		for (int i = 1; i < humanos.length; i++) { // Comprobar humanos eliminados
			if (humanos[i].isVivo() == false && humanos[i].getDisparosRecibidos() > humanos[i - 1].getDisparosRecibidos())
				humanoMasDificil = humanos[i];
			if (humanos[i].isVivo() == false && humanos[i].getDisparosRecibidos() < humanos[i - 1].getDisparosRecibidos())
				humanoMasFacil = humanos[i];
		}
		System.out.println("\nEl humano más fácil de eliminar ha sido: " + humanoMasFacil.getNombre()
				+ "\nEl humano más difícil de eliminar ha sido: " + humanoMasDificil.getNombre());
	}
	
	/**
	 * Método para encontrar el malvado más fácil y el más difícil de eliminar
	 */
	public void malvadosEliminados() {
		Malvado malvadoMasFacil = malvados[0];
		Malvado malvadoMasDificil = malvados[0];
		for (int i = 1; i < malvados.length; i++) { // Comprobar malvados eliminados
			if (malvados[i].isVivo() == false && malvados[i].getDisparosRecibidos() > malvados[i - 1].getDisparosRecibidos())
				malvadoMasDificil = malvados[i];
			if (malvados[i].isVivo() == false && malvados[i].getDisparosRecibidos() < malvados[i - 1].getDisparosRecibidos())
				malvadoMasFacil = malvados[i];
		}
		System.out.println("\nEl malvado más fácil de eliminar ha sido: " + malvadoMasFacil.getNombre()
				+ "\nEl malvado más difícil de eliminar ha sido: " + malvadoMasDificil.getNombre());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "CampoBatalla [nombre=" + nombre + ", malvados=" + Arrays.toString(malvados) + ", humanos="
				+ Arrays.toString(humanos) + "]";
	}

}

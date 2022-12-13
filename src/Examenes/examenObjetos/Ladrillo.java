package Examenes.examenObjetos;

public class Ladrillo {
	
	private String color;
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private int puntosVida;
	
	private static String colores[] = {"rojo", "verde", "azul"};
	
	/**
	 * 
	 */
	public Ladrillo() {
		super();
		x = (int) Math.round(Math.random() * 800);
		y = (int) Math.round(Math.random() * 500);
		ancho = 100;
		alto = 50;
		puntosVida = (int) Math.round(Math.random() * (3 - 1) + 1);
		if (puntosVida == 1) color = colores[(int) Math.round(Math.random() * 2)];
		if (puntosVida == 2) color = "plateado";
		if (puntosVida == 3) color = "dorado";
	}

	/**
	 * @param color
	 * @param x
	 * @param y
	 * @param ancho
	 * @param alto
	 * @param puntosVida
	 */
	public Ladrillo(String color, int x, int y, int ancho, int alto, int puntosVida) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		this.puntosVida = puntosVida;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	@Override
	public String toString() {
		return "Ladrillo [color=" + color + ", x=" + x + ", y=" + y + ", ancho=" + ancho + ", alto=" + alto
				+ ", puntosVida=" + puntosVida + "]";
	}
	
}

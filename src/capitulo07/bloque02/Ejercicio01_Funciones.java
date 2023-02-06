package capitulo07.bloque02;

public class Ejercicio01_Funciones {

	public static void main(String[] args) {
		double y1, y2, x = 0;
		do {
			y1 = Math.sqrt(x);
			y2 = - Math.log(x);
			x += 0.0001;
		} while (Math.abs(y1 - y2) >= 0.001);
		System.out.println("Las funciones se cortan en:\nx = " + x +"\ny = " + y1);
	}

}

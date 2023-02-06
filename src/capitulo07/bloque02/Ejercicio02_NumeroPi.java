package capitulo07.bloque02;

public class Ejercicio02_NumeroPi {

	public static void main(String[] args) {
		double odd1 = 1, odd2 = 3, pi = 0;
		do {
			pi += 4/odd1 - 4/odd2;
			odd1 += 4;
			odd2 += 4;
		} while (Math.abs(Math.PI - pi) >= 0.000001);
		System.out.println("El número pi es: " + pi);
	}

}

package Examenes.examen09022023;

public class Ejercicio02 {

	public static void main(String[] args) {
		double numE = 1;
		int div = 1;
		do {
			double factorial = 1;
			int num = div;
			while (num > 0) {
				factorial *= num;
				num--;
			}
			numE += 1 / factorial;
			div++;
		} while (div < 8);
		System.out.println("El número e es: " + numE);
	}

}

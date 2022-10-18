package Examenes.Examen20221018;

/*
 *  Muestra en pantalla 10 números PARES generados al azar,
 *  comprendidos entre 20 y 30 o entre 40 y 50.
*/

public class Ejercicio_c {

	public static void main(String[] args) {
		int num, cont = 0; // Se inicializan las variables.
		
		for (; cont < 10; ) {
			num = (int) Math.round(Math.random() * (50 - 20) + 20);
			// Se generan los números.
			if (num % 2 == 0 && ((num >= 20 && num <= 30)
					|| (num >= 40 && num <= 50))) {
				cont++;
				System.out.print(num + " ");
				/* Se muestran por pantalla 10 números generados que son
				 * pares comprendidos entre 20 y 30 y entre 40 y 50. */
			}
		}

	}

}

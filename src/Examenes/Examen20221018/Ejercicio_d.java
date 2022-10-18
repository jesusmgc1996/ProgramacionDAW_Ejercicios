package Examenes.Examen20221018;

/*
 * Crea, al azar, 10 números entre 0 y 100. Muestra cada número
 * generado y cuáles son sus divisores.
*/

public class Ejercicio_d {

	public static void main(String[] args) {
		int num; // Se inicializan las variables.
		
		for (int i = 0; i < 10; i++) {
			num = (int) Math.round(Math.random() * 100); // Se generan los números.
			System.out.print("Los divisores de " + num + " son: \n");
			// Se muestra el número en pantalla.			
			for (int j = num; j > 0; j--) {
				if (num % j == 0)
					System.out.print(j + " "); // Se muestran los divisores.
			}
			System.out.println("\n");
		}

	}

}

package Examenes.Examen20221018;

import javax.swing.JOptionPane;

/*
 * Debes pedir al usuario un número de una única cifra. Después,
 * debes generar 100 números al azar entre 0 y 100. Cuando uno
 * de los números al azar termine en la cifra que el usuario indicó,
 * debes mostrar un mensaje en pantalla.
*/

public class Ejercicio_e {

	public static void main(String[] args) {
		int num, numPedido; // Se inicializan las variables.
		
		numPedido = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"
				+ " de una sola cifra:"));
		// Se pide por pantalla un número de una cifra.
		
		for (int i = 0; i < 100; i++) {
			num = (int) Math.round(Math.random() * 100); // Se generan los números.
			if (num % 10 == numPedido)
				System.out.println("La última cifra de " + num + " coincide con el"
						+ " número introducido.\n");
				/* Se muestra un mensajecuando la última cifra de un
				 * número generado coincide con el número introducido. */
		}
		
	}

}

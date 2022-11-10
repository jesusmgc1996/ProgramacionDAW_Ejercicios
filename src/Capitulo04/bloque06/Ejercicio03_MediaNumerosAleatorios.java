package Capitulo04.bloque06;

import javax.swing.JOptionPane;

/*
 * 3.- Realizar un programa que genere números aleatorios entre 1 y 1000
 * hasta que el valor medio de los números generados se aproxime a 500
 * con un margen de error de 0,5. El programa deberá decir cuantos números
 * aleatorios han sido generados cuando finalice.
*/

public class Ejercicio03_MediaNumerosAleatorios {

	public static void main(String[] args) {
		randomNumbersAverage();
	}
	
	public static void randomNumbersAverage () {
		float sum = 0, average = 0;
		int count = 0;
		do {
			int num = utils.Utils.obtenerNumeroAzar(1, 1000);
			sum += num;
			count++;
			average = sum / count;
		} while (average < 499.5 || average > 500.5);
		JOptionPane.showMessageDialog(null, "Se han generado " + count + " números"
				+ " aleatorios.\nLa media es: " + average);
	}

}

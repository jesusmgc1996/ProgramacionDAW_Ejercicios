package Capitulo03.Bloque03;

import javax.swing.JOptionPane;

/*
 * 1º.- Realiza un ejercicio que pida números al usuario. El programa debe
 * detenerse cuando el usuario introduzca el número 0 (cero), que no debe
 * tenerse en cuenta para ninguna operación aritmética, simplemente para
 * salir de la aplicación. Cuando el programa haya terminado, se debe sacar
 * en pantalla el valor de la suma  y de la media de todos los números.
*/

public class Ejercicio01_PedirNumerosYCalcularSumaYMedia {

	public static void main(String[] args) {
		int num = 1, i, suma = 0;
		
		for (i = 0; num != 0; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un"
					+ " número: \n(0 para salir)"));
			suma += num;
		}
		
		JOptionPane.showMessageDialog(null, "La suma de los números es " + suma +
				" y la media es " + (float) suma / (i - 1));

	}

}

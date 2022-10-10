package Capitulo03.Bloque03;

import javax.swing.JOptionPane;

/*
 * 4º.- Realiza un ejercicio que pida números al usuario, hasta que uno de
 * ellos sea 0 (cero). Al finalizar se debe imprimir en pantalla cuantos
 * son positivos y cuantos negativos. No debes tener en cuenta el 0 (cero).
*/

public class Ejercicio04_PedirNumerosYContarlos {

	public static void main(String[] args) {
		int num = 1, numN = 0, numP = 0;
		
		for (int i = 0; num != 0; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un"
					+ " número: \n(0 para salir)"));
			if (num < 0)
					numN++;
			if (num > 0)
					numP++;
		}
		
		JOptionPane.showMessageDialog(null, "Se han introducido " + numP +
				" número(s) positivo(s) y " + numN + " número(s) negativo(s).");

	}

}

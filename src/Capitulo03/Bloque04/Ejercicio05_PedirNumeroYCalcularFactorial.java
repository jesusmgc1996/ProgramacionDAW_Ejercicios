package Capitulo03.Bloque04;

import javax.swing.JOptionPane;

/*
 * 5º.- Calcula el factorial de un número dado por el usuario.
 * Debes usar sólo el bucle while.
*/

public class Ejercicio05_PedirNumeroYCalcularFactorial {

	public static void main(String[] args) {
		int num, factorial = 1;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un"
				+ " número positivo:"));
		
		while (num > 0) {
			factorial *= num;
			num--;
			
		}

		JOptionPane.showMessageDialog(null, "El factorial es: " + factorial);

	}

}

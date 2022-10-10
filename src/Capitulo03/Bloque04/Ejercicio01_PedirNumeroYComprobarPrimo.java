package Capitulo03.Bloque04;

import javax.swing.JOptionPane;

/*
 * 1º.- Crea un programa que compruebe si un número es primo o no. Debes
 * pedir al usuario un número y después informar de si se trata de un
 * número primo o compuesto. Tienes prohibido el uso del bucle "for".
*/

public class Ejercicio01_PedirNumeroYComprobarPrimo {

	public static void main(String[] args) {
		int num, cont = 2;
		boolean primo = true;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número:"));
		
		while (primo == true && cont != num) {
			if (num % cont == 0) {
				primo = false;
				break;
			}
			cont++;
		}
		
		if (primo == true)
			JOptionPane.showMessageDialog(null, "El número es primo");
		else
			JOptionPane.showMessageDialog(null, "El número es compuesto");

	}

}

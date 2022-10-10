package Capitulo03.Bloque04;

import javax.swing.JOptionPane;

/*
 * 4º.- Crea un programa que pida al usuario un número e imprima ese
 * número en binario. Tienes prohibido el uso del bucle "for".
*/

public class Ejercicio04_PedirNumeroYMostrarBinario {

	public static void main(String[] args) {
		int num, bit = 128;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un"
				+ " número positivo:"));
		
		while (bit > 0) {
			if ((num & bit) != 0)
				System.out.print("1");
			else
				System.out.print("0");
			bit /= 2;
		}
		
	}

}

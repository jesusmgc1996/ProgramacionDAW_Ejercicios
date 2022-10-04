package Capitulo03.Bloque02;

import javax.swing.JOptionPane;

/*
 * 1º.- Media de una cantidad de números introducidos por el usuario. El
 * usuario especificará una cantidad de números, tras lo cual se le deben
 * pedir tantos como este haya indicado. Al final se debe imprimir la media.
*/

public class Ejercicio01_PedirVariosNumerosYCalcularMedia {

	public static void main(String[] args) {
		String str;
		int num, cantidad, suma = 0;
		
		str = JOptionPane.showInputDialog("¿Cuántos números quiere que se pidan?");
		cantidad = Integer.parseInt(str);
		
		for (int i = 0; i < cantidad; i++) {
			str = JOptionPane.showInputDialog("Introduzca un número:");
			num = Integer.parseInt(str);
			suma += num;
		}
		
		JOptionPane.showMessageDialog(null, "La media es: " + (float) suma / cantidad);

	}

}

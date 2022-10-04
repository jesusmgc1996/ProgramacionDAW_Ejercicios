package Capitulo03.Bloque01;

import javax.swing.JOptionPane;

/*
 * 2º.- Modifica el ejercicio anterior de manera que, en lugar de que
 * el programa siempre pida cuatro números, sea el usuario el que decida
 * cuantos números se van a pedir.
*/

public class Ejercicio02_PedirVariosNumerosYSumar {

	public static void main(String[] args) {
		String str;
		int num, cantidad, suma = 0;
		
		str = JOptionPane.showInputDialog("¿Cuántos números quiere que se pidan?");
		cantidad = Integer.parseInt(str);
		
		for (int i = 0; i < cantidad; i++) {
			str = JOptionPane.showInputDialog("Introduzca un número:");
			num = Integer.parseInt(str);
			if (num > 10)
				suma += num;
		}
		
		JOptionPane.showMessageDialog(null, "La suma de los números es: " + suma);

	}

}
